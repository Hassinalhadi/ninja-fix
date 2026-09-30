package zendesk.support;

import Kd.a;
import dagger.internal.b;
import java.util.Locale;
import s6.AbstractC2763s0;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideSettingsProviderFactory implements b {
    private final a localeConverterProvider;
    private final a localeProvider;
    private final GuideProviderModule module;
    private final a sdkSettingsProvider;

    public GuideProviderModule_ProvideSettingsProviderFactory(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3) {
        this.module = guideProviderModule;
        this.sdkSettingsProvider = aVar;
        this.localeConverterProvider = aVar2;
        this.localeProvider = aVar3;
    }

    public static GuideProviderModule_ProvideSettingsProviderFactory create(GuideProviderModule guideProviderModule, a aVar, a aVar2, a aVar3) {
        return new GuideProviderModule_ProvideSettingsProviderFactory(guideProviderModule, aVar, aVar2, aVar3);
    }

    public static HelpCenterSettingsProvider provideSettingsProvider(GuideProviderModule guideProviderModule, SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        HelpCenterSettingsProvider provideSettingsProvider = guideProviderModule.provideSettingsProvider(settingsProvider, zendeskLocaleConverter, locale);
        AbstractC2763s0.delta(provideSettingsProvider);
        return provideSettingsProvider;
    }

    @Override // Kd.a
    public HelpCenterSettingsProvider get() {
        return provideSettingsProvider(this.module, (SettingsProvider) this.sdkSettingsProvider.get(), (ZendeskLocaleConverter) this.localeConverterProvider.get(), (Locale) this.localeProvider.get());
    }
}
