package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro.ClientTimeout;
import com.fingerprintjs.android.fpjs_pro.UnknownError;
import com.fingerprintjs.android.fpjs_pro_internal.bp;
import com.zendesk.service.HttpConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class p3 implements L {
    public static int foxtrot = 0;
    public static int golf = 1;
    public final Object alpha;
    public final ah bravo;
    public final B charlie;
    public final InterfaceC1276x delta;
    public final C1231l1 echo;

    public p3(Object obj, ah ahVar, B b2, InterfaceC1276x interfaceC1276x, C1231l1 c1231l1) {
        this.alpha = obj;
        this.bravo = ahVar;
        this.charlie = b2;
        this.delta = interfaceC1276x;
        this.echo = c1231l1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x023b, code lost:
    
        if (r20 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0260, code lost:
    
        r11 = com.fingerprintjs.android.fpjs_pro_internal.p3.golf;
        com.fingerprintjs.android.fpjs_pro_internal.p3.foxtrot = (((r11 ^ 54) + ((r11 & 54) << 1)) - 1) % 128;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0242, code lost:
    
        r11 = java.lang.Long.valueOf(r20.intValue());
        r12 = com.fingerprintjs.android.fpjs_pro_internal.p3.golf;
        r13 = (r12 & (-54)) | ((~r12) & 53);
        r12 = -(-((r12 & 53) << 1));
        com.fingerprintjs.android.fpjs_pro_internal.p3.foxtrot = ((r13 & r12) + (r12 | r13)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0240, code lost:
    
        if (r20 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Long valueOf;
        Long l10;
        long j5;
        Object unknownError;
        int i14 = ~i12;
        int i15 = ~i13;
        int i16 = ~i11;
        int i17 = (~(i15 | i16)) | i14;
        int i18 = ~(i13 | i12);
        int i19 = i11 | i18;
        int i20 = (~(i11 | i12)) | (~(i14 | i15 | i16)) | i18 | (~(i13 | i11));
        int i21 = (-1881145344) * i5;
        int i22 = ((-578813952) * i10) + i21 + ((-849346560) * i4) + (587901737 * i20) + (i19 * 587901737) + ((-1175803474) * i17) + ((-1437248296) * i12) + ((-261444822) * i13) + 922746880;
        int papa = AbstractC2327c.papa(i10, -51365948, (1272450877 * i5) + i13 + i12 + i4);
        int i23 = i20 * 177;
        int i24 = i10 * 1141305060;
        int quebec = AbstractC2327c.quebec(papa, 516358144, i24 + ((-1484311963) * i5) + (1187242569 * i4) + i23 + (i19 * 177) + (i17 * (-354)) + (i12 * 1187242392) + (i13 * 1187242746) + 1002376400, -861863936, ((-124846080) * papa) + i22);
        if (quebec != 1) {
            if (quebec != 2) {
                if (quebec != 3) {
                    if (quebec != 4) {
                        if (quebec != 5) {
                            p3 p3Var = (p3) objArr[0];
                            int i25 = golf;
                            int i26 = i25 & 41;
                            int i27 = (~i26) & (i25 | 41);
                            int i28 = i26 << 1;
                            foxtrot = ((i27 & i28) + (i28 | i27)) % 128;
                            InterfaceC1276x interfaceC1276x = p3Var.delta;
                            int i29 = i25 & 31;
                            int i30 = (i25 | 31) & (~i29);
                            int i31 = -(-(i29 << 1));
                            foxtrot = (((i30 | i31) << 1) - (i30 ^ i31)) % 128;
                            return interfaceC1276x;
                        }
                        p3 p3Var2 = (p3) objArr[0];
                        int i32 = golf;
                        int i33 = ((i32 | 99) << 1) - (((~i32) & 99) | (i32 & (-100)));
                        int i34 = i33 % 128;
                        foxtrot = i34;
                        int i35 = i33 % 2;
                        B b2 = p3Var2.charlie;
                        if (i35 != 0) {
                            int i36 = 8 / 0;
                        }
                        int i37 = (-2) - ((i34 + 90) ^ (-1));
                        golf = i37 % 128;
                        if (i37 % 2 != 0) {
                            return b2;
                        }
                        throw null;
                    }
                    p3 p3Var3 = (p3) objArr[0];
                    int i38 = golf;
                    int i39 = i38 & 13;
                    int i40 = (i38 ^ 13) | i39;
                    int i41 = ((i39 ^ i40) + ((i40 & i39) << 1)) % 128;
                    foxtrot = i41;
                    Object obj = p3Var3.alpha;
                    int i42 = i41 & 97;
                    int i43 = i41 | 97;
                    int i44 = (i42 & i43) + (i42 | i43);
                    golf = i44 % 128;
                    if (i44 % 2 != 0) {
                        return obj;
                    }
                    throw null;
                }
                p3 p3Var4 = (p3) objArr[0];
                int pivotYN16904 = m3.setPivotYN16904();
                int i45 = (-960895317) ^ pivotYN16904;
                int i46 = ~pivotYN16904;
                int i47 = pivotYN16904 & (-960895317);
                int i48 = (i47 & i45) | (i45 ^ i47);
                int i49 = ~i48;
                int i50 = (i48 | i49) & i49;
                int i51 = 2163752 ^ i50;
                int i52 = i50 & 2163752;
                int i53 = ((i52 & i51) | (i51 ^ i52)) * HttpConstants.HTTP_NOT_IMPLEMENTED;
                int i54 = 1550093848 & i53;
                int i55 = (i53 ^ 1550093848) | i54;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                int i57 = i56 & (-1824038978);
                int i58 = (i57 - (~(-(-(((-1824038978) ^ i56) | i57))))) - 1;
                int i59 = ((~i46) & (-1070521176)) | (1070521175 & i46) | ((-1070521176) & i46);
                int i60 = i59 & 111789611;
                int i61 = -(-((~(((i59 | 111789611) & (~i60)) | i60)) * HttpConstants.HTTP_NOT_IMPLEMENTED));
                int i62 = i58 & i61;
                int i63 = -(-((i61 ^ i58) | i62));
                int i64 = (i62 & i63) + (i63 | i62);
                int pivotYN169042 = m3.setPivotYN16904();
                int i65 = (-515384531) & pivotYN169042;
                int i66 = (~i65) & ((-515384531) | pivotYN169042);
                int i67 = ~pivotYN169042;
                int i68 = ~((i65 & i66) | (i66 ^ i65));
                int i69 = 1215741996 ^ i68;
                int i70 = i68 & 1215741996;
                int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 262));
                int i72 = 914358484 & i71;
                int i73 = ((((914358484 ^ i71) | i72) << 1) - (~(-((i71 | 914358484) & (~i72))))) - 1;
                int i74 = ((593494015 & i73) | ((~i73) & (-593494016))) + ((i73 & (-593494016)) << 1);
                int i75 = ~((i67 & (-515384531)) | ((-515384531) ^ i67));
                int i76 = ((-1078378541) & i75) | ((~i75) & 1078378540);
                int i77 = i75 & 1078378540;
                int i78 = (i77 & i76) | (i76 ^ i77);
                int i79 = i78 & 137363456;
                int i80 = -(-((((i78 | 137363456) & (~i79)) | i79) * 262));
                int i81 = ((~i80) & i74) | ((~i74) & i80);
                int i82 = (i80 & i74) << 1;
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                C1231l1 c1231l1 = p3Var4.echo;
                if (i64 <= i83) {
                    return c1231l1;
                }
                throw null;
            }
            p3 p3Var5 = (p3) objArr[0];
            int i84 = golf;
            int i85 = i84 & 55;
            int i86 = (i84 ^ 55) | i85;
            foxtrot = (((i85 | i86) << 1) - (i85 ^ i86)) % 128;
            ah ahVar = p3Var5.bravo;
            int i87 = (-2) - ((i84 + 34) ^ (-1));
            foxtrot = i87 % 128;
            if (i87 % 2 == 0) {
                return ahVar;
            }
            throw null;
        }
        p3 p3Var6 = (p3) objArr[0];
        Long l11 = (Long) objArr[1];
        Integer num = (Integer) objArr[2];
        Map map = (Map) objArr[3];
        String str = (String) objArr[4];
        int i88 = foxtrot;
        int i89 = (((i88 | 84) << 1) - (i88 ^ 84)) - 1;
        golf = i89 % 128;
        if (i89 % 2 == 0) {
            bp.Companion companion = bp.INSTANCE;
            int i90 = 67 / 0;
        } else {
            bp.Companion companion2 = bp.INSTANCE;
        }
        if (l11 != null && valueOf != null) {
            l10 = Long.valueOf(valueOf.longValue() + l11.longValue());
        } else {
            l10 = null;
        }
        bp bpVar = new bp(l11, l10, null);
        C1252q2 c1252q2 = new C1252q2(null, null, num, 0, l11, null, null, null, null, null, 1003, null);
        Long pivotYN169043 = bpVar.setPivotYN16904();
        if (pivotYN169043 != null) {
            int i91 = golf;
            int i92 = i91 & 21;
            int i93 = (i92 - (~(-(-((i91 ^ 21) | i92))))) - 1;
            foxtrot = i93 % 128;
            if (i93 % 2 == 0) {
                j5 = pivotYN169043.longValue();
            } else {
                throw null;
            }
        } else {
            int i94 = golf;
            int i95 = i94 & 9;
            foxtrot = ao.ad.victor((i94 | 9) & (~i95), ~(i95 << 1), 1, 128);
            j5 = Long.MAX_VALUE;
        }
        try {
            Object[] objArr2 = {Long.valueOf(j5), Boolean.TRUE, Boolean.FALSE, new o3(p3Var6, map, str, bpVar, c1252q2)};
            Object echo = am.echo(-240546473);
            if (echo == null) {
                char offsetAfter = (char) (40619 - TextUtils.getOffsetAfter("", 0));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 52;
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 222;
                Class cls = Boolean.TYPE;
                echo = am.charlie(offsetAfter, maximumDrawingCacheSize, edgeSlop, -128301839, "D8871", new Class[]{Long.TYPE, cls, cls, Function1.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr2);
            if (!(n14263a23323 instanceof component8)) {
                if (n14263a23323 instanceof setTopP6481) {
                    golf = (foxtrot + 73) % 128;
                    Object obj2 = ((setTopP6481) n14263a23323).vD14832N6715;
                    if (((Class) am.bravo((char) TextUtils.getOffsetAfter("", 0), 69 - View.combineMeasuredStates(0, 0), 445 - TextUtils.lastIndexOf("", '0', 0, 0))).isInstance(obj2)) {
                        unknownError = new ClientTimeout();
                        int i96 = foxtrot;
                        golf = ((i96 & 61) + (i96 | 61)) % 128;
                    } else if (((Class) am.bravo((char) (9718 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 69, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 515)).isInstance(obj2)) {
                        Object echo2 = am.echo(1304031792);
                        if (echo2 == null) {
                            echo2 = am.charlie((char) (15809 - ((byte) KeyEvent.getModifierMetaStateMask())), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52, 394 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1145715606, "D8871", new Class[0]);
                        }
                        unknownError = new UnknownError(null, ((Method) echo2).invoke(obj2, null).toString(), 1, null);
                        int i97 = golf;
                        int i98 = (i97 & (-114)) | ((~i97) & 113);
                        int i99 = -(-((i97 & 113) << 1));
                        foxtrot = ((i98 & i99) + (i99 | i98)) % 128;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    n14263a23323 = new setTopP6481(unknownError);
                    int i100 = golf;
                    foxtrot = (((i100 ^ 84) + ((i100 & 84) << 1)) - 1) % 128;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int i101 = (golf + 23) % 128;
                foxtrot = i101;
                int i102 = i101 ^ 87;
                golf = ((((i101 & 87) | i102) << 1) - i102) % 128;
            }
            N14263A23323 D8871 = bk.D8871(n14263a23323);
            c1252q2.juliet = I0.echo();
            Object[] objArr3 = {new k3(D8871, c1252q2, p3Var6)};
            Object echo3 = am.echo(438988851);
            if (echo3 == null) {
                echo3 = am.charlie((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 53 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 583 - Process.getGidForName(""), 333035925, "component9", new Class[]{Function0.class});
            }
            ((Method) echo3).invoke(null, objArr3);
            int i103 = golf;
            int i104 = i103 & 25;
            int i105 = ((i103 ^ 25) | i104) << 1;
            int i106 = -((i103 | 25) & (~i104));
            int i107 = (i105 & i106) + (i106 | i105);
            foxtrot = i107 % 128;
            if (i107 % 2 != 0) {
                int i108 = 58 / 0;
            }
            return D8871;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
