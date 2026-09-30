package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MessagingViewModel_Factory implements b {
    private final a messagingModelProvider;

    public MessagingViewModel_Factory(a aVar) {
        this.messagingModelProvider = aVar;
    }

    public static MessagingViewModel_Factory create(a aVar) {
        return new MessagingViewModel_Factory(aVar);
    }

    public static MessagingViewModel newInstance(Object obj) {
        return new MessagingViewModel((MessagingModel) obj);
    }

    @Override // Kd.a
    public MessagingViewModel get() {
        return newInstance(this.messagingModelProvider.get());
    }
}
