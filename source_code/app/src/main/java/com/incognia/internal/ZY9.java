package com.incognia.internal;

import kotlin.text.a;

/* loaded from: classes2.dex */
public abstract class ZY9 {
    public static final String b(String str) {
        if (kotlin.text.r.quebec(str, "\"", false) && kotlin.text.r.golf(str, "\"", false)) {
            return str.substring(1, str.length() - 1);
        }
        try {
            return new String(np.b(str), a.alpha);
        } catch (Exception unused) {
            return null;
        }
    }
}
