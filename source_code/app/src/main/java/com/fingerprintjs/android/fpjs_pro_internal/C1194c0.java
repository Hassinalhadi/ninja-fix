package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1194c0 {
    public static int bravo;
    public final bh alpha;

    public C1194c0(bh bhVar) {
        this.alpha = bhVar;
    }

    public final N14263A23323 alpha() {
        try {
            Object[] objArr = {0L, new C1190b0(this), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - TextUtils.getOffsetBefore("", 0)), 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 222 - Color.argb(0, 0, 0, 0), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            int i4 = bravo;
            if (((i4 ^ 105) + ((i4 & 105) << 1)) % 2 != 0) {
                return n14263a23323;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
