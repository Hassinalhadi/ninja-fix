package zendesk.support.request;

import java.util.List;
import s6.AbstractC2763s0;
import zendesk.support.suas.Reducer;
import zendesk.support.suas.Store;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesStoreFactory implements dagger.internal.b {
    private final Kd.a asyncMiddlewareProvider;
    private final Kd.a reducersProvider;

    public RequestModule_ProvidesStoreFactory(Kd.a aVar, Kd.a aVar2) {
        this.reducersProvider = aVar;
        this.asyncMiddlewareProvider = aVar2;
    }

    public static RequestModule_ProvidesStoreFactory create(Kd.a aVar, Kd.a aVar2) {
        return new RequestModule_ProvidesStoreFactory(aVar, aVar2);
    }

    public static Store providesStore(List<Reducer> list, Object obj) {
        Store providesStore = RequestModule.providesStore(list, (AsyncMiddleware) obj);
        AbstractC2763s0.delta(providesStore);
        return providesStore;
    }

    @Override // Kd.a
    public Store get() {
        return providesStore((List) this.reducersProvider.get(), this.asyncMiddlewareProvider.get());
    }
}
