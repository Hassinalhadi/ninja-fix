package zendesk.core;

import Kd.a;
import android.content.Context;
import dagger.internal.b;

/* loaded from: classes.dex */
public final class MediaFileResolver_Factory implements b {
    private final a contextProvider;

    public MediaFileResolver_Factory(a aVar) {
        this.contextProvider = aVar;
    }

    public static MediaFileResolver_Factory create(a aVar) {
        return new MediaFileResolver_Factory(aVar);
    }

    public static MediaFileResolver newInstance(Context context) {
        return new MediaFileResolver(context);
    }

    @Override // Kd.a
    public MediaFileResolver get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
