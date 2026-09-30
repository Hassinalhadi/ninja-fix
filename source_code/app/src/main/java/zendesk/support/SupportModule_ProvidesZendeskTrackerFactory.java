package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesZendeskTrackerFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesZendeskTrackerFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesZendeskTrackerFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesZendeskTrackerFactory(supportModule);
    }

    public static ZendeskTracker providesZendeskTracker(SupportModule supportModule) {
        ZendeskTracker providesZendeskTracker = supportModule.providesZendeskTracker();
        AbstractC2763s0.delta(providesZendeskTracker);
        return providesZendeskTracker;
    }

    @Override // Kd.a
    public ZendeskTracker get() {
        return providesZendeskTracker(this.module);
    }
}
