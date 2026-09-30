package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* loaded from: classes2.dex */
public abstract class V0 {
    public static UserManager alpha;
    public static volatile boolean bravo = !alpha();

    public static boolean alpha() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
