package zendesk.classic.messaging;

import Kd.a;
import dagger.internal.b;
import zendesk.classic.messaging.components.DateProvider;

/* loaded from: classes.dex */
public final class EventFactory_Factory implements b {
    private final a dateProvider;

    public EventFactory_Factory(a aVar) {
        this.dateProvider = aVar;
    }

    public static EventFactory_Factory create(a aVar) {
        return new EventFactory_Factory(aVar);
    }

    public static EventFactory newInstance(DateProvider dateProvider) {
        return new EventFactory(dateProvider);
    }

    @Override // Kd.a
    public EventFactory get() {
        return newInstance((DateProvider) this.dateProvider.get());
    }
}
