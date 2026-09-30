package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.CompositeActionListener;

/* loaded from: classes.dex */
public final class SupportEngineModule_UpdateViewObserverFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_UpdateViewObserverFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static SupportEngineModule_UpdateViewObserverFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_UpdateViewObserverFactory(supportEngineModule);
    }

    public static CompositeActionListener<Update> updateViewObserver(SupportEngineModule supportEngineModule) {
        CompositeActionListener<Update> updateViewObserver = supportEngineModule.updateViewObserver();
        AbstractC2763s0.delta(updateViewObserver);
        return updateViewObserver;
    }

    @Override // Kd.a
    public CompositeActionListener<Update> get() {
        return updateViewObserver(this.module);
    }
}
