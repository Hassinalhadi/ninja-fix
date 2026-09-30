package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http.HttpStatusCodesKt;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1261t0 {
    public static int bravo = 0;
    public static int charlie = 1;
    public final TelephonyManager alpha;

    public C1261t0(TelephonyManager telephonyManager) {
        this.alpha = telephonyManager;
    }

    public static /* synthetic */ Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i4;
        int i15 = i13 | i14 | (~i11);
        int i16 = ~i13;
        int i17 = (~(i11 | i14)) | (~(i14 | i16));
        int i18 = ((-742522880) * i12) + ((-1056047104) * i10) + ((-669908992) * i5) + ((-4778405) * i17) + (i16 * (-4778405)) + (4778405 * i15) + ((-674687396) * i13) + (((-665130586) * i4) - 357761024);
        int papa = AbstractC2327c.papa(i12, 1942122663, ((-92689393) * i10) + i4 + i13 + i5);
        int i19 = i15 * (-307);
        if (AbstractC2327c.quebec(papa, 173867008, (i12 * (-1279783457)) + (i10 * 439444615) + (i5 * 1048061961) + (i17 * HttpStatusCodesKt.HTTP_TEMP_REDIRECT) + (i16 * HttpStatusCodesKt.HTTP_TEMP_REDIRECT) + i19 + (i13 * 1048062268) + (i4 * 1048061654) + 1366922925, -1898250240, ((-592117760) * papa) + i18) != 1) {
            try {
                Object[] objArr2 = {0L, new C1246p0((C1261t0) objArr[0]), 1, null};
                Object echo = am.echo(853678683);
                if (echo == null) {
                    echo = am.charlie((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40618), 52 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
                Object invoke = ((Method) echo).invoke(null, objArr2);
                int i20 = bravo + 65;
                charlie = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 96 / 0;
                }
                return invoke;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        C1261t0 c1261t0 = (C1261t0) objArr[0];
        int i22 = charlie;
        bravo = ((i22 ^ 35) + ((i22 & 35) << 1)) % 128;
        TelephonyManager telephonyManager = c1261t0.alpha;
        bravo = ((i22 ^ 81) + ((i22 & 81) << 1)) % 128;
        return telephonyManager;
    }

    public final N14263A23323 alpha() {
        try {
            Object[] objArr = {0L, new C1257s0(this), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 52, 222 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            int i4 = charlie;
            int i5 = ((i4 | 123) << 1) - (i4 ^ 123);
            bravo = i5 % 128;
            if (i5 % 2 == 0) {
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
