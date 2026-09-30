package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MessagingActivityModule_MultilineResponseOptionsEnabledFactory implements b {
    private final a messagingComponentProvider;

    public MessagingActivityModule_MultilineResponseOptionsEnabledFactory(a aVar) {
        this.messagingComponentProvider = aVar;
    }

    public static MessagingActivityModule_MultilineResponseOptionsEnabledFactory create(a aVar) {
        return new MessagingActivityModule_MultilineResponseOptionsEnabledFactory(aVar);
    }

    public static boolean multilineResponseOptionsEnabled(MessagingComponent messagingComponent) {
        return MessagingActivityModule.multilineResponseOptionsEnabled(messagingComponent);
    }

    @Override // Kd.a
    public Boolean get() {
        return Boolean.valueOf(multilineResponseOptionsEnabled((MessagingComponent) this.messagingComponentProvider.get()));
    }
}
