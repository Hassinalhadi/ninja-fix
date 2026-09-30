package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.ZendeskLocaleConverter;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideZendeskHelpCenterServiceFactory implements b {
    private final a helpCenterServiceProvider;
    private final a localeConverterProvider;

    public GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(a aVar, a aVar2) {
        this.helpCenterServiceProvider = aVar;
        this.localeConverterProvider = aVar2;
    }

    public static GuideProviderModule_ProvideZendeskHelpCenterServiceFactory create(a aVar, a aVar2) {
        return new GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(aVar, aVar2);
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(Object obj, ZendeskLocaleConverter zendeskLocaleConverter) {
        ZendeskHelpCenterService provideZendeskHelpCenterService = GuideProviderModule.provideZendeskHelpCenterService((HelpCenterService) obj, zendeskLocaleConverter);
        AbstractC2763s0.delta(provideZendeskHelpCenterService);
        return provideZendeskHelpCenterService;
    }

    @Override // Kd.a
    public ZendeskHelpCenterService get() {
        return provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), (ZendeskLocaleConverter) this.localeConverterProvider.get());
    }
}
