package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.Timer;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;

/* loaded from: classes.dex */
public final class SupportEngineModule_BotMessageDispatcherFactory implements b {
    private final a messageIdentifierProvider;
    private final SupportEngineModule module;
    private final a stateActionListenerProvider;
    private final a timerFactoryProvider;
    private final a updateActionListenerProvider;

    public SupportEngineModule_BotMessageDispatcherFactory(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = supportEngineModule;
        this.messageIdentifierProvider = aVar;
        this.stateActionListenerProvider = aVar2;
        this.updateActionListenerProvider = aVar3;
        this.timerFactoryProvider = aVar4;
    }

    public static BotMessageDispatcher<MessagingItem> botMessageDispatcher(SupportEngineModule supportEngineModule, BotMessageDispatcher.MessageIdentifier<MessagingItem> messageIdentifier, ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> actionListener, ActionListener<Update> actionListener2, Timer.Factory factory) {
        BotMessageDispatcher<MessagingItem> botMessageDispatcher = supportEngineModule.botMessageDispatcher(messageIdentifier, actionListener, actionListener2, factory);
        AbstractC2763s0.delta(botMessageDispatcher);
        return botMessageDispatcher;
    }

    public static SupportEngineModule_BotMessageDispatcherFactory create(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new SupportEngineModule_BotMessageDispatcherFactory(supportEngineModule, aVar, aVar2, aVar3, aVar4);
    }

    @Override // Kd.a
    public BotMessageDispatcher<MessagingItem> get() {
        return botMessageDispatcher(this.module, (BotMessageDispatcher.MessageIdentifier) this.messageIdentifierProvider.get(), (ActionListener) this.stateActionListenerProvider.get(), (ActionListener) this.updateActionListenerProvider.get(), (Timer.Factory) this.timerFactoryProvider.get());
    }
}
