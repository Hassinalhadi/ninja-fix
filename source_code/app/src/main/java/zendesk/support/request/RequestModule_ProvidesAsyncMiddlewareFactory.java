package zendesk.support.request;

import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class RequestModule_ProvidesAsyncMiddlewareFactory implements dagger.internal.b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final RequestModule_ProvidesAsyncMiddlewareFactory INSTANCE = new RequestModule_ProvidesAsyncMiddlewareFactory();

        private InstanceHolder() {
        }
    }

    public static RequestModule_ProvidesAsyncMiddlewareFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AsyncMiddleware providesAsyncMiddleware() {
        AsyncMiddleware providesAsyncMiddleware = RequestModule.providesAsyncMiddleware();
        AbstractC2763s0.delta(providesAsyncMiddleware);
        return providesAsyncMiddleware;
    }

    @Override // Kd.a
    public AsyncMiddleware get() {
        return providesAsyncMiddleware();
    }
}
