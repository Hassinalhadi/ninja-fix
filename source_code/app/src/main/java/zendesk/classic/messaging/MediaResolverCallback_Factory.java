package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MediaResolverCallback_Factory implements b {
    private final a eventFactoryProvider;
    private final a eventListenerProvider;

    public MediaResolverCallback_Factory(a aVar, a aVar2) {
        this.eventListenerProvider = aVar;
        this.eventFactoryProvider = aVar2;
    }

    public static MediaResolverCallback_Factory create(a aVar, a aVar2) {
        return new MediaResolverCallback_Factory(aVar, aVar2);
    }

    public static MediaResolverCallback newInstance(EventListener eventListener, EventFactory eventFactory) {
        return new MediaResolverCallback(eventListener, eventFactory);
    }

    @Override // Kd.a
    public MediaResolverCallback get() {
        return newInstance((EventListener) this.eventListenerProvider.get(), (EventFactory) this.eventFactoryProvider.get());
    }
}
