package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;

/* loaded from: classes.dex */
public final class SupportEngineModule_InteractionIdentifierFactory implements b {
    private final SupportEngineModule module;

    public SupportEngineModule_InteractionIdentifierFactory(SupportEngineModule supportEngineModule) {
        this.module = supportEngineModule;
    }

    public static SupportEngineModule_InteractionIdentifierFactory create(SupportEngineModule supportEngineModule) {
        return new SupportEngineModule_InteractionIdentifierFactory(supportEngineModule);
    }

    public static BotMessageDispatcher.MessageIdentifier<MessagingItem> interactionIdentifier(SupportEngineModule supportEngineModule) {
        BotMessageDispatcher.MessageIdentifier<MessagingItem> interactionIdentifier = supportEngineModule.interactionIdentifier();
        AbstractC2763s0.delta(interactionIdentifier);
        return interactionIdentifier;
    }

    @Override // Kd.a
    public BotMessageDispatcher.MessageIdentifier<MessagingItem> get() {
        return interactionIdentifier(this.module);
    }
}
