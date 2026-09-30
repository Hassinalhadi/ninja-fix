package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class CoreModule_ActionHandlerRegistryFactory implements b {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static ActionHandlerRegistry actionHandlerRegistry(CoreModule coreModule) {
        ActionHandlerRegistry actionHandlerRegistry = coreModule.actionHandlerRegistry();
        AbstractC2763s0.delta(actionHandlerRegistry);
        return actionHandlerRegistry;
    }

    public static CoreModule_ActionHandlerRegistryFactory create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    @Override // Kd.a
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry(this.module);
    }
}
