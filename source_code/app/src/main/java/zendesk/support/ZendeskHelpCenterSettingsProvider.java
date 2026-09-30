package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import java.util.Locale;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskHelpCenterSettingsProvider implements HelpCenterSettingsProvider {
    private static final String HELP_CENTER_KEY = "help_center";
    private static final String LOG_TAG = "HelpCenterSettingsProvider";
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    private final SettingsProvider sdkSettingsProvider;

    public ZendeskHelpCenterSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            String locale = helpCenterSettings.getLocale();
            String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
            if (!helpCenterLocaleString.equals(locale)) {
                Logger.w(LOG_TAG, "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
            }
        }
    }

    @Override // zendesk.support.HelpCenterSettingsProvider
    public void getSettings(final ZendeskCallback<HelpCenterSettings> zendeskCallback) {
        this.sdkSettingsProvider.getSettingsForSdk(HELP_CENTER_KEY, HelpCenterSettings.class, new ZendeskCallback<SettingsPack<HelpCenterSettings>>() { // from class: zendesk.support.ZendeskHelpCenterSettingsProvider.1
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                if (zendeskCallback != null) {
                    Logger.d(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Returning default Help Center Settings.", new Object[0]);
                    zendeskCallback.onSuccess(HelpCenterSettings.defaultSettings());
                }
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
                ZendeskHelpCenterSettingsProvider.this.logIfLocaleNotAvailable(settingsPack.getSettings());
                Logger.d(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Successfully retrieved Help Center Settings", new Object[0]);
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(settingsPack.getSettings());
                }
            }
        });
    }
}
