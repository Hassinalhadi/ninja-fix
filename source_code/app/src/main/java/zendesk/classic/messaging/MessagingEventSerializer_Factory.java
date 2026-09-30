package zendesk.classic.messaging;

import Kd.a;
import android.content.Context;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MessagingEventSerializer_Factory implements b {
    private final a contextProvider;
    private final a timestampFactoryProvider;

    public MessagingEventSerializer_Factory(a aVar, a aVar2) {
        this.contextProvider = aVar;
        this.timestampFactoryProvider = aVar2;
    }

    public static MessagingEventSerializer_Factory create(a aVar, a aVar2) {
        return new MessagingEventSerializer_Factory(aVar, aVar2);
    }

    public static MessagingEventSerializer newInstance(Context context, Object obj) {
        return new MessagingEventSerializer(context, (TimestampFactory) obj);
    }

    @Override // Kd.a
    public MessagingEventSerializer get() {
        return newInstance((Context) this.contextProvider.get(), this.timestampFactoryProvider.get());
    }
}
