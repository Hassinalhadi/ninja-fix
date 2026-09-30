package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class M2 {
    public static int charlie = 1;
    public static int delta;
    public static int echo;
    public final bh alpha;
    public final Context bravo;

    public M2(bh bhVar, Context context) {
        this.alpha = bhVar;
        this.bravo = context;
    }

    public static int alpha() {
        int i4 = delta;
        int i5 = i4 % 5333299;
        delta = i4 + 1;
        if (i5 != 0) {
            return echo;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        echo = freeMemory;
        return freeMemory;
    }

    public static final /* synthetic */ Context bravo(M2 m22) {
        int i4 = charlie;
        int i5 = (((i4 | 83) << 1) - (i4 ^ 83)) % 128;
        Context context = m22.bravo;
        int i10 = (i5 & 35) + (i5 | 35);
        charlie = i10 % 128;
        if (i10 % 2 != 0) {
            return context;
        }
        throw null;
    }

    public static final /* synthetic */ bh delta(M2 m22) {
        int i4 = charlie;
        bh bhVar = m22.alpha;
        if ((i4 + 125) % 2 == 0) {
            return bhVar;
        }
        throw null;
    }

    public final N14263A23323 charlie() {
        try {
            Object[] objArr = {0L, new L2(this), 1, null};
            Object echo2 = am.echo(853678683);
            if (echo2 == null) {
                echo2 = am.charlie((char) (TextUtils.getCapsMode("", 0, 0) + 40619), (-16777164) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 221, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo2).invoke(null, objArr);
            int i4 = charlie;
            if (((i4 & 3) + (i4 | 3)) % 2 == 0) {
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
