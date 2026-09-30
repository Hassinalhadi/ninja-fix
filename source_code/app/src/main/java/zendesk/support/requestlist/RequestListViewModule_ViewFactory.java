package zendesk.support.requestlist;

import Kd.a;
import com.squareup.picasso.Picasso;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestListViewModule_ViewFactory implements b {
    private final RequestListViewModule module;
    private final a picassoProvider;

    public RequestListViewModule_ViewFactory(RequestListViewModule requestListViewModule, a aVar) {
        this.module = requestListViewModule;
        this.picassoProvider = aVar;
    }

    public static RequestListViewModule_ViewFactory create(RequestListViewModule requestListViewModule, a aVar) {
        return new RequestListViewModule_ViewFactory(requestListViewModule, aVar);
    }

    public static RequestListView view(RequestListViewModule requestListViewModule, Picasso picasso) {
        RequestListView view = requestListViewModule.view(picasso);
        AbstractC2763s0.delta(view);
        return view;
    }

    @Override // Kd.a
    public RequestListView get() {
        return view(this.module, (Picasso) this.picassoProvider.get());
    }
}
