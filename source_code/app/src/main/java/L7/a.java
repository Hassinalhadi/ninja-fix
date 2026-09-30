package L7;

import B2.s;
import F8.h;
import I7.n;
import R7.K;
import android.util.Log;
import av.q;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a {
    public static final c charlie = new Object();
    public final n alpha;
    public final AtomicReference bravo = new AtomicReference(null);

    public a(n nVar) {
        this.alpha = nVar;
        nVar.alpha(new s(15, this));
    }

    public final c alpha(String str) {
        a aVar = (a) this.bravo.get();
        if (aVar == null) {
            return charlie;
        }
        return aVar.alpha(str);
    }

    public final boolean bravo() {
        a aVar = (a) this.bravo.get();
        if (aVar != null && aVar.bravo()) {
            return true;
        }
        return false;
    }

    public final boolean charlie(String str) {
        a aVar = (a) this.bravo.get();
        if (aVar != null && aVar.charlie(str)) {
            return true;
        }
        return false;
    }

    public final void delta(String str, long j5, K k6) {
        String echo = q.echo("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", echo, null);
        }
        this.alpha.alpha(new h(str, j5, k6));
    }
}
