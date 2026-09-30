package J8;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {
    public final B7.g alpha;
    public final N8.j bravo;

    public p(B7.g firebaseApp, N8.j settings, Nd.h backgroundDispatcher, D lifecycleServiceBinder) {
        Intrinsics.echo(firebaseApp, "firebaseApp");
        Intrinsics.echo(settings, "settings");
        Intrinsics.echo(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.echo(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.alpha = firebaseApp;
        this.bravo = settings;
        Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
        firebaseApp.alpha();
        Context applicationContext = firebaseApp.alpha.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(E.alpha);
            vf.ad.zulu(vf.ad.charlie(backgroundDispatcher), null, null, new o(this, backgroundDispatcher, lifecycleServiceBinder, null), 3);
        } else {
            Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
