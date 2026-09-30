package zendesk.support.request;

import s6.AbstractC2763s0;
import zendesk.commonui.PermissionsHandler;

/* loaded from: classes.dex */
public final class RequestModule_PermissionsHandlerFactory implements dagger.internal.b {
    private final RequestModule module;

    public RequestModule_PermissionsHandlerFactory(RequestModule requestModule) {
        this.module = requestModule;
    }

    public static RequestModule_PermissionsHandlerFactory create(RequestModule requestModule) {
        return new RequestModule_PermissionsHandlerFactory(requestModule);
    }

    public static PermissionsHandler permissionsHandler(RequestModule requestModule) {
        PermissionsHandler permissionsHandler = requestModule.permissionsHandler();
        AbstractC2763s0.delta(permissionsHandler);
        return permissionsHandler;
    }

    @Override // Kd.a
    public PermissionsHandler get() {
        return permissionsHandler(this.module);
    }
}
