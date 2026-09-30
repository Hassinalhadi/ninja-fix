package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.CompositeActionListener;

/* loaded from: classes.dex */
public final class SupportEngineModule_UpdateActionListenerFactory implements b {
    private final SupportEngineModule module;
    private final a observerProvider;

    public SupportEngineModule_UpdateActionListenerFactory(SupportEngineModule supportEngineModule, a aVar) {
        this.module = supportEngineModule;
        this.observerProvider = aVar;
    }

    public static SupportEngineModule_UpdateActionListenerFactory create(SupportEngineModule supportEngineModule, a aVar) {
        return new SupportEngineModule_UpdateActionListenerFactory(supportEngineModule, aVar);
    }

    public static ActionListener<Update> updateActionListener(SupportEngineModule supportEngineModule, CompositeActionListener<Update> compositeActionListener) {
        ActionListener<Update> updateActionListener = supportEngineModule.updateActionListener(compositeActionListener);
        AbstractC2763s0.delta(updateActionListener);
        return updateActionListener;
    }

    @Override // Kd.a
    public ActionListener<Update> get() {
        return updateActionListener(this.module, (CompositeActionListener) this.observerProvider.get());
    }
}
