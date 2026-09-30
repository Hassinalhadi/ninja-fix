package s8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.RunnableC0643m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class v {
    public static final C3146a charlie = C3146a.delta();
    public static v delta;
    public volatile SharedPreferences alpha;
    public final ExecutorService bravo;

    public v(ExecutorService executorService) {
        this.bravo = executorService;
    }

    public static Context alpha() {
        try {
            B7.g.charlie();
            B7.g charlie2 = B7.g.charlie();
            charlie2.alpha();
            return charlie2.alpha;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized v bravo() {
        v vVar;
        synchronized (v.class) {
            try {
                if (delta == null) {
                    delta = new v(Executors.newSingleThreadExecutor());
                }
                vVar = delta;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final synchronized void charlie(Context context) {
        if (this.alpha == null && context != null) {
            this.bravo.execute(new RunnableC0643m(26, this, context));
        }
    }

    public final void delta(long j5, String str) {
        if (this.alpha == null) {
            charlie(alpha());
            if (this.alpha == null) {
                return;
            }
        }
        this.alpha.edit().putLong(str, j5).apply();
    }

    public final void echo(String str, double d4) {
        if (this.alpha == null) {
            charlie(alpha());
            if (this.alpha == null) {
                return;
            }
        }
        this.alpha.edit().putLong(str, Double.doubleToRawLongBits(d4)).apply();
    }

    public final void foxtrot(String str, String str2) {
        if (this.alpha == null) {
            charlie(alpha());
            if (this.alpha == null) {
                return;
            }
        }
        if (str2 == null) {
            this.alpha.edit().remove(str).apply();
        } else {
            this.alpha.edit().putString(str, str2).apply();
        }
    }

    public final void golf(String str, boolean z2) {
        if (this.alpha == null) {
            charlie(alpha());
            if (this.alpha == null) {
                return;
            }
        }
        this.alpha.edit().putBoolean(str, z2).apply();
    }
}
