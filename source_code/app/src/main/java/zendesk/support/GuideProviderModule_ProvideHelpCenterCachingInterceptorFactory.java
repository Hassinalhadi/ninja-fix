package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor() {
        HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor = GuideProviderModule.provideHelpCenterCachingInterceptor();
        AbstractC2763s0.delta(provideHelpCenterCachingInterceptor);
        return provideHelpCenterCachingInterceptor;
    }

    @Override // Kd.a
    public HelpCenterCachingInterceptor get() {
        return provideHelpCenterCachingInterceptor();
    }
}
