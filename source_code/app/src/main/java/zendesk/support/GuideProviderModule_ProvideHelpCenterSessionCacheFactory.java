package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideHelpCenterSessionCacheFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final GuideProviderModule_ProvideHelpCenterSessionCacheFactory INSTANCE = new GuideProviderModule_ProvideHelpCenterSessionCacheFactory();

        private InstanceHolder() {
        }
    }

    public static GuideProviderModule_ProvideHelpCenterSessionCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HelpCenterSessionCache provideHelpCenterSessionCache() {
        HelpCenterSessionCache provideHelpCenterSessionCache = GuideProviderModule.provideHelpCenterSessionCache();
        AbstractC2763s0.delta(provideHelpCenterSessionCache);
        return provideHelpCenterSessionCache;
    }

    @Override // Kd.a
    public HelpCenterSessionCache get() {
        return provideHelpCenterSessionCache();
    }
}
