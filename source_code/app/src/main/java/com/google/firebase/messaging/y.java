package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import av.ah;

/* loaded from: classes2.dex */
public final class y extends Binder {
    public final ah golf;

    public y(ah ahVar) {
        this.golf = ahVar;
    }

    public final void alpha(z zVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            g.access$000((g) this.golf.purple, zVar.alpha).charlie(new ap.a(1), new a4.u(20, zVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
