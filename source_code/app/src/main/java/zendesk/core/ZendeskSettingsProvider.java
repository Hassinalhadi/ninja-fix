package zendesk.core;

import android.content.Context;
import com.google.gson.q;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.ZendeskCallback;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import vg.aq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private static final String LOG_TAG = "ZendeskSdkSettingsProvi";
    static final int SDK_SETTINGS_MAX_AGE_HOURS = 1;
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    private final CoreSettingsStorage coreSettingsStorage;
    private final Serializer serializer;
    private final SdkSettingsService settingsService;
    private final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    public ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, String str, Context context) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage;
        this.coreSettingsStorage = coreSettingsStorage;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.serializer = serializer;
        this.zendeskLocaleConverter = zendeskLocaleConverter;
        this.applicationId = str;
        this.context = context;
    }

    private void getSettingsInternal(Locale locale, ZendeskCallback<Map<String, q>> zendeskCallback) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public CoreSettings extractCoreSettings(Map<String, q> map) {
        q qVar;
        if (map == null) {
            qVar = null;
        } else {
            qVar = map.get("core");
        }
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(qVar, CoreSettings.class);
        if (coreSettings != null) {
            return coreSettings;
        }
        return ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public BlipsSettings getBlipsSettings() {
        return this.coreSettingsStorage.getBlipsSettings();
    }

    @Override // zendesk.core.SettingsProvider
    public void getCoreSettings(final ZendeskCallback<CoreSettings> zendeskCallback) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new ZendeskCallback<Map<String, q>>() { // from class: zendesk.core.ZendeskSettingsProvider.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(Map<String, q> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (zendeskCallback != null) {
                        zendeskCallback.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (zendeskCallback != null) {
            zendeskCallback.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    @Override // zendesk.core.SettingsProvider
    public <E extends Settings> void getSettingsForSdk(final String str, final Class<E> cls, final ZendeskCallback<SettingsPack<E>> zendeskCallback) {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            if (zendeskCallback != null) {
                zendeskCallback.onSuccess(new SettingsPack<>(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
                this.actionHandlerRegistry.updateSettings(this.settingsStorage.getRawSettings());
                return;
            }
            return;
        }
        getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new ZendeskCallback<Map<String, q>>() { // from class: zendesk.core.ZendeskSettingsProvider.2
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                if (zendeskCallback == null) {
                    return;
                }
                if (ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                    zendeskCallback.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                } else {
                    zendeskCallback.onError(errorResponse);
                }
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(Map<String, q> map) {
                ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                if (zendeskCallback != null) {
                    zendeskCallback.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                }
            }
        });
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, q> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0L), null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    private Map<String, q> getSettingsInternal(Locale locale) {
        try {
            aq execute = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).execute();
            if (execute.bravo != null) {
                return new HashMap((Map) execute.bravo);
            }
            return new HashMap(0);
        } catch (IOException unused) {
            Logger.e(LOG_TAG, "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}
