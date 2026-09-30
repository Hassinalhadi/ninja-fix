package zendesk.core;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

        private InstanceHolder() {
        }
    }

    public static ActionHandlerRegistry actionHandlerRegistry() {
        ActionHandlerRegistry actionHandlerRegistry = ZendeskProvidersModule.actionHandlerRegistry();
        AbstractC2763s0.delta(actionHandlerRegistry);
        return actionHandlerRegistry;
    }

    public static ZendeskProvidersModule_ActionHandlerRegistryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // Kd.a
    public ActionHandlerRegistry get() {
        return actionHandlerRegistry();
    }
}
