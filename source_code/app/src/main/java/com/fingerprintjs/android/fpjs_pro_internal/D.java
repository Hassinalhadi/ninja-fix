package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class D {
    public static int charlie;
    public final bh alpha;
    public final Context bravo;

    public D(bh bhVar, Context context) {
        this.alpha = bhVar;
        this.bravo = context;
    }

    public static final /* synthetic */ bh bravo(D d4) {
        int i4 = charlie;
        int i5 = ((i4 ^ 121) + ((i4 & 121) << 1)) % 128;
        bh bhVar = d4.alpha;
        int i10 = (i5 & 105) + (i5 | 105);
        charlie = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return bhVar;
    }

    public final N14263A23323 alpha() {
        try {
            Object[] objArr = {0L, new C(this), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (TextUtils.getOffsetAfter("", 0) + 40619), ImageFormat.getBitsPerPixel(0) + 53, 223 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            if ((charlie + 123) % 2 == 0) {
                int i4 = 48 / 0;
            }
            return n14263a23323;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
