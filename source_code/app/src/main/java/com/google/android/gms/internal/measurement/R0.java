package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class R0 {
    public static final U7.c alpha;

    static {
        U7.c cVar;
        Uri uri = S0.alpha;
        synchronized (T0.class) {
            try {
                if (T0.alpha == null) {
                    T0.charlie(new U7.c());
                }
                cVar = T0.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        alpha = cVar;
    }
}
