package V5;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes2.dex */
public final class l implements d, b, c {
    public static l bravo;
    public static final RootTelemetryConfiguration charlie = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public Object alpha;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, V5.l] */
    public static synchronized l echo() {
        l lVar;
        synchronized (l.class) {
            try {
                if (bravo == null) {
                    bravo = new Object();
                }
                lVar = bravo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // V5.d
    public void alpha(ConnectionResult connectionResult) {
        boolean o5 = connectionResult.o();
        e eVar = (e) this.alpha;
        if (o5) {
            eVar.kilo(null, eVar.sierra());
            return;
        }
        c cVar = eVar.papa;
        if (cVar != null) {
            cVar.delta(connectionResult);
        }
    }

    @Override // V5.b
    public void bravo(int i4) {
        ((com.google.android.gms.common.api.h) this.alpha).bravo(i4);
    }

    @Override // V5.b
    public void charlie() {
        ((com.google.android.gms.common.api.h) this.alpha).charlie();
    }

    @Override // V5.c
    public void delta(ConnectionResult connectionResult) {
        ((com.google.android.gms.common.api.i) this.alpha).delta(connectionResult);
    }
}
