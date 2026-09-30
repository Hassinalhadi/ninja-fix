package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MessagingConversationLog_Factory implements b {
    private final a messagingEventSerializerProvider;

    public MessagingConversationLog_Factory(a aVar) {
        this.messagingEventSerializerProvider = aVar;
    }

    public static MessagingConversationLog_Factory create(a aVar) {
        return new MessagingConversationLog_Factory(aVar);
    }

    public static MessagingConversationLog newInstance(Object obj) {
        return new MessagingConversationLog((MessagingEventSerializer) obj);
    }

    @Override // Kd.a
    public MessagingConversationLog get() {
        return newInstance(this.messagingEventSerializerProvider.get());
    }
}
