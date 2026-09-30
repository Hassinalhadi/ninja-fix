package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public abstract class T0 {
    public static U7.c alpha;

    public static boolean alpha() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int bravo(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 != 4) {
            return 0;
        }
        return 5;
    }

    public static synchronized void charlie(U7.c cVar) {
        synchronized (T0.class) {
            if (alpha == null) {
                alpha = cVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
