package g6;

import android.content.Context;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1754b {
    public static final C1754b bravo;
    public H0.a alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g6.b] */
    static {
        ?? obj = new Object();
        obj.alpha = null;
        bravo = obj;
    }

    public static H0.a alpha(Context context) {
        H0.a aVar;
        C1754b c1754b = bravo;
        synchronized (c1754b) {
            try {
                if (c1754b.alpha == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c1754b.alpha = new H0.a(context, 8);
                }
                aVar = c1754b.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
