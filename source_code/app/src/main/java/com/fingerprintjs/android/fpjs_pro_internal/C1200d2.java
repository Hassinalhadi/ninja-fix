package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1200d2 {
    public static int india = 0;
    public static int juliet = 1;
    public final U alpha;
    public final C1274w1 bravo;
    public final C1212g2 charlie;
    public final O0 delta;
    public final R0 echo;
    public final al foxtrot;
    public final av.ah golf;
    public final C1258s1 hotel;

    public C1200d2(U u4, C1274w1 c1274w1, C1212g2 c1212g2, O0 o02, R0 r02, al alVar, av.ah ahVar, C1258s1 c1258s1) {
        this.alpha = u4;
        this.bravo = c1274w1;
        this.charlie = c1212g2;
        this.delta = o02;
        this.echo = r02;
        this.foxtrot = alVar;
        this.golf = ahVar;
        this.hotel = c1258s1;
    }

    public static i3 echo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i14 = i11 | i12;
        int i15 = ~i12;
        int i16 = ~i4;
        int i17 = ~(i15 | i16);
        int i18 = ~i11;
        int i19 = (~(i18 | i4)) | i17;
        int i20 = ~(i16 | i11);
        int i21 = i19 | i20;
        int i22 = (~(i4 | i18 | i12)) | i20;
        int i23 = 674303503 * i22;
        int i24 = 1696595968 * i13;
        int i25 = ((-182452224) * i10) + (1612709888 * i5) + i24 + i23 + ((-674303503) * i21) + (i14 * (-674303503)) + ((-1924067824) * i12) + ((i11 * (-1924067824)) - 304087040);
        int papa = AbstractC2327c.papa(i10, -1035018111, (1881146393 * i5) + i11 + i12 + i13);
        int i26 = i22 * 189;
        int i27 = i10 * 1329932787;
        int quebec = AbstractC2327c.quebec(papa, 1550319616, i27 + ((-1331189957) * i5) + ((-928100237) * i13) + i26 + (i21 * (-189)) + (i14 * (-189)) + (i12 * (-928100048)) + (i11 * (-928100048)) + 945860906, 1690828800, ((-1611137024) * papa) + i25);
        if (quebec != 1) {
            Object obj = "";
            if (quebec != 2) {
                if (quebec != 3) {
                    if (quebec != 4) {
                        if (quebec != 5) {
                            r rVar = new r((List) al.alpha(new Object[]{((C1200d2) objArr[0]).foxtrot}, 250460246, G2.alpha(), -250460246, G2.alpha(), G2.alpha(), G2.alpha()));
                            int i28 = juliet;
                            int i29 = (i28 & 59) + (i28 | 59);
                            india = i29 % 128;
                            if (i29 % 2 != 0) {
                                int i30 = 50 / 0;
                            }
                            return rVar;
                        }
                        try {
                            Object[] objArr2 = {0L, r0, r0, new C1270v1(((C1200d2) objArr[0]).bravo), 7, null};
                            Boolean bool = Boolean.FALSE;
                            Object echo = am.echo(373658851);
                            if (echo == null) {
                                echo = am.charlie((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 52, TextUtils.getCapsMode("", 0, 0) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                            }
                            Object invoke = ((Method) echo).invoke(null, objArr2);
                            Result.Companion companion = Result.INSTANCE;
                            if (invoke instanceof kotlin.k) {
                                int i31 = C1274w1.delta + 1;
                                C1274w1.charlie = i31 % 128;
                                if (i31 % 2 == 0) {
                                    invoke = 0L;
                                } else {
                                    throw null;
                                }
                            }
                            long longValue = ((Number) invoke).longValue();
                            int i32 = C1274w1.delta;
                            C1274w1.charlie = ((i32 ^ 101) + ((i32 & 101) << 1)) % 128;
                            ac acVar = new ac(longValue);
                            int i33 = juliet;
                            india = ((i33 & 17) + (i33 | 17)) % 128;
                            return acVar;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    C1258s1 c1258s1 = ((C1200d2) objArr[0]).hotel;
                    C1258s1.alpha = (C1258s1.bravo + 33) % 128;
                    try {
                        Object[] objArr3 = {0L, r0, r0, C1251q1.alpha, 7, null};
                        Boolean bool2 = Boolean.FALSE;
                        Object echo2 = am.echo(373658851);
                        if (echo2 == null) {
                            echo2 = am.charlie((char) KeyEvent.getDeadChar(0, 0), 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 904 - ExpandableListView.getPackedPositionGroup(0L), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                        }
                        Object invoke2 = ((Method) echo2).invoke(null, objArr3);
                        Result.Companion companion2 = Result.INSTANCE;
                        if (invoke2 instanceof kotlin.k) {
                            int i34 = C1258s1.bravo;
                            int i35 = ((i34 | 1) << 1) - (i34 ^ 1);
                            C1258s1.alpha = i35 % 128;
                            if (i35 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            obj = invoke2;
                        }
                        String str = (String) obj;
                        int i36 = C1258s1.bravo + 19;
                        C1258s1.alpha = i36 % 128;
                        if (i36 % 2 == 0) {
                            C1260t c1260t = new C1260t(str);
                            int i37 = juliet + 37;
                            india = i37 % 128;
                            if (i37 % 2 == 0) {
                                return c1260t;
                            }
                            throw null;
                        }
                        throw null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                aa aaVar = new aa(((Long) C1274w1.alpha(new Object[]{((C1200d2) objArr[0]).bravo}, Q2.D8871(), -1952650591, Q2.D8871(), Q2.D8871(), 1952650592, Q2.D8871())).longValue());
                int i38 = india;
                juliet = (((i38 | 83) << 1) - (i38 ^ 83)) % 128;
                return aaVar;
            }
            try {
                Object[] objArr4 = {0L, r3, r3, new Q2(((C1200d2) objArr[0]).golf), 7, null};
                Boolean bool3 = Boolean.FALSE;
                Object echo3 = am.echo(373658851);
                if (echo3 == null) {
                    echo3 = am.charlie((char) View.resolveSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                }
                Object invoke3 = ((Method) echo3).invoke(null, objArr4);
                Result.Companion companion3 = Result.INSTANCE;
                if (invoke3 instanceof kotlin.k) {
                    int i39 = av.ah.yellow;
                    int i40 = (i39 ^ 61) + ((i39 & 61) << 1);
                    av.ah.white = i40 % 128;
                    if (i40 % 2 != 0) {
                        throw null;
                    }
                } else {
                    obj = invoke3;
                }
                String str2 = (String) obj;
                int i41 = av.ah.white + 71;
                av.ah.yellow = i41 % 128;
                if (i41 % 2 != 0) {
                    C1264u c1264u = new C1264u(str2);
                    int i42 = juliet + 77;
                    india = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 74 / 0;
                    }
                    return c1264u;
                }
                throw null;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        C1256s c1256s = new C1256s(R0.bravo(new Object[]{((C1200d2) objArr[0]).echo}, at.component9(), -1603067081, at.component9(), at.component9(), 1603067082, at.component9()));
        juliet = (india + 119) % 128;
        return c1256s;
    }

    public final C1284z alpha() {
        U u4 = this.alpha;
        u4.getClass();
        C1284z c1284z = new C1284z((C1203e1) U.alpha(new Object[]{u4}, av.ah.magenta(), 524793485, -524793485, av.ah.magenta(), av.ah.magenta(), av.ah.magenta()));
        int i4 = juliet;
        int i5 = (i4 ^ 115) + ((i4 & 115) << 1);
        india = i5 % 128;
        if (i5 % 2 == 0) {
            return c1284z;
        }
        throw null;
    }

    public final C1241o bravo() {
        this.alpha.getClass();
        U.bravo = (U.alpha + 89) % 128;
        try {
            Object[] objArr = {0L, r9, r9, O.alpha, 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                int i4 = 53 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i5 = 904 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Class cls = Boolean.TYPE;
                echo = am.charlie((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), i4, i5, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                int i10 = U.alpha + 35;
                U.bravo = i10 % 128;
                if (i10 % 2 != 0) {
                    invoke = "";
                } else {
                    throw null;
                }
            }
            String str = (String) invoke;
            int i11 = U.alpha;
            int i12 = (i11 ^ 79) + ((i11 & 79) << 1);
            U.bravo = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 51 / 0;
            }
            C1241o c1241o = new C1241o(str);
            int i14 = india;
            juliet = (((i14 | 3) << 1) - (i14 ^ 3)) % 128;
            return c1241o;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        if ((r0 instanceof kotlin.k) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ed, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1258s1.alpha = (com.fingerprintjs.android.fpjs_pro_internal.C1258s1.bravo + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.C1258s1.alpha;
        com.fingerprintjs.android.fpjs_pro_internal.C1258s1.bravo = ((r0 ^ 113) + ((r0 & 113) << 1)) % 128;
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00eb, code lost:
    
        if ((r0 instanceof kotlin.k) != true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1272w charlie() {
        Object invoke;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i4 = C1258s1.bravo + 77;
        C1258s1.alpha = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                Object[] objArr = {1L, Boolean.TRUE, Boolean.FALSE, C1254r1.alpha, 121, null};
                Object echo = am.echo(373658851);
                if (echo == null) {
                    echo = am.charlie((char) ExpandableListView.getPackedPositionType(0L), 52 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 904, 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                }
                invoke = ((Method) echo).invoke(null, objArr);
                Result.Companion companion = Result.INSTANCE;
            } else {
                Object[] objArr2 = {0L, r9, r9, C1254r1.alpha, 7, null};
                Boolean bool = Boolean.FALSE;
                Object echo2 = am.echo(373658851);
                if (echo2 == null) {
                    echo2 = am.charlie((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 52 - KeyEvent.normalizeMetaState(0), 904 - View.combineMeasuredStates(0, 0), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                }
                invoke = ((Method) echo2).invoke(null, objArr2);
                Result.Companion companion2 = Result.INSTANCE;
            }
            C1272w c1272w = new C1272w((String) invoke);
            juliet = (india + 81) % 128;
            return c1272w;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final C1249q delta() {
        C1249q c1249q = new C1249q(R0.bravo(new Object[]{this.echo}, at.component9(), 1814587224, at.component9(), at.component9(), -1814587224, at.component9()));
        int i4 = juliet;
        int i5 = (i4 & 79) + (i4 | 79);
        india = i5 % 128;
        if (i5 % 2 == 0) {
            return c1249q;
        }
        throw null;
    }

    public final C1245p foxtrot() {
        this.alpha.getClass();
        int i4 = U.alpha;
        U.bravo = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
        try {
            Object[] objArr = {0L, r9, r9, S.alpha, 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i5 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 904;
                Class cls = Boolean.TYPE;
                echo = am.charlie(c3, i5, threadPriority, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                U.bravo = (U.alpha + 11) % 128;
                invoke = 0;
            } else {
                int i10 = U.bravo;
                U.alpha = ((i10 & 25) + (i10 | 25)) % 128;
            }
            int intValue = ((Number) invoke).intValue();
            U.bravo = (U.alpha + 27) % 128;
            C1245p c1245p = new C1245p(intValue);
            int i11 = juliet;
            int i12 = (i11 & 95) + (i11 | 95);
            india = i12 % 128;
            if (i12 % 2 == 0) {
                return c1245p;
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

    public final C1280y golf() {
        C1212g2 c1212g2 = this.charlie;
        c1212g2.getClass();
        try {
            Object[] objArr = {0L, r10, r10, new C1208f2(c1212g2), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                int alpha = Color.alpha(0) + 52;
                int normalizeMetaState = 904 - KeyEvent.normalizeMetaState(0);
                Class cls = Boolean.TYPE;
                echo = am.charlie((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), alpha, normalizeMetaState, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr);
            List emptyList = CollectionsKt.emptyList();
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                int i4 = (C1212g2.bravo + 45) % 128;
                C1212g2.charlie = i4;
                C1212g2.bravo = (i4 + 33) % 128;
                invoke = emptyList;
            }
            C1280y c1280y = new C1280y((List) invoke);
            int i5 = india;
            int i10 = ((i5 | 69) << 1) - (i5 ^ 69);
            juliet = i10 % 128;
            if (i10 % 2 != 0) {
                return c1280y;
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
