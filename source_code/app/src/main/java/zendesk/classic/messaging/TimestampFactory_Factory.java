package zendesk.classic.messaging;

import Kd.a;
import android.content.Context;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class TimestampFactory_Factory implements b {
    private final a contextProvider;

    public TimestampFactory_Factory(a aVar) {
        this.contextProvider = aVar;
    }

    public static TimestampFactory_Factory create(a aVar) {
        return new TimestampFactory_Factory(aVar);
    }

    public static TimestampFactory newInstance(Context context) {
        return new TimestampFactory(context);
    }

    @Override // Kd.a
    public TimestampFactory get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
