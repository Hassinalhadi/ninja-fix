package com.google.protobuf;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1512o implements ap {
    static {
        if (C1505h.alpha == null) {
            synchronized (C1505h.class) {
                try {
                    if (C1505h.alpha == null) {
                        Class cls = AbstractC1504g.alpha;
                        C1505h c1505h = null;
                        if (cls != null) {
                            try {
                                c1505h = (C1505h) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1505h == null) {
                            c1505h = C1505h.bravo;
                        }
                        C1505h.alpha = c1505h;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
