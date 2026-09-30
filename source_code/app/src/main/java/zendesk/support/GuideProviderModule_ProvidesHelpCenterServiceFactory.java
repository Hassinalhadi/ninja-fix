package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.RestServiceProvider;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvidesHelpCenterServiceFactory implements b {
    private final a helpCenterCachingNetworkConfigProvider;
    private final a restServiceProvider;

    public GuideProviderModule_ProvidesHelpCenterServiceFactory(a aVar, a aVar2) {
        this.restServiceProvider = aVar;
        this.helpCenterCachingNetworkConfigProvider = aVar2;
    }

    public static GuideProviderModule_ProvidesHelpCenterServiceFactory create(a aVar, a aVar2) {
        return new GuideProviderModule_ProvidesHelpCenterServiceFactory(aVar, aVar2);
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider, Object obj) {
        HelpCenterService providesHelpCenterService = GuideProviderModule.providesHelpCenterService(restServiceProvider, (HelpCenterCachingNetworkConfig) obj);
        AbstractC2763s0.delta(providesHelpCenterService);
        return providesHelpCenterService;
    }

    @Override // Kd.a
    public HelpCenterService get() {
        return providesHelpCenterService((RestServiceProvider) this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
    }
}
