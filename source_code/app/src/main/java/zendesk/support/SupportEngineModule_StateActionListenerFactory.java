package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;

/* loaded from: classes.dex */
public final class SupportEngineModule_StateActionListenerFactory implements b {
    private final SupportEngineModule module;
    private final a observerProvider;

    public SupportEngineModule_StateActionListenerFactory(SupportEngineModule supportEngineModule, a aVar) {
        this.module = supportEngineModule;
        this.observerProvider = aVar;
    }

    public static SupportEngineModule_StateActionListenerFactory create(SupportEngineModule supportEngineModule, a aVar) {
        return new SupportEngineModule_StateActionListenerFactory(supportEngineModule, aVar);
    }

    public static ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateActionListener(SupportEngineModule supportEngineModule, CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> compositeActionListener) {
        ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateActionListener = supportEngineModule.stateActionListener(compositeActionListener);
        AbstractC2763s0.delta(stateActionListener);
        return stateActionListener;
    }

    @Override // Kd.a
    public ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> get() {
        return stateActionListener(this.module, (CompositeActionListener) this.observerProvider.get());
    }
}
