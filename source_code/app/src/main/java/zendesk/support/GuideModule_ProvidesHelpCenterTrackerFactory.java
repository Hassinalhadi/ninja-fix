package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesHelpCenterTrackerFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesHelpCenterTrackerFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesHelpCenterTrackerFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesHelpCenterTrackerFactory(guideModule);
    }

    public static HelpCenterTracker providesHelpCenterTracker(GuideModule guideModule) {
        HelpCenterTracker providesHelpCenterTracker = guideModule.providesHelpCenterTracker();
        AbstractC2763s0.delta(providesHelpCenterTracker);
        return providesHelpCenterTracker;
    }

    @Override // Kd.a
    public HelpCenterTracker get() {
        return providesHelpCenterTracker(this.module);
    }
}
