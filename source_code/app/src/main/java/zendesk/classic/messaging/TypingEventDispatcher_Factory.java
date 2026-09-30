package zendesk.classic.messaging;

import Kd.a;
import android.os.Handler;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class TypingEventDispatcher_Factory implements b {
    private final a eventFactoryProvider;
    private final a eventListenerProvider;
    private final a handlerProvider;

    public TypingEventDispatcher_Factory(a aVar, a aVar2, a aVar3) {
        this.eventListenerProvider = aVar;
        this.handlerProvider = aVar2;
        this.eventFactoryProvider = aVar3;
    }

    public static TypingEventDispatcher_Factory create(a aVar, a aVar2, a aVar3) {
        return new TypingEventDispatcher_Factory(aVar, aVar2, aVar3);
    }

    public static TypingEventDispatcher newInstance(EventListener eventListener, Handler handler, EventFactory eventFactory) {
        return new TypingEventDispatcher(eventListener, handler, eventFactory);
    }

    @Override // Kd.a
    public TypingEventDispatcher get() {
        return newInstance((EventListener) this.eventListenerProvider.get(), (Handler) this.handlerProvider.get(), (EventFactory) this.eventFactoryProvider.get());
    }
}
