package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideCustomNetworkConfigFactory implements b {
    private final a helpCenterCachingInterceptorProvider;

    public GuideProviderModule_ProvideCustomNetworkConfigFactory(a aVar) {
        this.helpCenterCachingInterceptorProvider = aVar;
    }

    public static GuideProviderModule_ProvideCustomNetworkConfigFactory create(a aVar) {
        return new GuideProviderModule_ProvideCustomNetworkConfigFactory(aVar);
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(Object obj) {
        HelpCenterCachingNetworkConfig provideCustomNetworkConfig = GuideProviderModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) obj);
        AbstractC2763s0.delta(provideCustomNetworkConfig);
        return provideCustomNetworkConfig;
    }

    @Override // Kd.a
    public HelpCenterCachingNetworkConfig get() {
        return provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
    }
}
