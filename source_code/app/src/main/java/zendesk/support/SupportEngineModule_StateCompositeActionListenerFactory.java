package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;

/* loaded from: classes.dex */
public final class SupportEngineModule_StateCompositeActionListenerFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_StateCompositeActionListenerFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static SupportEngineModule_StateCompositeActionListenerFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_StateCompositeActionListenerFactory(supportEngineModule);
    }

    public static CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateCompositeActionListener(SupportEngineModule supportEngineModule) {
        CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateCompositeActionListener = supportEngineModule.stateCompositeActionListener();
        AbstractC2763s0.delta(stateCompositeActionListener);
        return stateCompositeActionListener;
    }

    @Override // Kd.a
    public CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> get() {
        return stateCompositeActionListener(this.module);
    }
}
