package com.clevertap.android.sdk.response;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.TriggerManager;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.data.InAppResponseAdapter;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoFactory;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import com.clevertap.android.sdk.inapp.store.preference.FileStore;
import com.clevertap.android.sdk.inapp.store.preference.ImpressionStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppAssetsStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.LegacyInAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class InAppResponse extends CleverTapResponseDecorator {
    private final CleverTapInstanceConfig config;
    private final ControllerManager controllerManager;
    private final CoreMetaData coreMetaData;
    private final boolean isSendTest;
    private final Logger logger;
    private final StoreRegistry storeRegistry;
    private final TemplatesManager templatesManager;
    private final TriggerManager triggerManager;

    public InAppResponse(CleverTapInstanceConfig cleverTapInstanceConfig, ControllerManager controllerManager, boolean z2, StoreRegistry storeRegistry, TriggerManager triggerManager, TemplatesManager templatesManager, CoreMetaData coreMetaData) {
        this.config = cleverTapInstanceConfig;
        this.logger = cleverTapInstanceConfig.getLogger();
        this.controllerManager = controllerManager;
        this.isSendTest = z2;
        this.storeRegistry = storeRegistry;
        this.triggerManager = triggerManager;
        this.coreMetaData = coreMetaData;
        this.templatesManager = templatesManager;
    }

    private void clearStaleInAppCache(JSONArray jSONArray, ImpressionStore impressionStore, TriggerManager triggerManager) {
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String optString = jSONArray.optString(i4);
            impressionStore.clear(optString);
            triggerManager.removeTriggers(optString);
        }
    }

    private void displayInApp(final JSONArray jSONArray) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask(Constants.TAG_FEATURE_IN_APPS).execute("InAppResponse#processResponse", new Callable<Void>() { // from class: com.clevertap.android.sdk.response.InAppResponse.1
            @Override // java.util.concurrent.Callable
            public Void call() {
                InAppResponse.this.controllerManager.getInAppController().addInAppNotificationsToQueue(jSONArray);
                return null;
            }
        });
    }

    private void handleAppLaunchServerSide(JSONArray jSONArray) {
        try {
            this.controllerManager.getInAppController().onAppLaunchServerSideInAppsResponse(jSONArray, this.coreMetaData.getLocationFromUser());
        } catch (Throwable th) {
            this.logger.verbose(this.config.getAccountId(), "InAppManager: Malformed AppLaunched ServerSide inApps");
            this.logger.verbose(this.config.getAccountId(), "InAppManager: Reason: " + th.getMessage(), th);
        }
    }

    @Override // com.clevertap.android.sdk.response.CleverTapResponseDecorator, com.clevertap.android.sdk.response.CleverTapResponse
    public void processResponse(JSONObject jSONObject, String str, Context context) {
        processResponse(jSONObject, str, context, false);
    }

    public void processResponse(JSONObject jSONObject, String str, Context context, boolean z2) {
        try {
            if (this.config.isAnalyticsOnly()) {
                this.logger.verbose(this.config.getAccountId(), "CleverTap instance is configured to analytics only, not processing inapp messages");
                return;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                InAppResponseAdapter inAppResponseAdapter = new InAppResponseAdapter(jSONObject, this.templatesManager);
                ImpressionStore impressionStore = this.storeRegistry.getImpressionStore();
                InAppStore inAppStore = this.storeRegistry.getInAppStore();
                InAppAssetsStore inAppAssetsStore = this.storeRegistry.getInAppAssetsStore();
                FileStore filesStore = this.storeRegistry.getFilesStore();
                LegacyInAppStore legacyInAppStore = this.storeRegistry.getLegacyInAppStore();
                if (impressionStore != null && inAppStore != null && inAppAssetsStore != null && legacyInAppStore != null && filesStore != null) {
                    this.logger.verbose(this.config.getAccountId(), "InApp: Processing response");
                    int inAppsPerSession = inAppResponseAdapter.getInAppsPerSession();
                    int inAppsPerDay = inAppResponseAdapter.getInAppsPerDay();
                    if (!this.isSendTest && this.controllerManager.getInAppFCManager() != null) {
                        Logger.v("Updating InAppFC Limits");
                        this.controllerManager.getInAppFCManager().updateLimits(context, inAppsPerDay, inAppsPerSession);
                        this.controllerManager.getInAppFCManager().processResponse(context, jSONObject);
                    } else {
                        this.logger.verbose(this.config.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
                    }
                    Pair<Boolean, JSONArray> staleInApps = inAppResponseAdapter.getStaleInApps();
                    if (staleInApps.getFirst().booleanValue()) {
                        clearStaleInAppCache(staleInApps.getSecond(), impressionStore, this.triggerManager);
                    }
                    String inAppMode = inAppResponseAdapter.getInAppMode();
                    if (!inAppMode.isEmpty()) {
                        inAppStore.setMode(inAppMode);
                    }
                    if (z2) {
                        return;
                    }
                    Pair<Boolean, JSONArray> legacyInApps = inAppResponseAdapter.getLegacyInApps();
                    if (legacyInApps.getFirst().booleanValue()) {
                        displayInApp(legacyInApps.getSecond());
                    }
                    Pair<Boolean, JSONArray> appLaunchServerSideInApps = inAppResponseAdapter.getAppLaunchServerSideInApps();
                    if (appLaunchServerSideInApps.getFirst().booleanValue()) {
                        handleAppLaunchServerSide(appLaunchServerSideInApps.getSecond());
                    }
                    Pair<Boolean, JSONArray> clientSideInApps = inAppResponseAdapter.getClientSideInApps();
                    if (clientSideInApps.getFirst().booleanValue()) {
                        inAppStore.storeClientSideInApps(clientSideInApps.getSecond());
                    }
                    Pair<Boolean, JSONArray> serverSideInApps = inAppResponseAdapter.getServerSideInApps();
                    if (serverSideInApps.getFirst().booleanValue()) {
                        inAppStore.storeServerSideInAppsMetaData(serverSideInApps.getSecond());
                    }
                    List<Pair<String, CtCacheType>> preloadAssetsMeta = inAppResponseAdapter.getPreloadAssetsMeta();
                    FileResourcesRepoImpl createFileResourcesRepo = FileResourcesRepoFactory.createFileResourcesRepo(context, this.logger, this.storeRegistry);
                    if (!preloadAssetsMeta.isEmpty()) {
                        createFileResourcesRepo.preloadFilesAndCache(preloadAssetsMeta);
                    }
                    if (this.isFullResponse) {
                        this.logger.verbose(this.config.getAccountId(), "Handling cache eviction");
                        createFileResourcesRepo.cleanupStaleFiles(inAppResponseAdapter.getPreloadAssets());
                        return;
                    } else {
                        this.logger.verbose(this.config.getAccountId(), "Ignoring cache eviction");
                        return;
                    }
                }
                this.logger.verbose(this.config.getAccountId(), "Stores are not initialised, ignoring inapps!!!!");
                return;
            }
            this.logger.verbose(this.config.getAccountId(), "There is no inapps data to handle");
        } catch (Throwable th) {
            Logger.v("InAppManager: Failed to parse response", th);
        }
    }
}
