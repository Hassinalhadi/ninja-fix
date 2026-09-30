package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1305d1 {
    public static final bv.e alpha = new bv.aw(0);

    public static synchronized Uri alpha() {
        synchronized (AbstractC1305d1.class) {
            bv.e eVar = alpha;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                eVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
