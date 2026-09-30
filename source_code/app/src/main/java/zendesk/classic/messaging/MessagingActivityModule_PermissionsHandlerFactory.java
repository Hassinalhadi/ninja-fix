package zendesk.classic.messaging;

import Kd.a;
import androidx.appcompat.app.i;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.commonui.PermissionsHandler;

/* loaded from: classes.dex */
public final class MessagingActivityModule_PermissionsHandlerFactory implements b {
    private final a activityProvider;

    public MessagingActivityModule_PermissionsHandlerFactory(a aVar) {
        this.activityProvider = aVar;
    }

    public static MessagingActivityModule_PermissionsHandlerFactory create(a aVar) {
        return new MessagingActivityModule_PermissionsHandlerFactory(aVar);
    }

    public static PermissionsHandler permissionsHandler(i iVar) {
        PermissionsHandler permissionsHandler = MessagingActivityModule.permissionsHandler(iVar);
        AbstractC2763s0.delta(permissionsHandler);
        return permissionsHandler;
    }

    @Override // Kd.a
    public PermissionsHandler get() {
        return permissionsHandler((i) this.activityProvider.get());
    }
}
