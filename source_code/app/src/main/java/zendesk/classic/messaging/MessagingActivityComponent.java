package zendesk.classic.messaging;

import androidx.appcompat.app.i;

@MessagingActivityScope
/* loaded from: classes.dex */
interface MessagingActivityComponent {

    /* loaded from: classes.dex */
    public interface Builder {
        Builder activity(i iVar);

        MessagingActivityComponent build();

        Builder messagingComponent(MessagingComponent messagingComponent);
    }

    void inject(MessagingActivity messagingActivity);
}
