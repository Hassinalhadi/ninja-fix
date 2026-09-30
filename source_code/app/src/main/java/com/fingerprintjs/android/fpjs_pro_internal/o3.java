package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1283y2;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;", "Lcom/fingerprintjs/android/fpjs_pro/FingerprintJSProResponse;", "Lcom/fingerprintjs/android/fpjs_pro/Error;", "component5", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o3 extends Lambda implements Function1<SafeWithTimeoutProContext, N14263A23323<? extends FingerprintJSProResponse, ? extends Error>> {
    public static int white = 0;
    public static int yellow = 1;
    public final /* synthetic */ p3 alpha;
    public final /* synthetic */ Map purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ bp silver;
    public final /* synthetic */ C1252q2 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var, Map map, String str, bp bpVar, C1252q2 c1252q2) {
        super(1);
        this.alpha = p3Var;
        this.purple = map;
        this.red = str;
        this.silver = bpVar;
        this.teal = c1252q2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        G2 g2;
        char c3;
        char c4;
        G2 g22;
        G2 g23;
        Integer num;
        int i14 = ~i13;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = (~(i16 | i4)) | i15;
        int i18 = (~(i12 | i4)) | (~((~i4) | i14 | i16));
        int i19 = i16 | i14 | i4;
        int i20 = (1887436800 * i10) + (465567744 * i11) + (i5 * 465567744) + ((-1248335539) * i19) + (1248335539 * i18) + (i17 * 1248335539) + ((-782767794) * i13) + ((1713903284 * i4) - 1228931072);
        int papa = AbstractC2327c.papa(i10, -853422242, (1362283521 * i11) + i4 + i13 + i5);
        if (AbstractC2327c.quebec(papa, 791674880, ((-747618338) * i10) + (1172694977 * i11) + (722869185 * i5) + (i19 * 525) + (i18 * (-525)) + (i17 * (-525)) + (i13 * 722869710) + ((i4 * 722868660) - 41817558), 751828992, ((-1154482176) * papa) + i20) != 1) {
            o3 o3Var = (o3) objArr[0];
            SafeWithTimeoutProContext safeWithTimeoutProContext = (SafeWithTimeoutProContext) objArr[1];
            int i21 = yellow;
            int i22 = (i21 & (-80)) | ((~i21) & 79);
            int i23 = -(-((i21 & 79) << 1));
            white = ((i22 ^ i23) + ((i23 & i22) << 1)) % 128;
            final B b2 = (B) p3.alpha(new Object[]{o3Var.alpha}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), -393629498, 393629503);
            N14263A23323 alpha = ((az) b2.bravo).alpha(b2.echo.vD14832N6715());
            boolean z2 = alpha instanceof component8;
            G2 g24 = b2.delta;
            if (z2) {
                alpha = b2.charlie.alpha((byte[]) ((component8) alpha).component9, g24);
            } else if (!(alpha instanceof setTopP6481)) {
                throw new NoWhenBranchMatchedException();
            }
            if (alpha instanceof component8) {
                alpha = new component8(((C1199d1) ((component8) alpha).component9).alpha);
            } else if (!(alpha instanceof setTopP6481)) {
                throw new NoWhenBranchMatchedException();
            }
            if (alpha instanceof component8) {
                g2 = ((component8) alpha).component9;
            } else if (alpha instanceof setTopP6481) {
                E e = ((setTopP6481) alpha).vD14832N6715;
                g2 = g24;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            G2 g25 = g2;
            try {
                Object[] objArr2 = {new Function0<Unit>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.K5264$5
                    public static final long purple;
                    public static int red;
                    public static int silver;
                    public static int teal;
                    public static int white;
                    public static final byte[] yellow = null;

                    static {
                        hotel();
                        teal = 0;
                        white = 1;
                        red = 0;
                        silver = 1;
                        purple = -3146634995635898145L;
                    }

                    {
                        super(0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static String alpha(byte b4, int i24, short s3) {
                        int i25;
                        int i26;
                        int i27;
                        int i28 = (i24 * 4) + 4;
                        int i29 = 113 - s3;
                        int i30 = b4 * 3;
                        byte[] bArr = new byte[i30 + 1];
                        byte[] bArr2 = yellow;
                        if (bArr2 == null) {
                            int i31 = i29;
                            i27 = 0;
                            int i32 = i28;
                            int i33 = i32 + i31;
                            i25 = i28 + 1;
                            i26 = i33;
                            bArr[i27] = (byte) i26;
                            if (i27 == i30) {
                                return new String(bArr, 0);
                            }
                            i27++;
                            i31 = bArr2[i25];
                            int i34 = i25;
                            i32 = i26;
                            i28 = i34;
                            int i332 = i32 + i31;
                            i25 = i28 + 1;
                            i26 = i332;
                            bArr[i27] = (byte) i26;
                            if (i27 == i30) {
                            }
                        } else {
                            i25 = i28;
                            i26 = i29;
                            i27 = 0;
                            bArr[i27] = (byte) i26;
                            if (i27 == i30) {
                            }
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r6v3, types: [com.fingerprintjs.android.fpjs_pro_internal.cq, java.lang.Object] */
                    public static void delta(String str, int i24, Object[] objArr3) {
                        int i25;
                        char[] charArray = str.toCharArray();
                        white = (teal + 19) % 128;
                        char[] cArr = charArray;
                        ?? obj = new Object();
                        long j5 = purple;
                        long j6 = (-3215392606673943752L) ^ j5;
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i26 = 4;
                        int i27 = 0;
                        for (int i28 = 0; i28 < cArr.length; i28++) {
                            if (((j6 >>> i28) & 1) == i24 && i27 < 4) {
                                cArr2[i27] = cArr[i28];
                            } else if (i26 < length) {
                                cArr2[i26] = cArr[i28];
                                i26++;
                            } else {
                                cArr2[i27] = cArr[i28];
                            }
                            i27++;
                        }
                        int i29 = 2;
                        int i30 = 0;
                        obj.D8871 = 4;
                        while (true) {
                            int i31 = obj.D8871;
                            if (i31 < length) {
                                white = (teal + 125) % 128;
                                int i32 = i31 - 4;
                                obj.component9 = i32;
                                long j7 = cArr2[i31] ^ cArr2[i31 % 4];
                                long j10 = i32;
                                try {
                                    Object[] objArr4 = new Object[3];
                                    objArr4[i29] = Long.valueOf(j5);
                                    objArr4[1] = Long.valueOf(j10);
                                    objArr4[i30] = Long.valueOf(j7);
                                    Object D8871 = uH18377.D8871(-1822649204);
                                    if (D8871 == null) {
                                        int i33 = i30;
                                        int argb = 52 - Color.argb(i33, i33, i33, i33);
                                        int alpha2 = 2227 - Color.alpha(i33);
                                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 16953);
                                        byte b4 = (byte) i33;
                                        byte b6 = b4;
                                        String alpha3 = alpha(b6, b4, b6);
                                        Class[] clsArr = new Class[3];
                                        Class cls = Long.TYPE;
                                        clsArr[i33] = cls;
                                        clsArr[1] = cls;
                                        clsArr[i29] = cls;
                                        D8871 = uH18377.setPivotYN16904(argb, alpha2, packedPositionChild, 1290221145, false, alpha3, clsArr);
                                    }
                                    cArr2[i31] = ((Character) ((Method) D8871).invoke(null, objArr4)).charValue();
                                    Object[] objArr5 = new Object[i29];
                                    objArr5[1] = obj;
                                    objArr5[0] = obj;
                                    Object D88712 = uH18377.D8871(-773060065);
                                    if (D88712 == null) {
                                        int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 52;
                                        int longPressTimeout = 2951 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        char combineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                                        byte b10 = (byte) 0;
                                        byte b11 = b10;
                                        String alpha4 = alpha(b11, b10, (byte) (b11 + 1));
                                        i25 = 2;
                                        D88712 = uH18377.setPivotYN16904(combineMeasuredStates, longPressTimeout, combineMeasuredStates2, 240625866, false, alpha4, new Class[]{Object.class, Object.class});
                                    } else {
                                        i25 = 2;
                                    }
                                    ((Method) D88712).invoke(null, objArr5);
                                    i29 = i25;
                                    i30 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } else {
                                String str2 = new String(cArr2, 4, length - 4);
                                teal = (white + 45) % 128;
                                objArr3[0] = str2;
                                return;
                            }
                        }
                    }

                    public static void hotel() {
                        yellow = new byte[]{5, 60, 31, -109};
                    }

                    public static void setPivotYN16904(long j5, long j6) {
                        long j7 = j5 ^ (j6 << 32);
                        af.class.getField("alpha").get(null);
                        int i24 = (silver + 69) % 128;
                        red = i24;
                        silver = (i24 + 107) % 128;
                        try {
                            Object[] objArr3 = {Long.valueOf(j7)};
                            Object[] objArr4 = new Object[1];
                            delta("ྤ괷䙋࿒횱橜뇩ᦜ\ue05d웻ꅇ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
                            Method method = Long.class.getMethod((String) objArr4[0], Long.TYPE);
                            method.setAccessible(true);
                            Object invoke = method.invoke(null, objArr3);
                            Object obj = ae.class.getField("INSTANCE").get(null);
                            Method method2 = ae.class.getMethod("D8871", null);
                            method2.setAccessible(true);
                            Object invoke2 = method2.invoke(obj, null);
                            Object[] objArr5 = new Object[1];
                            delta("ꞟ᭧\ue986Ɪ悴䥍Ṽ", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr5);
                            Object[] objArr6 = {(String) objArr5[0], invoke};
                            Object[] objArr7 = new Object[1];
                            delta("\u0cd7\ufae4벨ಧ腶ᢂ䬒", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr7);
                            Method method3 = Map.class.getMethod((String) objArr7[0], Object.class, Object.class);
                            method3.setAccessible(true);
                            method3.invoke(invoke2, objArr6);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void foxtrot() {
                        red = (silver + 63) % 128;
                        B b4 = B.this;
                        Object obj = b4.alpha;
                        try {
                            Object D8871 = uH18377.D8871(-1887110506);
                            if (D8871 == null) {
                                D8871 = uH18377.setPivotYN16904(65 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1) - Process.getGidForName(""), (char) ExpandableListView.getPackedPositionGroup(0L), 1346328643, false, "D8871", new Class[0]);
                            }
                            Object invoke = ((Method) D8871).invoke(obj, null);
                            if (invoke instanceof component8) {
                                byte[] bArr = (byte[]) ((component8) invoke).component9;
                                N14263A23323 alpha2 = b4.charlie.alpha(bArr, b4.delta);
                                if (alpha2 instanceof component8) {
                                    invoke = new component8(new Pair((C1199d1) ((component8) alpha2).component9, bArr));
                                } else if (alpha2 instanceof setTopP6481) {
                                    red = (silver + 65) % 128;
                                    invoke = alpha2;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (invoke instanceof setTopP6481) {
                                red = (silver + 37) % 128;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (invoke instanceof component8) {
                                int i24 = silver + 83;
                                red = i24 % 128;
                                if (i24 % 2 == 0) {
                                    component8 component8Var = (component8) invoke;
                                    if (!(((C1199d1) ((Pair) component8Var.component9).getFirst()).bravo instanceof AbstractC1283y2.a)) {
                                        int i25 = getContextMenuInfoA21117.delta;
                                        int i26 = i25 + 51;
                                        getContextMenuInfoA21117.charlie = i26 % 128;
                                        if (i26 % 2 == 0) {
                                            getContextMenuInfoA21117.charlie = (i25 + 21) % 128;
                                            setTopP6481 settopp6481 = new setTopP6481(new Exception(""));
                                            red = (silver + 105) % 128;
                                            invoke = settopp6481;
                                        } else {
                                            throw null;
                                        }
                                    }
                                } else {
                                    boolean z10 = ((C1199d1) ((Pair) ((component8) invoke).component9).getFirst()).bravo instanceof AbstractC1283y2.a;
                                    throw null;
                                }
                            } else if (invoke instanceof setTopP6481) {
                                red = (silver + 37) % 128;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (invoke instanceof component8) {
                                byte[] bArr2 = (byte[]) ((Pair) ((component8) invoke).component9).getSecond();
                                ((az) b4.bravo).bravo(b4.echo.vD14832N6715(), bArr2);
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Unit invoke() {
                        int i24 = red + 115;
                        silver = i24 % 128;
                        int i25 = i24 % 2;
                        foxtrot();
                        if (i25 != 0) {
                            return Unit.INSTANCE;
                        }
                        throw null;
                    }
                }};
                Object echo = am.echo(438988851);
                if (echo == null) {
                    c3 = 5;
                    c4 = 6;
                    echo = am.charlie((char) (ViewConfiguration.getTouchSlop() >> 8), 52 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(0, 0) + 584, 333035925, "component9", new Class[]{Function0.class});
                } else {
                    c3 = 5;
                    c4 = 6;
                }
                ((Method) echo).invoke(null, objArr2);
                p3 p3Var = o3Var.alpha;
                Object alpha2 = p3.alpha(new Object[]{p3Var}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), -2066565752, 2066565756);
                ah ahVar = (ah) p3.alpha(new Object[]{p3Var}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), -1047382510, 1047382512);
                ahVar.getClass();
                G2 g26 = ahVar.kilo;
                if (g25 == null) {
                    g22 = g26;
                } else {
                    g22 = g25;
                }
                w.o oVar = ahVar.bravo;
                if (g22 == null) {
                    g22 = (G2) oVar.red;
                }
                C1228k2 c1228k2 = new C1228k2((SensorManager) oVar.purple, g22);
                if (g25 == null) {
                    g23 = g26;
                } else {
                    g23 = g25;
                }
                ai aiVar = new ai(ahVar.alpha, c1228k2, ahVar.charlie, ahVar.delta, ahVar.echo, ahVar.foxtrot, g23, ahVar.golf, ahVar.hotel, ahVar.india, ahVar.juliet, ahVar.lima, ahVar.mike, ahVar.november, ahVar.oscar, ahVar.papa, ahVar.quebec, ahVar.romeo, ahVar.sierra, ahVar.tango, ahVar.uniform, ahVar.victor, ahVar.whiskey, ahVar.xray, ahVar.yankee, ahVar.zulu, ahVar.amber, ahVar.azure, ahVar.beige, null);
                Map map = o3Var.purple;
                String str = o3Var.red;
                Long pivotYN16904 = o3Var.silver.setPivotYN16904();
                if (pivotYN16904 != null) {
                    int i24 = yellow;
                    white = (((i24 & 10) + (i24 | 10)) - 1) % 128;
                    num = bl.component5(pivotYN16904.longValue());
                    int i25 = white;
                    yellow = (((i25 | 117) << 1) - (i25 ^ 117)) % 128;
                } else {
                    int i26 = yellow;
                    int i27 = i26 & 91;
                    int i28 = (i26 | 91) & (~i27);
                    int i29 = -(-(i27 << 1));
                    white = (((i28 | i29) << 1) - (i28 ^ i29)) % 128;
                    num = null;
                }
                final C1252q2 c1252q2 = o3Var.teal;
                l3 l3Var = new l3(c1252q2);
                m3 m3Var = new m3(c1252q2);
                Function1<Integer, Unit> function1 = new Function1<Integer, Unit>() { // from class: com.fingerprintjs.android.fpjs_pro_internal.zI26963$5$2
                    public static int purple;
                    public static int red;

                    {
                        super(1);
                    }

                    public static /* synthetic */ Object alpha(Object[] objArr3, int i30, int i31, int i32, int i33, int i34, int i35) {
                        int i36 = ~i31;
                        int i37 = ~(i36 | i35);
                        int i38 = ~i33;
                        int i39 = ~(i38 | i35);
                        int i40 = i37 | i39;
                        int i41 = ~i35;
                        int i42 = ~(i41 | i31);
                        int i43 = (~(i33 | i36)) | i42 | i39;
                        int i44 = (~(i41 | i38)) | i42 | (~(i38 | i31));
                        int i45 = (606601216 * i34) + (1313472512 * i32) + ((-1647181824) * i30) + (768614067 * i44) + (i43 * 768614067) + ((-1537228134) * i40) + ((-878567756) * i31) + ((1110557339 * i35) - 760807424);
                        int papa2 = AbstractC2327c.papa(i34, 2055044340, ((-954185507) * i32) + i35 + i31 + i30);
                        if (AbstractC2327c.quebec(papa2, 572063744, (i34 * 1594648204) + (i32 * 826674179) + (i30 * 1290136159) + (i44 * 621) + (i43 * 621) + (i40 * (-1242)) + (i31 * 1290136780) + (i35 * 1290134917) + 267690129, 607715328, ((-1232666624) * papa2) + i45) != 1) {
                            alpha(new Object[]{(zI26963$5$2) objArr3[0], Integer.valueOf(((Number) objArr3[1]).intValue())}, w.o.papa(), 1163797619, w.o.papa(), w.o.papa(), w.o.papa(), -1163797618);
                            return Unit.INSTANCE;
                        }
                        zI26963$5$2 zi26963_5_2 = (zI26963$5$2) objArr3[0];
                        C1252q2.this.delta = ((Number) objArr3[1]).intValue();
                        C1252q2.this.hotel = I0.echo();
                        return null;
                    }

                    public static int vD14832N6715() {
                        int i30 = purple;
                        int i31 = i30 % 8850048;
                        purple = i30 + 1;
                        if (i31 != 0) {
                            return red;
                        }
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        red = elapsedCpuTime;
                        return elapsedCpuTime;
                    }

                    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.Unit, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Integer num2) {
                        return alpha(new Object[]{this, num2}, w.o.papa(), 597668437, w.o.papa(), w.o.papa(), w.o.papa(), -597668437);
                    }
                };
                try {
                    Object[] objArr3 = new Object[8];
                    objArr3[7] = new n3(c1252q2);
                    objArr3[c4] = function1;
                    objArr3[c3] = m3Var;
                    objArr3[4] = l3Var;
                    objArr3[3] = num;
                    objArr3[2] = str;
                    objArr3[1] = map;
                    objArr3[0] = aiVar;
                    Object D8871 = uH18377.D8871(-496432458);
                    if (D8871 == null) {
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62;
                        int myPid = (Process.myPid() >> 22) + 139;
                        char indexOf = (char) (TextUtils.indexOf("", "", 0) + 5333);
                        Class[] clsArr = new Class[8];
                        clsArr[0] = getEntries.class;
                        clsArr[1] = Map.class;
                        clsArr[2] = String.class;
                        clsArr[3] = Integer.class;
                        clsArr[4] = Function0.class;
                        clsArr[c3] = Function0.class;
                        clsArr[c4] = Function1.class;
                        clsArr[7] = Function1.class;
                        D8871 = uH18377.setPivotYN16904(maximumDrawingCacheSize, myPid, indexOf, 1037215843, false, "component9", clsArr);
                    }
                    Object invoke = ((Method) D8871).invoke(alpha2, objArr3);
                    if (invoke instanceof setTopP6481) {
                        int i30 = yellow;
                        int i31 = ((i30 ^ 119) | (i30 & 119)) << 1;
                        int i32 = -((119 & (~i30)) | (i30 & (-120)));
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        white = i33 % 128;
                        if (i33 % 2 == 0) {
                            Error error = (Error) ((setTopP6481) invoke).vD14832N6715;
                            InterfaceC1276x interfaceC1276x = (InterfaceC1276x) p3.alpha(new Object[]{p3Var}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), 686520712, -686520712);
                            StringBuilder victor = Q0.c.victor("Error: ", error.bravo, " Request ID: ");
                            victor.append(error.alpha);
                            ((C1219i1) interfaceC1276x).alpha(safeWithTimeoutProContext, victor.toString());
                            int i34 = white;
                            int i35 = i34 & 23;
                            int i36 = -(-((i34 ^ 23) | i35));
                            yellow = ((i35 & i36) + (i36 | i35)) % 128;
                        } else {
                            Error error2 = (Error) ((setTopP6481) invoke).vD14832N6715;
                            InterfaceC1276x interfaceC1276x2 = (InterfaceC1276x) p3.alpha(new Object[]{p3Var}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), 686520712, -686520712);
                            StringBuilder victor2 = Q0.c.victor("Error: ", error2.bravo, " Request ID: ");
                            victor2.append(error2.alpha);
                            ((C1219i1) interfaceC1276x2).alpha(safeWithTimeoutProContext, victor2.toString());
                            throw null;
                        }
                    }
                    int i37 = white;
                    yellow = (((i37 | 65) << 1) - (i37 ^ 65)) % 128;
                    return invoke;
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
        o3 o3Var2 = (o3) objArr[0];
        Object obj = objArr[1];
        yellow = (white + 9) % 128;
        N14263A23323 n14263a23323 = (N14263A23323) alpha(new Object[]{o3Var2, (SafeWithTimeoutProContext) obj}, 1517717104, N.alpha(), N.alpha(), N.alpha(), N.alpha(), -1517717104);
        int i38 = white;
        int i39 = i38 ^ 35;
        int i40 = (i38 & 35) << 1;
        yellow = ((i39 ^ i40) + ((i40 & i39) << 1)) % 128;
        return n14263a23323;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.fingerprintjs.android.fpjs_pro_internal.N14263A23323<? extends com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse, ? extends com.fingerprintjs.android.fpjs_pro.Error>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ N14263A23323<? extends FingerprintJSProResponse, ? extends Error> invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        return alpha(new Object[]{this, safeWithTimeoutProContext}, -1696111129, N.alpha(), N.alpha(), N.alpha(), N.alpha(), 1696111130);
    }
}
