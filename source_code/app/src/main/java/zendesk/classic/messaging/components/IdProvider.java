package zendesk.classic.messaging.components;

import java.util.UUID;

/* loaded from: classes.dex */
public interface IdProvider {
    public static final IdProvider UUID_PROVIDER = new IdProvider() { // from class: zendesk.classic.messaging.components.IdProvider.1
        @Override // zendesk.classic.messaging.components.IdProvider
        public String getNewId() {
            return UUID.randomUUID().toString();
        }
    };

    String getNewId();
}
