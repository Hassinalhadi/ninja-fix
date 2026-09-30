package com.fingerprintjs.android.fpjs_pro;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ao.ad;
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.fingerprintjs.android.fpjs_pro_internal.C1263t2;
import com.fingerprintjs.android.fpjs_pro_internal.cz;
import com.fingerprintjs.android.fpjs_pro_internal.uH18377;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class b extends Error {
    public static final char echo;
    public static final char foxtrot;
    public static final char golf;
    public static final char hotel;
    public static final int india;
    public static final int juliet;
    public static final int kilo;
    public static final byte[] lima;
    public static int mike;
    public static int november;
    public static final byte[] oscar = null;
    public static int papa;
    public static int quebec;
    public static final byte[] romeo = null;

    static {
        golf();
        papa = 0;
        quebec = 1;
        foxtrot();
        mike = 0;
        november = 1;
        echo = (char) 28392;
        foxtrot = (char) 53678;
        golf = (char) 17526;
        hotel = (char) 19181;
        india = -207575116;
        juliet = -185414940;
        kilo = 1076365079;
        lima = new byte[]{-86, -94, 82, -86, 72, 99, -100, -107, -108, 110, 107, -98, -58, 56, 54, -54, -38, -55, 48, 58, -52, -58, 63, -12, 113, -38, 37, -38, 62, 54, -55, -119, 116, 54, 18, -31, -22, 17, -21, 25, -8, 22, -22, -35, 84, 22, -106, 106, -106, -111, 126, 12, -13, 12, 0, -10, -9, 115, -121, 121, -122, 117, 33, -37, 37, 38, -126, -69, 66, -70, 72, 31, 12, -16, 28, 88, -89, 28, 23, -21, 28, 16, -24, 20, -27, 30, 51, -109, -100, 107, -109, 99, -99, 97, -106, -104, 98, 97, -98, 103, -115, 126, -105, -124, 120, -108, -54, -54, 39, 54, -55, 14, -89, 88, 74, -76, 88, 31, -30, 84, -78, 72, -84, 82, -94, 84, -73, -43, 50, -48, 42, 35, 35, -50, -33, 80, -95, 92, 83, -94, -81, 92, -85, 80, -96, 61, -57, 55, -49, -50, 60, 46, -63, -52, 63, -56, 51, -61, 60, -49, 61, 55, -58, 55, 8, -119, 61, 57, 59, -61, 57, -52, 122, -126, 51, 9, -126, -60, 56, 122, 40, -47, 33, -38, 38, 100, -12, 20, 45, 44, 41, 42, 23, -25, -43, 46, -39, 62, 25, -110, -48, 103, -102, -112, -100, 101, -99, 114, -102, -35, 83, 117, -101, -35, 34, -109, 99, -99, 53, -55, 55, -52, 53, -49, -71, 113, -124, -114, 121, 71, -76, -105, 105, -121, 79, -47, -28, 30, -11, 28, 24, 19, -32, 44, -38, 30, 28, 40, -39, 19, -22, 26, -31, 29, 95, 1, -59, -57, 42, -119, 11, 49, -124, 2, -56, 49, -63, 58, -58, -124, 15, -27, -51, 60, 20, 44, -45, -36, 37, 59, 9, -24, -42, 34, -38, 17, -30, -60, 58, -40, 55, 36, -40, 52, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String bravo(short s3, short s9, short s10) {
        int i4;
        int i5;
        int i10 = (s9 * 3) + 1;
        int i11 = s3 + 97;
        int i12 = (s10 * 2) + 4;
        byte[] bArr = new byte[i10];
        byte[] bArr2 = romeo;
        if (bArr2 == null) {
            int i13 = i10;
            int i14 = i12;
            i5 = 0;
            int i15 = i12 + (-i13);
            i12 = i14 + 1;
            i11 = i15;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            if (i5 == i10) {
                return new String(bArr, 0);
            }
            i13 = bArr2[i12];
            int i16 = i12;
            i12 = i11;
            i14 = i16;
            int i152 = i12 + (-i13);
            i12 = i14 + 1;
            i11 = i152;
            i4 = i5;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            if (i5 == i10) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr[i4] = (byte) i11;
            if (i5 == i10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(byte b2, byte b4, short s3, Object[] objArr) {
        int i4;
        int i5 = b4 * 3;
        int i10 = s3 + 4;
        int i11 = b2 + 98;
        byte[] bArr = new byte[4 - i5];
        int i12 = 3 - i5;
        byte[] bArr2 = oscar;
        if (bArr2 == null) {
            byte[] bArr3 = bArr2;
            int i13 = 0;
            int i14 = i10;
            int i15 = i12;
            i11 = i15 + (-i11) + 6;
            i10 = i14;
            bArr2 = bArr3;
            i4 = i13;
            int i16 = i10 + 1;
            bArr[i4] = (byte) i11;
            if (i4 == i12) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b6 = bArr2[i16];
            i15 = i11;
            i11 = b6;
            i13 = i4 + 1;
            bArr3 = bArr2;
            i14 = i16;
            i11 = i15 + (-i11) + 6;
            i10 = i14;
            bArr2 = bArr3;
            i4 = i13;
            int i162 = i10 + 1;
            bArr[i4] = (byte) i11;
            if (i4 == i12) {
            }
        } else {
            i4 = 0;
            int i1622 = i10 + 1;
            bArr[i4] = (byte) i11;
            if (i4 == i12) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.cz] */
    public static void delta(String str, int i4, Object[] objArr) {
        int i5;
        int i10;
        int i11 = 1;
        int i12 = quebec + 57;
        papa = i12 % 128;
        if (i12 % 2 == 0) {
            char[] charArray = str.toCharArray();
            ?? obj = new Object();
            char[] cArr = new char[charArray.length];
            obj.D8871 = 0;
            char[] cArr2 = new char[2];
            quebec = (papa + 61) % 128;
            cz czVar = obj;
            while (true) {
                int i13 = czVar.D8871;
                if (i13 >= charArray.length) {
                    break;
                }
                cArr2[0] = charArray[i13];
                cArr2[i11] = charArray[i13 + i11];
                int i14 = 58224;
                int i15 = 0;
                cz czVar2 = czVar;
                while (i15 < 16) {
                    quebec = (papa + 51) % 128;
                    char c3 = cArr2[i11];
                    char c4 = cArr2[0];
                    cz czVar3 = czVar2;
                    int i16 = (c4 + i14) ^ ((c4 << 4) + ((char) (golf ^ (-6042376207359611928L))));
                    int i17 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(hotel);
                        objArr2[2] = Integer.valueOf(i17);
                        objArr2[i11] = Integer.valueOf(i16);
                        objArr2[0] = Integer.valueOf(c3);
                        Object D8871 = uH18377.D8871(329288861);
                        Class cls = Integer.TYPE;
                        if (D8871 == null) {
                            int deadChar = 51 - KeyEvent.getDeadChar(0, 0);
                            int gidForName = Process.getGidForName("") + 2797;
                            char c10 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32778);
                            byte b2 = (byte) 2;
                            i5 = 329288861;
                            byte b4 = (byte) (b2 - 2);
                            i10 = i11;
                            String bravo = bravo(b2, b4, b4);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = cls;
                            clsArr[i10] = cls;
                            clsArr[2] = cls;
                            clsArr[3] = cls;
                            D8871 = uH18377.setPivotYN16904(deadChar, gidForName, c10, -870633912, false, bravo, clsArr);
                        } else {
                            i5 = 329288861;
                            i10 = i11;
                        }
                        char charValue = ((Character) ((Method) D8871).invoke(null, objArr2)).charValue();
                        cArr2[i10] = charValue;
                        char c11 = cArr2[0];
                        int i18 = (charValue + i14) ^ ((charValue << 4) + ((char) (echo ^ (-6042376207359611928L))));
                        int i19 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(foxtrot);
                        objArr3[2] = Integer.valueOf(i19);
                        objArr3[i10] = Integer.valueOf(i18);
                        objArr3[0] = Integer.valueOf(c11);
                        Object D88712 = uH18377.D8871(i5);
                        if (D88712 == null) {
                            int i20 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51;
                            int myTid = 2796 - (Process.myTid() >> 22);
                            char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 32780);
                            byte b6 = (byte) 2;
                            byte b10 = (byte) (b6 - 2);
                            String bravo2 = bravo(b6, b10, b10);
                            Class[] clsArr2 = new Class[4];
                            clsArr2[0] = cls;
                            clsArr2[i10] = cls;
                            clsArr2[2] = cls;
                            clsArr2[3] = cls;
                            D88712 = uH18377.setPivotYN16904(i20, myTid, lastIndexOf, -870633912, false, bravo2, clsArr2);
                        }
                        cArr2[0] = ((Character) ((Method) D88712).invoke(null, objArr3)).charValue();
                        i14 -= 40503;
                        i15++;
                        czVar2 = czVar3;
                        i11 = i10;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i21 = i11;
                cz czVar4 = czVar2;
                int i22 = czVar4.D8871;
                cArr[i22] = cArr2[0];
                cArr[i22 + 1] = cArr2[i21];
                Object[] objArr4 = new Object[2];
                objArr4[i21] = czVar4;
                objArr4[0] = czVar4;
                Object D88713 = uH18377.D8871(1372754349);
                if (D88713 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                    int keyCodeFromString = KeyEvent.keyCodeFromString("") + 1003;
                    char size = (char) (View.MeasureSpec.getSize(0) + 34236);
                    Class[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    clsArr3[i21] = Object.class;
                    D88713 = uH18377.setPivotYN16904(minimumFlingVelocity, keyCodeFromString, size, -1905708168, false, "e", clsArr3);
                }
                ((Method) D88713).invoke(null, objArr4);
                czVar = czVar4;
                i11 = i21;
            }
            String str2 = new String(cArr, 0, i4);
            int i23 = quebec + 19;
            papa = i23 % 128;
            if (i23 % 2 == 0) {
                objArr[0] = str2;
                return;
            }
            throw null;
        }
        str.toCharArray();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.fingerprintjs.android.fpjs_pro_internal.dc, java.lang.Object] */
    public static void echo(int i4, int i5, int i10, short s3, byte b2, Object[] objArr) {
        int i11;
        int i12;
        long j5;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z2;
        int i16 = 3;
        int i17 = 0;
        int i18 = 1;
        int i19 = juliet;
        ?? obj = new Object();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i5), Integer.valueOf(i19)};
            Object D8871 = uH18377.D8871(-744701904);
            Class cls = Integer.TYPE;
            if (D8871 == null) {
                i11 = -744701904;
                D8871 = uH18377.setPivotYN16904(53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 899, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 203907813, false, "b", new Class[]{cls, cls});
            } else {
                i11 = -744701904;
            }
            int intValue = ((Integer) ((Method) D8871).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i20 = india;
            byte[] bArr3 = lima;
            if (i12 == 0) {
                i13 = 3;
                j5 = 0;
            } else {
                int i21 = papa + 109;
                j5 = 0;
                quebec = i21 % 128;
                if (i21 % 2 != 0) {
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        bArr = new byte[length];
                        int i22 = 0;
                        while (i22 < length) {
                            Object[] objArr3 = new Object[i18];
                            objArr3[i17] = Integer.valueOf(bArr3[i22]);
                            Object D88712 = uH18377.D8871(-1890361829);
                            if (D88712 == null) {
                                int normalizeMetaState = KeyEvent.normalizeMetaState(i17) + 52;
                                int i23 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1362;
                                char combineMeasuredStates = (char) View.combineMeasuredStates(i17, i17);
                                i15 = i17;
                                byte b4 = (byte) i16;
                                i14 = i16;
                                byte b6 = (byte) (b4 - 3);
                                String bravo = bravo(b4, b6, b6);
                                Class[] clsArr = new Class[1];
                                clsArr[i15] = cls;
                                D88712 = uH18377.setPivotYN16904(normalizeMetaState, i23, combineMeasuredStates, 1357446350, false, bravo, clsArr);
                            } else {
                                i14 = i16;
                                i15 = i17;
                            }
                            bArr[i22] = ((Byte) ((Method) D88712).invoke(null, objArr3)).byteValue();
                            i22++;
                            i17 = i15;
                            i16 = i14;
                            i18 = 1;
                        }
                    } else {
                        bArr = bArr3;
                    }
                    i13 = i16;
                    int i24 = i17;
                    bArr.getClass();
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = Integer.valueOf(i20);
                    objArr4[i24] = Integer.valueOf(i10);
                    Object D88713 = uH18377.D8871(i11);
                    if (D88713 == null) {
                        int deadChar = KeyEvent.getDeadChar(i24, i24) + 52;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 899;
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", i24);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i24] = cls;
                        clsArr2[1] = cls;
                        D88713 = uH18377.setPivotYN16904(deadChar, scrollBarFadeDuration, offsetAfter, 203907813, false, "b", clsArr2);
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) D88713).invoke(null, objArr4)).intValue()] ^ (-2360518458473264487L))) + ((int) (i19 ^ (-2360518458473264487L))));
                    quebec = (papa + 75) % 128;
                } else {
                    throw null;
                }
            }
            if (intValue > 0) {
                obj.setPivotYN16904 = ((i10 + intValue) - 2) + ((int) (i20 ^ (-2360518458473264487L))) + i12;
                int i25 = kilo;
                Object[] objArr5 = new Object[4];
                objArr5[i13] = sb2;
                objArr5[2] = Integer.valueOf(i25);
                objArr5[1] = Integer.valueOf(i4);
                objArr5[0] = obj;
                Object D88714 = uH18377.D8871(-1800594158);
                if (D88714 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    String bravo2 = bravo(b10, b11, b11);
                    Class[] clsArr3 = new Class[4];
                    clsArr3[0] = Object.class;
                    clsArr3[1] = cls;
                    clsArr3[2] = cls;
                    clsArr3[i13] = Object.class;
                    D88714 = uH18377.setPivotYN16904((KeyEvent.getMaxKeyCode() >> 16) + 52, 2744 - Color.alpha(0), (char) ((SystemClock.uptimeMillis() > j5 ? 1 : (SystemClock.uptimeMillis() == j5 ? 0 : -1)) - 1), 1259782087, false, bravo2, clsArr3);
                }
                ((StringBuilder) ((Method) D88714).invoke(null, objArr5)).append(obj.component9);
                obj.vD14832N6715 = obj.component9;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr2 = new byte[length2];
                    quebec = (papa + 115) % 128;
                    for (int i26 = 0; i26 < length2; i26++) {
                        bArr2[i26] = (byte) (bArr3[i26] ^ (-2360518458473264487L));
                    }
                } else {
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    quebec = (papa + 75) % 128;
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i27 = 1;
                while (true) {
                    obj.D8871 = i27;
                    if (obj.D8871 >= intValue) {
                        break;
                    }
                    papa = (quebec + 37) % 128;
                    if (z2) {
                        obj.setPivotYN16904 = obj.setPivotYN16904 - 1;
                        char c3 = (char) (obj.vD14832N6715 + (((byte) (((byte) (bArr3[r0] ^ (-2360518458473264487L))) + s3)) ^ b2));
                        obj.component9 = c3;
                        sb2.append(c3);
                        obj.vD14832N6715 = obj.component9;
                        i27 = obj.D8871 + 1;
                    } else {
                        obj.setPivotYN16904--;
                        throw null;
                    }
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void foxtrot() {
        oscar = new byte[]{31, 64, 108, 58, -6, 5, -3};
    }

    public static void golf() {
        romeo = new byte[]{99, 95, -77, -10};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1978, code lost:
    
        r3 = r21[r0];
        r10 = new java.lang.Object[1];
        delta("랠䗐녵䎭\ueedf酄煦쟹ꃲ炉\ue041쌣", android.view.View.MeasureSpec.getMode(0) + 12, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x1998, code lost:
    
        r4 = new java.lang.Object[]{((java.lang.String) r10[0]).concat(java.lang.String.valueOf(r3))};
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(1565484532);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x19a3, code lost:
    
        if (r3 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x19a5, code lost:
    
        r49 = 52 - android.text.TextUtils.indexOf("", "", 0);
        r3 = android.text.TextUtils.getOffsetBefore("", 0) + 2951;
        r5 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        r10 = (byte) 1;
        r8 = (byte) (r10 - 1);
        r42 = r0;
        r5 = new java.lang.Object[1];
        charlie(r10, r8, (byte) (r8 - 1), r5);
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r49, r3, r5, -2097887455, false, (java.lang.String) r5[0], new java.lang.Class[]{r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x19eb, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r4)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x19f8, code lost:
    
        r3 = 667748802;
        r3 = (246 * r3) + ((-244) * r3);
        r3 = -245;
        r43 = r3 ^ r12;
        r3 = android.os.Process.myTid();
        r53 = ((((r43 | (r3 ^ r12)) ^ r12) | ((r43 | r3) ^ r12)) * r3) + r3;
        r3 = (r43 | r3) ^ r12;
        r3 = ((245 * (r3 | r3)) + ((r3 * r3) + r53)) + 287405100;
        r5 = r9;
        r9 = ((((~((-469620940) | r77)) | 430725323) | (~((-967605472) | r77))) * (-880)) - 818885110;
        r8 = (~((-469620940) | r7)) | 967605471;
        r10 = ~(469620939 | r77);
        r0 = ((int) (r3 >> 32)) & ((r10 * 880) + (((r8 | r10) * (-880)) + r9));
        r3 = ((int) r3) & A0.z.foxtrot((~((int) android.os.Process.getElapsedCpuTime())) | 1710053163, -828, (((~(1710053163 | r4)) | 1147687722) * (-828)) - 1754753727, 1415187888);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x1a9b, code lost:
    
        if (((r0 & r3) | (r0 ^ r3)) != 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1a9d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x1aa2, code lost:
    
        if (r0 == true) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x1aa4, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x1aa7, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.C1263t2.component9();
        r4 = r0 * (-575);
        r8 = -(-(r2 * (-575)));
        r9 = (r4 ^ r8) + ((r4 & r8) << 1);
        r4 = ~r0;
        r8 = ~r2;
        r10 = ~((r4 ^ r8) | (r4 & r8));
        r8 = ~((r8 ^ r3) | (r8 & r3));
        r8 = ((r10 ^ r8) | (r8 & r10)) * 576;
        r10 = (r9 ^ r8) + ((r8 & r9) << 1);
        r8 = ~((r4 ^ r2) | (r4 & r2));
        r2 = ~r2;
        r3 = ~r3;
        r3 = (r3 & r2) | (r2 ^ r3);
        r0 = ~((r0 & r3) | (r3 ^ r0));
        r0 = -(-(((r0 & r8) | (r8 ^ r0)) * 576));
        r2 = ((~((r4 ^ r2) | (r2 & r4))) * 576) + ((r10 & r0) + (r0 | r10));
        r0 = r42 - 116;
        r0 = (r0 | 117) + (r0 & 117);
        r3 = com.fingerprintjs.android.fpjs_pro.b.mike;
        com.fingerprintjs.android.fpjs_pro.b.november = (((r3 | 117) << 1) - (r3 ^ 117)) % 128;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x1aa6, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x1aa0, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x19e9, code lost:
    
        r42 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x1b16, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x1b1f, code lost:
    
        if (r2 < 25.2d) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x1b21, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x268d, code lost:
    
        if (((((int) (r8 >> 32)) & A0.z.foxtrot((~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | (-2113541))) | (-2080307184), 576, (((~((-1759823568) | r2)) | 1757710027) * 576) - 1771464918, -1171306304)) | (((int) r8) & (((((~((-1537534355) | r7)) | (~(1537534354 | r77))) | (~(1320206531 | r77))) * 831) + (((~((-68157506) | r77)) * (-1662)) + ((((~((-1320206532) | r7)) | (~(1605691859 | r77))) * (-831)) - 1648020892))))) == 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x06fb, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0a8c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0a8e, code lost:
    
        r0 = -(-android.text.TextUtils.getOffsetBefore("", 0));
        r2 = (r0 ^ 28) + ((r0 & 28) << 1);
        r0 = new java.lang.Object[1];
        delta("圄燇厓뚔楜蚨냥䋵\udf83\udc6f䣻೩\ud97f\u0e74쾌똤ƃ퇚ꛢ㘚怭鵔䨥\ueccd⋟\uf088ಓ칡", r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0aa9, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r0[0]};
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(1565484532);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ab4, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ab6, code lost:
    
        r49 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
        r0 = (android.os.Process.myTid() >> 22) + 2951;
        r3 = (char) android.graphics.Color.blue(0);
        r5 = (byte) 1;
        r8 = (byte) (r5 - 1);
        r0 = new java.lang.Object[1];
        charlie(r5, r8, (byte) (r8 - 1), r0);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r49, r0, r3, -2097887455, false, (java.lang.String) r0[0], new java.lang.Class[]{r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0af4, code lost:
    
        r2 = ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b01, code lost:
    
        r4 = -794470924;
        r2 = ((-764) * r2) + ((-1529) * r4);
        r2 = 765;
        r46 = r4 ^ r12;
        r49 = r2 ^ r12;
        r51 = r46 | r49;
        r2 = (int) android.os.Process.getElapsedCpuTime();
        r55 = r2 ^ r12;
        r4 = (((((r46 | r2) ^ r12) | (((r49 | r55) | r4) ^ r12)) * r2) + ((1530 * ((r51 ^ r12) | ((r46 | r55) ^ r12))) + ((((((r51 | r55) ^ r12) | (((r46 | r2) | r2) ^ r12)) | (((r49 | r4) | r2) ^ r12)) * r2) + r2))) + 1749624826;
        r0 = ((int) (r4 >> 32)) & ((((~(2138814335 | r77)) | 286261544) * 235) + ((((~(493924734 | r77)) | 1931151145) * (-470)) + ((((~(493924734 | r7)) | 1931151145) * (-235)) - 1562997925)));
        r2 = ((int) r4) & A0.z.foxtrot((~(1048943853 | r7)) | 18882576, 933, (((~(388282556 | r7)) | 1048943853) * (-933)) + 779440362, 1052797660);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0bb0, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0bb2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0cdb, code lost:
    
        if (r0 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cdd, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1263t2.component9();
        com.fingerprintjs.android.fpjs_pro_internal.C1263t2.component9();
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x1975, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x196b, code lost:
    
        if (((((int) (r2 >> 32)) & (((~(r4 | (-472236029))) * 886) + ((((-472236029) | (~(r4 | 1909462439))) * (-1772)) + (((r5 | (~(r4 | (-203795033)))) * 886) - 1707967884)))) | (((int) r2) & A0.z.foxtrot((-1711966723) | r7, -828, (((~((-1711966723) | r7)) | 274740312) * (-828)) - 1754753727, 169238136))) == 477111747) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0bb5, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0bb8, code lost:
    
        r0 = android.os.Process.myTid() >> 22;
        r42 = ((r0 | 1260729060) << 1) - (r0 ^ 1260729060);
        r0 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r43 = ((r0 | (-111)) << 1) - (r0 ^ (-111));
        r0 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        r2 = (r0 * (-559)) - 195097883;
        r3 = -(-((~((r49 ^ r0) | (r49 & r0))) * (-560)));
        r4 = (r2 ^ r3) + ((r2 & r3) << 1);
        r2 = (122842378 & r0) | (122842378 ^ r0);
        r2 = ((~((r2 & r77) | (r2 ^ r77))) * (-560)) + r4;
        r0 = ~r0;
        r0 = ~((r0 & (-122842379)) | (r0 ^ (-122842379)));
        r3 = ~((r49 & (-122842379)) | (r49 ^ (-122842379)));
        r0 = ((r0 & r3) | (r0 ^ r3)) * 560;
        r5 = new java.lang.Object[1];
        echo(r42, r43, (r2 & r0) + (r0 | r2), (short) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (byte) (113 - (~(-(android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0c44, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r5[0]};
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(-957097391);
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0c4c, code lost:
    
        if (r0 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0c4e, code lost:
    
        r49 = 52 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
        r0 = 3157 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
        r3 = (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58074);
        r5 = (byte) 1;
        r8 = r5;
        r0 = new java.lang.Object[1];
        charlie(r5, r8, (byte) (r8 + 1), r0);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r49, r0, r3, 424179844, false, (java.lang.String) r0[0], new java.lang.Class[]{r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0c8d, code lost:
    
        r0 = ((java.lang.reflect.Method) r0).invoke(null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0c94, code lost:
    
        r42 = android.graphics.Color.alpha(0) + 1260728995;
        r43 = (-125) - (~(-(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
        r44 = (-122842367) - android.text.TextUtils.indexOf("", "", 0, 0);
        r2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        r5 = new java.lang.Object[1];
        echo(r42, r43, r44, (short) ((r2 & 1) + (r2 | 1)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3), r5);
        r0 = r0.equals((java.lang.String) r5[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0834, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x0953, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != (-1032769152)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0a86, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 542074309) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x185f, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 477111747) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x196d, code lost:
    
        r0 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1971, code lost:
    
        if (r0 >= 28) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1973, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1976, code lost:
    
        if (r3 == false) goto L688;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x216c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x21df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x284d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x28bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x31f9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x3257  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x3388  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x338f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x33a0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x3413  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x3bab  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x3bb4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x3bb5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x40f1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x4168  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x3bae  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x339d  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x338b  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x31c7  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x31cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x31e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x31c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] hotel(int i4, Object obj) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f5;
        String[] strArr;
        long j5;
        long j6;
        boolean z2;
        int i16;
        int i17;
        int i18;
        long[] jArr;
        int i19;
        int i20;
        File[] fileArr;
        int i21;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i22;
        BufferedInputStream bufferedInputStream3;
        int i23;
        boolean z10;
        int i24;
        Object[] objArr;
        char c3;
        char c4;
        char c10;
        boolean z11;
        long j7;
        int i25;
        Object invoke;
        int i26;
        int parseInt;
        String[] strArr2;
        int i27;
        char c11;
        char c12;
        boolean z12;
        Object obj2;
        Object obj3;
        int i28;
        Object obj4;
        Object obj5;
        Class cls = Integer.TYPE;
        try {
            Object D8871 = uH18377.D8871(828738609);
            if (D8871 == null) {
                i5 = 5;
                i10 = 16;
                byte b2 = (byte) 1;
                i11 = 24;
                byte b4 = (byte) (b2 - 1);
                i12 = 12;
                i13 = 7;
                Object[] objArr2 = new Object[1];
                charlie(b2, b4, (byte) (b4 - 1), objArr2);
                D8871 = uH18377.setPivotYN16904(51 - KeyEvent.getDeadChar(0, 0), Process.getGidForName("") + 3419, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -287428892, false, (String) objArr2[0], new Class[0]);
            } else {
                i5 = 5;
                i10 = 16;
                i11 = 24;
                i12 = 12;
                i13 = 7;
            }
            long longValue = ((Long) ((Method) D8871).invoke(null, null)).longValue();
            long j10 = 150027860;
            long j11 = -1;
            long j12 = j10 ^ j11;
            long j13 = 184;
            long j14 = longValue ^ j11;
            int i29 = -1;
            long j15 = i4;
            long j16 = j15 ^ j11;
            long j17 = (j13 * (((j10 | longValue) ^ j11) | ((j12 | j14) ^ j11) | ((j16 | j10) ^ j11))) + ((j10 | j14 | j16) * j13) + ((-368) * (longValue | j12)) + (185 * longValue) + ((-183) * j10) + 1176214767;
            int i30 = ~(2135783983 | i4);
            int i31 = ~i4;
            int i32 = ((int) (j17 >> 32)) & ((((~((-2135502888) | i31)) | (~(722237997 | i31)) | 1413545986) * 50) + (((~(i31 | (-1413545987))) | i30) * 50) + ((((-2135502888) | i4) * (-50)) - 506541354));
            int i33 = ((int) j17) & ((((~((int) Runtime.getRuntime().freeMemory())) | (-1744855085)) * 756) + ((((~((-1744855085) | r3)) | 307628674) * (-756)) - 242698463));
            if (((i32 & i33) | (i32 ^ i33)) != 0) {
                Object[] objArr3 = {r5, new int[]{(i4 & (-272)) | (i31 & 271)}, new int[]{i4}, null};
                int i34 = (~((-1015817008) | i4)) | 545260288;
                int i35 = ((i4 | (-505295104)) * 496) + ((i34 | (~((-34738385) | i31))) * (-496)) + (i34 * 992) + 694728479 + 16;
                int i36 = (i35 & 666910677) + (i35 | 666910677);
                int i37 = (i36 << 13) ^ i36;
                int i38 = i37 >>> 17;
                int i39 = (i37 | i38) & (~(i37 & i38));
                int i40 = i39 << 5;
                int[] iArr = {(i39 | i40) & (~(i39 & i40))};
                return objArr3;
            }
            Object[] objArr4 = new Object[1];
            delta("㴝횅᷃ﷸ굆๙襋ﾵ굆๙៧ѫ", 11 - (~(-(-Process.getGidForName("")))), objArr4);
            Object[] objArr5 = {(String) objArr4[0]};
            Object D88712 = uH18377.D8871(-957097391);
            Class<String> cls2 = String.class;
            if (D88712 == null) {
                int i41 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                int myTid = 3158 - (Process.myTid() >> 22);
                i14 = 666910677;
                char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 58075);
                i15 = 3;
                byte b6 = (byte) 1;
                f5 = 0.0f;
                byte b10 = b6;
                Object[] objArr6 = new Object[1];
                charlie(b6, b10, (byte) (b10 + 1), objArr6);
                D88712 = uH18377.setPivotYN16904(i41, myTid, lastIndexOf, 424179844, false, (String) objArr6[0], new Class[]{cls2});
            } else {
                i14 = 666910677;
                i15 = 3;
                f5 = 0.0f;
            }
            Object invoke2 = ((Method) D88712).invoke(null, objArr5);
            if (invoke2 != null) {
                int i42 = 1260729059 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                int i43 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i44 = ((i43 | (-119)) << 1) - (i43 ^ (-119));
                int i45 = -ImageFormat.getBitsPerPixel(0);
                int i46 = ((i45 | (-122842414)) << 1) - (i45 ^ (-122842414));
                short edgeSlop = (short) (ViewConfiguration.getEdgeSlop() >> 16);
                int i47 = -(-(TypedValue.complexToFloat(0) > f5 ? 1 : (TypedValue.complexToFloat(0) == f5 ? 0 : -1)));
                Object[] objArr7 = new Object[1];
                echo(i42, i44, i46, edgeSlop, (byte) (((i47 | 62) << 1) - (i47 ^ 62)), objArr7);
                String str = (String) objArr7[0];
                int i48 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i49 = (i48 & 1260729048) + (i48 | 1260729048);
                int i50 = -TextUtils.indexOf("", "", 0);
                int i51 = ((i50 | (-117)) << 1) - (i50 ^ (-117));
                int indexOf = (-122842409) - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                short capsMode = (short) TextUtils.getCapsMode("", 0, 0);
                int i52 = (AudioTrack.getMinVolume() > f5 ? 1 : (AudioTrack.getMinVolume() == f5 ? 0 : -1));
                int i53 = i52 * 165;
                int i54 = ((i53 | (-2445)) << 1) - (i53 ^ (-2445));
                int i55 = ~i4;
                int i56 = ~((i55 ^ 15) | (i55 & 15));
                int i57 = ((i52 ^ i56) | (i56 & i52)) * (-328);
                int i58 = ((i52 | i4) * 164) + (i54 ^ i57) + ((i54 & i57) << 1);
                int i59 = ~i52;
                int i60 = ~((i59 ^ (-16)) | (i59 & (-16)));
                int i61 = ~(((-16) ^ i4) | ((-16) & i4));
                int i62 = (i60 ^ i61) | (i61 & i60);
                int i63 = (i52 & i31) | (i31 ^ i52);
                int i64 = ~((i63 & 15) | (i63 ^ 15));
                int i65 = ((i62 & i64) | (i62 ^ i64)) * 164;
                Object[] objArr8 = new Object[1];
                echo(i49, i51, indexOf, capsMode, (byte) ((i58 ^ i65) + ((i65 & i58) << 1)), objArr8);
                Object[] objArr9 = {invoke2, new String[]{str, (String) objArr8[0]}};
                Object D88713 = uH18377.D8871(-1363379003);
                if (D88713 == null) {
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                    int keyCodeFromString = KeyEvent.keyCodeFromString("") + 1415;
                    char size = (char) (View.MeasureSpec.getSize(0) + 3047);
                    byte b11 = (byte) 1;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr10 = new Object[1];
                    charlie(b11, b12, (byte) (b12 - 1), objArr10);
                    D88713 = uH18377.setPivotYN16904(minimumFlingVelocity, keyCodeFromString, size, 1896341008, false, (String) objArr10[0], new Class[]{cls2, String[].class});
                }
                long longValue2 = ((Long) ((Method) D88713).invoke(null, objArr9)).longValue();
                long j18 = 281324556;
                long j19 = ((-463) * longValue2) + (465 * j18);
                long j20 = 464;
                long j21 = longValue2 ^ j11;
                long j22 = (j21 | j18) ^ j11;
                long j23 = ((j22 | ((j18 | j15) ^ j11)) * j20) + ((-464) * (j15 | (j18 ^ j11) | j21)) + ((((j21 | j16) ^ j11) | j22 | ((j16 | j18) ^ j11)) * j20) + j19 + 508803067;
                int i66 = ((int) (j23 >> 32)) & (((1126161432 | (~(311064978 | i31))) * 56) + ((((~(1126161432 | i4)) | 311064978) * 56) - 479784350));
                int i67 = ((int) j23) & ((((-1350979617) | i4) * 591) + (((~((-1350979617) | i31)) | (-1506761270)) * (-591)) + 985097178);
                if (((i67 & i66) | (i66 ^ i67)) != 0) {
                    int i68 = -Color.red(0);
                    int component9 = C1263t2.component9();
                    int i69 = i68 * 628;
                    int i70 = (i69 ^ 1463867216) + ((i69 & 1463867216) << 1);
                    int i71 = (component9 ^ 1260729060) | (component9 & 1260729060);
                    int i72 = ~i68;
                    int i73 = ((i71 & i72) | (i71 ^ i72)) * (-627);
                    int i74 = (i70 ^ i73) + ((i73 & i70) << 1);
                    int i75 = ~(((-1260729061) & component9) | ((-1260729061) ^ component9));
                    int i76 = (i74 - (~(((i75 & i68) | (i68 ^ i75)) * (-627)))) - 1;
                    int i77 = ~component9;
                    int i78 = ~((i77 & 1260729060) | (i77 ^ 1260729060));
                    int i79 = ~((i68 & component9) | (i68 ^ component9));
                    int i80 = (((i79 & i78) | (i78 ^ i79)) * 627) + i76;
                    int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                    int i81 = scrollDefaultDelay * 50;
                    int i82 = ((i81 | 9894) << 1) - (i81 ^ 9894);
                    int i83 = ~(101 | i31);
                    int i84 = ~((101 ^ scrollDefaultDelay) | (101 & scrollDefaultDelay));
                    int i85 = ((i83 & i84) | (i83 ^ i84)) * 98;
                    int i86 = (i82 & i85) + (i85 | i82);
                    int i87 = ~scrollDefaultDelay;
                    int i88 = ~((i87 & i31) | (i87 ^ i31));
                    int i89 = (i88 & 101) | (101 ^ i88);
                    int i90 = ~((scrollDefaultDelay ^ i4) | (scrollDefaultDelay & i4));
                    int i91 = (((((i89 & i90) | (i89 ^ i90)) * (-49)) + i86) - (~(((~((scrollDefaultDelay & (-102)) | (scrollDefaultDelay ^ (-102)))) | (~(101 | i4))) * 49))) - 1;
                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                    int i92 = ((fadingEdgeLength | (-122842401)) << 1) - (fadingEdgeLength ^ (-122842401));
                    int i93 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    Object[] objArr11 = new Object[1];
                    echo(i80, i91, i92, (short) ((i93 & 1) + (i93 | 1)), (byte) ((maximumDrawingCacheSize ^ 82) + ((maximumDrawingCacheSize & 82) << 1)), objArr11);
                    Object[] objArr12 = {(String) objArr11[0]};
                    Object D88714 = uH18377.D8871(-957097391);
                    if (D88714 == null) {
                        int i94 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3158;
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58074);
                        byte b13 = (byte) 1;
                        byte b14 = b13;
                        i28 = i55;
                        Object[] objArr13 = new Object[1];
                        charlie(b13, b14, (byte) (b14 + 1), objArr13);
                        D88714 = uH18377.setPivotYN16904(i94, packedPositionGroup, doubleTapTimeout, 424179844, false, (String) objArr13[0], new Class[]{cls2});
                    } else {
                        i28 = i55;
                    }
                    Object invoke3 = ((Method) D88714).invoke(null, objArr12);
                    int indexOf2 = TextUtils.indexOf((CharSequence) "", '0');
                    int component92 = C1263t2.component9();
                    int i95 = (indexOf2 * 50) - 3007;
                    int i96 = ~((~component92) | (-32));
                    int i97 = ~((-32) | indexOf2);
                    int i98 = -(-(((i96 ^ i97) | (i96 & i97)) * 98));
                    int i99 = (i95 & i98) + (i95 | i98);
                    int i100 = ~indexOf2;
                    int i101 = ~component92;
                    int i102 = -(-(((~((i100 ^ i101) | (i100 & i101))) | (-32) | (~((indexOf2 ^ component92) | (indexOf2 & component92)))) * (-49)));
                    int i103 = (i99 & i102) + (i102 | i99);
                    int i104 = ~((component92 & (-32)) | ((-32) ^ component92));
                    int i105 = ~((indexOf2 & 31) | (indexOf2 ^ 31));
                    int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * 49));
                    int i107 = (i103 & i106) + (i106 | i103);
                    Object[] objArr14 = new Object[1];
                    delta("㴝횅喰چ㴝횅僃颢ᱠ筂靔뵢녵䎭\ueedf酄ꚓ풠盈鿨ꕂ诂彩⮭ᱠ筂ㅚ濭얪濲", i107, objArr14);
                    Object[] objArr15 = {(String) objArr14[0]};
                    Object D88715 = uH18377.D8871(-957097391);
                    if (D88715 == null) {
                        int absoluteGravity = 52 - Gravity.getAbsoluteGravity(0, 0);
                        float f10 = f5;
                        int i108 = 3158 - (PointF.length(f10, f10) > f10 ? 1 : (PointF.length(f10, f10) == f10 ? 0 : -1));
                        char maximumFlingVelocity = (char) (58074 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte b15 = (byte) 1;
                        byte b16 = b15;
                        obj4 = invoke3;
                        Object[] objArr16 = new Object[1];
                        charlie(b15, b16, (byte) (b16 + 1), objArr16);
                        D88715 = uH18377.setPivotYN16904(absoluteGravity, i108, maximumFlingVelocity, 424179844, false, (String) objArr16[0], new Class[]{cls2});
                    } else {
                        obj4 = invoke3;
                    }
                    Object invoke4 = ((Method) D88715).invoke(null, objArr15);
                    if (obj4 != null) {
                        Object[] objArr17 = {obj4, 42};
                        Object D88716 = uH18377.D8871(2072770498);
                        if (D88716 == null) {
                            int keyRepeatDelay = 51 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int defaultSize = 1209 - View.getDefaultSize(0, 0);
                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 44356);
                            byte b17 = (byte) 1;
                            byte b18 = (byte) (b17 - 1);
                            obj5 = invoke4;
                            Object[] objArr18 = new Object[1];
                            charlie(b17, b18, (byte) (b18 - 1), objArr18);
                            D88716 = uH18377.setPivotYN16904(keyRepeatDelay, defaultSize, maxKeyCode, -1540336361, false, (String) objArr18[0], new Class[]{cls2, cls});
                        } else {
                            obj5 = invoke4;
                        }
                        long longValue3 = ((Long) ((Method) D88716).invoke(null, objArr17)).longValue();
                        long j24 = 777309567;
                        long j25 = 85;
                        long j26 = (j25 * longValue3) + (j25 * j24);
                        long j27 = -84;
                        long j28 = j24 ^ j11;
                        long j29 = longValue3 ^ j11;
                        long maxMemory = (int) Runtime.getRuntime().maxMemory();
                        long j30 = maxMemory ^ j11;
                        long j31 = j24 | longValue3;
                        long j32 = ((((j28 | j29) ^ j11) | ((j28 | j30) ^ j11) | ((j29 | j30) ^ j11) | ((j31 | maxMemory) ^ j11)) * j27) + j26;
                        long j33 = ((j29 | maxMemory) ^ j11) | j24;
                        long j34 = (j30 | longValue3) ^ j11;
                        long j35 = ((84 * (j34 | (j31 ^ j11))) + (((j33 | j34) * j27) + j32)) - 784754597;
                        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i109 = (((~((-518679853) | elapsedRealtime)) | (-918546559)) * (-318)) - 1166334514;
                        int i110 = ~((-918546559) | elapsedRealtime);
                        int i111 = ~elapsedRealtime;
                        int i112 = ((int) (j35 >> 32)) & ((((~(elapsedRealtime | 1056959870)) | (~((-538280019) | i111))) * 318) + (((~(i111 | 1056959870)) | i110) * 318) + i109);
                        int myPid = Process.myPid();
                        int i113 = ~myPid;
                        int i114 = (~((-1591079609) | i113)) | 1247130264;
                        int i115 = ~(myPid | 1610610621);
                        int i116 = ((int) j35) & (((i115 | (~(i113 | (-343949345)))) * HttpConstants.HTTP_BAD_GATEWAY) + ((i114 | i115) * (-502)) + 1851908197);
                    } else {
                        obj5 = invoke4;
                    }
                    if (obj5 != null) {
                        Object[] objArr19 = {obj5, 42};
                        Object D88717 = uH18377.D8871(2072770498);
                        if (D88717 == null) {
                            int alpha = 51 - Color.alpha(0);
                            int i117 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1208;
                            char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44356);
                            byte b19 = (byte) 1;
                            byte b20 = (byte) (b19 - 1);
                            Object[] objArr20 = new Object[1];
                            charlie(b19, b20, (byte) (b20 - 1), objArr20);
                            D88717 = uH18377.setPivotYN16904(alpha, i117, minimumFlingVelocity2, -1540336361, false, (String) objArr20[0], new Class[]{cls2, cls});
                        }
                        long longValue4 = ((Long) ((Method) D88717).invoke(null, objArr19)).longValue();
                        long j36 = 1173666175;
                        long j37 = ((-396) * longValue4) + (398 * j36);
                        long j38 = -397;
                        long j39 = j36 ^ j11;
                        long freeMemory = (int) Runtime.getRuntime().freeMemory();
                        long j40 = freeMemory ^ j11;
                        long j41 = (j39 | j40) ^ j11;
                        long j42 = (j39 | longValue4) ^ j11;
                        long j43 = ((397 * ((freeMemory | j42) | (((longValue4 ^ j11) | j36) ^ j11))) + ((j38 * j42) + ((((j41 | j42) | ((j40 | longValue4) ^ j11)) * j38) + j37))) - 1181111205;
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i118 = ~elapsedCpuTime;
                        int i119 = (((~((-1499386612) | i118)) | 1481278131 | (~(62160200 | i118)) | (~((-44051721) | elapsedCpuTime))) * (-84)) + 1905160562;
                        int i120 = (~(62160200 | elapsedCpuTime)) | 1499386611;
                        int i121 = ~(i118 | (-62160201));
                        int i122 = ((int) (j43 >> 32)) & (((i121 | 44051720) * 84) + ((i120 | i121) * (-84)) + i119);
                        int tango = ad.tango(1196184708);
                        int i123 = ((int) j43) & ((((~(tango | (-536938881))) | 159678497) * 235) + (((~((-1617500635) | tango)) | 1240240251) * (-470)) + ((((~((~tango) | (-1617500635))) | 1240240251) * (-235)) - 484333755));
                    }
                    if (obj4 != null) {
                        int i124 = november;
                        mike = ((i124 & 57) + (i124 | 57)) % 128;
                        Object[] objArr21 = {obj4, 42};
                        Object D88718 = uH18377.D8871(2072770498);
                        if (D88718 == null) {
                            int resolveOpacity = Drawable.resolveOpacity(0, 0) + 51;
                            int green = Color.green(0) + 1209;
                            char c13 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 44355);
                            byte b21 = (byte) 1;
                            byte b22 = (byte) (b21 - 1);
                            Object[] objArr22 = new Object[1];
                            charlie(b21, b22, (byte) (b22 - 1), objArr22);
                            D88718 = uH18377.setPivotYN16904(resolveOpacity, green, c13, -1540336361, false, (String) objArr22[0], new Class[]{cls2, cls});
                        }
                        long longValue5 = ((Long) ((Method) D88718).invoke(null, objArr21)).longValue();
                        long j44 = 7802928;
                        long j45 = j44 ^ j11;
                        long j46 = (j45 | j15) ^ j11;
                        long j47 = ((-280) * (((j45 | longValue5) ^ j11) | j46)) + ((-139) * longValue5) + (ModuleDescriptor.MODULE_VERSION * j44);
                        long j48 = 140;
                        long j49 = longValue5 ^ j11;
                        long j50 = ((j48 * (((((j45 | j49) | j15) ^ j11) | (((j45 | j16) | longValue5) ^ j11)) | (((j49 | j16) | j44) ^ j11))) + (((j46 | ((j49 | j15) ^ j11)) * j48) + j47)) - 15247958;
                        int romeo2 = ad.romeo();
                        int i125 = ~romeo2;
                        int i126 = ((int) (j50 >> 32)) & ((((~(i125 | 831557421)) | (~((-605668990) | i125))) * 865) + ((~(831557421 | romeo2)) * 865) + ((((~((-831557422) | i125)) | (-605668990)) * (-865)) - 737775526));
                        int i127 = ((int) j50) & ((((~(1122286493 | i4)) | (~((-314939917) | i31))) * 959) + ((((~(1122286493 | i31)) | (~((-314939917) | i4))) * 959) - 285971389));
                    }
                    if (obj5 != null) {
                        int i128 = november;
                        mike = ((i128 & 15) + (i128 | 15)) % 128;
                        Object[] objArr23 = {obj5, 42};
                        Object D88719 = uH18377.D8871(2072770498);
                        if (D88719 == null) {
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 52;
                            int i129 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1209;
                            char axisFromString = (char) (44355 - MotionEvent.axisFromString(""));
                            byte b23 = (byte) 1;
                            byte b24 = (byte) (b23 - 1);
                            Object[] objArr24 = new Object[1];
                            charlie(b23, b24, (byte) (b24 - 1), objArr24);
                            D88719 = uH18377.setPivotYN16904(modifierMetaStateMask, i129, axisFromString, -1540336361, false, (String) objArr24[0], new Class[]{cls2, cls});
                        }
                        long longValue6 = ((Long) ((Method) D88719).invoke(null, objArr23)).longValue();
                        long j51 = 1459483489;
                        long j52 = ((-49) * longValue6) + (51 * j51);
                        long j53 = (int) Runtime.getRuntime().totalMemory();
                        long j54 = ((-50) * (j51 | j53)) + j52;
                        long j55 = 50;
                        long j56 = longValue6 ^ j11;
                        long j57 = j53 ^ j11;
                        long j58 = j56 | j57;
                        long j59 = ((j55 * (((j58 ^ j11) | ((j56 | j51) ^ j11)) | ((j57 | j51) ^ j11))) + (((((((j51 ^ j11) | j56) | j53) ^ j11) | ((j58 | j51) ^ j11)) * j55) + j54)) - 1466928519;
                        int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i130 = ~freeMemory2;
                        int i131 = ((int) (j59 >> 32)) & ((((~(1551999953 | freeMemory2)) | (~(i130 | (-1305740932)))) * 979) + (((-1305740932) | freeMemory2) * (-979)) + ((~(1551999953 | i130)) * 979) + 2006640372);
                        int romeo3 = ad.romeo();
                        int i132 = ((int) j59) & (((romeo3 | (-262673)) * 668) + (((-634323931) | (~(802902479 | romeo3))) * 1336) + ((((~((-634323931) | romeo3)) | 802902479) * (-668)) - 621067267));
                    }
                }
            }
            boolean z13 = false;
            if ((z13 ? 'D' : 'Z') == 'D') {
                Object[] objArr25 = {r2, new int[]{(~(i4 & 260)) & (i4 | 260)}, new int[]{i4}, null};
                int i133 = (((~(i4 | (-514776918))) | 4202528) * 433) + (((~(4255013 | i4)) | (-514776918)) * (-433)) + (((~((-52486) | i31)) * 433) - 892004828);
                int i134 = (i133 ^ 16) + ((i133 & 16) << 1) + 666910677;
                int i135 = i134 << 13;
                int i136 = (i135 & (~i134)) | ((~i135) & i134);
                int i137 = i136 >>> 17;
                int i138 = (i136 | i137) & (~(i136 & i137));
                int i139 = i138 << 5;
                int[] iArr2 = {(i138 | i139) & (~(i138 & i139))};
                return objArr25;
            }
            int i140 = -Process.getGidForName("");
            int i141 = (i140 & 7) + (i140 | 7);
            Object[] objArr26 = new Object[1];
            delta("僲䈁媺嬵䨌\ue673녵䎭", i141, objArr26);
            String str2 = (String) objArr26[0];
            int i142 = -((byte) KeyEvent.getModifierMetaStateMask());
            int component93 = C1263t2.component9();
            int i143 = ~((~i142) | (-1260729043));
            int i144 = ~component93;
            int i145 = ~((i144 & i142) | (i144 ^ i142) | 1260729042);
            int i146 = (((i142 * 221) - 1221753254) - (~(-(-(((i143 & i145) | (i143 ^ i145)) * 220))))) - 1;
            int i147 = ~((~component93) | 1260729042);
            int i148 = -(-(((i147 & i142) | (i142 ^ i147)) * (-440)));
            int i149 = (((i142 & 1260729042) | (1260729042 ^ i142) | component93) * 220) + (i146 ^ i148) + ((i146 & i148) << 1);
            int i150 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i151 = ((i150 | (-119)) << 1) - (i150 ^ (-119));
            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
            int component94 = C1263t2.component9();
            int i152 = windowTouchSlop * 714;
            int i153 = (1564419384 ^ i152) + ((i152 & 1564419384) << 1);
            int i154 = ~windowTouchSlop;
            int i155 = ~component94;
            int i156 = ~((i154 & i155) | (i154 ^ i155));
            int i157 = ~windowTouchSlop;
            int i158 = ~((i157 & (-122842367)) | ((-122842367) ^ i157));
            int i159 = (i156 & i158) | (i156 ^ i158);
            int i160 = (122842366 ^ windowTouchSlop) | (122842366 & windowTouchSlop);
            int i161 = ~((i160 & component94) | (i160 ^ component94));
            int i162 = ((i159 & i161) | (i159 ^ i161)) * (-713);
            int i163 = (i153 ^ i162) + ((i162 & i153) << 1);
            int i164 = (windowTouchSlop & 122842366) | (122842366 ^ windowTouchSlop);
            int i165 = -(-((~((i164 & component94) | (i164 ^ component94))) * 1426));
            int i166 = (i163 & i165) + (i165 | i163);
            int i167 = ~component94;
            int i168 = ((~((i167 & 122842366) | (122842366 ^ i167))) * 713) + i166;
            short argb = (short) Color.argb(0, 0, 0, 0);
            int i169 = -TextUtils.indexOf("", "");
            Object[] objArr27 = new Object[1];
            echo(i149, i151, i168, argb, (byte) ((i169 & (-10)) + (i169 | (-10))), objArr27);
            String str3 = (String) objArr27[0];
            int i170 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
            Object[] objArr28 = new Object[1];
            echo((1260729046 ^ i170) + ((i170 & 1260729046) << 1), (-118) - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-122842362) - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (54 - (~AndroidCharacter.getMirror('0'))), objArr28);
            String str4 = (String) objArr28[0];
            Object[] objArr29 = new Object[1];
            delta("㌾\u1cfe깕쳥얪濲ﲟ鎴엙繲", 7 - (~(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr29);
            String str5 = (String) objArr29[0];
            int i171 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr30 = new Object[1];
            echo((1260729051 ^ i171) + ((i171 & 1260729051) << 1), (Process.myPid() >> 22) - 119, (-122842357) - (~KeyEvent.keyCodeFromString("")), (short) Drawable.resolveOpacity(0, 0), (byte) (22 - (~(-TextUtils.indexOf("", "", 0)))), objArr30);
            String str6 = (String) objArr30[0];
            int i172 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int component95 = C1263t2.component9();
            int i173 = i172 * (-159);
            int i174 = (i173 ^ (-2226)) + ((i173 & (-2226)) << 1);
            int i175 = ~i172;
            int i176 = (((i175 & 14) | (i175 ^ 14)) * 160) + i174;
            int i177 = ~component95;
            int i178 = ~((i177 ^ i172) | (i177 & i172));
            int i179 = ~((i172 ^ 14) | (i172 & 14));
            int i180 = ((i178 & i179) | (i178 ^ i179)) * (-160);
            int i181 = (i176 ^ i180) + ((i176 & i180) << 1);
            int i182 = -(-((i172 | (~((i177 & (-15)) | ((-15) ^ i177)))) * 160));
            int i183 = (i181 & i182) + (i182 | i181);
            Object[] objArr31 = new Object[1];
            delta("棊쑖鋌쐠쾌똤ƃ퇚ꛢ㘚읫됔캢쮵", i183, objArr31);
            String str7 = (String) objArr31[0];
            int i184 = -Color.red(0);
            int i185 = (1260729051 & i184) + (i184 | 1260729051);
            int i186 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i187 = ((i186 | (-120)) << 1) - (i186 ^ (-120));
            int fadingEdgeLength2 = (-122842351) - (ViewConfiguration.getFadingEdgeLength() >> 16);
            short indexOf3 = (short) TextUtils.indexOf("", "");
            int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
            Object[] objArr32 = new Object[1];
            echo(i185, i187, fadingEdgeLength2, indexOf3, (byte) ((tapTimeout & (-71)) + (tapTimeout | (-71))), objArr32);
            String str8 = (String) objArr32[0];
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1260729051;
            int lastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
            int i188 = (lastIndexOf2 & (-118)) + (lastIndexOf2 | (-118));
            int i189 = -(-(Process.myTid() >> 22));
            Object[] objArr33 = new Object[1];
            echo(scrollDefaultDelay2, i188, ((-122842347) ^ i189) + ((i189 & (-122842347)) << 1), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-43) - (~(-Drawable.resolveOpacity(0, 0)))), objArr33);
            String str9 = (String) objArr33[0];
            Object[] objArr34 = new Object[1];
            delta("惓\uf85f", 0 - (~(-Process.getGidForName(""))), objArr34);
            String str10 = (String) objArr34[0];
            int i190 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i191 = (1260729054 ^ i190) + ((i190 & 1260729054) << 1);
            int i192 = (-110) - (~(-Drawable.resolveOpacity(0, 0)));
            int i193 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i194 = (((-122842342) | i193) << 1) - (i193 ^ (-122842342));
            int i195 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i196 = -ImageFormat.getBitsPerPixel(0);
            Object[] objArr35 = new Object[1];
            echo(i191, i192, i194, (short) ((i195 ^ (-1)) + (i195 << 1)), (byte) (((i196 | (-125)) << 1) - (i196 ^ (-125))), objArr35);
            String str11 = (String) objArr35[0];
            int i197 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i198 = (i197 ^ 9) + ((i197 & 9) << 1);
            Object[] objArr36 = new Object[1];
            delta("\uda1a겹\udbc9쬂䤋\ude66ࢭ퍙ಓ칡", i198, objArr36);
            String str12 = (String) objArr36[0];
            int i199 = -Color.alpha(0);
            int i200 = ((i199 | 8) << 1) - (i199 ^ 8);
            Object[] objArr37 = new Object[1];
            delta("հ\udd0a\uf6b2籘꽕侵䬔찵", i200, objArr37);
            String str13 = (String) objArr37[0];
            int i201 = -TextUtils.getOffsetAfter("", 0);
            int i202 = (i201 ^ 12) + ((i201 & 12) << 1);
            Object[] objArr38 = new Object[1];
            delta("հ\udd0a뿼\ue640㑲겈䣻೩勿ꮍ㸀ႄ", i202, objArr38);
            String str14 = (String) objArr38[0];
            Object[] objArr39 = new Object[1];
            delta("հ\udd0a뿼\ue640㑲겈䣻೩勿ꮍ厓뚔ﾏ앉", 13 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr39);
            String str15 = (String) objArr39[0];
            int i203 = -View.getDefaultSize(0, 0);
            int component96 = C1263t2.component9();
            int i204 = (i203 * (-51)) + 371;
            int i205 = ~component96;
            int i206 = (i205 ^ i203) | (i205 & i203);
            int i207 = (~((i206 & 7) | (i206 ^ 7))) * 52;
            int i208 = (i204 & i207) + (i204 | i207);
            int i209 = ~(((-8) ^ i205) | ((-8) & i205));
            int i210 = ~(((-8) ^ i203) | ((-8) & i203));
            int i211 = (i209 & i210) | (i209 ^ i210);
            int i212 = ~component96;
            int i213 = ~((i212 & i203) | (i212 ^ i203));
            int i214 = (i208 - (~(-(-(((i213 & i211) | (i211 ^ i213)) * (-52)))))) - 1;
            int i215 = ~i203;
            int i216 = ~(i215 | i205);
            int i217 = ~((i215 & 7) | (i215 ^ 7));
            int i218 = -(-(((i217 & i216) | (i216 ^ i217)) * 52));
            int i219 = (i214 & i218) + (i218 | i214);
            Object[] objArr40 = new Object[1];
            delta("ꖞ\ude9aᵵ\udc0e\ua7e6\uec17꼰空", i219, objArr40);
            String str16 = (String) objArr40[0];
            int i220 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            int i221 = ((i220 | 7) << 1) - (i220 ^ 7);
            Object[] objArr41 = new Object[1];
            delta("\u1cfe竴ﭳ罁盈鿨䰓㭕", i221, objArr41);
            String str17 = (String) objArr41[0];
            int i222 = -(-KeyEvent.keyCodeFromString(""));
            int i223 = (i222 & 7) + (i222 | 7);
            Object[] objArr42 = new Object[1];
            delta("燲漎\ufdff뼣\ueedf酄仂\uf114", i223, objArr42);
            String str18 = (String) objArr42[0];
            int i224 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i225 = (i224 & 1260729060) + (i224 | 1260729060);
            int pressedStateDuration = (-123) - (ViewConfiguration.getPressedStateDuration() >> 16);
            int i226 = -View.MeasureSpec.getSize(0);
            int i227 = (((-122842327) | i226) << 1) - (i226 ^ (-122842327));
            short blue = (short) Color.blue(0);
            int i228 = -(-TextUtils.indexOf("", "", 0));
            Object[] objArr43 = new Object[1];
            echo(i225, pressedStateDuration, i227, blue, (byte) ((i228 & (-86)) + (i228 | (-86))), objArr43);
            String str19 = (String) objArr43[0];
            int i229 = -TextUtils.indexOf((CharSequence) "", '0', 0);
            int i230 = (i229 & 1260729060) + (i229 | 1260729060);
            int i231 = (-105) - (~ImageFormat.getBitsPerPixel(0));
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i232 = (((-122842326) | keyRepeatTimeout) << 1) - (keyRepeatTimeout ^ (-122842326));
            char mirror = AndroidCharacter.getMirror('0');
            int i233 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr44 = new Object[1];
            echo(i230, i231, i232, (short) ((mirror & 65488) + (mirror | 65488)), (byte) ((i233 ^ 12) + ((i233 & 12) << 1)), objArr44);
            String str20 = (String) objArr44[0];
            int jumpTapTimeout = 1260729061 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i234 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i235 = (i234 ^ (-120)) + ((i234 & (-120)) << 1);
            int i236 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i237 = (i236 * (-55)) - 1833607652;
            int i238 = -(-(((~((i236 ^ i4) | (i236 & i4))) | (-122842308)) * 56));
            int i239 = (i237 ^ i238) + ((i237 & i238) << 1);
            int i240 = (~((-122842308) | i236)) * (-56);
            int i241 = (i239 ^ i240) + ((i240 & i239) << 1);
            int i242 = ~i4;
            int i243 = ~((i242 & (-122842308)) | ((-122842308) ^ i242));
            int i244 = -(-(((i236 & i243) | (i236 ^ i243)) * 56));
            int i245 = ((i241 | i244) << 1) - (i244 ^ i241);
            short s3 = (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
            Object[] objArr45 = new Object[1];
            echo(jumpTapTimeout, i235, i245, s3, (byte) ((bitsPerPixel ^ 82) + ((bitsPerPixel & 82) << 1)), objArr45);
            String str21 = (String) objArr45[0];
            int i246 = 1260729060 - (~(-(-Color.alpha(0))));
            int i247 = (-123) - (~MotionEvent.axisFromString(""));
            int deadChar = KeyEvent.getDeadChar(0, 0) - 122842302;
            int i248 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr46 = new Object[1];
            echo(i246, i247, deadChar, (short) ((i248 ^ (-1)) + (i248 << 1)), (byte) ((-107) - Drawable.resolveOpacity(0, 0)), objArr46);
            String str22 = (String) objArr46[0];
            int i249 = 1260729060 - (~(-Color.argb(0, 0, 0, 0)));
            int myPid2 = (Process.myPid() >> 22) - 109;
            int i250 = -(-Color.rgb(0, 0, 0));
            int i251 = ((-106065085) & i250) + (i250 | (-106065085));
            short s9 = (short) (0 - (~ImageFormat.getBitsPerPixel(0)));
            int i252 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            Object[] objArr47 = new Object[1];
            echo(i249, myPid2, i251, s9, (byte) ((i252 & (-64)) + (i252 | (-64))), objArr47);
            String str23 = (String) objArr47[0];
            int trimmedLength = TextUtils.getTrimmedLength("");
            int component97 = C1263t2.component9();
            int i253 = trimmedLength * (-515);
            int i254 = ((-1038103938) & i253) + (i253 | (-1038103938));
            int i255 = ~(((-1260729063) ^ component97) | ((-1260729063) & component97));
            int i256 = ~component97;
            int i257 = ~(i256 | trimmedLength);
            int i258 = (i255 & i257) | (i255 ^ i257);
            int i259 = ~component97;
            int i260 = ~((i259 & 1260729062) | (1260729062 ^ i259));
            int i261 = -(-(((i258 & i260) | (i258 ^ i260)) * (-516)));
            int i262 = ~trimmedLength;
            int i263 = i262 | i256;
            int i264 = (((~((i262 & 1260729062) | (1260729062 ^ i262))) | (~((1260729062 ^ i256) | (1260729062 & i256)))) * 516) + (((~(component97 | ((-1260729063) ^ i262) | ((-1260729063) & i262))) | (~((i263 & 1260729062) | (1260729062 ^ i263)))) * 516) + (((i254 | i261) << 1) - (i261 ^ i254));
            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
            int i265 = (scrollBarSize ^ (-116)) + ((scrollBarSize & (-116)) << 1);
            int i266 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int component98 = C1263t2.component9();
            int i267 = (i266 * 595) - 215093395;
            int i268 = ~i266;
            int i269 = ~((i268 & (-122842287)) | ((-122842287) ^ i268));
            int i270 = ~component98;
            int i271 = ~(((-122842287) ^ i270) | ((-122842287) & i270));
            int i272 = -(-(((i269 & i271) | (i269 ^ i271)) * (-1188)));
            int i273 = (i267 ^ i272) + ((i267 & i272) << 1);
            int i274 = ~((~i266) | (-122842287));
            int i275 = ~((component98 & 122842286) | (122842286 ^ component98));
            int i276 = (i275 & i274) | (i274 ^ i275);
            int i277 = (i270 ^ i266) | (i270 & i266);
            int i278 = ~i277;
            int i279 = (i273 - (~(-(-(((i276 & i278) | (i276 ^ i278)) * 594))))) - 1;
            int i280 = ~((122842286 ^ i270) | (122842286 & i270));
            int i281 = ~((i266 & 122842286) | (122842286 ^ i266));
            int i282 = (i281 & i280) | (i280 ^ i281);
            int i283 = ~i277;
            int i284 = (((i282 & i283) | (i282 ^ i283)) * 594) + i279;
            short normalizeMetaState = (short) KeyEvent.normalizeMetaState(0);
            int i285 = -TextUtils.lastIndexOf("", '0');
            Object[] objArr48 = new Object[1];
            echo(i264, i265, i284, normalizeMetaState, (byte) (((i285 | (-73)) << 1) - (i285 ^ (-73))), objArr48);
            String str24 = (String) objArr48[0];
            int keyRepeatTimeout2 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            int i286 = (keyRepeatTimeout2 & 10) + (keyRepeatTimeout2 | 10);
            Object[] objArr49 = new Object[1];
            delta("\udfd1\uef13䇍賵릮ꪨ檊薦櫍긣", i286, objArr49);
            String str25 = (String) objArr49[0];
            Object[] objArr50 = new Object[1];
            delta("\udfd1\uef13䇍賵얪濲暻\ue68c\ueedf酄Πᖅ", 10 - TextUtils.lastIndexOf("", '0', 0, 0), objArr50);
            String str26 = (String) objArr50[0];
            int i287 = 1260729063 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i288 = -(ViewConfiguration.getTapTimeout() >> 16);
            int i289 = (i288 ^ (-114)) + ((i288 & (-114)) << 1);
            int i290 = -MotionEvent.axisFromString("");
            int i291 = ((-122842279) ^ i290) + ((i290 & (-122842279)) << 1);
            int i292 = -Color.rgb(0, 0, 0);
            short s10 = (short) ((((-16777216) | i292) << 1) - (i292 ^ ShapeBuilder.DEFAULT_SHAPE_COLOR));
            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
            Object[] objArr51 = new Object[1];
            echo(i287, i289, i291, s10, (byte) (((scrollBarSize2 | (-64)) << 1) - (scrollBarSize2 ^ (-64))), objArr51);
            String str27 = (String) objArr51[0];
            Object[] objArr52 = new Object[1];
            delta("\ua7e6\uec17穐\ue013辁읤㊴䡲\uf070挊䦡ሠ隨デ䐴笒", Color.red(0) + 15, objArr52);
            String str28 = (String) objArr52[0];
            int i293 = 1260729064 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i294 = -(-AndroidCharacter.getMirror('0'));
            int i295 = (i294 ^ (-159)) + ((i294 & (-159)) << 1);
            int i296 = -TextUtils.getOffsetBefore("", 0);
            int i297 = ((-122842268) ^ i296) + ((i296 & (-122842268)) << 1);
            short longPressTimeout = (short) (ViewConfiguration.getLongPressTimeout() >> 16);
            int i298 = -Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr53 = new Object[1];
            echo(i293, i295, i297, longPressTimeout, (byte) ((i298 ^ (-93)) + ((i298 & (-93)) << 1)), objArr53);
            String[] strArr3 = {str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, (String) objArr53[0]};
            int i299 = -Color.alpha(0);
            int i300 = ((i299 | 11) << 1) - (i299 ^ 11);
            Object[] objArr54 = new Object[1];
            delta("㴝횅᷃ﷸ굆๙襋ﾵ굆๙៧ѫ", i300, objArr54);
            Object[] objArr55 = {(String) objArr54[0]};
            Object D887110 = uH18377.D8871(-957097391);
            if (D887110 == null) {
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 52;
                int makeMeasureSpec = 3158 - View.MeasureSpec.makeMeasureSpec(0, 0);
                char resolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 58074);
                byte b25 = (byte) 1;
                byte b26 = b25;
                strArr = strArr3;
                Object[] objArr56 = new Object[1];
                charlie(b25, b26, (byte) (b26 + 1), objArr56);
                D887110 = uH18377.setPivotYN16904(offsetAfter, makeMeasureSpec, resolveSizeAndState, 424179844, false, (String) objArr56[0], new Class[]{cls2});
            } else {
                strArr = strArr3;
            }
            String str29 = (String) ((Method) D887110).invoke(null, objArr55);
            if (str29 != null) {
                int i301 = november;
                mike = ((i301 & 109) + (i301 | 109)) % 128;
                int fadingEdgeLength3 = 1260729060 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int indexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int i302 = ((indexOf4 | (-118)) << 1) - (indexOf4 ^ (-118));
                int i303 = -View.resolveSize(0, 0);
                Object[] objArr57 = new Object[1];
                echo(fadingEdgeLength3, i302, (i303 & (-122842413)) + (i303 | (-122842413)), (short) View.resolveSize(0, 0), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 62), objArr57);
                String str30 = (String) objArr57[0];
                int i304 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i305 = (i304 & 1260729049) + (i304 | 1260729049);
                int capsMode2 = TextUtils.getCapsMode("", 0, 0);
                int i306 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                short green2 = (short) Color.green(0);
                int i307 = -TextUtils.getOffsetBefore("", 0);
                Object[] objArr58 = new Object[1];
                echo(i305, ((capsMode2 | (-117)) << 1) - (capsMode2 ^ (-117)), (i306 ^ (-122842408)) + ((i306 & (-122842408)) << 1), green2, (byte) ((i307 & 15) + (i307 | 15)), objArr58);
                String[] strArr4 = {str30, (String) objArr58[0]};
                int i308 = 0;
                while (true) {
                    if (i308 >= 2) {
                        z12 = false;
                        break;
                    }
                    november = (mike + 35) % 128;
                    if (str29.contains(strArr4[i308])) {
                        int i309 = mike;
                        november = (((i309 | 61) << 1) - (i309 ^ 61)) % 128;
                        z12 = true;
                        break;
                    }
                    int i310 = i308 + 126;
                    i308 = ((i310 & (-125)) << 1) + (i310 ^ (-125));
                }
                if (z12) {
                    int i311 = 1260729058 - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int i312 = -(-KeyEvent.keyCodeFromString(""));
                    int i313 = (i312 ^ (-102)) + ((i312 & (-102)) << 1);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0);
                    Object[] objArr59 = new Object[1];
                    echo(i311, i313, ((offsetAfter2 | (-122842401)) << 1) - (offsetAfter2 ^ (-122842401)), (short) View.resolveSizeAndState(0, 0, 0), (byte) (82 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))))), objArr59);
                    Object[] objArr60 = {(String) objArr59[0]};
                    Object D887111 = uH18377.D8871(-957097391);
                    if (D887111 == null) {
                        int indexOf5 = 51 - TextUtils.indexOf((CharSequence) "", '0');
                        int indexOf6 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3159;
                        char indexOf7 = (char) (58073 - TextUtils.indexOf((CharSequence) "", '0'));
                        byte b27 = (byte) 1;
                        byte b28 = b27;
                        Object[] objArr61 = new Object[1];
                        charlie(b27, b28, (byte) (b28 + 1), objArr61);
                        D887111 = uH18377.setPivotYN16904(indexOf5, indexOf6, indexOf7, 424179844, false, (String) objArr61[0], new Class[]{cls2});
                    }
                    Object invoke5 = ((Method) D887111).invoke(null, objArr60);
                    int i314 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i315 = (i314 ^ 30) + ((i314 & 30) << 1);
                    Object[] objArr62 = new Object[1];
                    delta("㴝횅喰چ㴝횅僃颢ᱠ筂靔뵢녵䎭\ueedf酄ꚓ풠盈鿨ꕂ诂彩⮭ᱠ筂ㅚ濭얪濲", i315, objArr62);
                    Object[] objArr63 = {(String) objArr62[0]};
                    Object D887112 = uH18377.D8871(-957097391);
                    if (D887112 == null) {
                        int blue2 = 52 - Color.blue(0);
                        int combineMeasuredStates = View.combineMeasuredStates(0, 0) + 3158;
                        char resolveSize = (char) (View.resolveSize(0, 0) + 58074);
                        byte b29 = (byte) 1;
                        byte b30 = b29;
                        obj2 = invoke5;
                        Object[] objArr64 = new Object[1];
                        charlie(b29, b30, (byte) (b30 + 1), objArr64);
                        D887112 = uH18377.setPivotYN16904(blue2, combineMeasuredStates, resolveSize, 424179844, false, (String) objArr64[0], new Class[]{cls2});
                    } else {
                        obj2 = invoke5;
                    }
                    Object invoke6 = ((Method) D887112).invoke(null, objArr63);
                    if (obj2 != null) {
                        int i316 = november;
                        mike = ((i316 & 69) + (i316 | 69)) % 128;
                        Object[] objArr65 = {obj2, 42};
                        Object D887113 = uH18377.D8871(2072770498);
                        if (D887113 == null) {
                            int i317 = 52 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i318 = 1210 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 44356);
                            byte b31 = (byte) 1;
                            byte b32 = (byte) (b31 - 1);
                            obj3 = invoke6;
                            Object[] objArr66 = new Object[1];
                            charlie(b31, b32, (byte) (b32 - 1), objArr66);
                            D887113 = uH18377.setPivotYN16904(i317, i318, packedPositionGroup2, -1540336361, false, (String) objArr66[0], new Class[]{cls2, cls});
                        } else {
                            obj3 = invoke6;
                        }
                        long longValue7 = ((Long) ((Method) D887113).invoke(null, objArr65)).longValue();
                        long j60 = 192732118;
                        long j61 = -919;
                        long j62 = (j61 * longValue7) + (j61 * j60);
                        long j63 = 920;
                        long j64 = j60 ^ j11;
                        long j65 = longValue7 ^ j11;
                        long j66 = j64 | j65;
                        long romeo4 = ad.romeo();
                        long j67 = romeo4 ^ j11;
                        long j68 = ((((((j66 | j67) ^ j11) | (((j64 | longValue7) | romeo4) ^ j11)) | ((romeo4 | (j65 | j60)) ^ j11)) * j63) + ((((j66 ^ j11) | ((j64 | j67) ^ j11)) * j63) + (((((j66 | romeo4) ^ j11) | (((j65 | j67) | j60) ^ j11)) * j63) + j62))) - 200177148;
                        int i319 = ((int) (j68 >> 32)) & ((((-1470057586) | (~(32831174 | i4)) | (~(i31 | (-32831175)))) * 45) + (((~((-1470057586) | i4)) | 6337158) * (-45)) + (((~((-1470057586) | i31)) | (-32831175)) * (-90)) + 1687905420);
                        int i320 = ~(Process.myTid() | (-35899450));
                        int i321 = ((int) j68) & (((i320 | (-1403506042)) * 196) + ((1367606592 | i320) * (-196)) + 534970557);
                    } else {
                        obj3 = invoke6;
                    }
                    if (obj3 != null) {
                        Object[] objArr67 = {obj3, 42};
                        Object D887114 = uH18377.D8871(2072770498);
                        if (D887114 == null) {
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 51;
                            int resolveOpacity2 = Drawable.resolveOpacity(0, 0) + 1209;
                            char alpha2 = (char) (44356 - Color.alpha(0));
                            byte b33 = (byte) 1;
                            byte b34 = (byte) (b33 - 1);
                            Object[] objArr68 = new Object[1];
                            charlie(b33, b34, (byte) (b34 - 1), objArr68);
                            D887114 = uH18377.setPivotYN16904(threadPriority, resolveOpacity2, alpha2, -1540336361, false, (String) objArr68[0], new Class[]{cls2, cls});
                        }
                        long longValue8 = ((Long) ((Method) D887114).invoke(null, objArr67)).longValue();
                        long j69 = 766193420;
                        long j70 = -344;
                        long j71 = (j70 * longValue8) + (j70 * j69);
                        long j72 = 345;
                        long j73 = j69 ^ j11;
                        long j74 = longValue8 ^ j11;
                        long j75 = j73 | j74;
                        long j76 = ((j72 * ((j75 | j15) ^ j11)) + (((((j73 | j16) ^ j11) | ((j74 | j69) ^ j11)) * j72) + ((((j75 ^ j11) | ((j73 | j15) ^ j11)) * j72) + j71))) - 773638450;
                        int tango2 = ad.tango(275266001);
                        int i322 = (~((-1909462440) | tango2)) | 1641021443;
                        int i323 = ~tango2;
                    }
                }
            }
            Class<String> cls3 = cls2;
            boolean z14 = false;
            if (z14) {
                int i324 = november;
                mike = ((i324 & 83) + (i324 | 83)) % 128;
                Object[] objArr69 = new Object[4];
                objArr69[0] = new int[1];
                int[] iArr3 = new int[1];
                objArr69[1] = iArr3;
                int[] iArr4 = new int[1];
                objArr69[2] = iArr4;
                iArr4[0] = i4;
                iArr3[0] = (i4 & (-262)) | (i31 & 261);
                objArr69[i15] = null;
                int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i325 = ((((~((~maxMemory2) | (-176534517))) | (-468566016)) * 564) + (((~(maxMemory2 | (-134578629))) * 1128) + (((((~((-333987388) | r2)) | (-176534517)) | (~(333987387 | maxMemory2))) * (-564)) - 880372069))) - (-666910693);
                int i326 = i325 << 13;
                int i327 = (i326 | i325) & (~(i325 & i326));
                int i328 = i327 >>> 17;
                int i329 = ((~i327) & i328) | ((~i328) & i327);
                int i330 = i329 << 5;
                ((int[]) objArr69[0])[0] = (i329 | i330) & (~(i329 & i330));
                return objArr69;
            }
            int i331 = 1260728992 - (~(-(-TextUtils.indexOf("", ""))));
            int lastIndexOf3 = (-103) - TextUtils.lastIndexOf("", '0');
            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
            int component99 = C1263t2.component9();
            int i332 = bitsPerPixel2 * (-575);
            int i333 = (i332 ^ 1914819314) + ((i332 & 1914819314) << 1);
            int i334 = ~bitsPerPixel2;
            int i335 = ~((i334 ^ 122842253) | (i334 & 122842253));
            int i336 = ~((122842253 & component99) | (122842253 ^ component99));
            int i337 = ((i336 & i335) | (i335 ^ i336)) * 576;
            int i338 = (i333 & i337) + (i337 | i333);
            int i339 = ~(((-122842254) & i334) | (i334 ^ (-122842254)));
            int i340 = ~component99;
            int i341 = (i340 & 122842253) | (122842253 ^ i340);
            int i342 = ~((bitsPerPixel2 & i341) | (i341 ^ bitsPerPixel2));
            int i343 = -(-(((i342 & i339) | (i339 ^ i342)) * 576));
            int i344 = (((i338 ^ i343) + ((i343 & i338) << 1)) - (~((~((122842253 & i334) | (i334 ^ 122842253))) * 576))) - 1;
            short maximumFlingVelocity2 = (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i345 = -KeyEvent.keyCodeFromString("");
            Object[] objArr70 = new Object[1];
            echo(i331, lastIndexOf3, i344, maximumFlingVelocity2, (byte) (((i345 | (-89)) << 1) - (i345 ^ (-89))), objArr70);
            Object[] objArr71 = {(String) objArr70[0]};
            Object D887115 = uH18377.D8871(1553409481);
            if (D887115 == null) {
                int i346 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51;
                int maximumDrawingCacheSize2 = 2279 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                byte b35 = (byte) 1;
                byte b36 = (byte) (b35 - 1);
                Object[] objArr72 = new Object[1];
                charlie(b35, b36, (byte) (b36 - 1), objArr72);
                D887115 = uH18377.setPivotYN16904(i346, maximumDrawingCacheSize2, bitsPerPixel3, -2094233828, false, (String) objArr72[0], new Class[]{cls3});
            }
            long longValue9 = ((Long) ((Method) D887115).invoke(null, objArr71)).longValue();
            long j77 = 1603295312;
            long j78 = 628;
            long j79 = (j78 * longValue9) + (j78 * j77);
            long j80 = -627;
            long freeMemory3 = (int) Runtime.getRuntime().freeMemory();
            long j81 = ((627 * ((((freeMemory3 ^ j11) | longValue9) ^ j11) | ((j77 | freeMemory3) ^ j11))) + (((j77 | (((longValue9 ^ j11) | freeMemory3) ^ j11)) * j80) + ((((longValue9 | freeMemory3) | (j77 ^ j11)) * j80) + j79))) - 1745942968;
            long foxtrot2 = (((int) (j81 >> 32)) & ((((~((-131653309) | i4)) | 97539756 | (~(1339686654 | i31))) * 164) + ((1305573102 | i4) * 164) + (((~(131653308 | i31)) | 1305573102) * (-328)) + 686544306)) | (((int) j81) & A0.z.foxtrot((~(2003492607 | i4)) | 553649217, 446, (((~(1997184117 | i31)) | 6308490) * 446) - 384374209, -1481380756));
            int i347 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            int i348 = ((i347 | 17) << 1) - (i347 ^ 17);
            Object[] objArr73 = new Object[1];
            delta("ꮶ\ue3ab㴝횅ꄈ\ue0bf옝草鷒\ue957랠䗐甸ʃΠᄌ鄊ᥥ", i348, objArr73);
            Object[] objArr74 = {(String) objArr73[0]};
            Object D887116 = uH18377.D8871(1553409481);
            if (D887116 == null) {
                int i349 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 50;
                int jumpTapTimeout2 = 2279 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                char indexOf8 = (char) TextUtils.indexOf("", "", 0);
                byte b37 = (byte) 1;
                byte b38 = (byte) (b37 - 1);
                j5 = foxtrot2;
                Object[] objArr75 = new Object[1];
                charlie(b37, b38, (byte) (b38 - 1), objArr75);
                D887116 = uH18377.setPivotYN16904(i349, jumpTapTimeout2, indexOf8, -2094233828, false, (String) objArr75[0], new Class[]{cls3});
            } else {
                j5 = foxtrot2;
            }
            long longValue10 = ((Long) ((Method) D887116).invoke(null, objArr74)).longValue();
            long j82 = 1603153464;
            long j83 = -755;
            long j84 = ((j82 ^ j11) | (longValue10 ^ j11)) ^ j11;
            long j85 = (1512 * j84) + (j83 * longValue10) + (j83 * j82);
            long j86 = j82 | longValue10;
            long freeMemory4 = (int) Runtime.getRuntime().freeMemory();
            long j87 = ((756 * (j86 | (freeMemory4 ^ j11))) + (((-756) * (j84 | ((j86 | freeMemory4) ^ j11))) + j85)) - 1745801120;
            int i350 = ((int) (j87 >> 32)) & (((1610578875 | i4) * 668) + ((1526296763 | (~(89070352 | i4))) * 1336) + (((~(1526296763 | i4)) | 89070352) * (-668)) + 1783670302);
            int i351 = ((int) j87) & ((((~((-1283517078) | i31)) | (-1302981526)) * 374) + (((19464448 | r3) * (-374)) - 763671175));
            long j88 = (i350 & i351) | (i350 ^ i351);
            if (j5 > 0 && j88 > 0 && j88 - 3 < j5) {
                C1263t2.component9();
                C1263t2.component9();
                Object[] objArr76 = new Object[4];
                objArr76[0] = new int[1];
                int[] iArr5 = new int[1];
                objArr76[1] = iArr5;
                int[] iArr6 = new int[1];
                objArr76[2] = iArr6;
                int i352 = (~(i4 & 247)) & (i4 | 247);
                iArr6[0] = i4;
                iArr5[0] = i352;
                objArr76[i15] = null;
                int i353 = (int) Runtime.getRuntime().totalMemory();
                int i354 = ~i353;
                int i355 = (((~(i353 | 368621700)) | 134545707 | (~(i354 | (-361267205)))) * 369) + (((~((-368621701) | i354)) | 141900203) * (-369)) + (((503167407 | i354) * (-369)) - 85456914);
                int i356 = ((i355 | 16) << 1) - (i355 ^ 16);
                int i357 = (i356 ^ i14) + ((i356 & i14) << 1);
                int i358 = i357 << 13;
                int i359 = (i357 | i358) & (~(i357 & i358));
                int i360 = i359 >>> 17;
                int i361 = (i359 | i360) & (~(i359 & i360));
                int i362 = i361 << 5;
                ((int[]) objArr76[0])[0] = ((~i361) & i362) | ((~i362) & i361);
                return objArr76;
            }
            int indexOf9 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1260728994;
            int i363 = (-104) - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))));
            int i364 = -(-View.getDefaultSize(0, 0));
            int i365 = (i364 & (-122842255)) + (i364 | (-122842255));
            int i366 = -Process.getGidForName("");
            Object[] objArr77 = new Object[1];
            echo(indexOf9, i363, i365, (short) ((i366 ^ (-1)) + (i366 << 1)), (byte) (KeyEvent.normalizeMetaState(0) - 89), objArr77);
            Object[] objArr78 = {(String) objArr77[0]};
            Object D887117 = uH18377.D8871(1553409481);
            if (D887117 == null) {
                int maximumDrawingCacheSize3 = 51 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int jumpTapTimeout3 = 2279 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte b39 = (byte) 1;
                byte b40 = (byte) (b39 - 1);
                Object[] objArr79 = new Object[1];
                charlie(b39, b40, (byte) (b40 - 1), objArr79);
                D887117 = uH18377.setPivotYN16904(maximumDrawingCacheSize3, jumpTapTimeout3, doubleTapTimeout2, -2094233828, false, (String) objArr79[0], new Class[]{cls3});
            }
            long longValue11 = ((Long) ((Method) D887117).invoke(null, objArr78)).longValue();
            long j89 = 1151218301;
            long j90 = ((-396) * longValue11) + (398 * j89);
            long j91 = -397;
            long j92 = j89 ^ j11;
            long j93 = (j92 | j16) ^ j11;
            long j94 = (j92 | longValue11) ^ j11;
            long j95 = ((397 * ((j15 | j94) | (((longValue11 ^ j11) | j89) ^ j11))) + ((j91 * j94) + ((((j93 | j94) | ((j16 | longValue11) ^ j11)) * j91) + j90))) - 1293865957;
            int i367 = ((int) (j95 >> 32)) & ((((~((-1732396933) | i4)) | (-1125343953)) * 272) + (((~(1732396932 | i4)) | 1122384) * (-272)) + ((((~(1733519316 | i31)) | (~((-1124221569) | i4))) * (-272)) - 472426902));
            int i368 = (((((~(112288542 | i31)) | (-1325003680)) | (~(1324937867 | i31))) | (~((-112222731) | i4))) * (-84)) - 1905160647;
            int i369 = (~(1324937867 | i4)) | (-112288543);
            int i370 = ~((-1324937868) | i31);
            long j96 = i367 | (((int) j95) & (((112222730 | i370) * 84) + ((i369 | i370) * (-84)) + i368));
            int i371 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i372 = ((i371 | 4) << 1) - (i371 ^ 4);
            Object[] objArr80 = new Object[1];
            delta("⏷㲳ɚ\u139e", i372, objArr80);
            Object[] objArr81 = {(String) objArr80[0]};
            Object D887118 = uH18377.D8871(1553409481);
            if (D887118 == null) {
                int indexOf10 = TextUtils.indexOf("", "", 0, 0) + 51;
                int bitsPerPixel4 = 2278 - ImageFormat.getBitsPerPixel(0);
                char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                byte b41 = (byte) 1;
                byte b42 = (byte) (b41 - 1);
                j6 = j96;
                Object[] objArr82 = new Object[1];
                charlie(b41, b42, (byte) (b42 - 1), objArr82);
                D887118 = uH18377.setPivotYN16904(indexOf10, bitsPerPixel4, tapTimeout2, -2094233828, false, (String) objArr82[0], new Class[]{cls3});
            } else {
                j6 = j96;
            }
            long longValue12 = ((Long) ((Method) D887118).invoke(null, objArr81)).longValue();
            long j97 = 1194043603;
            long j98 = ((-885) * longValue12) + (1773 * j97);
            long j99 = 886;
            long j100 = longValue12 ^ j11;
            long j101 = (((j97 ^ j11) | j100) ^ j11) | ((j100 | j15) ^ j11);
            long j102 = j16 | j97;
            long j103 = (((j102 ^ j11) * j99) + (((-1772) * (j97 | ((j16 | longValue12) ^ j11))) + (((j101 | ((j102 | longValue12) ^ j11)) * j99) + j98))) - 1336691259;
            int tango3 = ad.tango(851792732);
            int i373 = ~tango3;
            long j104 = (((int) (j103 >> 32)) & ((((~((-1226530518) | i31)) | (-1765498880)) * 495) + ((r2 * 495) - 814155879))) | (((int) j103) & ((((~(i373 | (-1054277062))) | 671393793) * 560) + ((~(tango3 | (-66081))) * (-560)) + ((~((-382949349) | i373)) * (-560)) + 576376357));
            if ((j6 > 0 ? 'M' : (char) 23) == 'M') {
                C1263t2.component9();
                C1263t2.component9();
                if (j104 > 0) {
                    if (j104 + 100 < j6) {
                        c11 = 'U';
                        c12 = 17;
                    } else {
                        c11 = 17;
                        c12 = 17;
                    }
                    if (c11 != c12) {
                        z2 = true;
                        if (!z2) {
                            mike = (november + 65) % 128;
                            Object[] objArr83 = new Object[4];
                            int[] iArr7 = new int[1];
                            objArr83[0] = iArr7;
                            int[] iArr8 = new int[1];
                            objArr83[1] = iArr8;
                            int[] iArr9 = new int[1];
                            objArr83[2] = iArr9;
                            iArr9[0] = i4;
                            iArr8[0] = i4 ^ 248;
                            objArr83[i15] = null;
                            int i374 = (((~(i4 | 354781480)) | 155740423) * 272) + (((~((-354781481) | i4)) | 338001960) * (-272)) + ((((~((-16779521) | i31)) | (~(493742383 | i4))) * (-272)) - 1184885441);
                            int i375 = (i374 ^ 16) + ((i374 & 16) << 1) + i14;
                            int i376 = (i375 << 13) ^ i375;
                            int i377 = i376 ^ (i376 >>> 17);
                            int i378 = i377 << 5;
                            iArr7[0] = ((~i377) & i378) | ((~i378) & i377);
                            return objArr83;
                        }
                        int offsetAfter3 = 1260728993 - TextUtils.getOffsetAfter("", 0);
                        int i379 = (-120) - (~(-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
                        int resolveOpacity3 = Drawable.resolveOpacity(0, 0);
                        int i380 = ((resolveOpacity3 | (-122842233)) << 1) - (resolveOpacity3 ^ (-122842233));
                        int i381 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                        int i382 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr84 = new Object[1];
                        echo(offsetAfter3, i379, i380, (short) ((i381 ^ 1) + ((i381 & 1) << 1)), (byte) ((i382 & (-71)) + (i382 | (-71))), objArr84);
                        String str31 = (String) objArr84[0];
                        int i383 = -(-Drawable.resolveOpacity(0, 0));
                        int i384 = (i383 & 11) + (i383 | 11);
                        Object[] objArr85 = new Object[1];
                        delta("랠䗐녵䎭\ueedf酄煦쟹ꃲ炉뺧ᄫ", i384, objArr85);
                        String str32 = (String) objArr85[0];
                        int i385 = -TextUtils.indexOf("", "");
                        int i386 = (i385 ^ 12) + ((i385 & 12) << 1);
                        Object[] objArr86 = new Object[1];
                        delta("랠䗐녵䎭\ueedf酄煦쟹귡횺棊쑖", i386, objArr86);
                        String str33 = (String) objArr86[0];
                        int i387 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i388 = (i387 ^ 13) + ((i387 & 13) << 1);
                        Object[] objArr87 = new Object[1];
                        delta("랠䗐녵䎭\ueedf酄煦쟹땘ꁾ棊쑖", i388, objArr87);
                        String str34 = (String) objArr87[0];
                        int blue3 = Color.blue(0);
                        int i389 = (blue3 ^ 11) + ((blue3 & 11) << 1);
                        Object[] objArr88 = new Object[1];
                        delta("쳎伺\uddb8⩁假㮻蝍㐴ꃲ炉뺧ᄫ", i389, objArr88);
                        String str35 = (String) objArr88[0];
                        int i390 = -Color.green(0);
                        int i391 = (i390 ^ 5) + ((i390 & 5) << 1);
                        Object[] objArr89 = new Object[1];
                        delta("랠䗐ꃲ炉뺧ᄫ", i391, objArr89);
                        String str36 = (String) objArr89[0];
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1260728993;
                        int i392 = -TextUtils.indexOf("", "", 0, 0);
                        int i393 = -(-TextUtils.indexOf("", "", 0, 0));
                        int i394 = 1;
                        Object[] objArr90 = new Object[1];
                        echo(maxKeyCode2, (i392 & (-121)) + (i392 | (-121)), (-122842228) - (~Color.red(0)), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (byte) ((i393 ^ (-126)) + ((i393 & (-126)) << 1)), objArr90);
                        String[] strArr5 = {str31, str32, str33, str34, str35, str36, (String) objArr90[0]};
                        int i395 = i13;
                        int i396 = 0;
                        while (true) {
                            if ((i396 < i395 ? i394 : 0) != i394) {
                                i16 = 0;
                                break;
                            }
                            Object[] objArr91 = new Object[i394];
                            objArr91[0] = strArr5[i396];
                            Object D887119 = uH18377.D8871(1322889954);
                            if (D887119 == null) {
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 53;
                                int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1467;
                                char offsetAfter4 = (char) TextUtils.getOffsetAfter("", 0);
                                byte b43 = (byte) 1;
                                byte b44 = (byte) (b43 - 1);
                                strArr2 = strArr5;
                                i27 = i396;
                                Object[] objArr92 = new Object[1];
                                charlie(b43, b44, (byte) (b44 - 1), objArr92);
                                D887119 = uH18377.setPivotYN16904(modifierMetaStateMask2, doubleTapTimeout3, offsetAfter4, -1855844297, false, (String) objArr92[0], new Class[]{cls3});
                            } else {
                                strArr2 = strArr5;
                                i27 = i396;
                            }
                            long longValue13 = ((Long) ((Method) D887119).invoke(null, objArr91)).longValue();
                            long j105 = -432504501;
                            long j106 = j105 ^ j11;
                            long j107 = (j16 | j105) ^ j11;
                            long j108 = longValue13 ^ j11;
                            long j109 = (374 * (((j106 | j108) ^ j11) | j107)) + (748 * ((j108 | j105) ^ j11)) + ((-374) * (((j106 | longValue13) ^ j11) | j107)) + ((-747) * longValue13) + (375 * j105) + 1981273872;
                            int romeo5 = ad.romeo();
                            int foxtrot3 = ((int) (j109 >> 32)) & A0.z.foxtrot((~(romeo5 | (-206900582))) | (~(1644126992 | romeo5)) | 201329765, -1444, (((~romeo5) | 1839885941) * 1444) - 1153123274, -1252755660);
                            int uptimeMillis = (int) SystemClock.uptimeMillis();
                            int i397 = ((int) j109) & ((((~(uptimeMillis | 1966523943)) | 891216942) * 272) + (((~((-1966523944) | uptimeMillis)) | 1075839489) * (-272)) + ((((~((-890684455) | (~uptimeMillis))) | (~(1967056431 | uptimeMillis))) * (-272)) - 1011498267));
                            if (((foxtrot3 & i397) | (foxtrot3 ^ i397)) != 0) {
                                i16 = i27 + 90;
                                break;
                            }
                            i11 = i11;
                            i29 = i29;
                            i395 = 7;
                            i394 = 1;
                            i10 = 16;
                            i15 = 3;
                            i14 = 666910677;
                            i396 = (i27 ^ 1) + ((i27 & 1) << 1);
                            strArr5 = strArr2;
                        }
                        if (i16 != 0) {
                            november = (mike + 123) % 128;
                            Object[] objArr93 = new Object[4];
                            objArr93[0] = new int[1];
                            int[] iArr10 = new int[1];
                            objArr93[1] = iArr10;
                            int[] iArr11 = new int[1];
                            objArr93[2] = iArr11;
                            int i398 = ~(i4 & i16);
                            iArr11[0] = i4;
                            iArr10[0] = (i16 | i4) & i398;
                            objArr93[i15] = null;
                            int myPid3 = Process.myPid();
                            int i399 = ~myPid3;
                            int i400 = (((~(myPid3 | (-26349665))) | (~(i399 | 832486130)) | (~((-536871569) | myPid3))) * 192) + (((~(295614562 | i399)) | 536871568) * (-384)) + (((269264898 | i399) * (-192)) - 253520529);
                            int i401 = 666910676 - (~(-(-(((i400 | 16) << 1) - (i400 ^ 16)))));
                            int i402 = i401 << 13;
                            int i403 = (i402 & (~i401)) | ((~i402) & i401);
                            int i404 = i403 >>> 17;
                            int i405 = (i403 | i404) & (~(i403 & i404));
                            int i406 = i405 << 5;
                            ((int[]) objArr93[0])[0] = ((~i405) & i406) | ((~i406) & i405);
                            return objArr93;
                        }
                        try {
                            int lastIndexOf4 = TextUtils.lastIndexOf("", '0');
                            int i407 = (lastIndexOf4 & 1260729061) + (lastIndexOf4 | 1260729061);
                            int i408 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i409 = (i408 & (-112)) + (i408 | (-112));
                            int i410 = -(Process.myPid() >> 22);
                            int i411 = (i410 & (-122842224)) + (i410 | (-122842224));
                            short doubleTapTimeout4 = (short) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i412 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                            Object[] objArr94 = new Object[1];
                            echo(i407, i409, i411, doubleTapTimeout4, (byte) ((i412 ^ (-76)) + ((i412 & (-76)) << 1)), objArr94);
                            try {
                                Object[] objArr95 = {(String) objArr94[0]};
                                Object D887120 = uH18377.D8871(-957097391);
                                if (D887120 == null) {
                                    int indexOf11 = 52 - TextUtils.indexOf("", "");
                                    int i413 = 3158 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 58074);
                                    byte b45 = (byte) 1;
                                    byte b46 = b45;
                                    Object[] objArr96 = new Object[1];
                                    charlie(b45, b46, (byte) (b46 + 1), objArr96);
                                    D887120 = uH18377.setPivotYN16904(indexOf11, i413, pressedStateDuration2, 424179844, false, (String) objArr96[0], new Class[]{cls3});
                                }
                                Object invoke7 = ((Method) D887120).invoke(null, objArr95);
                                if (invoke7 != null) {
                                    int i414 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    int i415 = (i414 & 11) + (i414 | 11);
                                    Object[] objArr97 = new Object[1];
                                    delta("긋랏䖏ﭱ淍\ue42e\uddb8⩁ᵵ\udc0e\ue5b9ɭ", i415, objArr97);
                                    try {
                                        Object[] objArr98 = {invoke7, new String[]{(String) objArr97[0]}};
                                        Object D887121 = uH18377.D8871(-1363379003);
                                        if (D887121 == null) {
                                            int red = 52 - Color.red(0);
                                            int trimmedLength2 = 1415 - TextUtils.getTrimmedLength("");
                                            char scrollBarFadeDuration = (char) (3047 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                            byte b47 = (byte) 1;
                                            byte b48 = (byte) (b47 - 1);
                                            Object[] objArr99 = new Object[1];
                                            charlie(b47, b48, (byte) (b48 - 1), objArr99);
                                            D887121 = uH18377.setPivotYN16904(red, trimmedLength2, scrollBarFadeDuration, 1896341008, false, (String) objArr99[0], new Class[]{cls3, String[].class});
                                        }
                                        long longValue14 = ((Long) ((Method) D887121).invoke(null, objArr98)).longValue();
                                        long j110 = -887229940;
                                        long j111 = -958;
                                        long j112 = (j111 * longValue14) + (j111 * j110);
                                        long j113 = 959;
                                        long j114 = longValue14 ^ j11;
                                        long j115 = j110 ^ j11;
                                        long j116 = ((((j115 | j16) ^ j11) | ((j114 | j15) ^ j11) | ((j110 | j15) ^ j11)) * j113) + ((-959) * ((j110 | longValue14) ^ j11)) + ((((j114 | j16) ^ j11) | ((j115 | j15) ^ j11) | ((j16 | j110) ^ j11)) * j113) + j112 + 1677357563;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                int i416 = -TextUtils.getOffsetBefore("", 0);
                                int i417 = (i416 ^ 1260729051) + ((i416 & 1260729051) << 1);
                                int threadPriority2 = Process.getThreadPriority(0);
                                int i418 = (-107) - ((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6);
                                int indexOf12 = TextUtils.indexOf("", "", 0);
                                Object[] objArr100 = new Object[1];
                                echo(i417, i418, (indexOf12 ^ (-122842212)) + ((indexOf12 & (-122842212)) << 1), (short) ((-2) - ((-TextUtils.indexOf((CharSequence) "", '0', 0)) ^ (-1))), (byte) (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr100);
                                try {
                                    Object[] objArr101 = {(String) objArr100[0]};
                                    Object D887122 = uH18377.D8871(-957097391);
                                    if (D887122 == null) {
                                        int i419 = 53 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int indexOf13 = TextUtils.indexOf((CharSequence) "", '0', 0) + 3159;
                                        char c14 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58074);
                                        byte b49 = (byte) 1;
                                        byte b50 = b49;
                                        Object[] objArr102 = new Object[1];
                                        charlie(b49, b50, (byte) (b50 + 1), objArr102);
                                        D887122 = uH18377.setPivotYN16904(i419, indexOf13, c14, 424179844, false, (String) objArr102[0], new Class[]{cls3});
                                    }
                                    invoke = ((Method) D887122).invoke(null, objArr101);
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
                        if (invoke == null) {
                            i26 = 0;
                        } else {
                            int i420 = -ExpandableListView.getPackedPositionChild(0L);
                            int i421 = (i420 ^ 1260729059) + ((i420 & 1260729059) << 1);
                            int i422 = (-120) - (~(-TextUtils.lastIndexOf("", '0')));
                            int i423 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                            int i424 = ((i423 | (-122842195)) << 1) - (i423 ^ (-122842195));
                            short normalizeMetaState2 = (short) KeyEvent.normalizeMetaState(0);
                            int i425 = -(Process.myTid() >> 22);
                            Object[] objArr103 = new Object[1];
                            echo(i421, i422, i424, normalizeMetaState2, (byte) ((i425 & 85) + (i425 | 85)), objArr103);
                            i26 = 0;
                            if (invoke.equals((String) objArr103[0])) {
                                int i426 = -Color.argb(0, 0, 0, 0);
                                int i427 = (i426 & 23) + (i426 | 23);
                                Object[] objArr104 = new Object[1];
                                delta("湽嚸寯ᗅ꼂ꛝ젲右Ж罖ᮉ\ueeec㴝횅ࠡ毇㱼ꫪ聯ㆌ緌쾃鄊ᥥ", i427, objArr104);
                                try {
                                    Object[] objArr105 = {(String) objArr104[0]};
                                    Object D887123 = uH18377.D8871(-957097391);
                                    if (D887123 == null) {
                                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 52;
                                        int i428 = 3159 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 58074);
                                        byte b51 = (byte) 1;
                                        byte b52 = b51;
                                        Object[] objArr106 = new Object[1];
                                        charlie(b51, b52, (byte) (b52 + 1), objArr106);
                                        D887123 = uH18377.setPivotYN16904(edgeSlop2, i428, defaultSize2, 424179844, false, (String) objArr106[0], new Class[]{cls3});
                                    }
                                    String str37 = (String) ((Method) D887123).invoke(null, objArr105);
                                    if (str37 != null && (parseInt = Integer.parseInt(str37)) != 0) {
                                        mike = (november + 123) % 128;
                                        i17 = (parseInt | 170) + (parseInt & 170);
                                        if (i17 != 0) {
                                            november = (mike + 95) % 128;
                                            Object[] objArr107 = new Object[4];
                                            objArr107[0] = new int[1];
                                            int[] iArr12 = new int[1];
                                            objArr107[1] = iArr12;
                                            int[] iArr13 = new int[1];
                                            objArr107[2] = iArr13;
                                            int i429 = (~i17) & i4;
                                            iArr13[0] = i4;
                                            iArr12[0] = (i17 & i31) | i429;
                                            objArr107[i15] = null;
                                            int tango4 = ad.tango(407923395);
                                            int i430 = ((tango4 | 720533370) * 668) + ((685782394 | (~(175260490 | tango4))) * 1336) + (((~(tango4 | 685782394)) | 175260490) * (-668)) + 243168563 + 16;
                                            int i431 = (i430 & i14) + (i430 | i14);
                                            int i432 = (i431 << 13) ^ i431;
                                            int i433 = i432 ^ (i432 >>> 17);
                                            int i434 = i433 << 5;
                                            ((int[]) objArr107[0])[0] = ((~i433) & i434) | ((~i434) & i433);
                                            return objArr107;
                                        }
                                        int i435 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        int component910 = C1263t2.component9();
                                        int i436 = i435 * 905;
                                        int i437 = (i436 ^ (-272007740)) + ((i436 & (-272007740)) << 1);
                                        int i438 = ~((~i435) | component910);
                                        int i439 = ~component910;
                                        int i440 = ~((i439 ^ 1260729060) | (i439 & 1260729060));
                                        int i441 = -(-(((i438 & i440) | (i438 ^ i440)) * (-1808)));
                                        int i442 = (i437 ^ i441) + ((i441 & i437) << 1);
                                        int i443 = ~i435;
                                        int i444 = ~((i443 ^ (-1260729061)) | (i443 & (-1260729061)) | component910);
                                        int i445 = ~component910;
                                        int i446 = ~((i445 ^ i435) | (i445 & i435) | 1260729060);
                                        int i447 = -(-(((i444 ^ i446) | (i446 & i444)) * 904));
                                        int i448 = ~((i443 & 1260729060) | (i443 ^ 1260729060));
                                        int i449 = ~((-1260729061) | component910);
                                        int i450 = (i449 & i448) | (i448 ^ i449);
                                        int i451 = ~(i435 | i439);
                                        int i452 = ((((i442 | i447) << 1) - (i447 ^ i442)) - (~(((i451 & i450) | (i450 ^ i451)) * 904))) - 1;
                                        int i453 = (-113) - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
                                        int i454 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i455 = ((i454 | (-122842224)) << 1) - (i454 ^ (-122842224));
                                        int i456 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        Object[] objArr108 = new Object[1];
                                        echo(i452, i453, i455, (short) (((i456 | 1) << 1) - (i456 ^ 1)), (byte) ((-125) - (~(-(-AndroidCharacter.getMirror('0'))))), objArr108);
                                        Object[] objArr109 = {(String) objArr108[0]};
                                        Object D887124 = uH18377.D8871(-957097391);
                                        if (D887124 == null) {
                                            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52;
                                            int scrollBarFadeDuration2 = 3158 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            char c15 = (char) (58074 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            byte b53 = (byte) 1;
                                            byte b54 = b53;
                                            Object[] objArr110 = new Object[1];
                                            charlie(b53, b54, (byte) (b54 + 1), objArr110);
                                            D887124 = uH18377.setPivotYN16904(minimumFlingVelocity3, scrollBarFadeDuration2, c15, 424179844, false, (String) objArr110[0], new Class[]{cls3});
                                        }
                                        Object invoke8 = ((Method) D887124).invoke(null, objArr109);
                                        if (invoke8 != null) {
                                            Object[] objArr111 = new Object[1];
                                            delta("긋랏䖏ﭱ淍\ue42e\uddb8⩁ᵵ\udc0e\ue5b9ɭ", 10 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8)))), objArr111);
                                            Object[] objArr112 = {invoke8, new String[]{(String) objArr111[0]}};
                                            Object D887125 = uH18377.D8871(-1363379003);
                                            if (D887125 == null) {
                                                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 52;
                                                int scrollBarFadeDuration3 = 1415 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 3047);
                                                byte b55 = (byte) 1;
                                                byte b56 = (byte) (b55 - 1);
                                                Object[] objArr113 = new Object[1];
                                                charlie(b55, b56, (byte) (b56 - 1), objArr113);
                                                D887125 = uH18377.setPivotYN16904(edgeSlop3, scrollBarFadeDuration3, pressedStateDuration3, 1896341008, false, (String) objArr113[0], new Class[]{cls3, String[].class});
                                            }
                                            long longValue15 = ((Long) ((Method) D887125).invoke(null, objArr112)).longValue();
                                            long j117 = -273241349;
                                            long j118 = j117 ^ j11;
                                            long j119 = ((-1808) * (((j118 | j15) ^ j11) | ((j16 | longValue15) ^ j11))) + ((-903) * longValue15) + (905 * j117);
                                            long j120 = 904;
                                            long j121 = longValue15 ^ j11;
                                            long j122 = j16 | j117;
                                            long j123 = (j120 * (((j118 | longValue15) ^ j11) | ((j121 | j15) ^ j11) | (j122 ^ j11))) + (((((j118 | j121) | j15) ^ j11) | ((j122 | longValue15) ^ j11)) * j120) + j119 + 1063368972;
                                            int myPid4 = Process.myPid();
                                            int i457 = ~((-1756528071) | myPid4);
                                            int i458 = ~myPid4;
                                            int i459 = ((int) (j123 >> 32)) & ((((~(myPid4 | 319301659)) | (~(1756528070 | i458))) * HttpConstants.HTTP_NOT_ACCEPTABLE) + ((~(i458 | (-10243))) * (-406)) + (((i457 | (~((-319291418) | i458))) * (-406)) - 1884460522));
                                            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                            int i460 = ~elapsedRealtime2;
                                            int i461 = (((~((-1251591305) | i460)) | (~(1520026828 | elapsedRealtime2))) * 520) - 1123866003;
                                            int i462 = ~((-1520026829) | i460);
                                            int i463 = ~(elapsedRealtime2 | 1337714057);
                                            int i464 = ((int) j123) & (((i463 | (~(i460 | (-1337714058))) | 268435524) * 520) + ((i462 | i463) * (-1040)) + i461);
                                            if (((i459 & i464) | (i459 ^ i464)) != 1) {
                                                int i465 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                int i466 = ((i465 | 1260728993) << 1) - (i465 ^ 1260728993);
                                                int i467 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 114;
                                                int i468 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                                int i469 = (i468 ^ (-122842189)) + ((i468 & (-122842189)) << 1);
                                                short bitsPerPixel5 = (short) ((-1) - ImageFormat.getBitsPerPixel(0));
                                                int i470 = -View.combineMeasuredStates(0, 0);
                                                Object[] objArr114 = new Object[1];
                                                echo(i466, i467, i469, bitsPerPixel5, (byte) (((i470 | (-29)) << 1) - (i470 ^ (-29))), objArr114);
                                                String str38 = (String) objArr114[0];
                                                int i471 = -(-MotionEvent.axisFromString(""));
                                                int i472 = ((i471 | 17) << 1) - (i471 ^ 17);
                                                Object[] objArr115 = new Object[1];
                                                delta("⏷㲳檊薦푬돋\uda1a겹\udef7痌쵯챈ꃲ炉\ue041쌣", i472, objArr115);
                                                String str39 = (String) objArr115[0];
                                                Object[] objArr116 = new Object[1];
                                                delta("⏷㲳檊薦푬돋\uda1a겹\udef7痌쵯챈땘ꁾ棊쑖ᅍ懫", 16 - (~(-View.resolveSize(0, 0))), objArr116);
                                                String str40 = (String) objArr116[0];
                                                int i473 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                int i474 = ((i473 | 5) << 1) - (i473 ^ 5);
                                                Object[] objArr117 = new Object[1];
                                                delta("랠䗐ꃲ炉\ue041쌣", i474, objArr117);
                                                String str41 = (String) objArr117[0];
                                                int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                                int i475 = (packedPositionGroup3 & 12) + (packedPositionGroup3 | 12);
                                                Object[] objArr118 = new Object[1];
                                                delta("랠䗐녵䎭\ueedf酄煦쟹ꃲ炉\ue041쌣", i475, objArr118);
                                                String str42 = (String) objArr118[0];
                                                int i476 = -(-AndroidCharacter.getMirror('0'));
                                                int i477 = (i476 ^ (-31)) + ((i476 & (-31)) << 1);
                                                Object[] objArr119 = new Object[1];
                                                delta("랠䗐녵䎭\ueedf酄煦쟹ꃲ炉\ue041쌣賖\uedf0睳⒁ᅍ懫", i477, objArr119);
                                                String str43 = (String) objArr119[0];
                                                int trimmedLength3 = 1260728993 - TextUtils.getTrimmedLength("");
                                                int i478 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                int i479 = (i478 ^ (-104)) + ((i478 & (-104)) << 1);
                                                int i480 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                Object[] objArr120 = new Object[1];
                                                echo(trimmedLength3, i479, (i480 & (-122842178)) + (i480 | (-122842178)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 126), objArr120);
                                                String str44 = (String) objArr120[0];
                                                int i481 = -(-Color.green(0));
                                                int i482 = (i481 & 1260728993) + (i481 | 1260728993);
                                                int i483 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int i484 = (i483 & (-109)) + (i483 | (-109));
                                                char mirror2 = AndroidCharacter.getMirror('0');
                                                Object[] objArr121 = new Object[1];
                                                echo(i482, i484, (mirror2 ^ 37794) + ((mirror2 & 37794) << 1), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 89), objArr121);
                                                String str45 = (String) objArr121[0];
                                                int i485 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                int i486 = (i485 ^ 25) + ((i485 & 25) << 1);
                                                Object[] objArr122 = new Object[1];
                                                delta("랠䗐녵䎭\ueedf酄煦쟹俲풙蝍㐴ᴿဃ燬ꊙ猔淦꓂풚㴝횅ࠡ毇ᅍ懫", i486, objArr122);
                                                String str46 = (String) objArr122[0];
                                                int i487 = -Color.green(0);
                                                int i488 = ((i487 | 13) << 1) - (i487 ^ 13);
                                                Object[] objArr123 = new Object[1];
                                                delta("랠䗐녵䎭\ueedf酄煦쟹땘ꁾ棊쑖ᅍ懫", i488, objArr123);
                                                String str47 = (String) objArr123[0];
                                                int i489 = -Color.red(0);
                                                int i490 = (i489 ^ 9) + ((i489 & 9) << 1);
                                                Object[] objArr124 = new Object[1];
                                                delta("媯㨽\ue117毿䏂蝔棊쑖ᅍ懫", i490, objArr124);
                                                String str48 = (String) objArr124[0];
                                                int i491 = -View.resolveSize(0, 0);
                                                int i492 = ((i491 | 8) << 1) - (i491 ^ 8);
                                                Object[] objArr125 = new Object[1];
                                                delta("랠䗐⩽㻘ꃲ炉\ue041쌣", i492, objArr125);
                                                String[] strArr6 = {str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, (String) objArr125[0]};
                                                int i493 = 0;
                                                for (int i494 = i12; i493 < i494; i494 = 12) {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(strArr6[i493]);
                                                    int i495 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                    int i496 = ((i495 | 1260729061) << 1) - (i495 ^ 1260729061);
                                                    int i497 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int component911 = C1263t2.component9();
                                                    int i498 = i497 * 765;
                                                    int i499 = (i498 ^ 186294) + ((i498 & 186294) << 1);
                                                    int i500 = ~component911;
                                                    int i501 = ~((i500 & i497) | (i500 ^ i497));
                                                    int i502 = (((i501 ^ (-122)) | (i501 & (-122))) * 764) + i499;
                                                    String[] strArr7 = strArr6;
                                                    int i503 = ~i497;
                                                    int i504 = ~((i503 ^ (-122)) | (i503 & (-122)));
                                                    int i505 = ~component911;
                                                    int i506 = ((i504 | (~((i505 ^ (-122)) | (i505 & (-122))))) * (-1528)) + i502;
                                                    int i507 = ~i497;
                                                    int i508 = ~((i507 & (-122)) | (i507 ^ (-122)));
                                                    int i509 = ~((121 ^ i497) | (i497 & 121));
                                                    int i510 = ((i509 & i508) | (i508 ^ i509) | i501) * 764;
                                                    int i511 = (i506 ^ i510) + ((i506 & i510) << 1);
                                                    char mirror3 = AndroidCharacter.getMirror('0');
                                                    int i512 = (mirror3 ^ 37650) + ((mirror3 & 37650) << 1);
                                                    short s11 = (short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                    int i513 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                    Object[] objArr126 = new Object[1];
                                                    echo(i496, i511, i512, s11, (byte) ((i513 & (-106)) + (i513 | (-106))), objArr126);
                                                    sb2.append((String) objArr126[0]);
                                                    Object[] objArr127 = {sb2.toString()};
                                                    Object D887126 = uH18377.D8871(1565484532);
                                                    if (D887126 == null) {
                                                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 52;
                                                        int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2951;
                                                        char defaultSize3 = (char) View.getDefaultSize(0, 0);
                                                        byte b57 = (byte) 1;
                                                        byte b58 = (byte) (b57 - 1);
                                                        i25 = i493;
                                                        Object[] objArr128 = new Object[1];
                                                        charlie(b57, b58, (byte) (b58 - 1), objArr128);
                                                        D887126 = uH18377.setPivotYN16904(edgeSlop4, jumpTapTimeout4, defaultSize3, -2097887455, false, (String) objArr128[0], new Class[]{cls3});
                                                    } else {
                                                        i25 = i493;
                                                    }
                                                    long longValue16 = ((Long) ((Method) D887126).invoke(null, objArr127)).longValue();
                                                    long j124 = 860483860;
                                                    long j125 = (HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST * longValue16) + ((-419) * j124);
                                                    long j126 = 420;
                                                    long j127 = j124 ^ j11;
                                                    long j128 = ((((j127 | (longValue16 ^ j11)) ^ j11) | ((j16 | longValue16) ^ j11)) * j126) + ((-420) * (longValue16 | j127)) + (((longValue16 | j15) ^ j11) * j126) + j125 + 94670042;
                                                    int i514 = ((int) (j128 >> 32)) & ((((~(506418564 | i4)) | (~(1943644975 | i31))) * 333) + (((~(506418564 | i31)) | (~(1943644975 | i4))) * 333) + 1264599323);
                                                    int myTid2 = Process.myTid();
                                                    int i515 = ((int) j128) & ((((~((~myTid2) | 1935314780)) | (-2147139583)) * (-964)) + (((~(1935314780 | myTid2)) | (-498088371)) * (-964)) + 2109245973);
                                                    if (((i514 & i515) | (i514 ^ i515)) != 0) {
                                                        i18 = i25 + 110;
                                                        break;
                                                    }
                                                    int i516 = ((i25 | (-78)) << 1) - (i25 ^ (-78));
                                                    i493 = (i516 ^ 79) + ((i516 & 79) << 1);
                                                    strArr6 = strArr7;
                                                }
                                            }
                                        }
                                        i18 = 0;
                                        if (i18 != 0) {
                                            Object[] objArr129 = new Object[4];
                                            int[] iArr14 = new int[1];
                                            objArr129[0] = iArr14;
                                            int[] iArr15 = new int[1];
                                            objArr129[1] = iArr15;
                                            int[] iArr16 = new int[1];
                                            objArr129[2] = iArr16;
                                            int i517 = (~i18) & i4;
                                            iArr16[0] = i4;
                                            iArr15[0] = (i18 & i31) | i517;
                                            objArr129[i15] = null;
                                            int foxtrot4 = A0.z.foxtrot((~(i4 | (-317301890))) | (~(827823793 | i4)) | 44572672, -1444, ((599667248 | i31) * 1444) + 1280895393, 831943118);
                                            int i518 = (foxtrot4 ^ 16) + ((foxtrot4 & 16) << 1);
                                            int i519 = (i518 ^ i14) + ((i518 & i14) << 1);
                                            int i520 = i519 << 13;
                                            int i521 = (i519 | i520) & (~(i519 & i520));
                                            int i522 = i521 >>> 17;
                                            int i523 = (i521 | i522) & (~(i521 & i522));
                                            iArr14[0] = i523 ^ (i523 << 5);
                                            return objArr129;
                                        }
                                        long[] jArr2 = new long[1];
                                        jArr2[0] = 472001035;
                                        Object[] objArr130 = new Object[1];
                                        delta("ꮶ\ue3ab㴝횅ꄈ\ue0bf옝草鷒\ue957ݼ珈暻\ue68c彭歙鄊ᥥ", ExpandableListView.getPackedPositionChild(0L) + 18, objArr130);
                                        String str49 = (String) objArr130[0];
                                        Object[] objArr131 = new Object[4];
                                        objArr131[i15] = jArr2;
                                        objArr131[2] = 1073741823L;
                                        objArr131[1] = Integer.valueOf(i5);
                                        objArr131[0] = str49;
                                        Object D887127 = uH18377.D8871(130458176);
                                        if (D887127 == null) {
                                            int combineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 52;
                                            int indexOf14 = 2381 - TextUtils.indexOf("", "", 0);
                                            char offsetBefore = (char) (9779 - TextUtils.getOffsetBefore("", 0));
                                            byte b59 = (byte) 1;
                                            byte b60 = (byte) (b59 - 1);
                                            jArr = jArr2;
                                            Object[] objArr132 = new Object[1];
                                            charlie(b59, b60, (byte) (b60 - 1), objArr132);
                                            D887127 = uH18377.setPivotYN16904(combineMeasuredStates2, indexOf14, offsetBefore, -662896491, false, (String) objArr132[0], new Class[]{cls3, cls, Long.TYPE, long[].class});
                                        } else {
                                            jArr = jArr2;
                                        }
                                        long longValue17 = ((Long) ((Method) D887127).invoke(null, objArr131)).longValue();
                                        long j129 = -658133545;
                                        long j130 = ((-929) * longValue17) + ((-464) * j129);
                                        long j131 = j129 ^ j11;
                                        long j132 = longValue17 | j15;
                                        long j133 = (465 * (j132 | j131)) + (930 * (longValue17 | ((j131 | j15) ^ j11))) + ((-465) * (j131 | (j132 ^ j11))) + j130 + 1511620982;
                                        if (((((int) (j133 >> 32)) & (((i4 | 659522) * 54) + (((~((-1263543097) | i4)) | 659522 | (~(1263543096 | i31))) * 54) + ((((~(173683314 | i31)) | 1090519304) * (-108)) - 628851870))) | (((int) j133) & A0.z.foxtrot((~((-725493754) | i31)) | 722862680 | (~((-2132247133) | i31)), 184, (((~((-2631074) | i31)) | (~((-1409384453) | i31))) * (-184)) + 1019428157, 1975565784))) > 0) {
                                            i20 = 240;
                                        } else if (Build.VERSION.SDK_INT >= i11) {
                                            i20 = 0;
                                        } else {
                                            int i524 = -(-Process.getGidForName(""));
                                            int i525 = (i524 & 1260729038) + (i524 | 1260729038);
                                            int green3 = Color.green(0);
                                            int i526 = (green3 ^ (-119)) + ((green3 & (-119)) << 1);
                                            int i527 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                            Object[] objArr133 = new Object[1];
                                            echo(i525, i526, (i527 & (-122842143)) + (i527 | (-122842143)), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (87 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))))), objArr133);
                                            Matcher matcher = Pattern.compile((String) objArr133[0]).matcher("");
                                            int argb2 = Color.argb(0, 0, 0, 0);
                                            int i528 = ((argb2 | 6) << 1) - (argb2 ^ 6);
                                            Object[] objArr134 = new Object[1];
                                            delta("ꮶ\ue3ab㴝횅ꄈ\ue0bf", i528, objArr134);
                                            File[] listFiles = new File((String) objArr134[0]).listFiles();
                                            if ((listFiles != null ? '[' : '\"') != '\"') {
                                                november = (mike + 31) % 128;
                                                int i529 = 0;
                                                int i530 = 0;
                                                while (i529 < listFiles.length && i530 < i15) {
                                                    File file = listFiles[i529];
                                                    if (file != null && file.isDirectory() && matcher.reset(listFiles[i529].getName()).matches()) {
                                                        int i531 = ((i530 | 48) << 1) - (i530 ^ 48);
                                                        i530 = (i531 & (-47)) + (i531 | (-47));
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(listFiles[i529].getAbsolutePath());
                                                        int i532 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        fileArr = listFiles;
                                                        int i533 = ((i532 | 6) << 1) - (i532 ^ 6);
                                                        Object[] objArr135 = new Object[1];
                                                        delta("ݼ珈暻\ue68c彭歙鄊ᥥ", i533, objArr135);
                                                        sb3.append((String) objArr135[0]);
                                                        try {
                                                            bufferedInputStream2 = new BufferedInputStream(new FileInputStream(sb3.toString()));
                                                            long j134 = 0;
                                                            while (true) {
                                                                try {
                                                                    try {
                                                                        int read = bufferedInputStream2.read();
                                                                        i21 = i529;
                                                                        if (!(read != i29)) {
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                            } catch (Exception unused2) {
                                                                            }
                                                                            i22 = 0;
                                                                            break;
                                                                        }
                                                                        j134 = 1073741823 & (read ^ (j134 << i5));
                                                                        int i534 = 0;
                                                                        while (i534 < 1) {
                                                                            try {
                                                                                if (j134 == jArr[i534]) {
                                                                                    i22 = ((i534 | 1) << 1) - (i534 ^ 1);
                                                                                    try {
                                                                                        bufferedInputStream2.close();
                                                                                        break;
                                                                                    } catch (Exception unused3) {
                                                                                    }
                                                                                } else {
                                                                                    int i535 = (i534 & 79) + (i534 | 79);
                                                                                    i534 = (i535 ^ (-78)) + ((i535 & (-78)) << 1);
                                                                                }
                                                                            } catch (IOException unused4) {
                                                                                if (bufferedInputStream2 != null) {
                                                                                    try {
                                                                                        bufferedInputStream2.close();
                                                                                    } catch (Exception unused5) {
                                                                                    }
                                                                                }
                                                                                int i536 = mike;
                                                                                november = (((i536 | 83) << 1) - (i536 ^ 83)) % 128;
                                                                                i22 = -1;
                                                                                if (i22 > 0) {
                                                                                }
                                                                            }
                                                                        }
                                                                        i529 = i21;
                                                                        i29 = -1;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        bufferedInputStream = bufferedInputStream2;
                                                                        if (bufferedInputStream != null) {
                                                                            try {
                                                                                bufferedInputStream.close();
                                                                            } catch (Exception unused6) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (IOException unused7) {
                                                                    i21 = i529;
                                                                }
                                                            }
                                                        } catch (IOException unused8) {
                                                            i21 = i529;
                                                            bufferedInputStream2 = null;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            bufferedInputStream = null;
                                                        }
                                                        if (i22 > 0) {
                                                            int i537 = november;
                                                            mike = ((i537 ^ 43) + ((i537 & 43) << 1)) % 128;
                                                            i20 = 241;
                                                        }
                                                    } else {
                                                        fileArr = listFiles;
                                                        i21 = i529;
                                                    }
                                                    i529 = (i21 ^ (-120)) + ((i21 & (-120)) << 1) + 121;
                                                    listFiles = fileArr;
                                                    i29 = -1;
                                                    i15 = 3;
                                                }
                                            }
                                            i19 = 1;
                                            i20 = 0;
                                            if (i20 == 0) {
                                                Object[] objArr136 = new Object[4];
                                                int[] iArr17 = new int[i19];
                                                objArr136[0] = iArr17;
                                                int[] iArr18 = new int[i19];
                                                objArr136[i19] = iArr18;
                                                int[] iArr19 = new int[i19];
                                                objArr136[2] = iArr19;
                                                int i538 = ~(i4 & i20);
                                                iArr19[0] = i4;
                                                iArr18[0] = (i20 | i4) & i538;
                                                objArr136[3] = null;
                                                int i539 = 666910676 - (~((((~(i4 | (-8787217))) * 566) + ((((~((-99079454) | i4)) | 90292237) * (-566)) + 76320493)) + 16));
                                                int i540 = i539 << 13;
                                                int i541 = (i540 | i539) & (~(i539 & i540));
                                                int i542 = i541 ^ (i541 >>> 17);
                                                int i543 = i542 << 5;
                                                iArr17[0] = ((~i542) & i543) | ((~i543) & i542);
                                                return objArr136;
                                            }
                                            int i544 = i19;
                                            long[] jArr3 = new long[i544];
                                            jArr3[0] = 472001035;
                                            Object[] objArr137 = new Object[i544];
                                            delta("랠䗐녵䎭\ue4ae숈ࠁ㍏옝草\ufdff뼣ꕂ诂媊聄Ǽ彝\ufdff뼣긋랏", 22 - (~(-(-TextUtils.lastIndexOf("", '0')))), objArr137);
                                            try {
                                                BufferedInputStream bufferedInputStream4 = new BufferedInputStream(new FileInputStream((String) objArr137[0]));
                                                long j135 = 0;
                                                loop4: while (true) {
                                                    try {
                                                        int read2 = bufferedInputStream4.read();
                                                        if ((read2 != -1 ? NumberOnlyZipVisualTransformation.HYPHEN : 'Y') == 'Y') {
                                                            try {
                                                                bufferedInputStream4.close();
                                                            } catch (Exception unused9) {
                                                            }
                                                            i23 = 0;
                                                            break;
                                                        }
                                                        int i545 = ~(((-1301289304) & i4) | ((-1301289304) ^ i4));
                                                        int i546 = (((1090519303 ^ i545) | (i545 & 1090519303)) * (-283)) + 771839636;
                                                        int i547 = (i546 & (-1220312488)) + (i546 | (-1220312488));
                                                        int i548 = -(-((~((-210770001) | i4)) * 283));
                                                        int i549 = ((i547 | i548) << 1) - (i547 ^ i548);
                                                        int component912 = C1263t2.component9();
                                                        long[] jArr4 = jArr3;
                                                        int i550 = ~component912;
                                                        int i551 = 1076445509 | (~((1066834602 ^ i550) | (1066834602 & i550)));
                                                        int i552 = ~((-748066979) | component912);
                                                        int i553 = -(-(((i551 ^ i552) | (i551 & i552)) * (-252)));
                                                        int i554 = (((1475389466 | i553) << 1) - (1475389466 ^ i553)) - 465682316;
                                                        int i555 = (1066834602 ^ i550) | (1066834602 & i550);
                                                        int i556 = ~((i555 ^ 1395213133) | (i555 & 1395213133));
                                                        int i557 = ~(((-748066979) ^ component912) | ((-748066979) & component912));
                                                        if ((i549 > (i554 - (~(((i556 ^ i557) | (i556 & i557)) * 252))) + (-1) ? '&' : (char) 28) != 28) {
                                                            bufferedInputStream3 = bufferedInputStream4;
                                                            try {
                                                                j7 = 1073741823 | ((j135 >> i5) % read2);
                                                            } catch (IOException unused10) {
                                                                if (bufferedInputStream3 != null) {
                                                                    try {
                                                                        bufferedInputStream3.close();
                                                                    } catch (Exception unused11) {
                                                                    }
                                                                }
                                                                i23 = -1;
                                                                if (i23 > 0) {
                                                                }
                                                                if (!z10) {
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                if (bufferedInputStream3 != null) {
                                                                    try {
                                                                        bufferedInputStream3.close();
                                                                    } catch (Exception unused12) {
                                                                    }
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            bufferedInputStream3 = bufferedInputStream4;
                                                            j7 = (read2 ^ (j135 << i5)) & 1073741823;
                                                        }
                                                        j135 = j7;
                                                        for (int i558 = 0; i558 < 1; i558++) {
                                                            if (j135 == jArr4[i558]) {
                                                                i23 = i558 + 1;
                                                                try {
                                                                    bufferedInputStream3.close();
                                                                    break loop4;
                                                                } catch (Exception unused13) {
                                                                }
                                                            }
                                                        }
                                                        int i559 = november;
                                                        mike = ((i559 & 99) + (i559 | 99)) % 128;
                                                        bufferedInputStream4 = bufferedInputStream3;
                                                        jArr3 = jArr4;
                                                    } catch (IOException unused14) {
                                                        bufferedInputStream3 = bufferedInputStream4;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        bufferedInputStream3 = bufferedInputStream4;
                                                    }
                                                }
                                            } catch (IOException unused15) {
                                                bufferedInputStream3 = null;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                bufferedInputStream3 = null;
                                            }
                                            if (i23 > 0) {
                                                int i560 = november;
                                                mike = ((i560 ^ 121) + ((i560 & 121) << 1)) % 128;
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                Object[] objArr138 = {r2, new int[]{(i4 & (-243)) | (i31 & 242)}, new int[]{i4}, null};
                                                int i561 = (((~(i4 | 52366888)) | 545259600 | (~((-34737697) | i31))) * 164) + ((562888792 | i4) * 164) + ((((~((-52366889) | i31)) | 562888792) * (-328)) - 1666761517);
                                                int i562 = (i561 & 16) + (i561 | 16);
                                                int i563 = ((i562 | i14) << 1) - (i562 ^ i14);
                                                int i564 = i563 ^ (i563 << 13);
                                                int i565 = i564 >>> 17;
                                                int i566 = (i564 | i565) & (~(i564 & i565));
                                                int i567 = i566 << 5;
                                                int[] iArr20 = {(i566 | i567) & (~(i566 & i567))};
                                                return objArr138;
                                            }
                                            Object D887128 = uH18377.D8871(-30259255);
                                            if (D887128 == null) {
                                                int i568 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int lastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 3521;
                                                char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                                                byte b61 = (byte) 1;
                                                byte b62 = (byte) (b61 - 1);
                                                Object[] objArr139 = new Object[1];
                                                charlie(b61, b62, (byte) (b62 - 1), objArr139);
                                                D887128 = uH18377.setPivotYN16904(i568, lastIndexOf5, capsMode3, 562685212, false, (String) objArr139[0], new Class[0]);
                                            }
                                            long longValue18 = ((Long) ((Method) D887128).invoke(null, null)).longValue();
                                            long j136 = 31316415;
                                            long j137 = (334 * longValue18) + ((-665) * j136);
                                            long j138 = j136 ^ j11;
                                            long j139 = ((-333) * j138) + j137;
                                            long j140 = 333;
                                            long freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                            long j141 = freeMemory5 ^ j11;
                                            long j142 = (((((freeMemory5 | j138) ^ j11) | ((j141 | longValue18) ^ j11)) * j140) + (((((j138 | j141) ^ j11) | ((longValue18 | freeMemory5) ^ j11)) * j140) + j139)) - 1039156056;
                                            int foxtrot5 = ((int) (j142 >> 32)) & A0.z.foxtrot(~((~((int) Runtime.getRuntime().totalMemory())) | 2050206030), -948, (((~(2016643406 | r4)) | 841097478) * (-948)) - 583783670, -1752597428);
                                            int i569 = ((int) j142) & ((((~(1491093534 | i4)) | 142608392) * HttpConstants.HTTP_MOVED_TEMP) + ((~((-18162210) | i4)) * (-604)) + ((((~((-18162210) | i31)) | (~(1509255743 | i4))) * (-302)) - 365268013));
                                            if (((foxtrot5 & i569) | (foxtrot5 ^ i569)) != 0) {
                                                objArr = new Object[]{r2, new int[]{(i4 & (-265)) | (i31 & 264)}, new int[]{i4}, null};
                                                int i570 = (((~(1013684839 | i31)) | (-1040169592) | (~((-476678184) | i4))) * 140) + (((~((-503162936) | i31)) | 476678183) * (-280)) + (((i4 | (-503162936)) * 140) - 155820093);
                                                int i571 = ((i570 | 16) << 1) - (i570 ^ 16);
                                                int i572 = (i571 & i14) + (i571 | i14);
                                                int i573 = i572 << 13;
                                                int i574 = (i573 | i572) & (~(i572 & i573));
                                                int i575 = i574 ^ (i574 >>> 17);
                                                int i576 = i575 << 5;
                                                int i577 = ((~i575) & i576) | ((~i576) & i575);
                                                c10 = 0;
                                                int[] iArr21 = {i577};
                                            } else {
                                                Object D887129 = uH18377.D8871(-688378724);
                                                if (D887129 == null) {
                                                    int lastIndexOf6 = 51 - TextUtils.lastIndexOf("", '0', 0, 0);
                                                    int indexOf15 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2589;
                                                    char c16 = (char) (14485 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                    byte b63 = (byte) 1;
                                                    byte b64 = (byte) (b63 - 1);
                                                    Object[] objArr140 = new Object[1];
                                                    charlie(b63, b64, (byte) (b64 - 1), objArr140);
                                                    D887129 = uH18377.setPivotYN16904(lastIndexOf6, indexOf15, c16, 155422281, false, (String) objArr140[0], new Class[0]);
                                                }
                                                long longValue19 = ((Long) ((Method) D887129).invoke(null, null)).longValue();
                                                long j143 = -683119200;
                                                long j144 = -721;
                                                long j145 = j143 ^ j11;
                                                long j146 = longValue19 ^ j11;
                                                long j147 = (j143 | longValue19) ^ j11;
                                                long j148 = ((722 * (((j145 | longValue19) ^ j11) | ((j146 | j143) ^ j11))) + (((-1444) * ((j147 | ((j143 | j15) ^ j11)) | ((longValue19 | j15) ^ j11))) + ((1444 * ((j16 | ((j145 | j146) ^ j11)) | j147)) + ((j144 * longValue19) + (j144 * j143))))) - 952495432;
                                                int myPid5 = Process.myPid();
                                                int i578 = ~((-1645373953) | myPid5);
                                                int i579 = ~myPid5;
                                                int i580 = ((int) (j148 >> 32)) & ((((~(myPid5 | 1853554519)) | (~((-1645373953) | i579)) | (~((-33027) | myPid5))) * 920) + ((1645373952 | (~((-1645406979) | i579))) * 920) + (((~(i579 | 1853554519)) | i578) * 920) + 2038856378);
                                                int foxtrot6 = ((int) j148) & A0.z.foxtrot((~((~ad.tango(233748851)) | (-41974754))) | (-1370071594), 381, (((-8397346) | r3) * (-381)) - 1234801888, -1095578851);
                                                if (((i580 & foxtrot6) | (i580 ^ foxtrot6)) != 0) {
                                                    november = (mike + 63) % 128;
                                                    i24 = i4 ^ 281;
                                                } else {
                                                    i24 = i4;
                                                }
                                                if (i24 != i4) {
                                                    Object[] objArr141 = {r2, new int[]{i24}, new int[]{i4}, null};
                                                    int i581 = -(-A0.z.foxtrot((~((-381742770) | i4)) | (~(128779134 | i31)), 959, (((~((-381742770) | i31)) | (~(i4 | 128779134))) * 959) - 1563434527, i10));
                                                    int i582 = (i581 & i14) + (i581 | i14);
                                                    int i583 = i582 << 13;
                                                    int i584 = (i583 | i582) & (~(i582 & i583));
                                                    int i585 = i584 >>> 17;
                                                    int i586 = ((~i584) & i585) | ((~i585) & i584);
                                                    int i587 = i586 << 5;
                                                    int i588 = ((~i586) & i587) | ((~i587) & i586);
                                                    c10 = 0;
                                                    int[] iArr22 = {i588};
                                                    objArr = objArr141;
                                                } else {
                                                    Object D887130 = uH18377.D8871(-1380029587);
                                                    if (D887130 == null) {
                                                        int combineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 52;
                                                        int i589 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3622;
                                                        char trimmedLength4 = (char) TextUtils.getTrimmedLength("");
                                                        byte b65 = (byte) 0;
                                                        byte b66 = (byte) (b65 + 1);
                                                        Object[] objArr142 = new Object[1];
                                                        charlie(b65, b66, (byte) (b66 + 1), objArr142);
                                                        D887130 = uH18377.setPivotYN16904(combineMeasuredStates3, i589, trimmedLength4, 1912981944, false, (String) objArr142[0], new Class[0]);
                                                    }
                                                    long longValue20 = ((Long) ((Method) D887130).invoke(null, null)).longValue();
                                                    long j149 = 1560426811;
                                                    long j150 = (434 * longValue20) + ((-432) * j149);
                                                    long j151 = 433;
                                                    long j152 = j149 ^ j11;
                                                    long j153 = ((((j152 | j15) ^ j11) | ((j149 | longValue20) ^ j11)) * j151) + ((-433) * (j152 | (((longValue20 ^ j11) | j15) ^ j11))) + ((((j152 | j16) | longValue20) ^ j11) * j151) + j150 + 222560878;
                                                    int i590 = ((int) (j153 >> 32)) & (((795235167 | i4) * 220) + (((~(793133915 | i31)) | 644092495) * (-440)) + ((((~(795235167 | i31)) | 641991243) * 220) - 1287114918));
                                                    int i591 = (int) j153;
                                                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                    if ((i590 | (i591 & ((((~(elapsedCpuTime2 | (-2089817320))) | (~((~elapsedCpuTime2) | 652590909))) * 627) + (((~((-652590910) | elapsedCpuTime2)) | (-2089817320)) * (-627)) + (((2130034687 | elapsedCpuTime2) * (-627)) - 635053948)))) != 0) {
                                                        objArr = new Object[]{r2, new int[]{(~(i4 & 268)) & (i4 | 268)}, new int[]{i4}, null};
                                                        int i592 = 666910676 - (~(-(-A0.z.foxtrot((~(354183269 | i4)) | 336355365, HttpConstants.HTTP_MOVED_TEMP, ((~((-138510731) | i4)) * (-604)) + ((((~((-138510731) | i31)) | (~(492693999 | i4))) * (-302)) + 890984277), 16))));
                                                        int i593 = i592 << 13;
                                                        int i594 = (i593 | i592) & (~(i592 & i593));
                                                        int i595 = i594 >>> 17;
                                                        int i596 = (i594 | i595) & (~(i594 & i595));
                                                        c3 = 0;
                                                        int[] iArr23 = {i596 ^ (i596 << 5)};
                                                    } else {
                                                        Object D887131 = uH18377.D8871(-986684210);
                                                        if (D887131 == null) {
                                                            int threadPriority3 = 52 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                            int trimmedLength5 = 3622 - TextUtils.getTrimmedLength("");
                                                            char lastIndexOf7 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                                            byte b67 = (byte) 1;
                                                            byte b68 = (byte) (b67 - 1);
                                                            Object[] objArr143 = new Object[1];
                                                            charlie(b67, b68, (byte) (b68 - 1), objArr143);
                                                            D887131 = uH18377.setPivotYN16904(threadPriority3, trimmedLength5, lastIndexOf7, 445367835, false, (String) objArr143[0], new Class[0]);
                                                        }
                                                        long longValue21 = ((Long) ((Method) D887131).invoke(null, null)).longValue();
                                                        long j154 = 772580576;
                                                        long j155 = 306;
                                                        long j156 = (j155 * longValue21) + (j155 * j154) + 610;
                                                        long j157 = HttpConstants.HTTP_USE_PROXY;
                                                        long j158 = (j157 * ((longValue21 ^ j11) | ((j16 | j154) ^ j11))) + ((((j154 | longValue21) ^ j11) | ((j154 | j15) ^ j11)) * j157) + j156 + 205240938;
                                                        int foxtrot7 = ((int) (j158 >> 32)) & A0.z.foxtrot((~(1968133536 | i4)) | (~((-530907126) | i4)), -1324, ((1615527936 | i31) * 1324) - 818884594, -2104130148);
                                                        int romeo6 = ad.romeo();
                                                        int i597 = ((1914938740 | romeo6) * (-50)) - 75036917;
                                                        int i598 = ~((-807535713) | romeo6);
                                                        int i599 = ~romeo6;
                                                        int i600 = ((int) j158) & ((((~(i599 | 1914938740)) | (~((-942802146) | i599)) | 135266433) * 50) + (((~(i599 | (-135266434))) | i598) * 50) + i597);
                                                        if (((foxtrot7 & i600) | (foxtrot7 ^ i600)) != 0) {
                                                            objArr = new Object[]{new int[1], new int[]{i4 ^ 266}, new int[]{i4}, null};
                                                            int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                            int i601 = (((~((~elapsedCpuTime3) | 217548677)) | 292973226) * 56) + (((~(elapsedCpuTime3 | 292973226)) | 217548677) * 56) + 77424231;
                                                            int i602 = (i601 & 16) + (i601 | 16);
                                                            int i603 = ((i602 | i14) << 1) - (i602 ^ i14);
                                                            int i604 = i603 << 13;
                                                            int i605 = (i603 | i604) & (~(i603 & i604));
                                                            int i606 = i605 >>> 17;
                                                            int i607 = (i605 | i606) & (~(i605 & i606));
                                                            ((int[]) objArr[0])[0] = i607 ^ (i607 << 5);
                                                            c4 = 2;
                                                            c3 = 0;
                                                            if ((((int[]) objArr[c4])[c3] != ((int[]) objArr[1])[c3] ? ';' : (char) 21) != 21) {
                                                                return objArr;
                                                            }
                                                            Object[] objArr144 = {2};
                                                            Object D887132 = uH18377.D8871(-38624464);
                                                            if (D887132 == null) {
                                                                int i608 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53;
                                                                int resolveOpacity4 = 2847 - Drawable.resolveOpacity(0, 0);
                                                                char indexOf16 = (char) (62566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                                                                byte b69 = (byte) 1;
                                                                byte b70 = (byte) (b69 - 1);
                                                                Object[] objArr145 = new Object[1];
                                                                charlie(b69, b70, (byte) (b70 - 1), objArr145);
                                                                D887132 = uH18377.setPivotYN16904(i608, resolveOpacity4, indexOf16, 571015653, false, (String) objArr145[0], new Class[]{cls});
                                                            }
                                                            long longValue22 = ((Long) ((Method) D887132).invoke(null, objArr144)).longValue();
                                                            long j159 = 1763482950;
                                                            long j160 = j159 ^ j11;
                                                            long j161 = ((-283) * (((j160 | longValue22) ^ j11) | ((j160 | j15) ^ j11))) + ((-282) * longValue22) + (284 * j159);
                                                            long j162 = 283;
                                                            long j163 = longValue22 ^ j11;
                                                            long j164 = (j162 * (((j160 | j163) | j15) ^ j11)) + (((j163 | j159) ^ j11) * j162) + j161 + 228643816;
                                                            int tango5 = ad.tango(2100552802);
                                                            int i609 = ((int) (j164 >> 32)) & (((~((~tango5) | (-17305603))) * HttpConstants.HTTP_NOT_IMPLEMENTED) + (((~((-17305603) | tango5)) | 1082131464) * HttpConstants.HTTP_NOT_IMPLEMENTED) + 375070232);
                                                            int myTid3 = Process.myTid();
                                                            int i610 = ~myTid3;
                                                            if ((i609 | (((int) j164) & ((((~(myTid3 | (-147064365))) | (~(1288062508 | i610)) | (-1290162046)) * 676) + (((~((-149163902) | i610)) | 2099537) * 676) + ((((-2099538) | myTid3) * (-676)) - 340914063)))) == 2) {
                                                                Object[] objArr146 = {r3, new int[]{(~(i4 & 270)) & (i4 | 270)}, new int[]{i4}, null};
                                                                int i611 = ((((~(834416740 | i31)) | 586288720) * 184) + (((872300148 | i31) * 184) + 7580007)) - (-666910693);
                                                                int i612 = (i611 << 13) ^ i611;
                                                                int i613 = i612 >>> 17;
                                                                int i614 = ((~i612) & i613) | ((~i613) & i612);
                                                                int i615 = i614 << 5;
                                                                int[] iArr24 = {((~i614) & i615) | ((~i615) & i614)};
                                                                return objArr146;
                                                            }
                                                            Object D887133 = uH18377.D8871(-1225586509);
                                                            if (D887133 == null) {
                                                                int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 51;
                                                                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 2796;
                                                                char minimumFlingVelocity4 = (char) (32779 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                byte b71 = (byte) 1;
                                                                byte b72 = (byte) (b71 - 1);
                                                                Object[] objArr147 = new Object[1];
                                                                charlie(b71, b72, (byte) (b72 - 1), objArr147);
                                                                D887133 = uH18377.setPivotYN16904(resolveSizeAndState2, scrollBarSize3, minimumFlingVelocity4, 1766369894, false, (String) objArr147[0], new Class[0]);
                                                            }
                                                            long longValue23 = ((Long) ((Method) D887133).invoke(null, null)).longValue();
                                                            long j165 = -741629988;
                                                            long j166 = ((-987) * longValue23) + (989 * j165);
                                                            long j167 = 988;
                                                            long j168 = longValue23 ^ j11;
                                                            long j169 = (((((((j165 ^ j11) | j168) ^ j11) | ((j168 | j15) ^ j11)) | (((j16 | j165) | longValue23) ^ j11)) * j167) + (((-988) * (j165 | j168)) + ((((((j168 | j16) | j165) ^ j11) | (((j165 | longValue23) | j15) ^ j11)) * j167) + j166))) - 996929231;
                                                            int elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                            int i616 = ((int) (j169 >> 32)) & ((((~((-490806610) | (~elapsedRealtime3))) | 946419801) * 217) + (((~((-946419802) | elapsedRealtime3)) | 406919249) * 217) + ((((~((-490806610) | elapsedRealtime3)) | (~((-946419802) | r3))) * 217) - 417925857));
                                                            int i617 = ((int) j169) & ((((~((~((int) Runtime.getRuntime().maxMemory())) | 1996488443)) | 8736769) * 521) + (((~(1996488443 | r3)) * 521) - 905722072));
                                                            if (((i616 & i617) | (i616 ^ i617)) != 0) {
                                                                Object[] objArr148 = {new int[1], new int[]{(~(i4 & 272)) & (i4 | 272)}, new int[]{i4}, null};
                                                                int i618 = (((~(Process.myTid() | (-342313047))) | 579875456) * 196) + ((((-922188503) | r1) * (-196)) - 1836237933);
                                                                int i619 = (i618 & 16) + (i618 | 16) + 666910677;
                                                                int i620 = i619 << 13;
                                                                int i621 = (i620 & (~i619)) | ((~i620) & i619);
                                                                int i622 = i621 >>> 17;
                                                                int i623 = ((~i621) & i622) | ((~i622) & i621);
                                                                ((int[]) objArr148[0])[0] = i623 ^ (i623 << 5);
                                                                return objArr148;
                                                            }
                                                            long[] jArr5 = {624887784092251L};
                                                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int i624 = ((makeMeasureSpec2 | 17) << 1) - (makeMeasureSpec2 ^ 17);
                                                            Object[] objArr149 = new Object[1];
                                                            delta("ꮶ\ue3ab㴝횅ꄈ\ue0bf옝草鷒\ue957ݼ珈暻\ue68c彭歙鄊ᥥ", i624, objArr149);
                                                            Object[] objArr150 = {(String) objArr149[0], 3, 2251799813685247L, jArr5};
                                                            Object D887134 = uH18377.D8871(130458176);
                                                            if (D887134 == null) {
                                                                int jumpTapTimeout5 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 52;
                                                                int blue4 = 2381 - Color.blue(0);
                                                                char indexOf17 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 9780);
                                                                byte b73 = (byte) 1;
                                                                byte b74 = (byte) (b73 - 1);
                                                                Object[] objArr151 = new Object[1];
                                                                charlie(b73, b74, (byte) (b74 - 1), objArr151);
                                                                D887134 = uH18377.setPivotYN16904(jumpTapTimeout5, blue4, indexOf17, -662896491, false, (String) objArr151[0], new Class[]{cls3, cls, Long.TYPE, long[].class});
                                                            }
                                                            long longValue24 = ((Long) ((Method) D887134).invoke(null, objArr150)).longValue();
                                                            long j170 = 408385103;
                                                            long j171 = (HttpConstants.HTTP_MOVED_TEMP * longValue24) + ((-300) * j170);
                                                            long j172 = -301;
                                                            long j173 = j170 | longValue24;
                                                            long tango6 = ad.tango(327741383);
                                                            long j174 = longValue24 ^ j11;
                                                            long j175 = (301 * (j174 | (((j170 ^ j11) | tango6) ^ j11))) + ((((j174 | tango6) ^ j11) | (((tango6 ^ j11) | j170) ^ j11)) * j172) + (((j173 | tango6) ^ j11) * j172) + j171 + 445102334;
                                                            int i625 = ((int) (j175 >> 32)) & (((1921921183 | (~((-484694773) | i31))) * 56) + ((((~(1921921183 | i4)) | (-484694773)) * 56) - 486321286));
                                                            int romeo7 = ad.romeo();
                                                            int i626 = (((~(1640529241 | romeo7)) | 202769062 | (~((-203302832) | romeo7))) * (-880)) + 818884229;
                                                            int i627 = (~(1640529241 | (~romeo7))) | 203302831;
                                                            int i628 = ~(romeo7 | (-1640529242));
                                                            int i629 = i625 | (((int) j175) & ((i628 * 880) + ((i627 | i628) * (-880)) + i626));
                                                            if (i629 > 0) {
                                                                int i630 = mike;
                                                                november = ((i630 & 33) + (i630 | 33)) % 128;
                                                                Object[] objArr152 = {new int[1], new int[]{i4 ^ 275}, new int[]{i4}, null};
                                                                int myUid = Process.myUid();
                                                                int i631 = ((((~(myUid | 805203961)) | 134766601) * 130) + (((~((~myUid) | 805203961)) * 130) + 1768032913)) - (-666910693);
                                                                int i632 = i631 << 13;
                                                                int i633 = ((~i631) & i632) | ((~i632) & i631);
                                                                int i634 = i633 ^ (i633 >>> 17);
                                                                ((int[]) objArr152[0])[0] = i634 ^ (i634 << 5);
                                                                return objArr152;
                                                            }
                                                            if (i629 != -1) {
                                                                int gidForName = Process.getGidForName("");
                                                                int i635 = ((gidForName | 12) << 1) - (gidForName ^ 12);
                                                                Object[] objArr153 = new Object[1];
                                                                delta("⏷㲳ɚ\u139e媍\ue581⽗삻꼂ꛝﭏ\udbd2", i635, objArr153);
                                                                Object[] objArr154 = {(String) objArr153[0]};
                                                                Object D887135 = uH18377.D8871(-2104138125);
                                                                if (D887135 == null) {
                                                                    int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 52;
                                                                    int trimmedLength6 = TextUtils.getTrimmedLength("") + 2951;
                                                                    char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                                                    byte b75 = (byte) 0;
                                                                    byte b76 = (byte) (b75 + 1);
                                                                    Object[] objArr155 = new Object[1];
                                                                    charlie(b75, b76, (byte) (b76 + 1), objArr155);
                                                                    D887135 = uH18377.setPivotYN16904(scrollBarFadeDuration4, trimmedLength6, deadChar2, 1563346086, false, (String) objArr155[0], new Class[]{cls3});
                                                                }
                                                                long longValue25 = ((Long) ((Method) D887135).invoke(null, objArr154)).longValue();
                                                                long j176 = -546273804;
                                                                long j177 = -751;
                                                                long j178 = j176 ^ j11;
                                                                long j179 = longValue25 ^ j11;
                                                                long j180 = j178 | longValue25;
                                                                long j181 = ((752 * ((j180 ^ j11) | ((j179 | j176) ^ j11))) + (((-1504) * ((j180 | j15) ^ j11)) + ((1504 * (((j178 | j179) ^ j11) | ((j178 | j15) ^ j11))) + ((j177 * longValue25) + (j177 * j176))))) - 683346726;
                                                                int i636 = ((int) (j181 >> 32)) & ((((~((~ad.tango(1482222899)) | 147187290)) | (-1593179744)) * (-964)) + ((((~(147187290 | r4)) | (-1584413702)) * (-964)) - 1378819994));
                                                                int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                                                int i637 = ((int) j181) & (((~((~elapsedCpuTime4) | 891874309)) * 184) + ((elapsedCpuTime4 | 354976769) * (-184)) + ((((~((-545352101) | r4)) | 8454560) * 184) - 2101649395));
                                                                if (((i636 & i637) | (i636 ^ i637)) != 0) {
                                                                    int i638 = november;
                                                                    int i639 = (i638 ^ 111) + ((i638 & 111) << 1);
                                                                    mike = i639 % 128;
                                                                    if (i639 % 2 == 0) {
                                                                        z11 = true;
                                                                        if (!z11) {
                                                                            Object[] objArr156 = {r2, new int[]{(~(i4 & 276)) & (i4 | 276)}, new int[]{i4}, null};
                                                                            int foxtrot8 = A0.z.foxtrot((~(i4 | 217912109)) | 285264898, 464, (((-7344897) | i4) * (-464)) + (((~((-292609795) | i31)) | 285264898 | (~(i31 | 217912109))) * 464) + 210534431, 16);
                                                                            int i640 = (foxtrot8 ^ 666910677) + ((foxtrot8 & 666910677) << 1);
                                                                            int i641 = i640 << 13;
                                                                            int i642 = (i641 & (~i640)) | ((~i641) & i640);
                                                                            int i643 = i642 >>> 17;
                                                                            int i644 = (i642 | i643) & (~(i642 & i643));
                                                                            int[] iArr25 = {i644 ^ (i644 << 5)};
                                                                            return objArr156;
                                                                        }
                                                                        Object D887136 = uH18377.D8871(-1450000215);
                                                                        if (D887136 == null) {
                                                                            int deadChar3 = 52 - KeyEvent.getDeadChar(0, 0);
                                                                            int modifierMetaStateMask3 = 2639 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                                            char blue5 = (char) (23984 - Color.blue(0));
                                                                            byte b77 = (byte) 1;
                                                                            byte b78 = (byte) (b77 - 1);
                                                                            Object[] objArr157 = new Object[1];
                                                                            charlie(b77, b78, (byte) (b78 - 1), objArr157);
                                                                            D887136 = uH18377.setPivotYN16904(deadChar3, modifierMetaStateMask3, blue5, 1982423676, false, (String) objArr157[0], new Class[0]);
                                                                        }
                                                                        long longValue26 = ((Long) ((Method) D887136).invoke(null, null)).longValue();
                                                                        long j182 = -1576985153;
                                                                        long j183 = ((-215) * longValue26) + (217 * j182);
                                                                        long j184 = 216;
                                                                        long tango7 = ad.tango(1801886877);
                                                                        long j185 = tango7 ^ j11;
                                                                        long j186 = (j184 * (longValue26 | ((j185 | j182) ^ j11))) + ((-216) * (j182 | (longValue26 ^ j11) | j185)) + (((j182 | tango7) ^ j11) * j184) + j183 + 2119156597;
                                                                        int foxtrot9 = ((int) (j186 >> 32)) & A0.z.foxtrot((~(((int) Process.getElapsedCpuTime()) | 2140057445)) | 4214922, 490, ((2144272367 | (~r2)) * (-490)) - 1679179898, -522433162);
                                                                        int romeo8 = ad.romeo();
                                                                        if ((foxtrot9 | (((int) j186) & ((((~((~romeo8) | (-922766453))) | 67108884) * (-964)) + ((((~((-922766453) | romeo8)) | (-1934974434)) * (-964)) + 2046822429)))) == 0) {
                                                                            Object D887137 = uH18377.D8871(47451215);
                                                                            if (D887137 == null) {
                                                                                int i645 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 51;
                                                                                int lastIndexOf8 = TextUtils.lastIndexOf("", '0', 0) + 1261;
                                                                                char size2 = (char) View.MeasureSpec.getSize(0);
                                                                                byte b79 = (byte) 1;
                                                                                byte b80 = (byte) (b79 - 1);
                                                                                Object[] objArr158 = new Object[1];
                                                                                charlie(b79, b80, (byte) (b80 - 1), objArr158);
                                                                                D887137 = uH18377.setPivotYN16904(i645, lastIndexOf8, size2, -579883366, false, (String) objArr158[0], new Class[0]);
                                                                            }
                                                                            long longValue27 = ((Long) ((Method) D887137).invoke(null, null)).longValue();
                                                                            long j187 = -380420843;
                                                                            long j188 = 130;
                                                                            long j189 = longValue27 ^ j11;
                                                                            long j190 = ((((j189 | j16) | j187) ^ j11) * j188) + (131 * longValue27) + ((-129) * j187);
                                                                            long j191 = j189 | j187;
                                                                            long j192 = (j188 * ((((j187 ^ j11) | longValue27) ^ j11) | (j11 ^ (j191 | j15)))) + ((-260) * (j191 ^ j11)) + j190 + 402922619;
                                                                            int i646 = ((int) (j192 >> 32)) & ((((~((-412026152) | i4)) | 1849252562) * 519) + (((~((-134807555) | i31)) | (~((-277218598) | i4))) * (-519)) + ((((~((-1849252563) | i31)) | (-412026152)) * 519) - 1453938172));
                                                                            int foxtrot10 = ((int) j192) & A0.z.foxtrot(~(871846761 | i31), -948, (((~(603390560 | i4)) | 833835849) * (-948)) - 2018424535, -1093409032);
                                                                            if (((i646 & foxtrot10) | (i646 ^ foxtrot10)) != 0) {
                                                                                Object[] objArr159 = {new int[1], new int[]{(~(i4 & 279)) & (i4 | 279)}, new int[]{i4}, null};
                                                                                int myUid2 = Process.myUid();
                                                                                int i647 = (((~(myUid2 | 338224131)) | (~((~myUid2) | (-1025))) | (-510520880)) * 717) + (((((~(r2 | 338224131)) | (-510520880)) | (~((-1025) | myUid2))) * 717) - 825394733);
                                                                                int i648 = (i647 ^ 16) + ((i647 & 16) << 1);
                                                                                int i649 = (i648 & 666910677) + (i648 | 666910677);
                                                                                int i650 = i649 << 13;
                                                                                int i651 = ((~i649) & i650) | ((~i650) & i649);
                                                                                int i652 = i651 >>> 17;
                                                                                int i653 = (i651 | i652) & (~(i651 & i652));
                                                                                int i654 = i653 << 5;
                                                                                ((int[]) objArr159[0])[0] = (i653 | i654) & (~(i653 & i654));
                                                                                return objArr159;
                                                                            }
                                                                            Object[] objArr160 = {Integer.valueOf(i4), obj, 666910677, Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)};
                                                                            Object D887138 = uH18377.D8871(-1078133633);
                                                                            if (D887138 == null) {
                                                                                D887138 = uH18377.setPivotYN16904(52 - (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 2484, (char) TextUtils.indexOf("", ""), 1611095722, false, null, new Class[]{cls, (Class) uH18377.charlie((char) (KeyEvent.getDeadChar(0, 0) + 18791), (ViewConfiguration.getJumpTapTimeout() >> 16) + 52, (ViewConfiguration.getPressedStateDuration() >> 16) + 2536), cls, cls});
                                                                            }
                                                                            Object newInstance = ((Constructor) D887138).newInstance(objArr160);
                                                                            try {
                                                                                int i655 = 1260729051 - (~(-TextUtils.indexOf("", "")));
                                                                                int i656 = -TextUtils.getCapsMode("", 0, 0);
                                                                                int i657 = (i656 ^ (-109)) + ((i656 & (-109)) << 1);
                                                                                int i658 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                                int i659 = (i658 & (-122842139)) + (i658 | (-122842139));
                                                                                int i660 = -MotionEvent.axisFromString("");
                                                                                int component913 = C1263t2.component9();
                                                                                int i661 = i660 * (-1939);
                                                                                int i662 = ((i661 | (-971)) << 1) - (i661 ^ (-971));
                                                                                int i663 = ~i660;
                                                                                int i664 = ~component913;
                                                                                int i665 = ~(i664 | (~i664));
                                                                                int i666 = ((i665 & i663) | (i663 ^ i665)) * (-970);
                                                                                int i667 = (i662 ^ i666) + ((i666 & i662) << 1);
                                                                                int i668 = ~i660;
                                                                                int i669 = (~((~i668) | i668)) * 1940;
                                                                                Object[] objArr161 = new Object[1];
                                                                                echo(i655, i657, i659, (short) (((~i668) * 970) + (((i667 | i669) << 1) - (i669 ^ i667))), (byte) ((-75) - (~(-(-(ViewConfiguration.getTapTimeout() >> 16))))), objArr161);
                                                                                Class<?> cls4 = Class.forName((String) objArr161[0]);
                                                                                int i670 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                                                int i671 = (i670 ^ 1260729060) + ((i670 & 1260729060) << 1);
                                                                                int i672 = (-119) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                int axisFromString2 = MotionEvent.axisFromString("") - 122842122;
                                                                                int i673 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                                                int component914 = C1263t2.component9();
                                                                                int i674 = i673 * 569;
                                                                                int i675 = ((i674 | 569) << 1) - (i674 ^ 569);
                                                                                int i676 = ~i673;
                                                                                int i677 = (i676 ^ (-2)) | (i676 & (-2));
                                                                                int i678 = ~i677;
                                                                                int i679 = ~component914;
                                                                                int i680 = ~((i676 ^ i679) | (i676 & i679));
                                                                                int i681 = (i678 & i680) | (i678 ^ i680);
                                                                                int i682 = ~(((-2) & i679) | ((-2) ^ i679));
                                                                                int i683 = -(-(((i681 & i682) | (i681 ^ i682)) * (-1136)));
                                                                                int i684 = (i675 & i683) + (i675 | i683);
                                                                                int i685 = ~((i676 & component914) | (i676 ^ component914));
                                                                                int i686 = ~(((-2) & component914) | ((-2) ^ component914));
                                                                                int i687 = (i685 & i686) | (i685 ^ i686);
                                                                                int i688 = ~((i679 ^ i673) | (i679 & i673) | 1);
                                                                                int i689 = (i684 - (~(-(-(((i687 & i688) | (i687 ^ i688)) * (-568)))))) - 1;
                                                                                int i690 = ~((i673 & i679) | (i679 ^ i673));
                                                                                int i691 = ~(i679 | 1);
                                                                                int i692 = (i690 & i691) | (i690 ^ i691);
                                                                                int i693 = ~((component914 & i677) | (i677 ^ component914));
                                                                                int i694 = -(-(((i692 & i693) | (i692 ^ i693)) * Smooth$Close.expectedVersionCode));
                                                                                Object[] objArr162 = new Object[1];
                                                                                echo(i671, i672, axisFromString2, (short) ((i689 & i694) + (i694 | i689)), (byte) (TextUtils.getOffsetAfter("", 0) - 84), objArr162);
                                                                                cls4.getMethod((String) objArr162[0], null).invoke(newInstance, null);
                                                                                Object[] objArr163 = {new int[1], new int[]{i4}, new int[]{i4}, null};
                                                                                int myPid6 = Process.myPid();
                                                                                int i695 = ((((~((-634145037) | myPid6)) | 545261824) | (~(123623132 | myPid6))) * (-880)) - 1201769537;
                                                                                int i696 = (~((-634145037) | (~myPid6))) | (-123623133);
                                                                                int i697 = ~(myPid6 | 634145036);
                                                                                int i698 = 666910676 - (~((i697 * 880) + (((i696 | i697) * (-880)) + i695)));
                                                                                int i699 = (i698 << 13) ^ i698;
                                                                                int i700 = i699 >>> 17;
                                                                                int i701 = (i699 | i700) & (~(i699 & i700));
                                                                                int i702 = i701 << 5;
                                                                                ((int[]) objArr163[0])[0] = ((~i701) & i702) | ((~i702) & i701);
                                                                                return objArr163;
                                                                            } catch (Throwable th9) {
                                                                                Throwable cause4 = th9.getCause();
                                                                                if (cause4 != null) {
                                                                                    throw cause4;
                                                                                }
                                                                                throw th9;
                                                                            }
                                                                        }
                                                                        Object[] objArr164 = {new int[1], new int[]{(~(i4 & 273)) & (i4 | 273)}, new int[]{i4}, null};
                                                                        int tango8 = ad.tango(1000777115);
                                                                        int i703 = (((~((~tango8) | (-12736060))) | 4211723) * (-964)) + (((~((-12736060) | tango8)) | (-497785845)) * (-964)) + 1073963463;
                                                                        int i704 = (i703 & 16) + (i703 | 16) + 666910677;
                                                                        int i705 = i704 << 13;
                                                                        int i706 = (i705 | i704) & (~(i704 & i705));
                                                                        int i707 = i706 >>> 17;
                                                                        int i708 = (i706 | i707) & (~(i706 & i707));
                                                                        int i709 = i708 << 5;
                                                                        ((int[]) objArr164[0])[0] = ((~i708) & i709) | ((~i709) & i708);
                                                                        return objArr164;
                                                                    }
                                                                }
                                                                z11 = false;
                                                                if (!z11) {
                                                                }
                                                            } else {
                                                                Object[] objArr165 = {r2, new int[]{(~(i4 & 277)) & (i4 | 277)}, new int[]{i4}, null};
                                                                int i710 = 666910676 - (~(-(-A0.z.foxtrot((-805763930) | i31, 754, (((~(i4 | (-268437770))) | (~((-26804257) | i31))) * (-754)) + (((((~((-805763930) | i4)) | 268437769) | (~((-295242026) | i4))) * (-754)) + 1740323845), 16))));
                                                                int i711 = i710 << 13;
                                                                int i712 = (i711 & (~i710)) | ((~i711) & i710);
                                                                int i713 = i712 >>> 17;
                                                                int i714 = ((~i712) & i713) | ((~i713) & i712);
                                                                int[] iArr26 = {i714 ^ (i714 << 5)};
                                                                return objArr165;
                                                            }
                                                        } else {
                                                            Object D887139 = uH18377.D8871(-317201951);
                                                            if (D887139 == null) {
                                                                int i715 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                                                                int keyRepeatDelay2 = 1311 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                char keyRepeatDelay3 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28022);
                                                                byte b81 = (byte) 1;
                                                                byte b82 = (byte) (b81 - 1);
                                                                Object[] objArr166 = new Object[1];
                                                                charlie(b81, b82, (byte) (b82 - 1), objArr166);
                                                                D887139 = uH18377.setPivotYN16904(i715, keyRepeatDelay2, keyRepeatDelay3, 850150196, false, (String) objArr166[0], new Class[0]);
                                                            }
                                                            long longValue28 = ((Long) ((Method) D887139).invoke(null, null)).longValue();
                                                            long j193 = -924174475;
                                                            long j194 = (591 * longValue28) + ((-589) * j193);
                                                            long j195 = 590;
                                                            long j196 = longValue28 ^ j11;
                                                            long j197 = ((j196 | j16) ^ j11) | ((j196 | j193) ^ j11) | ((j16 | j193) ^ j11);
                                                            long j198 = j193 ^ j11;
                                                            long j199 = (((((j198 | j16) ^ j11) | ((j16 | longValue28) ^ j11)) * j195) + (((-1180) * j197) + (((j197 | (((j198 | longValue28) | j15) ^ j11)) * j195) + j194))) - 772985489;
                                                            int i716 = ((int) (j199 >> 32)) & (((~((-5373955) | i31)) * HttpConstants.HTTP_NOT_IMPLEMENTED) + (((~((-5373955) | i4)) | 620777544) * HttpConstants.HTTP_NOT_IMPLEMENTED) + 1267938520);
                                                            int myPid7 = Process.myPid();
                                                            int i717 = ((int) j199) & ((((~((~myPid7) | 924624919)) | (-1933115967)) * 168) + (((-2000529984) | (~(924624919 | myPid7))) * (-168)) + ((((~((-1933115967) | myPid7)) | 857210902) * 336) - 501357939));
                                                            if (((i716 & i717) | (i716 ^ i717)) != 0) {
                                                                objArr = new Object[]{r2, new int[]{(i4 & (-281)) | (i31 & 280)}, new int[]{i4}, null};
                                                                int i718 = (((-233799236) | (~(i31 | 276722668))) * 168) + (((~(i4 | 276722668)) | (-503283696)) * (-168)) + (((~((-233799236) | i4)) | 7238208) * 336) + 642188119;
                                                                int i719 = ((i718 | 16) << 1) - (i718 ^ 16);
                                                                int i720 = (i719 ^ i14) + ((i719 & i14) << 1);
                                                                int i721 = i720 << 13;
                                                                int i722 = (i720 | i721) & (~(i720 & i721));
                                                                int i723 = i722 ^ (i722 >>> 17);
                                                                c3 = 0;
                                                                int[] iArr27 = {i723 ^ (i723 << 5)};
                                                            } else {
                                                                objArr = new Object[]{new int[1], new int[]{i4}, new int[]{i4}, null};
                                                                int freeMemory6 = (int) Runtime.getRuntime().freeMemory();
                                                                int foxtrot11 = A0.z.foxtrot((~((~freeMemory6) | (-190055162))) | 407760335, 262, (((~((-190055162) | freeMemory6)) | 407760335) * 262) + 1015607643, i14);
                                                                int i724 = foxtrot11 ^ (foxtrot11 << 13);
                                                                int i725 = i724 ^ (i724 >>> 17);
                                                                int i726 = i725 << 5;
                                                                c3 = 0;
                                                                ((int[]) objArr[0])[0] = ((~i725) & i726) | ((~i726) & i725);
                                                            }
                                                        }
                                                    }
                                                    c4 = 2;
                                                    if ((((int[]) objArr[c4])[c3] != ((int[]) objArr[1])[c3] ? ';' : (char) 21) != 21) {
                                                    }
                                                }
                                            }
                                            c3 = c10;
                                            c4 = 2;
                                            if ((((int[]) objArr[c4])[c3] != ((int[]) objArr[1])[c3] ? ';' : (char) 21) != 21) {
                                            }
                                        }
                                        i19 = 1;
                                        if (i20 == 0) {
                                        }
                                    }
                                    i17 = 0;
                                    if (i17 != 0) {
                                    }
                                } catch (Throwable th10) {
                                    Throwable cause5 = th10.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th10;
                                }
                            }
                        }
                        i17 = i26;
                        if (i17 != 0) {
                        }
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        } catch (Throwable th11) {
            Throwable cause6 = th11.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th11;
        }
    }
}
