package com.google.android.gms.internal.measurement;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class ag {
    public static final int alpha;

    static {
        alpha = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
