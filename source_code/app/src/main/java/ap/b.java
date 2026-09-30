package ap;

import android.os.Looper;
import t6.I3;

/* loaded from: classes3.dex */
public final class b extends I3 {
    public static volatile b bravo;
    public static final a charlie = new a(0);
    public final c alpha = new c();

    public static b charlie() {
        if (bravo != null) {
            return bravo;
        }
        synchronized (b.class) {
            try {
                if (bravo == null) {
                    bravo = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bravo;
    }

    public final boolean delta() {
        this.alpha.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void echo(Runnable runnable) {
        c cVar = this.alpha;
        if (cVar.charlie == null) {
            synchronized (cVar.alpha) {
                try {
                    if (cVar.charlie == null) {
                        cVar.charlie = c.charlie(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.charlie.post(runnable);
    }
}
