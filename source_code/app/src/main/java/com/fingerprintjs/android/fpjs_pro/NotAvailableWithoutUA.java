package com.fingerprintjs.android.fpjs_pro;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro_internal.C1235m1;
import com.fingerprintjs.android.fpjs_pro_internal.ae;
import com.fingerprintjs.android.fpjs_pro_internal.af;
import com.fingerprintjs.android.fpjs_pro_internal.cv;
import com.fingerprintjs.android.fpjs_pro_internal.uH18377;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/NotAvailableWithoutUA;", "Lcom/fingerprintjs/android/fpjs_pro/Error;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotAvailableWithoutUA extends Error {
    public static final int[] echo = {-348995869, -1834321236, 362044029, 1840052643, 254653734, -1673286340, -2040018744, -759469899, -639702193, -252704031, -2039365149, 322443922, -318617808, 806452735, 2058966526, 1795976118, -1057488490, -418336184};
    public static int foxtrot = 0;
    public static int golf = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0270  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.fingerprintjs.android.fpjs_pro_internal.cv, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(int[] iArr, int i4, Object[] objArr) {
        int[] iArr2;
        int i5;
        Class cls;
        int i10;
        int i11;
        Throwable cause;
        int i12;
        int i13 = 2;
        int i14 = 16;
        int i15 = 0;
        ?? obj = new Object();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = echo;
        int i16 = foxtrot + 5;
        golf = i16 % 128;
        if (i16 % 2 == 0) {
            iArr2 = new int[18];
            i5 = 1;
        } else {
            iArr2 = new int[18];
            i5 = 0;
        }
        while (true) {
            cls = Integer.TYPE;
            if (i5 >= 18) {
                break;
            }
            try {
                int i17 = i13;
                Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                Object D8871 = uH18377.D8871(886179121);
                if (D8871 == null) {
                    i12 = i14;
                    D8871 = uH18377.setPivotYN16904((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, TextUtils.getOffsetAfter("", 0) + 587, (char) View.MeasureSpec.makeMeasureSpec(0, 0), -345397276, false, "f", new Class[]{cls});
                } else {
                    i12 = i14;
                }
                iArr2[i5] = ((Integer) ((Method) D8871).invoke(null, objArr2)).intValue();
                i5++;
                foxtrot = (golf + 31) % 128;
                i13 = i17;
                i14 = i12;
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
        int i18 = i13;
        int i19 = i14;
        int length = iArr2.length;
        int[] iArr4 = new int[length];
        golf = (foxtrot + 107) % 128;
        int[] iArr5 = new int[18];
        int i20 = 0;
        for (int i21 = 18; i20 < i21; i21 = 18) {
            Object[] objArr3 = new Object[1];
            objArr3[i15] = Integer.valueOf(iArr3[i20]);
            Object D88712 = uH18377.D8871(886179121);
            if (D88712 == null) {
                int keyCodeFromString = KeyEvent.keyCodeFromString("") + 53;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 587;
                i11 = i15;
                char rgb = (char) (Color.rgb(i15, i15, i15) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                Class[] clsArr = new Class[1];
                clsArr[i11] = cls;
                D88712 = uH18377.setPivotYN16904(keyCodeFromString, keyRepeatTimeout, rgb, -345397276, false, "f", clsArr);
            } else {
                i11 = i15;
            }
            iArr5[i20] = ((Integer) ((Method) D88712).invoke(null, objArr3)).intValue();
            i20++;
            i15 = i11;
        }
        int i22 = i15;
        System.arraycopy(iArr5, i22, iArr4, i22, length);
        obj.vD14832N6715 = i22;
        while (true) {
            int i23 = obj.vD14832N6715;
            if (i23 < iArr.length) {
                int i24 = iArr[i23];
                char c3 = (char) (i24 >> 16);
                cArr[i22] = c3;
                char c4 = (char) i24;
                cArr[1] = c4;
                int i25 = iArr[i23 + 1];
                char c10 = (char) (i25 >> 16);
                cArr[i18] = c10;
                char c11 = (char) i25;
                cArr[3] = c11;
                obj.setPivotYN16904 = (c3 << 16) + c4;
                obj.component5 = (c10 << 16) + c11;
                cv.alpha(iArr4);
                int i26 = 0;
                while (i26 < i19) {
                    foxtrot = (golf + 69) % 128;
                    int i27 = obj.setPivotYN16904 ^ iArr4[i26];
                    obj.setPivotYN16904 = i27;
                    int[][] iArr6 = C1235m1.delta.alpha;
                    int i28 = ((iArr6[0][(i27 >>> 24) & 255] + iArr6[1][(i27 >>> 16) & 255]) ^ iArr6[i18][(i27 >>> 8) & 255]) + iArr6[3][i27 & 255];
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = obj;
                    objArr4[i18] = obj;
                    objArr4[1] = Integer.valueOf(i28);
                    objArr4[0] = obj;
                    Object D88713 = uH18377.D8871(1897056276);
                    if (D88713 == null) {
                        int keyCodeFromString2 = KeyEvent.keyCodeFromString("") + 52;
                        int indexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 797;
                        char bitsPerPixel = (char) (40768 - ImageFormat.getBitsPerPixel(0));
                        Class[] clsArr2 = new Class[4];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = cls;
                        clsArr2[i18] = Object.class;
                        clsArr2[3] = Object.class;
                        D88713 = uH18377.setPivotYN16904(keyCodeFromString2, indexOf, bitsPerPixel, -1364628799, false, "i", clsArr2);
                    }
                    int intValue = ((Integer) ((Method) D88713).invoke(null, objArr4)).intValue();
                    obj.setPivotYN16904 = obj.component5;
                    obj.component5 = intValue;
                    i26++;
                    i19 = 16;
                }
                int i29 = obj.setPivotYN16904;
                int i30 = obj.component5;
                obj.setPivotYN16904 = i30;
                obj.component5 = i29;
                int i31 = i29 ^ iArr4[16];
                obj.component5 = i31;
                int i32 = i30 ^ iArr4[17];
                obj.setPivotYN16904 = i32;
                cArr[0] = (char) (i32 >>> 16);
                cArr[1] = (char) i32;
                cArr[i18] = (char) (i31 >>> 16);
                cArr[3] = (char) i31;
                cv.alpha(iArr4);
                int i33 = obj.vD14832N6715 * 2;
                cArr2[i33] = cArr[0];
                cArr2[i33 + 1] = cArr[1];
                cArr2[i33 + 2] = cArr[i18];
                cArr2[i33 + 3] = cArr[3];
                Object[] objArr5 = new Object[i18];
                objArr5[1] = obj;
                objArr5[0] = obj;
                Object D88714 = uH18377.D8871(-917023077);
                if (D88714 == null) {
                    i19 = 16;
                    i10 = 2;
                    D88714 = uH18377.setPivotYN16904(67 - View.combineMeasuredStates(0, 0), ImageFormat.getBitsPerPixel(0) + 262, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 384627790, false, "o", new Class[]{Object.class, Object.class});
                } else {
                    i10 = 2;
                    i19 = 16;
                }
                ((Method) D88714).invoke(null, objArr5);
                i18 = i10;
                i22 = 0;
            } else {
                objArr[0] = new String(cArr2, 0, i4);
                return;
            }
        }
    }

    public static void component5(long j5, long j6) {
        long j7 = j5 ^ (j6 << 32);
        af.class.getField("alpha").get(null);
        try {
            Object[] objArr = {Long.valueOf(j7)};
            Object[] objArr2 = new Object[1];
            bravo(new int[]{-679177993, 1848156499, 364814420, -1370346906}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ae.class.getField("INSTANCE").get(null);
            Method method2 = ae.class.getMethod("D8871", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            bravo(new int[]{497149385, 1421246256}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            bravo(new int[]{2093144461, 772259234}, 3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
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
}
