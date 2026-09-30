package com.clevertap.android.sdk.network;

import android.content.Context;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.InAppFCManager;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.login.IdentityRepoFactory;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import com.clevertap.android.sdk.validation.ValidationResultStack;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u00101\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u00102\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;", "", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "coreMetaData", "Lcom/clevertap/android/sdk/CoreMetaData;", "controllerManager", "Lcom/clevertap/android/sdk/ControllerManager;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "arpRepo", "Lcom/clevertap/android/sdk/network/ArpRepo;", "ijRepo", "Lcom/clevertap/android/sdk/network/IJRepo;", "databaseManager", "Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", "validationResultStack", "Lcom/clevertap/android/sdk/validation/ValidationResultStack;", "firstRequestTs", "Lkotlin/Function0;", "", "lastRequestTs", "logger", "Lcom/clevertap/android/sdk/ILogger;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/CoreMetaData;Lcom/clevertap/android/sdk/ControllerManager;Lcom/clevertap/android/sdk/DeviceInfo;Lcom/clevertap/android/sdk/network/ArpRepo;Lcom/clevertap/android/sdk/network/IJRepo;Lcom/clevertap/android/sdk/db/BaseDatabaseManager;Lcom/clevertap/android/sdk/validation/ValidationResultStack;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/ILogger;)V", "buildHeader", "Lorg/json/JSONObject;", "caller", "", "addCaller", "", "header", "addDeviceId", "addType", "addAppFields", "addIJ", "addConfigFields", "addIdentities", "addDoNotDisturb", "addBackgroundPing", "addRenderedTargetList", "addInstallReferrerData", "addFirstRequestInSession", "addDebugFlag", "addARP", "addReferrerInfo", "addWzrkParams", "addInAppFC", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueueHeaderBuilder {

    @NotNull
    private final ArpRepo arpRepo;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final ControllerManager controllerManager;

    @NotNull
    private final CoreMetaData coreMetaData;

    @NotNull
    private final BaseDatabaseManager databaseManager;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final Function0<Integer> firstRequestTs;

    @NotNull
    private final IJRepo ijRepo;

    @NotNull
    private final Function0<Integer> lastRequestTs;

    @NotNull
    private final ILogger logger;

    @NotNull
    private final ValidationResultStack validationResultStack;

    public QueueHeaderBuilder(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @NotNull CoreMetaData coreMetaData, @NotNull ControllerManager controllerManager, @NotNull DeviceInfo deviceInfo, @NotNull ArpRepo arpRepo, @NotNull IJRepo ijRepo, @NotNull BaseDatabaseManager databaseManager, @NotNull ValidationResultStack validationResultStack, @NotNull Function0<Integer> firstRequestTs, @NotNull Function0<Integer> lastRequestTs, @NotNull ILogger logger) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(coreMetaData, "coreMetaData");
        Intrinsics.echo(controllerManager, "controllerManager");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        Intrinsics.echo(arpRepo, "arpRepo");
        Intrinsics.echo(ijRepo, "ijRepo");
        Intrinsics.echo(databaseManager, "databaseManager");
        Intrinsics.echo(validationResultStack, "validationResultStack");
        Intrinsics.echo(firstRequestTs, "firstRequestTs");
        Intrinsics.echo(lastRequestTs, "lastRequestTs");
        Intrinsics.echo(logger, "logger");
        this.context = context;
        this.config = config;
        this.coreMetaData = coreMetaData;
        this.controllerManager = controllerManager;
        this.deviceInfo = deviceInfo;
        this.arpRepo = arpRepo;
        this.ijRepo = ijRepo;
        this.databaseManager = databaseManager;
        this.validationResultStack = validationResultStack;
        this.firstRequestTs = firstRequestTs;
        this.lastRequestTs = lastRequestTs;
        this.logger = logger;
    }

    private final void addARP(JSONObject header) {
        try {
            JSONObject arp = this.arpRepo.getARP(this.context);
            if (arp != null && arp.length() > 0) {
                header.put("arp", arp);
            }
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ARP", e);
        }
    }

    private final void addAppFields(JSONObject header) {
        JSONObject appLaunchedFields = this.deviceInfo.getAppLaunchedFields();
        if (this.coreMetaData.isWebInterfaceInitializedExternally()) {
            appLaunchedFields.put("wv_init", true);
        }
        header.put("af", appLaunchedFields);
    }

    private final void addBackgroundPing(JSONObject header) {
        if (this.coreMetaData.isBgPing()) {
            header.put("bk", 1);
            this.coreMetaData.setBgPing(false);
        }
    }

    private final void addCaller(JSONObject header, String caller) {
        if (caller != null) {
            header.put(Constants.D_SRC, caller);
        }
    }

    private final void addConfigFields(JSONObject header) {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        header.put(Constants.KEY_ID, accountId);
        header.put("tk", accountToken);
        header.put("l_ts", this.lastRequestTs.invoke().intValue());
        header.put("f_ts", this.firstRequestTs.invoke().intValue());
    }

    private final void addDebugFlag(JSONObject header) {
        if (CleverTapAPI.getDebugLevel() == 3) {
            header.put("debug", true);
        }
    }

    private final void addDeviceId(JSONObject header) {
        String deviceID = this.deviceInfo.getDeviceID();
        if (deviceID != null && deviceID.length() != 0) {
            header.put("g", deviceID);
        } else {
            this.logger.verbose(this.config.getAccountId(), "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
        }
    }

    private final void addDoNotDisturb(JSONObject header) {
        boolean z2;
        if (CTXtensions.areAppNotificationsEnabled(this.context) && (this.controllerManager.getPushProviders() == null || this.controllerManager.getPushProviders().isNotificationSupported())) {
            z2 = false;
        } else {
            z2 = true;
        }
        header.put("ddnd", z2);
    }

    private final void addFirstRequestInSession(JSONObject header) {
        header.put("frs", this.coreMetaData.isFirstRequestInSession());
        this.coreMetaData.setFirstRequestInSession(false);
    }

    private final void addIJ(JSONObject header) {
        long i4 = this.ijRepo.getI(this.context);
        if (i4 > 0) {
            header.put("_i", i4);
        }
        long j5 = this.ijRepo.getJ(this.context);
        if (j5 > 0) {
            header.put("_j", j5);
        }
    }

    private final void addIdentities(JSONObject header) {
        header.put("ct_pi", IdentityRepoFactory.getRepo(this.context, this.config, this.validationResultStack).getIdentitySet().toString());
    }

    private final void addInAppFC(JSONObject header) {
        InAppFCManager inAppFCManager = this.controllerManager.getInAppFCManager();
        if (inAppFCManager != null) {
            Logger.v("Attaching InAppFC to Header");
            header.put(Constants.INAPP_MAX_PER_DAY_KEY, inAppFCManager.getShownTodayCount());
            if (header.put(Constants.KEY_TLC, inAppFCManager.getInAppsCount(this.context)) != null) {
                return;
            }
        }
        this.logger.verbose(this.config.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
    }

    private final void addInstallReferrerData(JSONObject header) {
        if (!this.coreMetaData.isInstallReferrerDataSent()) {
            header.put("rct", this.coreMetaData.getReferrerClickTime());
            header.put("ait", this.coreMetaData.getAppInstallTime());
        }
    }

    private final void addReferrerInfo(JSONObject header) {
        try {
            JSONObject jSONObject = new JSONObject();
            String source = this.coreMetaData.getSource();
            if (source != null) {
                jSONObject.put("us", source);
            }
            String medium = this.coreMetaData.getMedium();
            if (medium != null) {
                jSONObject.put("um", medium);
            }
            String campaign = this.coreMetaData.getCampaign();
            if (campaign != null) {
                jSONObject.put("uc", campaign);
            }
            if (jSONObject.length() > 0) {
                header.put("ref", jSONObject);
            }
        } catch (JSONException e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to attach ref", e);
        }
    }

    private final void addRenderedTargetList(JSONObject header) {
        header.put("rtl", CTJsonConverter.pushIdsToJSONArray(this.databaseManager.loadDBAdapter(this.context).fetchPushNotificationIds()));
    }

    private final void addType(JSONObject header) {
        header.put(Constants.KEY_TYPE, "meta");
    }

    private final void addWzrkParams(JSONObject header) {
        JSONObject wzrkParams = this.coreMetaData.getWzrkParams();
        if (wzrkParams != null && wzrkParams.length() > 0) {
            header.put("wzrk_ref", wzrkParams);
        }
    }

    @Nullable
    public final JSONObject buildHeader(@Nullable String caller) {
        String accountId = this.config.getAccountId();
        String accountToken = this.config.getAccountToken();
        if (accountId != null && accountToken != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                addCaller(jSONObject, caller);
                addDeviceId(jSONObject);
                addType(jSONObject);
                addAppFields(jSONObject);
                addIJ(jSONObject);
                addConfigFields(jSONObject);
                addIdentities(jSONObject);
                addDoNotDisturb(jSONObject);
                addBackgroundPing(jSONObject);
                addRenderedTargetList(jSONObject);
                addInstallReferrerData(jSONObject);
                addFirstRequestInSession(jSONObject);
                addDebugFlag(jSONObject);
                addARP(jSONObject);
                addReferrerInfo(jSONObject);
                addWzrkParams(jSONObject);
                addInAppFC(jSONObject);
                return jSONObject;
            } catch (JSONException e) {
                this.logger.verbose(this.config.getAccountId(), "CommsManager: Failed to attach header", e);
                return null;
            }
        }
        this.logger.debug(this.config.getAccountId(), "Account ID/token not found, unable to configure queue request");
        return null;
    }
}
