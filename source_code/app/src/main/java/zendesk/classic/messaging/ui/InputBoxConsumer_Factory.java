package zendesk.classic.messaging.ui;

import Kd.a;
import dagger.internal.b;
import zendesk.classic.messaging.EventFactory;
import zendesk.classic.messaging.EventListener;
import zendesk.classic.messaging.MediaInMemoryDataSource;
import zendesk.classic.messaging.MediaResolverCallback;
import zendesk.classic.messaging.UriResolver;

/* loaded from: classes.dex */
public final class InputBoxConsumer_Factory implements b {
    private final a callbackProvider;
    private final a eventFactoryProvider;
    private final a eventListenerProvider;
    private final a mediaInMemoryDataSourceProvider;
    private final a uriResolverProvider;

    public InputBoxConsumer_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.eventListenerProvider = aVar;
        this.eventFactoryProvider = aVar2;
        this.mediaInMemoryDataSourceProvider = aVar3;
        this.uriResolverProvider = aVar4;
        this.callbackProvider = aVar5;
    }

    public static InputBoxConsumer_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new InputBoxConsumer_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static InputBoxConsumer newInstance(EventListener eventListener, EventFactory eventFactory, MediaInMemoryDataSource mediaInMemoryDataSource, UriResolver uriResolver, MediaResolverCallback mediaResolverCallback) {
        return new InputBoxConsumer(eventListener, eventFactory, mediaInMemoryDataSource, uriResolver, mediaResolverCallback);
    }

    @Override // Kd.a
    public InputBoxConsumer get() {
        return newInstance((EventListener) this.eventListenerProvider.get(), (EventFactory) this.eventFactoryProvider.get(), (MediaInMemoryDataSource) this.mediaInMemoryDataSourceProvider.get(), (UriResolver) this.uriResolverProvider.get(), (MediaResolverCallback) this.callbackProvider.get());
    }
}
