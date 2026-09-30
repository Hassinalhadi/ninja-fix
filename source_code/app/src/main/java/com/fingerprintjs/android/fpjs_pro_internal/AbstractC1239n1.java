package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1239n1 {
    public static final String alpha;

    static {
        String str;
        if (Build.VERSION.SDK_INT >= 35) {
            str = "content://com.google.android.gsf.gservices/prefix";
        } else {
            str = "content://com.google.android.gsf.gservices";
        }
        alpha = str;
    }
}
