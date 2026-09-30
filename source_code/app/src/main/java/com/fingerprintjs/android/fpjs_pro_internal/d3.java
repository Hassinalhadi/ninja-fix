package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Process;
import android.view.ViewConfiguration;
import g1.AbstractC1735d;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d3 {
    public static int bravo = 0;
    public static int charlie = 0;
    public static int delta = 0;
    public static int echo = 1;
    public final Context alpha;

    public d3(Context context) {
        this.alpha = context;
    }

    public static final boolean alpha(d3 d3Var, String str) {
        delta = (echo + 71) % 128;
        d3Var.getClass();
        int i4 = delta;
        echo = ((i4 & 81) + (i4 | 81)) % 128;
        int alpha = AbstractC1735d.alpha(d3Var.alpha, str);
        boolean z2 = false;
        if (alpha == 0) {
            int i5 = echo + 79;
            delta = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 2 / 0;
            }
            z2 = true;
        }
        echo = (delta + 61) % 128;
        return z2;
    }

    public static int bravo() {
        int i4 = bravo;
        int i5 = i4 % 8802833;
        bravo = i4 + 1;
        if (i5 != 0) {
            return charlie;
        }
        int myTid = Process.myTid();
        charlie = myTid;
        return myTid;
    }

    public final List charlie() {
        try {
            Object[] objArr = {0L, r7, r7, new c3(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo2 = am.echo(-1815327613);
            if (echo2 == null) {
                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 40618);
                int minimumFlingVelocity = 52 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 221;
                Class cls = Boolean.TYPE;
                echo2 = am.charlie(c3, minimumFlingVelocity, i4, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
            }
            List list = (List) component13.vD14832N6715((N14263A23323) ((Method) echo2).invoke(null, objArr), CollectionsKt.emptyList());
            int i5 = echo;
            delta = ((i5 ^ 115) + ((i5 & 115) << 1)) % 128;
            return list;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
