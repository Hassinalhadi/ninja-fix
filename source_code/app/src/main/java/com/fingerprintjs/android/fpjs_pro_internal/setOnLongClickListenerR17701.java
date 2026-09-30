package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes3.dex */
public final class setOnLongClickListenerR17701 {
    public static final long alpha;
    public static int bravo;
    public static int charlie;
    public static int delta;
    public static int echo;
    public static final byte[] foxtrot = null;

    static {
        charlie();
        delta = 0;
        echo = 1;
        bravo = 0;
        charlie = 1;
        alpha = 7445712581095233752L;
    }

    public static void D8871(long j5, long j6) {
        bravo = (charlie + 57) % 128;
        long j7 = j5 ^ (j6 << 32);
        af.class.getField("alpha").get(null);
        charlie = (bravo + 115) % 128;
        try {
            Object[] objArr = {Long.valueOf(j7)};
            Object[] objArr2 = new Object[1];
            bravo("\uf6a0㼘旤ꮮ퀏۲䲪", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51631, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ae.class.getField("INSTANCE").get(null);
            Method method2 = ae.class.getMethod("D8871", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            bravo("\uf6e7듽狜", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16927, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            bravo("\uf6a6蝂ᕠ", View.MeasureSpec.getSize(0) + 29153, objArr5);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(int i4, short s3, int i5) {
        int i10;
        int i11;
        int i12 = 4 - (s3 * 4);
        int i13 = 1 - (i5 * 2);
        int i14 = (i4 * 4) + 116;
        byte[] bArr = new byte[i13];
        byte[] bArr2 = foxtrot;
        if (bArr2 == null) {
            int i15 = i14;
            i14 = i13;
            i11 = 0;
            i14 += i15;
            i12++;
            i10 = i11;
            i11 = i10 + 1;
            bArr[i10] = (byte) i14;
            if (i11 == i13) {
                return new String(bArr, 0);
            }
            i15 = bArr2[i12];
            i14 += i15;
            i12++;
            i10 = i11;
            i11 = i10 + 1;
            bArr[i10] = (byte) i14;
            if (i11 == i13) {
            }
        } else {
            i10 = 0;
            i11 = i10 + 1;
            bArr[i10] = (byte) i14;
            if (i11 == i13) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0248  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.ct] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(String str, int i4, Object[] objArr) {
        Throwable cause;
        int i5;
        int i10;
        int i11 = 0;
        char[] charArray = str.toCharArray();
        ?? obj = new Object();
        obj.component9 = i4;
        int length = charArray.length;
        long[] jArr = new long[length];
        obj.setPivotYN16904 = 0;
        delta = (echo + 111) % 128;
        while (true) {
            int i12 = obj.setPivotYN16904;
            if (i12 >= charArray.length) {
                break;
            }
            int i13 = delta + 73;
            echo = i13 % 128;
            int i14 = i13 % 2;
            long j5 = alpha;
            Class cls = Integer.TYPE;
            if (i14 == 0) {
                char c3 = charArray[i12];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = obj;
                    objArr2[1] = obj;
                    objArr2[i11] = Integer.valueOf(c3);
                    Object D8871 = uH18377.D8871(1142442855);
                    if (D8871 == null) {
                        int offsetBefore = 64 - TextUtils.getOffsetBefore("", i11);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 464;
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29265);
                        i10 = 495480529;
                        Class[] clsArr = new Class[3];
                        clsArr[i11] = cls;
                        clsArr[1] = Object.class;
                        clsArr[2] = Object.class;
                        D8871 = uH18377.setPivotYN16904(offsetBefore, modifierMetaStateMask, edgeSlop, -1683756622, false, "s", clsArr);
                    } else {
                        i10 = 495480529;
                    }
                    jArr[i12] = ((Long) ((Method) D8871).invoke(null, objArr2)).longValue() ^ (j5 - (-461071229536473586L));
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = obj;
                    objArr3[i11] = obj;
                    Object D88712 = uH18377.D8871(i10);
                    if (D88712 == null) {
                        int normalizeMetaState = 60 - KeyEvent.normalizeMetaState(i11);
                        int alpha2 = 1734 - Color.alpha(i11);
                        char c4 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(i11, i11) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i11, i11) == 0L ? 0 : -1)));
                        byte b2 = (byte) i11;
                        byte b4 = b2;
                        String alpha3 = alpha(b2, b4, b4);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i11] = Object.class;
                        clsArr2[1] = Object.class;
                        D88712 = uH18377.setPivotYN16904(normalizeMetaState, alpha2, c4, -1036792828, false, alpha3, clsArr2);
                    }
                    ((Method) D88712).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause == null) {
                    }
                }
            } else {
                char c10 = charArray[i12];
                Object[] objArr4 = new Object[3];
                objArr4[2] = obj;
                objArr4[1] = obj;
                objArr4[i11] = Integer.valueOf(c10);
                Object D88713 = uH18377.D8871(1142442855);
                if (D88713 == null) {
                    int defaultSize = View.getDefaultSize(i11, i11) + 64;
                    int i15 = 464 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    char c11 = (char) (29266 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    i5 = i11;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i5] = cls;
                    clsArr3[1] = Object.class;
                    clsArr3[2] = Object.class;
                    D88713 = uH18377.setPivotYN16904(defaultSize, i15, c11, -1683756622, false, "s", clsArr3);
                } else {
                    i5 = i11;
                }
                jArr[i12] = ((Long) ((Method) D88713).invoke(null, objArr4)).longValue() ^ (j5 ^ (-461071229536473586L));
                Object[] objArr5 = new Object[2];
                objArr5[1] = obj;
                objArr5[i5] = obj;
                Object D88714 = uH18377.D8871(495480529);
                if (D88714 == null) {
                    int trimmedLength = 60 - TextUtils.getTrimmedLength("");
                    int packedPositionChild = 1733 - ExpandableListView.getPackedPositionChild(0L);
                    int i16 = i5;
                    char makeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i16, i16);
                    byte b6 = (byte) i16;
                    byte b10 = b6;
                    String alpha4 = alpha(b6, b10, b10);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i16] = Object.class;
                    clsArr4[1] = Object.class;
                    D88714 = uH18377.setPivotYN16904(trimmedLength, packedPositionChild, makeMeasureSpec, -1036792828, false, alpha4, clsArr4);
                }
                ((Method) D88714).invoke(null, objArr5);
            }
            i11 = 0;
            cause = th.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th;
        }
        char[] cArr = new char[length];
        obj.setPivotYN16904 = 0;
        while (true) {
            int i17 = obj.setPivotYN16904;
            if (i17 < charArray.length) {
                int i18 = delta + 105;
                echo = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr[i17] = (char) jArr[i17];
                    Object[] objArr6 = {obj, obj};
                    Object D88715 = uH18377.D8871(495480529);
                    if (D88715 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        D88715 = uH18377.setPivotYN16904(59 - TextUtils.indexOf((CharSequence) "", '0'), 1734 - Drawable.resolveOpacity(0, 0), (char) KeyEvent.keyCodeFromString(""), -1036792828, false, alpha(b11, b12, b12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88715).invoke(null, objArr6);
                    int i19 = 53 / 0;
                } else {
                    cArr[i17] = (char) jArr[i17];
                    Object[] objArr7 = {obj, obj};
                    Object D88716 = uH18377.D8871(495480529);
                    if (D88716 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        D88716 = uH18377.setPivotYN16904(60 - ((Process.getThreadPriority(0) + 20) >> 6), 1733 - TextUtils.lastIndexOf("", '0', 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -1036792828, false, alpha(b13, b14, b14), new Class[]{Object.class, Object.class});
                    }
                    ((Method) D88716).invoke(null, objArr7);
                }
            } else {
                objArr[0] = new String(cArr);
                return;
            }
        }
    }

    public static void charlie() {
        foxtrot = new byte[]{46, -61, 83, 91};
    }
}
