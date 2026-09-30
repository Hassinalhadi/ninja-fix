package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/av;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class av {

    @NotNull
    public static final av alpha = new Object();
    public static int bravo = 0;
    public static int charlie = 1;

    /* JADX WARN: Type inference failed for: r30v2, types: [com.fingerprintjs.android.fpjs_pro_internal.al, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v2, types: [com.fingerprintjs.android.fpjs_pro_internal.s1, java.lang.Object] */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        long j5;
        int i14;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i15 = ~i12;
        int i16 = ~i13;
        int i17 = ~i4;
        int i18 = (~(i16 | i17)) | i15;
        int i19 = ~(i16 | i12 | i4);
        int i20 = (~(i4 | i12)) | (~(i17 | i15)) | i16;
        int i21 = 1516765184 * i11;
        int i22 = (1722810368 * i10) + ((-1298137088) * i5) + i21 + ((-1194288187) * i20) + (1194288187 * i19) + (i18 * 1194288187) + (322476998 * i13) + ((-1583913924) * i12) + 967573504;
        int papa = AbstractC2327c.papa(i10, -2108786386, ((-1422066268) * i5) + i12 + i13 + i11);
        int i23 = i20 * 261;
        int i24 = i10 * (-1016611666);
        int quebec = AbstractC2327c.quebec(papa, 166461440, i24 + (692483748 * i5) + (793896001 * i11) + i23 + (i19 * (-261)) + (i18 * (-261)) + (i13 * 793896262) + (i12 * 793895740) + 1353643607, 1997799424, (518782976 * papa) + i22);
        Object obj = null;
        try {
            if (quebec != 1) {
                if (quebec != 2) {
                    if (quebec != 3) {
                        if (quebec != 4) {
                            if (quebec != 5) {
                                Context context = (Context) objArr[0];
                                U u4 = (U) alpha(new Object[0], aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), 1750974124, -1750974121);
                                try {
                                    Object[] objArr2 = {0L, r1, r1, new as(context), 7, null};
                                    Boolean bool = Boolean.FALSE;
                                    Object echo = am.echo(373658851);
                                    if (echo == null) {
                                        j5 = 0;
                                        echo = am.charlie((char) TextUtils.getOffsetBefore("", 0), 52 - (ViewConfiguration.getTapTimeout() >> 16), 904 - (ViewConfiguration.getPressedStateDuration() >> 16), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                                    } else {
                                        j5 = 0;
                                    }
                                    Object invoke = ((Method) echo).invoke(null, objArr2);
                                    Result.Companion companion = Result.INSTANCE;
                                    if (invoke instanceof kotlin.k) {
                                        invoke = null;
                                    }
                                    ActivityManager activityManager = (ActivityManager) invoke;
                                    Object[] objArr3 = {Long.valueOf(j5), bool, bool, an.alpha, 7, null};
                                    Object echo2 = am.echo(373658851);
                                    if (echo2 == null) {
                                        echo2 = am.charlie((char) (Process.getGidForName("") + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 52, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                                    }
                                    Object invoke2 = ((Method) echo2).invoke(null, objArr3);
                                    if (invoke2 instanceof kotlin.k) {
                                        invoke2 = null;
                                    }
                                    StatFs statFs = (StatFs) invoke2;
                                    Object[] objArr4 = {Long.valueOf(j5), bool, bool, new au(context), 7, null};
                                    Object echo3 = am.echo(373658851);
                                    if (echo3 == null) {
                                        i14 = 1;
                                        echo3 = am.charlie((char) (ExpandableListView.getPackedPositionChild(j5) + 1), 52 - (ViewConfiguration.getPressedStateDuration() >> 16), 905 - (Process.getElapsedCpuTime() > j5 ? 1 : (Process.getElapsedCpuTime() == j5 ? 0 : -1)), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                                    } else {
                                        i14 = 1;
                                    }
                                    Object invoke3 = ((Method) echo3).invoke(null, objArr4);
                                    if (invoke3 instanceof kotlin.k) {
                                        invoke3 = null;
                                    }
                                    C1274w1 c1274w1 = new C1274w1(activityManager, statFs);
                                    int i25 = i14;
                                    Object[] objArr5 = new Object[i25];
                                    objArr5[0] = context;
                                    C1212g2 c1212g2 = (C1212g2) alpha(objArr5, aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), -887515801, 887515803);
                                    Object[] objArr6 = new Object[i25];
                                    objArr6[0] = context;
                                    O0 o02 = (O0) alpha(objArr6, aq.D8871(), aq.D8871(), aq.D8871(), aq.D8871(), 1144941935, -1144941934);
                                    R0 r02 = new R0(context);
                                    int i26 = (bravo + 31) % 128;
                                    charlie = i26;
                                    ?? obj2 = new Object();
                                    bravo = ((i26 & 47) + (i26 | 47)) % 128;
                                    try {
                                        Object[] objArr7 = {Long.valueOf(j5), bool, bool, new ar(context), 7, null};
                                        Object echo4 = am.echo(373658851);
                                        if (echo4 == null) {
                                            echo4 = am.charlie((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j5 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j5 ? 0 : -1)) - 1), 52 - Color.blue(0), 904 - (ViewConfiguration.getEdgeSlop() >> 16), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                                        }
                                        Object invoke4 = ((Method) echo4).invoke(null, objArr7);
                                        if (!(invoke4 instanceof kotlin.k)) {
                                            obj = invoke4;
                                        }
                                        av.ah ahVar = new av.ah(17, (ActivityManager) obj);
                                        ?? obj3 = new Object();
                                        int i27 = charlie;
                                        C1200d2 c1200d2 = new C1200d2(u4, c1274w1, c1212g2, o02, r02, obj2, ahVar, obj3);
                                        bravo = (i27 + 113) % 128;
                                        return c1200d2;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                            Object[] objArr8 = {0L, r2, r2, new ao((Context) objArr[0]), 7, null};
                            Boolean bool2 = Boolean.FALSE;
                            Object echo5 = am.echo(373658851);
                            if (echo5 == null) {
                                echo5 = am.charlie((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getTrimmedLength("") + 52, 904 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                            }
                            Object invoke5 = ((Method) echo5).invoke(null, objArr8);
                            Result.Companion companion2 = Result.INSTANCE;
                            if (!(invoke5 instanceof kotlin.k)) {
                                obj = invoke5;
                            }
                            return new C1244o2((ContentResolver) obj);
                        }
                        Object[] objArr9 = {0L, r2, r2, new ap((Context) objArr[0]), 7, null};
                        Boolean bool3 = Boolean.FALSE;
                        Object echo6 = am.echo(373658851);
                        if (echo6 == null) {
                            echo6 = am.charlie((char) Drawable.resolveOpacity(0, 0), 52 - KeyEvent.normalizeMetaState(0), Color.red(0) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                        }
                        Object invoke6 = ((Method) echo6).invoke(null, objArr9);
                        Result.Companion companion3 = Result.INSTANCE;
                        if (!(invoke6 instanceof kotlin.k)) {
                            obj = invoke6;
                        }
                        return new C1227k1((ContentResolver) obj);
                    }
                    Object obj4 = new Object();
                    int i28 = bravo;
                    charlie = (((i28 | 81) << 1) - (i28 ^ 81)) % 128;
                    return obj4;
                }
                Object[] objArr10 = {0L, r2, r2, new at((Context) objArr[0]), 7, null};
                Boolean bool4 = Boolean.FALSE;
                Object echo7 = am.echo(373658851);
                if (echo7 == null) {
                    echo7 = am.charlie((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 52, 904 - Color.argb(0, 0, 0, 0), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                }
                Object invoke7 = ((Method) echo7).invoke(null, objArr10);
                Result.Companion companion4 = Result.INSTANCE;
                if (!(invoke7 instanceof kotlin.k)) {
                    obj = invoke7;
                }
                return new C1212g2((SensorManager) obj);
            }
            Object[] objArr11 = {0L, r2, r2, new aq((Context) objArr[0]), 7, null};
            Boolean bool5 = Boolean.FALSE;
            Object echo8 = am.echo(373658851);
            if (echo8 == null) {
                echo8 = am.charlie((char) Color.alpha(0), 52 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
            }
            Object invoke8 = ((Method) echo8).invoke(null, objArr11);
            Result.Companion companion5 = Result.INSTANCE;
            if (!(invoke8 instanceof kotlin.k)) {
                obj = invoke8;
            }
            return new O0((InputManager) obj);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
