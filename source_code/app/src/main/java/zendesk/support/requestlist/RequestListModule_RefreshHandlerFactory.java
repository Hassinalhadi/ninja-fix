package zendesk.support.requestlist;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestListModule_RefreshHandlerFactory implements b {
    private final a presenterProvider;

    public RequestListModule_RefreshHandlerFactory(a aVar) {
        this.presenterProvider = aVar;
    }

    public static RequestListModule_RefreshHandlerFactory create(a aVar) {
        return new RequestListModule_RefreshHandlerFactory(aVar);
    }

    public static RequestListSyncHandler refreshHandler(Object obj) {
        RequestListSyncHandler refreshHandler = RequestListModule.refreshHandler((RequestListPresenter) obj);
        AbstractC2763s0.delta(refreshHandler);
        return refreshHandler;
    }

    @Override // Kd.a
    public RequestListSyncHandler get() {
        return refreshHandler(this.presenterProvider.get());
    }
}
