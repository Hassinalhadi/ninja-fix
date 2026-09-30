package zendesk.support;

import Kd.a;
import dagger.internal.b;
import java.util.Locale;
import s6.AbstractC2763s0;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes.dex */
public final class ProviderModule_ProvideSdkSettingsProviderFactory implements b {
    private final a helpCenterLocaleConverterProvider;
    private final a localeProvider;
    private final ProviderModule module;
    private final a sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, a aVar, a aVar2, a aVar3) {
        this.module = providerModule;
        this.sdkSettingsProvider = aVar;
        this.localeProvider = aVar2;
        this.helpCenterLocaleConverterProvider = aVar3;
    }

    public static ProviderModule_ProvideSdkSettingsProviderFactory create(ProviderModule providerModule, a aVar, a aVar2, a aVar3) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, aVar, aVar2, aVar3);
    }

    public static SupportSettingsProvider provideSdkSettingsProvider(ProviderModule providerModule, SettingsProvider settingsProvider, Locale locale, ZendeskLocaleConverter zendeskLocaleConverter) {
        SupportSettingsProvider provideSdkSettingsProvider = providerModule.provideSdkSettingsProvider(settingsProvider, locale, zendeskLocaleConverter);
        AbstractC2763s0.delta(provideSdkSettingsProvider);
        return provideSdkSettingsProvider;
    }

    @Override // Kd.a
    public SupportSettingsProvider get() {
        return provideSdkSettingsProvider(this.module, (SettingsProvider) this.sdkSettingsProvider.get(), (Locale) this.localeProvider.get(), (ZendeskLocaleConverter) this.helpCenterLocaleConverterProvider.get());
    }
}
