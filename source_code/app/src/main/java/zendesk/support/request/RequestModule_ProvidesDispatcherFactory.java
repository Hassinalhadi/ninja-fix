package zendesk.support.request;

import s6.AbstractC2763s0;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesDispatcherFactory implements dagger.internal.b {
    private final Kd.a storeProvider;

    public RequestModule_ProvidesDispatcherFactory(Kd.a aVar) {
        this.storeProvider = aVar;
    }

    public static RequestModule_ProvidesDispatcherFactory create(Kd.a aVar) {
        return new RequestModule_ProvidesDispatcherFactory(aVar);
    }

    public static Dispatcher providesDispatcher(Store store) {
        Dispatcher providesDispatcher = RequestModule.providesDispatcher(store);
        AbstractC2763s0.delta(providesDispatcher);
        return providesDispatcher;
    }

    @Override // Kd.a
    public Dispatcher get() {
        return providesDispatcher((Store) this.storeProvider.get());
    }
}
