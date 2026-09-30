package com.fingerprintjs.android.fpjs_pro_internal;

import android.R;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.zendesk.service.HttpConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1287z2 {
    public static final long alpha;
    public static final int bravo;
    public static final char charlie;
    public static final char delta;
    public static final char echo;
    public static final char foxtrot;
    public static final char golf;
    public static int hotel;
    public static int india;
    public static final byte[] juliet = null;
    public static int kilo;
    public static int lima;
    public static final byte[] mike = null;

    static {
        golf();
        kilo = 0;
        lima = 1;
        foxtrot();
        hotel = 0;
        india = 1;
        alpha = 2988085957400289853L;
        bravo = -1053990339;
        charlie = (char) 951;
        delta = (char) 20971;
        echo = (char) 16124;
        foxtrot = (char) 7555;
        golf = (char) 5492;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(short s3, short s9, int i4) {
        int i5;
        int i10;
        int i11 = 1 - (s9 * 3);
        int i12 = (s3 * 4) + 4;
        int i13 = i4 + 99;
        byte[] bArr = new byte[i11];
        byte[] bArr2 = mike;
        if (bArr2 == null) {
            int i14 = i12;
            byte[] bArr3 = bArr2;
            i10 = 0;
            int i15 = i11;
            int i16 = i14 + 1;
            i13 = i12 + i15;
            i12 = i16;
            bArr2 = bArr3;
            i5 = i10;
            i10 = i5 + 1;
            bArr[i5] = (byte) i13;
            if (i10 == i11) {
                return new String(bArr, 0);
            }
            int i17 = i13;
            i14 = i12;
            i12 = bArr2[i12];
            bArr3 = bArr2;
            i15 = i17;
            int i162 = i14 + 1;
            i13 = i12 + i15;
            i12 = i162;
            bArr2 = bArr3;
            i5 = i10;
            i10 = i5 + 1;
            bArr[i5] = (byte) i13;
            if (i10 == i11) {
            }
        } else {
            i5 = 0;
            i10 = i5 + 1;
            bArr[i5] = (byte) i13;
            if (i10 == i11) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(int i4, short s3, short s9, Object[] objArr) {
        int i5;
        int i10;
        int i11;
        int i12 = (s3 * 3) + 1;
        int i13 = (s9 * 3) + 4;
        int i14 = 99 - i4;
        byte[] bArr = new byte[i12];
        byte[] bArr2 = juliet;
        if (bArr2 == null) {
            byte[] bArr3 = bArr2;
            i11 = 0;
            int i15 = i13;
            i13 = i13 + (-i14) + 6;
            i5 = i15 + 1;
            bArr2 = bArr3;
            i10 = i11;
            i11 = i10 + 1;
            bArr[i10] = (byte) i13;
            if (i11 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b2 = bArr2[i5];
            byte[] bArr4 = bArr2;
            i15 = i5;
            i14 = b2;
            bArr3 = bArr4;
            i13 = i13 + (-i14) + 6;
            i5 = i15 + 1;
            bArr2 = bArr3;
            i10 = i11;
            i11 = i10 + 1;
            bArr[i10] = (byte) i13;
            if (i11 == i12) {
            }
        } else {
            i13 = i14;
            i5 = i13;
            i10 = 0;
            i11 = i10 + 1;
            bArr[i10] = (byte) i13;
            if (i11 == i12) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.cs] */
    public static void charlie(char c3, int i4, String str, String str2, Object[] objArr) {
        int i5;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        lima = (kilo + 113) % 128;
        char[] charArray = str2.toCharArray();
        lima = (kilo + 29) % 128;
        char[] charArray2 = str.toCharArray();
        lima = (kilo + 71) % 128;
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        ?? obj = new Object();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c3);
        cArr2[2] = (char) (cArr2[2] + ((char) i4));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        obj.component5 = 0;
        while (obj.component5 < length3) {
            kilo = (lima + 107) % 128;
            try {
                Object[] objArr2 = new Object[i15];
                objArr2[i16] = obj;
                Object D8871 = uH18377.D8871(227711276);
                if (D8871 == null) {
                    int indexOf = 51 - TextUtils.indexOf((CharSequence) "", '0');
                    int i17 = (ExpandableListView.getPackedPositionForChild(i16, i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i16, i16) == 0L ? 0 : -1)) + 2641;
                    j5 = 0;
                    char jumpTapTimeout = (char) (23984 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    byte b2 = (byte) i16;
                    i5 = i14;
                    byte b4 = b2;
                    String alpha2 = alpha(b2, b4, (byte) (b4 | 21));
                    Class[] clsArr = new Class[i15];
                    clsArr[i16] = Object.class;
                    D8871 = uH18377.setPivotYN16904(indexOf, i17, jumpTapTimeout, -769049607, false, alpha2, clsArr);
                } else {
                    i5 = i14;
                    j5 = 0;
                }
                int intValue = ((Integer) ((Method) D8871).invoke(null, objArr2)).intValue();
                Object[] objArr3 = new Object[i15];
                objArr3[i16] = obj;
                Object D88712 = uH18377.D8871(1974380961);
                if (D88712 == null) {
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 51;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 3469;
                    char edgeSlop2 = (char) (54087 - (ViewConfiguration.getEdgeSlop() >> 16));
                    byte b6 = (byte) i16;
                    i10 = i16;
                    byte b10 = b6;
                    String alpha3 = alpha(b6, b10, (byte) (b10 | 22));
                    Class[] clsArr2 = new Class[i15];
                    clsArr2[i10] = Object.class;
                    D88712 = uH18377.setPivotYN16904(edgeSlop, pressedStateDuration, edgeSlop2, -1441461388, false, alpha3, clsArr2);
                } else {
                    i10 = i16;
                }
                int intValue2 = ((Integer) ((Method) D88712).invoke(null, objArr3)).intValue();
                int i18 = cArr[obj.component5 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i5] = Integer.valueOf(cArr2[intValue]);
                objArr4[i15] = Integer.valueOf(i18);
                objArr4[i10] = obj;
                Object D88713 = uH18377.D8871(-1713517298);
                Class cls = Integer.TYPE;
                if (D88713 == null) {
                    int packedPositionChild = 51 - ExpandableListView.getPackedPositionChild(j5);
                    int jumpTapTimeout2 = 2227 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    char c4 = (char) (16952 - (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1)));
                    i12 = i15;
                    byte b11 = (byte) i10;
                    byte b12 = b11;
                    i11 = intValue2;
                    String alpha4 = alpha(b11, b12, (byte) (b12 | 20));
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i10] = Object.class;
                    clsArr3[i12] = cls;
                    clsArr3[i5] = cls;
                    D88713 = uH18377.setPivotYN16904(packedPositionChild, jumpTapTimeout2, c4, 1181118427, false, alpha4, clsArr3);
                } else {
                    i11 = intValue2;
                    i12 = i15;
                }
                ((Method) D88713).invoke(null, objArr4);
                int i19 = cArr[i11] * 32718;
                Object[] objArr5 = new Object[i5];
                objArr5[i12] = Integer.valueOf(cArr2[intValue]);
                objArr5[0] = Integer.valueOf(i19);
                Object D88714 = uH18377.D8871(-510148489);
                if (D88714 == null) {
                    int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 52;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3726;
                    char combineMeasuredStates2 = (char) (54864 - View.combineMeasuredStates(0, 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    String alpha5 = alpha(b13, b14, (byte) (b14 | 19));
                    i13 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[0] = cls;
                    clsArr4[i12] = cls;
                    D88714 = uH18377.setPivotYN16904(combineMeasuredStates, absoluteGravity, combineMeasuredStates2, 1043096226, false, alpha5, clsArr4);
                } else {
                    i13 = 2;
                }
                cArr2[i11] = ((Character) ((Method) D88714).invoke(null, objArr5)).charValue();
                cArr[i11] = obj.component9;
                int i20 = obj.component5;
                cArr3[i20] = (char) ((((r1 ^ charArray2[i20]) ^ (alpha ^ 2988085957400289853L)) ^ ((int) (bravo ^ 2988085957400289853L))) ^ ((char) (charlie ^ 2988085957400289853L)));
                obj.component5 = i20 + 1;
                i14 = i13;
                i15 = i12;
                i16 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.cz] */
    public static void delta(String str, int i4, Object[] objArr) {
        int i5;
        int i10;
        int i11;
        int i12 = 1;
        char[] charArray = str.toCharArray();
        lima = (kilo + 33) % 128;
        char[] cArr = charArray;
        ?? obj = new Object();
        char[] cArr2 = new char[cArr.length];
        obj.D8871 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i13 = obj.D8871;
            if (i13 < cArr.length) {
                int i14 = kilo + 61;
                lima = i14 % 128;
                int i15 = 58224;
                if (i14 % 2 == 0) {
                    cArr3[0] = cArr[i13];
                    cArr3[i12] = cArr[i13];
                    i5 = i12;
                } else {
                    cArr3[0] = cArr[i13];
                    cArr3[i12] = cArr[i13 + i12];
                    i5 = 0;
                }
                while (i5 < 16) {
                    char c3 = cArr3[i12];
                    char c4 = cArr3[0];
                    int i16 = i12;
                    char[] cArr4 = cArr;
                    int i17 = (c4 + i15) ^ ((c4 << 4) + ((char) (foxtrot ^ (-6042376207359611928L))));
                    int i18 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(golf);
                        objArr2[2] = Integer.valueOf(i18);
                        objArr2[i16] = Integer.valueOf(i17);
                        objArr2[0] = Integer.valueOf(c3);
                        Object D8871 = uH18377.D8871(329288861);
                        Class cls = Integer.TYPE;
                        if (D8871 == null) {
                            int lastIndexOf = TextUtils.lastIndexOf("", '0') + 52;
                            int alpha2 = 2796 - Color.alpha(0);
                            char myTid = (char) (32779 - (Process.myTid() >> 22));
                            i10 = 329288861;
                            byte b2 = (byte) 0;
                            byte b4 = b2;
                            i11 = 32779;
                            String alpha3 = alpha(b2, b4, b4);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = cls;
                            clsArr[i16] = cls;
                            clsArr[2] = cls;
                            clsArr[3] = cls;
                            D8871 = uH18377.setPivotYN16904(lastIndexOf, alpha2, myTid, -870633912, false, alpha3, clsArr);
                        } else {
                            i10 = 329288861;
                            i11 = 32779;
                        }
                        char charValue = ((Character) ((Method) D8871).invoke(null, objArr2)).charValue();
                        cArr3[i16] = charValue;
                        char c10 = cArr3[0];
                        int i19 = (charValue + i15) ^ ((charValue << 4) + ((char) (delta ^ (-6042376207359611928L))));
                        int i20 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(echo);
                        objArr3[2] = Integer.valueOf(i20);
                        objArr3[i16] = Integer.valueOf(i19);
                        objArr3[0] = Integer.valueOf(c10);
                        Object D88712 = uH18377.D8871(i10);
                        if (D88712 == null) {
                            int pressedStateDuration = 51 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int combineMeasuredStates = 2796 - View.combineMeasuredStates(0, 0);
                            char alpha4 = (char) (Color.alpha(0) + i11);
                            byte b6 = (byte) 0;
                            byte b10 = b6;
                            String alpha5 = alpha(b6, b10, b10);
                            Class[] clsArr2 = new Class[4];
                            clsArr2[0] = cls;
                            clsArr2[i16] = cls;
                            clsArr2[2] = cls;
                            clsArr2[3] = cls;
                            D88712 = uH18377.setPivotYN16904(pressedStateDuration, combineMeasuredStates, alpha4, -870633912, false, alpha5, clsArr2);
                        }
                        cArr3[0] = ((Character) ((Method) D88712).invoke(null, objArr3)).charValue();
                        i15 -= 40503;
                        i5++;
                        cArr = cArr4;
                        i12 = i16;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i21 = i12;
                char[] cArr5 = cArr;
                int i22 = obj.D8871;
                cArr2[i22] = cArr3[0];
                cArr2[i22 + 1] = cArr3[i21];
                Object[] objArr4 = new Object[2];
                objArr4[i21] = obj;
                objArr4[0] = obj;
                Object D88713 = uH18377.D8871(1372754349);
                if (D88713 == null) {
                    int i23 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1003;
                    char c11 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34235);
                    Class[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    clsArr3[i21] = Object.class;
                    D88713 = uH18377.setPivotYN16904(i23, capsMode, c11, -1905708168, false, "e", clsArr3);
                }
                ((Method) D88713).invoke(null, objArr4);
                cArr = cArr5;
                i12 = i21;
            } else {
                objArr[0] = new String(cArr2, 0, i4);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x12f6, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x12f9, code lost:
    
        r4 = -(-r4);
        r3 = (r3 | r4) + (r3 & r4);
        r2 = ((r2 | 1) << 1) - (r2 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x12f8, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1313, code lost:
    
        if (r3 < 25.2d) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x1315, code lost:
    
        r2 = new int[1];
        r3 = new int[1];
        r4 = (~(r78 & 261)) & (r78 | 261);
        r3[0] = r78;
        r2[0] = r4;
        r1 = new java.lang.Object[4];
        r1[0] = new int[1];
        r1[1] = r2;
        r1[2] = r3;
        r1[r25] = null;
        r0 = (int) java.lang.Runtime.getRuntime().totalMemory();
        r3 = ~r0;
        r0 = (((~(r0 | (-270538209))) | ((~(270612450 | r3)) | 781060112)) * 676) + ((((~(781134354 | r3)) | (-1051672563)) * 676) + (((1051672562 | r0) * (-676)) - 1473209053));
        r2 = (r0 & 16) + (r0 | 16);
        r0 = (r2 ^ 630388790) + ((r2 & 630388790) << 1);
        r2 = r0 << 13;
        r0 = ((~r0) & r2) | ((~r2) & r0);
        r2 = r0 >>> 17;
        r0 = ((~r0) & r2) | ((~r2) & r0);
        ((int[]) r1[0])[0] = r0 ^ (r0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x138f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x11da, code lost:
    
        if ((r2 | (r3 & ((((~(r4 | (-1076960677))) | (~(r6 | (-704938002)))) * 765) + ((((~((-1076960677) | r6)) | 1075842208) * 1530) + (((((~((-1075842209) | r6)) | (~((-1118469) | r4))) | (~((-704938002) | r4))) * 765) - 711846080))))) == 477111747) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x1e51, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x263e, code lost:
    
        r1 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x2641, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x051f, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x062a, code lost:
    
        if (((r0 & ((((~(r6 | 1199358107)) | 1095778448) * com.zendesk.service.HttpConstants.HTTP_MOVED_TEMP) + (((~((-134288645) | r6)) * (-604)) + ((((~((~r6) | (-134288645))) | (~(1333646751 | r6))) * (-302)) - 1169885566)))) | (((int) r2) & ((((-1447069699) | r5) * 756) + ((((~((-1447069699) | r78)) | 9843288) * (-756)) + 477363985)))) != (-1032769152)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x073f, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 542074309) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x10d8, code lost:
    
        if (((r2 & r6) | (r2 ^ r6)) != 477111747) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x11dc, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x11e0, code lost:
    
        if (r2 >= 28) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x11e2, code lost:
    
        r4 = com.fingerprintjs.android.fpjs_pro_internal.AbstractC1287z2.india;
        com.fingerprintjs.android.fpjs_pro_internal.AbstractC1287z2.hotel = ((r4 & 19) + (r4 | 19)) % 128;
        r4 = r0[r2];
        r7 = new java.lang.Object[1];
        charlie((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 0 - (~(-(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)))), "\uf68c卆踆ꉾ䚅҆ꭳ㓙\u2455蘓쫱ࢯ", "曷ﲆ\uef42ඹ", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x121a, code lost:
    
        r6 = new java.lang.Object[]{((java.lang.String) r7[0]).concat(java.lang.String.valueOf(r4))};
        r4 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(1565484532);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x1225, code lost:
    
        if (r4 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x1227, code lost:
    
        r53 = 52 - (android.os.Process.myPid() >> 22);
        r4 = android.text.TextUtils.getTrimmedLength("") + 2951;
        r7 = (char) android.graphics.Color.alpha(0);
        r11 = (byte) 1;
        r13 = (byte) (r11 - 1);
        r15 = new java.lang.Object[1];
        bravo(r13, r11, r13, r15);
        r4 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r53, r4, r7, -2097887455, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1260, code lost:
    
        r6 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r6)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x126d, code lost:
    
        r12 = 510787390;
        r13 = -560;
        r11 = ((560 * ((((r12 ^ r9) | r6) ^ r9) | ((r34 | r6) ^ r9))) + ((r13 * ((((r6 ^ r9) | r12) | r48) ^ r9)) + ((((r34 | r12) ^ r9) * r13) + ((561 * r6) + ((-559) * r12))))) + 444366512;
        r6 = (int) android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x12f4, code lost:
    
        if (((((int) (r11 >> 32)) & ((((~(r6 | (-474941411))) | (-962285001)) * 301) + ((((~((-962285001) | r6)) | (~((~r6) | 474941410))) * (-301)) + (((~(1029656554 | r6)) * (-301)) + 2098758936)))) | (((int) r11) & ((((~(2033710046 | r78)) | (~(r5 | 596483636))) * 979) + (((596483636 | r78) * (-979)) + (((~(2033710046 | r5)) * 979) + 836978942))))) != 0) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x13bb A[Catch: all -> 0x3ce9, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x14c7 A[Catch: all -> 0x3ce9, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x15a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1648 A[Catch: all -> 0x3ce9, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x17b8 A[Catch: all -> 0x3ce9, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x189f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1aac  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x1bc1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1c59  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x2010  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x2080  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x2667  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x27d2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x2833  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x31c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x31c5 A[Catch: all -> 0x3ce9, TRY_ENTER, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x267b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x27a9  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x27b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x27ab  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x1bbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x17fb  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0e28 A[Catch: all -> 0x3ce9, TryCatch #1 {all -> 0x3ce9, blocks: (B:3:0x0008, B:6:0x0014, B:7:0x0059, B:14:0x0188, B:17:0x019a, B:18:0x01dd, B:28:0x025e, B:30:0x0268, B:31:0x02a4, B:33:0x02cb, B:35:0x02d5, B:36:0x0316, B:38:0x031f, B:40:0x0330, B:41:0x0371, B:48:0x0777, B:50:0x0784, B:51:0x07c3, B:60:0x0e1e, B:62:0x0e28, B:63:0x0e68, B:75:0x0eed, B:77:0x0ef7, B:78:0x0f36, B:80:0x0f6a, B:82:0x0f74, B:83:0x0fb7, B:85:0x0fc0, B:87:0x0fd5, B:88:0x101b, B:94:0x121a, B:96:0x1227, B:97:0x1260, B:111:0x10dc, B:113:0x10f1, B:114:0x1138, B:122:0x13ae, B:124:0x13bb, B:125:0x13f8, B:127:0x14ba, B:129:0x14c7, B:130:0x1500, B:140:0x163b, B:142:0x1648, B:143:0x1684, B:145:0x17ab, B:147:0x17b8, B:148:0x17fd, B:160:0x1aae, B:162:0x1abb, B:163:0x1b09, B:197:0x20a8, B:199:0x20b2, B:200:0x20f1, B:214:0x2427, B:216:0x2434, B:217:0x2483, B:255:0x285d, B:257:0x2883, B:258:0x28d2, B:266:0x29e8, B:268:0x29ee, B:269:0x2a26, B:279:0x31c5, B:281:0x31d6, B:282:0x3219, B:288:0x3344, B:290:0x334a, B:291:0x3388, B:297:0x3529, B:299:0x3550, B:300:0x35a0, B:313:0x37ae, B:315:0x37bb, B:316:0x37fa, B:324:0x38fe, B:326:0x3904, B:327:0x3940, B:333:0x3a4e, B:335:0x3a54, B:336:0x3a93, B:342:0x3bac, B:344:0x3bd4, B:345:0x3c2c, B:360:0x2b7b, B:362:0x2b81, B:363:0x2bbf, B:371:0x2c99, B:373:0x2c9f, B:374:0x2ce1, B:380:0x2e2b, B:382:0x2e31, B:383:0x2e6d, B:388:0x2f99, B:390:0x2f9f, B:391:0x2fdb, B:588:0x0892, B:590:0x089c, B:591:0x08d5, B:595:0x040b, B:597:0x041d, B:598:0x0469, B:603:0x052a, B:605:0x053d, B:606:0x0582, B:611:0x062f, B:613:0x0642, B:614:0x0688), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0e73  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] echo(int i4, Object obj) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j5;
        int i15;
        int i16;
        int i17;
        int i18;
        Object D8871;
        String str;
        Object D88712;
        long j6;
        Object D88713;
        Object D88714;
        Object D88715;
        long j7;
        int i19;
        int i20;
        int i21;
        String[] strArr;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i28;
        int i29;
        int i30;
        long[] jArr;
        Matcher matcher;
        File[] fileArr;
        int i31;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i32;
        int i33;
        char c3;
        Object[] objArr;
        int i34;
        String[] strArr2;
        int i35;
        Object invoke;
        String[] strArr3;
        int i36;
        int i37;
        int i38;
        Object obj2;
        Object obj3;
        boolean equals;
        int i39 = 0;
        int i40 = 1;
        try {
            Object D88716 = uH18377.D8871(828738609);
            if (D88716 == null) {
                int gidForName = Process.getGidForName("") + 52;
                int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3418;
                i5 = 5;
                char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                i10 = 3;
                byte b2 = (byte) 1;
                byte b4 = (byte) (b2 - 1);
                i11 = 16;
                i12 = 7;
                Object[] objArr2 = new Object[1];
                bravo(b4, b2, b4, objArr2);
                D88716 = uH18377.setPivotYN16904(gidForName, resolveSizeAndState, c4, -287428892, false, (String) objArr2[0], new Class[0]);
            } else {
                i5 = 5;
                i10 = 3;
                i11 = 16;
                i12 = 7;
            }
            long longValue = ((Long) ((Method) D88716).invoke(null, null)).longValue();
            long j10 = 9878430;
            long j11 = -712;
            long j12 = -1;
            long j13 = longValue ^ j12;
            int i41 = -1;
            long j14 = i4;
            long j15 = j14 ^ j12;
            long j16 = (j15 | j10) ^ j12;
            long j17 = (712 * (j13 | j16)) + (j11 * ((((j10 | longValue) | j14) ^ j12) | (((j13 | j15) | j10) ^ j12))) + ((((j13 | j10) ^ j12) | j16) * j11) + (713 * longValue) + ((-711) * j10) + 1316364197;
            int i42 = ((~(1413335165 | i4)) * 420) + 1106762382;
            int i43 = ~i4;
            if (((((int) (j17 >> 32)) & (((2918445 | (~(1413335165 | i43))) * 420) + i42)) | (((int) j17) & ((((-438405142) | (~((-998821269) | i43))) * 56) + ((((~((-438405142) | i4)) | (-998821269)) * 56) - 1216699555)))) != 0) {
                int i44 = hotel;
                india = (((i44 | 55) << 1) - (i44 ^ 55)) % 128;
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                iArr2[0] = i4;
                iArr[0] = i4 ^ 271;
                Object[] objArr3 = new Object[4];
                objArr3[0] = new int[1];
                objArr3[1] = iArr;
                objArr3[2] = iArr2;
                objArr3[i10] = null;
                int myPid = Process.myPid();
                int i45 = -(-((((~(myPid | (-592586104))) | (-82064200)) * 376) + (((~((~myPid) | 592586103)) | 77861376) * (-376)) + ((666244656 | myPid) * 376) + 1827814695 + 16));
                int i46 = ((i45 | 630388790) << 1) - (i45 ^ 630388790);
                int i47 = i46 << 13;
                int i48 = (i47 & (~i46)) | ((~i47) & i46);
                int i49 = i48 >>> 17;
                int i50 = (i48 | i49) & (~(i48 & i49));
                int i51 = i50 << 5;
                ((int[]) objArr3[0])[0] = ((~i50) & i51) | ((~i51) & i50);
                return objArr3;
            }
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int i52 = -(-Gravity.getAbsoluteGravity(0, 0));
            Object[] objArr4 = new Object[1];
            charlie(tapTimeout, (i52 & (-574811477)) + (i52 | (-574811477)), "镸\ue74c銏皗\ud8e7铨寸킍줅䃮䫡", "ꭆ봒藝⮤", objArr4);
            Object[] objArr5 = {(String) objArr4[0]};
            Object D88717 = uH18377.D8871(-957097391);
            if (D88717 == null) {
                int trimmedLength = 52 - TextUtils.getTrimmedLength("");
                int resolveOpacity = 3158 - Drawable.resolveOpacity(0, 0);
                char fadingEdgeLength = (char) (58074 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                i13 = -957097391;
                byte b6 = (byte) 0;
                i14 = 58074;
                byte b10 = (byte) (b6 + 1);
                Object[] objArr6 = new Object[1];
                bravo((byte) (b10 - 1), b6, b10, objArr6);
                D88717 = uH18377.setPivotYN16904(trimmedLength, resolveOpacity, fadingEdgeLength, 424179844, false, (String) objArr6[0], new Class[]{String.class});
            } else {
                i13 = -957097391;
                i14 = 58074;
            }
            String str2 = (String) ((Method) D88717).invoke(null, objArr5);
            Class cls = Integer.TYPE;
            if (str2 != null) {
                int i53 = -Color.alpha(0);
                i16 = 50;
                Object[] objArr7 = new Object[1];
                i17 = 51;
                delta("㟄་唙捲䭟㱛", (i53 ^ 6) + ((i53 & 6) << 1), objArr7);
                String str3 = (String) objArr7[0];
                Object[] objArr8 = new Object[1];
                charlie((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getOffsetAfter("", 0), "怰籔慁샅跈ŀԛ㛍", "瑓אָ叨弖", objArr8);
                String[] strArr4 = {str3, (String) objArr8[0]};
                int i54 = 0;
                int i55 = 2;
                while (i54 < i55) {
                    if (str2.contains(strArr4[i54])) {
                        int i56 = (india + 57) % 128;
                        hotel = i56;
                        india = (((i56 | 19) << i40) - (i56 ^ 19)) % 128;
                        Object[] objArr9 = new Object[i40];
                        delta("\u087f䜮뀓鈝\u087f䜮\u0c5d㕪⏰꼣\u001b뒴雧Ḽ畡썖虯ׁ\u0380餞ⵟ笹ꬕ\ue12f", 22 - (~ExpandableListView.getPackedPositionGroup(0L)), objArr9);
                        String str4 = (String) objArr9[i39];
                        Object[] objArr10 = new Object[i40];
                        objArr10[i39] = str4;
                        Object D88718 = uH18377.D8871(i13);
                        if (D88718 == null) {
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 52;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 3158;
                            char c10 = (char) ((ExpandableListView.getPackedPositionForGroup(i39) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i39) == 0L ? 0 : -1)) + i14);
                            byte b11 = (byte) i39;
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr11 = new Object[i40];
                            bravo((byte) (b12 - 1), b11, b12, objArr11);
                            String str5 = (String) objArr11[i39];
                            Class[] clsArr = new Class[i40];
                            clsArr[i39] = String.class;
                            D88718 = uH18377.setPivotYN16904(packedPositionGroup, longPressTimeout, c10, 424179844, false, str5, clsArr);
                        }
                        Object invoke2 = ((Method) D88718).invoke(null, objArr10);
                        int alpha2 = Color.alpha(i39);
                        Object[] objArr12 = new Object[i40];
                        charlie((char) (((alpha2 | 27809) << i40) - (alpha2 ^ 27809)), ViewConfiguration.getWindowTouchSlop() >> 8, "υꩉ紈틞轐쐦ꏻ襚귳ฏ뜈衏⼅芀曻䝣饻⩗鲑郍艖ᡣ\ue50fᚘ镋幑숝锭ૐ꠶", "켣搮ꅤ啬", objArr12);
                        Object[] objArr13 = new Object[i40];
                        objArr13[i39] = (String) objArr12[i39];
                        Object D88719 = uH18377.D8871(i13);
                        if (D88719 == null) {
                            int i57 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int maxKeyCode = 3158 - (KeyEvent.getMaxKeyCode() >> 16);
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", i39) + i14);
                            byte b13 = (byte) i39;
                            byte b14 = (byte) (b13 + 1);
                            i37 = i39;
                            Object[] objArr14 = new Object[i40];
                            bravo((byte) (b14 - 1), b13, b14, objArr14);
                            String str6 = (String) objArr14[i37];
                            Class[] clsArr2 = new Class[i40];
                            clsArr2[i37] = String.class;
                            D88719 = uH18377.setPivotYN16904(i57, maxKeyCode, offsetBefore, 424179844, false, str6, clsArr2);
                        } else {
                            i37 = i39;
                        }
                        Object invoke3 = ((Method) D88719).invoke(null, objArr13);
                        if (invoke2 != null) {
                            Object[] objArr15 = new Object[2];
                            objArr15[i40] = 42;
                            objArr15[i37] = invoke2;
                            Object D887110 = uH18377.D8871(2072770498);
                            if (D887110 == null) {
                                int red = 51 - Color.red(i37);
                                int i58 = i37;
                                int rgb = Color.rgb(i58, i58, i58) + 16778425;
                                char modifierMetaStateMask = (char) (44355 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                byte b15 = (byte) i40;
                                byte b16 = (byte) (b15 - 1);
                                Object[] objArr16 = new Object[i40];
                                bravo(b16, b15, b16, objArr16);
                                String str7 = (String) objArr16[0];
                                Class[] clsArr3 = new Class[2];
                                clsArr3[0] = String.class;
                                clsArr3[i40] = cls;
                                D887110 = uH18377.setPivotYN16904(red, rgb, modifierMetaStateMask, -1540336361, false, str7, clsArr3);
                            }
                            long longValue2 = ((Long) ((Method) D887110).invoke(null, objArr15)).longValue();
                            long j18 = 868927280;
                            i38 = i40;
                            long j19 = j18 ^ j12;
                            long j20 = ((-283) * (((j19 | longValue2) ^ j12) | ((j19 | j14) ^ j12))) + ((-282) * longValue2) + (284 * j18);
                            long j21 = 283;
                            long j22 = longValue2 ^ j12;
                            long j23 = ((j21 * (((j19 | j22) | j14) ^ j12)) + ((((j22 | j18) ^ j12) * j21) + j20)) - 876372310;
                            int myPid2 = Process.myPid();
                            int i59 = ((int) (j23 >> 32)) & ((((~(myPid2 | 963925002)) | (-473301409)) * 529) + (((~((~myPid2) | 963925002)) | (-1031165355)) * 529) + 1520786966);
                            int i60 = ((int) j23) & ((((~((~Process.myUid()) | 816449636)) | (-1224845718)) * 494) + ((((-1224843666) | r11) * 494) - 1953829961));
                            if (((i59 & i60) | (i59 ^ i60)) == 477111747) {
                                j5 = j14;
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i61 = hotel;
                                    india = ((i61 & 95) + (i61 | 95)) % 128;
                                    char lastIndexOf = (char) (6591 - TextUtils.lastIndexOf("", '0', 0, 0));
                                    int i62 = -(-Process.getGidForName(""));
                                    int i63 = (i62 & 1) + (i62 | 1);
                                    Object[] objArr17 = new Object[1];
                                    charlie(lastIndexOf, i63, "咘䳽㿜⩹좆蜍᯽魻ό夦齓␤湝ἔﺂᖢ\uf48bꏼꍤ൭틦䢜ߧ⎃큏糍\udfe6뮉", "⸐ⷞ삙\u1719", objArr17);
                                    Object[] objArr18 = {(String) objArr17[0]};
                                    Object D887111 = uH18377.D8871(1565484532);
                                    if (D887111 == null) {
                                        int defaultSize = 52 - View.getDefaultSize(0, 0);
                                        int scrollDefaultDelay = 2951 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        char c11 = (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        byte b17 = (byte) 1;
                                        byte b18 = (byte) (b17 - 1);
                                        Object[] objArr19 = new Object[1];
                                        bravo(b18, b17, b18, objArr19);
                                        D887111 = uH18377.setPivotYN16904(defaultSize, scrollDefaultDelay, c11, -2097887455, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    long longValue3 = ((Long) ((Method) D887111).invoke(null, objArr18)).longValue();
                                    long j24 = -627413637;
                                    long j25 = longValue3 ^ j12;
                                    long j26 = 494;
                                    long j27 = j24 ^ j12;
                                    long j28 = (j26 * (((longValue3 | j24) ^ j12) | ((j27 | j25) ^ j12) | ((j15 | longValue3) ^ j12))) + ((longValue3 | j27 | j15) * j26) + ((-988) * (j24 | j25)) + ((-493) * longValue3) + (495 * j24) + 1582567539;
                                    int i64 = ~((int) SystemClock.elapsedRealtime());
                                    int foxtrot2 = ((int) (j28 >> 32)) & A0.z.foxtrot((~((-1869347511) | i64)) | 1714051764 | (~(432121099 | i64)), 184, (((~(i64 | 2146172863)) | (~((-155295747) | i64))) * (-184)) - 1019427974, 603742416);
                                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                                    int i65 = ((int) j28) & ((((~((~maxMemory) | 495154516)) | 1932380926) * 168) + (((~(495154516 | maxMemory)) | 1647086250) * (-168)) + ((((~(1932380926 | maxMemory)) | 209859840) * 336) - 501357939));
                                    i15 = 1;
                                    if (((foxtrot2 & i65) | (foxtrot2 ^ i65)) == 1) {
                                        equals = true;
                                        i15 = 1;
                                    } else {
                                        equals = false;
                                    }
                                } else {
                                    int i66 = -(-KeyEvent.getDeadChar(0, 0));
                                    int i67 = ((i66 | 13) << 1) - (i66 ^ 13);
                                    Object[] objArr20 = new Object[1];
                                    delta("\u087f䜮ꚩ팫͚훠ㄿ짙↳᩺魤\ua7d8锵맋", i67, objArr20);
                                    Object[] objArr21 = {(String) objArr20[0]};
                                    Object D887112 = uH18377.D8871(i13);
                                    if (D887112 == null) {
                                        int blue = Color.blue(0) + 52;
                                        int packedPositionType = 3158 - ExpandableListView.getPackedPositionType(0L);
                                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + i14);
                                        byte b19 = (byte) 0;
                                        byte b20 = (byte) (b19 + 1);
                                        Object[] objArr22 = new Object[1];
                                        bravo((byte) (b20 - 1), b19, b20, objArr22);
                                        D887112 = uH18377.setPivotYN16904(blue, packedPositionType, defaultSize2, 424179844, false, (String) objArr22[0], new Class[]{String.class});
                                    }
                                    Object invoke4 = ((Method) D887112).invoke(null, objArr21);
                                    i15 = 1;
                                    Object[] objArr23 = new Object[1];
                                    charlie((char) (34319 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-598094771) - (~(-(-(Process.myTid() >> 22)))), "ቛ", "仫姌ໜⲆ", objArr23);
                                    equals = invoke4.equals((String) objArr23[0]);
                                }
                                if (equals) {
                                    int[] iArr3 = new int[i15];
                                    int[] iArr4 = new int[i15];
                                    iArr4[0] = i4;
                                    iArr3[0] = (i4 & (-261)) | (i43 & 260);
                                    Object[] objArr24 = new Object[4];
                                    objArr24[0] = new int[i15];
                                    objArr24[i15] = iArr3;
                                    objArr24[2] = iArr4;
                                    objArr24[i10] = null;
                                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int foxtrot3 = A0.z.foxtrot((~(elapsedRealtime | 381058965)) | (~((-129462939) | elapsedRealtime)) | R.attr.permissionGroup, -69, (((~((-112620177) | elapsedRealtime)) | (~(397901727 | elapsedRealtime))) * 69) + 330265224, 1342407257);
                                    int i68 = (foxtrot3 ^ 16) + ((foxtrot3 & 16) << 1);
                                    int i69 = (i68 & 630388790) + (i68 | 630388790);
                                    int i70 = i69 ^ (i69 << 13);
                                    int i71 = i70 >>> 17;
                                    int i72 = ((~i70) & i71) | ((~i71) & i70);
                                    int i73 = i72 << 5;
                                    ((int[]) objArr24[0])[0] = (i72 | i73) & (~(i72 & i73));
                                    return objArr24;
                                }
                                i18 = 0;
                                Object[] objArr25 = new Object[i15];
                                charlie((char) Color.green(i18), View.getDefaultSize(i18, i18), "\uf114׃\udf40螶\uf44dଭ䑁ྩ", "눔\udff3\ue941揑", objArr25);
                                String str8 = (String) objArr25[i18];
                                int i74 = -(-(ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)));
                                int i75 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i76 = (i75 ^ (-1)) + (i75 << 1);
                                Object[] objArr26 = new Object[1];
                                charlie((char) (((i74 | 7326) << 1) - (i74 ^ 7326)), i76, "\udbe2㱋彭\uf523탂ꍌ", "\ued7b\u1b4f黩䬜", objArr26);
                                String str9 = (String) objArr26[0];
                                int i77 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i78 = (i77 ^ 6) + ((i77 & 6) << 1);
                                Object[] objArr27 = new Object[1];
                                delta("\ud9efᄿ춖寭剈낧\uef7f핖", i78, objArr27);
                                String str10 = (String) objArr27[0];
                                int i79 = -(-TextUtils.lastIndexOf("", '0', 0));
                                Object[] objArr28 = new Object[1];
                                charlie((char) (((i79 | 1) << 1) - (i79 ^ 1)), (-1117402999) - (~(-KeyEvent.keyCodeFromString(""))), "\u1f1f\udb55\uda7d윕ᷧ᠔瞋ϭꇤ", "誉旈⺽퉆", objArr28);
                                String str11 = (String) objArr28[0];
                                int i80 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i81 = i80 * HttpConstants.HTTP_SEE_OTHER;
                                int i82 = (i81 ^ (-2107)) + ((i81 & (-2107)) << 1);
                                int i83 = ~i80;
                                int i84 = ~((i83 ^ i43) | (i83 & i43) | 7);
                                int i85 = (i80 ^ 7) | (i80 & 7);
                                int i86 = ~((i85 & i4) | (i85 ^ i4));
                                int i87 = -(-(((i84 & i86) | (i84 ^ i86)) * (-302)));
                                int i88 = (i82 & i87) + (i82 | i87);
                                int i89 = -(-((~((i83 & 7) | (i83 ^ 7) | i4)) * (-604)));
                                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                                int i91 = ~((i80 & (-8)) | ((-8) ^ i80));
                                int i92 = ~((i4 ^ 7) | (i4 & 7));
                                int i93 = (((i91 & i92) | (i91 ^ i92)) * HttpConstants.HTTP_MOVED_TEMP) + i90;
                                Object[] objArr29 = new Object[1];
                                delta("\ue8dd碞ܔ躡料붝", i93, objArr29);
                                String str12 = (String) objArr29[0];
                                int i94 = -TextUtils.indexOf((CharSequence) "", '0');
                                int i95 = i94 * 375;
                                int i96 = ((-844857) ^ i95) + ((i95 & (-844857)) << 1);
                                int i97 = ~i94;
                                int i98 = ~((i97 ^ 1131) | (i97 & 1131));
                                int i99 = ~(i43 | i94);
                                int i100 = -(-(((i98 & i99) | (i98 ^ i99)) * (-374)));
                                int i101 = (((i96 ^ i100) + ((i96 & i100) << 1)) - (~(-(-((~(i94 | (-1132))) * 748))))) - 1;
                                int i102 = ~((i97 ^ (-1132)) | (i97 & (-1132)));
                                int i103 = -(-View.resolveSizeAndState(0, 0, 0));
                                int i104 = (1117002965 ^ i103) + ((i103 & 1117002965) << 1);
                                Object[] objArr30 = new Object[1];
                                charlie((char) ((((i102 & i99) | (i102 ^ i99)) * 374) + i101), i104, "傌\uf382ᡧ嬏蚑\uf87eʞ\ue664ਈ\ud8ec睚낵鰼", "핥鐜求氄", objArr30);
                                String str13 = (String) objArr30[0];
                                char c12 = (char) (7442 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                                int i105 = -TextUtils.getCapsMode("", 0, 0);
                                int i106 = ((-856061702) ^ i105) + ((i105 & (-856061702)) << 1);
                                Object[] objArr31 = new Object[1];
                                charlie(c12, i106, "뀎䘏넃ӽち", "禍麗ዌ퀝", objArr31);
                                String str14 = (String) objArr31[0];
                                int i107 = -AndroidCharacter.getMirror('0');
                                int i108 = (i107 ^ 54) + ((i107 & 54) << 1);
                                Object[] objArr32 = new Object[1];
                                delta("牯\uef4c剈낧휇⮙", i108, objArr32);
                                String str15 = (String) objArr32[0];
                                Object[] objArr33 = new Object[1];
                                charlie((char) (5403 - (ViewConfiguration.getTouchSlop() >> 8)), ViewConfiguration.getScrollBarFadeDuration() >> 16, "럊虘", "ૻ䖶ᬈ씕", objArr33);
                                String str16 = (String) objArr33[0];
                                int i109 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                Object[] objArr34 = new Object[1];
                                charlie((char) ((i109 ^ 10425) + ((i109 & 10425) << 1)), ViewConfiguration.getTapTimeout() >> 16, "됦輻髼潕妙㽅需\uf39f呎묤붑簾阮枌\u173e\ue2f6", "ﱝ윾맗䔨", objArr34);
                                String str17 = (String) objArr34[0];
                                int i110 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int i111 = (i110 & 10) + (i110 | 10);
                                Object[] objArr35 = new Object[1];
                                delta("\ue890徟၁덺罤⋠엃赯鬎\uec7a", i111, objArr35);
                                String str18 = (String) objArr35[0];
                                Object[] objArr36 = new Object[1];
                                charlie((char) View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString(""), "蓁쬸侓왽ⳁ\u177c迤쥼", "稓\uf5b2ꌳ姚", objArr36);
                                String str19 = (String) objArr36[0];
                                Object[] objArr37 = new Object[1];
                                charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getPressedStateDuration() >> 16, "췈舶⭞ꨒ溻̥鸐众ⱋ\ue88aﱗᵪ", "⍏⾪㞼㚅", objArr37);
                                String str20 = (String) objArr37[0];
                                char c13 = (char) (23855 - (~(-View.resolveSize(0, 0))));
                                int axisFromString = MotionEvent.axisFromString("");
                                int i112 = axisFromString * 50;
                                int i113 = ~(((-2) ^ i43) | ((-2) & i43));
                                int i114 = ~(((-2) ^ axisFromString) | ((-2) & axisFromString));
                                int i115 = (((i113 & i114) | (i113 ^ i114)) * 98) + (((i112 | (-97)) << 1) - (i112 ^ (-97)));
                                int i116 = ~axisFromString;
                                int i117 = -(-(((~((i116 & i43) | (i116 ^ i43))) | (-2) | (~((axisFromString ^ i4) | (axisFromString & i4)))) * (-49)));
                                int i118 = ((i115 | i117) << 1) - (i117 ^ i115);
                                int i119 = ~(((-2) ^ i4) | ((-2) & i4));
                                int i120 = ~(axisFromString | 1);
                                int i121 = (i118 - (~(((i120 & i119) | (i119 ^ i120)) * 49))) - 1;
                                Object[] objArr38 = new Object[1];
                                charlie(c13, i121, "茏뼔俠릹鲾檫答ﮐ嶆㓣䙈뼐멣ᆖ", "䴪痱そ婝", objArr38);
                                String str21 = (String) objArr38[0];
                                Object[] objArr39 = new Object[1];
                                delta("ⵟ笹\u12d7杙嵔戃实랸", 6 - (~(ViewConfiguration.getEdgeSlop() >> 16)), objArr39);
                                String str22 = (String) objArr39[0];
                                int i122 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int i123 = (i122 ^ 7) + ((i122 & 7) << 1);
                                Object[] objArr40 = new Object[1];
                                delta("\ue916ሧ挰듖廈轳䤜벛", i123, objArr40);
                                String str23 = (String) objArr40[0];
                                int i124 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i125 = (i124 & 6) + (i124 | 6);
                                Object[] objArr41 = new Object[1];
                                delta("ꤣ㎳料붝\ue16c돘\ude78讣", i125, objArr41);
                                String str24 = (String) objArr41[0];
                                int i126 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                Object[] objArr42 = new Object[1];
                                charlie((char) ((64436 ^ i126) + ((i126 & 64436) << 1)), ViewConfiguration.getEdgeSlop() >> 16, "뀦ᎄ", "퓏퀣떆拻", objArr42);
                                String str25 = (String) objArr42[0];
                                int i127 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int i128 = (i127 & 19) + (i127 | 19);
                                Object[] objArr43 = new Object[1];
                                delta("磺㊭⥟듵븆歔杙ᶒ跉渰铲迣縇\u16fe\u0edb뾦˗圯䎍汥", i128, objArr43);
                                String str26 = (String) objArr43[0];
                                Object[] objArr44 = new Object[1];
                                delta("磺㊭㟄་笠麑", 5 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr44);
                                String str27 = (String) objArr44[0];
                                int i129 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i130 = (i129 ^ 3) + ((i129 & 3) << 1);
                                Object[] objArr45 = new Object[1];
                                delta("䮺\uf3c8", i130, objArr45);
                                String str28 = (String) objArr45[0];
                                Object[] objArr46 = new Object[1];
                                charlie((char) (TextUtils.lastIndexOf("", '0', 0) + 56400), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "碑蟡יּ\ue628춉זּ턍ᗂ늅ﲫ㝻鉹뷤캟홡翦", "Ƒ\ue32f佅\ua7dc", objArr46);
                                String str29 = (String) objArr46[0];
                                Object[] objArr47 = new Object[1];
                                delta("ۗ൷虯ׁ瘛ꪯ\ue73eன贘눴", 8 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr47);
                                String str30 = (String) objArr47[0];
                                Object[] objArr48 = new Object[1];
                                charlie((char) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0')) ^ (-1))), View.MeasureSpec.makeMeasureSpec(0, 0), "䉀ᅎ딍\u0de1Ổ蛏㕏ㆷ惡耂", "憊\uaada锿\uf45b", objArr48);
                                String str31 = (String) objArr48[0];
                                int i131 = -(-ExpandableListView.getPackedPositionType(0L));
                                int i132 = (i131 & 11) + (i131 | 11);
                                Object[] objArr49 = new Object[1];
                                delta("ۗ൷虯ׁ剈낧騵簙\ue16c돘ᤷ\ueb4a", i132, objArr49);
                                String str32 = (String) objArr49[0];
                                Object[] objArr50 = new Object[1];
                                delta("嵔戃杙ᶒᄿ淆ᣥ直╾\ue60e럙螕", 10 - (~Color.argb(0, 0, 0, 0)), objArr50);
                                String str33 = (String) objArr50[0];
                                int i133 = -(-View.combineMeasuredStates(0, 0));
                                int i134 = (i133 & 15) + (i133 | 15);
                                Object[] objArr51 = new Object[1];
                                delta("嵔戃杙ᶒᄿ淆⦾㜈塅ⰻᣥ直╾\ue60e럙螕", i134, objArr51);
                                String str34 = (String) objArr51[0];
                                int i135 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int i136 = ((i135 | 14) << 1) - (i135 ^ 14);
                                Object[] objArr52 = new Object[1];
                                delta("嵔戃杙ᶒᄿ淆岾䆈지肇ᝪꕌ줷獱", i136, objArr52);
                                String[] strArr5 = {str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, (String) objArr52[0]};
                                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                int i137 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int i138 = ((-574811477) ^ i137) + ((i137 & (-574811477)) << 1);
                                Object[] objArr53 = new Object[1];
                                charlie(longPressTimeout2, i138, "镸\ue74c銏皗\ud8e7铨寸킍줅䃮䫡", "ꭆ봒藝⮤", objArr53);
                                Object[] objArr54 = {(String) objArr53[0]};
                                D8871 = uH18377.D8871(i13);
                                if (D8871 == null) {
                                    int i139 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 52;
                                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 3158;
                                    char combineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + i14);
                                    byte b21 = (byte) 0;
                                    byte b22 = (byte) (b21 + 1);
                                    Object[] objArr55 = new Object[1];
                                    bravo((byte) (b22 - 1), b21, b22, objArr55);
                                    D8871 = uH18377.setPivotYN16904(i139, capsMode, combineMeasuredStates, 424179844, false, (String) objArr55[0], new Class[]{String.class});
                                }
                                str = (String) ((Method) D8871).invoke(null, objArr54);
                                if (str != null) {
                                    int i140 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i141 = ((i140 | 6) << 1) - (i140 ^ 6);
                                    Object[] objArr56 = new Object[1];
                                    delta("㟄་唙捲䭟㱛", i141, objArr56);
                                    String str35 = (String) objArr56[0];
                                    Object[] objArr57 = new Object[1];
                                    charlie((char) View.combineMeasuredStates(0, 0), (-2) - ((-TextUtils.indexOf((CharSequence) "", '0', 0)) ^ (-1)), "怰籔慁샅跈ŀԛ㛍", "瑓אָ叨弖", objArr57);
                                    String[] strArr6 = {str35, (String) objArr57[0]};
                                    int i142 = 0;
                                    while (true) {
                                        if (i142 >= 2) {
                                            break;
                                        }
                                        int i143 = india;
                                        int i144 = ((i143 | 15) << 1) - (i143 ^ 15);
                                        hotel = i144 % 128;
                                        if (i144 % 2 != 0) {
                                            str.contains(strArr6[i142]);
                                            throw null;
                                        }
                                        if (str.contains(strArr6[i142])) {
                                            int i145 = -(-Color.red(0));
                                            int i146 = (i145 ^ 23) + ((i145 & 23) << 1);
                                            Object[] objArr58 = new Object[1];
                                            delta("\u087f䜮뀓鈝\u087f䜮\u0c5d㕪⏰꼣\u001b뒴雧Ḽ畡썖虯ׁ\u0380餞ⵟ笹ꬕ\ue12f", i146, objArr58);
                                            Object[] objArr59 = {(String) objArr58[0]};
                                            Object D887113 = uH18377.D8871(i13);
                                            if (D887113 == null) {
                                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 52;
                                                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 3158;
                                                char c14 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58075);
                                                byte b23 = (byte) 0;
                                                byte b24 = (byte) (b23 + 1);
                                                Object[] objArr60 = new Object[1];
                                                bravo((byte) (b24 - 1), b23, b24, objArr60);
                                                D887113 = uH18377.setPivotYN16904(pressedStateDuration, capsMode2, c14, 424179844, false, (String) objArr60[0], new Class[]{String.class});
                                            }
                                            Object invoke5 = ((Method) D887113).invoke(null, objArr59);
                                            int i147 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i148 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                                            int i149 = ((i148 | 1) << 1) - (i148 ^ 1);
                                            Object[] objArr61 = new Object[1];
                                            charlie((char) (((i147 | 27809) << 1) - (i147 ^ 27809)), i149, "υꩉ紈틞轐쐦ꏻ襚귳ฏ뜈衏⼅芀曻䝣饻⩗鲑郍艖ᡣ\ue50fᚘ镋幑숝锭ૐ꠶", "켣搮ꅤ啬", objArr61);
                                            Object[] objArr62 = {(String) objArr61[0]};
                                            Object D887114 = uH18377.D8871(i13);
                                            if (D887114 == null) {
                                                int defaultSize3 = View.getDefaultSize(0, 0) + 52;
                                                int i150 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3158;
                                                char c15 = (char) (58075 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                byte b25 = (byte) 0;
                                                byte b26 = (byte) (b25 + 1);
                                                Object[] objArr63 = new Object[1];
                                                bravo((byte) (b26 - 1), b25, b26, objArr63);
                                                D887114 = uH18377.setPivotYN16904(defaultSize3, i150, c15, 424179844, false, (String) objArr63[0], new Class[]{String.class});
                                            }
                                            Object invoke6 = ((Method) D887114).invoke(null, objArr62);
                                            if (invoke5 != null) {
                                                Object[] objArr64 = {invoke5, 42};
                                                Object D887115 = uH18377.D8871(2072770498);
                                                if (D887115 == null) {
                                                    int i151 = 52 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1209;
                                                    char c16 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 44355);
                                                    byte b27 = (byte) 1;
                                                    byte b28 = (byte) (b27 - 1);
                                                    Object[] objArr65 = new Object[1];
                                                    bravo(b28, b27, b28, objArr65);
                                                    D887115 = uH18377.setPivotYN16904(i151, keyRepeatTimeout, c16, -1540336361, false, (String) objArr65[0], new Class[]{String.class, cls});
                                                }
                                                long longValue4 = ((Long) ((Method) D887115).invoke(null, objArr64)).longValue();
                                                long j29 = 1592589748;
                                                long j30 = 868;
                                                long j31 = j29 ^ j12;
                                                long j32 = longValue4 ^ j12;
                                                long j33 = j31 | j32;
                                                long j34 = ((867 * ((((j33 | j15) ^ j12) | (((j31 | longValue4) | j5) ^ j12)) | (((j32 | j29) | j5) ^ j12))) + (((-1734) * (((j33 ^ j12) | ((j31 | j5) ^ j12)) | ((j32 | j5) ^ j12))) + (((-867) * (((j31 | j15) ^ j12) | ((j32 | j15) ^ j12))) + ((j30 * longValue4) + (j30 * j29))))) - 1600034778;
                                                int i152 = ((int) (j34 >> 32)) & ((((~(1022271247 | i43)) | (-2112855888) | (~((-744884998) | i4))) * 676) + (((~((-1835469638) | i43)) | 1090584640) * 676) + (((-1090584641) | i4) * (-676)) + 1470928658);
                                                int i153 = ((int) j34) & ((((~((-1864801704) | i43)) | 992939182) * 217) + (((~((-992939183) | i4)) | 723913894) * 217) + (((~((-992939183) | i43)) | (~((-1864801704) | i4))) * 217) + 483821770);
                                            }
                                            if (invoke6 != null) {
                                                Object[] objArr66 = {invoke6, 42};
                                                Object D887116 = uH18377.D8871(2072770498);
                                                if (D887116 == null) {
                                                    int i154 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50;
                                                    int i155 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1208;
                                                    char indexOf = (char) (TextUtils.indexOf("", "", 0) + 44356);
                                                    byte b29 = (byte) 1;
                                                    byte b30 = (byte) (b29 - 1);
                                                    Object[] objArr67 = new Object[1];
                                                    bravo(b30, b29, b30, objArr67);
                                                    D887116 = uH18377.setPivotYN16904(i154, i155, indexOf, -1540336361, false, (String) objArr67[0], new Class[]{String.class, cls});
                                                }
                                                long longValue5 = ((Long) ((Method) D887116).invoke(null, objArr66)).longValue();
                                                long j35 = 1573635742;
                                                int romeo = ao.ad.romeo();
                                                long j36 = 306;
                                                long j37 = HttpConstants.HTTP_USE_PROXY;
                                                long j38 = romeo;
                                                long j39 = ((j37 * ((longValue5 ^ j12) | ((j35 | (j38 ^ j12)) ^ j12))) + (((((j35 | longValue5) ^ j12) | ((j35 | j38) ^ j12)) * j37) + ((j36 * longValue5) + ((j36 * j35) + 610)))) - 1581080772;
                                                int foxtrot4 = ((int) (j39 >> 32)) & A0.z.foxtrot(~((-303056961) | i4), -1504, (((~((-1941786356) | i4)) | 1638729395) * 1504) - 1320242614, -875280448);
                                                int i156 = (int) j39;
                                                int tango = ao.ad.tango(711031717);
                                                int i157 = ~tango;
                                            }
                                        } else {
                                            i142++;
                                        }
                                    }
                                }
                                Object[] objArr68 = new Object[1];
                                delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 21 - (~(-Process.getGidForName(""))), objArr68);
                                Object[] objArr69 = {(String) objArr68[0]};
                                D88712 = uH18377.D8871(1553409481);
                                if (D88712 == null) {
                                    int i158 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 50;
                                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 2279;
                                    char blue2 = (char) Color.blue(0);
                                    byte b31 = (byte) 1;
                                    byte b32 = (byte) (b31 - 1);
                                    Object[] objArr70 = new Object[1];
                                    bravo(b32, b31, b32, objArr70);
                                    D88712 = uH18377.setPivotYN16904(i158, tapTimeout2, blue2, -2094233828, false, (String) objArr70[0], new Class[]{String.class});
                                }
                                long longValue6 = ((Long) ((Method) D88712).invoke(null, objArr69)).longValue();
                                long j40 = 131352053;
                                long j41 = 130;
                                long j42 = longValue6 ^ j12;
                                long j43 = ((((j42 | j15) | j40) ^ j12) * j41) + (131 * longValue6) + ((-129) * j40);
                                long j44 = j42 | j40;
                                long j45 = ((j41 * (((longValue6 | (j40 ^ j12)) ^ j12) | ((j44 | j5) ^ j12))) + (((-260) * (j44 ^ j12)) + j43)) - 273999709;
                                int i159 = ((int) (j45 >> 32)) & ((((~((-418743600) | i4)) | (-1855970011)) * 529) + (((~(i43 | (-418743600))) | 274728229) * 529) + 1520786966);
                                int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                int i160 = ~freeMemory;
                                int i161 = ((int) j45) & ((((~(freeMemory | (-1376954818))) | 1342308480 | (~(i160 | 1515432405))) * 521) + ((1480786068 | freeMemory) * 521) + (((~(i160 | 1480786068)) | 1376954817) * (-1042)) + 301266666);
                                j6 = (i159 & i161) | (i159 ^ i161);
                                int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                                int i162 = -View.combineMeasuredStates(0, 0);
                                int i163 = (i162 ^ 210546266) + ((i162 & 210546266) << 1);
                                Object[] objArr71 = new Object[1];
                                charlie((char) ((scrollBarSize & 35772) + (scrollBarSize | 35772)), i163, "勮栔淶뫔Ꮃꕆ䌨衩명鱊嬐䑪व\uf297\udb50㠅\uefd2", "嫦貮밌箋", objArr71);
                                Object[] objArr72 = {(String) objArr71[0]};
                                D88713 = uH18377.D8871(1553409481);
                                if (D88713 == null) {
                                    int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 51;
                                    int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 2279;
                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    byte b33 = (byte) 1;
                                    byte b34 = (byte) (b33 - 1);
                                    Object[] objArr73 = new Object[1];
                                    bravo(b34, b33, b34, objArr73);
                                    D88713 = uH18377.setPivotYN16904(resolveSizeAndState2, capsMode3, scrollDefaultDelay2, -2094233828, false, (String) objArr73[0], new Class[]{String.class});
                                }
                                long longValue7 = ((Long) ((Method) D88713).invoke(null, objArr72)).longValue();
                                long j46 = 593875283;
                                long j47 = -947;
                                long j48 = 949;
                                long j49 = j48 * longValue7;
                                long j50 = -948;
                                long j51 = j46 ^ j12;
                                long j52 = longValue7 ^ j12;
                                long j53 = ((((j51 | j52) | j15) ^ j12) * j50) + ((j51 | ((j52 | j5) ^ j12)) * j50) + j49 + (j47 * j46);
                                long j54 = 948;
                                long j55 = (((j46 | j52) * j54) + j53) - 736522939;
                                int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                int i164 = (((~((~elapsedRealtime2) | 953173726)) | 1090855200) * (-245)) - 1694584030;
                                int i165 = ~(elapsedRealtime2 | 953173726);
                                int i166 = ((int) (j55 >> 32)) & (((i165 | (-1904567159)) * 245) + (i165 * (-245)) + i164);
                                int i167 = ((int) j55) & ((((~(375788313 | i4)) | (-1063670682) | (~((-373555729) | i43))) * 988) + (((~((-687882369) | i43)) | (~((-373555729) | i4))) * 988) + 768568557);
                                long j56 = (i166 & i167) | (i166 ^ i167);
                                if (j6 <= 0 && j56 > 0 && j56 - 3 < j6) {
                                    hotel = (india + 115) % 128;
                                    int[] iArr5 = new int[1];
                                    int[] iArr6 = new int[1];
                                    int[] iArr7 = new int[1];
                                    int i168 = (~(i4 & 247)) & (i4 | 247);
                                    iArr7[0] = i4;
                                    iArr6[0] = i168;
                                    Object[] objArr74 = new Object[4];
                                    objArr74[0] = iArr5;
                                    objArr74[1] = iArr6;
                                    objArr74[2] = iArr7;
                                    objArr74[i10] = null;
                                    int foxtrot5 = A0.z.foxtrot((~(i4 | 317223115)) | (~((-193298789) | i4)) | 151355684, -69, (((~((-41943105) | i4)) | (~(468578799 | i4))) * 69) + 549677932, 1814451575);
                                    int i169 = 630388789 - (~((foxtrot5 & 16) + (foxtrot5 | 16)));
                                    int i170 = i169 << 13;
                                    int i171 = (i170 & (~i169)) | ((~i170) & i169);
                                    int i172 = i171 >>> 17;
                                    int i173 = ((~i171) & i172) | ((~i172) & i171);
                                    int i174 = i173 << 5;
                                    iArr5[0] = (i173 | i174) & (~(i173 & i174));
                                    return objArr74;
                                }
                                Object[] objArr75 = new Object[1];
                                delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr75);
                                Object[] objArr76 = {(String) objArr75[0]};
                                D88714 = uH18377.D8871(1553409481);
                                if (D88714 == null) {
                                    int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 51;
                                    int pressedStateDuration2 = 2279 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                    char indexOf2 = (char) TextUtils.indexOf("", "", 0);
                                    byte b35 = (byte) 1;
                                    byte b36 = (byte) (b35 - 1);
                                    Object[] objArr77 = new Object[1];
                                    bravo(b36, b35, b36, objArr77);
                                    D88714 = uH18377.setPivotYN16904(tapTimeout3, pressedStateDuration2, indexOf2, -2094233828, false, (String) objArr77[0], new Class[]{String.class});
                                }
                                long longValue8 = ((Long) ((Method) D88714).invoke(null, objArr76)).longValue();
                                long j57 = 1869715806;
                                long j58 = 628;
                                long j59 = (j58 * longValue8) + (j58 * j57);
                                long j60 = -627;
                                long elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                long j61 = ((627 * ((((elapsedRealtime3 ^ j12) | longValue8) ^ j12) | ((j57 | elapsedRealtime3) ^ j12))) + (((j57 | (((longValue8 ^ j12) | elapsedRealtime3) ^ j12)) * j60) + ((((longValue8 | elapsedRealtime3) | (j57 ^ j12)) * j60) + j59))) - 2012363462;
                                int i175 = ((int) (j61 >> 32)) & ((((~(1494750493 | i43)) | (~((-57524083) | i43)) | (~((-1477443598) | i4))) * Smooth$Close.expectedVersionCode) + (((~((-1494750494) | i4)) | (~(57524082 | i4)) | (~((-40217187) | i43))) * (-568)) + (((~((-1494750494) | i43)) | 1477443597 | (~(57524082 | i43))) * (-1136)) + 1738041050);
                                int i176 = ((int) j61) & ((((~((-76554369) | i4)) | 553747753) * 366) + ((((~((-1190273751) | i4)) | 1667467135) * (-366)) - 1837825719));
                                long j62 = (i175 & i176) | (i175 ^ i176);
                                int i177 = -KeyEvent.normalizeMetaState(0);
                                int bravo2 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                int i178 = i177 * (-523);
                                int i179 = (i178 ^ 1052) + ((i178 & 1052) << 1);
                                int i180 = ~i177;
                                int i181 = ~((i180 & 4) | (i180 ^ 4));
                                int i182 = ~(((-5) ^ i177) | ((-5) & i177));
                                int i183 = (i181 ^ i182) | (i181 & i182);
                                int i184 = ~(((-5) ^ bravo2) | ((-5) & bravo2));
                                int i185 = (((i183 ^ i184) | (i183 & i184)) * 262) + i179;
                                int i186 = -(-((~((-5) | i177)) * (-786)));
                                int i187 = (i185 ^ i186) + ((i185 & i186) << 1);
                                int i188 = ~bravo2;
                                int i189 = ~((i188 & (-5)) | ((-5) ^ i188));
                                int i190 = (i189 & i181) | (i189 ^ i181);
                                Object[] objArr78 = new Object[1];
                                delta("ꔫ뾁ꎦⰶ", (((i190 & i182) | (i190 ^ i182)) * 262) + i187, objArr78);
                                Object[] objArr79 = {(String) objArr78[0]};
                                D88715 = uH18377.D8871(1553409481);
                                if (D88715 == null) {
                                    int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 51;
                                    int indexOf3 = TextUtils.indexOf("", "", 0) + 2279;
                                    char c17 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    byte b37 = (byte) 1;
                                    byte b38 = (byte) (b37 - 1);
                                    j7 = j62;
                                    Object[] objArr80 = new Object[1];
                                    bravo(b38, b37, b38, objArr80);
                                    D88715 = uH18377.setPivotYN16904(tapTimeout4, indexOf3, c17, -2094233828, false, (String) objArr80[0], new Class[]{String.class});
                                } else {
                                    j7 = j62;
                                }
                                long longValue9 = ((Long) ((Method) D88715).invoke(null, objArr79)).longValue();
                                long j63 = 1859262404;
                                long j64 = -55;
                                long j65 = (j64 * longValue9) + (j64 * j63);
                                long j66 = 56;
                                long j67 = (int) Runtime.getRuntime().totalMemory();
                                long j68 = (((j63 | (((j67 ^ j12) | longValue9) ^ j12)) * j66) + (((-56) * ((j63 | longValue9) ^ j12)) + (((longValue9 | ((j63 | j67) ^ j12)) * j66) + j65))) - 2001910060;
                                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                int i191 = ~maxMemory2;
                                int i192 = (~(440292646 | i191)) | 1707125457;
                                int i193 = ~(maxMemory2 | (-269899047));
                                long j69 = (((int) (j68 >> 32)) & (((i193 | (~(i191 | 2147418103))) * 252) + ((i192 | i193) * (-252)) + 2136111974)) | (((int) j68) & ((((-1634691229) | (~(197464818 | i43))) * 56) + (((~((-1634691229) | i4)) | 197464818) * 56) + 1582408989));
                                i19 = -17;
                                if (j7 > 0) {
                                    int i194 = india;
                                    hotel = (i194 + 37) % 128;
                                    if (j69 > 0 && j69 + 100 < j7) {
                                        hotel = ((i194 ^ 25) + ((i194 & 25) << 1)) % 128;
                                        int[] iArr8 = new int[1];
                                        int[] iArr9 = new int[1];
                                        iArr9[0] = i4;
                                        iArr8[0] = i4 ^ 248;
                                        Object[] objArr81 = new Object[4];
                                        objArr81[0] = new int[1];
                                        objArr81[1] = iArr8;
                                        objArr81[2] = iArr9;
                                        objArr81[i10] = null;
                                        int i195 = ~((-14860510) | i4);
                                        int foxtrot6 = A0.z.foxtrot(i195 | 10633424, 220, (((-525382414) | i195) * (-220)) + 1213342517, 1632779314);
                                        int bravo3 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                        int i196 = foxtrot6 * (-115);
                                        int i197 = ((-1840) & i196) + (i196 | (-1840));
                                        int i198 = (~bravo3) | 16;
                                        int i199 = (~((i198 & foxtrot6) | (i198 ^ foxtrot6))) * (-116);
                                        int i200 = (i197 ^ i199) + ((i199 & i197) << 1);
                                        int i201 = -(-(((bravo3 ^ 16) | (bravo3 & 16)) * 116));
                                        int i202 = (i200 ^ i201) + ((i201 & i200) << 1);
                                        int i203 = ~foxtrot6;
                                        int i204 = ~((-17) | i203);
                                        int i205 = ~(i203 | bravo3);
                                        int i206 = (i202 - (~(-(-(((i205 & i204) | (i204 ^ i205)) * 116))))) - 1;
                                        int bravo4 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                        int i207 = i206 * (-103);
                                        int i208 = (i207 ^ (-505535930)) + ((i207 & (-505535930)) << 1);
                                        int i209 = ~((~i206) | (-630388791));
                                        int i210 = ~(((-630388791) ^ bravo4) | ((-630388791) & bravo4));
                                        int i211 = ((i209 & i210) | (i209 ^ i210)) * 104;
                                        int i212 = (i208 & i211) + (i211 | i208);
                                        int i213 = ~bravo4;
                                        int i214 = (i213 & i206) | (i213 ^ i206);
                                        int i215 = ((((~((i214 & 630388790) | (i214 ^ 630388790))) * (-104)) + i212) - (~((bravo4 | i206) * 104))) - 1;
                                        int i216 = i215 << 13;
                                        int i217 = (i216 | i215) & (~(i215 & i216));
                                        int i218 = i217 >>> 17;
                                        int i219 = (i217 | i218) & (~(i217 & i218));
                                        ((int[]) objArr81[0])[0] = i219 ^ (i219 << 5);
                                        return objArr81;
                                    }
                                }
                                char indexOf4 = (char) TextUtils.indexOf("", "", 0, 0);
                                int i220 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i221 = (i220 & 878354832) + (i220 | 878354832);
                                Object[] objArr82 = new Object[1];
                                charlie(indexOf4, i221, "ᑈ၆員븭ꠇ阶郸", "醰媡鄴\uf041", objArr82);
                                String str36 = (String) objArr82[0];
                                Object[] objArr83 = new Object[1];
                                delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ݼ媑ᓳ늄", 9 - (~(-ImageFormat.getBitsPerPixel(0))), objArr83);
                                String str37 = (String) objArr83[0];
                                int i222 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i223 = i222 * 758;
                                int i224 = ((i223 | (-9072)) << 1) - (i223 ^ (-9072));
                                int i225 = ((i222 ^ i43) | (i222 & i43)) * (-757);
                                int i226 = ((i224 | i225) << 1) - (i225 ^ i224);
                                int i227 = ((-13) & i222) | ((-13) ^ i222);
                                int i228 = (~((i227 & i4) | (i227 ^ i4))) * 1514;
                                int i229 = ((i226 | i228) << 1) - (i228 ^ i226);
                                int i230 = ~i222;
                                int i231 = (~((i230 & (-13)) | (i230 ^ (-13)))) | (~((-13) | i43));
                                int i232 = i222 | 12;
                                int i233 = ~((i232 & i4) | (i232 ^ i4));
                                int i234 = -(-(((i233 & i231) | (i231 ^ i233)) * 757));
                                int i235 = ((i229 | i234) << 1) - (i234 ^ i229);
                                Object[] objArr84 = new Object[1];
                                delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16\ude8f葵觢賯", i235, objArr84);
                                String str38 = (String) objArr84[0];
                                Object[] objArr85 = new Object[1];
                                charlie((char) TextUtils.indexOf("", ""), View.getDefaultSize(0, 0), "頡Ẳ꾾巭昸祩쁄螖Ǣ⍕棖\udc63", "Ⱇ\uf6f4䧚羅", objArr85);
                                String str39 = (String) objArr85[0];
                                char indexOf5 = (char) TextUtils.indexOf("", "", 0);
                                int i236 = -(-TextUtils.getOffsetBefore("", 0));
                                i20 = 1;
                                int i237 = ((i236 | 345185435) << 1) - (i236 ^ 345185435);
                                Object[] objArr86 = new Object[1];
                                charlie(indexOf5, i237, "\ued91蔮䗾䲬屽굋터쮭\ue326踍\ue466", "魻錜樂귷", objArr86);
                                String str40 = (String) objArr86[0];
                                int i238 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                int i239 = ((i238 | 4) << 1) - (i238 ^ 4);
                                Object[] objArr87 = new Object[1];
                                delta("佘ᦘݼ媑ᓳ늄", i239, objArr87);
                                String str41 = (String) objArr87[0];
                                int i240 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int i241 = (i240 ^ 4) + ((i240 & 4) << 1);
                                Object[] objArr88 = new Object[1];
                                delta("ꄉ郛⍖掎", i241, objArr88);
                                i21 = 0;
                                strArr = new String[]{str36, str37, str38, str39, str40, str41, (String) objArr88[0]};
                                i22 = 0;
                                i23 = i12;
                                while (true) {
                                    if (i22 >= i23) {
                                        i24 = i19;
                                        i25 = 0;
                                        break;
                                    }
                                    Object[] objArr89 = new Object[i20];
                                    objArr89[i21] = strArr[i22];
                                    Object D887117 = uH18377.D8871(1322889954);
                                    if (D887117 == null) {
                                        int windowTouchSlop = 52 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int defaultSize4 = View.getDefaultSize(i21, i21) + 1467;
                                        char c18 = (char) (TypedValue.complexToFloat(i21) > 0.0f ? 1 : (TypedValue.complexToFloat(i21) == 0.0f ? 0 : -1));
                                        i24 = i19;
                                        byte b39 = (byte) 1;
                                        byte b40 = (byte) (b39 - 1);
                                        strArr3 = strArr;
                                        i36 = i22;
                                        Object[] objArr90 = new Object[1];
                                        bravo(b40, b39, b40, objArr90);
                                        D887117 = uH18377.setPivotYN16904(windowTouchSlop, defaultSize4, c18, -1855844297, false, (String) objArr90[0], new Class[]{String.class});
                                    } else {
                                        strArr3 = strArr;
                                        i36 = i22;
                                        i24 = i19;
                                    }
                                    long longValue10 = ((Long) ((Method) D887117).invoke(null, objArr89)).longValue();
                                    long j70 = 966751312;
                                    long j71 = longValue10 ^ j12;
                                    long j72 = ((-988) * (j70 | j71)) + ((-493) * longValue10) + (495 * j70);
                                    long j73 = 494;
                                    long j74 = j70 ^ j12;
                                    long j75 = (j73 * (((j74 | j71) ^ j12) | ((j15 | longValue10) ^ j12) | ((j70 | longValue10) ^ j12))) + ((longValue10 | j74 | j15) * j73) + j72 + 582018059;
                                    int myPid3 = Process.myPid();
                                    int i242 = ((int) (j75 >> 32)) & ((((~(1686036956 | myPid3)) | (~((~myPid3) | (-1171703929)))) * 979) + (((-1171703929) | myPid3) * (-979)) + (((~(1686036956 | r6)) * 979) - 1836880106));
                                    int i243 = ((int) j75) & ((((-608446465) | i4) * 668) + (((-1022262981) | (~(414963429 | i4))) * 1336) + (((~((-1022262981) | i4)) | 414963429) * (-668)) + 824180373);
                                    if (((i242 & i243) | (i242 ^ i243)) != 0) {
                                        i25 = i36 + 90;
                                        com.fingerprintjs.android.fpjs_pro.c.bravo();
                                        break;
                                    }
                                    i22 = i36 + 1;
                                    i19 = i24;
                                    strArr = strArr3;
                                    i23 = 7;
                                    i21 = 0;
                                    i20 = 1;
                                }
                                if (i25 != 0) {
                                    int[] iArr10 = new int[1];
                                    int[] iArr11 = new int[1];
                                    iArr11[0] = i4;
                                    iArr10[0] = i25 ^ i4;
                                    Object[] objArr91 = new Object[4];
                                    objArr91[0] = new int[1];
                                    objArr91[1] = iArr10;
                                    objArr91[2] = iArr11;
                                    objArr91[i10] = null;
                                    int foxtrot7 = A0.z.foxtrot((~((~Process.myPid()) | 135099905)) | (-510462512), 494, (((-375392303) | r2) * 494) - 724067139, i11);
                                    int i244 = foxtrot7 * (-518);
                                    int i245 = (i244 ^ (-123878724)) + ((i244 & (-123878724)) << 1);
                                    int i246 = ~foxtrot7;
                                    int i247 = (i246 & i43) | (i246 ^ i43);
                                    int i248 = -(-(((~i247) | 630388790) * 519));
                                    int i249 = (foxtrot7 ^ 630388790) | (foxtrot7 & 630388790);
                                    int i250 = (((~((i247 & 630388790) | (i247 ^ 630388790))) | (~((i249 & i4) | (i249 ^ i4)))) * (-519)) + (i245 & i248) + (i248 | i245);
                                    int i251 = ~((i4 & 630388790) | (i4 ^ 630388790));
                                    int i252 = (((i251 & foxtrot7) | (foxtrot7 ^ i251)) * 519) + i250;
                                    int i253 = i252 << 13;
                                    int i254 = ((~i252) & i253) | ((~i253) & i252);
                                    int i255 = i254 >>> 17;
                                    int i256 = (i254 | i255) & (~(i254 & i255));
                                    int i257 = i256 << 5;
                                    ((int[]) objArr91[0])[0] = (i256 | i257) & (~(i256 & i257));
                                    return objArr91;
                                }
                                try {
                                    char c19 = (char) (41557 - (~Drawable.resolveOpacity(0, 0)));
                                    int deadChar = KeyEvent.getDeadChar(0, 0);
                                    Object[] objArr92 = new Object[1];
                                    charlie(c19, ((deadChar | (-877064250)) << 1) - (deadChar ^ (-877064250)), "쥖뙜衢\udf75锚䆣燕\ufbd1䍠릁\udd28⻐鑌", "옎뤏囋䂢", objArr92);
                                    try {
                                        Object[] objArr93 = {(String) objArr92[0]};
                                        Object D887118 = uH18377.D8871(i13);
                                        if (D887118 == null) {
                                            int deadChar2 = 52 - KeyEvent.getDeadChar(0, 0);
                                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3158;
                                            char windowTouchSlop2 = (char) (i14 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                            byte b41 = (byte) 0;
                                            byte b42 = (byte) (b41 + 1);
                                            Object[] objArr94 = new Object[1];
                                            bravo((byte) (b42 - 1), b41, b42, objArr94);
                                            D887118 = uH18377.setPivotYN16904(deadChar2, keyRepeatDelay, windowTouchSlop2, 424179844, false, (String) objArr94[0], new Class[]{String.class});
                                        }
                                        Object invoke7 = ((Method) D887118).invoke(null, objArr93);
                                        if (invoke7 != null) {
                                            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                            int i258 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i259 = i258 * (-574);
                                            int i260 = (i259 & (-931296218)) + (i259 | (-931296218));
                                            int i261 = ~i258;
                                            int i262 = ~((i261 ^ i43) | (i261 & i43));
                                            int i263 = (((i260 - (~(((i262 ^ r13) | (i262 & r13)) * 1150))) - 1) - (~(-(-(((~((i43 ^ (-926210189)) | ((-926210189) & i43))) | (~((926210188 ^ i4) | (926210188 & i4)))) * (-575)))))) - 1;
                                            int i264 = ~(i261 | i4);
                                            int i265 = ~((i258 & i43) | (i43 ^ i258));
                                            int i266 = ((i265 & i264) | (i264 ^ i265)) * 575;
                                            int i267 = ((i263 | i266) << 1) - (i266 ^ i263);
                                            Object[] objArr95 = new Object[1];
                                            charlie(threadPriority, i267, "몍ᢑ肏颏\ue9bc륨\ue3d7\uf2d2罃矀铤", "獐쬧ǈ荜", objArr95);
                                            try {
                                                Object[] objArr96 = {invoke7, new String[]{(String) objArr95[0]}};
                                                Object D887119 = uH18377.D8871(-1363379003);
                                                if (D887119 == null) {
                                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                                                    int packedPositionGroup2 = 1415 - ExpandableListView.getPackedPositionGroup(0L);
                                                    char c20 = (char) (3048 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                    byte b43 = (byte) 1;
                                                    byte b44 = (byte) (b43 - 1);
                                                    Object[] objArr97 = new Object[1];
                                                    bravo(b44, b43, b44, objArr97);
                                                    D887119 = uH18377.setPivotYN16904(jumpTapTimeout, packedPositionGroup2, c20, 1896341008, false, (String) objArr97[0], new Class[]{String.class, String[].class});
                                                }
                                                long longValue11 = ((Long) ((Method) D887119).invoke(null, objArr96)).longValue();
                                                long j76 = 718916906;
                                                long j77 = (246 * longValue11) + ((-244) * j76);
                                                long j78 = -245;
                                                long j79 = longValue11 ^ j12;
                                                long elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                                long j80 = ((((j79 | (elapsedRealtime4 ^ j12)) ^ j12) | ((j79 | j76) ^ j12)) * j78) + j77;
                                                long j81 = (j79 | elapsedRealtime4) ^ j12;
                                                long j82 = (245 * (j76 | j81)) + (j78 * j81) + j80 + 71210717;
                                                int myPid4 = Process.myPid();
                                                int i268 = ~myPid4;
                                                int i269 = ((int) (j82 >> 32)) & ((((~(myPid4 | (-704402671))) | 699138220 | (~(i268 | 738088190))) * 164) + ((732823740 | myPid4) * 164) + (((~(704402670 | i268)) | 732823740) * (-328)) + 1803314594);
                                                int i270 = ((int) j82) & (((330438457 | (~(1767664867 | i43))) * 160) + ((((~(i43 | 330438457)) | 1749838018) * (-160)) - 1966563339));
                                            } catch (Throwable th) {
                                                Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                        Object[] objArr98 = new Object[1];
                                        charlie((char) (((fadingEdgeLength2 | 18013) << 1) - (fadingEdgeLength2 ^ 18013)), ExpandableListView.getPackedPositionGroup(0L), "㔎䲲\uddd6\ue8f4\u0bd2⟻\uf6e4꧹\udb5d鰝ቋ엱ⷴ鰘ꁄ\ue349횡劬", "킄\uea36嵥\uee46", objArr98);
                                        try {
                                            Object[] objArr99 = {(String) objArr98[0]};
                                            Object D887120 = uH18377.D8871(i13);
                                            if (D887120 == null) {
                                                int defaultSize5 = View.getDefaultSize(0, 0) + 52;
                                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 3158;
                                                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + i14);
                                                byte b45 = (byte) 0;
                                                byte b46 = (byte) (b45 + 1);
                                                Object[] objArr100 = new Object[1];
                                                bravo((byte) (b46 - 1), b45, b46, objArr100);
                                                D887120 = uH18377.setPivotYN16904(defaultSize5, touchSlop, offsetAfter, 424179844, false, (String) objArr100[0], new Class[]{String.class});
                                            }
                                            invoke = ((Method) D887120).invoke(null, objArr99);
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                } catch (Exception unused) {
                                }
                                if (invoke != null) {
                                    hotel = (india + 49) % 128;
                                    int i271 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i272 = (i271 & 7) + (i271 | 7);
                                    Object[] objArr101 = new Object[1];
                                    delta("Ḍ쏒讫홣觢賯䯀人", i272, objArr101);
                                    if (invoke.equals((String) objArr101[0])) {
                                        Object[] objArr102 = new Object[1];
                                        charlie((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1297613763, "\ude89췈Ə웷ﶰ妆楣ᑚ蜵䉝⩹ȉ㕄렏⨬ꊸ漏挊쭵❅㌔毦㛦", "썑堃챍懁", objArr102);
                                        try {
                                            Object[] objArr103 = {(String) objArr102[0]};
                                            Object D887121 = uH18377.D8871(i13);
                                            if (D887121 == null) {
                                                int i273 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52;
                                                int i274 = 3159 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                char normalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + i14);
                                                byte b47 = (byte) 0;
                                                byte b48 = (byte) (b47 + 1);
                                                Object[] objArr104 = new Object[1];
                                                bravo((byte) (b48 - 1), b47, b48, objArr104);
                                                D887121 = uH18377.setPivotYN16904(i273, i274, normalizeMetaState, 424179844, false, (String) objArr104[0], new Class[]{String.class});
                                            }
                                            String str42 = (String) ((Method) D887121).invoke(null, objArr103);
                                            if (str42 != null) {
                                                india = (hotel + 19) % 128;
                                                int parseInt = Integer.parseInt(str42);
                                                if (parseInt != 0) {
                                                    hotel = (india + 87) % 128;
                                                    int i275 = (parseInt * 868) + 147560;
                                                    int i276 = ~((-171) | i43);
                                                    int i277 = ~parseInt;
                                                    int i278 = ~(i277 | i43);
                                                    int i279 = ((i276 & i278) | (i276 ^ i278)) * (-867);
                                                    int i280 = (i275 & i279) + (i275 | i279);
                                                    int i281 = ((-171) ^ i277) | ((-171) & i277);
                                                    int i282 = ~i281;
                                                    int i283 = ~(((-171) & i4) | ((-171) ^ i4));
                                                    int i284 = (i282 & i283) | (i282 ^ i283);
                                                    int i285 = ~((i277 ^ i4) | (i277 & i4));
                                                    int i286 = ((i284 & i285) | (i284 ^ i285)) * (-1734);
                                                    int i287 = ~(i281 | i43);
                                                    int i288 = (parseInt & (-171)) | ((-171) ^ parseInt);
                                                    int i289 = ~((i288 & i4) | (i288 ^ i4));
                                                    i26 = (((i280 & i286) + (i286 | i280)) - (~(-(-((((i289 & i287) | (i287 ^ i289)) | (~(((i277 ^ 170) | (i277 & 170)) | i4))) * 867))))) - 1;
                                                    if (i26 == 0) {
                                                        int i290 = hotel;
                                                        india = (((i290 | 17) << 1) - (i290 ^ 17)) % 128;
                                                        int[] iArr12 = new int[1];
                                                        int[] iArr13 = new int[1];
                                                        int i291 = ~(i4 & i26);
                                                        iArr13[0] = i4;
                                                        iArr12[0] = (i26 | i4) & i291;
                                                        Object[] objArr105 = new Object[4];
                                                        objArr105[0] = new int[1];
                                                        objArr105[1] = iArr12;
                                                        objArr105[2] = iArr13;
                                                        objArr105[i10] = null;
                                                        int foxtrot8 = A0.z.foxtrot(~(((int) SystemClock.elapsedRealtime()) | (-272711687)), -1504, (((~((-315703863) | r1)) | 42992176) * 1504) - 1149859809, 1424658464);
                                                        int i292 = ((foxtrot8 | 630388790) << 1) - (foxtrot8 ^ 630388790);
                                                        int i293 = i292 << 13;
                                                        int i294 = (i293 | i292) & (~(i292 & i293));
                                                        int i295 = i294 >>> 17;
                                                        int i296 = (i294 | i295) & (~(i294 & i295));
                                                        ((int[]) objArr105[0])[0] = i296 ^ (i296 << 5);
                                                        return objArr105;
                                                    }
                                                    Object[] objArr106 = new Object[1];
                                                    charlie((char) (41557 - (~(KeyEvent.getMaxKeyCode() >> 16))), (-877064251) - (~Color.green(0)), "쥖뙜衢\udf75锚䆣燕\ufbd1䍠릁\udd28⻐鑌", "옎뤏囋䂢", objArr106);
                                                    Object[] objArr107 = {(String) objArr106[0]};
                                                    Object D887122 = uH18377.D8871(i13);
                                                    if (D887122 == null) {
                                                        int size = 52 - View.MeasureSpec.getSize(0);
                                                        int indexOf6 = 3158 - TextUtils.indexOf("", "", 0, 0);
                                                        char c21 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58073);
                                                        byte b49 = (byte) 0;
                                                        byte b50 = (byte) (b49 + 1);
                                                        Object[] objArr108 = new Object[1];
                                                        bravo((byte) (b50 - 1), b49, b50, objArr108);
                                                        D887122 = uH18377.setPivotYN16904(size, indexOf6, c21, 424179844, false, (String) objArr108[0], new Class[]{String.class});
                                                    }
                                                    String str43 = (String) ((Method) D887122).invoke(null, objArr107);
                                                    if (str43 != null) {
                                                        int i297 = -ExpandableListView.getPackedPositionChild(0L);
                                                        int bravo5 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                                        int i298 = (i297 * 50) + 97;
                                                        int i299 = ~bravo5;
                                                        int i300 = ~i299;
                                                        int i301 = ~i297;
                                                        int i302 = (i300 | i301) * 98;
                                                        int i303 = (i298 ^ i302) + ((i298 & i302) << 1);
                                                        int i304 = ~((i301 ^ i299) | (i301 & i299));
                                                        int i305 = ~((i297 & bravo5) | (i297 ^ bravo5));
                                                        int i306 = -(-(((i305 & i304) | (i304 ^ i305)) * (-49)));
                                                        int i307 = ((i303 | i306) << 1) - (i303 ^ i306);
                                                        int i308 = i299 * 49;
                                                        char c22 = (char) ((i307 & i308) + (i307 | i308));
                                                        int i309 = -Color.alpha(0);
                                                        int i310 = (i309 ^ (-926210189)) + ((i309 & (-926210189)) << 1);
                                                        Object[] objArr109 = new Object[1];
                                                        charlie(c22, i310, "몍ᢑ肏颏\ue9bc륨\ue3d7\uf2d2罃矀铤", "獐쬧ǈ荜", objArr109);
                                                        String[] strArr7 = {(String) objArr109[0]};
                                                        int i311 = 0;
                                                        while (true) {
                                                            if (i311 > 0) {
                                                                Object[] objArr110 = new Object[1];
                                                                charlie((char) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionType(0L), "Ꚇ愃챢㇃쵡㓩鵼頴젥῀㶝좬", "宧ꎏ딃䊀", objArr110);
                                                                String str44 = (String) objArr110[0];
                                                                Object[] objArr111 = new Object[1];
                                                                charlie((char) (57362 - (~(-((Process.getThreadPriority(0) + 20) >> 6)))), KeyEvent.getDeadChar(0, 0), "쬮\uec83璴\ueff1儑틤⽿\uf3af籑Х燴আ\uf877銴\uee1e눌", "䜫ဩ\u135b嫠", objArr111);
                                                                String str45 = (String) objArr111[0];
                                                                int lastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                                                int i312 = lastIndexOf2 * (-381);
                                                                int i313 = (1992768 & i312) + (i312 | 1992768);
                                                                int i314 = ~lastIndexOf2;
                                                                int i315 = (i314 * (-191)) + i313;
                                                                int i316 = ~(i4 | 10379);
                                                                int i317 = -(-(((lastIndexOf2 & i316) | (lastIndexOf2 ^ i316)) * 191));
                                                                int i318 = (i315 & i317) + (i317 | i315);
                                                                int i319 = ~((i314 ^ 10379) | (i314 & 10379));
                                                                int i320 = ~((i43 ^ 10379) | (i43 & 10379));
                                                                int i321 = ((i319 & i320) | (i319 ^ i320)) * 191;
                                                                char c23 = (char) ((i318 ^ i321) + ((i321 & i318) << 1));
                                                                int i322 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int i323 = ((-1932137422) & i322) + (i322 | (-1932137422));
                                                                Object[] objArr112 = new Object[1];
                                                                charlie(c23, i323, "혮狰⊯ಶ\uf331㡊觯\uddb4㌮誎⋾鏩㠽凊漢∃䯾", "㉦헬誌\ue128", objArr112);
                                                                String str46 = (String) objArr112[0];
                                                                int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                                                Object[] objArr113 = new Object[1];
                                                                charlie((char) ((combineMeasuredStates2 & 10737) + (combineMeasuredStates2 | 10737)), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "冈빗은\ue225姁뿕", "딲ꥇ\uf148㘩", objArr113);
                                                                String str47 = (String) objArr113[0];
                                                                Object[] objArr114 = new Object[1];
                                                                charlie((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 1, "\uf68c卆踆ꉾ䚅҆ꭳ㓙\u2455蘓쫱ࢯ", "曷ﲆ\uef42ඹ", objArr114);
                                                                String str48 = (String) objArr114[0];
                                                                int i324 = -Color.alpha(0);
                                                                int i325 = ((i324 | 17) << 1) - (i324 ^ 17);
                                                                Object[] objArr115 = new Object[1];
                                                                delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ݼ媑ⵦḗ慑龽㒕缢\uf4d4雄", i325, objArr115);
                                                                String str49 = (String) objArr115[0];
                                                                Object[] objArr116 = new Object[1];
                                                                delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ݼ媑ⵦḗ\ue586㯥ꓳꇫ룙했ⲣ嶠\uf4d4雄", 21 - (ViewConfiguration.getScrollBarSize() >> 8), objArr116);
                                                                String str50 = (String) objArr116[0];
                                                                int i326 = -TextUtils.getOffsetBefore("", 0);
                                                                int bravo6 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                                                int i327 = i326 * (-523);
                                                                int i328 = (i327 ^ 4208) + ((i327 & 4208) << 1);
                                                                int i329 = ~i326;
                                                                int i330 = ~((i329 & 16) | (i329 ^ 16));
                                                                int i331 = ~(i24 | i326);
                                                                int i332 = (i331 & i330) | (i330 ^ i331);
                                                                int i333 = ~((i24 ^ bravo6) | (i24 & bravo6));
                                                                int i334 = -(-(((i332 & i333) | (i332 ^ i333)) * 262));
                                                                int i335 = (i328 ^ i334) + ((i328 & i334) << 1);
                                                                int i336 = ~((i24 & i326) | (i24 ^ i326));
                                                                int i337 = i336 * (-786);
                                                                int i338 = ~bravo6;
                                                                int i339 = (~((i24 & i338) | (i24 ^ i338))) | i330;
                                                                int i340 = (((i335 & i337) + (i337 | i335)) - (~(-(-(((i336 & i339) | (i339 ^ i336)) * 262))))) - 1;
                                                                Object[] objArr117 = new Object[1];
                                                                delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ࠍ宁퍻\ufa6fݼ媑ⵦḗ", i340, objArr117);
                                                                String str51 = (String) objArr117[0];
                                                                char c24 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                int i341 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int i342 = (1352799962 ^ i341) + ((i341 & 1352799962) << 1);
                                                                Object[] objArr118 = new Object[1];
                                                                charlie(c24, i342, "㶍뻜\uf8faủਰ睈뫦ቘ㿘㴏簵\ud91c↸訸韘䂘‗鞸鷓\ud828轍묗硔됾朊", "\uda65ꈖ⍐洸", objArr118);
                                                                String str52 = (String) objArr118[0];
                                                                int blue3 = Color.blue(0);
                                                                int bravo7 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                                                int i343 = blue3 * (-518);
                                                                int i344 = ((-5639466) ^ i343) + ((i343 & (-5639466)) << 1);
                                                                int i345 = ~blue3;
                                                                int i346 = ~bravo7;
                                                                int i347 = (i345 & i346) | (i345 ^ i346);
                                                                int i348 = (i344 - (~(-(-(((~i347) | 10887) * 519))))) - 1;
                                                                int i349 = ~((i347 & 10887) | (i347 ^ 10887));
                                                                int i350 = (blue3 ^ 10887) | (blue3 & 10887);
                                                                int i351 = ~((i350 & bravo7) | (i350 ^ bravo7));
                                                                int i352 = ~(bravo7 | 10887);
                                                                char c25 = (char) ((((blue3 & i352) | (blue3 ^ i352)) * 519) + (((i349 & i351) | (i349 ^ i351)) * (-519)) + i348);
                                                                int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
                                                                int bravo8 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                                                                int i353 = (touchSlop2 * 784) + 1040094681;
                                                                int i354 = ~touchSlop2;
                                                                int i355 = ~bravo8;
                                                                int i356 = (i354 ^ i355) | (i354 & i355);
                                                                int i357 = ((~((i356 & 1040093898) | (1040093898 ^ i356))) * (-783)) + i353;
                                                                int i358 = (i354 | (~(i355 | 1040093898))) * 783;
                                                                int i359 = (i357 ^ i358) + ((i358 & i357) << 1);
                                                                Object[] objArr119 = new Object[1];
                                                                charlie(c25, i359, "쿴䩻ꡐ⮴렦렴嘡⒙\ue4e7숆桿臊๎", "쫮ﺒ蜽쨪", objArr119);
                                                                int i360 = 0;
                                                                String str53 = (String) objArr119[0];
                                                                int i361 = -TextUtils.indexOf("", "", 0);
                                                                int i362 = (i361 ^ 9) + ((i361 & 9) << 1);
                                                                Object[] objArr120 = new Object[1];
                                                                delta("ⵥ诧㦄\uf803ᣠ\u2fe4觢賯\uf4d4雄", i362, objArr120);
                                                                String str54 = (String) objArr120[0];
                                                                Object[] objArr121 = new Object[1];
                                                                delta("佘ᦘ⚳첺ݼ媑ⵦḗ", 7 - (~(-(Process.myTid() >> 22))), objArr121);
                                                                String[] strArr8 = {str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, (String) objArr121[0]};
                                                                int i363 = 0;
                                                                while (i363 < 12) {
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append(strArr8[i363]);
                                                                    Object[] objArr122 = new Object[1];
                                                                    int i364 = i360;
                                                                    delta("䮺\uf3c8", 1 - (~(-(-View.getDefaultSize(i360, i360)))), objArr122);
                                                                    sb2.append((String) objArr122[i364]);
                                                                    Object[] objArr123 = new Object[1];
                                                                    objArr123[i364] = sb2.toString();
                                                                    Object D887123 = uH18377.D8871(-2104138125);
                                                                    if (D887123 == null) {
                                                                        int absoluteGravity = Gravity.getAbsoluteGravity(i364, i364) + 52;
                                                                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2951;
                                                                        char c26 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                                        byte b51 = (byte) 0;
                                                                        byte b52 = (byte) (b51 + 1);
                                                                        strArr2 = strArr8;
                                                                        i35 = i363;
                                                                        Object[] objArr124 = new Object[1];
                                                                        bravo(b52, b51, b52, objArr124);
                                                                        D887123 = uH18377.setPivotYN16904(absoluteGravity, pressedStateDuration3, c26, 1563346086, false, (String) objArr124[0], new Class[]{String.class});
                                                                    } else {
                                                                        strArr2 = strArr8;
                                                                        i35 = i363;
                                                                    }
                                                                    long longValue12 = ((Long) ((Method) D887123).invoke(null, objArr123)).longValue();
                                                                    long j83 = -240211895;
                                                                    long j84 = (111 * longValue12) + ((-109) * j83);
                                                                    long j85 = j83 ^ j12;
                                                                    long uptimeMillis = (longValue12 | ((int) SystemClock.uptimeMillis())) ^ j12;
                                                                    long j86 = ((110 * (((j85 | longValue12) ^ j12) | (((longValue12 ^ j12) | j83) ^ j12))) + ((220 * (((j83 | longValue12) ^ j12) | uptimeMillis)) + (((-220) * (j85 | uptimeMillis)) + j84))) - 989408635;
                                                                    int i365 = ((int) (j86 >> 32)) & (((~((-1748271281) | i4)) * 566) + ((((~(382414605 | i4)) | (-2130685886)) * (-566)) - 1940142186));
                                                                    int i366 = ~Process.myUid();
                                                                    int i367 = ((int) j86) & ((((~(i366 | (-2101272634))) | 1521117878) * 184) + (((-622100490) | i366) * 184) + 2144925757);
                                                                    if (((i365 & i367) | (i365 ^ i367)) != 0) {
                                                                        i27 = i35 + 110;
                                                                        break;
                                                                    }
                                                                    i363 = (i35 | 1) + (i35 & 1);
                                                                    strArr8 = strArr2;
                                                                    i360 = 0;
                                                                }
                                                            } else {
                                                                if (str43.contains(strArr7[i311])) {
                                                                    int i368 = hotel;
                                                                    india = ((i368 ^ 115) + ((i368 & 115) << 1)) % 128;
                                                                    break;
                                                                }
                                                                i311 = (i311 | 1) + (i311 & 1);
                                                            }
                                                        }
                                                    }
                                                    i27 = 0;
                                                    if (i27 != 0) {
                                                        hotel = (india + 75) % 128;
                                                        int[] iArr14 = new int[1];
                                                        int[] iArr15 = new int[1];
                                                        iArr15[0] = i4;
                                                        iArr14[0] = i27 ^ i4;
                                                        Object[] objArr125 = new Object[4];
                                                        objArr125[0] = new int[1];
                                                        objArr125[1] = iArr14;
                                                        objArr125[2] = iArr15;
                                                        objArr125[i10] = null;
                                                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                        int i369 = ~elapsedCpuTime;
                                                        int i370 = (~((-995866428) | i369)) | 407471371;
                                                        int i371 = ~(elapsedCpuTime | 1073739579);
                                                        int i372 = ((~(i369 | 485344523)) * 713) + (i371 * 1426) + ((i370 | i371) * (-713)) + 51975150;
                                                        int i373 = -(-((i372 ^ 16) + ((i372 & 16) << 1)));
                                                        int i374 = ((i373 | 630388790) << 1) - (i373 ^ 630388790);
                                                        int i375 = i374 << 13;
                                                        int i376 = (i375 | i374) & (~(i374 & i375));
                                                        int i377 = i376 >>> 17;
                                                        int i378 = ((~i376) & i377) | ((~i377) & i376);
                                                        int i379 = i378 << 5;
                                                        ((int[]) objArr125[0])[0] = (i378 | i379) & (~(i378 & i379));
                                                        return objArr125;
                                                    }
                                                    long[] jArr2 = {472001035};
                                                    int i380 = -(-(Process.myPid() >> 22));
                                                    int i381 = -View.MeasureSpec.getSize(0);
                                                    int i382 = (i381 & 1671536322) + (i381 | 1671536322);
                                                    Object[] objArr126 = new Object[1];
                                                    charlie((char) ((i380 ^ 26490) + ((i380 & 26490) << 1)), i382, "傁돺䧋뇕쀘댆䚞∶䲤压ꬃ㊇茏蚨鯬\ue53e这", "쉥ꆞ穣⑧", objArr126);
                                                    try {
                                                        BufferedInputStream bufferedInputStream5 = new BufferedInputStream(new FileInputStream((String) objArr126[0]));
                                                        long j87 = 0;
                                                        loop6: while (true) {
                                                            try {
                                                                int read = bufferedInputStream5.read();
                                                                if (read == i41) {
                                                                    try {
                                                                        bufferedInputStream5.close();
                                                                    } catch (Exception unused2) {
                                                                    }
                                                                    i28 = 0;
                                                                    break;
                                                                }
                                                                int i383 = hotel;
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                                india = ((i383 ^ 69) + ((i383 & 69) << 1)) % 128;
                                                                j87 = 1073741823 & (read ^ (j87 << i5));
                                                                int i384 = 0;
                                                                while (i384 < 1) {
                                                                    int i385 = hotel;
                                                                    int i386 = (i385 ^ 19) + ((i385 & 19) << 1);
                                                                    india = i386 % 128;
                                                                    if (i386 % 2 == 0) {
                                                                        break loop6;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (j87 == jArr2[i384]) {
                                                                                i28 = i384 + 1;
                                                                                try {
                                                                                    bufferedInputStream2.close();
                                                                                    break loop6;
                                                                                } catch (Exception unused3) {
                                                                                }
                                                                            } else {
                                                                                i384++;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            bufferedInputStream = bufferedInputStream2;
                                                                            if (bufferedInputStream != null) {
                                                                                try {
                                                                                    bufferedInputStream.close();
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (IOException unused5) {
                                                                        if (bufferedInputStream2 != null) {
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                        }
                                                                        i28 = -1;
                                                                        if (i28 <= 0) {
                                                                        }
                                                                        i29 = 1;
                                                                        if (i30 != 0) {
                                                                        }
                                                                    }
                                                                }
                                                                bufferedInputStream5 = bufferedInputStream2;
                                                                i41 = -1;
                                                            } catch (IOException unused7) {
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                            }
                                                        }
                                                    } catch (IOException unused8) {
                                                        bufferedInputStream2 = null;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bufferedInputStream = null;
                                                    }
                                                    if (i28 <= 0) {
                                                        int i387 = hotel;
                                                        india = ((i387 ^ 21) + ((i387 & 21) << 1)) % 128;
                                                        i30 = 240;
                                                    } else if (Build.VERSION.SDK_INT >= 24) {
                                                        i30 = 0;
                                                    } else {
                                                        int i388 = -TextUtils.lastIndexOf("", '0');
                                                        int i389 = ((i388 | 5) << 1) - (i388 ^ 5);
                                                        Object[] objArr127 = new Object[1];
                                                        delta("쫸塚㠞\uf15b쿆ං", i389, objArr127);
                                                        Matcher matcher2 = Pattern.compile((String) objArr127[0]).matcher("");
                                                        int i390 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                        int i391 = ((i390 | 7) << 1) - (i390 ^ 7);
                                                        Object[] objArr128 = new Object[1];
                                                        delta("렳⮩\u087f䜮噳\uefcb", i391, objArr128);
                                                        File[] listFiles = new File((String) objArr128[0]).listFiles();
                                                        if (listFiles != null) {
                                                            int i392 = 0;
                                                            int i393 = 0;
                                                            while (i392 < listFiles.length && i393 < i10) {
                                                                File file = listFiles[i392];
                                                                if (file != null && file.isDirectory() && matcher2.reset(listFiles[i392].getName()).matches()) {
                                                                    i393++;
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    sb3.append(listFiles[i392].getAbsolutePath());
                                                                    jArr = jArr2;
                                                                    matcher = matcher2;
                                                                    fileArr = listFiles;
                                                                    Object[] objArr129 = new Object[1];
                                                                    i31 = i392;
                                                                    charlie((char) ((-TextUtils.indexOf((CharSequence) "", '0', 0, 0)) - 1), (-1743768892) - Drawable.resolveOpacity(0, 0), "紏杀戋\u1cce‟⨷⾹", "쓸ဲᚘ僉", objArr129);
                                                                    sb3.append((String) objArr129[0]);
                                                                    try {
                                                                        BufferedInputStream bufferedInputStream6 = new BufferedInputStream(new FileInputStream(sb3.toString()));
                                                                        long j88 = 0;
                                                                        while (true) {
                                                                            try {
                                                                                int read2 = bufferedInputStream6.read();
                                                                                if (read2 == -1) {
                                                                                    try {
                                                                                        bufferedInputStream6.close();
                                                                                    } catch (Exception unused9) {
                                                                                    }
                                                                                    i32 = 0;
                                                                                    break;
                                                                                }
                                                                                bufferedInputStream4 = bufferedInputStream6;
                                                                                long j89 = ((j88 << i5) ^ read2) & 1073741823;
                                                                                for (int i394 = 0; i394 < 1; i394 = ((i394 & 1) << 1) + (i394 ^ 1)) {
                                                                                    try {
                                                                                        if (!(j89 != jArr[i394])) {
                                                                                            int i395 = india;
                                                                                            hotel = ((i395 & 29) + (i395 | 29)) % 128;
                                                                                            i32 = i394 + 1;
                                                                                            try {
                                                                                                bufferedInputStream4.close();
                                                                                                break;
                                                                                            } catch (Exception unused10) {
                                                                                            }
                                                                                        }
                                                                                    } catch (IOException unused11) {
                                                                                        if (bufferedInputStream4 != null) {
                                                                                            try {
                                                                                                bufferedInputStream4.close();
                                                                                            } catch (Exception unused12) {
                                                                                            }
                                                                                        }
                                                                                        i32 = -1;
                                                                                        if (!(i32 > 0)) {
                                                                                        }
                                                                                        i392 = ((i31 | 1) << 1) - (i31 ^ 1);
                                                                                        matcher2 = matcher;
                                                                                        jArr2 = jArr;
                                                                                        listFiles = fileArr;
                                                                                        i10 = 3;
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        bufferedInputStream3 = bufferedInputStream4;
                                                                                        if (bufferedInputStream3 != null) {
                                                                                            try {
                                                                                                bufferedInputStream3.close();
                                                                                            } catch (Exception unused13) {
                                                                                            }
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                j88 = j89;
                                                                                bufferedInputStream6 = bufferedInputStream4;
                                                                            } catch (IOException unused14) {
                                                                                bufferedInputStream4 = bufferedInputStream6;
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                                bufferedInputStream4 = bufferedInputStream6;
                                                                            }
                                                                        }
                                                                    } catch (IOException unused15) {
                                                                        bufferedInputStream4 = null;
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                        bufferedInputStream3 = null;
                                                                    }
                                                                    if (!(i32 > 0)) {
                                                                        i30 = 241;
                                                                    }
                                                                } else {
                                                                    jArr = jArr2;
                                                                    matcher = matcher2;
                                                                    fileArr = listFiles;
                                                                    i31 = i392;
                                                                }
                                                                i392 = ((i31 | 1) << 1) - (i31 ^ 1);
                                                                matcher2 = matcher;
                                                                jArr2 = jArr;
                                                                listFiles = fileArr;
                                                                i10 = 3;
                                                            }
                                                        }
                                                        i29 = 1;
                                                        i30 = 0;
                                                        if (i30 != 0) {
                                                            int[] iArr16 = new int[i29];
                                                            int[] iArr17 = new int[i29];
                                                            iArr17[0] = i4;
                                                            iArr16[0] = i30 ^ i4;
                                                            Object[] objArr130 = new Object[4];
                                                            objArr130[0] = new int[i29];
                                                            objArr130[i29] = iArr16;
                                                            objArr130[2] = iArr17;
                                                            objArr130[3] = null;
                                                            int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                                            int foxtrot9 = A0.z.foxtrot(~((~freeMemory2) | (-2984194)), HttpConstants.HTTP_NOT_IMPLEMENTED, (((~((-2984194) | freeMemory2)) | 4218926) * HttpConstants.HTTP_NOT_IMPLEMENTED) + 1196726580, 16);
                                                            int i396 = ((foxtrot9 | 630388790) << 1) - (foxtrot9 ^ 630388790);
                                                            int i397 = (i396 << 13) ^ i396;
                                                            int i398 = i397 ^ (i397 >>> 17);
                                                            int i399 = i398 << 5;
                                                            ((int[]) objArr130[0])[0] = ((~i398) & i399) | ((~i399) & i398);
                                                            return objArr130;
                                                        }
                                                        long[] jArr3 = new long[i29];
                                                        jArr3[0] = 472001035;
                                                        Object[] objArr131 = new Object[i29];
                                                        charlie((char) ((-2) - (~(-TextUtils.lastIndexOf("", '0', 0)))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "▀ҝ㝳ᩥ耈\u09d8⨥榵癭ꑽ씊\uf75f뇀䧼峙犝潟痫㵄\ua87d䤶簙", "⿁凂憐椗", objArr131);
                                                        Object[] objArr132 = {(String) objArr131[0], Integer.valueOf(i5), 1073741823L, jArr3};
                                                        Object D887124 = uH18377.D8871(130458176);
                                                        if (D887124 == null) {
                                                            int i400 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                                                            int axisFromString2 = MotionEvent.axisFromString("") + 2382;
                                                            char myTid = (char) (9779 - (Process.myTid() >> 22));
                                                            byte b53 = (byte) 1;
                                                            byte b54 = (byte) (b53 - 1);
                                                            Object[] objArr133 = new Object[1];
                                                            bravo(b54, b53, b54, objArr133);
                                                            D887124 = uH18377.setPivotYN16904(i400, axisFromString2, myTid, -662896491, false, (String) objArr133[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                        }
                                                        long longValue13 = ((Long) ((Method) D887124).invoke(null, objArr132)).longValue();
                                                        long j90 = -748293885;
                                                        long j91 = j48 * longValue13;
                                                        long j92 = j90 ^ j12;
                                                        long j93 = longValue13 ^ j12;
                                                        long j94 = ((j93 | j90) * j54) + ((((j92 | j93) | j15) ^ j12) * j50) + ((j92 | ((j93 | j5) ^ j12)) * j50) + j91 + (j47 * j90) + 1601781322;
                                                        int i401 = ((int) (j94 >> 32)) & ((((-574373046) | (~((-862853366) | i4)) | (~(i43 | 862853365))) * 45) + (((~((-574373046) | i4)) | (-863911158)) * (-45)) + (((~((-574373046) | i43)) | 862853365) * (-90)) + 1687905420);
                                                        int i402 = ((int) j94) & ((((~((-1126731144) | i4)) | 1093141893 | (~((-276906017) | i43))) * 369) + (((~(1126731143 | i43)) | (-310495267)) * (-369)) + (((-33589251) | i43) * (-369)) + 802172634);
                                                        if (((i401 & i402) | (i401 ^ i402)) > 0) {
                                                            Object[] objArr134 = {new int[1], new int[]{(~(i4 & 242)) & (i4 | 242)}, new int[]{i4}, null};
                                                            int romeo2 = ao.ad.romeo();
                                                            int i403 = (((-569250385) | romeo2) * 614) + 156291869;
                                                            int i404 = ~romeo2;
                                                            int i405 = (((~(i404 | (-29364241))) | (~((-539886145) | i404))) * 614) + (((~((-909010671) | i404)) | 369124526 | (~((-398488767) | i404))) * (-1228)) + i403;
                                                            int i406 = (i405 ^ 16) + ((i405 & 16) << 1);
                                                            int i407 = (i406 & 630388790) + (i406 | 630388790);
                                                            int i408 = i407 << 13;
                                                            int i409 = (i407 | i408) & (~(i407 & i408));
                                                            int i410 = i409 >>> 17;
                                                            int i411 = ((~i409) & i410) | ((~i410) & i409);
                                                            int i412 = i411 << 5;
                                                            ((int[]) objArr134[0])[0] = (i411 | i412) & (~(i411 & i412));
                                                            return objArr134;
                                                        }
                                                        Object D887125 = uH18377.D8871(-30259255);
                                                        if (D887125 == null) {
                                                            int i413 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51;
                                                            int i414 = 3521 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            char defaultSize6 = (char) View.getDefaultSize(0, 0);
                                                            byte b55 = (byte) 1;
                                                            byte b56 = (byte) (b55 - 1);
                                                            Object[] objArr135 = new Object[1];
                                                            bravo(b56, b55, b56, objArr135);
                                                            D887125 = uH18377.setPivotYN16904(i413, i414, defaultSize6, 562685212, false, (String) objArr135[0], new Class[0]);
                                                        }
                                                        long longValue14 = ((Long) ((Method) D887125).invoke(null, null)).longValue();
                                                        long j95 = 386843252;
                                                        long j96 = i17;
                                                        long j97 = -49;
                                                        long j98 = j97 * longValue14;
                                                        long j99 = -50;
                                                        long myUid = Process.myUid();
                                                        long j100 = ((j95 | myUid) * j99) + j98 + (j96 * j95);
                                                        long j101 = i16;
                                                        long j102 = longValue14 ^ j12;
                                                        long j103 = myUid ^ j12;
                                                        long j104 = j102 | j103;
                                                        long j105 = (((((j104 ^ j12) | ((j102 | j95) ^ j12)) | ((j103 | j95) ^ j12)) * j101) + (((((((j95 ^ j12) | j102) | myUid) ^ j12) | ((j104 | j95) ^ j12)) * j101) + j100)) - 1394682893;
                                                        int i415 = ((int) (j105 >> 32)) & ((((~(1732342545 | i4)) | (~((-608256017) | i43))) * 765) + (((~(1732342545 | i43)) | (-1733654356)) * 1530) + (((((~(1733654355 | i43)) | (~((-1311811) | i4))) | (~((-608256017) | i4))) * 765) - 432196238));
                                                        int maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                        int i416 = ~maxMemory3;
                                                        int i417 = ((int) j105) & ((((~(i416 | 1795650078)) | 358423668) * 217) + (((~((-358423669) | maxMemory3)) | 341314656) * 217) + (((~(1795650078 | maxMemory3)) | (~((-358423669) | i416))) * 217) + 734734836);
                                                        if (((i415 & i417) | (i415 ^ i417)) != 0) {
                                                            india = (hotel + 13) % 128;
                                                            objArr = new Object[]{new int[1], new int[]{(~(i4 & 264)) & (i4 | 264)}, new int[]{i4}, null};
                                                            int i418 = -(-A0.z.foxtrot((~((~Process.myUid()) | (-90279111))) | 403439881, 576, (((~((-98680567) | r2)) | 8401456) * 576) - 1492318097, 544271376));
                                                            int i419 = (i418 & 630388790) + (i418 | 630388790);
                                                            int i420 = i419 << 13;
                                                            int i421 = (i420 & (~i419)) | ((~i420) & i419);
                                                            int i422 = i421 >>> 17;
                                                            int i423 = ((~i421) & i422) | ((~i422) & i421);
                                                            int i424 = i423 << 5;
                                                            ((int[]) objArr[0])[0] = (i423 | i424) & (~(i423 & i424));
                                                            c3 = 0;
                                                        } else {
                                                            Object D887126 = uH18377.D8871(-688378724);
                                                            if (D887126 == null) {
                                                                int indexOf7 = 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2588;
                                                                char mode = (char) (14485 - View.MeasureSpec.getMode(0));
                                                                byte b57 = (byte) 1;
                                                                byte b58 = (byte) (b57 - 1);
                                                                Object[] objArr136 = new Object[1];
                                                                bravo(b58, b57, b58, objArr136);
                                                                D887126 = uH18377.setPivotYN16904(indexOf7, doubleTapTimeout, mode, 155422281, false, (String) objArr136[0], new Class[0]);
                                                            }
                                                            long longValue15 = ((Long) ((Method) D887126).invoke(null, null)).longValue();
                                                            long j106 = 142092111;
                                                            long j107 = (334 * longValue15) + ((-665) * j106);
                                                            long j108 = j106 ^ j12;
                                                            long j109 = ((-333) * j108) + j107;
                                                            long j110 = 333;
                                                            long j111 = ((j110 * (((j108 | j5) ^ j12) | ((j15 | longValue15) ^ j12))) + (((((j108 | j15) ^ j12) | ((longValue15 | j5) ^ j12)) * j110) + j109)) - 1777706743;
                                                            int i425 = ((int) (j111 >> 32)) & ((((~(913116725 | i4)) | (~((-67437089) | i43))) * 765) + (((~(913116725 | i43)) | (-2012061248)) * 1530) + (((((~(2012061247 | i43)) | (~((-1098944523) | i4))) | (~((-67437089) | i4))) * 765) - 74723322));
                                                            int tango2 = ao.ad.tango(62863217);
                                                            int i426 = ~(2020547835 | tango2);
                                                            int i427 = ~tango2;
                                                            int i428 = ((int) j111) & ((((~(tango2 | (-583321426))) | (~((-2020547836) | i427))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~(2062540795 | i427)) * (-406)) + (((i426 | (~((-1479219371) | i427))) * (-406)) - 2046191561));
                                                            if (((i425 & i428) | (i425 ^ i428)) != 0) {
                                                                int i429 = india;
                                                                hotel = (((i429 | 7) << 1) - (i429 ^ 7)) % 128;
                                                                i33 = (i4 & (-282)) | (i43 & 281);
                                                            } else {
                                                                i33 = i4;
                                                            }
                                                            if (i33 == i4) {
                                                                Object D887127 = uH18377.D8871(-1380029587);
                                                                if (D887127 == null) {
                                                                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 52;
                                                                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3622;
                                                                    char indexOf8 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                                                    byte b59 = (byte) 0;
                                                                    byte b60 = (byte) (b59 + 1);
                                                                    Object[] objArr137 = new Object[1];
                                                                    bravo(b60, b59, b60, objArr137);
                                                                    D887127 = uH18377.setPivotYN16904(offsetBefore2, keyRepeatDelay2, indexOf8, 1912981944, false, (String) objArr137[0], new Class[0]);
                                                                }
                                                                long longValue16 = ((Long) ((Method) D887127).invoke(null, null)).longValue();
                                                                long j112 = 401120271;
                                                                long j113 = ((-675) * longValue16) + (677 * j112);
                                                                long maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                                long j114 = longValue16 ^ j12;
                                                                long j115 = ((-676) * (j112 | maxMemory4 | j114)) + j113;
                                                                long j116 = 676;
                                                                long j117 = maxMemory4 ^ j12;
                                                                long j118 = (j116 * ((((j112 ^ j12) | j114) ^ j12) | ((j114 | j117) ^ j12) | (((j112 | longValue16) | maxMemory4) ^ j12))) + ((((j114 | j112) ^ j12) | ((j117 | j112) ^ j12)) * j116) + j115 + 1381867418;
                                                                int i430 = ((int) (j118 >> 32)) & ((((~((-402982957) | i43)) | (~((-536871171) | i4)) | (~((-94389329) | i4))) * 920) + (((~((-939854127) | i43)) | 402982956) * 920) + (((~((-402982957) | i4)) | (~((-94389329) | i43))) * 920) + 2038856378);
                                                                int foxtrot10 = ((int) j118) & A0.z.foxtrot((~((-10616834) | i43)) | 1426609472, 576, (((~(1426609524 | i4)) | (-1437226358)) * 576) + 1771465493, 1086305920);
                                                                if (((i430 & foxtrot10) | (i430 ^ foxtrot10)) != 0) {
                                                                    hotel = (india + 125) % 128;
                                                                    objArr = new Object[]{new int[1], new int[]{i4 ^ 268}, new int[]{i4}, null};
                                                                    int uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                                    int i431 = ~uptimeMillis2;
                                                                    int i432 = (((~(uptimeMillis2 | (-205691728))) | 135744 | (~(i431 | 510386159))) * 521) + ((304830176 | uptimeMillis2) * 521) + (((~(i431 | 304830176)) | 205691727) * (-1042)) + 398997526;
                                                                    int i433 = (i432 & 16) + (i432 | 16) + 630388790;
                                                                    int i434 = i433 << 13;
                                                                    int i435 = (i434 & (~i433)) | ((~i434) & i433);
                                                                    int i436 = i435 >>> 17;
                                                                    int i437 = ((~i435) & i436) | ((~i436) & i435);
                                                                    int i438 = i437 << 5;
                                                                    ((int[]) objArr[0])[0] = ((~i437) & i438) | ((~i438) & i437);
                                                                } else {
                                                                    Object D887128 = uH18377.D8871(-986684210);
                                                                    if (D887128 == null) {
                                                                        int keyRepeatTimeout2 = 52 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3622;
                                                                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                        byte b61 = (byte) 1;
                                                                        byte b62 = (byte) (b61 - 1);
                                                                        Object[] objArr138 = new Object[1];
                                                                        bravo(b62, b61, b62, objArr138);
                                                                        D887128 = uH18377.setPivotYN16904(keyRepeatTimeout2, maximumFlingVelocity, scrollBarFadeDuration, 445367835, false, (String) objArr138[0], new Class[0]);
                                                                    }
                                                                    long longValue17 = ((Long) ((Method) D887128).invoke(null, null)).longValue();
                                                                    long j119 = -785389190;
                                                                    long j120 = -721;
                                                                    long j121 = j119 ^ j12;
                                                                    long j122 = longValue17 ^ j12;
                                                                    long j123 = (j119 | longValue17) ^ j12;
                                                                    long j124 = (722 * (((j121 | longValue17) ^ j12) | ((j122 | j119) ^ j12))) + ((-1444) * (j123 | ((j119 | j5) ^ j12) | ((longValue17 | j5) ^ j12))) + (1444 * (j15 | ((j121 | j122) ^ j12) | j123)) + (j120 * longValue17) + (j120 * j119) + 1763210704;
                                                                    int uptimeMillis3 = (int) SystemClock.uptimeMillis();
                                                                    int i439 = ~uptimeMillis3;
                                                                    int i440 = ((int) (j124 >> 32)) & ((((~(uptimeMillis3 | 1801069063)) | (-2147479136) | (~(i439 | (-17432581)))) * 369) + (((-363842653) | (~((-1801069064) | i439))) * (-369)) + ((((-346410073) | i439) * (-369)) - 802173004));
                                                                    int i441 = ((int) j124) & (((1233211548 | i4) * 104) + ((~(1775589821 | i43)) * (-104)) + (((~((-1624529338) | i4)) | 1082151064) * 104) + 2005432269);
                                                                    if (((i440 & i441) | (i440 ^ i441)) != 0) {
                                                                        objArr = new Object[]{r3, new int[]{(i4 & (-267)) | (i43 & 266)}, new int[]{i4}, null};
                                                                        int i442 = (((~((-578361990) | i43)) | 591877) * 52) + (((~(578361989 | i43)) | (~(67840085 | i43)) | (-645610198)) * (-52)) + ((~((-67248209) | i43)) * 52) + 1267752371;
                                                                        int i443 = (((i442 | 16) << 1) - (i442 ^ 16)) + 630388790;
                                                                        int i444 = i443 << 13;
                                                                        int i445 = (i443 | i444) & (~(i443 & i444));
                                                                        int i446 = i445 ^ (i445 >>> 17);
                                                                        int i447 = i446 << 5;
                                                                        int[] iArr18 = {(i446 | i447) & (~(i446 & i447))};
                                                                    } else {
                                                                        Object D887129 = uH18377.D8871(-317201951);
                                                                        if (D887129 == null) {
                                                                            int maximumDrawingCacheSize = 52 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                            int longPressTimeout3 = 1311 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                            char axisFromString3 = (char) (28021 - MotionEvent.axisFromString(""));
                                                                            byte b63 = (byte) 1;
                                                                            byte b64 = (byte) (b63 - 1);
                                                                            Object[] objArr139 = new Object[1];
                                                                            bravo(b64, b63, b64, objArr139);
                                                                            D887129 = uH18377.setPivotYN16904(maximumDrawingCacheSize, longPressTimeout3, axisFromString3, 850150196, false, (String) objArr139[0], new Class[0]);
                                                                        }
                                                                        long longValue18 = ((Long) ((Method) D887129).invoke(null, null)).longValue();
                                                                        long j125 = 120229939;
                                                                        long j126 = 471;
                                                                        long j127 = (j126 * longValue18) + (j126 * j125);
                                                                        long j128 = -470;
                                                                        long j129 = ((j125 | longValue18) * j128) + j127;
                                                                        long j130 = longValue18 ^ j12;
                                                                        long tango3 = ao.ad.tango(1051698738);
                                                                        long j131 = (((tango3 ^ j12) | j125) | longValue18) ^ j12;
                                                                        long j132 = ((470 * ((((j130 | j125) | tango3) ^ j12) | j131)) + (((((((j125 ^ j12) | j130) ^ j12) | ((j130 | tango3) ^ j12)) | j131) * j128) + j129)) - 1817389903;
                                                                        int i448 = ((int) (j132 >> 32)) & ((((~(1450565379 | i43)) | 1446270467) * 970) + (((4294912 | r4) * (-970)) - 1414690740));
                                                                        int i449 = ((int) j132) & (((~(1434451351 | i4)) * 283) + ((((~(1433066899 | i4)) | 1384452) * (-283)) - 1045426495));
                                                                        if (((i448 & i449) | (i448 ^ i449)) != 0) {
                                                                            objArr = new Object[]{r3, new int[]{(~(i4 & 280)) & (i4 | 280)}, new int[]{i4}, null};
                                                                            int i450 = (((~((-111232354) | i43)) | 2179361) * 983) + (((~((-399289551) | i43)) | (-111232354)) * (-983)) + 695955754;
                                                                            int i451 = ((i450 | 16) << 1) - (i450 ^ 16);
                                                                            int i452 = (i451 & 630388790) + (i451 | 630388790);
                                                                            int i453 = i452 << 13;
                                                                            int i454 = (i453 & (~i452)) | ((~i453) & i452);
                                                                            int i455 = i454 ^ (i454 >>> 17);
                                                                            int i456 = i455 << 5;
                                                                            c3 = 0;
                                                                            int[] iArr19 = {(i455 | i456) & (~(i455 & i456))};
                                                                        } else {
                                                                            objArr = new Object[]{new int[1], new int[]{i4}, new int[]{i4}, null};
                                                                            int elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                                            int i457 = (((~((-492952518) | elapsedRealtime5)) | (-17569387)) * (-318)) + 1358502201;
                                                                            int i458 = ~((-17569387) | elapsedRealtime5);
                                                                            int i459 = ~elapsedRealtime5;
                                                                            int i460 = -(-((((~(elapsedRealtime5 | 493740015)) | (~((-787499) | i459))) * 318) + ((i458 | (~(493740015 | i459))) * 318) + i457));
                                                                            int i461 = (i460 ^ 630388790) + ((i460 & 630388790) << 1);
                                                                            int i462 = i461 << 13;
                                                                            int i463 = (i462 | i461) & (~(i461 & i462));
                                                                            int i464 = i463 >>> 17;
                                                                            int i465 = (i463 | i464) & (~(i463 & i464));
                                                                            ((int[]) objArr[0])[0] = i465 ^ (i465 << 5);
                                                                        }
                                                                    }
                                                                }
                                                                i34 = 2;
                                                                c3 = 0;
                                                                if (((int[]) objArr[i34])[c3] == ((int[]) objArr[1])[c3]) {
                                                                    return objArr;
                                                                }
                                                                Object[] objArr140 = new Object[1];
                                                                objArr140[c3] = Integer.valueOf(i34);
                                                                Object D887130 = uH18377.D8871(-38624464);
                                                                if (D887130 == null) {
                                                                    int i466 = 53 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                    int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2847;
                                                                    char lastIndexOf3 = (char) (62566 - TextUtils.lastIndexOf("", '0'));
                                                                    byte b65 = (byte) 1;
                                                                    byte b66 = (byte) (b65 - 1);
                                                                    Object[] objArr141 = new Object[1];
                                                                    bravo(b66, b65, b66, objArr141);
                                                                    D887130 = uH18377.setPivotYN16904(i466, fadingEdgeLength3, lastIndexOf3, 571015653, false, (String) objArr141[0], new Class[]{cls});
                                                                }
                                                                long longValue19 = ((Long) ((Method) D887130).invoke(null, objArr140)).longValue();
                                                                long j133 = 1515807575;
                                                                long j134 = (242 * longValue19) + (483 * j133);
                                                                long j135 = j133 ^ j12;
                                                                long j136 = longValue19 ^ j12;
                                                                long elapsedCpuTime2 = j135 | (((int) Process.getElapsedCpuTime()) ^ j12);
                                                                long j137 = (241 * (((j136 | j133) ^ j12) | ((elapsedCpuTime2 | longValue19) ^ j12))) + ((-482) * (j133 | longValue19)) + ((((j135 | j136) ^ j12) | (elapsedCpuTime2 ^ j12)) * (-241)) + j134 + 476319191;
                                                                int i467 = ((int) (j137 >> 32)) & ((((~((-392735799) | i43)) | 19399682 | (~((-671154497) | i4))) * 168) + ((~((-373336117) | i4)) * 168) + (((~((-1044490613) | i43)) | 373336116) * 168) + 501358106);
                                                                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                                int i468 = ((~((-585728705) | elapsedCpuTime3)) * 216) + 134302957;
                                                                int i469 = ~elapsedCpuTime3;
                                                                int i470 = ((int) j137) & ((((~(i469 | (-585728705))) | (-851497706)) * 216) + (((-2686977) | i469) * (-216)) + i468);
                                                                if (((i467 & i470) | (i467 ^ i470)) == 2) {
                                                                    Object[] objArr142 = {new int[1], new int[]{(~(i4 & 270)) & (i4 | 270)}, new int[]{i4}, null};
                                                                    int uptimeMillis4 = (int) SystemClock.uptimeMillis();
                                                                    int i471 = (((~((~uptimeMillis4) | 464287204)) | (-1002339829)) * (-245)) + 119243490;
                                                                    int i472 = ~(uptimeMillis4 | 464287204);
                                                                    int i473 = ((i472 | 974809108) * 245) + (i472 * (-245)) + i471;
                                                                    int i474 = 630388789 - (~((i473 & 16) + (i473 | 16)));
                                                                    int i475 = i474 << 13;
                                                                    int i476 = (i475 | i474) & (~(i474 & i475));
                                                                    int i477 = i476 >>> 17;
                                                                    int i478 = (i476 | i477) & (~(i476 & i477));
                                                                    int i479 = i478 << 5;
                                                                    ((int[]) objArr142[0])[0] = ((~i478) & i479) | ((~i479) & i478);
                                                                    return objArr142;
                                                                }
                                                                Object D887131 = uH18377.D8871(-1225586509);
                                                                if (D887131 == null) {
                                                                    int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 51;
                                                                    int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2796;
                                                                    char argb = (char) (32779 - Color.argb(0, 0, 0, 0));
                                                                    byte b67 = (byte) 1;
                                                                    byte b68 = (byte) (b67 - 1);
                                                                    Object[] objArr143 = new Object[1];
                                                                    bravo(b68, b67, b68, objArr143);
                                                                    D887131 = uH18377.setPivotYN16904(absoluteGravity2, fadingEdgeLength4, argb, 1766369894, false, (String) objArr143[0], new Class[0]);
                                                                }
                                                                long longValue20 = ((Long) ((Method) D887131).invoke(null, null)).longValue();
                                                                long j138 = 28419214;
                                                                long j139 = (j97 * longValue20) + (j96 * j138);
                                                                long elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                                                long j140 = (j99 * (j138 | elapsedCpuTime4)) + j139;
                                                                long j141 = longValue20 ^ j12;
                                                                long j142 = (((j138 ^ j12) | j141) | elapsedCpuTime4) ^ j12;
                                                                long j143 = elapsedCpuTime4 ^ j12;
                                                                long j144 = j141 | j143;
                                                                long j145 = (((((j143 | j138) ^ j12) | ((j144 ^ j12) | ((j141 | j138) ^ j12))) * j101) + (((j142 | ((j144 | j138) ^ j12)) * j101) + j140)) - 1766978433;
                                                                int foxtrot11 = ((int) (j145 >> 32)) & A0.z.foxtrot(~(ao.ad.romeo() | (-33622017)), -1504, (((~((-668315309) | r4)) | 634693292) * 1504) - 1320242614, 1661497568);
                                                                int i480 = ((int) j145) & ((((~((-286589314) | i4)) | 1145065476) * 366) + (((~(1147851286 | i4)) | (-289375124)) * (-366)) + 1838491397);
                                                                if (((foxtrot11 & i480) | (foxtrot11 ^ i480)) != 0) {
                                                                    Object[] objArr144 = {r0, new int[]{(i4 & (-273)) | (i43 & 272)}, new int[]{i4}, null};
                                                                    int i481 = ((((~((-70577806) | i4)) | 3146368) | (~((-439944099) | i4))) * (-880)) - 1201769537;
                                                                    int i482 = (~((-70577806) | i43)) | 439944098;
                                                                    int i483 = ~(70577805 | i4);
                                                                    int i484 = (i483 * 880) + ((i482 | i483) * (-880)) + i481;
                                                                    int i485 = (((~(i4 | 16)) | i484) * 672) + (10767 - (~(-(-(i484 * (-1343))))));
                                                                    int i486 = ~(i24 | i43);
                                                                    int i487 = ~((i484 ^ i4) | (i484 & i4));
                                                                    int i488 = (((i486 & i487) | (i486 ^ i487)) * (-672)) + i485;
                                                                    int i489 = ~i484;
                                                                    int i490 = ~(i489 | i43);
                                                                    int i491 = ~((i489 & 16) | (i489 ^ 16));
                                                                    int i492 = -(-(((i491 & i490) | (i490 ^ i491)) * 672));
                                                                    int i493 = ((i488 | i492) << 1) - (i488 ^ i492);
                                                                    int i494 = (i493 * (-559)) + 1460792918;
                                                                    int i495 = -(-((~((i43 ^ i493) | (i43 & i493))) * (-560)));
                                                                    int i496 = (i494 & i495) + (i494 | i495);
                                                                    int i497 = ((-630388791) ^ i493) | ((-630388791) & i493);
                                                                    int i498 = ((~((i4 & i497) | (i497 ^ i4))) * (-560)) + i496;
                                                                    int i499 = ~i493;
                                                                    int i500 = ~((i499 & 630388790) | (i499 ^ 630388790));
                                                                    int i501 = ~((i43 ^ 630388790) | (i43 & 630388790));
                                                                    int i502 = -(-(((i500 & i501) | (i500 ^ i501)) * 560));
                                                                    int i503 = (i498 & i502) + (i498 | i502);
                                                                    int i504 = i503 << 13;
                                                                    int i505 = (i504 | i503) & (~(i503 & i504));
                                                                    int i506 = i505 ^ (i505 >>> 17);
                                                                    int i507 = i506 << 5;
                                                                    int[] iArr20 = {((~i506) & i507) | ((~i507) & i506)};
                                                                    return objArr144;
                                                                }
                                                                long[] jArr4 = {624887784092251L};
                                                                char c27 = (char) (26490 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                                                                int i508 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                                int i509 = (i508 ^ 1671536322) + ((i508 & 1671536322) << 1);
                                                                Object[] objArr145 = new Object[1];
                                                                charlie(c27, i509, "傁돺䧋뇕쀘댆䚞∶䲤压ꬃ㊇茏蚨鯬\ue53e这", "쉥ꆞ穣⑧", objArr145);
                                                                Object[] objArr146 = {(String) objArr145[0], 3, 2251799813685247L, jArr4};
                                                                Object D887132 = uH18377.D8871(130458176);
                                                                if (D887132 == null) {
                                                                    int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52;
                                                                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 2381;
                                                                    char scrollDefaultDelay3 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9779);
                                                                    byte b69 = (byte) 1;
                                                                    byte b70 = (byte) (b69 - 1);
                                                                    Object[] objArr147 = new Object[1];
                                                                    bravo(b70, b69, b70, objArr147);
                                                                    D887132 = uH18377.setPivotYN16904(keyRepeatDelay3, absoluteGravity3, scrollDefaultDelay3, -662896491, false, (String) objArr147[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                                }
                                                                long longValue21 = ((Long) ((Method) D887132).invoke(null, objArr146)).longValue();
                                                                long j146 = -833650518;
                                                                long j147 = ((-475) * longValue21) + (477 * j146);
                                                                long j148 = ((j146 ^ j12) | longValue21) ^ j12;
                                                                long j149 = longValue21 ^ j12;
                                                                long myUid2 = Process.myUid();
                                                                long j150 = ((j149 | j146) | myUid2) ^ j12;
                                                                long j151 = (476 * ((j146 | (j149 | (myUid2 ^ j12))) ^ j12)) + (952 * j150) + ((j148 | j150) * (-476)) + j147 + 1687137955;
                                                                int i510 = ((int) (j151 >> 32)) & ((((~(252023889 | i43)) | 1084244232) * 191) + ((((~(252023889 | i4)) | 1185202521) * 191) - 706232975));
                                                                int i511 = ((int) j151) & (((2091287434 | (~(766453451 | i43))) * 56) + ((((~(2091287434 | i4)) | 766453451) * 56) - 435872675));
                                                                int i512 = (i510 & i511) | (i510 ^ i511);
                                                                if (i512 > 0) {
                                                                    Object[] objArr148 = {new int[1], new int[]{(~(i4 & 275)) & (i4 | 275)}, new int[]{i4}, null};
                                                                    int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                                                    int foxtrot12 = A0.z.foxtrot((~(freeMemory3 | (-502846769))) | (~((~freeMemory3) | 7675135)), 333, (((~((-502846769) | r2)) | (~(freeMemory3 | 7675135))) * 333) - 1172874305, 16);
                                                                    int i513 = (foxtrot12 & 630388790) + (foxtrot12 | 630388790);
                                                                    int i514 = i513 << 13;
                                                                    int i515 = (i514 & (~i513)) | ((~i514) & i513);
                                                                    int i516 = i515 >>> 17;
                                                                    int i517 = (i515 | i516) & (~(i515 & i516));
                                                                    ((int[]) objArr148[0])[0] = i517 ^ (i517 << 5);
                                                                    return objArr148;
                                                                }
                                                                if ((i512 == -1 ? '5' : '0') != '0') {
                                                                    Object[] objArr149 = {r0, new int[]{(i4 & (-278)) | (i43 & 277)}, new int[]{i4}, null};
                                                                    int i518 = (((~(145935063 | i43)) | (-800260056)) * (-245)) + 1492969924;
                                                                    int i519 = ~(145935063 | i4);
                                                                    int i520 = ((i519 | 656456967) * 245) + (i519 * (-245)) + i518;
                                                                    int i521 = ((i520 | 16) << 1) - (i520 ^ 16);
                                                                    int i522 = i521 * (-501);
                                                                    int i523 = (i522 ^ (-742018534)) + ((i522 & (-742018534)) << 1);
                                                                    int i524 = ~(((-630388791) ^ i4) | ((-630388791) & i4));
                                                                    int i525 = ~(i521 | 630388790);
                                                                    int i526 = (i523 - (~(((i524 & i525) | (i524 ^ i525)) * (-502)))) - 1;
                                                                    int i527 = -(-((~(((-630388791) ^ i43) | ((-630388791) & i43) | i521)) * (-502)));
                                                                    int i528 = (i526 & i527) + (i527 | i526);
                                                                    int i529 = ~i521;
                                                                    int i530 = ~((i4 & i529) | (i529 ^ i4));
                                                                    int i531 = (((-630388791) & i530) | ((-630388791) ^ i530)) * HttpConstants.HTTP_BAD_GATEWAY;
                                                                    int i532 = (i528 ^ i531) + ((i531 & i528) << 1);
                                                                    int i533 = i532 << 13;
                                                                    int i534 = (i533 | i532) & (~(i532 & i533));
                                                                    int i535 = i534 >>> 17;
                                                                    int i536 = (i534 | i535) & (~(i534 & i535));
                                                                    int i537 = i536 << 5;
                                                                    int[] iArr21 = {(i536 | i537) & (~(i536 & i537))};
                                                                    return objArr149;
                                                                }
                                                                int i538 = -ExpandableListView.getPackedPositionGroup(0L);
                                                                int i539 = i538 * (-958);
                                                                int i540 = (i539 ^ (-10538)) + ((i539 & (-10538)) << 1);
                                                                int i541 = ~(((-12) & i43) | ((-12) ^ i43));
                                                                int i542 = ~i538;
                                                                int i543 = i541 | (~((i542 ^ i4) | (i542 & i4)));
                                                                int i544 = ~((i43 ^ i538) | (i43 & i538));
                                                                int i545 = ((~((i538 ^ 11) | (i538 & 11))) * (-959)) + ((i540 - (~(-(-(((i543 & i544) | (i543 ^ i544)) * 959))))) - 1);
                                                                int i546 = ~(i542 | i43);
                                                                int i547 = ~(((-12) & i4) | ((-12) ^ i4));
                                                                int i548 = (i546 & i547) | (i546 ^ i547);
                                                                int i549 = ~(i538 | i4);
                                                                int i550 = (((i549 & i548) | (i548 ^ i549)) * 959) + i545;
                                                                Object[] objArr150 = new Object[1];
                                                                delta("ꔫ뾁ꎦⰶ몌牢㧏შꎿ䌣\udf94쏈", i550, objArr150);
                                                                Object[] objArr151 = {(String) objArr150[0]};
                                                                Object D887133 = uH18377.D8871(1565484532);
                                                                if (D887133 == null) {
                                                                    int i551 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 52;
                                                                    int indexOf9 = 2951 - TextUtils.indexOf("", "", 0, 0);
                                                                    char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                                                    byte b71 = (byte) 1;
                                                                    byte b72 = (byte) (b71 - 1);
                                                                    Object[] objArr152 = new Object[1];
                                                                    bravo(b72, b71, b72, objArr152);
                                                                    D887133 = uH18377.setPivotYN16904(i551, indexOf9, edgeSlop, -2097887455, false, (String) objArr152[0], new Class[]{String.class});
                                                                }
                                                                long longValue22 = ((Long) ((Method) D887133).invoke(null, objArr151)).longValue();
                                                                long j152 = 483169186;
                                                                long j153 = j152 ^ j12;
                                                                long j154 = ((-1434) * (longValue22 | j153)) + (1435 * longValue22) + ((-716) * j152);
                                                                long j155 = 717;
                                                                long j156 = (j152 | longValue22) ^ j12;
                                                                long j157 = j153 | (longValue22 ^ j12);
                                                                long j158 = (j155 * (((longValue22 | j5) ^ j12) | j156 | ((j157 | j15) ^ j12))) + ((((j15 | longValue22) ^ j12) | j156 | ((j157 | j5) ^ j12)) * j155) + j154 + 471984716;
                                                                int i552 = ((int) (j158 >> 32)) & ((((~((-1639768745) | i4)) | (-202542334)) * 376) + (((~(1639768744 | i43)) | 201460821) * (-376)) + (((1840148053 | i4) * 376) - 2088991750));
                                                                int freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                                int i553 = ((int) j158) & ((((~((~freeMemory4) | (-451730367))) | 4227604) * 191) + (((~((-451730367) | freeMemory4)) | (-985496044)) * 191) + 1727770279);
                                                                if (((i552 & i553) | (i552 ^ i553)) != 0) {
                                                                    Object[] objArr153 = {r0, new int[]{(i4 & (-277)) | (i43 & 276)}, new int[]{i4}, null};
                                                                    int foxtrot13 = A0.z.foxtrot((~(i4 | 532083633)) | 16777601, 446, (((~(19169665 | i43)) | 512913968) * 446) + 451019853, 1126363056);
                                                                    int i554 = (foxtrot13 & 630388790) + (foxtrot13 | 630388790);
                                                                    int i555 = (i554 << 13) ^ i554;
                                                                    int i556 = i555 >>> 17;
                                                                    int i557 = ((~i555) & i556) | ((~i556) & i555);
                                                                    int i558 = i557 << 5;
                                                                    int[] iArr22 = {((~i557) & i558) | ((~i558) & i557)};
                                                                    return objArr153;
                                                                }
                                                                Object D887134 = uH18377.D8871(-1450000215);
                                                                if (D887134 == null) {
                                                                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 52;
                                                                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2640;
                                                                    char c28 = (char) (23983 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                                    byte b73 = (byte) 1;
                                                                    byte b74 = (byte) (b73 - 1);
                                                                    Object[] objArr154 = new Object[1];
                                                                    bravo(b74, b73, b74, objArr154);
                                                                    D887134 = uH18377.setPivotYN16904(threadPriority2, offsetAfter2, c28, 1982423676, false, (String) objArr154[0], new Class[0]);
                                                                }
                                                                long longValue23 = ((Long) ((Method) D887134).invoke(null, null)).longValue();
                                                                long j159 = 198113389;
                                                                long j160 = 520;
                                                                long j161 = j159 ^ j12;
                                                                long j162 = longValue23 ^ j12;
                                                                long myUid3 = Process.myUid();
                                                                long j163 = myUid3 ^ j12;
                                                                long j164 = (((((j161 | j162) | j163) ^ j12) | ((longValue23 | myUid3) ^ j12)) * j160) + (521 * longValue23) + ((-519) * j159);
                                                                long j165 = (myUid3 | j159) ^ j12;
                                                                long j166 = ((((j161 | j163) ^ j12) | ((j162 | j159) ^ j12) | j165) * j160) + ((-1040) * (((j162 | j163) ^ j12) | j165)) + j164 + 344058055;
                                                                int i559 = ((int) (j166 >> 32)) & ((((~((-45063602) | i43)) | 1526099693) * 494) + ((((-626961) | i43) * 494) - 836744638));
                                                                int tango4 = ao.ad.tango(1799296565);
                                                                int foxtrot14 = ((int) j166) & A0.z.foxtrot(~((~tango4) | (-320225929)), -948, (((~((-322855882) | tango4)) | 1760082291) * (-948)) + 1798172729, 1801770904);
                                                                if (((i559 & foxtrot14) | (i559 ^ foxtrot14)) != 0) {
                                                                    Object[] objArr155 = {r0, new int[]{i4 ^ 273}, new int[]{i4}, null};
                                                                    int i560 = -(-((((~((-686803193) | i43)) | (~((-176281289) | i43))) * 590) + (((~(176281288 | i43)) | (-720363257) | (~(686803192 | i43))) * (-1180)) + ((((~(i4 | (-142721225))) | r2) * 590) - 1903180959) + 16));
                                                                    int i561 = ((i560 | 630388790) << 1) - (i560 ^ 630388790);
                                                                    int i562 = i561 << 13;
                                                                    int i563 = (i562 & (~i561)) | ((~i562) & i561);
                                                                    int i564 = i563 >>> 17;
                                                                    int i565 = ((~i563) & i564) | ((~i564) & i563);
                                                                    int i566 = i565 << 5;
                                                                    int[] iArr23 = {((~i565) & i566) | ((~i566) & i565)};
                                                                    return objArr155;
                                                                }
                                                                Object D887135 = uH18377.D8871(47451215);
                                                                if (D887135 == null) {
                                                                    int i567 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50;
                                                                    int i568 = 1260 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    char pressedStateDuration4 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                    byte b75 = (byte) 1;
                                                                    byte b76 = (byte) (b75 - 1);
                                                                    Object[] objArr156 = new Object[1];
                                                                    bravo(b76, b75, b76, objArr156);
                                                                    D887135 = uH18377.setPivotYN16904(i567, i568, pressedStateDuration4, -579883366, false, (String) objArr156[0], new Class[0]);
                                                                }
                                                                long longValue24 = ((Long) ((Method) D887135).invoke(null, null)).longValue();
                                                                long j167 = -588344667;
                                                                long j168 = (591 * longValue24) + ((-589) * j167);
                                                                long j169 = 590;
                                                                long j170 = longValue24 ^ j12;
                                                                long j171 = ((j170 | j15) ^ j12) | ((j170 | j167) ^ j12) | ((j15 | j167) ^ j12);
                                                                long j172 = j167 ^ j12;
                                                                long j173 = (j169 * (((j15 | longValue24) ^ j12) | ((j172 | j15) ^ j12))) + ((-1180) * j171) + ((j171 | (((j172 | longValue24) | j5) ^ j12)) * j169) + j168 + 610846443;
                                                                int i569 = ~((int) SystemClock.elapsedRealtime());
                                                                int i570 = ((int) (j173 >> 32)) & ((((~(143938418 | i569)) | (-1581164830)) * 68) + ((~((-135528721) | i569)) * (-68)) + ((((~(r2 | (-143938419))) | ((~((-1445636110) | i569)) | 8409698)) * (-68)) - 1514837014));
                                                                int i571 = ((int) j173) & ((((~((-82898248) | i43)) | (-1584115639)) * 262) + (((~((-82898248) | i4)) | (-1584115639)) * 262) + 1943027909);
                                                                if (((i570 & i571) | (i570 ^ i571)) != 0) {
                                                                    india = (hotel + 99) % 128;
                                                                    Object[] objArr157 = {r0, new int[]{(i4 & (-280)) | (i43 & 279)}, new int[]{i4}, null};
                                                                    int i572 = ((i4 | (-43131105)) * 220) + (((~((-385248481) | i43)) | 895770384) * (-440)) + ((((~((-43131105) | i43)) | 553653008) * 220) - 1133169333);
                                                                    int i573 = (((i572 | 16) << 1) - (i572 ^ 16)) + 630388790;
                                                                    int i574 = i573 << 13;
                                                                    int i575 = (i574 | i573) & (~(i573 & i574));
                                                                    int i576 = i575 >>> 17;
                                                                    int i577 = ((~i575) & i576) | ((~i576) & i575);
                                                                    int i578 = i577 << 5;
                                                                    int[] iArr24 = {(i577 | i578) & (~(i577 & i578))};
                                                                    return objArr157;
                                                                }
                                                                Object[] objArr158 = {Integer.valueOf(i4), obj, 630388790, Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)};
                                                                Object D887136 = uH18377.D8871(-1078133633);
                                                                if (D887136 == null) {
                                                                    D887136 = uH18377.setPivotYN16904(52 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2484, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1611095722, false, null, new Class[]{cls, (Class) uH18377.charlie((char) (18791 - Color.blue(0)), 52 - TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 2537), cls, cls});
                                                                }
                                                                Object newInstance = ((Constructor) D887136).newInstance(objArr158);
                                                                try {
                                                                    int i579 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                    int i580 = (i579 ^ 16) + ((i579 & 16) << 1);
                                                                    Object[] objArr159 = new Object[1];
                                                                    delta("鶺摒抎줻媹䠞雧Ḽ⥂赃\udddc㪪ⵟ笹\ude9f怓", i580, objArr159);
                                                                    Class<?> cls2 = Class.forName((String) objArr159[0]);
                                                                    int gidForName2 = Process.getGidForName("");
                                                                    int i581 = (gidForName2 & 6) + (gidForName2 | 6);
                                                                    Object[] objArr160 = new Object[1];
                                                                    delta("磺㊭⥟듵实랸", i581, objArr160);
                                                                    cls2.getMethod((String) objArr160[0], null).invoke(newInstance, null);
                                                                    Object[] objArr161 = {new int[1], new int[]{i4}, new int[]{i4}, null};
                                                                    int uptimeMillis5 = (int) SystemClock.uptimeMillis();
                                                                    int i582 = ~uptimeMillis5;
                                                                    int foxtrot15 = A0.z.foxtrot((~(uptimeMillis5 | (-486767636))) | 997289539, 519, (((~(i582 | (-419523588))) | (~((-67244049) | uptimeMillis5))) * (-519)) + (((~((-997289540) | i582)) | (-486767636)) * 519) + 1837626598, 630388790);
                                                                    int i583 = foxtrot15 << 13;
                                                                    int i584 = ((~foxtrot15) & i583) | ((~i583) & foxtrot15);
                                                                    int i585 = i584 >>> 17;
                                                                    int i586 = ((~i584) & i585) | ((~i585) & i584);
                                                                    int i587 = i586 << 5;
                                                                    ((int[]) objArr161[0])[0] = ((~i586) & i587) | ((~i587) & i586);
                                                                    return objArr161;
                                                                } catch (Throwable th10) {
                                                                    Throwable cause4 = th10.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th10;
                                                                }
                                                            }
                                                            Object[] objArr162 = {new int[1], new int[]{i33}, new int[]{i4}, null};
                                                            int i588 = ~((~((int) Process.getElapsedCpuTime())) | 135543358);
                                                            int i589 = ((i588 | 1061424) * 970) + ((134481934 | i588) * (-970)) + 1079397723;
                                                            int i590 = (i589 ^ 16) + ((i589 & 16) << 1);
                                                            int i591 = ((i590 | 630388790) << 1) - (i590 ^ 630388790);
                                                            int i592 = i591 << 13;
                                                            int i593 = (i591 | i592) & (~(i591 & i592));
                                                            int i594 = i593 >>> 17;
                                                            int i595 = (i593 | i594) & (~(i593 & i594));
                                                            int i596 = i595 << 5;
                                                            c3 = 0;
                                                            ((int[]) objArr162[0])[0] = ((~i595) & i596) | ((~i596) & i595);
                                                            objArr = objArr162;
                                                        }
                                                        i34 = 2;
                                                        if (((int[]) objArr[i34])[c3] == ((int[]) objArr[1])[c3]) {
                                                        }
                                                    }
                                                    i29 = 1;
                                                    if (i30 != 0) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            Throwable cause5 = th11.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th11;
                                        }
                                    }
                                }
                                i26 = 0;
                                if (i26 == 0) {
                                }
                            }
                        } else {
                            i38 = i40;
                        }
                        if (invoke3 != null) {
                            Object[] objArr163 = new Object[2];
                            objArr163[i38] = 42;
                            objArr163[0] = invoke3;
                            Object D887137 = uH18377.D8871(2072770498);
                            if (D887137 == null) {
                                int i597 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 50;
                                int indexOf10 = TextUtils.indexOf((CharSequence) "", '0') + 1210;
                                char touchSlop3 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44356);
                                int i598 = i38;
                                byte b77 = (byte) i598;
                                byte b78 = (byte) (b77 - 1);
                                obj2 = invoke2;
                                Object[] objArr164 = new Object[i598];
                                bravo(b78, b77, b78, objArr164);
                                D887137 = uH18377.setPivotYN16904(i597, indexOf10, touchSlop3, -1540336361, false, (String) objArr164[0], new Class[]{String.class, cls});
                            } else {
                                obj2 = invoke2;
                            }
                            long longValue25 = ((Long) ((Method) D887137).invoke(null, objArr163)).longValue();
                            long j174 = 499623655;
                            j5 = j14;
                            obj3 = invoke3;
                            long elapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                            long j175 = elapsedRealtime6 ^ j12;
                            long j176 = 164;
                            long j177 = longValue25 ^ j12;
                            long j178 = ((j176 * (((longValue25 | (j175 | j174)) ^ j12) | ((((j174 ^ j12) | j177) ^ j12) | ((j177 | elapsedRealtime6) ^ j12)))) + (((j174 | elapsedRealtime6) * j176) + (((-328) * (j174 | ((j175 | longValue25) ^ j12))) + (((-163) * longValue25) + (165 * j174))))) - 507068685;
                            int i599 = ((int) (j178 >> 32)) & ((((~(1783995891 | i43)) | (~((-1073744994) | i43))) * 614) + (((~(1074044275 | i43)) | 709951616 | (~((-1783696610) | i43))) * (-1228)) + (((710250898 | i4) * 614) - 922904706));
                            int i600 = ((int) j178) & ((((-2139058111) | (~((-661327245) | i4)) | (~(661327244 | i43))) * 988) + (((~((-2098553655) | i43)) | 620822788) * (-1976)) + ((i4 | (-2139058111)) * 988) + 1217643309);
                        } else {
                            obj2 = invoke2;
                            j5 = j14;
                            obj3 = invoke3;
                        }
                        if (obj2 != null) {
                            Object[] objArr165 = {obj2, 42};
                            Object D887138 = uH18377.D8871(2072770498);
                            if (D887138 == null) {
                                int i601 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50;
                                int alpha3 = 1209 - Color.alpha(0);
                                char c29 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44356);
                                byte b79 = (byte) 1;
                                byte b80 = (byte) (b79 - 1);
                                Object[] objArr166 = new Object[1];
                                bravo(b80, b79, b80, objArr166);
                                D887138 = uH18377.setPivotYN16904(i601, alpha3, c29, -1540336361, false, (String) objArr166[0], new Class[]{String.class, cls});
                            }
                            long longValue26 = ((Long) ((Method) D887138).invoke(null, objArr165)).longValue();
                            long j179 = 1341817821;
                            long j180 = ((-68) * longValue26) + (70 * j179);
                            long j181 = 69;
                            long j182 = j179 ^ j12;
                            long j183 = longValue26 ^ j12;
                            long freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                            long j184 = ((j181 * ((j183 | j179) ^ j12)) + (((-69) * ((((j182 | longValue26) ^ j12) | ((j182 | freeMemory5) ^ j12)) | ((longValue26 | freeMemory5) ^ j12))) + ((((((j182 | j183) | freeMemory5) ^ j12) | (((j179 | longValue26) | freeMemory5) ^ j12)) * j181) + j180))) - 1349262851;
                            int i602 = (int) (j184 >> 32);
                            int myPid5 = Process.myPid();
                        }
                        if (obj3 != null) {
                            Object[] objArr167 = {obj3, 42};
                            Object D887139 = uH18377.D8871(2072770498);
                            if (D887139 == null) {
                                int indexOf11 = 50 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1209;
                                char pressedStateDuration5 = (char) (44356 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                byte b81 = (byte) 1;
                                byte b82 = (byte) (b81 - 1);
                                Object[] objArr168 = new Object[1];
                                bravo(b82, b81, b82, objArr168);
                                D887139 = uH18377.setPivotYN16904(indexOf11, maximumDrawingCacheSize2, pressedStateDuration5, -1540336361, false, (String) objArr168[0], new Class[]{String.class, cls});
                            }
                            long longValue27 = ((Long) ((Method) D887139).invoke(null, objArr167)).longValue();
                            long j185 = 629482074;
                            long j186 = ((-68) * longValue27) + (70 * j185);
                            long j187 = 69;
                            long j188 = j185 ^ j12;
                            long j189 = longValue27 ^ j12;
                            long freeMemory6 = (int) Runtime.getRuntime().freeMemory();
                            long j190 = ((j187 * ((j189 | j185) ^ j12)) + (((-69) * ((((j188 | longValue27) ^ j12) | ((j188 | freeMemory6) ^ j12)) | ((longValue27 | freeMemory6) ^ j12))) + ((((((j188 | j189) | freeMemory6) ^ j12) | (((j185 | longValue27) | freeMemory6) ^ j12)) * j187) + j186))) - 636927104;
                            int romeo3 = ao.ad.romeo();
                            int i603 = ((int) (j190 >> 32)) & ((((~((~romeo3) | (-1310723))) | (-1807662584)) * 521) + ((~((-1310723) | romeo3)) * 521) + 1948708688);
                            int tango5 = ao.ad.tango(165956296);
                            int i604 = ~tango5;
                            int i605 = ((int) j190) & ((((~(tango5 | 1457516535)) | (~((-1447699426) | i604)) | 655905) * 140) + (((~(10473015 | i604)) | (-1457516536)) * (-280)) + (((10473015 | tango5) * 140) - 889160043));
                        }
                        i18 = 0;
                        i15 = 1;
                        Object[] objArr252 = new Object[i15];
                        charlie((char) Color.green(i18), View.getDefaultSize(i18, i18), "\uf114׃\udf40螶\uf44dଭ䑁ྩ", "눔\udff3\ue941揑", objArr252);
                        String str82 = (String) objArr252[i18];
                        int i742 = -(-(ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)));
                        int i752 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i762 = (i752 ^ (-1)) + (i752 << 1);
                        Object[] objArr262 = new Object[1];
                        charlie((char) (((i742 | 7326) << 1) - (i742 ^ 7326)), i762, "\udbe2㱋彭\uf523탂ꍌ", "\ued7b\u1b4f黩䬜", objArr262);
                        String str92 = (String) objArr262[0];
                        int i772 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i782 = (i772 ^ 6) + ((i772 & 6) << 1);
                        Object[] objArr272 = new Object[1];
                        delta("\ud9efᄿ춖寭剈낧\uef7f핖", i782, objArr272);
                        String str102 = (String) objArr272[0];
                        int i792 = -(-TextUtils.lastIndexOf("", '0', 0));
                        Object[] objArr282 = new Object[1];
                        charlie((char) (((i792 | 1) << 1) - (i792 ^ 1)), (-1117402999) - (~(-KeyEvent.keyCodeFromString(""))), "\u1f1f\udb55\uda7d윕ᷧ᠔瞋ϭꇤ", "誉旈⺽퉆", objArr282);
                        String str112 = (String) objArr282[0];
                        int i802 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i812 = i802 * HttpConstants.HTTP_SEE_OTHER;
                        int i822 = (i812 ^ (-2107)) + ((i812 & (-2107)) << 1);
                        int i832 = ~i802;
                        int i842 = ~((i832 ^ i43) | (i832 & i43) | 7);
                        int i852 = (i802 ^ 7) | (i802 & 7);
                        int i862 = ~((i852 & i4) | (i852 ^ i4));
                        int i872 = -(-(((i842 & i862) | (i842 ^ i862)) * (-302)));
                        int i882 = (i822 & i872) + (i822 | i872);
                        int i892 = -(-((~((i832 & 7) | (i832 ^ 7) | i4)) * (-604)));
                        int i902 = ((i882 | i892) << 1) - (i892 ^ i882);
                        int i912 = ~((i802 & (-8)) | ((-8) ^ i802));
                        int i922 = ~((i4 ^ 7) | (i4 & 7));
                        int i932 = (((i912 & i922) | (i912 ^ i922)) * HttpConstants.HTTP_MOVED_TEMP) + i902;
                        Object[] objArr292 = new Object[1];
                        delta("\ue8dd碞ܔ躡料붝", i932, objArr292);
                        String str122 = (String) objArr292[0];
                        int i942 = -TextUtils.indexOf((CharSequence) "", '0');
                        int i952 = i942 * 375;
                        int i962 = ((-844857) ^ i952) + ((i952 & (-844857)) << 1);
                        int i972 = ~i942;
                        int i982 = ~((i972 ^ 1131) | (i972 & 1131));
                        int i992 = ~(i43 | i942);
                        int i1002 = -(-(((i982 & i992) | (i982 ^ i992)) * (-374)));
                        int i1012 = (((i962 ^ i1002) + ((i962 & i1002) << 1)) - (~(-(-((~(i942 | (-1132))) * 748))))) - 1;
                        int i1022 = ~((i972 ^ (-1132)) | (i972 & (-1132)));
                        int i1032 = -(-View.resolveSizeAndState(0, 0, 0));
                        int i1042 = (1117002965 ^ i1032) + ((i1032 & 1117002965) << 1);
                        Object[] objArr302 = new Object[1];
                        charlie((char) ((((i1022 & i992) | (i1022 ^ i992)) * 374) + i1012), i1042, "傌\uf382ᡧ嬏蚑\uf87eʞ\ue664ਈ\ud8ec睚낵鰼", "핥鐜求氄", objArr302);
                        String str132 = (String) objArr302[0];
                        char c122 = (char) (7442 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
                        int i1052 = -TextUtils.getCapsMode("", 0, 0);
                        int i1062 = ((-856061702) ^ i1052) + ((i1052 & (-856061702)) << 1);
                        Object[] objArr312 = new Object[1];
                        charlie(c122, i1062, "뀎䘏넃ӽち", "禍麗ዌ퀝", objArr312);
                        String str142 = (String) objArr312[0];
                        int i1072 = -AndroidCharacter.getMirror('0');
                        int i1082 = (i1072 ^ 54) + ((i1072 & 54) << 1);
                        Object[] objArr322 = new Object[1];
                        delta("牯\uef4c剈낧휇⮙", i1082, objArr322);
                        String str152 = (String) objArr322[0];
                        Object[] objArr332 = new Object[1];
                        charlie((char) (5403 - (ViewConfiguration.getTouchSlop() >> 8)), ViewConfiguration.getScrollBarFadeDuration() >> 16, "럊虘", "ૻ䖶ᬈ씕", objArr332);
                        String str162 = (String) objArr332[0];
                        int i1092 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Object[] objArr342 = new Object[1];
                        charlie((char) ((i1092 ^ 10425) + ((i1092 & 10425) << 1)), ViewConfiguration.getTapTimeout() >> 16, "됦輻髼潕妙㽅需\uf39f呎묤붑簾阮枌\u173e\ue2f6", "ﱝ윾맗䔨", objArr342);
                        String str172 = (String) objArr342[0];
                        int i1102 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int i1112 = (i1102 & 10) + (i1102 | 10);
                        Object[] objArr352 = new Object[1];
                        delta("\ue890徟၁덺罤⋠엃赯鬎\uec7a", i1112, objArr352);
                        String str182 = (String) objArr352[0];
                        Object[] objArr362 = new Object[1];
                        charlie((char) View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString(""), "蓁쬸侓왽ⳁ\u177c迤쥼", "稓\uf5b2ꌳ姚", objArr362);
                        String str192 = (String) objArr362[0];
                        Object[] objArr372 = new Object[1];
                        charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getPressedStateDuration() >> 16, "췈舶⭞ꨒ溻̥鸐众ⱋ\ue88aﱗᵪ", "⍏⾪㞼㚅", objArr372);
                        String str202 = (String) objArr372[0];
                        char c132 = (char) (23855 - (~(-View.resolveSize(0, 0))));
                        int axisFromString4 = MotionEvent.axisFromString("");
                        int i1122 = axisFromString4 * 50;
                        int i1132 = ~(((-2) ^ i43) | ((-2) & i43));
                        int i1142 = ~(((-2) ^ axisFromString4) | ((-2) & axisFromString4));
                        int i1152 = (((i1132 & i1142) | (i1132 ^ i1142)) * 98) + (((i1122 | (-97)) << 1) - (i1122 ^ (-97)));
                        int i1162 = ~axisFromString4;
                        int i1172 = -(-(((~((i1162 & i43) | (i1162 ^ i43))) | (-2) | (~((axisFromString4 ^ i4) | (axisFromString4 & i4)))) * (-49)));
                        int i1182 = ((i1152 | i1172) << 1) - (i1172 ^ i1152);
                        int i1192 = ~(((-2) ^ i4) | ((-2) & i4));
                        int i1202 = ~(axisFromString4 | 1);
                        int i1212 = (i1182 - (~(((i1202 & i1192) | (i1192 ^ i1202)) * 49))) - 1;
                        Object[] objArr382 = new Object[1];
                        charlie(c132, i1212, "茏뼔俠릹鲾檫答ﮐ嶆㓣䙈뼐멣ᆖ", "䴪痱そ婝", objArr382);
                        String str212 = (String) objArr382[0];
                        Object[] objArr392 = new Object[1];
                        delta("ⵟ笹\u12d7杙嵔戃实랸", 6 - (~(ViewConfiguration.getEdgeSlop() >> 16)), objArr392);
                        String str222 = (String) objArr392[0];
                        int i1222 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i1232 = (i1222 ^ 7) + ((i1222 & 7) << 1);
                        Object[] objArr402 = new Object[1];
                        delta("\ue916ሧ挰듖廈轳䤜벛", i1232, objArr402);
                        String str232 = (String) objArr402[0];
                        int i1242 = -((byte) KeyEvent.getModifierMetaStateMask());
                        int i1252 = (i1242 & 6) + (i1242 | 6);
                        Object[] objArr412 = new Object[1];
                        delta("ꤣ㎳料붝\ue16c돘\ude78讣", i1252, objArr412);
                        String str242 = (String) objArr412[0];
                        int i1262 = -TextUtils.lastIndexOf("", '0', 0, 0);
                        Object[] objArr422 = new Object[1];
                        charlie((char) ((64436 ^ i1262) + ((i1262 & 64436) << 1)), ViewConfiguration.getEdgeSlop() >> 16, "뀦ᎄ", "퓏퀣떆拻", objArr422);
                        String str252 = (String) objArr422[0];
                        int i1272 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i1282 = (i1272 & 19) + (i1272 | 19);
                        Object[] objArr432 = new Object[1];
                        delta("磺㊭⥟듵븆歔杙ᶒ跉渰铲迣縇\u16fe\u0edb뾦˗圯䎍汥", i1282, objArr432);
                        String str262 = (String) objArr432[0];
                        Object[] objArr442 = new Object[1];
                        delta("磺㊭㟄་笠麑", 5 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr442);
                        String str272 = (String) objArr442[0];
                        int i1292 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i1302 = (i1292 ^ 3) + ((i1292 & 3) << 1);
                        Object[] objArr452 = new Object[1];
                        delta("䮺\uf3c8", i1302, objArr452);
                        String str282 = (String) objArr452[0];
                        Object[] objArr462 = new Object[1];
                        charlie((char) (TextUtils.lastIndexOf("", '0', 0) + 56400), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "碑蟡יּ\ue628춉זּ턍ᗂ늅ﲫ㝻鉹뷤캟홡翦", "Ƒ\ue32f佅\ua7dc", objArr462);
                        String str292 = (String) objArr462[0];
                        Object[] objArr472 = new Object[1];
                        delta("ۗ൷虯ׁ瘛ꪯ\ue73eன贘눴", 8 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr472);
                        String str302 = (String) objArr472[0];
                        Object[] objArr482 = new Object[1];
                        charlie((char) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0')) ^ (-1))), View.MeasureSpec.makeMeasureSpec(0, 0), "䉀ᅎ딍\u0de1Ổ蛏㕏ㆷ惡耂", "憊\uaada锿\uf45b", objArr482);
                        String str312 = (String) objArr482[0];
                        int i1312 = -(-ExpandableListView.getPackedPositionType(0L));
                        int i1322 = (i1312 & 11) + (i1312 | 11);
                        Object[] objArr492 = new Object[1];
                        delta("ۗ൷虯ׁ剈낧騵簙\ue16c돘ᤷ\ueb4a", i1322, objArr492);
                        String str322 = (String) objArr492[0];
                        Object[] objArr502 = new Object[1];
                        delta("嵔戃杙ᶒᄿ淆ᣥ直╾\ue60e럙螕", 10 - (~Color.argb(0, 0, 0, 0)), objArr502);
                        String str332 = (String) objArr502[0];
                        int i1332 = -(-View.combineMeasuredStates(0, 0));
                        int i1342 = (i1332 & 15) + (i1332 | 15);
                        Object[] objArr512 = new Object[1];
                        delta("嵔戃杙ᶒᄿ淆⦾㜈塅ⰻᣥ直╾\ue60e럙螕", i1342, objArr512);
                        String str342 = (String) objArr512[0];
                        int i1352 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int i1362 = ((i1352 | 14) << 1) - (i1352 ^ 14);
                        Object[] objArr522 = new Object[1];
                        delta("嵔戃杙ᶒᄿ淆岾䆈지肇ᝪꕌ줷獱", i1362, objArr522);
                        String[] strArr52 = {str82, str92, str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, (String) objArr522[0]};
                        char longPressTimeout22 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i1372 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i1382 = ((-574811477) ^ i1372) + ((i1372 & (-574811477)) << 1);
                        Object[] objArr532 = new Object[1];
                        charlie(longPressTimeout22, i1382, "镸\ue74c銏皗\ud8e7铨寸킍줅䃮䫡", "ꭆ봒藝⮤", objArr532);
                        Object[] objArr542 = {(String) objArr532[0]};
                        D8871 = uH18377.D8871(i13);
                        if (D8871 == null) {
                        }
                        str = (String) ((Method) D8871).invoke(null, objArr542);
                        if (str != null) {
                        }
                        Object[] objArr682 = new Object[1];
                        delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 21 - (~(-Process.getGidForName(""))), objArr682);
                        Object[] objArr692 = {(String) objArr682[0]};
                        D88712 = uH18377.D8871(1553409481);
                        if (D88712 == null) {
                        }
                        long longValue62 = ((Long) ((Method) D88712).invoke(null, objArr692)).longValue();
                        long j402 = 131352053;
                        long j412 = 130;
                        long j422 = longValue62 ^ j12;
                        long j432 = ((((j422 | j15) | j402) ^ j12) * j412) + (131 * longValue62) + ((-129) * j402);
                        long j442 = j422 | j402;
                        long j452 = ((j412 * (((longValue62 | (j402 ^ j12)) ^ j12) | ((j442 | j5) ^ j12))) + (((-260) * (j442 ^ j12)) + j432)) - 273999709;
                        int i1592 = ((int) (j452 >> 32)) & ((((~((-418743600) | i4)) | (-1855970011)) * 529) + (((~(i43 | (-418743600))) | 274728229) * 529) + 1520786966);
                        int freeMemory7 = (int) Runtime.getRuntime().freeMemory();
                        int i1602 = ~freeMemory7;
                        int i1612 = ((int) j452) & ((((~(freeMemory7 | (-1376954818))) | 1342308480 | (~(i1602 | 1515432405))) * 521) + ((1480786068 | freeMemory7) * 521) + (((~(i1602 | 1480786068)) | 1376954817) * (-1042)) + 301266666);
                        j6 = (i1592 & i1612) | (i1592 ^ i1612);
                        int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                        int i1622 = -View.combineMeasuredStates(0, 0);
                        int i1632 = (i1622 ^ 210546266) + ((i1622 & 210546266) << 1);
                        Object[] objArr712 = new Object[1];
                        charlie((char) ((scrollBarSize2 & 35772) + (scrollBarSize2 | 35772)), i1632, "勮栔淶뫔Ꮃꕆ䌨衩명鱊嬐䑪व\uf297\udb50㠅\uefd2", "嫦貮밌箋", objArr712);
                        Object[] objArr722 = {(String) objArr712[0]};
                        D88713 = uH18377.D8871(1553409481);
                        if (D88713 == null) {
                        }
                        long longValue72 = ((Long) ((Method) D88713).invoke(null, objArr722)).longValue();
                        long j462 = 593875283;
                        long j472 = -947;
                        long j482 = 949;
                        long j492 = j482 * longValue72;
                        long j502 = -948;
                        long j512 = j462 ^ j12;
                        long j522 = longValue72 ^ j12;
                        long j532 = ((((j512 | j522) | j15) ^ j12) * j502) + ((j512 | ((j522 | j5) ^ j12)) * j502) + j492 + (j472 * j462);
                        long j542 = 948;
                        long j552 = (((j462 | j522) * j542) + j532) - 736522939;
                        int elapsedRealtime22 = (int) SystemClock.elapsedRealtime();
                        int i1642 = (((~((~elapsedRealtime22) | 953173726)) | 1090855200) * (-245)) - 1694584030;
                        int i1652 = ~(elapsedRealtime22 | 953173726);
                        int i1662 = ((int) (j552 >> 32)) & (((i1652 | (-1904567159)) * 245) + (i1652 * (-245)) + i1642);
                        int i1672 = ((int) j552) & ((((~(375788313 | i4)) | (-1063670682) | (~((-373555729) | i43))) * 988) + (((~((-687882369) | i43)) | (~((-373555729) | i4))) * 988) + 768568557);
                        long j562 = (i1662 & i1672) | (i1662 ^ i1672);
                        if (j6 <= 0) {
                        }
                        Object[] objArr752 = new Object[1];
                        delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr752);
                        Object[] objArr762 = {(String) objArr752[0]};
                        D88714 = uH18377.D8871(1553409481);
                        if (D88714 == null) {
                        }
                        long longValue82 = ((Long) ((Method) D88714).invoke(null, objArr762)).longValue();
                        long j572 = 1869715806;
                        long j582 = 628;
                        long j592 = (j582 * longValue82) + (j582 * j572);
                        long j602 = -627;
                        long elapsedRealtime32 = (int) SystemClock.elapsedRealtime();
                        long j612 = ((627 * ((((elapsedRealtime32 ^ j12) | longValue82) ^ j12) | ((j572 | elapsedRealtime32) ^ j12))) + (((j572 | (((longValue82 ^ j12) | elapsedRealtime32) ^ j12)) * j602) + ((((longValue82 | elapsedRealtime32) | (j572 ^ j12)) * j602) + j592))) - 2012363462;
                        int i1752 = ((int) (j612 >> 32)) & ((((~(1494750493 | i43)) | (~((-57524083) | i43)) | (~((-1477443598) | i4))) * Smooth$Close.expectedVersionCode) + (((~((-1494750494) | i4)) | (~(57524082 | i4)) | (~((-40217187) | i43))) * (-568)) + (((~((-1494750494) | i43)) | 1477443597 | (~(57524082 | i43))) * (-1136)) + 1738041050);
                        int i1762 = ((int) j612) & ((((~((-76554369) | i4)) | 553747753) * 366) + ((((~((-1190273751) | i4)) | 1667467135) * (-366)) - 1837825719));
                        long j622 = (i1752 & i1762) | (i1752 ^ i1762);
                        int i1772 = -KeyEvent.normalizeMetaState(0);
                        int bravo22 = com.fingerprintjs.android.fpjs_pro.c.bravo();
                        int i1782 = i1772 * (-523);
                        int i1792 = (i1782 ^ 1052) + ((i1782 & 1052) << 1);
                        int i1802 = ~i1772;
                        int i1812 = ~((i1802 & 4) | (i1802 ^ 4));
                        int i1822 = ~(((-5) ^ i1772) | ((-5) & i1772));
                        int i1832 = (i1812 ^ i1822) | (i1812 & i1822);
                        int i1842 = ~(((-5) ^ bravo22) | ((-5) & bravo22));
                        int i1852 = (((i1832 ^ i1842) | (i1832 & i1842)) * 262) + i1792;
                        int i1862 = -(-((~((-5) | i1772)) * (-786)));
                        int i1872 = (i1852 ^ i1862) + ((i1852 & i1862) << 1);
                        int i1882 = ~bravo22;
                        int i1892 = ~((i1882 & (-5)) | ((-5) ^ i1882));
                        int i1902 = (i1892 & i1812) | (i1892 ^ i1812);
                        Object[] objArr782 = new Object[1];
                        delta("ꔫ뾁ꎦⰶ", (((i1902 & i1822) | (i1902 ^ i1822)) * 262) + i1872, objArr782);
                        Object[] objArr792 = {(String) objArr782[0]};
                        D88715 = uH18377.D8871(1553409481);
                        if (D88715 == null) {
                        }
                        long longValue92 = ((Long) ((Method) D88715).invoke(null, objArr792)).longValue();
                        long j632 = 1859262404;
                        long j642 = -55;
                        long j652 = (j642 * longValue92) + (j642 * j632);
                        long j662 = 56;
                        long j672 = (int) Runtime.getRuntime().totalMemory();
                        long j682 = (((j632 | (((j672 ^ j12) | longValue92) ^ j12)) * j662) + (((-56) * ((j632 | longValue92) ^ j12)) + (((longValue92 | ((j632 | j672) ^ j12)) * j662) + j652))) - 2001910060;
                        int maxMemory22 = (int) Runtime.getRuntime().maxMemory();
                        int i1912 = ~maxMemory22;
                        int i1922 = (~(440292646 | i1912)) | 1707125457;
                        int i1932 = ~(maxMemory22 | (-269899047));
                        long j692 = (((int) (j682 >> 32)) & (((i1932 | (~(i1912 | 2147418103))) * 252) + ((i1922 | i1932) * (-252)) + 2136111974)) | (((int) j682) & ((((-1634691229) | (~(197464818 | i43))) * 56) + (((~((-1634691229) | i4)) | 197464818) * 56) + 1582408989));
                        i19 = -17;
                        if (j7 > 0) {
                        }
                        char indexOf42 = (char) TextUtils.indexOf("", "", 0, 0);
                        int i2202 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i2212 = (i2202 & 878354832) + (i2202 | 878354832);
                        Object[] objArr822 = new Object[1];
                        charlie(indexOf42, i2212, "ᑈ၆員븭ꠇ阶郸", "醰媡鄴\uf041", objArr822);
                        String str362 = (String) objArr822[0];
                        Object[] objArr832 = new Object[1];
                        delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ݼ媑ᓳ늄", 9 - (~(-ImageFormat.getBitsPerPixel(0))), objArr832);
                        String str372 = (String) objArr832[0];
                        int i2222 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i2232 = i2222 * 758;
                        int i2242 = ((i2232 | (-9072)) << 1) - (i2232 ^ (-9072));
                        int i2252 = ((i2222 ^ i43) | (i2222 & i43)) * (-757);
                        int i2262 = ((i2242 | i2252) << 1) - (i2252 ^ i2242);
                        int i2272 = ((-13) & i2222) | ((-13) ^ i2222);
                        int i2282 = (~((i2272 & i4) | (i2272 ^ i4))) * 1514;
                        int i2292 = ((i2262 | i2282) << 1) - (i2282 ^ i2262);
                        int i2302 = ~i2222;
                        int i2312 = (~((i2302 & (-13)) | (i2302 ^ (-13)))) | (~((-13) | i43));
                        int i2322 = i2222 | 12;
                        int i2332 = ~((i2322 & i4) | (i2322 ^ i4));
                        int i2342 = -(-(((i2332 & i2312) | (i2312 ^ i2332)) * 757));
                        int i2352 = ((i2292 | i2342) << 1) - (i2342 ^ i2292);
                        Object[] objArr842 = new Object[1];
                        delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16\ude8f葵觢賯", i2352, objArr842);
                        String str382 = (String) objArr842[0];
                        Object[] objArr852 = new Object[1];
                        charlie((char) TextUtils.indexOf("", ""), View.getDefaultSize(0, 0), "頡Ẳ꾾巭昸祩쁄螖Ǣ⍕棖\udc63", "Ⱇ\uf6f4䧚羅", objArr852);
                        String str392 = (String) objArr852[0];
                        char indexOf52 = (char) TextUtils.indexOf("", "", 0);
                        int i2362 = -(-TextUtils.getOffsetBefore("", 0));
                        i20 = 1;
                        int i2372 = ((i2362 | 345185435) << 1) - (i2362 ^ 345185435);
                        Object[] objArr862 = new Object[1];
                        charlie(indexOf52, i2372, "\ued91蔮䗾䲬屽굋터쮭\ue326踍\ue466", "魻錜樂귷", objArr862);
                        String str402 = (String) objArr862[0];
                        int i2382 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i2392 = ((i2382 | 4) << 1) - (i2382 ^ 4);
                        Object[] objArr872 = new Object[1];
                        delta("佘ᦘݼ媑ᓳ늄", i2392, objArr872);
                        String str412 = (String) objArr872[0];
                        int i2402 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i2412 = (i2402 ^ 4) + ((i2402 & 4) << 1);
                        Object[] objArr882 = new Object[1];
                        delta("ꄉ郛⍖掎", i2412, objArr882);
                        i21 = 0;
                        strArr = new String[]{str362, str372, str382, str392, str402, str412, (String) objArr882[0]};
                        i22 = 0;
                        i23 = i12;
                        while (true) {
                            if (i22 >= i23) {
                            }
                            i22 = i36 + 1;
                            i19 = i24;
                            strArr = strArr3;
                            i23 = 7;
                            i21 = 0;
                            i20 = 1;
                        }
                        if (i25 != 0) {
                        }
                    } else {
                        long j191 = j14;
                        int i606 = (i54 & (-15)) + (i54 | (-15));
                        i54 = ((i606 | 16) << 1) - (i606 ^ 16);
                        i40 = 1;
                        j14 = j191;
                        i55 = 2;
                        i39 = 0;
                    }
                }
                j5 = j14;
                i15 = i40;
            } else {
                j5 = j14;
                i15 = 1;
                i16 = 50;
                i17 = 51;
            }
            i18 = i39;
            Object[] objArr2522 = new Object[i15];
            charlie((char) Color.green(i18), View.getDefaultSize(i18, i18), "\uf114׃\udf40螶\uf44dଭ䑁ྩ", "눔\udff3\ue941揑", objArr2522);
            String str822 = (String) objArr2522[i18];
            int i7422 = -(-(ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)));
            int i7522 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i7622 = (i7522 ^ (-1)) + (i7522 << 1);
            Object[] objArr2622 = new Object[1];
            charlie((char) (((i7422 | 7326) << 1) - (i7422 ^ 7326)), i7622, "\udbe2㱋彭\uf523탂ꍌ", "\ued7b\u1b4f黩䬜", objArr2622);
            String str922 = (String) objArr2622[0];
            int i7722 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i7822 = (i7722 ^ 6) + ((i7722 & 6) << 1);
            Object[] objArr2722 = new Object[1];
            delta("\ud9efᄿ춖寭剈낧\uef7f핖", i7822, objArr2722);
            String str1022 = (String) objArr2722[0];
            int i7922 = -(-TextUtils.lastIndexOf("", '0', 0));
            Object[] objArr2822 = new Object[1];
            charlie((char) (((i7922 | 1) << 1) - (i7922 ^ 1)), (-1117402999) - (~(-KeyEvent.keyCodeFromString(""))), "\u1f1f\udb55\uda7d윕ᷧ᠔瞋ϭꇤ", "誉旈⺽퉆", objArr2822);
            String str1122 = (String) objArr2822[0];
            int i8022 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i8122 = i8022 * HttpConstants.HTTP_SEE_OTHER;
            int i8222 = (i8122 ^ (-2107)) + ((i8122 & (-2107)) << 1);
            int i8322 = ~i8022;
            int i8422 = ~((i8322 ^ i43) | (i8322 & i43) | 7);
            int i8522 = (i8022 ^ 7) | (i8022 & 7);
            int i8622 = ~((i8522 & i4) | (i8522 ^ i4));
            int i8722 = -(-(((i8422 & i8622) | (i8422 ^ i8622)) * (-302)));
            int i8822 = (i8222 & i8722) + (i8222 | i8722);
            int i8922 = -(-((~((i8322 & 7) | (i8322 ^ 7) | i4)) * (-604)));
            int i9022 = ((i8822 | i8922) << 1) - (i8922 ^ i8822);
            int i9122 = ~((i8022 & (-8)) | ((-8) ^ i8022));
            int i9222 = ~((i4 ^ 7) | (i4 & 7));
            int i9322 = (((i9122 & i9222) | (i9122 ^ i9222)) * HttpConstants.HTTP_MOVED_TEMP) + i9022;
            Object[] objArr2922 = new Object[1];
            delta("\ue8dd碞ܔ躡料붝", i9322, objArr2922);
            String str1222 = (String) objArr2922[0];
            int i9422 = -TextUtils.indexOf((CharSequence) "", '0');
            int i9522 = i9422 * 375;
            int i9622 = ((-844857) ^ i9522) + ((i9522 & (-844857)) << 1);
            int i9722 = ~i9422;
            int i9822 = ~((i9722 ^ 1131) | (i9722 & 1131));
            int i9922 = ~(i43 | i9422);
            int i10022 = -(-(((i9822 & i9922) | (i9822 ^ i9922)) * (-374)));
            int i10122 = (((i9622 ^ i10022) + ((i9622 & i10022) << 1)) - (~(-(-((~(i9422 | (-1132))) * 748))))) - 1;
            int i10222 = ~((i9722 ^ (-1132)) | (i9722 & (-1132)));
            int i10322 = -(-View.resolveSizeAndState(0, 0, 0));
            int i10422 = (1117002965 ^ i10322) + ((i10322 & 1117002965) << 1);
            Object[] objArr3022 = new Object[1];
            charlie((char) ((((i10222 & i9922) | (i10222 ^ i9922)) * 374) + i10122), i10422, "傌\uf382ᡧ嬏蚑\uf87eʞ\ue664ਈ\ud8ec睚낵鰼", "핥鐜求氄", objArr3022);
            String str1322 = (String) objArr3022[0];
            char c1222 = (char) (7442 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))));
            int i10522 = -TextUtils.getCapsMode("", 0, 0);
            int i10622 = ((-856061702) ^ i10522) + ((i10522 & (-856061702)) << 1);
            Object[] objArr3122 = new Object[1];
            charlie(c1222, i10622, "뀎䘏넃ӽち", "禍麗ዌ퀝", objArr3122);
            String str1422 = (String) objArr3122[0];
            int i10722 = -AndroidCharacter.getMirror('0');
            int i10822 = (i10722 ^ 54) + ((i10722 & 54) << 1);
            Object[] objArr3222 = new Object[1];
            delta("牯\uef4c剈낧휇⮙", i10822, objArr3222);
            String str1522 = (String) objArr3222[0];
            Object[] objArr3322 = new Object[1];
            charlie((char) (5403 - (ViewConfiguration.getTouchSlop() >> 8)), ViewConfiguration.getScrollBarFadeDuration() >> 16, "럊虘", "ૻ䖶ᬈ씕", objArr3322);
            String str1622 = (String) objArr3322[0];
            int i10922 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            Object[] objArr3422 = new Object[1];
            charlie((char) ((i10922 ^ 10425) + ((i10922 & 10425) << 1)), ViewConfiguration.getTapTimeout() >> 16, "됦輻髼潕妙㽅需\uf39f呎묤붑簾阮枌\u173e\ue2f6", "ﱝ윾맗䔨", objArr3422);
            String str1722 = (String) objArr3422[0];
            int i11022 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            int i11122 = (i11022 & 10) + (i11022 | 10);
            Object[] objArr3522 = new Object[1];
            delta("\ue890徟၁덺罤⋠엃赯鬎\uec7a", i11122, objArr3522);
            String str1822 = (String) objArr3522[0];
            Object[] objArr3622 = new Object[1];
            charlie((char) View.MeasureSpec.getMode(0), KeyEvent.keyCodeFromString(""), "蓁쬸侓왽ⳁ\u177c迤쥼", "稓\uf5b2ꌳ姚", objArr3622);
            String str1922 = (String) objArr3622[0];
            Object[] objArr3722 = new Object[1];
            charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getPressedStateDuration() >> 16, "췈舶⭞ꨒ溻̥鸐众ⱋ\ue88aﱗᵪ", "⍏⾪㞼㚅", objArr3722);
            String str2022 = (String) objArr3722[0];
            char c1322 = (char) (23855 - (~(-View.resolveSize(0, 0))));
            int axisFromString42 = MotionEvent.axisFromString("");
            int i11222 = axisFromString42 * 50;
            int i11322 = ~(((-2) ^ i43) | ((-2) & i43));
            int i11422 = ~(((-2) ^ axisFromString42) | ((-2) & axisFromString42));
            int i11522 = (((i11322 & i11422) | (i11322 ^ i11422)) * 98) + (((i11222 | (-97)) << 1) - (i11222 ^ (-97)));
            int i11622 = ~axisFromString42;
            int i11722 = -(-(((~((i11622 & i43) | (i11622 ^ i43))) | (-2) | (~((axisFromString42 ^ i4) | (axisFromString42 & i4)))) * (-49)));
            int i11822 = ((i11522 | i11722) << 1) - (i11722 ^ i11522);
            int i11922 = ~(((-2) ^ i4) | ((-2) & i4));
            int i12022 = ~(axisFromString42 | 1);
            int i12122 = (i11822 - (~(((i12022 & i11922) | (i11922 ^ i12022)) * 49))) - 1;
            Object[] objArr3822 = new Object[1];
            charlie(c1322, i12122, "茏뼔俠릹鲾檫答ﮐ嶆㓣䙈뼐멣ᆖ", "䴪痱そ婝", objArr3822);
            String str2122 = (String) objArr3822[0];
            Object[] objArr3922 = new Object[1];
            delta("ⵟ笹\u12d7杙嵔戃实랸", 6 - (~(ViewConfiguration.getEdgeSlop() >> 16)), objArr3922);
            String str2222 = (String) objArr3922[0];
            int i12222 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i12322 = (i12222 ^ 7) + ((i12222 & 7) << 1);
            Object[] objArr4022 = new Object[1];
            delta("\ue916ሧ挰듖廈轳䤜벛", i12322, objArr4022);
            String str2322 = (String) objArr4022[0];
            int i12422 = -((byte) KeyEvent.getModifierMetaStateMask());
            int i12522 = (i12422 & 6) + (i12422 | 6);
            Object[] objArr4122 = new Object[1];
            delta("ꤣ㎳料붝\ue16c돘\ude78讣", i12522, objArr4122);
            String str2422 = (String) objArr4122[0];
            int i12622 = -TextUtils.lastIndexOf("", '0', 0, 0);
            Object[] objArr4222 = new Object[1];
            charlie((char) ((64436 ^ i12622) + ((i12622 & 64436) << 1)), ViewConfiguration.getEdgeSlop() >> 16, "뀦ᎄ", "퓏퀣떆拻", objArr4222);
            String str2522 = (String) objArr4222[0];
            int i12722 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int i12822 = (i12722 & 19) + (i12722 | 19);
            Object[] objArr4322 = new Object[1];
            delta("磺㊭⥟듵븆歔杙ᶒ跉渰铲迣縇\u16fe\u0edb뾦˗圯䎍汥", i12822, objArr4322);
            String str2622 = (String) objArr4322[0];
            Object[] objArr4422 = new Object[1];
            delta("磺㊭㟄་笠麑", 5 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), objArr4422);
            String str2722 = (String) objArr4422[0];
            int i12922 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i13022 = (i12922 ^ 3) + ((i12922 & 3) << 1);
            Object[] objArr4522 = new Object[1];
            delta("䮺\uf3c8", i13022, objArr4522);
            String str2822 = (String) objArr4522[0];
            Object[] objArr4622 = new Object[1];
            charlie((char) (TextUtils.lastIndexOf("", '0', 0) + 56400), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "碑蟡יּ\ue628춉זּ턍ᗂ늅ﲫ㝻鉹뷤캟홡翦", "Ƒ\ue32f佅\ua7dc", objArr4622);
            String str2922 = (String) objArr4622[0];
            Object[] objArr4722 = new Object[1];
            delta("ۗ൷虯ׁ瘛ꪯ\ue73eன贘눴", 8 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), objArr4722);
            String str3022 = (String) objArr4722[0];
            Object[] objArr4822 = new Object[1];
            charlie((char) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0')) ^ (-1))), View.MeasureSpec.makeMeasureSpec(0, 0), "䉀ᅎ딍\u0de1Ổ蛏㕏ㆷ惡耂", "憊\uaada锿\uf45b", objArr4822);
            String str3122 = (String) objArr4822[0];
            int i13122 = -(-ExpandableListView.getPackedPositionType(0L));
            int i13222 = (i13122 & 11) + (i13122 | 11);
            Object[] objArr4922 = new Object[1];
            delta("ۗ൷虯ׁ剈낧騵簙\ue16c돘ᤷ\ueb4a", i13222, objArr4922);
            String str3222 = (String) objArr4922[0];
            Object[] objArr5022 = new Object[1];
            delta("嵔戃杙ᶒᄿ淆ᣥ直╾\ue60e럙螕", 10 - (~Color.argb(0, 0, 0, 0)), objArr5022);
            String str3322 = (String) objArr5022[0];
            int i13322 = -(-View.combineMeasuredStates(0, 0));
            int i13422 = (i13322 & 15) + (i13322 | 15);
            Object[] objArr5122 = new Object[1];
            delta("嵔戃杙ᶒᄿ淆⦾㜈塅ⰻᣥ直╾\ue60e럙螕", i13422, objArr5122);
            String str3422 = (String) objArr5122[0];
            int i13522 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i13622 = ((i13522 | 14) << 1) - (i13522 ^ 14);
            Object[] objArr5222 = new Object[1];
            delta("嵔戃杙ᶒᄿ淆岾䆈지肇ᝪꕌ줷獱", i13622, objArr5222);
            String[] strArr522 = {str822, str922, str1022, str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, str3322, str3422, (String) objArr5222[0]};
            char longPressTimeout222 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int i13722 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i13822 = ((-574811477) ^ i13722) + ((i13722 & (-574811477)) << 1);
            Object[] objArr5322 = new Object[1];
            charlie(longPressTimeout222, i13822, "镸\ue74c銏皗\ud8e7铨寸킍줅䃮䫡", "ꭆ봒藝⮤", objArr5322);
            Object[] objArr5422 = {(String) objArr5322[0]};
            D8871 = uH18377.D8871(i13);
            if (D8871 == null) {
            }
            str = (String) ((Method) D8871).invoke(null, objArr5422);
            if (str != null) {
            }
            Object[] objArr6822 = new Object[1];
            delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 21 - (~(-Process.getGidForName(""))), objArr6822);
            Object[] objArr6922 = {(String) objArr6822[0]};
            D88712 = uH18377.D8871(1553409481);
            if (D88712 == null) {
            }
            long longValue622 = ((Long) ((Method) D88712).invoke(null, objArr6922)).longValue();
            long j4022 = 131352053;
            long j4122 = 130;
            long j4222 = longValue622 ^ j12;
            long j4322 = ((((j4222 | j15) | j4022) ^ j12) * j4122) + (131 * longValue622) + ((-129) * j4022);
            long j4422 = j4222 | j4022;
            long j4522 = ((j4122 * (((longValue622 | (j4022 ^ j12)) ^ j12) | ((j4422 | j5) ^ j12))) + (((-260) * (j4422 ^ j12)) + j4322)) - 273999709;
            int i15922 = ((int) (j4522 >> 32)) & ((((~((-418743600) | i4)) | (-1855970011)) * 529) + (((~(i43 | (-418743600))) | 274728229) * 529) + 1520786966);
            int freeMemory72 = (int) Runtime.getRuntime().freeMemory();
            int i16022 = ~freeMemory72;
            int i16122 = ((int) j4522) & ((((~(freeMemory72 | (-1376954818))) | 1342308480 | (~(i16022 | 1515432405))) * 521) + ((1480786068 | freeMemory72) * 521) + (((~(i16022 | 1480786068)) | 1376954817) * (-1042)) + 301266666);
            j6 = (i15922 & i16122) | (i15922 ^ i16122);
            int scrollBarSize22 = ViewConfiguration.getScrollBarSize() >> 8;
            int i16222 = -View.combineMeasuredStates(0, 0);
            int i16322 = (i16222 ^ 210546266) + ((i16222 & 210546266) << 1);
            Object[] objArr7122 = new Object[1];
            charlie((char) ((scrollBarSize22 & 35772) + (scrollBarSize22 | 35772)), i16322, "勮栔淶뫔Ꮃꕆ䌨衩명鱊嬐䑪व\uf297\udb50㠅\uefd2", "嫦貮밌箋", objArr7122);
            Object[] objArr7222 = {(String) objArr7122[0]};
            D88713 = uH18377.D8871(1553409481);
            if (D88713 == null) {
            }
            long longValue722 = ((Long) ((Method) D88713).invoke(null, objArr7222)).longValue();
            long j4622 = 593875283;
            long j4722 = -947;
            long j4822 = 949;
            long j4922 = j4822 * longValue722;
            long j5022 = -948;
            long j5122 = j4622 ^ j12;
            long j5222 = longValue722 ^ j12;
            long j5322 = ((((j5122 | j5222) | j15) ^ j12) * j5022) + ((j5122 | ((j5222 | j5) ^ j12)) * j5022) + j4922 + (j4722 * j4622);
            long j5422 = 948;
            long j5522 = (((j4622 | j5222) * j5422) + j5322) - 736522939;
            int elapsedRealtime222 = (int) SystemClock.elapsedRealtime();
            int i16422 = (((~((~elapsedRealtime222) | 953173726)) | 1090855200) * (-245)) - 1694584030;
            int i16522 = ~(elapsedRealtime222 | 953173726);
            int i16622 = ((int) (j5522 >> 32)) & (((i16522 | (-1904567159)) * 245) + (i16522 * (-245)) + i16422);
            int i16722 = ((int) j5522) & ((((~(375788313 | i4)) | (-1063670682) | (~((-373555729) | i43))) * 988) + (((~((-687882369) | i43)) | (~((-373555729) | i4))) * 988) + 768568557);
            long j5622 = (i16622 & i16722) | (i16622 ^ i16722);
            if (j6 <= 0) {
            }
            Object[] objArr7522 = new Object[1];
            delta("佘ᦘ㎨꼢\ufae6ᮛ\ueab9滶伢ऐ料붝帷賜皠\ud9fd⥫斏咐飈鬎\uec7a锵맋", 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7522);
            Object[] objArr7622 = {(String) objArr7522[0]};
            D88714 = uH18377.D8871(1553409481);
            if (D88714 == null) {
            }
            long longValue822 = ((Long) ((Method) D88714).invoke(null, objArr7622)).longValue();
            long j5722 = 1869715806;
            long j5822 = 628;
            long j5922 = (j5822 * longValue822) + (j5822 * j5722);
            long j6022 = -627;
            long elapsedRealtime322 = (int) SystemClock.elapsedRealtime();
            long j6122 = ((627 * ((((elapsedRealtime322 ^ j12) | longValue822) ^ j12) | ((j5722 | elapsedRealtime322) ^ j12))) + (((j5722 | (((longValue822 ^ j12) | elapsedRealtime322) ^ j12)) * j6022) + ((((longValue822 | elapsedRealtime322) | (j5722 ^ j12)) * j6022) + j5922))) - 2012363462;
            int i17522 = ((int) (j6122 >> 32)) & ((((~(1494750493 | i43)) | (~((-57524083) | i43)) | (~((-1477443598) | i4))) * Smooth$Close.expectedVersionCode) + (((~((-1494750494) | i4)) | (~(57524082 | i4)) | (~((-40217187) | i43))) * (-568)) + (((~((-1494750494) | i43)) | 1477443597 | (~(57524082 | i43))) * (-1136)) + 1738041050);
            int i17622 = ((int) j6122) & ((((~((-76554369) | i4)) | 553747753) * 366) + ((((~((-1190273751) | i4)) | 1667467135) * (-366)) - 1837825719));
            long j6222 = (i17522 & i17622) | (i17522 ^ i17622);
            int i17722 = -KeyEvent.normalizeMetaState(0);
            int bravo222 = com.fingerprintjs.android.fpjs_pro.c.bravo();
            int i17822 = i17722 * (-523);
            int i17922 = (i17822 ^ 1052) + ((i17822 & 1052) << 1);
            int i18022 = ~i17722;
            int i18122 = ~((i18022 & 4) | (i18022 ^ 4));
            int i18222 = ~(((-5) ^ i17722) | ((-5) & i17722));
            int i18322 = (i18122 ^ i18222) | (i18122 & i18222);
            int i18422 = ~(((-5) ^ bravo222) | ((-5) & bravo222));
            int i18522 = (((i18322 ^ i18422) | (i18322 & i18422)) * 262) + i17922;
            int i18622 = -(-((~((-5) | i17722)) * (-786)));
            int i18722 = (i18522 ^ i18622) + ((i18522 & i18622) << 1);
            int i18822 = ~bravo222;
            int i18922 = ~((i18822 & (-5)) | ((-5) ^ i18822));
            int i19022 = (i18922 & i18122) | (i18922 ^ i18122);
            Object[] objArr7822 = new Object[1];
            delta("ꔫ뾁ꎦⰶ", (((i19022 & i18222) | (i19022 ^ i18222)) * 262) + i18722, objArr7822);
            Object[] objArr7922 = {(String) objArr7822[0]};
            D88715 = uH18377.D8871(1553409481);
            if (D88715 == null) {
            }
            long longValue922 = ((Long) ((Method) D88715).invoke(null, objArr7922)).longValue();
            long j6322 = 1859262404;
            long j6422 = -55;
            long j6522 = (j6422 * longValue922) + (j6422 * j6322);
            long j6622 = 56;
            long j6722 = (int) Runtime.getRuntime().totalMemory();
            long j6822 = (((j6322 | (((j6722 ^ j12) | longValue922) ^ j12)) * j6622) + (((-56) * ((j6322 | longValue922) ^ j12)) + (((longValue922 | ((j6322 | j6722) ^ j12)) * j6622) + j6522))) - 2001910060;
            int maxMemory222 = (int) Runtime.getRuntime().maxMemory();
            int i19122 = ~maxMemory222;
            int i19222 = (~(440292646 | i19122)) | 1707125457;
            int i19322 = ~(maxMemory222 | (-269899047));
            long j6922 = (((int) (j6822 >> 32)) & (((i19322 | (~(i19122 | 2147418103))) * 252) + ((i19222 | i19322) * (-252)) + 2136111974)) | (((int) j6822) & ((((-1634691229) | (~(197464818 | i43))) * 56) + (((~((-1634691229) | i4)) | 197464818) * 56) + 1582408989));
            i19 = -17;
            if (j7 > 0) {
            }
            char indexOf422 = (char) TextUtils.indexOf("", "", 0, 0);
            int i22022 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i22122 = (i22022 & 878354832) + (i22022 | 878354832);
            Object[] objArr8222 = new Object[1];
            charlie(indexOf422, i22122, "ᑈ၆員븭ꠇ阶郸", "醰媡鄴\uf041", objArr8222);
            String str3622 = (String) objArr8222[0];
            Object[] objArr8322 = new Object[1];
            delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16ݼ媑ᓳ늄", 9 - (~(-ImageFormat.getBitsPerPixel(0))), objArr8322);
            String str3722 = (String) objArr8322[0];
            int i22222 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i22322 = i22222 * 758;
            int i22422 = ((i22322 | (-9072)) << 1) - (i22322 ^ (-9072));
            int i22522 = ((i22222 ^ i43) | (i22222 & i43)) * (-757);
            int i22622 = ((i22422 | i22522) << 1) - (i22522 ^ i22422);
            int i22722 = ((-13) & i22222) | ((-13) ^ i22222);
            int i22822 = (~((i22722 & i4) | (i22722 ^ i4))) * 1514;
            int i22922 = ((i22622 | i22822) << 1) - (i22822 ^ i22622);
            int i23022 = ~i22222;
            int i23122 = (~((i23022 & (-13)) | (i23022 ^ (-13)))) | (~((-13) | i43));
            int i23222 = i22222 | 12;
            int i23322 = ~((i23222 & i4) | (i23222 ^ i4));
            int i23422 = -(-(((i23322 & i23122) | (i23122 ^ i23322)) * 757));
            int i23522 = ((i22922 | i23422) << 1) - (i23422 ^ i22922);
            Object[] objArr8422 = new Object[1];
            delta("佘ᦘ㎨꼢\ue16c돘\ude93\uec16\ude8f葵觢賯", i23522, objArr8422);
            String str3822 = (String) objArr8422[0];
            Object[] objArr8522 = new Object[1];
            charlie((char) TextUtils.indexOf("", ""), View.getDefaultSize(0, 0), "頡Ẳ꾾巭昸祩쁄螖Ǣ⍕棖\udc63", "Ⱇ\uf6f4䧚羅", objArr8522);
            String str3922 = (String) objArr8522[0];
            char indexOf522 = (char) TextUtils.indexOf("", "", 0);
            int i23622 = -(-TextUtils.getOffsetBefore("", 0));
            i20 = 1;
            int i23722 = ((i23622 | 345185435) << 1) - (i23622 ^ 345185435);
            Object[] objArr8622 = new Object[1];
            charlie(indexOf522, i23722, "\ued91蔮䗾䲬屽굋터쮭\ue326踍\ue466", "魻錜樂귷", objArr8622);
            String str4022 = (String) objArr8622[0];
            int i23822 = -TextUtils.indexOf((CharSequence) "", '0', 0);
            int i23922 = ((i23822 | 4) << 1) - (i23822 ^ 4);
            Object[] objArr8722 = new Object[1];
            delta("佘ᦘݼ媑ᓳ늄", i23922, objArr8722);
            String str4122 = (String) objArr8722[0];
            int i24022 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i24122 = (i24022 ^ 4) + ((i24022 & 4) << 1);
            Object[] objArr8822 = new Object[1];
            delta("ꄉ郛⍖掎", i24122, objArr8822);
            i21 = 0;
            strArr = new String[]{str3622, str3722, str3822, str3922, str4022, str4122, (String) objArr8822[0]};
            i22 = 0;
            i23 = i12;
            while (true) {
                if (i22 >= i23) {
                }
                i22 = i36 + 1;
                i19 = i24;
                strArr = strArr3;
                i23 = 7;
                i21 = 0;
                i20 = 1;
            }
            if (i25 != 0) {
            }
        } catch (Throwable th12) {
            Throwable cause6 = th12.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th12;
        }
    }

    public static void foxtrot() {
        juliet = new byte[]{42, -37, -68, -127, -6, 5, -3};
    }

    public static void golf() {
        mike = new byte[]{5, 53, -76, 43};
    }
}
