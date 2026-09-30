package N8;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements o {
    public final Bundle alpha;

    public a(Context appContext) {
        Intrinsics.echo(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.alpha = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // N8.o
    public final Object alpha(Nd.c cVar) {
        return Unit.INSTANCE;
    }

    @Override // N8.o
    public final Boolean bravo() {
        Bundle bundle = this.alpha;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // N8.o
    public final kotlin.time.b charlie() {
        Bundle bundle = this.alpha;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new kotlin.time.b(kotlin.time.g.papa(bundle.getInt("firebase_sessions_sessions_restart_timeout"), kotlin.time.d.teal));
        }
        return null;
    }

    @Override // N8.o
    public final Double delta() {
        Bundle bundle = this.alpha;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
