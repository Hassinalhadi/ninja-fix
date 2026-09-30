package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fingerprintjs.android.fpjs_pro_internal.C0;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/az;", "Lcom/fingerprintjs/android/fpjs_pro_internal/D0;", "bravo", "vD14832N6715"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class az implements D0 {

    /* renamed from: bravo, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final String charlie = P28427.C1004a0.echo.vD14832N6715();
    public final String alpha;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/az$vD14832N6715;", "", "", "component5", "Ljava/lang/String;", "vD14832N6715"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.az$vD14832N6715, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
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
            alpha = -6907659608755725283L;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void D8871(long j5, long j6) {
            bravo = (charlie + 51) % 128;
            long j7 = j5 ^ (j6 << 32);
            af.class.getField("alpha").get(null);
            charlie = (bravo + 77) % 128;
            try {
                Object[] objArr = {Long.valueOf(j7)};
                Object[] objArr2 = new Object[1];
                bravo("牥㕥ﱑꜣ渪ᄯ\ud8ff", 18199 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                Method method = Long.class.getMethod((String) objArr2[0], Long.TYPE);
                method.setAccessible(true);
                Object invoke = method.invoke(null, objArr);
                Object obj = ae.class.getField("INSTANCE").get(null);
                Method method2 = ae.class.getMethod("D8871", null);
                method2.setAccessible(true);
                Object invoke2 = method2.invoke(obj, null);
                Object[] objArr3 = new Object[1];
                bravo("爡籖滈", 3697 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                Object[] objArr4 = {(String) objArr3[0], invoke};
                Object[] objArr5 = new Object[1];
                bravo("牣황㩹", 41999 - (ViewConfiguration.getEdgeSlop() >> 16), objArr5);
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

        public static String alpha(byte b2, int i4, int i5) {
            int i10 = (i4 * 4) + 116;
            int i11 = i5 * 2;
            int i12 = (b2 * 2) + 4;
            byte[] bArr = new byte[i11 + 1];
            byte[] bArr2 = foxtrot;
            int i13 = -1;
            if (bArr2 == null) {
                i12++;
                i10 = i12 + (-i10);
            }
            while (true) {
                i13++;
                bArr[i13] = (byte) i10;
                if (i13 == i11) {
                    return new String(bArr, 0);
                }
                byte b4 = bArr2[i12];
                i12++;
                i10 += -b4;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01ff  */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.ct] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void bravo(String str, int i4, Object[] objArr) {
            int i5;
            Throwable cause;
            int i10;
            int i11 = 0;
            boolean z2 = true;
            int i12 = (echo + 1) % 128;
            delta = i12;
            int i13 = i12 + 31;
            echo = i13 % 128;
            if (i13 % 2 != 0) {
                char[] charArray = str.toCharArray();
                ?? obj = new Object();
                obj.component9 = i4;
                int length = charArray.length;
                long[] jArr = new long[length];
                obj.setPivotYN16904 = 0;
                echo = (delta + 59) % 128;
                while (true) {
                    int i14 = obj.setPivotYN16904;
                    if (i14 >= charArray.length) {
                        break;
                    }
                    int i15 = delta + 3;
                    boolean z10 = z2;
                    echo = i15 % 128;
                    int i16 = i15 % 2;
                    long j5 = alpha;
                    Class cls = Integer.TYPE;
                    if (i16 == 0) {
                        char c3 = charArray[i14];
                        try {
                            Object[] objArr2 = new Object[3];
                            objArr2[2] = obj;
                            objArr2[z10 ? 1 : 0] = obj;
                            objArr2[0] = Integer.valueOf(c3);
                            Object D8871 = uH18377.D8871(1142442855);
                            if (D8871 == null) {
                                int alpha2 = 64 - Color.alpha(0);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 463;
                                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 29265);
                                i10 = 495480529;
                                Class[] clsArr = new Class[3];
                                clsArr[0] = cls;
                                clsArr[z10 ? 1 : 0] = Object.class;
                                clsArr[2] = Object.class;
                                D8871 = uH18377.setPivotYN16904(alpha2, makeMeasureSpec, deadChar, -1683756622, false, "s", clsArr);
                            } else {
                                i10 = 495480529;
                            }
                            jArr[i14] = ((Long) ((Method) D8871).invoke(null, objArr2)).longValue() | (j5 / (-461071229536473586L));
                            Object[] objArr3 = new Object[2];
                            objArr3[z10 ? 1 : 0] = obj;
                            objArr3[0] = obj;
                            Object D88712 = uH18377.D8871(i10);
                            if (D88712 == null) {
                                int red = 60 - Color.red(0);
                                int keyCodeFromString = KeyEvent.keyCodeFromString("") + 1734;
                                char combineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                byte b2 = (byte) 0;
                                byte b4 = b2;
                                String alpha3 = alpha(b4, b2, b4);
                                Class[] clsArr2 = new Class[2];
                                clsArr2[0] = Object.class;
                                clsArr2[z10 ? 1 : 0] = Object.class;
                                D88712 = uH18377.setPivotYN16904(red, keyCodeFromString, combineMeasuredStates, -1036792828, false, alpha3, clsArr2);
                            }
                            ((Method) D88712).invoke(null, objArr3);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause == null) {
                            }
                        }
                    } else {
                        char c4 = charArray[i14];
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = obj;
                        objArr4[z10 ? 1 : 0] = obj;
                        objArr4[0] = Integer.valueOf(c4);
                        Object D88713 = uH18377.D8871(1142442855);
                        if (D88713 == null) {
                            int i17 = 65 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int indexOf = 462 - TextUtils.indexOf((CharSequence) "", '0');
                            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29265);
                            Class[] clsArr3 = new Class[3];
                            clsArr3[0] = cls;
                            clsArr3[z10 ? 1 : 0] = Object.class;
                            clsArr3[2] = Object.class;
                            D88713 = uH18377.setPivotYN16904(i17, indexOf, longPressTimeout, -1683756622, false, "s", clsArr3);
                        }
                        jArr[i14] = ((Long) ((Method) D88713).invoke(null, objArr4)).longValue() ^ (j5 ^ (-461071229536473586L));
                        Object[] objArr5 = new Object[2];
                        objArr5[z10 ? 1 : 0] = obj;
                        objArr5[0] = obj;
                        Object D88714 = uH18377.D8871(495480529);
                        if (D88714 == null) {
                            int i18 = 60 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int resolveOpacity = Drawable.resolveOpacity(0, 0) + 1734;
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte b6 = (byte) 0;
                            byte b10 = b6;
                            String alpha4 = alpha(b10, b6, b10);
                            Class[] clsArr4 = new Class[2];
                            clsArr4[0] = Object.class;
                            clsArr4[z10 ? 1 : 0] = Object.class;
                            D88714 = uH18377.setPivotYN16904(i18, resolveOpacity, keyRepeatDelay, -1036792828, false, alpha4, clsArr4);
                        }
                        ((Method) D88714).invoke(null, objArr5);
                    }
                    z2 = z10 ? 1 : 0;
                    cause = th.getCause();
                    if (cause == null) {
                        throw cause;
                    }
                    throw th;
                }
                boolean z11 = z2;
                char[] cArr = new char[length];
                obj.setPivotYN16904 = 0;
                while (true) {
                    int i19 = obj.setPivotYN16904;
                    if (i19 < charArray.length) {
                        echo = (delta + 21) % 128;
                        cArr[i19] = (char) jArr[i19];
                        Object[] objArr6 = new Object[2];
                        objArr6[z11 ? 1 : 0] = obj;
                        objArr6[i11] = obj;
                        Object D88715 = uH18377.D8871(495480529);
                        if (D88715 == null) {
                            int i20 = 60 - (TypedValue.complexToFloat(i11) > 0.0f ? 1 : (TypedValue.complexToFloat(i11) == 0.0f ? 0 : -1));
                            int windowTouchSlop = 1734 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i11, i11) + 1);
                            byte b11 = (byte) i11;
                            byte b12 = b11;
                            i5 = i11;
                            String alpha5 = alpha(b12, b11, b12);
                            Class[] clsArr5 = new Class[2];
                            clsArr5[i5] = Object.class;
                            clsArr5[z11 ? 1 : 0] = Object.class;
                            D88715 = uH18377.setPivotYN16904(i20, windowTouchSlop, lastIndexOf, -1036792828, false, alpha5, clsArr5);
                        } else {
                            i5 = i11;
                        }
                        ((Method) D88715).invoke(null, objArr6);
                        i11 = i5;
                    } else {
                        objArr[i11] = new String(cArr);
                        return;
                    }
                }
            } else {
                str.toCharArray();
                throw null;
            }
        }

        public static void charlie() {
            foxtrot = new byte[]{47, 121, 24, 35};
        }
    }

    public az(String str) {
        String str2;
        if (str != null) {
            StringBuilder beige = ao.ad.beige(str, "/");
            beige.append(charlie);
            str2 = beige.toString();
        } else {
            str2 = null;
        }
        this.alpha = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized N14263A23323 alpha(String str) {
        Object obj;
        try {
            try {
                Object[] objArr = {0L, new B0(this, str), 1, null};
                Object echo = am.echo(853678683);
                if (echo == null) {
                    echo = am.charlie((char) (40619 - KeyEvent.keyCodeFromString("")), TextUtils.indexOf("", "", 0, 0) + 52, 221 - TextUtils.lastIndexOf("", '0', 0, 0), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
                N14263A23323 D8871 = bk.D8871((N14263A23323) ((Method) echo).invoke(null, objArr));
                if (D8871 instanceof component8) {
                    return D8871;
                }
                if (D8871 instanceof setTopP6481) {
                    if (((Throwable) ((setTopP6481) D8871).vD14832N6715) instanceof FileNotFoundException) {
                        obj = C0.b.alpha;
                    } else {
                        obj = C0.a.alpha;
                    }
                    return new setTopP6481(obj);
                }
                throw new NoWhenBranchMatchedException();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized N14263A23323 bravo(String str, byte[] bArr) {
        Object[] objArr;
        Object echo;
        try {
            try {
                objArr = new Object[]{0L, new A0(this, str, bArr), 1, null};
                echo = am.echo(853678683);
                if (echo == null) {
                    echo = am.charlie((char) (40618 - ExpandableListView.getPackedPositionChild(0L)), Color.argb(0, 0, 0, 0) + 52, 222 - (ViewConfiguration.getJumpTapTimeout() >> 16), 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (N14263A23323) ((Method) echo).invoke(null, objArr);
    }
}
