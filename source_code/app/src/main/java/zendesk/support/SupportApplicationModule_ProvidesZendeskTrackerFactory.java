package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements b {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static SupportApplicationModule_ProvidesZendeskTrackerFactory create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportApplicationModule supportApplicationModule) {
        ZendeskTracker providesZendeskTracker = supportApplicationModule.providesZendeskTracker();
        AbstractC2763s0.delta(providesZendeskTracker);
        return providesZendeskTracker;
    }

    @Override // Kd.a
    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
