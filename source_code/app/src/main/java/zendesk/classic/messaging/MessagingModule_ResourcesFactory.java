package zendesk.classic.messaging;

import Kd.a;
import android.content.Context;
import android.content.res.Resources;
import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class MessagingModule_ResourcesFactory implements b {
    private final a contextProvider;

    public MessagingModule_ResourcesFactory(a aVar) {
        this.contextProvider = aVar;
    }

    public static MessagingModule_ResourcesFactory create(a aVar) {
        return new MessagingModule_ResourcesFactory(aVar);
    }

    public static Resources resources(Context context) {
        Resources resources = MessagingModule.resources(context);
        AbstractC2763s0.delta(resources);
        return resources;
    }

    @Override // Kd.a
    public Resources get() {
        return resources((Context) this.contextProvider.get());
    }
}
