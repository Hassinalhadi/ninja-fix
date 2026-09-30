package zendesk.classic.messaging.ui;

import Kd.a;
import android.content.res.Resources;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MessagingCellPropsFactory_Factory implements b {
    private final a resourcesProvider;

    public MessagingCellPropsFactory_Factory(a aVar) {
        this.resourcesProvider = aVar;
    }

    public static MessagingCellPropsFactory_Factory create(a aVar) {
        return new MessagingCellPropsFactory_Factory(aVar);
    }

    public static MessagingCellPropsFactory newInstance(Resources resources) {
        return new MessagingCellPropsFactory(resources);
    }

    @Override // Kd.a
    public MessagingCellPropsFactory get() {
        return newInstance((Resources) this.resourcesProvider.get());
    }
}
