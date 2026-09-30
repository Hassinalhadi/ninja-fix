package zendesk.support;

import dagger.internal.b;
import java.util.List;
import s6.AbstractC2763s0;
import zendesk.core.ActionHandler;

/* loaded from: classes.dex */
public final class SupportSdkModule_ProvidesActionHandlersFactory implements b {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesActionHandlersFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static SupportSdkModule_ProvidesActionHandlersFactory create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesActionHandlersFactory(supportSdkModule);
    }

    public static List<ActionHandler> providesActionHandlers(SupportSdkModule supportSdkModule) {
        List<ActionHandler> providesActionHandlers = supportSdkModule.providesActionHandlers();
        AbstractC2763s0.delta(providesActionHandlers);
        return providesActionHandlers;
    }

    @Override // Kd.a
    public List<ActionHandler> get() {
        return providesActionHandlers(this.module);
    }
}
