package K7;

import A2.s;
import B7.g;
import O7.p;
import O7.r;
import android.util.Log;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public final r alpha;

    public b(r rVar) {
        this.alpha = rVar;
    }

    public static b alpha() {
        b bVar = (b) g.charlie().bravo(b.class);
        if (bVar != null) {
            return bVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void bravo(String str) {
        r rVar = this.alpha;
        rVar.oscar.alpha.alpha(new p(rVar, System.currentTimeMillis() - rVar.delta, str, 0));
    }

    public final void charlie(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        r rVar = this.alpha;
        rVar.oscar.alpha.alpha(new A8.g(rVar, th));
    }

    public final void delta(int i4, String str) {
        r rVar = this.alpha;
        rVar.oscar.alpha.alpha(new s(rVar, str, Integer.toString(i4), 11));
    }

    public final void echo(String str, String str2) {
        r rVar = this.alpha;
        rVar.oscar.alpha.alpha(new s(rVar, str, str2, 11));
    }
}
