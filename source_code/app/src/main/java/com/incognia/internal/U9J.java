package com.incognia.internal;

import java.nio.charset.Charset;
import kotlin.text.StringsKt;
import kotlin.text.a;

/* loaded from: classes2.dex */
public abstract class U9J {
    public static String b(String str) {
        Charset charset = a.alpha;
        byte[] bytes = str.getBytes(charset);
        t9 t9Var = new t9();
        t9Var.b(bytes);
        return StringsKt.b(new String(cT.W(2, t9Var.b()), charset)).toString();
    }
}
