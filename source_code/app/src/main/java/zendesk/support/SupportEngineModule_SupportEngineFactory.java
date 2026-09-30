package zendesk.support;

import Kd.a;
import android.content.Context;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;

/* loaded from: classes.dex */
public final class SupportEngineModule_SupportEngineFactory implements b {
    private final a contextProvider;
    private final SupportEngineModule module;
    private final a stateViewObserverProvider;
    private final a supportEngineModelProvider;
    private final a updateViewObserverProvider;

    public SupportEngineModule_SupportEngineFactory(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4) {
        this.module = supportEngineModule;
        this.contextProvider = aVar;
        this.supportEngineModelProvider = aVar2;
        this.stateViewObserverProvider = aVar3;
        this.updateViewObserverProvider = aVar4;
    }

    public static SupportEngineModule_SupportEngineFactory create(SupportEngineModule supportEngineModule, a aVar, a aVar2, a aVar3, a aVar4) {
        return new SupportEngineModule_SupportEngineFactory(supportEngineModule, aVar, aVar2, aVar3, aVar4);
    }

    public static SupportEngine supportEngine(SupportEngineModule supportEngineModule, Context context, Object obj, CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> compositeActionListener, CompositeActionListener<Update> compositeActionListener2) {
        SupportEngine supportEngine = supportEngineModule.supportEngine(context, (SupportEngineModel) obj, compositeActionListener, compositeActionListener2);
        AbstractC2763s0.delta(supportEngine);
        return supportEngine;
    }

    @Override // Kd.a
    public SupportEngine get() {
        return supportEngine(this.module, (Context) this.contextProvider.get(), this.supportEngineModelProvider.get(), (CompositeActionListener) this.stateViewObserverProvider.get(), (CompositeActionListener) this.updateViewObserverProvider.get());
    }
}
