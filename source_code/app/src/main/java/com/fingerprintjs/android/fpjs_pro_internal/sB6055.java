package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class sB6055 implements K {
    public static final int bravo;
    public static int charlie;
    public static int delta;
    public static int echo;
    public static int foxtrot;
    public static final byte[] golf = null;
    public final ContentResolver alpha;

    static {
        bravo();
        echo = 0;
        foxtrot = 1;
        charlie = 0;
        delta = 1;
        bravo = -98253901;
    }

    public sB6055(ContentResolver contentResolver) {
        this.alpha = contentResolver;
    }

    public static void D8871(long j5, long j6) {
        long j7 = j5 ^ (j6 << 32);
        af.class.getField("alpha").get(null);
        int i4 = (delta + 105) % 128;
        charlie = i4;
        delta = (i4 + 1) % 128;
        try {
            Object[] objArr = {Long.valueOf(j7)};
            Object[] objArr2 = new Object[1];
            alpha(6 - (ViewConfiguration.getJumpTapTimeout() >> 16), 229 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, "\ufffa\u0005\u000e\ufffe￨\uffff\u000f", false, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ae.class.getField("INSTANCE").get(null);
            Method method2 = ae.class.getMethod("D8871", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            alpha((ViewConfiguration.getJumpTapTimeout() >> 16) + 2, TextUtils.getOffsetBefore("", 0) + 177, 2 - TextUtils.lastIndexOf("", '0', 0), "\u0001\u0001\ufffe", false, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            alpha(Color.red(0) + 2, Gravity.getAbsoluteGravity(0, 0) + 241, View.resolveSizeAndState(0, 0, 0) + 3, "\u0002�\u0001", true, objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:8:0x0034, B:10:0x004d, B:13:0x00b7, B:14:0x0082, B:16:0x008b, B:17:0x00c5, B:19:0x00d5, B:21:0x00e3, B:22:0x0111, B:24:0x00ac, B:42:0x0157, B:44:0x0164, B:46:0x018e), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:8:0x0034, B:10:0x004d, B:13:0x00b7, B:14:0x0082, B:16:0x008b, B:17:0x00c5, B:19:0x00d5, B:21:0x00e3, B:22:0x0111, B:24:0x00ac, B:42:0x0157, B:44:0x0164, B:46:0x018e), top: B:7:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.fingerprintjs.android.fpjs_pro_internal.cu, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ac -> B:13:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void alpha(int i4, int i5, int i10, String str, boolean z2, Object[] objArr) {
        int i11;
        Throwable cause;
        char c3;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 2;
        char c4 = 1;
        int i17 = foxtrot + 125;
        echo = i17 % 128;
        if (i17 % 2 == 0) {
            char[] charArray = str.toCharArray();
            ?? obj = new Object();
            char[] cArr = new char[i10];
            obj.D8871 = 0;
            while (true) {
                int i18 = obj.D8871;
                if (i18 >= i10) {
                    break;
                }
                char c10 = charArray[i18];
                obj.component9 = c10;
                char c11 = (char) (i5 + c10);
                cArr[i18] = c11;
                try {
                    Object[] objArr2 = new Object[i16];
                    objArr2[c4] = Integer.valueOf(bravo);
                    objArr2[i15] = Integer.valueOf(c11);
                    Object D8871 = uH18377.D8871(2017305099);
                    if (D8871 == null) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i15) + 52;
                        int i19 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1414;
                        char combineMeasuredStates = (char) (3047 - View.combineMeasuredStates(i15, i15));
                        c3 = c4;
                        byte b2 = (byte) i15;
                        i12 = -1152546338;
                        byte b4 = b2;
                        int i20 = ((byte) (b4 - 1)) + 4;
                        int i21 = 1 - (b2 * 4);
                        int i22 = 108 - (b4 * i16);
                        byte[] bArr = new byte[i21];
                        byte[] bArr2 = golf;
                        if (bArr2 == null) {
                            char c12 = combineMeasuredStates;
                            int i23 = i15;
                            int i24 = i20;
                            i22 += i20;
                            char c13 = c12;
                            i13 = i23;
                            combineMeasuredStates = c13;
                            i20 = i24;
                            int i25 = i20 + 1;
                            bArr[i13] = (byte) i22;
                            i14 = i13 + 1;
                            if (i14 == i21) {
                                String str2 = new String(bArr, 0);
                                Class[] clsArr = new Class[2];
                                Class cls = Integer.TYPE;
                                clsArr[0] = cls;
                                clsArr[c3] = cls;
                                D8871 = uH18377.setPivotYN16904(absoluteGravity, i19, combineMeasuredStates, -1484390178, false, str2, clsArr);
                            } else {
                                c12 = combineMeasuredStates;
                                byte b6 = bArr2[i25];
                                i23 = i14;
                                i24 = i25;
                                i20 = i22;
                                i22 = b6;
                                i22 += i20;
                                char c132 = c12;
                                i13 = i23;
                                combineMeasuredStates = c132;
                                i20 = i24;
                                int i252 = i20 + 1;
                                bArr[i13] = (byte) i22;
                                i14 = i13 + 1;
                                if (i14 == i21) {
                                }
                            }
                        } else {
                            i13 = i15;
                            int i2522 = i20 + 1;
                            bArr[i13] = (byte) i22;
                            i14 = i13 + 1;
                            if (i14 == i21) {
                            }
                        }
                    } else {
                        c3 = c4;
                        i12 = -1152546338;
                    }
                    cArr[i18] = ((Character) ((Method) D8871).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = new Object[2];
                    objArr3[c3] = obj;
                    objArr3[0] = obj;
                    Object D88712 = uH18377.D8871(i12);
                    if (D88712 == null) {
                        int i26 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 67;
                        int i27 = 396 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Object.class;
                        clsArr2[c3] = Object.class;
                        D88712 = uH18377.setPivotYN16904(i26, i27, scrollBarFadeDuration, 1693854475, false, "m", clsArr2);
                    }
                    ((Method) D88712).invoke(null, objArr3);
                    c4 = c3;
                    i15 = 0;
                    i16 = 2;
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
                cause = th.getCause();
                if (cause == null) {
                    throw cause;
                }
                throw th;
            }
            char c14 = c4;
            if (i4 > 0) {
                obj.setPivotYN16904 = i4;
                char[] cArr2 = new char[i10];
                i11 = 0;
                System.arraycopy(cArr, 0, cArr2, 0, i10);
                int i28 = obj.setPivotYN16904;
                System.arraycopy(cArr2, 0, cArr, i10 - i28, i28);
                int i29 = obj.setPivotYN16904;
                System.arraycopy(cArr2, i29, cArr, 0, i10 - i29);
            } else {
                i11 = 0;
            }
            if (z2) {
                char[] cArr3 = new char[i10];
                obj.D8871 = i11;
                echo = (foxtrot + 43) % 128;
                while (true) {
                    int i30 = obj.D8871;
                    if (i30 >= i10) {
                        break;
                    }
                    cArr3[i30] = cArr[(i10 - i30) - 1];
                    Object[] objArr4 = new Object[2];
                    objArr4[c14] = obj;
                    objArr4[0] = obj;
                    Object D88713 = uH18377.D8871(-1152546338);
                    if (D88713 == null) {
                        int indexOf = TextUtils.indexOf("", "", 0, 0) + 68;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 395;
                        char rgb = (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        Class[] clsArr3 = new Class[2];
                        clsArr3[0] = Object.class;
                        clsArr3[c14] = Object.class;
                        D88713 = uH18377.setPivotYN16904(indexOf, trimmedLength, rgb, 1693854475, false, "m", clsArr3);
                    }
                    ((Method) D88713).invoke(null, objArr4);
                }
                foxtrot = (echo + 61) % 128;
                cArr = cArr3;
            }
            objArr[0] = new String(cArr);
            return;
        }
        throw null;
    }

    public static void bravo() {
        golf = new byte[]{4, -70, -50, -120};
    }

    public final N14263A23323 charlie() {
        try {
            Object[] objArr = {0L, new F2(this), 1, null};
            Object echo2 = am.echo(853678683);
            if (echo2 == null) {
                echo2 = am.charlie((char) (View.combineMeasuredStates(0, 0) + 40619), View.getDefaultSize(0, 0) + 52, View.resolveSizeAndState(0, 0, 0) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
            }
            N14263A23323 n14263a23323 = (N14263A23323) ((Method) echo2).invoke(null, objArr);
            int i4 = delta + 111;
            charlie = i4 % 128;
            if (i4 % 2 == 0) {
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
