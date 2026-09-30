package O7;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class h {
    public static final g delta = new g(0);
    public static final E0.k echo = new E0.k(1);
    public final U7.c alpha;
    public String bravo = null;
    public String charlie = null;

    public h(U7.c cVar) {
        this.alpha = cVar;
    }

    public static void alpha(U7.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.charlie(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
            }
        }
    }
}
