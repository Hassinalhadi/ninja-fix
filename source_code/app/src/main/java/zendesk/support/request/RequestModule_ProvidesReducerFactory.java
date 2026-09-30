package zendesk.support.request;

import java.util.List;
import s6.AbstractC2763s0;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesReducerFactory implements dagger.internal.b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final RequestModule_ProvidesReducerFactory INSTANCE = new RequestModule_ProvidesReducerFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesReducerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static List<Reducer> providesReducer() {
        List<Reducer> providesReducer = RequestModule.providesReducer();
        AbstractC2763s0.delta(providesReducer);
        return providesReducer;
    }

    @Override // Kd.a
    public List<Reducer> get() {
        return providesReducer();
    }
}
