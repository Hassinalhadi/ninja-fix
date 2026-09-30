package zendesk.support.requestlist;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestListModule_PresenterFactory implements b {
    private final a modelProvider;
    private final RequestListModule module;

    public RequestListModule_PresenterFactory(RequestListModule requestListModule, a aVar) {
        this.module = requestListModule;
        this.modelProvider = aVar;
    }

    public static RequestListModule_PresenterFactory create(RequestListModule requestListModule, a aVar) {
        return new RequestListModule_PresenterFactory(requestListModule, aVar);
    }

    public static RequestListPresenter presenter(RequestListModule requestListModule, Object obj) {
        RequestListPresenter presenter = requestListModule.presenter((RequestListModel) obj);
        AbstractC2763s0.delta(presenter);
        return presenter;
    }

    @Override // Kd.a
    public RequestListPresenter get() {
        return presenter(this.module, this.modelProvider.get());
    }
}
