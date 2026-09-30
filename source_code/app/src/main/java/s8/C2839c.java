package s8;

import t6.Z1;

/* renamed from: s8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2839c extends Z1 {
    public static C2839c alpha;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, s8.c] */
    public static synchronized C2839c delta() {
        C2839c c2839c;
        synchronized (C2839c.class) {
            try {
                if (alpha == null) {
                    alpha = new Object();
                }
                c2839c = alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2839c;
    }

    @Override // t6.Z1
    public final String bravo() {
        return "isEnabled";
    }

    @Override // t6.Z1
    public final String charlie() {
        return "firebase_performance_collection_enabled";
    }
}
