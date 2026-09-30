package zendesk.classic.messaging;

import Kd.a;
import androidx.appcompat.app.i;
import dagger.internal.b;
import zendesk.classic.messaging.components.DateProvider;

/* loaded from: classes.dex */
public final class MessagingDialog_Factory implements b {
    private final a appCompatActivityProvider;
    private final a dateProvider;
    private final a messagingViewModelProvider;

    public MessagingDialog_Factory(a aVar, a aVar2, a aVar3) {
        this.appCompatActivityProvider = aVar;
        this.messagingViewModelProvider = aVar2;
        this.dateProvider = aVar3;
    }

    public static MessagingDialog_Factory create(a aVar, a aVar2, a aVar3) {
        return new MessagingDialog_Factory(aVar, aVar2, aVar3);
    }

    public static MessagingDialog newInstance(i iVar, MessagingViewModel messagingViewModel, DateProvider dateProvider) {
        return new MessagingDialog(iVar, messagingViewModel, dateProvider);
    }

    @Override // Kd.a
    public MessagingDialog get() {
        return newInstance((i) this.appCompatActivityProvider.get(), (MessagingViewModel) this.messagingViewModelProvider.get(), (DateProvider) this.dateProvider.get());
    }
}
