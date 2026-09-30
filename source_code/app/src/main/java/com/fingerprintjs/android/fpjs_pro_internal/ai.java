package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro.raw_signal_providers.file_timestamps.FileTimestamps;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import com.fingerprintjs.android.fpjs_pro_internal.getRightG17489;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/ai;", "Lcom/fingerprintjs/android/fpjs_pro_internal/getEntries;", "com/fingerprintjs/android/fpjs_pro_internal/ah"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ai implements getEntries {
    public static int blue = 0;
    public static int bronze = 1;
    public final InterfaceC1198d0 alpha;
    public final M4296 amber;
    public final M2 azure;
    public final Lazy beige = LazyKt.lazy(new ag(this));
    public final Lazy black = LazyKt.lazy(new ad(this));
    public final I bravo;
    public final InterfaceC1242o0 charlie;
    public final String delta;
    public final C1200d2 echo;
    public final C1248p2 foxtrot;
    public final G2 golf;
    public final C1211g1 hotel;
    public final C1285z0 india;
    public final K juliet;
    public final C1277x0 kilo;
    public final a3 lima;
    public final Object mike;
    public final U1 november;
    public final d3 oscar;
    public final pC2922 papa;
    public final C1261t0 quebec;
    public final C1231l1 romeo;
    public final Object sierra;
    public final Object tango;
    public final C1214h0 uniform;
    public final C1206f0 victor;
    public final W1 whiskey;
    public final g3 xray;
    public final C1194c0 yankee;
    public final D zulu;

    public ai(InterfaceC1198d0 interfaceC1198d0, I i4, InterfaceC1242o0 interfaceC1242o0, String str, C1200d2 c1200d2, C1248p2 c1248p2, G2 g2, C1211g1 c1211g1, C1285z0 c1285z0, A a6, K k6, C1277x0 c1277x0, a3 a3Var, Object obj, U1 u12, d3 d3Var, pC2922 pc2922, C1261t0 c1261t0, C1231l1 c1231l1, Object obj2, Object obj3, C1214h0 c1214h0, C1206f0 c1206f0, W1 w12, g3 g3Var, C1194c0 c1194c0, D d4, M4296 m4296, M2 m22, DefaultConstructorMarker defaultConstructorMarker) {
        this.alpha = interfaceC1198d0;
        this.bravo = i4;
        this.charlie = interfaceC1242o0;
        this.delta = str;
        this.echo = c1200d2;
        this.foxtrot = c1248p2;
        this.golf = g2;
        this.hotel = c1211g1;
        this.india = c1285z0;
        this.juliet = k6;
        this.kilo = c1277x0;
        this.lima = a3Var;
        this.mike = obj;
        this.november = u12;
        this.oscar = d3Var;
        this.papa = pc2922;
        this.quebec = c1261t0;
        this.romeo = c1231l1;
        this.sierra = obj2;
        this.tango = obj3;
        this.uniform = c1214h0;
        this.victor = c1206f0;
        this.whiskey = w12;
        this.xray = g3Var;
        this.yankee = c1194c0;
        this.zulu = d4;
        this.amber = m4296;
        this.azure = m22;
    }

    public static /* synthetic */ C1272w bravo(Object[] objArr) {
        ai aiVar = (ai) objArr[0];
        int i4 = blue;
        int i5 = (i4 & 13) + (i4 | 13);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        C1200d2 c1200d2 = aiVar.echo;
        if (i10 != 0) {
            C1272w charlie = c1200d2.charlie();
            blue = (bronze + 71) % 128;
            return charlie;
        }
        c1200d2.charlie();
        throw null;
    }

    public static /* synthetic */ gF31878 charlie(Object[] objArr) {
        ai aiVar = (ai) objArr[0];
        int i4 = blue + 91;
        bronze = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                X1 x12 = X1.alpha;
                Object obj = aiVar.mike;
                Object echo = am.echo(-1555850540);
                if (echo == null) {
                    echo = am.charlie((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 52, 110 - TextUtils.getOffsetBefore("", 0), -1431284878, "component5", new Class[0]);
                }
                X1.alpha((N14263A23323) ((Method) echo).invoke(obj, null));
                throw null;
            }
            X1 x13 = X1.alpha;
            Object obj2 = aiVar.mike;
            Object echo2 = am.echo(-1555850540);
            if (echo2 == null) {
                echo2 = am.charlie((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 52, 110 - ExpandableListView.getPackedPositionType(0L), -1431284878, "component5", new Class[0]);
            }
            return X1.alpha((N14263A23323) ((Method) echo2).invoke(obj2, null));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x020c, code lost:
    
        if ((r0 instanceof com.fingerprintjs.android.fpjs_pro_internal.component8) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x03b8, code lost:
    
        if ((r0 instanceof com.fingerprintjs.android.fpjs_pro_internal.setTopP6481) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03ba, code lost:
    
        r0 = (com.fingerprintjs.android.fpjs_pro_internal.copy$D8871) ((com.fingerprintjs.android.fpjs_pro_internal.setTopP6481) r0).vD14832N6715;
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(com.fingerprintjs.android.fpjs_pro_internal.X2.bravo, null, com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.foxtrot);
        r1 = com.fingerprintjs.android.fpjs_pro_internal.X2.charlie;
        com.fingerprintjs.android.fpjs_pro_internal.X2.delta = (((r1 | 109) << 1) - (r1 ^ 109)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03eb, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0219, code lost:
    
        r0 = (java.util.List) ((com.fingerprintjs.android.fpjs_pro_internal.component8) r0).component9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0223, code lost:
    
        if (r0.isEmpty() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0225, code lost:
    
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(com.fingerprintjs.android.fpjs_pro_internal.X2.bravo, null, com.fingerprintjs.android.fpjs_pro_internal.component2.b.C0008b.foxtrot);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0230, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.X2.bravo;
        r6 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.W.echo.vD14832N6715(), java.lang.Long.valueOf(((java.lang.Long) com.fingerprintjs.android.fpjs_pro_internal.I0.india(new java.lang.Object[]{r0}, 2010443767, com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), -2010443766, com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha())).longValue()));
        r7 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.C1011b0.echo.vD14832N6715(), java.lang.Integer.valueOf(((java.lang.Integer) com.fingerprintjs.android.fpjs_pro_internal.I0.india(new java.lang.Object[]{r0}, -791351315, com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha(), 791351315, com.fingerprintjs.android.fpjs_pro_internal.C10192.alpha())).intValue()));
        r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10);
        r4 = new java.util.ArrayList(r5);
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ad, code lost:
    
        if (r0.hasNext() == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02af, code lost:
    
        r5 = com.fingerprintjs.android.fpjs_pro_internal.X2.delta;
        com.fingerprintjs.android.fpjs_pro_internal.X2.charlie = (((r5 | 59) << r8) - (r5 ^ 59)) % 128;
        r5 = (com.fingerprintjs.android.fpjs_pro_internal.C1252q2) r0.next();
        r15 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.D1.echo.vD14832N6715(), r5.alpha);
        r10 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.S.echo.vD14832N6715(), r5.bravo);
        r14 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.F1.echo.vD14832N6715(), java.lang.Integer.valueOf(r5.delta));
        r33 = r8;
        r8 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.T4.echo.vD14832N6715(), r5.charlie);
        r34 = r9;
        r9 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.W1.echo.vD14832N6715(), r5.echo);
        r11 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.N1.echo.vD14832N6715(), r5.foxtrot);
        r20 = r2;
        r2 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.G1.echo.vD14832N6715(), r5.golf);
        r1 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.C1131s1.echo.vD14832N6715(), r5.hotel);
        r28 = r0;
        r0 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.C1103o1.echo.vD14832N6715(), r5.india);
        r13 = new kotlin.Pair(com.fingerprintjs.android.fpjs_pro_internal.P28427.Y.echo.vD14832N6715(), r5.juliet);
        r5 = new kotlin.Pair[10];
        r5[r34 ? 1 : 0] = r15;
        r5[r33] = r10;
        r5[2] = r14;
        r5[3] = r8;
        r5[4] = r9;
        r5[5] = r11;
        r5[6] = r2;
        r5[7] = r1;
        r5[8] = r0;
        r5[9] = r13;
        r4.add(kotlin.collections.y.sierra(r5));
        r0 = r28;
        r8 = r33;
        r9 = r34 ? 1 : 0;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0382, code lost:
    
        r20 = r2;
        r0 = new kotlin.Pair("el", r4);
        r2 = new kotlin.Pair[3];
        r2[r9 ? 1 : 0] = r6;
        r2[r8] = r7;
        r2[2] = r0;
        r1 = new com.fingerprintjs.android.fpjs_pro_internal.C1282y1(r3, kotlin.collections.y.sierra(r2));
        r0 = com.fingerprintjs.android.fpjs_pro_internal.X2.charlie;
        r2 = (r0 & 87) + (r0 | 87);
        com.fingerprintjs.android.fpjs_pro_internal.X2.delta = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x03b1, code lost:
    
        if ((r2 % 2) == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x03b3, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x03b5, code lost:
    
        throw r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0217, code lost:
    
        if ((r0 instanceof com.fingerprintjs.android.fpjs_pro_internal.component8) != false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object delta(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Object obj;
        Object c1278x1;
        component2.b bVar;
        Object c1282y1;
        Object invoke;
        Object c1278x12;
        Throwable th;
        Object obj2;
        Object obj3;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        Class cls3 = Long.TYPE;
        int i14 = (~((~i11) | i12)) | (~(i11 | i5));
        int i15 = ~i12;
        int i16 = (~(i15 | i5)) | i11;
        int i17 = (~(i5 | i12)) | (~(i15 | (~i5))) | i11;
        int i18 = ((-1946157056) * i10) + (1335885824 * i4) + ((-1423441920) * i13) + ((-723770934) * i17) + ((-1447541868) * i16) + (723770934 * i14) + (24099949 * i11) + (((-699670985) * i12) - 818937856);
        int papa = AbstractC2327c.papa(i10, -1840598144, ((-737137436) * i4) + i12 + i11 + i13);
        Throwable th2 = null;
        int i19 = 1;
        boolean z2 = false;
        switch (AbstractC2327c.quebec(papa, -447283200, (i10 * 1320834432) + ((-1820396076) * i4) + (1252407325 * i13) + (i17 * 994) + (i16 * 1988) + (i14 * (-994)) + (i11 * 1252405337) + (i12 * 1252406331) + 1981669868, 1511325696, ((-1593638912) * papa) + i18)) {
            case 1:
                ai aiVar = (ai) objArr[0];
                int i20 = bronze;
                blue = ((i20 ^ 3) + ((i20 & 3) << 1)) % 128;
                I2 i22 = I2.alpha;
                gF31878 alpha = I2.alpha((N14263A23323) C1277x0.charlie(new Object[]{aiVar.kilo}, -205892792, C1252q2.alpha(), C1252q2.alpha(), C1252q2.alpha(), 205892793, C1252q2.alpha()));
                bronze = (blue + 77) % 128;
                return alpha;
            case 2:
                return foxtrot(objArr);
            case 3:
                return golf(objArr);
            case 4:
                return bravo(objArr);
            case 5:
                ai aiVar2 = (ai) objArr[0];
                blue = (bronze + 13) % 128;
                C1249q delta = aiVar2.echo.delta();
                int i21 = bronze;
                blue = ((i21 & 75) + (i21 | 75)) % 128;
                return delta;
            case 6:
                N14263A23323 bravo = ((ai) objArr[0]).hotel.bravo(P28427.E0.echo.vD14832N6715());
                if (bravo instanceof component8) {
                    FileTimestamps fileTimestamps = (FileTimestamps) ((component8) bravo).component9;
                    bravo = new component8(new Triple(Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), 1844385793, C1224j2.alpha(), C1224j2.alpha(), -1844385793)).longValue()), Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), -1003895096, C1224j2.alpha(), C1224j2.alpha(), 1003895097)).longValue()), Long.valueOf(fileTimestamps.alpha())));
                } else if (!(bravo instanceof setTopP6481)) {
                    throw new NoWhenBranchMatchedException();
                }
                Triple triple = (Triple) component13.alpha(bravo);
                I1 i110 = I1.alpha;
                gF31878 alpha2 = I1.alpha(triple != null ? (Long) triple.getFirst() : null);
                C1204e2 c1204e2 = C1204e2.alpha;
                Long l10 = triple != null ? (Long) triple.getSecond() : null;
                C1204e2.delta = (C1204e2.charlie + 15) % 128;
                String str = C1204e2.bravo;
                if (l10 == null) {
                    obj = new C1278x1(str, null, component2.b.a.foxtrot);
                } else {
                    C1282y1 c1282y12 = new C1282y1(str, l10.toString());
                    int i23 = C1204e2.delta + 31;
                    C1204e2.charlie = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                    obj = c1282y12;
                }
                C1189b c1189b = C1189b.alpha;
                return new Triple(alpha2, obj, C1189b.alpha(triple != null ? (Long) triple.getThird() : null));
            case 7:
                return charlie(objArr);
            case 8:
                return echo(objArr);
            case 9:
                ai aiVar3 = (ai) objArr[0];
                bronze = (blue + 83) % 128;
                C1271v2 c1271v2 = C1271v2.alpha;
                N14263A23323 alpha3 = aiVar3.yankee.alpha();
                boolean z10 = alpha3 instanceof component8;
                String str2 = C1271v2.bravo;
                if (z10) {
                    c1278x1 = new C1282y1(str2, (String) ((component8) alpha3).component9);
                } else if (alpha3 instanceof setTopP6481) {
                    Throwable th3 = (Throwable) ((setTopP6481) alpha3).vD14832N6715;
                    if (!(th3 instanceof bd) && !(th3.getCause() instanceof bd)) {
                        bVar = component2.b.a.foxtrot;
                    } else {
                        bVar = component2.b.C0008b.foxtrot;
                    }
                    c1278x1 = new C1278x1(str2, null, bVar);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                bronze = (blue + 91) % 128;
                return c1278x1;
            case 10:
                ai aiVar4 = (ai) objArr[0];
                ca caVar = (ca) objArr[1];
                int i24 = bronze;
                blue = ((i24 ^ 49) + ((i24 & 49) << 1)) % 128;
                K1 k12 = K1.alpha;
                gF31878 alpha4 = K1.alpha(caVar, aiVar4.golf);
                int i25 = bronze;
                blue = ((i25 & 51) + (i25 | 51)) % 128;
                return alpha4;
            case 11:
                ai aiVar5 = (ai) objArr[0];
                int i26 = blue;
                bronze = ((i26 & 85) + (i26 | 85)) % 128;
                W2 w22 = W2.alpha;
                Object obj4 = aiVar5.tango;
                try {
                    Object D8871 = uH18377.D8871(-2130931080);
                    if (D8871 == null) {
                        D8871 = uH18377.setPivotYN16904(Drawable.resolveOpacity(0, 0) + 53, TextUtils.indexOf((CharSequence) "", '0', 0) + 588, (char) View.resolveSizeAndState(0, 0, 0), 1598501037, false, "D8871", new Class[0]);
                    }
                    gF31878 alpha5 = W2.alpha((N14263A23323) ((Method) D8871).invoke(obj4, null));
                    int i27 = blue;
                    bronze = (((i27 | 43) << 1) - (i27 ^ 43)) % 128;
                    return alpha5;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            case 12:
                ai aiVar6 = (ai) objArr[0];
                int i28 = blue;
                bronze = (((i28 | 9) << 1) - (i28 ^ 9)) % 128;
                O0 o02 = aiVar6.echo.delta;
                o02.getClass();
                try {
                    Object[] objArr2 = {0L, r2, r2, new N0(o02), 7, null};
                    Boolean bool = Boolean.FALSE;
                    Object echo = am.echo(373658851);
                    if (echo == null) {
                        echo = am.charlie((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 52 - (ViewConfiguration.getScrollBarSize() >> 8), 904 - (ViewConfiguration.getWindowTouchSlop() >> 8), 532045125, "D8871", new Class[]{cls3, cls2, cls2, Function0.class, cls, Object.class});
                    }
                    Object invoke2 = ((Method) echo).invoke(null, objArr2);
                    List emptyList = CollectionsKt.emptyList();
                    Result.Companion companion = Result.INSTANCE;
                    if (invoke2 instanceof kotlin.k) {
                        int i29 = O0.charlie;
                        int i30 = (i29 ^ 125) + ((i29 & 125) << 1);
                        O0.bravo = i30 % 128;
                        if (i30 % 2 != 0) {
                            int i31 = 12 / 0;
                        }
                        invoke2 = emptyList;
                    } else {
                        int i32 = O0.bravo;
                        O0.charlie = ((i32 ^ 97) + ((i32 & 97) << 1)) % 128;
                    }
                    O0.bravo = (O0.charlie + 17) % 128;
                    C1268v c1268v = new C1268v((List) invoke2);
                    int i33 = C1200d2.india;
                    C1200d2.juliet = (((i33 | 83) << 1) - (i33 ^ 83)) % 128;
                    int i34 = bronze;
                    int i35 = ((i34 | 89) << 1) - (i34 ^ 89);
                    blue = i35 % 128;
                    if (i35 % 2 == 0) {
                        return c1268v;
                    }
                    throw null;
                } catch (Throwable th5) {
                    Throwable cause2 = th5.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th5;
                }
            case 13:
                ai aiVar7 = (ai) objArr[0];
                int i36 = blue;
                bronze = (((i36 | 89) << 1) - (i36 ^ 89)) % 128;
                C1255r2 c1255r2 = C1255r2.alpha;
                gF31878 alpha6 = C1255r2.alpha(aiVar7.xray.delta());
                int i37 = blue;
                bronze = ((i37 ^ 67) + ((i37 & 67) << 1)) % 128;
                return alpha6;
            case 14:
                ai aiVar8 = (ai) objArr[0];
                int i38 = blue;
                int i39 = ((i38 | 11) << 1) - (i38 ^ 11);
                bronze = i39 % 128;
                int i40 = i39 % 2;
                H2 h22 = H2.alpha;
                C1261t0 c1261t0 = aiVar8.quebec;
                if (i40 != 0) {
                    return H2.alpha((N14263A23323) C1261t0.bravo(new Object[]{c1261t0}, -1091218676, com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), 1091218676));
                }
                H2.alpha((N14263A23323) C1261t0.bravo(new Object[]{c1261t0}, -1091218676, com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), com.fingerprintjs.android.fpjs_pro.t.bravo(), 1091218676));
                throw null;
            case 15:
                ai aiVar9 = (ai) objArr[0];
                int i41 = bronze + 51;
                blue = i41 % 128;
                if (i41 % 2 == 0) {
                    b3 b3Var = b3.alpha;
                    return b3.alpha(aiVar9.amber.echo());
                }
                b3 b3Var2 = b3.alpha;
                int i42 = 51 / 0;
                return b3.alpha(aiVar9.amber.echo());
            case 16:
                ai aiVar10 = (ai) objArr[0];
                int i43 = bronze;
                int i44 = (i43 & 51) + (i43 | 51);
                blue = i44 % 128;
                try {
                    if (i44 % 2 != 0) {
                        C1195c1 c1195c1 = C1195c1.alpha;
                        Object obj5 = aiVar10.sierra;
                        Object echo2 = am.echo(-1905908102);
                        if (echo2 == null) {
                            echo2 = am.charlie((char) KeyEvent.normalizeMetaState(0), 52 - KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L), -2020216868, "component5", new Class[0]);
                        }
                        new C1282y1(C1195c1.bravo, (List) ((Method) echo2).invoke(obj5, null));
                        throw null;
                    }
                    C1195c1 c1195c12 = C1195c1.alpha;
                    Object obj6 = aiVar10.sierra;
                    Object echo3 = am.echo(-1905908102);
                    if (echo3 == null) {
                        echo3 = am.charlie((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 52, (Process.getThreadPriority(0) + 20) >> 6, -2020216868, "component5", new Class[0]);
                    }
                    return new C1282y1(C1195c1.bravo, (List) ((Method) echo3).invoke(obj6, null));
                } catch (Throwable th6) {
                    Throwable cause3 = th6.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th6;
                }
            case 17:
                ai aiVar11 = (ai) objArr[0];
                int i45 = bronze + 51;
                blue = i45 % 128;
                int i46 = i45 % 2;
                C1200d2 c1200d2 = aiVar11.echo;
                if (i46 == 0) {
                    return (r) C1200d2.echo(new Object[]{c1200d2}, J1.bravo(), J1.bravo(), J1.bravo(), -675739878, 675739878, J1.bravo());
                }
                throw null;
            case 18:
                ai aiVar12 = (ai) objArr[0];
                int i47 = blue + 95;
                bronze = i47 % 128;
                if (i47 % 2 == 0) {
                    C1185a c1185a = C1185a.alpha;
                    Boolean alpha7 = aiVar12.alpha().alpha();
                    String str3 = C1185a.bravo;
                    if (alpha7 == null) {
                        c1282y1 = new C1278x1(str3, null, component2.b.a.foxtrot);
                    } else {
                        c1282y1 = new C1282y1(str3, alpha7);
                    }
                    int i48 = 22 / 0;
                } else {
                    C1185a c1185a2 = C1185a.alpha;
                    Boolean alpha8 = aiVar12.alpha().alpha();
                    String str4 = C1185a.bravo;
                    if (alpha8 == null) {
                        c1282y1 = new C1278x1(str4, null, component2.b.a.foxtrot);
                    } else {
                        c1282y1 = new C1282y1(str4, alpha8);
                    }
                }
                int i49 = blue + 85;
                bronze = i49 % 128;
                if (i49 % 2 == 0) {
                    int i50 = 86 / 0;
                }
                return c1282y1;
            case 19:
                ai aiVar13 = (ai) objArr[0];
                int i51 = blue;
                int i52 = (i51 ^ 113) + ((i51 & 113) << 1);
                bronze = i52 % 128;
                int i53 = i52 % 2;
                C1200d2 c1200d22 = aiVar13.echo;
                if (i53 == 0) {
                    c1200d22.foxtrot();
                    throw null;
                }
                C1245p foxtrot = c1200d22.foxtrot();
                bronze = (blue + 33) % 128;
                return foxtrot;
            case 20:
                ai aiVar14 = (ai) objArr[0];
                int i54 = blue;
                int i55 = (i54 & 115) + (i54 | 115);
                bronze = i55 % 128;
                int i56 = i55 % 2;
                C1247p1 c1247p1 = C1247p1.alpha;
                gF31878 alpha9 = C1247p1.alpha(aiVar14.quebec.alpha());
                if (i56 == 0) {
                    int i57 = 5 / 0;
                }
                return alpha9;
            case 21:
                ai aiVar15 = (ai) objArr[0];
                int i58 = bronze;
                blue = (((i58 | 13) << 1) - (i58 ^ 13)) % 128;
                C1256s c1256s = (C1256s) C1200d2.echo(new Object[]{aiVar15.echo}, J1.bravo(), J1.bravo(), J1.bravo(), -549706858, 549706859, J1.bravo());
                bronze = (blue + 21) % 128;
                return c1256s;
            case 22:
                ai aiVar16 = (ai) objArr[0];
                bronze = (blue + 81) % 128;
                ((sB6055) aiVar16.juliet).getClass();
                int i59 = sB6055.charlie + 67;
                sB6055.delta = i59 % 128;
                try {
                    if (i59 % 2 == 0) {
                        Object[] objArr3 = {1L, Boolean.TRUE, Boolean.FALSE, E2.alpha, 73, null};
                        Object echo4 = am.echo(-1815327613);
                        if (echo4 == null) {
                            echo4 = am.charlie((char) (40620 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 222 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1707113179, "setPivotYN16904", new Class[]{cls3, cls2, cls2, Function1.class, cls, Object.class});
                        }
                        invoke = ((Method) echo4).invoke(null, objArr3);
                    } else {
                        Object[] objArr4 = {0L, r0, r0, E2.alpha, 7, null};
                        Boolean bool2 = Boolean.FALSE;
                        Object echo5 = am.echo(-1815327613);
                        if (echo5 == null) {
                            echo5 = am.charlie((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40620), TextUtils.indexOf((CharSequence) "", '0') + 53, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 222, -1707113179, "setPivotYN16904", new Class[]{cls3, cls2, cls2, Function1.class, cls, Object.class});
                        }
                        invoke = ((Method) echo5).invoke(null, objArr4);
                    }
                    String str5 = (String) component13.vD14832N6715((N14263A23323) invoke, "");
                    sB6055.delta = (sB6055.charlie + 107) % 128;
                    String str6 = M.bravo;
                    if (str5 != null && str5.length() != 0) {
                        c1278x12 = new C1282y1(str6, str5);
                        th = null;
                    } else {
                        th = null;
                        c1278x12 = new C1278x1(str6, null, component2.b.a.foxtrot);
                    }
                    int i60 = blue + 5;
                    bronze = i60 % 128;
                    if (i60 % 2 != 0) {
                        return c1278x12;
                    }
                    throw th;
                } catch (Throwable th7) {
                    Throwable cause4 = th7.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th7;
                }
            case 23:
                ai aiVar17 = (ai) objArr[0];
                int i61 = blue + 67;
                bronze = i61 % 128;
                int i62 = i61 % 2;
                String bravo2 = aiVar17.foxtrot.bravo();
                if (i62 == 0) {
                    int i63 = 96 / 0;
                }
                return bravo2;
            case 24:
                ai aiVar18 = (ai) objArr[0];
                int i64 = blue;
                bronze = (((i64 | 61) << 1) - (i64 ^ 61)) % 128;
                X2 x22 = X2.alpha;
                N14263A23323 bravo3 = aiVar18.romeo.bravo();
                int i65 = X2.charlie + 89;
                X2.delta = i65 % 128;
                if (i65 % 2 != 0) {
                    break;
                } else {
                    int i66 = 50 / 0;
                    break;
                }
                int i67 = bronze;
                blue = ((i67 & 3) + (i67 | 3)) % 128;
                return obj2;
            case 25:
                ai aiVar19 = (ai) objArr[0];
                int i68 = bronze;
                blue = ((i68 ^ 119) + ((i68 & 119) << 1)) % 128;
                L1 l12 = L1.alpha;
                C1265u0 alpha10 = aiVar19.alpha();
                alpha10.getClass();
                int i69 = ((C1265u0.delta + 45) % 128) + 51;
                C1265u0.delta = i69 % 128;
                if (i69 % 2 != 0) {
                    Integer num = alpha10.alpha;
                    L1.delta = (L1.charlie + 113) % 128;
                    String str7 = L1.bravo;
                    if (num == null) {
                        obj3 = new C1278x1(str7, null, component2.b.a.foxtrot);
                        int i70 = L1.charlie + 47;
                        L1.delta = i70 % 128;
                        if (i70 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        C1282y1 c1282y13 = new C1282y1(str7, num);
                        int i71 = L1.delta;
                        L1.charlie = ((i71 ^ 105) + ((i71 & 105) << 1)) % 128;
                        obj3 = c1282y13;
                    }
                    blue = (bronze + 23) % 128;
                    return obj3;
                }
                throw null;
            case 26:
                ai aiVar20 = (ai) objArr[0];
                int i72 = bronze;
                int i73 = (i72 & 13) + (i72 | 13);
                blue = i73 % 128;
                int i74 = i73 % 2;
                V v4 = V.alpha;
                N14263A23323 charlie = ((sB6055) aiVar20.juliet).charlie();
                if (i74 != 0) {
                    V.alpha(charlie);
                    throw null;
                }
                gF31878 alpha11 = V.alpha(charlie);
                int i75 = blue;
                int i76 = (i75 ^ 53) + ((i75 & 53) << 1);
                bronze = i76 % 128;
                if (i76 % 2 != 0) {
                    return alpha11;
                }
                throw null;
            case 27:
                ai aiVar21 = (ai) objArr[0];
                int i77 = bronze;
                int i78 = (i77 & 37) + (i77 | 37);
                blue = i78 % 128;
                int i79 = i78 % 2;
                C1200d2 c1200d23 = aiVar21.echo;
                if (i79 != 0) {
                    c1200d23.bravo();
                    throw null;
                }
                C1241o bravo4 = c1200d23.bravo();
                int i80 = blue;
                bronze = ((i80 & 23) + (i80 | 23)) % 128;
                return bravo4;
            default:
                ai aiVar22 = (ai) objArr[0];
                int i81 = bronze;
                int i82 = (i81 ^ 61) + ((i81 & 61) << 1);
                blue = i82 % 128;
                int i83 = i82 % 2;
                C1200d2 c1200d24 = aiVar22.echo;
                Object[] objArr5 = new Object[1];
                if (i83 == 0) {
                    objArr5[0] = c1200d24;
                    return (aa) C1200d2.echo(objArr5, J1.bravo(), J1.bravo(), J1.bravo(), 1156918841, -1156918838, J1.bravo());
                }
                objArr5[0] = c1200d24;
                throw null;
        }
    }

    public static /* synthetic */ gF31878 echo(Object[] objArr) {
        ai aiVar = (ai) objArr[0];
        int i4 = ~System.identityHashCode(aiVar);
        int i5 = (757529893 & i4) | (i4 ^ 757529893);
        int i10 = ~((i5 & 1161239878) | (i5 ^ 1161239878));
        int i11 = -(-(((i10 & 86383876) | (86383876 ^ i10)) * (-828)));
        int i12 = (1522240639 & i11) + (i11 | 1522240639);
        int i13 = -(-(((i4 & 1832385895) | (1832385895 ^ i4)) * (-828)));
        int i14 = (((i12 | i13) << 1) - (i13 ^ i12)) - 1092066400;
        int identityHashCode = System.identityHashCode(aiVar);
        int i15 = ~identityHashCode;
        int i16 = ~(((-698515201) ^ i15) | ((-698515201) & i15));
        int i17 = ~(((-1423159599) ^ identityHashCode) | ((-1423159599) & identityHashCode));
        int i18 = -(-(((i16 & i17) | (i16 ^ i17)) * 217));
        int i19 = (25801264 ^ i18) + ((i18 & 25801264) << 1);
        int i20 = ~(identityHashCode | (-698515201));
        int i21 = ((i20 & 8532224) | (8532224 ^ i20)) * 217;
        int i22 = ((i19 | i21) << 1) - (i21 ^ i19);
        int i23 = ~(((-1423159599) ^ i15) | (i15 & (-1423159599)));
        int i24 = (i22 - (~(((i23 & 698515200) | (698515200 ^ i23)) * 217))) - 1;
        P1 p12 = P1.alpha;
        N14263A23323 bravo = aiVar.papa.bravo(aiVar.golf);
        if (i14 <= i24) {
            return P1.alpha(bravo);
        }
        P1.alpha(bravo);
        throw null;
    }

    public static /* synthetic */ ac foxtrot(Object[] objArr) {
        ai aiVar = (ai) objArr[0];
        int i4 = bronze + 3;
        blue = i4 % 128;
        int i5 = i4 % 2;
        C1200d2 c1200d2 = aiVar.echo;
        if (i5 == 0) {
            ac acVar = (ac) C1200d2.echo(new Object[]{c1200d2}, J1.bravo(), J1.bravo(), J1.bravo(), 815115359, -815115354, J1.bravo());
            int i10 = bronze;
            blue = ((i10 ^ 77) + ((i10 & 77) << 1)) % 128;
            return acVar;
        }
        throw null;
    }

    public static /* synthetic */ gF31878 golf(Object[] objArr) {
        gF31878 alpha;
        ai aiVar = (ai) objArr[0];
        int i4 = bronze + 99;
        blue = i4 % 128;
        if (i4 % 2 != 0) {
            C1207f1 c1207f1 = C1207f1.alpha;
            alpha = C1207f1.alpha(aiVar.kilo.bravo());
            int i5 = 41 / 0;
        } else {
            C1207f1 c1207f12 = C1207f1.alpha;
            alpha = C1207f1.alpha(aiVar.kilo.bravo());
        }
        blue = (bronze + 113) % 128;
        return alpha;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 A22588() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -523100007, 523100033, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 A29214() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -2095080691, 2095080700, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 C20232() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 1694791337, -1694791319, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final String D8871() {
        return (String) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -1772631696, 1772631719, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 E17257D21259() {
        gF31878 gf31878;
        bronze = (blue + 87) % 128;
        aw awVar = aw.alpha;
        Y1 hotel = hotel();
        int i4 = aw.charlie + 109;
        aw.delta = i4 % 128;
        if (i4 % 2 != 0) {
            boolean isEmpty = hotel.alpha().isEmpty();
            String str = aw.bravo;
            if (isEmpty) {
                gf31878 = new C1278x1(str, null, component2.b.a.foxtrot);
                int i5 = aw.delta;
                aw.charlie = ((i5 ^ 105) + ((i5 & 105) << 1)) % 128;
            } else {
                C1282y1 c1282y1 = new C1282y1(str, hotel.alpha());
                int i10 = aw.charlie + 51;
                aw.delta = i10 % 128;
                if (i10 % 2 != 0) {
                    gf31878 = c1282y1;
                } else {
                    throw null;
                }
            }
            int i11 = blue + 45;
            bronze = i11 % 128;
            if (i11 % 2 != 0) {
                return gf31878;
            }
            throw null;
        }
        hotel.alpha().isEmpty();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001f, code lost:
    
        r8 = (av.ah) r20.alpha;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        r8 = new java.lang.Object[]{0L, r9, r9, new com.fingerprintjs.android.fpjs_pro_internal.C1202e0(r8, r10), 7, null};
        r9 = java.lang.Boolean.FALSE;
        r12 = com.fingerprintjs.android.fpjs_pro_internal.am.echo(-1815327613);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r12 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r14 = (char) (40619 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
        r15 = 53 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        r9 = 222 - android.view.KeyEvent.getDeadChar(0, 0);
        r6 = java.lang.Boolean.TYPE;
        r12 = com.fingerprintjs.android.fpjs_pro_internal.am.charlie(r14, r15, r9, -1707113179, "setPivotYN16904", new java.lang.Class[]{java.lang.Long.TYPE, r6, r6, kotlin.jvm.functions.Function1.class, java.lang.Integer.TYPE, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r0 = (com.fingerprintjs.android.fpjs_pro_internal.C1186a0) com.fingerprintjs.android.fpjs_pro_internal.component13.vD14832N6715((com.fingerprintjs.android.fpjs_pro_internal.N14263A23323) ((java.lang.reflect.Method) r12).invoke(null, r8), new com.fingerprintjs.android.fpjs_pro_internal.C1186a0(null));
        r2 = com.fingerprintjs.android.fpjs_pro_internal.ai.bronze;
        com.fingerprintjs.android.fpjs_pro_internal.ai.blue = ((r2 ^ 69) + ((r2 & 69) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x001d, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r10 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b8, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.ai.blue = ((r8 ^ 107) + ((r8 & 107) << 1)) % 128;
        r0 = null;
     */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gF31878 ENTRIES() {
        C1186a0 c1186a0;
        String str;
        int i4 = bronze;
        int i5 = i4 + 77;
        blue = i5 % 128;
        int i10 = i5 % 2;
        String str2 = this.delta;
        if (i10 != 0) {
            int i11 = 99 / 0;
        }
        h3 h3Var = h3.alpha;
        if (c1186a0 != null) {
            int i12 = bronze + 73;
            blue = i12 % 128;
            if (i12 % 2 == 0) {
                str = c1186a0.alpha;
            } else {
                throw null;
            }
        } else {
            str = null;
        }
        int i13 = h3.delta;
        h3.charlie = (((i13 | 47) << 1) - (i13 ^ 47)) % 128;
        String str3 = h3.bravo;
        if (str != null) {
            h3.charlie = ((i13 & 109) + (i13 | 109)) % 128;
            if (str.length() != 0) {
                C1282y1 c1282y1 = new C1282y1(str3, str);
                int i14 = h3.charlie;
                h3.delta = ((i14 ^ 35) + ((i14 & 35) << 1)) % 128;
                return c1282y1;
            }
        }
        h3.delta = (h3.charlie + 33) % 128;
        return new C1278x1(str3, null, component2.b.a.foxtrot);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 F2572() {
        gF31878 c1278x1;
        int collectionSizeOrDefault;
        int i4 = blue;
        bronze = (((i4 | 79) << 1) - (i4 ^ 79)) % 128;
        U2 u22 = U2.alpha;
        this.uniform.getClass();
        N14263A23323<String, Throwable> component5 = bi.component5(kotlin.collections.ab.juliet(P28427.C1046g0.echo.vD14832N6715()));
        if (!(component5 instanceof component8)) {
            if (component5 instanceof setTopP6481) {
                int i5 = (C1214h0.alpha + 51) % 128;
                C1214h0.alpha = ((i5 ^ 105) + ((i5 & 105) << 1)) % 128;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if ((C1214h0.alpha + 115) % 2 != 0) {
            component5 = C1230l0.alpha((String) ((component8) component5).component9);
        } else {
            C1230l0.alpha((String) ((component8) component5).component9);
            throw null;
        }
        int i10 = U2.delta + 17;
        U2.charlie = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z2 = component5 instanceof component8;
            String str = U2.bravo;
            if (z2) {
                List list = (List) ((component8) component5).component9;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
                if (quebec < 16) {
                    quebec = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                Iterator it = list.iterator();
                int i11 = U2.delta;
                U2.charlie = ((i11 & 49) + (i11 | 49)) % 128;
                while (it.hasNext()) {
                    int i12 = U2.delta;
                    int i13 = (i12 & 123) + (i12 | 123);
                    U2.charlie = i13 % 128;
                    if (i13 % 2 == 0) {
                        C1234m0 c1234m0 = (C1234m0) it.next();
                        String alpha = c1234m0.alpha();
                        int i14 = C1234m0.delta;
                        C1234m0.charlie = ((i14 ^ 95) + ((i14 & 95) << 1)) % 128;
                        Pair pair = new Pair(alpha, c1234m0.bravo);
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    } else {
                        C1234m0 c1234m02 = (C1234m0) it.next();
                        String alpha2 = c1234m02.alpha();
                        int i15 = C1234m0.delta;
                        C1234m0.charlie = ((i15 ^ 95) + ((i15 & 95) << 1)) % 128;
                        Pair pair2 = new Pair(alpha2, c1234m02.bravo);
                        linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                        throw null;
                    }
                }
                c1278x1 = new C1282y1(str, linkedHashMap);
                int i16 = U2.charlie;
                int i17 = (i16 ^ 89) + ((i16 & 89) << 1);
                U2.delta = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
            } else if (component5 instanceof setTopP6481) {
                c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
                int i18 = U2.delta;
                U2.charlie = ((i18 & 19) + (i18 | 19)) % 128;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i19 = blue;
            int i20 = (i19 ^ 97) + ((i19 & 97) << 1);
            bronze = i20 % 128;
            if (i20 % 2 != 0) {
                return c1278x1;
            }
            throw null;
        }
        boolean z10 = component5 instanceof component8;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a5, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ba, code lost:
    
        r1 = new com.fingerprintjs.android.fpjs_pro_internal.C1282y1(r6, r4.toString());
        r4 = com.fingerprintjs.android.fpjs_pro_internal.aj.charlie;
        com.fingerprintjs.android.fpjs_pro_internal.aj.delta = ((r4 & 25) + (r4 | 25)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r1 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(r6, null, com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.foxtrot);
        com.fingerprintjs.android.fpjs_pro_internal.aj.charlie = (com.fingerprintjs.android.fpjs_pro_internal.aj.delta + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Triple INSTANCE() {
        Long l10;
        Object c1278x1;
        Long l11;
        Object c1282y1;
        Long l12;
        Object c1282y12;
        N14263A23323 bravo = this.hotel.bravo(P28427.G0.echo.vD14832N6715());
        if (bravo instanceof component8) {
            FileTimestamps fileTimestamps = (FileTimestamps) ((component8) bravo).component9;
            bravo = new component8(new Triple(Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), 1844385793, C1224j2.alpha(), C1224j2.alpha(), -1844385793)).longValue()), Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), -1003895096, C1224j2.alpha(), C1224j2.alpha(), 1003895097)).longValue()), Long.valueOf(fileTimestamps.alpha())));
        } else if (!(bravo instanceof setTopP6481)) {
            throw new NoWhenBranchMatchedException();
        }
        Triple triple = (Triple) component13.alpha(bravo);
        aj ajVar = aj.alpha;
        if (triple != null) {
            l10 = (Long) triple.getFirst();
        } else {
            l10 = null;
        }
        int i4 = aj.delta + 93;
        aj.charlie = i4 % 128;
        int i5 = i4 % 2;
        String str = aj.bravo;
        if (i5 != 0) {
            int i10 = 74 / 0;
        }
        C1236m2 c1236m2 = C1236m2.alpha;
        if (triple != null) {
            l11 = (Long) triple.getSecond();
        } else {
            l11 = null;
        }
        String str2 = C1236m2.bravo;
        if (l11 == null) {
            c1282y1 = new C1278x1(str2, null, component2.b.a.foxtrot);
        } else {
            c1282y1 = new C1282y1(str2, l11.toString());
        }
        N1 n1 = N1.alpha;
        if (triple != null) {
            l12 = (Long) triple.getThird();
        } else {
            l12 = null;
        }
        String str3 = N1.bravo;
        if (l12 == null) {
            c1282y12 = new C1278x1(str3, null, component2.b.a.foxtrot);
        } else {
            c1282y12 = new C1282y1(str3, l12.toString());
        }
        return new Triple(c1278x1, c1282y1, c1282y12);
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 K15285() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 1327105109, -1327105096, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 N11182() {
        gF31878 c1282y1;
        blue = (bronze + 33) % 128;
        C1187a1 c1187a1 = C1187a1.alpha;
        C1265u0 alpha = alpha();
        alpha.getClass();
        int i4 = C1265u0.delta;
        if (((i4 & 101) + (i4 | 101)) % 2 != 0) {
            int i5 = 19 / 0;
        }
        String str = C1187a1.bravo;
        Boolean bool = alpha.charlie;
        if (bool == null) {
            c1282y1 = new C1278x1(str, null, component2.b.a.foxtrot);
        } else {
            c1282y1 = new C1282y1(str, bool);
        }
        int i10 = blue;
        bronze = (((i10 | 33) << 1) - (i10 ^ 33)) % 128;
        return c1282y1;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final ac N14263A23323() {
        return (ac) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -245304333, 245304335, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final Triple W15084() {
        return (Triple) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -561683638, 561683644, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1264u Y16199() {
        C1264u c1264u;
        int i4 = blue;
        int i5 = (i4 & 83) + (i4 | 83);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        C1200d2 c1200d2 = this.echo;
        if (i10 == 0) {
            c1264u = (C1264u) C1200d2.echo(new Object[]{c1200d2}, J1.bravo(), J1.bravo(), J1.bravo(), 559708980, -559708978, J1.bravo());
            int i11 = 48 / 0;
        } else {
            c1264u = (C1264u) C1200d2.echo(new Object[]{c1200d2}, J1.bravo(), J1.bravo(), J1.bravo(), 559708980, -559708978, J1.bravo());
        }
        int i12 = bronze + 101;
        blue = i12 % 128;
        if (i12 % 2 == 0) {
            return c1264u;
        }
        throw null;
    }

    public final C1265u0 alpha() {
        int i4 = blue;
        bronze = (((i4 | 91) << 1) - (i4 ^ 91)) % 128;
        C1265u0 c1265u0 = (C1265u0) this.black.getValue();
        int i5 = blue + 81;
        bronze = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 65 / 0;
        }
        return c1265u0;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1241o cW27173() {
        return (C1241o) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 381707053, -381707026, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final r component10() {
        return (r) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -196505334, 196505351, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component10Y10845() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 972892246, -972892235, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component11() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 67622982, -67622974, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component12() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 1781649425, -1781649422, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final aa component13() {
        return (aa) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -908327487, 908327487, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component3H22396() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -835405115, 835405135, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component4S4936() {
        Object m206constructorimpl;
        int collectionSizeOrDefault;
        int i4 = bronze;
        blue = (((i4 | 105) << 1) - (i4 ^ 105)) % 128;
        ax axVar = ax.alpha;
        G2 g2 = this.golf;
        U1 u12 = this.november;
        u12.getClass();
        int i5 = U1.echo;
        U1.delta = (((i5 | 33) << 1) - (i5 ^ 33)) % 128;
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (g2.india) {
            ArrayList a6 = CollectionsKt.a((List) U1.bravo(new Object[]{u12}, H0.vD14832N6715(), H0.vD14832N6715(), 983517213, H0.vD14832N6715(), H0.vD14832N6715(), -983517212), CollectionsKt.orange(u12.alpha()));
            ArrayList arrayList = new ArrayList();
            Iterator it = a6.iterator();
            while (it.hasNext()) {
                int i10 = U1.echo;
                U1.delta = ((i10 ^ 117) + ((i10 & 117) << 1)) % 128;
                Object next = it.next();
                N n5 = (N) next;
                n5.getClass();
                int i11 = N.delta;
                N.charlie = (((i11 | 119) << 1) - (i11 ^ 119)) % 128;
                if (n5.bravo < 5000) {
                    int i12 = U1.echo;
                    int i13 = ((i12 | 67) << 1) - (i12 ^ 67);
                    int i14 = i13 % 128;
                    U1.delta = i14;
                    if (i13 % 2 == 0) {
                        U1.echo = (((i14 | 115) << 1) - (i14 ^ 115)) % 128;
                        arrayList.add(next);
                    }
                }
            }
            m206constructorimpl = Result.m206constructorimpl(arrayList);
            int i15 = U1.echo;
            U1.delta = ((i15 & 91) + (i15 | 91)) % 128;
            List<N> list = (List) component13.vD14832N6715(bk.component5(m206constructorimpl), CollectionsKt.emptyList());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (N n10 : list) {
                getRightG17489.e.component9();
                getRightG17489.e.component9();
                String vD14832N6715 = P28427.C1180z1.echo.vD14832N6715();
                n10.getClass();
                int i16 = N.charlie;
                int i17 = ((i16 | 77) << 1) - (i16 ^ 77);
                N.delta = i17 % 128;
                if (i17 % 2 != 0) {
                    Pair pair = new Pair(vD14832N6715, n10.alpha);
                    String vD14832N67152 = P28427.V4.echo.vD14832N6715();
                    int i18 = N.delta;
                    N.charlie = (((i18 | 119) << 1) - (i18 ^ 119)) % 128;
                    arrayList2.add(kotlin.collections.y.sierra(pair, new Pair(vD14832N67152, Long.valueOf(n10.bravo))));
                } else {
                    throw null;
                }
            }
            C1282y1 c1282y1 = new C1282y1(ax.bravo, arrayList2);
            int i19 = blue;
            int i20 = (i19 & 19) + (i19 | 19);
            bronze = i20 % 128;
            if (i20 % 2 != 0) {
                return c1282y1;
            }
            throw null;
        }
        throw new Exception();
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final String component5() {
        int i4 = bronze;
        blue = ((i4 & 19) + (i4 | 19)) % 128;
        C1248p2 c1248p2 = this.foxtrot;
        c1248p2.getClass();
        int i5 = C1248p2.delta + 83;
        C1248p2.echo = i5 % 128;
        int i10 = i5 % 2;
        C1244o2 c1244o2 = c1248p2.alpha;
        if (i10 != 0) {
            String alpha = c1244o2.alpha();
            if (alpha == null) {
                alpha = "";
            }
            int i11 = C1248p2.echo + 39;
            C1248p2.delta = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 21 / 0;
            }
            bronze = (blue + 99) % 128;
            return alpha;
        }
        c1244o2.alpha();
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1280y component8() {
        int i4 = blue;
        int i5 = ((i4 | 83) << 1) - (i4 ^ 83);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        C1200d2 c1200d2 = this.echo;
        if (i10 != 0) {
            C1280y golf = c1200d2.golf();
            int i11 = bronze;
            blue = ((i11 & 105) + (i11 | 105)) % 128;
            return golf;
        }
        c1200d2.golf();
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 component9(ca caVar) {
        return (gF31878) delta(new Object[]{this, caVar}, g3.alpha(), g3.alpha(), g3.alpha(), 1607140226, -1607140216, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 getContentSensitivity() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -2789603, 2789627, g3.alpha());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
    
        r4 = com.fingerprintjs.android.fpjs_pro_internal.C1191b1.charlie;
        com.fingerprintjs.android.fpjs_pro_internal.C1191b1.delta = (((r4 | 5) << 1) - (r4 ^ 5)) % 128;
        r2 = new com.fingerprintjs.android.fpjs_pro_internal.C1282y1(r5, r3);
        com.fingerprintjs.android.fpjs_pro_internal.C1191b1.delta = (com.fingerprintjs.android.fpjs_pro_internal.C1191b1.charlie + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (r4 == 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gF31878 getExplicitStyle() {
        int i4;
        int i5 = blue;
        bronze = ((i5 & 23) + (i5 | 23)) % 128;
        pC2922.vD14832N6715();
        pC2922.vD14832N6715();
        try {
            Object[] objArr = {0L, ay.alpha, 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 40619), (ViewConfiguration.getTapTimeout() >> 16) + 52, 222 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            String str = (String) component13.alpha((N14263A23323) ((Method) echo).invoke(null, objArr));
            int i10 = (C1191b1.charlie + 11) % 128;
            C1191b1.delta = i10;
            String str2 = C1191b1.bravo;
            if (str != null) {
                int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
                C1191b1.charlie = i11 % 128;
                int i12 = i11 % 2;
                int length = str.length();
                if (i12 != 0) {
                    int i13 = 82 / 0;
                }
                i4 = bronze + 37;
                blue = i4 % 128;
                if (i4 % 2 != 0) {
                    int i14 = 58 / 0;
                }
                return r2;
            }
            int i15 = C1191b1.delta;
            C1191b1.charlie = ((i15 & 107) + (i15 | 107)) % 128;
            gF31878 c1278x1 = new C1278x1(str2, null, component2.b.a.foxtrot);
            C1191b1.charlie = (C1191b1.delta + 15) % 128;
            i4 = bronze + 37;
            blue = i4 % 128;
            if (i4 % 2 != 0) {
            }
            return c1278x1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 getKeepScreenOn() {
        int i4 = blue;
        int i5 = (i4 ^ 125) + ((i4 & 125) << 1);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        C1206f0 c1206f0 = this.victor;
        if (i10 == 0) {
            G g2 = G.alpha;
            int i11 = 13 / 0;
            return G.alpha(c1206f0.echo());
        }
        G g5 = G.alpha;
        return G.alpha(c1206f0.echo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 getPivotYV11332() {
        gF31878 c1278x1;
        component2.b bVar;
        blue = (bronze + 57) % 128;
        O1 o12 = O1.alpha;
        W1 w12 = this.whiskey;
        w12.getClass();
        try {
            Object[] objArr = {0L, new V1(w12), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - Color.argb(0, 0, 0, 0)), 52 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 223 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            boolean z2 = n14263a23323 instanceof component8;
            String str = O1.bravo;
            if (z2) {
                c1278x1 = new C1282y1(str, (Map) ((component8) n14263a23323).component9);
            } else if (n14263a23323 instanceof setTopP6481) {
                Throwable th = (Throwable) ((setTopP6481) n14263a23323).vD14832N6715;
                if (!(th instanceof bd) && !(th.getCause() instanceof bd)) {
                    bVar = component2.b.a.foxtrot;
                } else {
                    bVar = component2.b.C0008b.foxtrot;
                }
                c1278x1 = new C1278x1(str, null, bVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            bronze = (blue + 45) % 128;
            return c1278x1;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 hY16199() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 2049128453, -2049128452, g3.alpha());
    }

    public final Y1 hotel() {
        int i4 = blue;
        int i5 = (i4 & 107) + (i4 | 107);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        Lazy lazy = this.beige;
        if (i10 != 0) {
            Y1 y12 = (Y1) lazy.getValue();
            int i11 = blue + 81;
            bronze = i11 % 128;
            if (i11 % 2 != 0) {
                return y12;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1245p iA15411() {
        return (C1245p) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -741013399, 741013418, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 jC6958() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 969100476, -969100454, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1256s kC4266() {
        return (C1256s) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -793045763, 793045784, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 kP9958() {
        int i4 = blue;
        int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
        bronze = i5 % 128;
        if (i5 % 2 != 0) {
            S2 s22 = S2.alpha;
            C1282y1 c1282y1 = new C1282y1(S2.bravo, ae.INSTANCE.D8871());
            int i10 = bronze + 1;
            blue = i10 % 128;
            if (i10 % 2 == 0) {
                return c1282y1;
            }
            throw null;
        }
        S2 s23 = S2.alpha;
        new C1282y1(S2.bravo, ae.INSTANCE.D8871());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final Pair lN31375() {
        Long l10;
        Object c1282y1;
        Long l11;
        Object obj;
        N14263A23323 bravo = this.hotel.bravo(P28427.H0.echo.vD14832N6715());
        if (bravo instanceof component8) {
            FileTimestamps fileTimestamps = (FileTimestamps) ((component8) bravo).component9;
            bravo = new component8(new Pair(Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), 1844385793, C1224j2.alpha(), C1224j2.alpha(), -1844385793)).longValue()), Long.valueOf(((Long) FileTimestamps.bravo(new Object[]{fileTimestamps}, C1224j2.alpha(), C1224j2.alpha(), -1003895096, C1224j2.alpha(), C1224j2.alpha(), 1003895097)).longValue())));
        } else if (!(bravo instanceof setTopP6481)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = (Pair) component13.alpha(bravo);
        O2 o22 = O2.alpha;
        if (pair != null) {
            l10 = (Long) pair.getFirst();
        } else {
            l10 = null;
        }
        String str = O2.bravo;
        if (l10 == null) {
            c1282y1 = new C1278x1(str, null, component2.b.a.foxtrot);
        } else {
            c1282y1 = new C1282y1(str, l10.toString());
        }
        Z0 z02 = Z0.alpha;
        if (pair != null) {
            l11 = (Long) pair.getSecond();
        } else {
            l11 = null;
        }
        int i4 = Z0.charlie;
        Z0.delta = ((i4 ^ 95) + ((i4 & 95) << 1)) % 128;
        String str2 = Z0.bravo;
        if (l11 == null) {
            obj = new C1278x1(str2, null, component2.b.a.foxtrot);
        } else {
            C1282y1 c1282y12 = new C1282y1(str2, l11.toString());
            int i5 = Z0.delta;
            Z0.charlie = ((i5 ^ 99) + ((i5 & 99) << 1)) % 128;
            obj = c1282y12;
        }
        return new Pair(c1282y1, obj);
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 mG25782() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 2048018515, -2048018499, g3.alpha());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.e3.charlie = (com.fingerprintjs.android.fpjs_pro_internal.e3.delta + 69) % 128;
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(r8, null, com.fingerprintjs.android.fpjs_pro_internal.component2.b.a.foxtrot);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e9, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.ai.blue;
        com.fingerprintjs.android.fpjs_pro_internal.ai.bronze = ((r1 ^ 27) + ((r1 & 27) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r5 = r5 + 3;
        com.fingerprintjs.android.fpjs_pro_internal.e3.delta = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if ((r5 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r3.length() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.e3.charlie;
        com.fingerprintjs.android.fpjs_pro_internal.e3.delta = (((r0 | 45) << 1) - (r0 ^ 45)) % 128;
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.C1282y1(r8, r3);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.e3.delta + 65;
        com.fingerprintjs.android.fpjs_pro_internal.e3.charlie = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if ((r2 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r3 != null) goto L17;
     */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gF31878 oD4563() {
        int i4 = blue;
        bronze = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
        C1285z0 c1285z0 = this.india;
        c1285z0.getClass();
        try {
            Object[] objArr = {0L, new C1281y0(c1285z0), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (KeyEvent.keyCodeFromString("") + 40619), (Process.myPid() >> 22) + 52, 222 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            int i5 = C1285z0.bravo;
            int i10 = ((i5 | 29) << 1) - (i5 ^ 29);
            C1285z0.charlie = i10 % 128;
            if (i10 % 2 != 0) {
                String str = (String) component13.alpha(n14263a23323);
                int i11 = e3.delta;
                int i12 = ((i11 | 49) << 1) - (i11 ^ 49);
                int i13 = i12 % 128;
                e3.charlie = i13;
                int i14 = i12 % 2;
                String str2 = e3.bravo;
                if (i14 != 0) {
                    int i15 = 57 / 0;
                }
            } else {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 openContextMenu() {
        int i4 = blue;
        int i5 = (i4 ^ 111) + ((i4 & 111) << 1);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        D d4 = this.zulu;
        if (i10 != 0) {
            H h4 = H.alpha;
            return H.alpha(d4.alpha());
        }
        H h10 = H.alpha;
        H.alpha(d4.alpha());
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1249q rP23717() {
        return (C1249q) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -1715720553, 1715720558, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1268v sG29839() {
        return (C1268v) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 816854120, -816854108, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setContentDescriptionR23122() {
        int i4 = bronze + 35;
        blue = i4 % 128;
        int i5 = i4 % 2;
        d3 d3Var = this.oscar;
        if (i5 == 0) {
            C1259s2 c1259s2 = C1259s2.alpha;
            C1282y1 alpha = C1259s2.alpha(d3Var.charlie());
            int i10 = blue;
            bronze = ((i10 & 31) + (i10 | 31)) % 128;
            return alpha;
        }
        C1259s2 c1259s22 = C1259s2.alpha;
        C1259s2.alpha(d3Var.charlie());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setContentSensitivity() {
        gF31878 gf31878;
        blue = (bronze + 101) % 128;
        ab abVar = ab.alpha;
        C1261t0 c1261t0 = this.quebec;
        c1261t0.getClass();
        try {
            Object[] objArr = {0L, new C1250q0(c1261t0), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - Drawable.resolveOpacity(0, 0)), 52 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 222 - ExpandableListView.getPackedPositionGroup(0L), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            int i4 = C1261t0.bravo;
            C1261t0.charlie = ((i4 & 29) + (i4 | 29)) % 128;
            int i5 = ab.charlie;
            ab.delta = ((i5 & 35) + (i5 | 35)) % 128;
            boolean z2 = n14263a23323 instanceof component8;
            String str = ab.bravo;
            if (z2) {
                gf31878 = new C1282y1(str, (String) ((component8) n14263a23323).component9);
            } else if (n14263a23323 instanceof setTopP6481) {
                C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
                int i10 = ab.delta;
                int i11 = (i10 ^ 13) + ((i10 & 13) << 1);
                ab.charlie = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 28 / 0;
                }
                gf31878 = c1278x1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = bronze;
            blue = (((i13 | 121) << 1) - (i13 ^ 121)) % 128;
            return gf31878;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setOnKeyListenerQ12088() {
        int i4 = bronze;
        int i5 = (i4 ^ 15) + ((i4 & 15) << 1);
        blue = i5 % 128;
        int i10 = i5 % 2;
        M2 m22 = this.azure;
        if (i10 == 0) {
            R2 r22 = R2.alpha;
            return R2.alpha(m22.charlie());
        }
        R2 r23 = R2.alpha;
        R2.alpha(m22.charlie());
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setOnLongClickListener() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -1243521419, 1243521433, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1260t setPivotYN16904() {
        int i4 = bronze;
        int i5 = (i4 & 17) + (i4 | 17);
        blue = i5 % 128;
        int i10 = i5 % 2;
        C1200d2 c1200d2 = this.echo;
        if (i10 == 0) {
            return (C1260t) C1200d2.echo(new Object[]{c1200d2}, J1.bravo(), J1.bravo(), J1.bravo(), 146726287, -146726283, J1.bravo());
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setScrollXT29053() {
        int i4 = blue;
        int i5 = (i4 & 5) + (i4 | 5);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        a3 a3Var = this.lima;
        if (i10 != 0) {
            J j5 = J.alpha;
            return J.alpha(a3Var.alpha());
        }
        J j6 = J.alpha;
        J.alpha(a3Var.alpha());
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1284z setTopP6481() {
        C1284z alpha;
        int i4 = bronze + 31;
        blue = i4 % 128;
        int i5 = i4 % 2;
        C1200d2 c1200d2 = this.echo;
        if (i5 != 0) {
            alpha = c1200d2.alpha();
            int i10 = 25 / 0;
        } else {
            alpha = c1200d2.alpha();
        }
        int i11 = bronze + 125;
        blue = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 56 / 0;
        }
        return alpha;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setTopP6481U32634() {
        gF31878 c1282y1;
        blue = (bronze + 83) % 128;
        C1215h1 c1215h1 = C1215h1.alpha;
        Y1 hotel = hotel();
        boolean isEmpty = hotel.bravo().isEmpty();
        String str = C1215h1.bravo;
        if (isEmpty) {
            c1282y1 = new C1278x1(str, null, component2.b.a.foxtrot);
        } else {
            c1282y1 = new C1282y1(str, hotel.bravo());
        }
        blue = (bronze + 59) % 128;
        return c1282y1;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 setYL16781T19680() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -126306188, 126306203, g3.alpha());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 tR25644() {
        gF31878 c1278x1;
        int i4 = blue;
        bronze = ((i4 ^ 29) + ((i4 & 29) << 1)) % 128;
        N2 n22 = N2.alpha;
        C1261t0 c1261t0 = this.quebec;
        c1261t0.getClass();
        try {
            Object[] objArr = {0L, new C1253r0(c1261t0), 1, null};
            Object echo = am.echo(853678683);
            if (echo == null) {
                echo = am.charlie((char) (40619 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 51 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo).invoke(null, objArr);
            C1261t0.charlie = (C1261t0.bravo + 99) % 128;
            int i5 = N2.charlie;
            N2.delta = ((i5 & 83) + (i5 | 83)) % 128;
            boolean z2 = n14263a23323 instanceof component8;
            String str = N2.bravo;
            if (z2) {
                c1278x1 = new C1282y1(str, (String) ((component8) n14263a23323).component9);
                int i10 = N2.delta;
                int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
                N2.charlie = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            } else if (n14263a23323 instanceof setTopP6481) {
                c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            blue = (bronze + 75) % 128;
            return c1278x1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final String vD14832N6715() {
        int i4 = blue;
        int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
        bronze = i5 % 128;
        int i10 = i5 % 2;
        C1248p2 c1248p2 = this.foxtrot;
        if (i10 != 0) {
            String alpha = c1248p2.alpha();
            int i11 = bronze;
            int i12 = (i11 & 39) + (i11 | 39);
            blue = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 23 / 0;
            }
            return alpha;
        }
        c1248p2.alpha();
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 xQ31420() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 730784270, -730784263, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final gF31878 yY18494() {
        return (gF31878) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), -21615416, 21615441, g3.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.getEntries
    public final C1272w component9() {
        return (C1272w) delta(new Object[]{this}, g3.alpha(), g3.alpha(), g3.alpha(), 1311183466, -1311183462, g3.alpha());
    }
}
