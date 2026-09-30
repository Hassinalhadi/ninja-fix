package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1274w1 {
    public static int charlie = 0;
    public static int delta = 1;
    public final ActivityManager alpha;
    public final StatFs bravo;

    public C1274w1(ActivityManager activityManager, StatFs statFs) {
        this.alpha = activityManager;
        this.bravo = statFs;
    }

    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i5;
        int i15 = (~(i14 | i13)) | i12;
        int i16 = (~(i14 | (~i13))) | (~((~i12) | i14)) | (~(i12 | i5 | i13));
        int i17 = ~(i13 | i12);
        int i18 = ((-366739456) * i10) + (1331953664 * i4) + (277610496 * i11) + ((-2022838664) * i17) + (2022838664 * i16) + ((-249289968) * i15) + ((-1745228167) * i5) + (526900465 * i12) + 74317824;
        int papa = AbstractC2327c.papa(i10, 135932771, ((-813770285) * i4) + i12 + i5 + i11);
        if (AbstractC2327c.quebec(papa, 460980224, ((-2006650391) * i10) + (1918847289 * i4) + (1149713731 * i11) + (i17 * 360) + (i16 * (-360)) + (i15 * (-720)) + (i5 * 1149714091) + (i12 * 1149714451) + 247108311, -1418592256, ((-1308753920) * papa) + i18) != 1) {
            C1274w1 c1274w1 = (C1274w1) objArr[0];
            int i19 = delta;
            int i20 = (i19 & 31) + (i19 | 31);
            int i21 = i20 % 128;
            charlie = i21;
            int i22 = i20 % 2;
            StatFs statFs = c1274w1.bravo;
            if (i22 == 0) {
                delta = ((i21 & 17) + (i21 | 17)) % 128;
                return statFs;
            }
            throw null;
        }
        try {
            Object[] objArr2 = {0L, r9, r9, new C1266u1((C1274w1) objArr[0]), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int pressedStateDuration = 52 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int i23 = 905 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Class cls = Boolean.TYPE;
                echo = am.charlie(c3, pressedStateDuration, i23, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr2);
            Result.Companion companion = Result.INSTANCE;
            if (!(invoke instanceof kotlin.k)) {
                int i24 = charlie;
                delta = (((i24 | 15) << 1) - (i24 ^ 15)) % 128;
            } else {
                int i25 = delta;
                charlie = ((i25 & 27) + (i25 | 27)) % 128;
                invoke = 0L;
            }
            return Long.valueOf(((Number) invoke).longValue());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
