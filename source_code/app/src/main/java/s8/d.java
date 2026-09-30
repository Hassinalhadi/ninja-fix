package s8;

import t6.Z1;

/* loaded from: classes2.dex */
public final class d extends Z1 {
    public static d alpha;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, s8.d] */
    public static synchronized d delta() {
        d dVar;
        synchronized (d.class) {
            try {
                if (alpha == null) {
                    alpha = new Object();
                }
                dVar = alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // t6.Z1
    public final String bravo() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // t6.Z1
    public final String charlie() {
        return "experiment_app_start_ttid";
    }
}
