package com.fingerprintjs.android.fpjs_pro_internal;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/af;", "", "<init>", "()V", "alpha", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class af {
    public static long bravo;
    public static int charlie;
    public static int delta;
    public static final byte[] echo = null;

    static {
        charlie();
        charlie = 0;
        delta = 1;
        delta();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13 = 1 - (i5 * 2);
        int i14 = b2 + 4;
        int i15 = (i4 * 2) + 116;
        byte[] bArr = new byte[i13];
        byte[] bArr2 = echo;
        if (bArr2 == null) {
            i12 = 0;
            byte[] bArr3 = bArr2;
            int i16 = i14;
            i14 += -i15;
            i10 = i16;
            bArr2 = bArr3;
            i11 = i12;
            int i17 = i10 + 1;
            i12 = i11 + 1;
            bArr[i11] = (byte) i14;
            if (i12 == i13) {
                return new String(bArr, 0);
            }
            byte b4 = bArr2[i17];
            byte[] bArr4 = bArr2;
            i16 = i17;
            i15 = b4;
            bArr3 = bArr4;
            i14 += -i15;
            i10 = i16;
            bArr2 = bArr3;
            i11 = i12;
            int i172 = i10 + 1;
            i12 = i11 + 1;
            bArr[i11] = (byte) i14;
            if (i12 == i13) {
            }
        } else {
            i10 = i14;
            i14 = i15;
            i11 = 0;
            int i1722 = i10 + 1;
            i12 = i11 + 1;
            bArr[i11] = (byte) i14;
            if (i12 == i13) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.ct] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(String str, int i4, Object[] objArr) {
        int i5;
        int i10;
        Throwable cause;
        int i11 = 0;
        char[] charArray = str.toCharArray();
        ?? obj = new Object();
        obj.component9 = i4;
        int length = charArray.length;
        long[] jArr = new long[length];
        obj.setPivotYN16904 = 0;
        while (true) {
            int i12 = obj.setPivotYN16904;
            i5 = -1;
            if (i12 >= charArray.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i12]), obj, obj};
                Object D8871 = uH18377.D8871(1142442855);
                if (D8871 == null) {
                    D8871 = uH18377.setPivotYN16904((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 463, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29264), -1683756622, false, "s", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i12] = ((Long) ((Method) D8871).invoke(null, objArr2)).longValue() ^ (bravo ^ (-461071229536473586L));
                Object[] objArr3 = {obj, obj};
                Object D88712 = uH18377.D8871(495480529);
                if (D88712 == null) {
                    byte b2 = (byte) (-1);
                    byte b4 = (byte) (b2 + 1);
                    D88712 = uH18377.setPivotYN16904(60 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1734, (char) (Process.myPid() >> 22), -1036792828, false, alpha(b2, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) D88712).invoke(null, objArr3);
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
        char[] cArr = new char[length];
        obj.setPivotYN16904 = 0;
        while (true) {
            int i13 = obj.setPivotYN16904;
            if (i13 < charArray.length) {
                cArr[i13] = (char) jArr[i13];
                Object[] objArr4 = new Object[2];
                objArr4[1] = obj;
                objArr4[i11] = obj;
                Object D88713 = uH18377.D8871(495480529);
                if (D88713 == null) {
                    int i14 = (ExpandableListView.getPackedPositionForChild(i11, i11) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i11, i11) == 0L ? 0 : -1)) + 61;
                    int myPid = 1734 - (Process.myPid() >> 22);
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    byte b6 = (byte) i5;
                    i10 = i11;
                    byte b10 = (byte) (b6 + 1);
                    String alpha = alpha(b6, b10, b10);
                    Class[] clsArr = new Class[2];
                    clsArr[i10] = Object.class;
                    clsArr[1] = Object.class;
                    D88713 = uH18377.setPivotYN16904(i14, myPid, modifierMetaStateMask, -1036792828, false, alpha, clsArr);
                } else {
                    i10 = i11;
                }
                ((Method) D88713).invoke(null, objArr4);
                i11 = i10;
                i5 = -1;
            } else {
                objArr[i11] = new String(cArr);
                return;
            }
        }
    }

    public static void charlie() {
        echo = new byte[]{65, 38, 81, 30};
    }

    private static void component5(long j5, long j6) {
        long j7 = j5 ^ (j6 << 32);
        charlie = (delta + 123) % 128;
        try {
            Object[] objArr = {Long.valueOf(j7)};
            Object[] objArr2 = new Object[1];
            bravo("➝ԏ抍䀑궚謽\ue893", TextUtils.indexOf((CharSequence) "", '0', 0) + 8838, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ae.class.getField("INSTANCE").get(null);
            Method method2 = ae.class.getMethod("D8871", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            bravo("⟚鋲䶅", 46381 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            bravo("➛凭쭹", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30323, objArr5);
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

    public static void delta() {
        bravo = 3732891823389886949L;
    }

    private static void vD14832N6715(long j5, long j6) {
        long j7 = j5 ^ (j6 << 32);
        delta = (charlie + 41) % 128;
        try {
            Object[] objArr = {Long.valueOf(j7)};
            Object[] objArr2 = new Object[1];
            bravo("➝ԏ抍䀑궚謽\ue893", TextUtils.getTrimmedLength("") + 8837, objArr2);
            Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(null, objArr);
            Object obj = ae.class.getField("INSTANCE").get(null);
            Method method2 = ae.class.getMethod("D8871", null);
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(obj, null);
            Object[] objArr3 = new Object[1];
            bravo("⟙怂ꡨ", 18398 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr3);
            Object[] objArr4 = {(String) objArr3[0], invoke};
            Object[] objArr5 = new Object[1];
            bravo("➛凭쭹", 30322 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
            Method method3 = Map.class.getMethod((String) objArr5[0], Object.class, Object.class);
            method3.setAccessible(true);
            method3.invoke(invoke2, objArr4);
            delta = (charlie + 121) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
