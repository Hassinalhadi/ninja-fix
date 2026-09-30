package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
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
import com.SecurityGuardBrige.SmoothBlocade.Smooth$Close;
import com.zendesk.service.HttpConstants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1206f0 {
    public static final long charlie;
    public static final int delta;
    public static final char echo;
    public static final int foxtrot;
    public static final int golf;
    public static final int hotel;
    public static final byte[] india;
    public static int juliet;
    public static int kilo;
    public static final byte[] lima = null;
    public static final int mike = 0;
    public static int november;
    public static int oscar;
    public static final byte[] papa = null;
    public static final int quebec = 0;
    public final PackageManager alpha;
    public final String bravo;

    static {
        golf();
        november = 0;
        oscar = 1;
        foxtrot();
        juliet = 0;
        kilo = 1;
        charlie = 2988085957400289853L;
        delta = -1053990339;
        echo = (char) 39580;
        foxtrot = -907769473;
        golf = -185414996;
        hotel = 880459952;
        india = new byte[]{-65, -121, -105, -65, -111, 113, 100, 111, 108, 114, 105, 98, 100, 122, 116, 104, -104, 107, 114, 120, 110, 100, 125, -74, 40, 97, 120, 104, 115, 111, -84, 51, -104, 71, -104, 124, 116, 107, -85, 54, 116, -72, -19, 96, -80, -93, -88, -77, -87, -69, -38, -76, -88, -2, 96, -80, -74, -87, -12, 114, -94, -78, -84, -13, 101, -122, -90, -1, -118, -67, -126, -115, -125, -107, -76, -114, -126, -55, 64, -114, 44, 86, 44, 94, 33, 32, 39, -55, -59, -55, -52, -15, 27, 23, -27, 20, 25, 31, -27, 21, -9, 23, -22, -27, 24, Byte.MIN_VALUE, -85, -119, -85, -122, -125, -72, -121, -76, -121, -127, -121, -70, 31, -32, 31, 27, 17, -22, 77, -33, -73, -88, -38, -124, -88, -17, 114, -92, -126, -40, -68, -94, -78, -92, -121, 120, -103, 71, 97, 118, 118, 69, 114, 52, 84, 66, 123, 64, 112, 71, 71, 82, 67, -9, -60, -13, -10, -60, -2, -63, -31, -7, -62, -13, -50, -9, -57, -1, -59, -11, -51, -54, -4, -22, -61, -52, -3, -56, -15, -63, 38, -102, -100, -88, 89, -97, 118, 102, 97, -99, -37, 94, 47, 81, 87, 36, 87, 98, -27, 81, 85, 83, 91, 85, 46, -112, 24, 75, 101, 24, 38, 82, -112, 49, 8, 56, 3, 63, 125, -12, -10, 2, -77, -23, -64, -16, -5, -9, 53, -69, -67, -98, -1, 70, -68, -105, -121, -114, -70, -8, -110, -108, -96, 90, -112, -120, 101, -106, 108, -44, -7, -5, -45, 6, -105, -73, -52, 120, 125, 126, -125, 51, 65, 122, 77, 106, -115, 6, 68, -103, -108, -109, -115, -112, -102, -107, -127, 106, -72, -86, -81, -91, -95, -88, -96, -121, -81, -32, 102, -72, -82, -32, 119, -90, -74, -96, -10, -28, -24, -10, -24, -24, -61, -19, -10, -11, 42, -77, -16, -20, 45, -80, -23, -32, -4, -23, -27, -3, 81, -119, -102, 96, -111, -37, 74, 107, -127, -101, -93, 96, -92, -90, -66, -27, -69, -6, -29, 7, -1, -79, -11, -9, 3, -80, -10, -63, -15, -8, -12, 50, 116, -69, -79, -120, -77, -65, -78, -121, -61, 125, -79, -77, -49, 124, -78, -115, -67, -124, -80, -2, 17, 85, 87, 40, -119, 11, 33, -110, 16, 86, 33, 81, 88, 84, -110, 112, -76, -74, -117, -24, 115, -87, Byte.MIN_VALUE, -80, -69, -73, -11, 87, -117, -115, -39, 94, -106, -56, 24, 17, -30, 17, 29, 89, -46, -27, 16, -19, 95, -41, -17, -26, 29, 90, -47, 7, 31, -18, -42, 106, -126, -67, -80, -15, 58, 44, 52, 0, 51, 111, -3, 37, 53, 121, 63, 6, 15, 52, 46, 80, -13, 5, 41, 1, 120, -23, 23, 33, 3, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103, -103};
    }

    public C1206f0(PackageManager packageManager, String str) {
        this.alpha = packageManager;
        this.bravo = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String alpha(byte b2, short s3, short s9) {
        int i4;
        int i5 = s3 * 2;
        int i10 = 3 - (s9 * 4);
        int i11 = b2 + 97;
        byte[] bArr = new byte[i5 + 1];
        byte[] bArr2 = papa;
        if (bArr2 == null) {
            int i12 = i5;
            i4 = 0;
            i11 += -i12;
            bArr[i4] = (byte) i11;
            if (i4 == i5) {
                return new String(bArr, 0);
            }
            i4++;
            i10++;
            i12 = bArr2[i10];
            i11 += -i12;
            bArr[i4] = (byte) i11;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr[i4] = (byte) i11;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(byte b2, short s3, int i4, Object[] objArr) {
        int i5;
        int i10 = (i4 * 3) + 4;
        int i11 = b2 * 3;
        int i12 = 99 - s3;
        byte[] bArr = new byte[4 - i11];
        int i13 = 3 - i11;
        byte[] bArr2 = lima;
        if (bArr2 == null) {
            int i14 = i13;
            int i15 = 0;
            i12 = i12 + (-i14) + 6;
            i10++;
            i5 = i15;
            bArr[i5] = (byte) i12;
            i15 = i5 + 1;
            if (i5 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i14 = bArr2[i10];
            i12 = i12 + (-i14) + 6;
            i10++;
            i5 = i15;
            bArr[i5] = (byte) i12;
            i15 = i5 + 1;
            if (i5 == i13) {
            }
        } else {
            i5 = 0;
            bArr[i5] = (byte) i12;
            i15 = i5 + 1;
            if (i5 == i13) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.cs] */
    public static void charlie(char c3, int i4, String str, String str2, Object[] objArr) {
        char[] charArray;
        int i5;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        oscar = (november + 59) % 128;
        char[] charArray2 = str2.toCharArray();
        int i16 = november + 87;
        oscar = i16 % 128;
        if (i16 % 2 == 0) {
            charArray = str.toCharArray();
            int i17 = 55 / 0;
        } else {
            charArray = str.toCharArray();
        }
        oscar = (november + 67) % 128;
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        ?? obj = new Object();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray2, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c3);
        cArr2[2] = (char) (cArr2[2] + ((char) i4));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        obj.component5 = 0;
        oscar = (november + 117) % 128;
        while (obj.component5 < length3) {
            oscar = (november + 43) % 128;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[i15] = obj;
                Object D8871 = uH18377.D8871(227711276);
                if (D8871 == null) {
                    int scrollDefaultDelay = 52 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int indexOf = TextUtils.indexOf("", "") + 2640;
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 23984);
                    i5 = i13;
                    byte b2 = (byte) i15;
                    i10 = i15;
                    String alpha = alpha((byte) 23, b2, b2);
                    Class[] clsArr = new Class[i14];
                    clsArr[i10] = Object.class;
                    D8871 = uH18377.setPivotYN16904(scrollDefaultDelay, indexOf, edgeSlop, -769049607, false, alpha, clsArr);
                } else {
                    i5 = i13;
                    i10 = i15;
                }
                int intValue = ((Integer) ((Method) D8871).invoke(null, objArr2)).intValue();
                Object[] objArr3 = new Object[i14];
                objArr3[i10] = obj;
                Object D88712 = uH18377.D8871(1974380961);
                if (D88712 == null) {
                    int i18 = i10;
                    int lastIndexOf = 50 - TextUtils.lastIndexOf("", '0', i18, i18);
                    int capsMode = TextUtils.getCapsMode("", i18, i18) + 3469;
                    char blue = (char) (54087 - Color.blue(i18));
                    byte b4 = (byte) i18;
                    String alpha2 = alpha((byte) (quebec & 28), b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i18] = Object.class;
                    D88712 = uH18377.setPivotYN16904(lastIndexOf, capsMode, blue, -1441461388, false, alpha2, clsArr2);
                }
                int intValue2 = ((Integer) ((Method) D88712).invoke(null, objArr3)).intValue();
                int i19 = cArr[obj.component5 % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i5] = Integer.valueOf(cArr2[intValue]);
                objArr4[1] = Integer.valueOf(i19);
                objArr4[0] = obj;
                Object D88713 = uH18377.D8871(-1713517298);
                Class cls = Integer.TYPE;
                if (D88713 == null) {
                    int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51;
                    int i21 = 2228 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    j5 = 0;
                    char green = (char) (16952 - Color.green(0));
                    i11 = intValue2;
                    byte b6 = (byte) 0;
                    String alpha3 = alpha((byte) 22, b6, b6);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[0] = Object.class;
                    clsArr3[1] = cls;
                    clsArr3[i5] = cls;
                    D88713 = uH18377.setPivotYN16904(i20, i21, green, 1181118427, false, alpha3, clsArr3);
                } else {
                    i11 = intValue2;
                    j5 = 0;
                }
                ((Method) D88713).invoke(null, objArr4);
                int i22 = cArr[i11] * 32718;
                Object[] objArr5 = new Object[i5];
                objArr5[1] = Integer.valueOf(cArr2[intValue]);
                objArr5[0] = Integer.valueOf(i22);
                Object D88714 = uH18377.D8871(-510148489);
                if (D88714 == null) {
                    byte b10 = (byte) 0;
                    i12 = 2;
                    D88714 = uH18377.setPivotYN16904(TextUtils.getCapsMode("", 0, 0) + 52, (SystemClock.elapsedRealtimeNanos() > j5 ? 1 : (SystemClock.elapsedRealtimeNanos() == j5 ? 0 : -1)) + 3725, (char) (54864 - TextUtils.indexOf("", "", 0, 0)), 1043096226, false, alpha((byte) 21, b10, b10), new Class[]{cls, cls});
                } else {
                    i12 = 2;
                }
                cArr2[i11] = ((Character) ((Method) D88714).invoke(null, objArr5)).charValue();
                cArr[i11] = obj.component9;
                int i23 = obj.component5;
                cArr3[i23] = (char) ((((r0 ^ r5[i23]) ^ (charlie ^ 2988085957400289853L)) ^ ((int) (delta ^ 2988085957400289853L))) ^ ((char) (echo ^ 2988085957400289853L)));
                obj.component5 = i23 + 1;
                i13 = i12;
                i14 = 1;
                i15 = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x018c, code lost:
    
        if (r14 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a4, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1206f0.oscar = (r2 + 107) % 128;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019a, code lost:
    
        if (r14 != false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0285  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.fingerprintjs.android.fpjs_pro_internal.dc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void delta(int i4, int i5, int i10, short s3, byte b2, Object[] objArr) {
        boolean z2;
        int i11;
        int i12;
        byte[] bArr;
        boolean z10;
        int i13;
        int i14;
        byte[] bArr2;
        int i15;
        int i16 = 0;
        int i17 = 1;
        int i18 = golf;
        ?? obj = new Object();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i5), Integer.valueOf(i18)};
            Object D8871 = uH18377.D8871(-744701904);
            Class cls = Integer.TYPE;
            if (D8871 == null) {
                D8871 = uH18377.setPivotYN16904(52 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 900, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 203907813, false, "b", new Class[]{cls, cls});
            }
            int intValue = ((Integer) ((Method) D8871).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i19 = foxtrot;
            byte[] bArr3 = india;
            if (z2) {
                int i20 = oscar + 13;
                november = i20 % 128;
                if (i20 % 2 == 0) {
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        bArr2 = new byte[length];
                        int i21 = 0;
                        while (i21 < length) {
                            Object[] objArr3 = new Object[i17];
                            objArr3[i16] = Integer.valueOf(bArr3[i21]);
                            Object D88712 = uH18377.D8871(-1890361829);
                            if (D88712 == null) {
                                int pressedStateDuration = 52 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int tapTimeout = 1363 - (ViewConfiguration.getTapTimeout() >> 16);
                                char resolveSizeAndState = (char) View.resolveSizeAndState(i16, i16, i16);
                                i15 = i16;
                                byte b4 = (byte) (quebec & 7);
                                byte b6 = (byte) (b4 - 3);
                                String alpha = alpha(b4, b6, b6);
                                Class[] clsArr = new Class[1];
                                clsArr[i15] = cls;
                                D88712 = uH18377.setPivotYN16904(pressedStateDuration, tapTimeout, resolveSizeAndState, 1357446350, false, alpha, clsArr);
                            } else {
                                i15 = i16;
                            }
                            bArr2[i21] = ((Byte) ((Method) D88712).invoke(null, objArr3)).byteValue();
                            i21++;
                            i16 = i15;
                            i17 = 1;
                        }
                    } else {
                        bArr2 = bArr3;
                    }
                    int i22 = i16;
                    bArr2.getClass();
                    oscar = (november + 91) % 128;
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = Integer.valueOf(i19);
                    objArr4[i22] = Integer.valueOf(i10);
                    Object D88713 = uH18377.D8871(-744701904);
                    if (D88713 == null) {
                        int i23 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 899;
                        char lastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i22, i22) + 1);
                        Class[] clsArr2 = new Class[2];
                        clsArr2[i22] = cls;
                        clsArr2[1] = cls;
                        D88713 = uH18377.setPivotYN16904(i23, minimumFlingVelocity, lastIndexOf, 203907813, false, "b", clsArr2);
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) D88713).invoke(null, objArr4)).intValue()] ^ (-2360518458473264487L))) + ((int) (i18 ^ (-2360518458473264487L))));
                } else {
                    throw null;
                }
            }
            if (intValue > 0) {
                int i24 = oscar + 75;
                int i25 = i24 % 128;
                november = i25;
                if (i24 % 2 != 0) {
                    i11 = ((i10 * intValue) % 5) * ((int) (i19 - 2360518458473264487L));
                } else {
                    i11 = ((i10 + intValue) - 2) + ((int) (i19 ^ (-2360518458473264487L)));
                }
                obj.setPivotYN16904 = i11 + i12;
                Object[] objArr5 = {obj, Integer.valueOf(i4), Integer.valueOf(hotel), sb2};
                Object D88714 = uH18377.D8871(-1800594158);
                if (D88714 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    D88714 = uH18377.setPivotYN16904(KeyEvent.normalizeMetaState(0) + 52, View.combineMeasuredStates(0, 0) + 2744, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1259782087, false, alpha(b10, b11, b11), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) D88714).invoke(null, objArr5)).append(obj.component9);
                obj.vD14832N6715 = obj.component9;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    for (int i26 = 0; i26 < length2; i26++) {
                        bArr[i26] = (byte) (bArr3[i26] ^ (-2360518458473264487L));
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj.D8871 = 1;
                november = (oscar + 11) % 128;
                while (obj.D8871 < intValue) {
                    int i27 = oscar + 97;
                    int i28 = i27 % 128;
                    november = i28;
                    if (i27 % 2 != 0) {
                        int i29 = 39 / 0;
                        if (!z10) {
                            obj.setPivotYN16904--;
                            throw null;
                        }
                        i13 = i28 + 31;
                        oscar = i13 % 128;
                        if (i13 % 2 != 0) {
                            obj.setPivotYN16904 = obj.setPivotYN16904;
                            i14 = obj.vD14832N6715 * (((byte) (((byte) (bArr3[r0] / (-2360518458473264487L))) * s3)) ^ b2);
                        } else {
                            obj.setPivotYN16904 = obj.setPivotYN16904 - 1;
                            i14 = obj.vD14832N6715 + (((byte) (((byte) (bArr3[r0] ^ (-2360518458473264487L))) + s3)) ^ b2);
                        }
                        obj.component9 = (char) i14;
                        sb2.append(obj.component9);
                        obj.vD14832N6715 = obj.component9;
                        obj.D8871++;
                    } else {
                        if (!z10) {
                            obj.setPivotYN16904--;
                            throw null;
                        }
                        i13 = i28 + 31;
                        oscar = i13 % 128;
                        if (i13 % 2 != 0) {
                        }
                        obj.component9 = (char) i14;
                        sb2.append(obj.component9);
                        obj.vD14832N6715 = obj.component9;
                        obj.D8871++;
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
        lima = new byte[]{97, -26, -89, -18, -6, 5, -3};
        mike = 4;
    }

    public static void golf() {
        papa = new byte[]{77, -120, -45, -44};
        quebec = 251;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x1c3c, code lost:
    
        r3 = -(-r3);
        r2 = (r2 | r3) + (r2 & r3);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x1c3b, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x1c4e, code lost:
    
        if (r2 < 25.2d) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x1c50, code lost:
    
        r0 = (com.fingerprintjs.android.fpjs_pro_internal.C1206f0.kilo + 115) % 128;
        com.fingerprintjs.android.fpjs_pro_internal.C1206f0.juliet = r0;
        com.fingerprintjs.android.fpjs_pro_internal.C1206f0.kilo = (r0 + 55) % 128;
        r2 = new int[1];
        r3 = new int[1];
        r4 = (~(r82 & 261)) & (r82 | 261);
        r3[0] = r82;
        r2[0] = r4;
        r1 = new java.lang.Object[4];
        r1[0] = new int[1];
        r1[1] = r2;
        r1[2] = r3;
        r1[r29] = null;
        r0 = (int) java.lang.Runtime.getRuntime().maxMemory();
        r0 = ((r0 | 437752350) * 104) + (((~((~r0) | 509080095)) * (-104)) + ((((~((-72769554) | r0)) | 1441808) * 104) - 1044148457));
        r2 = (((r0 | 16) << 1) - (r0 ^ 16)) + r25;
        r0 = r2 << 13;
        r0 = (r0 | r2) & (~(r2 & r0));
        r2 = r0 >>> 17;
        r0 = (r0 | r2) & (~(r0 & r2));
        r2 = r0 << 5;
        ((int[]) r1[0])[0] = ((~r0) & r2) | ((~r2) & r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x1cce, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x1aaf, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 477111747) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x052b, code lost:
    
        if (((r2 & r3) | (r2 ^ r3)) != 477111747) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x09fb, code lost:
    
        if (android.os.Build.VERSION.SDK_INT <= 33) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x09fd, code lost:
    
        r0 = com.fingerprintjs.android.fpjs_pro_internal.C1206f0.juliet;
        com.fingerprintjs.android.fpjs_pro_internal.C1206f0.kilo = (((r0 | 55) << 1) - (r0 ^ 55)) % 128;
        r0 = -(-android.graphics.Color.red(0));
        r49 = ((r0 | 1064826374) << 1) - (r0 ^ 1064826374);
        r0 = -android.view.View.getDefaultSize(0, 0);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.C1211g1.alpha();
        r3 = r0 * (-317);
        r4 = (r3 & (-7975)) + (r3 | (-7975));
        r3 = ~r0;
        r5 = (r3 ^ 24) | (r3 & 24);
        r5 = ~((r5 & r2) | (r5 ^ r2));
        r8 = (~r2) | r0;
        r8 = ~((r8 & (-25)) | (r8 ^ (-25)));
        r5 = (((r5 & r8) | (r5 ^ r8)) * (-318)) + r4;
        r4 = ~((24 ^ r0) | (24 & r0));
        r0 = ~((r0 & r2) | (r0 ^ r2));
        r0 = (((r0 & r4) | (r4 ^ r0)) * (-318)) + r5;
        r2 = ~((r2 & r3) | (r3 ^ r2));
        r2 = ((24 & r2) | (24 ^ r2)) * 318;
        r50 = (r0 & r2) + (r0 | r2);
        r0 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
        r51 = (r0 ^ (-1024869309)) + ((r0 & (-1024869309)) << 1);
        r0 = -android.view.MotionEvent.axisFromString(r7);
        r2 = com.fingerprintjs.android.fpjs_pro_internal.C1211g1.alpha();
        r3 = r0 * 398;
        r4 = (r3 & 19404) + (r3 | 19404);
        r3 = ~r0;
        r5 = ~r2;
        r8 = ~((r3 ^ r5) | (r3 & r5));
        r3 = ~((r3 & (-49)) | (r3 ^ (-49)));
        r8 = r8 | r3;
        r5 = ~((r5 & (-49)) | (r5 ^ (-49)));
        r5 = -(-(((r5 & r8) | (r8 ^ r5)) * (-397)));
        r4 = (r3 * (-397)) + ((r4 ^ r5) + ((r4 & r5) << 1));
        r2 = r2 | r3;
        r0 = ~((48 & r0) | (48 ^ r0));
        r3 = new java.lang.Object[1];
        delta(r49, r50, r51, (short) ((((r0 & r2) | (r2 ^ r0)) * 397) + r4), (byte) (android.os.Process.myTid() >> 22), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0add, code lost:
    
        r2 = new java.lang.Object[]{(java.lang.String) r3[0]};
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(1565484532);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x3591, code lost:
    
        if (r2.reset(r3[r4].getName()).matches() != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x35b3, code lost:
    
        r9 = ((r9 | 1) << 1) - (r9 ^ 1);
        r5 = new java.lang.StringBuilder();
        r5.append(r3[r4].getAbsolutePath());
        r12 = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        r13 = -android.widget.ExpandableListView.getPackedPositionGroup(0);
        r17 = r0;
        r0 = new java.lang.Object[1];
        r18 = r2;
        charlie(r12, ((r13 | 42032298) << 1) - (r13 ^ 42032298), "ꋖ褀䬈カ턧鋻ೈ", "ꪶ腜嘂\ueab9", r0);
        r5.append((java.lang.String) r0[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x35ff, code lost:
    
        r2 = new java.io.BufferedInputStream(new java.io.FileInputStream(r5.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x3609, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ae8, code lost:
    
        if (r0 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x360b, code lost:
    
        r0 = r2.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x3611, code lost:
    
        if (r0 == r24) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x3613, code lost:
    
        r43 = 0.0f;
        r21 = r6;
        r12 = 1073741823 & (r0 ^ (r12 << r27));
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x3621, code lost:
    
        if (r0 >= 1) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x3623, code lost:
    
        r5 = ~(((-1669745186) & r21) | ((-1669745186) ^ r21));
        r5 = -(-(((r5 & 1058690621) | (1058690621 ^ r5)) * 519));
        r41 = ((-285507124) ^ r5) + ((r5 & (-285507124)) << 1);
        r5 = ((~(r21 | (-1082394625))) | (~((2141085245 ^ r82) | (2141085245 & r82)))) * (-519);
        r8 = (r41 & r5) + (r41 | r5);
        r5 = ~(1058690621 | r82);
        r5 = ((1669745185 ^ r5) | (r5 & 1669745185)) * 519;
        r6 = (r8 & r5) + (r5 | r8);
        r5 = com.fingerprintjs.android.fpjs_pro_internal.C1211g1.alpha();
        r8 = ~(((-1519967245) ^ r5) | ((-1519967245) & r5));
        r8 = (((-1914613627) ^ r8) | ((-1914613627) & r8)) * (-366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x36a1, code lost:
    
        if (r6 > ((((~(((-1377340425) ^ r5) | (r5 & (-1377340425)))) | (-2057240447)) * 366) + (((267162185 | r8) << 1) - (267162185 ^ r8)))) goto L677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0aea, code lost:
    
        r49 = android.widget.ExpandableListView.getPackedPositionChild(0) + 53;
        r0 = 2951 - (android.os.Process.myTid() >> 22);
        r3 = (char) (android.graphics.Color.rgb(0, 0, 0) + okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        r4 = (byte) (r16 - 4);
        r5 = r4;
        r9 = new java.lang.Object[1];
        bravo(r4, r5, r5, r9);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r49, r0, r3, -2097887455, false, (java.lang.String) r9[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x36a7, code lost:
    
        if (r12 != r17[r0]) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x36af, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x36a9, code lost:
    
        r0 = r0 - (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x36ab, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x36e7, code lost:
    
        r0 = 241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0b27, code lost:
    
        r2 = ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x36df, code lost:
    
        if (r2 != null) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x36e4, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x36e1, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b34, code lost:
    
        r4 = 781488375;
        r10 = r48;
        r8 = r82 ^ r3;
        r41 = r8 | r4;
        r51 = r2 ^ r3;
        r12 = ((-52) * ((((r51 | r8) ^ r3) | ((r51 | r4) ^ r3)) | (r41 ^ r3))) + ((((r41 | r2) ^ r3) * r10) + ((r22 * r2) + ((-51) * r4)));
        r4 = r4 ^ r3;
        r10 = ((r10 * (((r2 | r4) ^ r3) | ((r8 | r4) ^ r3))) + r12) + 173665527;
        r0 = ((int) (r10 >> 32)) & ((((~(((int) java.lang.Runtime.getRuntime().maxMemory()) | 1995034956)) | (-2013264878)) * 658) + ((((-1473686254) | r2) * (-658)) - 2324566));
        r2 = ((int) r10) & ((((~(1995731853 | r82)) | (~(r6 | 558505443))) * 979) + (((558505443 | r82) * (-979)) + (((~(1995731853 | r6)) * 979) - 509878920)));
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x36b8, code lost:
    
        r0 = r17[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x36bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x36bc, code lost:
    
        r6 = r21;
        r24 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0bbf, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x36c2, code lost:
    
        r21 = r6;
        r43 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x36c6, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x36b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x36b6, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0bc1, code lost:
    
        r0 = true;
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x36d8, code lost:
    
        if (r3 != null) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x36dd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x36da, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x36cb, code lost:
    
        r21 = r6;
        r43 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x36d3, code lost:
    
        r21 = r6;
        r43 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x36de, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0caa, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x36d0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x36d1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x35b0, code lost:
    
        if (r2.reset(r3[r4].getName()).matches() != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cac, code lost:
    
        r2 = new int[r11];
        r3 = new int[r11];
        r4 = (~(r82 & 260)) & (r82 | 260);
        r3[0] = r82;
        r2[0] = r4;
        r1 = new java.lang.Object[r33];
        r1[0] = new int[r11];
        r1[r11] = r2;
        r1[2] = r3;
        r1[r29] = null;
        r0 = android.os.Process.myTid();
        r0 = -(-A0.z.foxtrot((~(r0 | (-336382511))) | 151068673, 446, (((~((~r0) | (-347917871))) | 11535360) * 446) + 451019853, 849803280));
        r2 = (r0 & r25) + (r0 | r25);
        r0 = r2 << 13;
        r0 = (r0 | r2) & (~(r2 & r0));
        r2 = r0 >>> 17;
        r0 = (r0 | r2) & (~(r0 & r2));
        r2 = r0 << 5;
        ((int[]) r1[0])[0] = ((~r0) & r2) | ((~r2) & r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d16, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x2aff, code lost:
    
        if (r0 != 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x2b08, code lost:
    
        if (r0 != 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0bc5, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0bc8, code lost:
    
        r8 = 1064826439 - (~(-android.text.TextUtils.lastIndexOf(r7, '0', 0, 0)));
        r0 = -android.graphics.Color.green(0);
        r13 = new java.lang.Object[1];
        delta(r8, (r0 ^ (-40)) + ((r0 & (-40)) << 1), android.text.TextUtils.getOffsetBefore(r7, 0) - 1024869282, (short) ((-28) - (~(-android.text.TextUtils.lastIndexOf(r7, '0')))), (byte) (0 - (~((byte) android.view.KeyEvent.getModifierMetaStateMask()))), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0c0c, code lost:
    
        r4 = new java.lang.Object[]{(java.lang.String) r13[0]};
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0c14, code lost:
    
        if (r0 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0c16, code lost:
    
        r49 = android.text.TextUtils.getTrimmedLength(r7) + 52;
        r0 = 3158 - (android.os.Process.myPid() >> 22);
        r2 = (char) (58075 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)));
        r3 = (byte) (r16 - 3);
        r5 = (byte) (r3 - 1);
        r9 = new java.lang.Object[1];
        bravo(r3, r5, (byte) (r5 + 1), r9);
        r0 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r49, r0, r2, 424179844, false, (java.lang.String) r9[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0c5b, code lost:
    
        r0 = ((java.lang.reflect.Method) r0).invoke(null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0c62, code lost:
    
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        r49 = (r2 & 1064826376) + (r2 | 1064826376);
        r2 = android.text.TextUtils.lastIndexOf(r7, '0', 0);
        r50 = (r2 & (-51)) + (r2 | (-51));
        r51 = android.graphics.ImageFormat.getBitsPerPixel(0) - 1024869269;
        r2 = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
        r11 = 1;
        r5 = new java.lang.Object[1];
        delta(r49, r50, r51, (short) (((r2 | (-92)) << 1) - (r2 ^ (-92))), (byte) android.graphics.Color.red(0), r5);
        r0 = r0.equals((java.lang.String) r5[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0630, code lost:
    
        if (((r2 & r3) | (r2 ^ r3)) != 477111747) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x07ea, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != (-1032769152)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x08f5, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) != (-1032769152)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x09f5, code lost:
    
        if (((r0 & r2) | (r0 ^ r2)) == 542074309) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x19a1, code lost:
    
        if (((r2 & r4) | (r4 ^ r2)) != 477111747) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x1ab1, code lost:
    
        r0 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x1ab5, code lost:
    
        if (r0 >= 28) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x1ab7, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.C1206f0.kilo;
        com.fingerprintjs.android.fpjs_pro_internal.C1206f0.juliet = (((r3 | 103) << 1) - (r3 ^ 103)) % 128;
        r3 = r41[r0];
        r4 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
        r8 = ((r4 | 1064826374) << 1) - (r4 ^ 1064826374);
        r5 = android.text.TextUtils.indexOf((java.lang.CharSequence) r7, '0');
        r4 = r5 * (-563);
        r9 = (r4 & (-22600)) + (r4 | (-22600));
        r4 = ~r5;
        r10 = ~((39 & r6) | (39 ^ r6));
        r10 = (r10 & r4) | (r4 ^ r10);
        r11 = ~(r82 | (-40));
        r10 = -(-(((r10 & r11) | (r10 ^ r11)) * (-564)));
        r11 = (r9 ^ r10) + ((r9 & r10) << 1);
        r9 = r4 | (-40);
        r13 = new java.lang.Object[1];
        delta(r8, (((~((r4 & r6) | (r4 ^ r6))) | (~((r5 & (-40)) | (r5 ^ (-40))))) * 564) + ((r11 - (~((~((r9 & r82) | (r9 ^ r82))) * 1128))) - 1), (-1024869165) - (~(-(-android.text.TextUtils.getCapsMode(r7, 0, 0)))), (short) (android.text.TextUtils.indexOf((java.lang.CharSequence) r7, '0') + 3), (byte) ((-2) - (~(-android.view.MotionEvent.axisFromString(r7)))), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x1b54, code lost:
    
        r8 = new java.lang.Object[]{((java.lang.String) r13[0]).concat(java.lang.String.valueOf(r3))};
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.D8871(1565484532);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x1b5f, code lost:
    
        if (r3 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x1b61, code lost:
    
        r53 = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 53;
        r3 = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2951;
        r4 = (char) android.view.KeyEvent.normalizeMetaState(0);
        r5 = (byte) (r16 - 4);
        r9 = r5;
        r12 = new java.lang.Object[1];
        bravo(r5, r9, r9, r12);
        r3 = com.fingerprintjs.android.fpjs_pro_internal.uH18377.setPivotYN16904(r53, r3, r4, -2097887455, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.String.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x1ba0, code lost:
    
        r3 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r8)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x1bad, code lost:
    
        r8 = -726523193;
        r10 = (-216) * r3;
        r12 = 217;
        r49 = r8 ^ r3;
        r3 = (int) android.os.SystemClock.uptimeMillis();
        r55 = r3 ^ r3;
        r53 = r3 ^ r3;
        r12 = ((r12 * (r8 | ((r53 | r55) ^ r3))) + (((((r49 | r3) ^ r3) | ((r49 | r53) ^ r3)) * r12) + (((((r49 | r55) ^ r3) | ((r53 | r3) ^ r3)) * r12) + (r10 + (r51 * r8))))) + 1681677095;
        r3 = ((int) (r12 >> 32)) & (((~(76774820 | r6)) * 184) + (((1134852 | r82) * (-184)) + ((((~(1514001231 | r6)) | (-1589641200)) * 184) + 2082243850)));
        r4 = ((int) r12) & A0.z.foxtrot(~((-562053137) | r82), -1504, (((~((-602272017) | r82)) | 40218880) * 1504) + 1320243365, 1177844144);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1c37, code lost:
    
        if (((r3 & r4) | (r3 ^ r4)) != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1c39, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1d2c A[Catch: all -> 0x4b1a, TryCatch #24 {all -> 0x4b1a, blocks: (B:3:0x000b, B:6:0x001e, B:7:0x0069, B:14:0x01a3, B:17:0x01b4, B:18:0x0201, B:28:0x0344, B:30:0x034e, B:31:0x038a, B:33:0x03d8, B:35:0x03e2, B:36:0x041e, B:38:0x0427, B:40:0x043a, B:41:0x0475, B:47:0x0add, B:49:0x0aea, B:50:0x0b27, B:59:0x1573, B:61:0x157d, B:62:0x15c0, B:65:0x1661, B:67:0x1670, B:68:0x16bc, B:72:0x178d, B:74:0x1797, B:75:0x17db, B:77:0x1834, B:79:0x183e, B:80:0x1888, B:83:0x18a1, B:85:0x18b6, B:86:0x18fa, B:93:0x1b54, B:95:0x1b61, B:96:0x1ba0, B:111:0x19b1, B:113:0x19c6, B:114:0x1a0d, B:120:0x1d1f, B:122:0x1d2c, B:123:0x1d6d, B:125:0x1e48, B:127:0x1e55, B:128:0x1e98, B:138:0x202f, B:140:0x203c, B:141:0x207c, B:143:0x218e, B:145:0x219b, B:146:0x21d6, B:159:0x25ab, B:161:0x25b8, B:162:0x25fe, B:207:0x2be6, B:209:0x2bf0, B:210:0x2c39, B:213:0x2c97, B:215:0x2ca6, B:216:0x2cf1, B:223:0x3159, B:225:0x3166, B:226:0x31b1, B:236:0x3367, B:238:0x3389, B:239:0x33d9, B:275:0x386e, B:277:0x3874, B:278:0x38b1, B:285:0x394a, B:287:0x3953, B:288:0x3996, B:311:0x3fd2, B:313:0x3fe6, B:314:0x402e, B:320:0x4161, B:322:0x4167, B:323:0x41a9, B:329:0x4304, B:331:0x432b, B:332:0x4382, B:343:0x44e7, B:345:0x44f4, B:346:0x4532, B:354:0x4652, B:356:0x4658, B:357:0x4694, B:363:0x47a2, B:365:0x47a8, B:366:0x47e0, B:375:0x48fb, B:377:0x4923, B:378:0x497d, B:397:0x3aa6, B:399:0x3aac, B:400:0x3aec, B:405:0x3c22, B:407:0x3c28, B:408:0x3c65, B:413:0x3d8e, B:415:0x3d94, B:416:0x3dd2, B:624:0x0c0c, B:626:0x0c16, B:627:0x0c5b, B:631:0x0538, B:633:0x054a, B:634:0x058f, B:641:0x06e3, B:643:0x06f5, B:644:0x0737, B:648:0x07ef, B:650:0x0804, B:651:0x0844, B:656:0x08fa, B:658:0x090f, B:659:0x0951), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1e55 A[Catch: all -> 0x4b1a, TryCatch #24 {all -> 0x4b1a, blocks: (B:3:0x000b, B:6:0x001e, B:7:0x0069, B:14:0x01a3, B:17:0x01b4, B:18:0x0201, B:28:0x0344, B:30:0x034e, B:31:0x038a, B:33:0x03d8, B:35:0x03e2, B:36:0x041e, B:38:0x0427, B:40:0x043a, B:41:0x0475, B:47:0x0add, B:49:0x0aea, B:50:0x0b27, B:59:0x1573, B:61:0x157d, B:62:0x15c0, B:65:0x1661, B:67:0x1670, B:68:0x16bc, B:72:0x178d, B:74:0x1797, B:75:0x17db, B:77:0x1834, B:79:0x183e, B:80:0x1888, B:83:0x18a1, B:85:0x18b6, B:86:0x18fa, B:93:0x1b54, B:95:0x1b61, B:96:0x1ba0, B:111:0x19b1, B:113:0x19c6, B:114:0x1a0d, B:120:0x1d1f, B:122:0x1d2c, B:123:0x1d6d, B:125:0x1e48, B:127:0x1e55, B:128:0x1e98, B:138:0x202f, B:140:0x203c, B:141:0x207c, B:143:0x218e, B:145:0x219b, B:146:0x21d6, B:159:0x25ab, B:161:0x25b8, B:162:0x25fe, B:207:0x2be6, B:209:0x2bf0, B:210:0x2c39, B:213:0x2c97, B:215:0x2ca6, B:216:0x2cf1, B:223:0x3159, B:225:0x3166, B:226:0x31b1, B:236:0x3367, B:238:0x3389, B:239:0x33d9, B:275:0x386e, B:277:0x3874, B:278:0x38b1, B:285:0x394a, B:287:0x3953, B:288:0x3996, B:311:0x3fd2, B:313:0x3fe6, B:314:0x402e, B:320:0x4161, B:322:0x4167, B:323:0x41a9, B:329:0x4304, B:331:0x432b, B:332:0x4382, B:343:0x44e7, B:345:0x44f4, B:346:0x4532, B:354:0x4652, B:356:0x4658, B:357:0x4694, B:363:0x47a2, B:365:0x47a8, B:366:0x47e0, B:375:0x48fb, B:377:0x4923, B:378:0x497d, B:397:0x3aa6, B:399:0x3aac, B:400:0x3aec, B:405:0x3c22, B:407:0x3c28, B:408:0x3c65, B:413:0x3d8e, B:415:0x3d94, B:416:0x3dd2, B:624:0x0c0c, B:626:0x0c16, B:627:0x0c5b, B:631:0x0538, B:633:0x054a, B:634:0x058f, B:641:0x06e3, B:643:0x06f5, B:644:0x0737, B:648:0x07ef, B:650:0x0804, B:651:0x0844, B:656:0x08fa, B:658:0x090f, B:659:0x0951), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x1f4f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1f62  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x203c A[Catch: all -> 0x4b1a, TryCatch #24 {all -> 0x4b1a, blocks: (B:3:0x000b, B:6:0x001e, B:7:0x0069, B:14:0x01a3, B:17:0x01b4, B:18:0x0201, B:28:0x0344, B:30:0x034e, B:31:0x038a, B:33:0x03d8, B:35:0x03e2, B:36:0x041e, B:38:0x0427, B:40:0x043a, B:41:0x0475, B:47:0x0add, B:49:0x0aea, B:50:0x0b27, B:59:0x1573, B:61:0x157d, B:62:0x15c0, B:65:0x1661, B:67:0x1670, B:68:0x16bc, B:72:0x178d, B:74:0x1797, B:75:0x17db, B:77:0x1834, B:79:0x183e, B:80:0x1888, B:83:0x18a1, B:85:0x18b6, B:86:0x18fa, B:93:0x1b54, B:95:0x1b61, B:96:0x1ba0, B:111:0x19b1, B:113:0x19c6, B:114:0x1a0d, B:120:0x1d1f, B:122:0x1d2c, B:123:0x1d6d, B:125:0x1e48, B:127:0x1e55, B:128:0x1e98, B:138:0x202f, B:140:0x203c, B:141:0x207c, B:143:0x218e, B:145:0x219b, B:146:0x21d6, B:159:0x25ab, B:161:0x25b8, B:162:0x25fe, B:207:0x2be6, B:209:0x2bf0, B:210:0x2c39, B:213:0x2c97, B:215:0x2ca6, B:216:0x2cf1, B:223:0x3159, B:225:0x3166, B:226:0x31b1, B:236:0x3367, B:238:0x3389, B:239:0x33d9, B:275:0x386e, B:277:0x3874, B:278:0x38b1, B:285:0x394a, B:287:0x3953, B:288:0x3996, B:311:0x3fd2, B:313:0x3fe6, B:314:0x402e, B:320:0x4161, B:322:0x4167, B:323:0x41a9, B:329:0x4304, B:331:0x432b, B:332:0x4382, B:343:0x44e7, B:345:0x44f4, B:346:0x4532, B:354:0x4652, B:356:0x4658, B:357:0x4694, B:363:0x47a2, B:365:0x47a8, B:366:0x47e0, B:375:0x48fb, B:377:0x4923, B:378:0x497d, B:397:0x3aa6, B:399:0x3aac, B:400:0x3aec, B:405:0x3c22, B:407:0x3c28, B:408:0x3c65, B:413:0x3d8e, B:415:0x3d94, B:416:0x3dd2, B:624:0x0c0c, B:626:0x0c16, B:627:0x0c5b, B:631:0x0538, B:633:0x054a, B:634:0x058f, B:641:0x06e3, B:643:0x06f5, B:644:0x0737, B:648:0x07ef, B:650:0x0804, B:651:0x0844, B:656:0x08fa, B:658:0x090f, B:659:0x0951), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x219b A[Catch: all -> 0x4b1a, TryCatch #24 {all -> 0x4b1a, blocks: (B:3:0x000b, B:6:0x001e, B:7:0x0069, B:14:0x01a3, B:17:0x01b4, B:18:0x0201, B:28:0x0344, B:30:0x034e, B:31:0x038a, B:33:0x03d8, B:35:0x03e2, B:36:0x041e, B:38:0x0427, B:40:0x043a, B:41:0x0475, B:47:0x0add, B:49:0x0aea, B:50:0x0b27, B:59:0x1573, B:61:0x157d, B:62:0x15c0, B:65:0x1661, B:67:0x1670, B:68:0x16bc, B:72:0x178d, B:74:0x1797, B:75:0x17db, B:77:0x1834, B:79:0x183e, B:80:0x1888, B:83:0x18a1, B:85:0x18b6, B:86:0x18fa, B:93:0x1b54, B:95:0x1b61, B:96:0x1ba0, B:111:0x19b1, B:113:0x19c6, B:114:0x1a0d, B:120:0x1d1f, B:122:0x1d2c, B:123:0x1d6d, B:125:0x1e48, B:127:0x1e55, B:128:0x1e98, B:138:0x202f, B:140:0x203c, B:141:0x207c, B:143:0x218e, B:145:0x219b, B:146:0x21d6, B:159:0x25ab, B:161:0x25b8, B:162:0x25fe, B:207:0x2be6, B:209:0x2bf0, B:210:0x2c39, B:213:0x2c97, B:215:0x2ca6, B:216:0x2cf1, B:223:0x3159, B:225:0x3166, B:226:0x31b1, B:236:0x3367, B:238:0x3389, B:239:0x33d9, B:275:0x386e, B:277:0x3874, B:278:0x38b1, B:285:0x394a, B:287:0x3953, B:288:0x3996, B:311:0x3fd2, B:313:0x3fe6, B:314:0x402e, B:320:0x4161, B:322:0x4167, B:323:0x41a9, B:329:0x4304, B:331:0x432b, B:332:0x4382, B:343:0x44e7, B:345:0x44f4, B:346:0x4532, B:354:0x4652, B:356:0x4658, B:357:0x4694, B:363:0x47a2, B:365:0x47a8, B:366:0x47e0, B:375:0x48fb, B:377:0x4923, B:378:0x497d, B:397:0x3aa6, B:399:0x3aac, B:400:0x3aec, B:405:0x3c22, B:407:0x3c28, B:408:0x3c65, B:413:0x3d8e, B:415:0x3d94, B:416:0x3dd2, B:624:0x0c0c, B:626:0x0c16, B:627:0x0c5b, B:631:0x0538, B:633:0x054a, B:634:0x058f, B:641:0x06e3, B:643:0x06f5, B:644:0x0737, B:648:0x07ef, B:650:0x0804, B:651:0x0844, B:656:0x08fa, B:658:0x090f, B:659:0x0951), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x227b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x2291  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x25a9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x26d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x273a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x2b30  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x2b8f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x370b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x376a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x37fa  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x37ff  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x3869  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x3fae  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x3fb8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x3fd1  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x3fb3  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x37fc  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x36e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x36ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x157d A[Catch: all -> 0x4b1a, TryCatch #24 {all -> 0x4b1a, blocks: (B:3:0x000b, B:6:0x001e, B:7:0x0069, B:14:0x01a3, B:17:0x01b4, B:18:0x0201, B:28:0x0344, B:30:0x034e, B:31:0x038a, B:33:0x03d8, B:35:0x03e2, B:36:0x041e, B:38:0x0427, B:40:0x043a, B:41:0x0475, B:47:0x0add, B:49:0x0aea, B:50:0x0b27, B:59:0x1573, B:61:0x157d, B:62:0x15c0, B:65:0x1661, B:67:0x1670, B:68:0x16bc, B:72:0x178d, B:74:0x1797, B:75:0x17db, B:77:0x1834, B:79:0x183e, B:80:0x1888, B:83:0x18a1, B:85:0x18b6, B:86:0x18fa, B:93:0x1b54, B:95:0x1b61, B:96:0x1ba0, B:111:0x19b1, B:113:0x19c6, B:114:0x1a0d, B:120:0x1d1f, B:122:0x1d2c, B:123:0x1d6d, B:125:0x1e48, B:127:0x1e55, B:128:0x1e98, B:138:0x202f, B:140:0x203c, B:141:0x207c, B:143:0x218e, B:145:0x219b, B:146:0x21d6, B:159:0x25ab, B:161:0x25b8, B:162:0x25fe, B:207:0x2be6, B:209:0x2bf0, B:210:0x2c39, B:213:0x2c97, B:215:0x2ca6, B:216:0x2cf1, B:223:0x3159, B:225:0x3166, B:226:0x31b1, B:236:0x3367, B:238:0x3389, B:239:0x33d9, B:275:0x386e, B:277:0x3874, B:278:0x38b1, B:285:0x394a, B:287:0x3953, B:288:0x3996, B:311:0x3fd2, B:313:0x3fe6, B:314:0x402e, B:320:0x4161, B:322:0x4167, B:323:0x41a9, B:329:0x4304, B:331:0x432b, B:332:0x4382, B:343:0x44e7, B:345:0x44f4, B:346:0x4532, B:354:0x4652, B:356:0x4658, B:357:0x4694, B:363:0x47a2, B:365:0x47a8, B:366:0x47e0, B:375:0x48fb, B:377:0x4923, B:378:0x497d, B:397:0x3aa6, B:399:0x3aac, B:400:0x3aec, B:405:0x3c22, B:407:0x3c28, B:408:0x3c65, B:413:0x3d8e, B:415:0x3d94, B:416:0x3dd2, B:624:0x0c0c, B:626:0x0c16, B:627:0x0c5b, B:631:0x0538, B:633:0x054a, B:634:0x058f, B:641:0x06e3, B:643:0x06f5, B:644:0x0737, B:648:0x07ef, B:650:0x0804, B:651:0x0844, B:656:0x08fa, B:658:0x090f, B:659:0x0951), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x26d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x15c9  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x4b21  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x4b22  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] hotel(int i4, Object obj) {
        Throwable cause;
        int i5;
        int i10;
        int i11;
        int i12;
        char c3;
        int i13;
        int i14;
        long j5;
        long j6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Class cls;
        String str;
        int i23;
        int i24;
        int i25;
        float f5;
        int i26;
        Object D8871;
        Object invoke;
        Object D88712;
        long j7;
        Object D88713;
        long j10;
        Object D88714;
        long j11;
        Object D88715;
        long j12;
        int i27;
        int i28;
        int i29;
        String[] strArr;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        float f10;
        int i37;
        BufferedInputStream bufferedInputStream;
        float f11;
        BufferedInputStream bufferedInputStream2;
        int i38;
        int i39;
        Object[] objArr;
        char c4;
        char c10;
        char c11;
        char c12;
        char c13;
        String[] strArr2;
        String str2;
        Object[] objArr2;
        int parseInt;
        String[] strArr3;
        int i40;
        String[] strArr4;
        long j13;
        Object obj2;
        int i41;
        int i42;
        int i43 = 0;
        int i44 = 1;
        try {
            Object D88716 = uH18377.D8871(828738609);
            i5 = mike;
            if (D88716 == null) {
                int size = 51 - View.MeasureSpec.getSize(0);
                int indexOf = 3417 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                i11 = 2072770498;
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                i12 = 5;
                byte b2 = (byte) (i5 - 4);
                c3 = 20;
                byte b4 = b2;
                i13 = 3;
                i10 = 51;
                Object[] objArr3 = new Object[1];
                bravo(b2, b4, b4, objArr3);
                D88716 = uH18377.setPivotYN16904(size, indexOf, pressedStateDuration, -287428892, false, (String) objArr3[0], new Class[0]);
            } else {
                i10 = 51;
                i11 = 2072770498;
                i12 = 5;
                c3 = 20;
                i13 = 3;
            }
            long longValue = ((Long) ((Method) D88716).invoke(null, null)).longValue();
            long j14 = -747113311;
            long j15 = -495;
            i14 = 53;
            j5 = -1;
            long j16 = j14 ^ j5;
            long maxMemory = (int) Runtime.getRuntime().maxMemory();
            long j17 = ((j16 | (longValue ^ j5)) ^ j5) | ((j16 | maxMemory) ^ j5);
            long j18 = (992 * j17) + (j15 * longValue) + (j15 * j14);
            j6 = -496;
            long j19 = ((j17 | ((((maxMemory ^ j5) | j14) | longValue) ^ j5)) * j6) + j18;
            i15 = -1;
            long j20 = (496 * (maxMemory | longValue)) + j19 + 2073355938;
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            i16 = ((int) (j20 >> 32)) & ((((~((~elapsedCpuTime) | (-621281285))) | 4342864) * 449) + (((~((-621281285) | elapsedCpuTime)) | 4342864) * 449) + 2049879558);
            i17 = ~i4;
            i18 = ((int) j20) & ((((~(1376269789 | i4)) | (~(i17 | (-60956621)))) * 979) + (((-60956621) | i4) * (-979)) + ((~(1376269789 | i17)) * 979) + 2059144536);
        } catch (Throwable th) {
            cause = th.getCause();
            if (cause == null) {
            }
        }
        if (((i16 & i18) | (i16 ^ i18)) != 0) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            iArr2[0] = i4;
            iArr[0] = (i4 & (-272)) | (i17 & 271);
            Object[] objArr4 = new Object[4];
            objArr4[0] = new int[1];
            objArr4[1] = iArr;
            objArr4[2] = iArr2;
            objArr4[i13] = null;
            int i45 = ~((int) Runtime.getRuntime().freeMemory());
            int i46 = -(-A0.z.foxtrot((~(i45 | 194909754)) | (-424791504), 184, (((-272746950) | i45) * 184) + 1362747495, 16));
            int i47 = ((i46 | 1406935430) << 1) - (i46 ^ 1406935430);
            int i48 = i47 << 13;
            int i49 = (i48 | i47) & (~(i47 & i48));
            int i50 = i49 >>> 17;
            int i51 = ((~i49) & i50) | ((~i50) & i49);
            int i52 = i51 << 5;
            ((int[]) objArr4[0])[0] = (i51 | i52) & (~(i51 & i52));
            return objArr4;
        }
        Object[] objArr5 = new Object[1];
        charlie((char) (0 - (~(-(-MotionEvent.axisFromString(""))))), (-1716522127) - (~(-KeyEvent.normalizeMetaState(0))), "꩐Ὗ濴ᮻᵄꘘ耡ኻ旺\ueabaꏖ", "牱꿳墙\udab3", objArr5);
        Object[] objArr6 = {(String) objArr5[0]};
        Object D88717 = uH18377.D8871(-957097391);
        if (D88717 == null) {
            int edgeSlop = 52 - (ViewConfiguration.getEdgeSlop() >> 16);
            int keyRepeatTimeout = 3158 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            i19 = 1406935430;
            char resolveOpacity = (char) (58074 - Drawable.resolveOpacity(0, 0));
            i20 = -957097391;
            byte b6 = (byte) (i5 - 3);
            byte b10 = (byte) (b6 - 1);
            i21 = 16;
            i22 = 4;
            Object[] objArr7 = new Object[1];
            bravo(b6, b10, (byte) (b10 + 1), objArr7);
            D88717 = uH18377.setPivotYN16904(edgeSlop, keyRepeatTimeout, resolveOpacity, 424179844, false, (String) objArr7[0], new Class[]{String.class});
        } else {
            i19 = 1406935430;
            i20 = -957097391;
            i21 = 16;
            i22 = 4;
        }
        String str3 = (String) ((Method) D88717).invoke(null, objArr6);
        Class cls2 = Integer.TYPE;
        float f12 = 0.0f;
        if (str3 != null) {
            int i53 = -(-TextUtils.getTrimmedLength(""));
            int i54 = ((i53 | 1064826441) << 1) - (i53 ^ 1064826441);
            int i55 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int i56 = (i55 ^ (-47)) + ((i55 & (-47)) << 1);
            int i57 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            i23 = -2;
            int alpha = C1211g1.alpha();
            int i58 = i57 * 69;
            int i59 = (i58 ^ (-53230286)) + ((i58 & (-53230286)) << 1);
            i24 = 24;
            int i60 = ~i57;
            int i61 = (i60 ^ 1024869349) | (i60 & 1024869349);
            i25 = -49;
            int i62 = ~alpha;
            int i63 = 52;
            int i64 = (i59 - (~((((~((i57 ^ (-1024869350)) | (i57 & (-1024869350)))) | (~((i61 ^ i62) | (i61 & i62)))) | (~((alpha & (-1024869350)) | (alpha ^ (-1024869350))))) * (-68)))) - 1;
            int i65 = (i60 ^ i62) | (i60 & i62);
            int i66 = (~((i65 & (-1024869350)) | (i65 ^ (-1024869350)))) * (-68);
            int i67 = ~((i62 & 1024869349) | (1024869349 ^ i62));
            int i68 = (((i64 & i66) + (i64 | i66)) - (~(-(-(((i60 & i67) | (i60 ^ i67)) * 68))))) - 1;
            int i69 = -ImageFormat.getBitsPerPixel(0);
            Object[] objArr8 = new Object[1];
            delta(i54, i56, i68, (short) (((i69 | (-26)) << 1) - (i69 ^ (-26))), (byte) ((-2) - (~(-Process.getGidForName("")))), objArr8);
            String str4 = (String) objArr8[0];
            int i70 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i71 = (i70 & 1064826430) + (i70 | 1064826430);
            str = "";
            int indexOf2 = TextUtils.indexOf((CharSequence) str, '0') - 44;
            int i72 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr9 = new Object[1];
            delta(i71, indexOf2, (i72 & (-1024869344)) + (i72 | (-1024869344)), (short) (11 - (~(-Process.getGidForName(str)))), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
            String[] strArr5 = {str4, (String) objArr9[0]};
            long j21 = j6;
            int i73 = 0;
            int i74 = 2;
            while (i73 < i74) {
                long j22 = j21;
                if (str3.contains(strArr5[i73])) {
                    Object[] objArr10 = new Object[i44];
                    charlie((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') - 4094, "䜣卿盷﨏生⭍㼌Ⓠ掲\udd93⍽궴쀎㻫猃褩≎櫬ꎅﯥఌ㷖폒", "㈛㿰膁ᅒ", objArr10);
                    String str5 = (String) objArr10[i43];
                    Object[] objArr11 = new Object[i44];
                    objArr11[i43] = str5;
                    Object D88718 = uH18377.D8871(i20);
                    if (D88718 == null) {
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 52;
                        int red = Color.red(i43) + 3158;
                        char resolveSizeAndState = (char) (View.resolveSizeAndState(i43, i43, i43) + 58074);
                        byte b11 = (byte) (i5 - 3);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr12 = new Object[i44];
                        bravo(b11, b12, (byte) (b12 + 1), objArr12);
                        String str6 = (String) objArr12[i43];
                        Class[] clsArr = new Class[i44];
                        clsArr[i43] = String.class;
                        D88718 = uH18377.setPivotYN16904(scrollDefaultDelay, red, resolveSizeAndState, 424179844, false, str6, clsArr);
                    }
                    Object invoke2 = ((Method) D88718).invoke(null, objArr11);
                    int alpha2 = 1064826441 - Color.alpha(i43);
                    int i75 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int i76 = ((i75 | (-23)) << i44) - (i75 ^ (-23));
                    int i77 = -(-MotionEvent.axisFromString(str));
                    int i78 = (i77 ^ (-1024869337)) + ((i77 & (-1024869337)) << i44);
                    int i79 = (ViewConfiguration.getScrollFriction() > f12 ? 1 : (ViewConfiguration.getScrollFriction() == f12 ? 0 : -1));
                    Object[] objArr13 = new Object[i44];
                    delta(alpha2, i76, i78, (short) (((i79 | 15) << i44) - (i79 ^ 15)), (byte) TextUtils.getOffsetAfter(str, i43), objArr13);
                    Object[] objArr14 = new Object[i44];
                    objArr14[i43] = (String) objArr13[i43];
                    Object D88719 = uH18377.D8871(i20);
                    if (D88719 == null) {
                        int argb = 52 - Color.argb(i43, i43, i43, i43);
                        int combineMeasuredStates = 3158 - View.combineMeasuredStates(i43, i43);
                        char pressedStateDuration2 = (char) (58074 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b13 = (byte) (i5 - 3);
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr15 = new Object[i44];
                        bravo(b13, b14, (byte) (b14 + 1), objArr15);
                        String str7 = (String) objArr15[i43];
                        Class[] clsArr2 = new Class[i44];
                        clsArr2[i43] = String.class;
                        D88719 = uH18377.setPivotYN16904(argb, combineMeasuredStates, pressedStateDuration2, 424179844, false, str7, clsArr2);
                    }
                    Object invoke3 = ((Method) D88719).invoke(null, objArr14);
                    if (invoke2 != null) {
                        Object[] objArr16 = new Object[2];
                        objArr16[i44] = 42;
                        objArr16[i43] = invoke2;
                        Object D887110 = uH18377.D8871(i11);
                        if (D887110 == null) {
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(i43) + 52;
                            int bitsPerPixel2 = 1208 - ImageFormat.getBitsPerPixel(i43);
                            char gidForName = (char) (44355 - Process.getGidForName(str));
                            byte b15 = (byte) (i5 - 4);
                            byte b16 = b15;
                            Object[] objArr17 = new Object[i44];
                            bravo(b15, b16, b16, objArr17);
                            String str8 = (String) objArr17[i43];
                            Class[] clsArr3 = new Class[2];
                            clsArr3[i43] = String.class;
                            clsArr3[i44] = cls2;
                            D887110 = uH18377.setPivotYN16904(bitsPerPixel, bitsPerPixel2, gidForName, -1540336361, false, str8, clsArr3);
                        }
                        long longValue2 = ((Long) ((Method) D887110).invoke(null, objArr16)).longValue();
                        long j23 = 2017850425;
                        i41 = i43;
                        i42 = i44;
                        long j24 = (591 * longValue2) + ((-589) * j23);
                        long j25 = 590;
                        long j26 = longValue2 ^ j5;
                        obj2 = invoke3;
                        cls = cls2;
                        long j27 = i4;
                        long j28 = j27 ^ j5;
                        long j29 = ((j26 | j28) ^ j5) | ((j26 | j23) ^ j5) | ((j28 | j23) ^ j5);
                        long j30 = j23 ^ j5;
                        long j31 = ((j25 * (((j30 | j28) ^ j5) | ((j28 | longValue2) ^ j5))) + (((-1180) * j29) + (((j29 | (((j30 | longValue2) | j27) ^ j5)) * j25) + j24))) - 2025295455;
                        int i80 = (((~((-752632934) | i17)) | 68174880) * (-245)) + 927023946;
                        int i81 = ~((-752632934) | i4);
                        int i82 = ((int) (j31 >> 32)) & (((i81 | 684593477) * 245) + (i81 * (-245)) + i80);
                        int maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                        int i83 = ~maxMemory2;
                        int i84 = (((~((-65317996) | i83)) | 35652673) * (-1188)) - 18670761;
                        int i85 = (~(maxMemory2 | 65317995)) | 35652673;
                        int i86 = ~((-1371908415) | i83);
                        int i87 = ((int) j31) & ((((~(i83 | 65317995)) | 1342243092 | i86) * 594) + ((i85 | i86) * 594) + i84);
                    } else {
                        obj2 = invoke3;
                        cls = cls2;
                        i41 = i43;
                        i42 = i44;
                    }
                    if (obj2 != null) {
                        Object[] objArr18 = new Object[2];
                        objArr18[i42] = 42;
                        objArr18[i41] = obj2;
                        Object D887111 = uH18377.D8871(i11);
                        if (D887111 == null) {
                            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51;
                            int i88 = 1210 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            char edgeSlop2 = (char) (44356 - (ViewConfiguration.getEdgeSlop() >> 16));
                            byte b17 = (byte) (i5 - 4);
                            byte b18 = b17;
                            Object[] objArr19 = new Object[i42];
                            bravo(b17, b18, b18, objArr19);
                            String str9 = (String) objArr19[i41];
                            Class[] clsArr4 = new Class[2];
                            clsArr4[i41] = String.class;
                            clsArr4[1] = cls;
                            D887111 = uH18377.setPivotYN16904(keyRepeatTimeout2, i88, edgeSlop2, -1540336361, false, str9, clsArr4);
                        }
                        long longValue3 = ((Long) ((Method) D887111).invoke(null, objArr18)).longValue();
                        long j32 = 2136588092;
                        long j33 = j32 ^ j5;
                        long j34 = 191;
                        long j35 = (int) Runtime.getRuntime().totalMemory();
                        long j36 = ((j34 * (((longValue3 | (j35 ^ j5)) ^ j5) | ((j33 | longValue3) ^ j5))) + (((j32 | ((longValue3 | j35) ^ j5)) * j34) + (((-191) * j33) + ((192 * longValue3) + ((-381) * j32))))) - 2144033122;
                        int romeo = ao.ad.romeo();
                        int i89 = ((int) (j36 >> 32)) & ((((~(romeo | 1423531281)) | (-13695130)) * 529) + (((~((~romeo) | 1423531281)) | (-1423572378)) * 529) + 1520786966);
                        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i90 = ~elapsedRealtime;
                        int i91 = ((int) j36) & ((((~(elapsedRealtime | 1626340359)) | 1231400526) * 519) + (((~(i90 | (-150995529))) | (~(1777335887 | elapsedRealtime))) * (-519)) + (((~((-1231400527) | i90)) | 1626340359) * 519) + 1453938690);
                    }
                    if (invoke2 != null) {
                        int alpha3 = C1211g1.alpha();
                        int i92 = ~alpha3;
                        int i93 = ~((2147094506 & i92) | (2147094506 ^ i92));
                        int i94 = ~(((-1979189611) & alpha3) | ((-1979189611) ^ alpha3));
                        int i95 = -(-(((i93 & i94) | (i93 ^ i94)) * 520));
                        int i96 = (1811466084 & i95) + (i95 | 1811466084);
                        int i97 = ~(1979189610 | i92);
                        int i98 = ~((-186255073) | alpha3);
                        int i99 = (i96 - (~(-(-(((i97 & i98) | (i97 ^ i98)) * (-1040)))))) - 1;
                        int i100 = (~(i92 | 186255072)) | 167904896;
                        int i101 = ~((alpha3 & (-186255073)) | ((-186255073) ^ alpha3));
                        int i102 = (i99 - (~(-(-(((i101 & i100) | (i100 ^ i101)) * 520))))) - 1;
                        int alpha4 = C1211g1.alpha();
                        int i103 = ~alpha4;
                        int i104 = ~(((-2021825533) & i103) | ((-2021825533) ^ i103));
                        int i105 = ~((133595679 ^ alpha4) | (133595679 & alpha4));
                        int i106 = -(-(((i104 & i105) | (i104 ^ i105)) * (-370)));
                        int i107 = ((453605844 | i106) << 1) - (i106 ^ 453605844);
                        int i108 = (~((alpha4 & (-2021825533)) | ((-2021825533) ^ alpha4))) | (~((i103 & 133595679) | (133595679 ^ i103)));
                        int i109 = -(-(((i108 & 125042691) | (i108 ^ 125042691)) * (-370)));
                        int i110 = (i107 ^ i109) + ((i109 & i107) << 1);
                        if (i102 <= (i110 ^ (-978844586)) + (((-978844586) & i110) << 1)) {
                            Object[] objArr20 = new Object[2];
                            objArr20[1] = 58;
                            objArr20[i41] = invoke2;
                            Object D887112 = uH18377.D8871(i11);
                            if (D887112 == null) {
                                int i111 = i41;
                                int resolveOpacity2 = Drawable.resolveOpacity(i111, i111) + 51;
                                int deadChar = KeyEvent.getDeadChar(i111, i111) + 1209;
                                char capsMode = (char) (44356 - TextUtils.getCapsMode(str, i111, i111));
                                byte b19 = (byte) (i5 - 4);
                                byte b20 = b19;
                                Object[] objArr21 = new Object[1];
                                bravo(b19, b20, b20, objArr21);
                                D887112 = uH18377.setPivotYN16904(resolveOpacity2, deadChar, capsMode, -1540336361, false, (String) objArr21[0], new Class[]{String.class, cls});
                            }
                            long longValue4 = ((Long) ((Method) D887112).invoke(null, objArr20)).longValue();
                            long j37 = 313120175;
                            long j38 = j37 ^ j5;
                            long romeo2 = ao.ad.romeo();
                            long j39 = (j38 | (romeo2 ^ j5)) ^ j5;
                            long j40 = 338;
                            long j41 = ((j40 * ((((longValue4 | j37) | romeo2) ^ j5) | j39)) + ((((j38 | longValue4) ^ j5) * j40) + (((-338) * ((j39 | (((longValue4 ^ j5) | j37) ^ j5)) | ((j37 | romeo2) ^ j5))) + ((339 * longValue4) + ((-337) * j37))))) - 320565205;
                            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                            int i112 = ~elapsedCpuTime2;
                            int i113 = ((int) (j41 >>> 103)) & ((((~(elapsedCpuTime2 | 117373706)) | (~(i112 | (-117373707))) | (~((-1319852705) | elapsedCpuTime2))) * 959) + (((~((-1319852705) | i112)) | (~((-117373707) | elapsedCpuTime2)) | (~(i112 | 117373706))) * 959) + 1568879465);
                            int i114 = ((int) j41) & ((((~((~((int) Runtime.getRuntime().freeMemory())) | 619778122)) | (-817448288)) * 160) + ((((~(r3 | (-817448288))) | 548470858) * (-160)) - 1933495147));
                        } else {
                            Object[] objArr22 = {invoke2, 42};
                            Object D887113 = uH18377.D8871(i11);
                            if (D887113 == null) {
                                int red2 = 51 - Color.red(0);
                                int mode = View.MeasureSpec.getMode(0) + 1209;
                                char absoluteGravity = (char) (44356 - Gravity.getAbsoluteGravity(0, 0));
                                byte b21 = (byte) (i5 - 4);
                                byte b22 = b21;
                                Object[] objArr23 = new Object[1];
                                bravo(b21, b22, b22, objArr23);
                                D887113 = uH18377.setPivotYN16904(red2, mode, absoluteGravity, -1540336361, false, (String) objArr23[0], new Class[]{String.class, cls});
                            }
                            long longValue5 = ((Long) ((Method) D887113).invoke(null, objArr22)).longValue();
                            long j42 = 1708228392;
                            long j43 = longValue5 ^ j5;
                            long maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                            long j44 = 318;
                            long j45 = maxMemory3 ^ j5;
                            long j46 = ((j44 * ((((longValue5 | j42) | maxMemory3) ^ j5) | (((j43 | j45) | j42) ^ j5))) + (((((j43 | maxMemory3) ^ j5) | (((j45 | j42) | longValue5) ^ j5)) * j44) + (((j43 | (((j42 ^ j5) | maxMemory3) ^ j5)) * (-318)) + (((-317) * longValue5) + (319 * j42))))) - 1715673422;
                            int myPid = Process.myPid();
                            int i115 = ~myPid;
                            int i116 = (~(1192617786 | i115)) | (-1732241211);
                            int i117 = ((int) (j46 >> 32)) & ((((~(myPid | (-1125499675))) | (~(i115 | (-539623425)))) * HttpConstants.HTTP_BAD_GATEWAY) + (((i116 | r2) * (-502)) - 564467720));
                            int i118 = ((int) j46) & ((((~((-2106936262) | i4)) | 1360331077 | (~(750804624 | i4))) * 623) + ((4199440 | i17) * (-623)) + (((~((-1360331078) | i4)) * 623) - 198678950));
                        }
                        int i119 = -(-(TypedValue.complexToFraction(i26, f5, f5) > f5 ? 1 : (TypedValue.complexToFraction(i26, f5, f5) == f5 ? 0 : -1)));
                        int i120 = ((1064826424 | i119) << 1) - (i119 ^ 1064826424);
                        int i121 = (-47) - (~(-TextUtils.lastIndexOf(str, '0')));
                        int i122 = -Color.alpha(0);
                        int i123 = ((-1024869270) ^ i122) + ((i122 & (-1024869270)) << 1);
                        int gidForName2 = Process.getGidForName(str);
                        Object[] objArr24 = new Object[1];
                        delta(i120, i121, i123, (short) ((gidForName2 ^ 70) + ((gidForName2 & 70) << 1)), (byte) (ViewConfiguration.getTapTimeout() >> 16), objArr24);
                        String str10 = (String) objArr24[0];
                        int i124 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1064826423;
                        int packedPositionChild = (-48) - ExpandableListView.getPackedPositionChild(0L);
                        int keyRepeatTimeout3 = (-1024869263) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i125 = -((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr25 = new Object[1];
                        delta(i124, packedPositionChild, keyRepeatTimeout3, (short) ((i125 ^ (-87)) + ((i125 & (-87)) << 1)), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr25);
                        String str11 = (String) objArr25[0];
                        char c14 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int i126 = (((-738748223) | keyRepeatDelay) << 1) - (keyRepeatDelay ^ (-738748223));
                        Object[] objArr26 = new Object[1];
                        charlie(c14, i126, "뷨畷Ꙙ掉퍚⊷䑎", "섊\uf798⛓\udbf2", objArr26);
                        String str12 = (String) objArr26[0];
                        char c15 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i127 = -TextUtils.lastIndexOf(str, '0');
                        int i128 = ((-121840607) & i127) + (i127 | (-121840607));
                        Object[] objArr27 = new Object[1];
                        charlie(c15, i128, "寂綿떀‱痣᠍⩃ꎨ৽", "⋅볜룸ᑚ", objArr27);
                        String str13 = (String) objArr27[0];
                        int i129 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                        int i130 = (1064826432 & i129) + (i129 | 1064826432);
                        int i131 = -(-(Process.myTid() >> 22));
                        int i132 = (i131 & (-47)) + (i131 | (-47));
                        int i133 = (-1024869258) - (~TextUtils.lastIndexOf(str, '0', 0, 0));
                        int i134 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i135 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr28 = new Object[1];
                        delta(i130, i132, i133, (short) (((i134 | 123) << 1) - (i134 ^ 123)), (byte) ((i135 ^ 1) + ((i135 & 1) << 1)), objArr28);
                        String str14 = (String) objArr28[0];
                        int i136 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        int i137 = -AndroidCharacter.getMirror('0');
                        int i138 = ((-52795631) ^ i137) + ((i137 & (-52795631)) << 1);
                        Object[] objArr29 = new Object[1];
                        charlie((char) ((48578 ^ i136) + ((i136 & 48578) << 1)), i138, "炘Ϊ芋\ue9a3붬\ud8c7\ue5ea➏ₙ蛑ᨓ䍐甭", "\ue1a8\uda66싼沽", objArr29);
                        String str15 = (String) objArr29[0];
                        int i139 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        Object[] objArr30 = new Object[1];
                        charlie((char) ((i139 & 19970) + (i139 | 19970)), (ViewConfiguration.getScrollBarSize() >> 8) - 407602602, "ힼ쮭Ѧ헭椕", "囋둺˧㉎", objArr30);
                        String str16 = (String) objArr30[0];
                        Object[] objArr31 = new Object[1];
                        charlie((char) (28715 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), Process.myPid() >> 22, "殨婝ዬ奪傉器", "㋺䇦ⴓ셰", objArr31);
                        String str17 = (String) objArr31[0];
                        int i140 = 1064826431 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                        int i141 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 52;
                        int pressedStateDuration3 = ViewConfiguration.getPressedStateDuration() >> 16;
                        int alpha5 = C1211g1.alpha();
                        int i142 = pressedStateDuration3 * 1773;
                        int i143 = (771189449 ^ i142) + ((i142 & 771189449) << 1);
                        int i144 = ~pressedStateDuration3;
                        int i145 = ~((i144 & 1024869252) | (1024869252 ^ i144));
                        int i146 = ~((1024869252 ^ alpha5) | (1024869252 & alpha5));
                        int i147 = (i145 & i146) | (i145 ^ i146);
                        int i148 = ~alpha5;
                        int i149 = ~(i148 | pressedStateDuration3 | (-1024869253));
                        int i150 = -(-(((i147 & i149) | (i147 ^ i149)) * 886));
                        int i151 = (i143 ^ i150) + ((i150 & i143) << 1);
                        int i152 = ~(((-1024869253) ^ i148) | ((-1024869253) & i148));
                        int i153 = (i151 - (~(-(-(((i152 & pressedStateDuration3) | (pressedStateDuration3 ^ i152)) * (-1772)))))) - 1;
                        int i154 = -(-((~((pressedStateDuration3 & i148) | (i148 ^ pressedStateDuration3))) * 886));
                        int i155 = (i153 ^ i154) + ((i154 & i153) << 1);
                        int i156 = -(-View.MeasureSpec.getMode(0));
                        int lastIndexOf = TextUtils.lastIndexOf(str, '0');
                        int alpha6 = C1211g1.alpha();
                        int i157 = ~(i23 | alpha6);
                        int i158 = ~alpha6;
                        int i159 = (((lastIndexOf * (-515)) + 517) - (~(-(-(((i157 | (~((i158 ^ lastIndexOf) | (i158 & lastIndexOf)))) | (~((i158 ^ 1) | (i158 & 1)))) * (-516)))))) - 1;
                        int i160 = ~lastIndexOf;
                        int i161 = ~(alpha6 | (i160 ^ (-2)) | (i160 & (-2)));
                        int i162 = i160 | i158;
                        int i163 = ~((i162 & 1) | (i162 ^ 1));
                        int i164 = (((i161 & i163) | (i161 ^ i163)) * 516) + i159;
                        int i165 = ((~(i160 | 1)) | (~(i158 | 1))) * 516;
                        byte b23 = (byte) (((i164 | i165) << 1) - (i165 ^ i164));
                        Object[] objArr32 = new Object[1];
                        delta(i140, i141, i155, (short) ((i156 & (-120)) + (i156 | (-120))), b23, objArr32);
                        String str18 = (String) objArr32[0];
                        int i166 = -Process.getGidForName(str);
                        Object[] objArr33 = new Object[1];
                        charlie((char) (((50926 | i166) << 1) - (i166 ^ 50926)), (Process.getThreadPriority(0) + 20) >> 6, "Ềטּ깚袐䭤䭌㖀面Ѻ廿㪷猆\uee55ࣩ놏\uffe7", "ꎰ\ud837\uefc1ꗆ", objArr33);
                        String str19 = (String) objArr33[0];
                        Object[] objArr34 = new Object[1];
                        charlie((char) (0 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "뛍详鞬ꓻ퀸挚鹃댬\uf20e릵", "蝹\ue2d2\udae9鸝", objArr34);
                        String str20 = (String) objArr34[0];
                        int i167 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int i168 = (1064826438 & i167) + (i167 | 1064826438);
                        int i169 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                        Object[] objArr35 = new Object[1];
                        delta(i168, ((i169 | (-45)) << 1) - (i169 ^ (-45)), View.MeasureSpec.getMode(0) - 1024869252, (short) ((-127) - (Process.myTid() >> 22)), (byte) Color.blue(0), objArr35);
                        String str21 = (String) objArr35[0];
                        int i170 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int threadPriority = Process.getThreadPriority(0);
                        int i171 = threadPriority * (-344);
                        int i172 = (((-6880) | i171) << 1) - (i171 ^ (-6880));
                        int i173 = ~threadPriority;
                        int i174 = ((-21) ^ i173) | ((-21) & i173);
                        int i175 = ~i174;
                        int i176 = ~(((-21) ^ i4) | ((-21) & i4));
                        int i177 = (((i175 & i176) | (i175 ^ i176)) * 345) + i172;
                        int i178 = -(-(((~(i173 | 20)) | (~(((-21) ^ i17) | ((-21) & i17)))) * 345));
                        int i179 = (i177 & i178) + (i178 | i177);
                        int i180 = -(-((~((i174 ^ i4) | (i174 & i4))) * 345));
                        Object[] objArr36 = new Object[1];
                        charlie((char) ((i170 ^ 1) + ((i170 & 1) << 1)), ((i179 & i180) + (i180 | i179)) >> 6, "ਜ\ued3e\uf7cc婬礜檟\uee0fሺ纴⊌ꋉ\uf45f", "ᓴ⬎纝튦", objArr36);
                        String str22 = (String) objArr36[0];
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1064826439;
                        int i181 = -(-TextUtils.getCapsMode(str, 0, 0));
                        int i182 = (i181 & (-39)) + (i181 | (-39));
                        int i183 = (-1024869245) - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i184 = -View.getDefaultSize(0, 0);
                        Object[] objArr37 = new Object[1];
                        delta(doubleTapTimeout, i182, i183, (short) ((i184 ^ (-33)) + ((i184 & (-33)) << 1)), (byte) View.resolveSizeAndState(0, 0, 0), objArr37);
                        String str23 = (String) objArr37[0];
                        int i185 = -(-TextUtils.getOffsetAfter(str, 0));
                        int i186 = (1064826441 ^ i185) + ((i185 & 1064826441) << 1);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) - 45;
                        int i187 = -Process.getGidForName(str);
                        int i188 = ((-1024869233) ^ i187) + ((i187 & (-1024869233)) << 1);
                        int i189 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr38 = new Object[1];
                        delta(i186, modifierMetaStateMask, i188, (short) ((i189 & (-128)) + (i189 | (-128))), (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr38);
                        String str24 = (String) objArr38[0];
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                        int i190 = ((-1599843150) & scrollBarSize) + (scrollBarSize | (-1599843150));
                        Object[] objArr39 = new Object[1];
                        charlie(touchSlop, i190, "ᱚ븝⤅\ud944㻙駯嵋", "눚ꑔ\uf0a0ᩯ", objArr39);
                        String str25 = (String) objArr39[0];
                        int lastIndexOf2 = TextUtils.lastIndexOf(str, '0', 0, 0);
                        int i191 = -Drawable.resolveOpacity(0, 0);
                        int i192 = (((-1849261104) | i191) << 1) - (i191 ^ (-1849261104));
                        Object[] objArr40 = new Object[1];
                        charlie((char) ((lastIndexOf2 ^ 1) + ((lastIndexOf2 & 1) << 1)), i192, "嵂퇩湒ꝫ䳼䨈\ueeef", "탅욃妑ᝲ", objArr40);
                        String str26 = (String) objArr40[0];
                        int trimmedLength = 1064826442 - TextUtils.getTrimmedLength(str);
                        int i193 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        int i194 = ((i193 | (-50)) << 1) - (i193 ^ (-50));
                        int deadChar2 = KeyEvent.getDeadChar(0, 0);
                        int i195 = deadChar2 * 46;
                        int i196 = ((100655860 | i195) << 1) - (i195 ^ 100655860);
                        int i197 = ~(1024869225 | i17);
                        int i198 = (((i197 & deadChar2) | (deadChar2 ^ i197)) * (-90)) + i196;
                        int i199 = ~((1024869225 ^ i4) | (1024869225 & i4));
                        int i200 = ~(((-1024869226) ^ deadChar2) | ((-1024869226) & deadChar2));
                        int i201 = -(-(((i199 & i200) | (i199 ^ i200)) * (-45)));
                        int i202 = (i198 ^ i201) + ((i198 & i201) << 1);
                        int i203 = (~((~deadChar2) | i4)) | 1024869225;
                        int i204 = ~((deadChar2 & i17) | (i17 ^ deadChar2));
                        int i205 = -(-(((i204 & i203) | (i203 ^ i204)) * 45));
                        int i206 = (i202 & i205) + (i205 | i202);
                        short s3 = (short) (45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                        int i207 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Object[] objArr41 = new Object[1];
                        delta(trimmedLength, i194, i206, s3, (byte) ((i207 & 1) + (i207 | 1)), objArr41);
                        String str27 = (String) objArr41[0];
                        int i208 = -(-AndroidCharacter.getMirror('0'));
                        Object[] objArr42 = new Object[1];
                        charlie((char) (((i208 | (-48)) << 1) - (i208 ^ (-48))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "䒊ﰓฆ\uf6a0뵸幰俴竺⩴䅛\ude9c\ud9ee\ua7efׯ貐훵擠䣄\uf7d2\uf04a", "ꆰ\uf394搔㰾", objArr42);
                        String str28 = (String) objArr42[0];
                        Object[] objArr43 = new Object[1];
                        charlie((char) (Gravity.getAbsoluteGravity(0, 0) + 18306), TextUtils.getTrimmedLength(str), "샥欧ᔃ⮊崟\ud8ee", "⳺搗芾\udd47", objArr43);
                        String str29 = (String) objArr43[0];
                        int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                        int i209 = (1064826442 & scrollBarSize2) + (scrollBarSize2 | 1064826442);
                        int i210 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i211 = ((i210 | (-52)) << 1) - (i210 ^ (-52));
                        int i212 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                        int i213 = ((-1024869225) & i212) + (i212 | (-1024869225));
                        int i214 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                        Object[] objArr44 = new Object[1];
                        delta(i209, i211, i213, (short) (((i214 | (-68)) << 1) - (i214 ^ (-68))), (byte) TextUtils.getOffsetAfter(str, 0), objArr44);
                        String str30 = (String) objArr44[0];
                        int i215 = 1064826441 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                        int i216 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i217 = (i216 & (-36)) + (i216 | (-36));
                        int i218 = (-1024869226) - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i219 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        Object[] objArr45 = new Object[1];
                        delta(i215, i217, i218, (short) ((i219 & (-49)) + (i219 | (-49))), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr45);
                        String str31 = (String) objArr45[0];
                        int i220 = 1064826444 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i221 = (-45) - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                        int indexOf3 = (-1024869209) - TextUtils.indexOf(str, str);
                        int i222 = -View.combineMeasuredStates(0, 0);
                        Object[] objArr46 = new Object[1];
                        delta(i220, i221, indexOf3, (short) ((i222 ^ 19) + ((i222 & 19) << 1)), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr46);
                        String str32 = (String) objArr46[0];
                        Object[] objArr47 = new Object[1];
                        charlie((char) View.MeasureSpec.getMode(0), TextUtils.indexOf(str, str, 0, 0), "ᇨ㤺ㆅ士\udaa9\uf1a2ဂ쒴ӿ\uf717", "㯯獲䉛⤧", objArr47);
                        String str33 = (String) objArr47[0];
                        int i223 = 1064826442 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i224 = -KeyEvent.getDeadChar(0, 0);
                        Object[] objArr48 = new Object[1];
                        delta(i223, (i224 ^ (-42)) + ((i224 & (-42)) << 1), (-1024869201) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (36 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) View.MeasureSpec.getSize(0), objArr48);
                        String str34 = (String) objArr48[0];
                        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                        int i225 = ((-1064777821) ^ combineMeasuredStates2) + ((combineMeasuredStates2 & (-1064777821)) << 1);
                        Object[] objArr49 = new Object[1];
                        charlie((char) ((-TextUtils.indexOf((CharSequence) str, '0', 0)) - 1), i225, "\ue693\ue314᱃ᅀ춷ꓤᴐ\ue3a8\udceb巇ᨦ", "ꎾ裇ダᳪ", objArr49);
                        String str35 = (String) objArr49[0];
                        int i226 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int i227 = (1064826444 ^ i226) + ((i226 & 1064826444) << 1);
                        int i228 = -Color.argb(0, 0, 0, 0);
                        int i229 = (i228 ^ (-38)) + ((i228 & (-38)) << 1);
                        int i230 = -TextUtils.getOffsetBefore(str, 0);
                        int i231 = (((-1024869191) | i230) << 1) - (i230 ^ (-1024869191));
                        int lastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0);
                        Object[] objArr50 = new Object[1];
                        delta(i227, i229, i231, (short) ((lastIndexOf3 & (-100)) + (lastIndexOf3 | (-100))), (byte) Color.argb(0, 0, 0, 0), objArr50);
                        String str36 = (String) objArr50[0];
                        int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                        int i232 = (1064826444 & tapTimeout) + (tapTimeout | 1064826444);
                        int i233 = -(-ExpandableListView.getPackedPositionType(0L));
                        int i234 = (i233 & (-39)) + (i233 | (-39));
                        int myTid = (Process.myTid() >> 22) - 1024869177;
                        int indexOf4 = TextUtils.indexOf(str, str, 0);
                        int i235 = (indexOf4 * 471) - 44745;
                        int i236 = ((indexOf4 ^ (-95)) | (indexOf4 & (-95))) * (-470);
                        int i237 = (i235 ^ i236) + ((i235 & i236) << 1);
                        int i238 = ~indexOf4;
                        int i239 = ~((i238 & 94) | (i238 ^ 94));
                        int i240 = ~((94 ^ i4) | (94 & i4));
                        int i241 = (i239 & i240) | (i239 ^ i240);
                        int i242 = i17 | indexOf4;
                        int i243 = ~((i242 & (-95)) | (i242 ^ (-95)));
                        int i244 = ((i241 & i243) | (i241 ^ i243)) * (-470);
                        int i245 = (i237 & i244) + (i244 | i237);
                        int i246 = (94 ^ indexOf4) | (94 & indexOf4);
                        int i247 = ~((i246 & i4) | (i246 ^ i4));
                        int i248 = (indexOf4 & i17) | (i17 ^ indexOf4);
                        int i249 = ~((i248 & (-95)) | (i248 ^ (-95)));
                        Object[] objArr51 = new Object[1];
                        delta(i232, i234, myTid, (short) ((((i249 & i247) | (i247 ^ i249)) * 470) + i245), (byte) TextUtils.getOffsetAfter(str, 0), objArr51);
                        String[] strArr6 = {str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, (String) objArr51[0]};
                        char normalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int indexOf5 = TextUtils.indexOf((CharSequence) str, '0', 0);
                        int i250 = (((-1716522125) | indexOf5) << 1) - (indexOf5 ^ (-1716522125));
                        Object[] objArr52 = new Object[1];
                        charlie(normalizeMetaState, i250, "꩐Ὗ濴ᮻᵄꘘ耡ኻ旺\ueabaꏖ", "牱꿳墙\udab3", objArr52);
                        Object[] objArr53 = {(String) objArr52[0]};
                        D8871 = uH18377.D8871(i20);
                        if (D8871 == null) {
                            int i251 = 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int mode2 = View.MeasureSpec.getMode(0) + 3158;
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58074);
                            byte b24 = (byte) (i5 - 3);
                            byte b25 = (byte) (b24 - 1);
                            Object[] objArr54 = new Object[1];
                            bravo(b24, b25, (byte) (b25 + 1), objArr54);
                            D8871 = uH18377.setPivotYN16904(i251, mode2, minimumFlingVelocity, 424179844, false, (String) objArr54[0], new Class[]{String.class});
                        }
                        invoke = ((Method) D8871).invoke(null, objArr53);
                        if (invoke != null) {
                            int i252 = -TextUtils.indexOf((CharSequence) str, '0');
                            int i253 = (i252 & 1064826440) + (i252 | 1064826440);
                            int threadPriority2 = (-47) - ((Process.getThreadPriority(0) + 20) >> 6);
                            int i254 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            Object[] objArr55 = new Object[1];
                            delta(i253, threadPriority2, (i254 & (-1024869349)) + (i254 | (-1024869349)), (short) ((-25) - KeyEvent.normalizeMetaState(0)), (byte) TextUtils.getTrimmedLength(str), objArr55);
                            String str37 = (String) objArr55[0];
                            int i255 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int i256 = (-46) - (~(-TextUtils.indexOf(str, str)));
                            int offsetBefore = TextUtils.getOffsetBefore(str, 0);
                            int i257 = -(Process.myTid() >> 22);
                            Object[] objArr56 = new Object[1];
                            delta((i255 & 1064826430) + (i255 | 1064826430), i256, ((offsetBefore | (-1024869345)) << 1) - ((-1024869345) ^ offsetBefore), (short) (((i257 | 13) << 1) - (i257 ^ 13)), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr56);
                            Object[] objArr57 = {invoke, new String[]{str37, (String) objArr56[0]}};
                            Object D887114 = uH18377.D8871(-1363379003);
                            if (D887114 == null) {
                                int lastIndexOf4 = TextUtils.lastIndexOf(str, '0', 0) + 53;
                                int i258 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1414;
                                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3047);
                                byte b26 = (byte) (i5 - 4);
                                byte b27 = b26;
                                Object[] objArr58 = new Object[1];
                                bravo(b26, b27, b27, objArr58);
                                D887114 = uH18377.setPivotYN16904(lastIndexOf4, i258, maximumDrawingCacheSize, 1896341008, false, (String) objArr58[0], new Class[]{String.class, String[].class});
                            }
                            long longValue6 = ((Long) ((Method) D887114).invoke(null, objArr57)).longValue();
                            long j47 = -901608641;
                            long j48 = 433;
                            long j49 = j47 ^ j5;
                            long myUid = Process.myUid();
                            long j50 = -433;
                            long j51 = (j48 * (((longValue6 | j47) ^ j5) | ((j49 | myUid) ^ j5))) + ((j49 | (((longValue6 ^ j5) | myUid) ^ j5)) * j50) + ((((j49 | (myUid ^ j5)) | longValue6) ^ j5) * j48) + (434 * longValue6) + ((-432) * j47) + 1691736264;
                            int elapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                            int i259 = ~elapsedRealtime2;
                            int i260 = ((int) (j51 >> 32)) & ((((~(elapsedRealtime2 | (-1762180974))) | 307642498) * 49) + (((~(i259 | 324954562)) | (-1762180974) | (~((-324954563) | elapsedRealtime2))) * (-49)) + (((~((-1762180974) | i259)) | 17312064) * 98) + 1799278493);
                            int tango = ao.ad.tango(975249673);
                            int i261 = ((int) j51) & (((tango | (-1118179993)) * 591) + (((~((-1118179993) | (~tango))) | (-1739560894)) * (-591)) + 693848554);
                            if (((i260 & i261) | (i260 ^ i261)) != 0) {
                                char offsetAfter = (char) TextUtils.getOffsetAfter(str, 0);
                                int i262 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i263 = ((i262 | (-2126516174)) << 1) - (i262 ^ (-2126516174));
                                Object[] objArr59 = new Object[1];
                                charlie(offsetAfter, i263, "䜣卿盷﨏生⭍㼌Ⓠ掲\udd93⍽궴쀎㻫猃褩≎櫬ꎅﯥఌ㷖폒", "㈛㿰膁ᅒ", objArr59);
                                Object[] objArr60 = {(String) objArr59[0]};
                                Object D887115 = uH18377.D8871(i20);
                                if (D887115 == null) {
                                    int myTid2 = 52 - (Process.myTid() >> 22);
                                    int argb2 = Color.argb(0, 0, 0, 0) + 3158;
                                    char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 58075);
                                    byte b28 = (byte) (i5 - 3);
                                    byte b29 = (byte) (b28 - 1);
                                    Object[] objArr61 = new Object[1];
                                    bravo(b28, b29, (byte) (b29 + 1), objArr61);
                                    D887115 = uH18377.setPivotYN16904(myTid2, argb2, modifierMetaStateMask2, 424179844, false, (String) objArr61[0], new Class[]{String.class});
                                }
                                Object invoke4 = ((Method) D887115).invoke(null, objArr60);
                                int i264 = 1064826440 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))));
                                int myTid3 = Process.myTid() >> 22;
                                int i265 = (myTid3 ^ (-23)) + ((myTid3 & (-23)) << 1);
                                int i266 = -TextUtils.indexOf((CharSequence) str, '0');
                                Object[] objArr62 = new Object[1];
                                delta(i264, i265, (i266 & (-1024869339)) + (i266 | (-1024869339)), (short) (15 - (~(-(-View.getDefaultSize(0, 0))))), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), objArr62);
                                Object[] objArr63 = {(String) objArr62[0]};
                                Object D887116 = uH18377.D8871(i20);
                                if (D887116 == null) {
                                    int scrollBarSize3 = 52 - (ViewConfiguration.getScrollBarSize() >> 8);
                                    int lastIndexOf5 = TextUtils.lastIndexOf(str, '0') + 3159;
                                    char myTid4 = (char) (58074 - (Process.myTid() >> 22));
                                    byte b30 = (byte) (i5 - 3);
                                    byte b31 = (byte) (b30 - 1);
                                    strArr4 = strArr6;
                                    Object[] objArr64 = new Object[1];
                                    bravo(b30, b31, (byte) (b31 + 1), objArr64);
                                    D887116 = uH18377.setPivotYN16904(scrollBarSize3, lastIndexOf5, myTid4, 424179844, false, (String) objArr64[0], new Class[]{String.class});
                                } else {
                                    strArr4 = strArr6;
                                }
                                Object invoke5 = ((Method) D887116).invoke(null, objArr63);
                                if (invoke4 != null) {
                                    int i267 = kilo;
                                    juliet = (((i267 | 99) << 1) - (i267 ^ 99)) % 128;
                                    Object[] objArr65 = {invoke4, 42};
                                    Object D887117 = uH18377.D8871(i11);
                                    if (D887117 == null) {
                                        int indexOf6 = TextUtils.indexOf(str, str) + 51;
                                        int absoluteGravity2 = 1209 - Gravity.getAbsoluteGravity(0, 0);
                                        char indexOf7 = (char) (44355 - TextUtils.indexOf((CharSequence) str, '0'));
                                        byte b32 = (byte) (i5 - 4);
                                        byte b33 = b32;
                                        Object[] objArr66 = new Object[1];
                                        bravo(b32, b33, b33, objArr66);
                                        D887117 = uH18377.setPivotYN16904(indexOf6, absoluteGravity2, indexOf7, -1540336361, false, (String) objArr66[0], new Class[]{String.class, cls});
                                    }
                                    long longValue7 = ((Long) ((Method) D887117).invoke(null, objArr65)).longValue();
                                    long j52 = 203565241;
                                    long j53 = -783;
                                    long j54 = ((longValue7 ^ j5) * j53) + ((-782) * longValue7) + (784 * j52);
                                    long j55 = j52 ^ j5;
                                    long j56 = ((int) Runtime.getRuntime().totalMemory()) ^ j5;
                                    long j57 = (j53 * (((j55 | j56) | longValue7) ^ j5)) + j54;
                                    j13 = j50;
                                    long j58 = ((783 * (((j56 | longValue7) ^ j5) | j55)) + j57) - 211010271;
                                    int i268 = ((int) (j58 >> 32)) & ((((~((~ao.ad.tango(1120187422)) | (-1525154919))) | (-361079177)) * 494) + ((((-276824065) | r5) * 494) - 578286090));
                                    int tango2 = ao.ad.tango(1793948991);
                                    int foxtrot2 = ((int) j58) & A0.z.foxtrot((~(tango2 | 143904968)) | (~((~tango2) | 1293321441)) | 135430336, -370, (((~(143904968 | r5)) | (~(1293321441 | tango2))) * (-370)) - 635053777, -1430383232);
                                } else {
                                    j13 = j50;
                                }
                                if (invoke5 != null) {
                                    juliet = (kilo + 41) % 128;
                                    Object[] objArr67 = {invoke5, 42};
                                    Object D887118 = uH18377.D8871(i11);
                                    if (D887118 == null) {
                                        int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 51;
                                        int indexOf8 = TextUtils.indexOf((CharSequence) str, '0', 0) + 1210;
                                        char c16 = (char) (44356 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                        byte b34 = (byte) (i5 - 4);
                                        byte b35 = b34;
                                        Object[] objArr68 = new Object[1];
                                        bravo(b34, b35, b35, objArr68);
                                        D887118 = uH18377.setPivotYN16904(absoluteGravity3, indexOf8, c16, -1540336361, false, (String) objArr68[0], new Class[]{String.class, cls});
                                    }
                                    long longValue8 = ((Long) ((Method) D887118).invoke(null, objArr67)).longValue();
                                    long j59 = 1919283237;
                                    long maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                    long j60 = ((-50) * (j59 | maxMemory4)) + (i25 * longValue8) + (i10 * j59);
                                    long j61 = 50;
                                    long j62 = longValue8 ^ j5;
                                    long j63 = (((j59 ^ j5) | j62) | maxMemory4) ^ j5;
                                    long j64 = maxMemory4 ^ j5;
                                    long j65 = j62 | j64;
                                    long j66 = ((j61 * ((((j62 | j59) ^ j5) | (j65 ^ j5)) | ((j59 | j64) ^ j5))) + (((j63 | ((j65 | j59) ^ j5)) * j61) + j60)) - 1926728267;
                                    int i269 = ((int) (j66 >> 32)) & (((~(1744830463 | i4)) * 345) + (((~(1677705175 | i17)) | 564794754) * 345) + ((((~(1677705175 | i4)) | (-1744830464)) * 345) - 484646000));
                                    int i270 = ((int) j66) & ((((~((-1618636229) | i4)) | (-181409819)) * 529) + ((((~(i17 | (-1618636229))) | 1613391300) * 529) - 1520785380));
                                }
                            }
                        }
                        int i271 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        int i272 = (i271 & 1064826374) + (i271 | 1064826374);
                        int myPid2 = (-30) - (Process.myPid() >> 22);
                        int i273 = -TextUtils.getOffsetBefore(str, 0);
                        int i274 = ((i273 | (-1024869153)) << 1) - (i273 ^ (-1024869153));
                        int i275 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                        Object[] objArr69 = new Object[1];
                        delta(i272, myPid2, i274, (short) ((i275 & 59) + (i275 | 59)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr69);
                        Object[] objArr70 = {(String) objArr69[0]};
                        D88712 = uH18377.D8871(1553409481);
                        if (D88712 == null) {
                            byte b36 = (byte) (i5 - 4);
                            byte b37 = b36;
                            Object[] objArr71 = new Object[1];
                            bravo(b36, b37, b37, objArr71);
                            D88712 = uH18377.setPivotYN16904(51 - (KeyEvent.getMaxKeyCode() >> 16), 2279 - View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -2094233828, false, (String) objArr71[0], new Class[]{String.class});
                        }
                        long longValue9 = ((Long) ((Method) D88712).invoke(null, objArr70)).longValue();
                        long j67 = 1790493339;
                        long j68 = 471;
                        long j69 = -470;
                        long j70 = ((j67 | longValue9) * j69) + (j68 * longValue9) + (j68 * j67);
                        long j71 = longValue9 ^ j5;
                        long j72 = i4;
                        long j73 = j72 ^ j5;
                        long j74 = ((j73 | j67) | longValue9) ^ j5;
                        long j75 = ((470 * (j74 | (((j71 | j67) | j72) ^ j5))) + ((j69 * (((((j67 ^ j5) | j71) ^ j5) | ((j71 | j72) ^ j5)) | j74)) + j70)) - 1933140995;
                        int i276 = ((int) (j75 >> 32)) & (((i4 | (-2063466238)) * 54) + (((~((-2023243389) | i4)) | (-2063466238) | (~(2023243388 | i17))) * 54) + ((((~((-586016978) | i17)) | 545794128) * (-108)) - 2111456150));
                        int myUid2 = Process.myUid();
                        int i277 = ((int) j75) & ((((~(myUid2 | 1432689544)) | 4536865 | (~((~myUid2) | (-1432689545)))) * 45) + (((~(4536865 | myUid2)) | 4528640) * (-45)) + ((((~(4536865 | r4)) | (-1432689545)) * (-90)) - 1687905466));
                        j7 = (i276 & i277) | (i276 ^ i277);
                        int i278 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int trimmedLength2 = TextUtils.getTrimmedLength(str);
                        int i279 = (trimmedLength2 & (-1006181703)) + (trimmedLength2 | (-1006181703));
                        Object[] objArr72 = new Object[1];
                        charlie((char) (((i278 | 59449) << 1) - (i278 ^ 59449)), i279, "챧\uf84eך낙蛕呵箼搌즹ⷓﴜ䥷\ue26bﰴ栃⿑魓", "뤯ۢ㧄ꫨ", objArr72);
                        Object[] objArr73 = {(String) objArr72[0]};
                        D88713 = uH18377.D8871(1553409481);
                        if (D88713 == null) {
                            int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 51;
                            int i280 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2278;
                            char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                            byte b38 = (byte) (i5 - 4);
                            byte b39 = b38;
                            Object[] objArr74 = new Object[1];
                            bravo(b38, b39, b39, objArr74);
                            D88713 = uH18377.setPivotYN16904(edgeSlop3, i280, mirror, -2094233828, false, (String) objArr74[0], new Class[]{String.class});
                        }
                        long longValue10 = ((Long) ((Method) D88713).invoke(null, objArr73)).longValue();
                        long j76 = 1544374147;
                        long j77 = 370;
                        long j78 = -369;
                        long romeo3 = ao.ad.romeo();
                        long j79 = romeo3 ^ j5;
                        long j80 = ((j76 | longValue10 | j79) * j78) + (j77 * longValue10) + (j77 * j76);
                        long j81 = (j76 ^ j5) | j79;
                        long j82 = ((369 * (((longValue10 | j81) ^ j5) | ((((longValue10 ^ j5) | j76) ^ j5) | ((j76 | romeo3) ^ j5)))) + ((j78 * (longValue10 | (j81 ^ j5))) + j80)) - 1687021803;
                        int myTid5 = Process.myTid();
                        int i281 = ((int) (j82 >> 32)) & ((((~(myTid5 | (-1291703174))) | (~((~myTid5) | (-1566037712)))) * 627) + (((~(1566037711 | myTid5)) | (-1291703174)) * (-627)) + (((-285344843) | myTid5) * (-627)) + 635053320);
                        int i282 = ((int) j82) & ((((~(i17 | (-70816427))) | (~((-1366409984) | i4))) * 950) + (((~(i17 | (-1366409984))) | (~((-70816427) | i4))) * (-950)) + ((((~(70816426 | i17)) | (~(1366409983 | i4))) * 1900) - 1871736089));
                        j10 = (i281 & i282) | (i281 ^ i282);
                        if (j7 > 0 && j10 > 0) {
                            int i283 = kilo;
                            juliet = (i283 + 95) % 128;
                            if (j10 - 3 < j7) {
                                juliet = ((i283 ^ 91) + ((i283 & 91) << 1)) % 128;
                                int[] iArr3 = new int[1];
                                int[] iArr4 = new int[1];
                                int[] iArr5 = new int[1];
                                int i284 = (~(i4 & 247)) & (i4 | 247);
                                iArr5[0] = i4;
                                iArr4[0] = i284;
                                Object[] objArr75 = new Object[4];
                                objArr75[0] = iArr3;
                                objArr75[1] = iArr4;
                                objArr75[2] = iArr5;
                                objArr75[i13] = null;
                                int i285 = (((~(i4 | 469753759)) | (~((-40768145) | i4)) | (~((-277924873) | i17))) * 192) + (((~((-318693017) | i17)) | 40768144) * (-384)) + (((151060743 | i17) * (-192)) - 253520529);
                                int i286 = (i285 ^ 16) + ((i285 & 16) << 1);
                                int i287 = (i286 ^ i19) + ((i286 & i19) << 1);
                                int i288 = i287 ^ (i287 << 13);
                                int i289 = i288 ^ (i288 >>> 17);
                                int i290 = i289 << 5;
                                iArr3[0] = (i289 | i290) & (~(i289 & i290));
                                return objArr75;
                            }
                        }
                        int lastIndexOf6 = TextUtils.lastIndexOf(str, '0', 0);
                        int i291 = (lastIndexOf6 ^ 1064826375) + ((lastIndexOf6 & 1064826375) << 1);
                        int i292 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i293 = ((i292 | (-30)) << 1) - (i292 ^ (-30));
                        int i294 = (-1024869154) - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                        int i295 = -(-AndroidCharacter.getMirror('0'));
                        Object[] objArr76 = new Object[1];
                        delta(i291, i293, i294, (short) ((i295 & 11) + (i295 | 11)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr76);
                        Object[] objArr77 = {(String) objArr76[0]};
                        D88714 = uH18377.D8871(1553409481);
                        if (D88714 == null) {
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 51;
                            int resolveOpacity3 = 2279 - Drawable.resolveOpacity(0, 0);
                            char lastIndexOf7 = (char) (TextUtils.lastIndexOf(str, '0') + 1);
                            byte b40 = (byte) (i5 - 4);
                            byte b41 = b40;
                            Object[] objArr78 = new Object[1];
                            bravo(b40, b41, b41, objArr78);
                            D88714 = uH18377.setPivotYN16904(windowTouchSlop, resolveOpacity3, lastIndexOf7, -2094233828, false, (String) objArr78[0], new Class[]{String.class});
                        }
                        long longValue11 = ((Long) ((Method) D88714).invoke(null, objArr77)).longValue();
                        long j83 = 1158045533;
                        long j84 = (949 * longValue11) + ((-947) * j83);
                        long j85 = -948;
                        long j86 = j83 ^ j5;
                        long j87 = longValue11 ^ j5;
                        long freeMemory = (int) Runtime.getRuntime().freeMemory();
                        long j88 = ((948 * (j83 | j87)) + ((j85 * (((j86 | j87) | (freeMemory ^ j5)) ^ j5)) + (((j86 | ((j87 | freeMemory) ^ j5)) * j85) + j84))) - 1300693189;
                        int i296 = ((int) (j88 >> 32)) & ((((-169873537) | i4) * 465) + (((-171490521) | (~((-1608716932) | i4))) * 930) + (((~((-171490521) | i4)) | (-1608716932)) * (-465)) + 1280557577);
                        int foxtrot3 = ((int) j88) & A0.z.foxtrot((~(i23 | i4)) | 553735200, 446, (((~(995480804 | i17)) | (-995480806)) * 446) - 384374209, -1602807988);
                        j11 = (i296 & foxtrot3) | (i296 ^ foxtrot3);
                        int i297 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int i298 = -((byte) KeyEvent.getModifierMetaStateMask());
                        int alpha7 = C1211g1.alpha();
                        int i299 = i298 * (-589);
                        int i300 = (i299 ^ (-591)) + ((i299 & (-591)) << 1);
                        int i301 = ~alpha7;
                        int i302 = ~i301;
                        int i303 = ~i298;
                        int i304 = i302 | i303;
                        int i305 = ~(i301 | i298);
                        int i306 = (i304 & i305) | (i304 ^ i305);
                        int i307 = ~((~i303) | i303 | alpha7);
                        int i308 = ((i306 & i307) | (i306 ^ i307)) * 590;
                        int i309 = (i300 ^ i308) + ((i308 & i300) << 1);
                        int i310 = ((i302 ^ i303) | (i302 & i303) | (~((i298 & i301) | (i301 ^ i298)))) * (-1180);
                        int i311 = (i309 & i310) + (i310 | i309);
                        int i312 = ~((i303 ^ i301) | (i303 & i301));
                        int i313 = ~(i302 | i301);
                        int i314 = ((i312 & i313) | (i312 ^ i313)) * 590;
                        int i315 = ((i311 | i314) << 1) - (i314 ^ i311);
                        Object[] objArr79 = new Object[1];
                        charlie((char) ((i297 ^ 32030) + ((i297 & 32030) << 1)), i315, "還\uea37༾\uab1b", "\ude7a\ue3f6ṁ乽", objArr79);
                        Object[] objArr80 = {(String) objArr79[0]};
                        D88715 = uH18377.D8871(1553409481);
                        if (D88715 == null) {
                            int lastIndexOf8 = 50 - TextUtils.lastIndexOf(str, '0', 0, 0);
                            int resolveSize = View.resolveSize(0, 0) + 2279;
                            char indexOf9 = (char) TextUtils.indexOf(str, str, 0);
                            byte b42 = (byte) (i5 - 4);
                            byte b43 = b42;
                            Object[] objArr81 = new Object[1];
                            bravo(b42, b43, b43, objArr81);
                            D88715 = uH18377.setPivotYN16904(lastIndexOf8, resolveSize, indexOf9, -2094233828, false, (String) objArr81[0], new Class[]{String.class});
                        }
                        long longValue12 = ((Long) ((Method) D88715).invoke(null, objArr80)).longValue();
                        long j89 = 1753242004;
                        long j90 = j89 ^ j5;
                        long j91 = ((-191) * j90) + (192 * longValue12) + ((-381) * j89);
                        long j92 = 191;
                        long elapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                        long j93 = ((j92 * ((((elapsedRealtime3 ^ j5) | longValue12) ^ j5) | ((j90 | longValue12) ^ j5))) + (((j89 | ((longValue12 | elapsedRealtime3) ^ j5)) * j92) + j91)) - 1895889660;
                        int i316 = ((int) (j93 >> 32)) & ((((~(1686717974 | i17)) | 558178856) * 398) + (((~(1686717974 | i4)) | 558178856) * 398) + 671684412);
                        int myTid6 = Process.myTid();
                        int i317 = ~(646895893 | myTid6);
                        int i318 = ~myTid6;
                        int i319 = ((int) j93) & ((((~(myTid6 | 790330516)) | 152118400 | (~((-646895894) | i318))) * 904) + (((~(i318 | (-638212117))) | (~(799014293 | myTid6))) * 904) + (((i317 | (~((-790330517) | i318))) * (-1808)) - 621346099));
                        j12 = (i316 & i319) | (i316 ^ i319);
                        if (j11 > 0 && j12 > 0) {
                            int i320 = kilo;
                            juliet = ((i320 & 67) + (i320 | 67)) % 128;
                            if (j12 + 100 < j11) {
                                juliet = (i320 + 43) % 128;
                                int[] iArr6 = new int[1];
                                int[] iArr7 = new int[1];
                                int i321 = (~(i4 & 248)) & (i4 | 248);
                                iArr7[0] = i4;
                                iArr6[0] = i321;
                                Object[] objArr82 = new Object[4];
                                objArr82[0] = new int[1];
                                objArr82[1] = iArr6;
                                objArr82[2] = iArr7;
                                objArr82[i13] = null;
                                int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                int i322 = ~freeMemory2;
                                int i323 = (((~(i322 | (-825663729))) | 46665216) * 564) + ((~(freeMemory2 | (-268476609))) * 1128) + (((~(315141824 | i322)) | (-825663729) | (~((-315141825) | freeMemory2))) * (-564)) + 1341284411;
                                int i324 = ((i323 | 16) << 1) - (i323 ^ 16);
                                int i325 = (i324 & i19) + (i324 | i19);
                                int i326 = i325 << 13;
                                int i327 = (i326 & (~i325)) | ((~i326) & i325);
                                int i328 = i327 ^ (i327 >>> 17);
                                int i329 = i328 << 5;
                                ((int[]) objArr82[0])[0] = (i328 | i329) & (~(i328 & i329));
                                return objArr82;
                            }
                        }
                        int fadingEdgeLength = 1064826374 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i330 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i331 = (i330 & (-45)) + (i330 | (-45));
                        int i332 = (-1024869132) - (~(-TextUtils.getOffsetBefore(str, 0)));
                        int i333 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr83 = new Object[1];
                        delta(fadingEdgeLength, i331, i332, (short) ((i333 ^ 97) + ((i333 & 97) << 1)), (byte) ((-2) - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr83);
                        String str38 = (String) objArr83[0];
                        int i334 = -(ViewConfiguration.getScrollBarSize() >> 8);
                        int i335 = (i334 & 1064826374) + (i334 | 1064826374);
                        int i336 = -(-Gravity.getAbsoluteGravity(0, 0));
                        int i337 = (i336 ^ (-42)) + ((i336 & (-42)) << 1);
                        int i338 = -View.getDefaultSize(0, 0);
                        Object[] objArr84 = new Object[1];
                        delta(i335, i337, (i338 ^ (-1024869125)) + ((i338 & (-1024869125)) << 1), (short) ((-104) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) Color.blue(0), objArr84);
                        String str39 = (String) objArr84[0];
                        Object[] objArr85 = new Object[1];
                        charlie((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0), "ዢ쒪塢\ud8cb䳬頷醘ྛ⠤ӥᅯ㐔", "\udc3b\ue8aa쭁猶", objArr85);
                        String str40 = (String) objArr85[0];
                        int i339 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int alpha8 = C1211g1.alpha();
                        int i340 = i339 * 934;
                        int i341 = (i340 & (-280734260)) + (i340 | (-280734260));
                        int i342 = ~i339;
                        int i343 = ~alpha8;
                        int i344 = ~(i342 | i343);
                        int i345 = ((i344 & (-1064826374)) | ((-1064826374) ^ i344)) * (-933);
                        int i346 = (i341 & i345) + (i345 | i341);
                        int i347 = ~((i343 & (-1064826374)) | ((-1064826374) ^ i343));
                        int i348 = ~((-1064826374) | i339);
                        int i349 = ((i347 & i348) | (i347 ^ i348)) * 933;
                        int i350 = ((~(i339 | 1064826373)) * 933) + (i346 ^ i349) + ((i349 & i346) << 1);
                        int i351 = -ExpandableListView.getPackedPositionChild(0L);
                        int alpha9 = C1211g1.alpha();
                        int i352 = (i351 * (-963)) - 964;
                        int i353 = (i352 & (-40530)) + (i352 | (-40530));
                        int i354 = ~i351;
                        i27 = 41;
                        int i355 = ~((41 ^ alpha9) | (41 & alpha9));
                        int i356 = -(-(((i354 & i355) | (i354 ^ i355)) * (-964)));
                        int i357 = ((i353 | i356) << 1) - (i356 ^ i353);
                        int i358 = ((~((i351 & 41) | (41 ^ i351))) | (~((~alpha9) | 41))) * (-964);
                        int i359 = (i357 ^ i358) + ((i358 & i357) << 1);
                        int i360 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Object[] objArr86 = new Object[1];
                        delta(i350, i359, ((i360 | (-1024869115)) << 1) - (i360 ^ (-1024869115)), (short) ((-28) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) KeyEvent.keyCodeFromString(str), objArr86);
                        String str41 = (String) objArr86[0];
                        int scrollBarFadeDuration = 1064826374 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i361 = (-91) - (~(-(-AndroidCharacter.getMirror('0'))));
                        int keyRepeatTimeout4 = (-1024869104) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i362 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr87 = new Object[1];
                        delta(scrollBarFadeDuration, i361, keyRepeatTimeout4, (short) ((i362 & (-6)) + (i362 | (-6))), (byte) Color.blue(0), objArr87);
                        String str42 = (String) objArr87[0];
                        int i363 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                        int i364 = (i363 ^ 1064826374) + ((i363 & 1064826374) << 1);
                        int lastIndexOf9 = TextUtils.lastIndexOf(str, '0', 0, 0);
                        int i365 = (lastIndexOf9 ^ (-47)) + ((lastIndexOf9 & (-47)) << 1);
                        int i366 = -TextUtils.indexOf(str, str, 0);
                        int i367 = ((i366 | (-1024869094)) << 1) - (i366 ^ (-1024869094));
                        int lastIndexOf10 = TextUtils.lastIndexOf(str, '0', 0, 0);
                        int alpha10 = C1211g1.alpha();
                        int i368 = lastIndexOf10 * (-129);
                        int i369 = (i368 ^ (-11790)) + ((i368 & (-11790)) << 1);
                        int i370 = (~alpha10) | 89;
                        int i371 = (i369 - (~(-(-((~((i370 & lastIndexOf10) | (i370 ^ lastIndexOf10))) * 130))))) - 1;
                        int i372 = -(-((~(89 | lastIndexOf10)) * (-260)));
                        int i373 = (i371 ^ i372) + ((i372 & i371) << 1);
                        int i374 = ~((~lastIndexOf10) | (-90));
                        int i375 = (lastIndexOf10 & 89) | (89 ^ lastIndexOf10);
                        Object[] objArr88 = new Object[1];
                        delta(i364, i365, i367, (short) ((i373 - (~(((~((i375 & alpha10) | (i375 ^ alpha10))) | i374) * 130))) - 1), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr88);
                        String str43 = (String) objArr88[0];
                        int i376 = 1064826375 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i377 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                        i28 = 1;
                        int i378 = (i377 ^ (-49)) + ((i377 & (-49)) << 1);
                        int defaultSize = View.getDefaultSize(0, 0);
                        int i379 = ((defaultSize | (-1024869090)) << 1) - (defaultSize ^ (-1024869090));
                        int i380 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i381 = -MotionEvent.axisFromString(str);
                        Object[] objArr89 = new Object[1];
                        delta(i376, i378, i379, (short) ((i380 ^ (-31)) + ((i380 & (-31)) << 1)), (byte) ((i381 ^ (-1)) + (i381 << 1)), objArr89);
                        i29 = 0;
                        strArr = new String[]{str38, str39, str40, str41, str42, str43, (String) objArr89[0]};
                        i30 = 0;
                        while (true) {
                            if (i30 >= 7) {
                                i31 = i27;
                                i32 = 0;
                                break;
                            }
                            Object[] objArr90 = new Object[i28];
                            objArr90[i29] = strArr[i30];
                            Object D887119 = uH18377.D8871(1322889954);
                            if (D887119 == null) {
                                int i382 = 53 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int capsMode2 = 1467 - TextUtils.getCapsMode(str, i29, i29);
                                char mode3 = (char) View.MeasureSpec.getMode(i29);
                                byte b44 = (byte) (i5 - 4);
                                byte b45 = b44;
                                i31 = i27;
                                strArr3 = strArr;
                                Object[] objArr91 = new Object[1];
                                bravo(b44, b45, b45, objArr91);
                                D887119 = uH18377.setPivotYN16904(i382, capsMode2, mode3, -1855844297, false, (String) objArr91[0], new Class[]{String.class});
                            } else {
                                strArr3 = strArr;
                                i31 = i27;
                            }
                            long longValue13 = ((Long) ((Method) D887119).invoke(null, objArr90)).longValue();
                            long j94 = -113827083;
                            long j95 = -167;
                            i40 = i30;
                            long j96 = longValue13 ^ j5;
                            long tango3 = ao.ad.tango(1702090312);
                            long j97 = (168 * (j96 | (((tango3 ^ j5) | j94) ^ j5))) + ((-168) * (((j94 | longValue13) ^ j5) | ((j94 | tango3) ^ j5))) + (((((j94 ^ j5) | j96) ^ j5) | ((j96 | tango3) ^ j5)) * 336) + (j95 * longValue13) + (j95 * j94) + 1662596454;
                            int i383 = ((int) (j97 >> 32)) & ((((~((-336938049) | i4)) | 1077936138) * 366) + (((~(1799369487 | i4)) | (-1058371398)) * (-366)) + 1232716106);
                            int romeo4 = ao.ad.romeo();
                            int i384 = ((int) j97) & ((((~(romeo4 | 393707769)) | (-1830934180)) * 272) + (((~((-393707770) | romeo4)) | 86081697) * (-272)) + ((((~((-307626073) | (~romeo4))) | (~((-1744852483) | romeo4))) * (-272)) - 1925005019));
                            if (((i383 & i384) | (i383 ^ i384)) != 0) {
                                i32 = ((i40 | 90) << 1) - (i40 ^ 90);
                                break;
                            }
                            int i385 = ((i40 | (-14)) << 1) - (i40 ^ (-14));
                            i30 = ((i385 | 15) << 1) - (i385 ^ 15);
                            i27 = i31;
                            strArr = strArr3;
                            i29 = 0;
                            i28 = 1;
                        }
                        if (i32 != 0) {
                            int[] iArr8 = new int[1];
                            int[] iArr9 = new int[1];
                            iArr9[0] = i4;
                            iArr8[0] = i32 ^ i4;
                            Object[] objArr92 = new Object[4];
                            objArr92[0] = new int[1];
                            objArr92[1] = iArr8;
                            objArr92[2] = iArr9;
                            objArr92[i13] = null;
                            int romeo5 = ao.ad.romeo();
                            int i386 = (((~(romeo5 | (-38016465))) | (~((-968558593) | (~romeo5)))) * 338) + (((((-1006575057) | r2) | (~(968558592 | romeo5))) * (-338)) - 409430979);
                            int i387 = -(-((i386 & 16) + (i386 | 16)));
                            int i388 = (i387 & i19) + (i387 | i19);
                            int i389 = (i388 << 13) ^ i388;
                            int i390 = i389 >>> 17;
                            int i391 = (i389 | i390) & (~(i389 & i390));
                            int i392 = i391 << 5;
                            ((int[]) objArr92[0])[0] = (i391 | i392) & (~(i391 & i392));
                            return objArr92;
                        }
                        try {
                            int i393 = -Color.red(0);
                            int i394 = (i393 ^ 1064826441) + ((i393 & 1064826441) << 1);
                            int i395 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i396 = ((i395 | (-40)) << 1) - (i395 ^ (-40));
                            int i397 = -View.combineMeasuredStates(0, 0);
                            int alpha11 = C1211g1.alpha();
                            int i398 = i397 * (-574);
                            int i399 = (i398 ^ (-135663614)) + ((i398 & (-135663614)) << 1);
                            int i400 = ~i397;
                            int i401 = ~alpha11;
                            int i402 = ~((i400 ^ i401) | (i400 & i401));
                            int i403 = ~(1024869086 | alpha11);
                            int i404 = -(-(((i402 & i403) | (i402 ^ i403)) * 1150));
                            int i405 = (i399 & i404) + (i399 | i404);
                            int i406 = ~(((-1024869087) & i401) | (i401 ^ (-1024869087)));
                            int i407 = (((i406 & i403) | (i403 ^ i406)) * (-575)) + i405;
                            int i408 = ~((alpha11 & i400) | (i400 ^ alpha11));
                            int i409 = ~((i397 & i401) | (i401 ^ i397));
                            int i410 = ((i409 & i408) | (i408 ^ i409)) * 575;
                            int i411 = ((i407 | i410) << 1) - (i410 ^ i407);
                            int i412 = -(-TextUtils.lastIndexOf(str, '0', 0, 0));
                            Object[] objArr93 = new Object[1];
                            delta(i394, i396, i411, (short) (((i412 | 33) << 1) - (i412 ^ 33)), (byte) ((-2) - (~(-TextUtils.lastIndexOf(str, '0', 0, 0)))), objArr93);
                            try {
                                Object[] objArr94 = {(String) objArr93[0]};
                                Object D887120 = uH18377.D8871(i20);
                                if (D887120 == null) {
                                    int i413 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 51;
                                    int combineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 3158;
                                    char offsetAfter2 = (char) (TextUtils.getOffsetAfter(str, 0) + 58074);
                                    byte b46 = (byte) (i5 - 3);
                                    byte b47 = (byte) (b46 - 1);
                                    Object[] objArr95 = new Object[1];
                                    bravo(b46, b47, (byte) (b47 + 1), objArr95);
                                    D887120 = uH18377.setPivotYN16904(i413, combineMeasuredStates3, offsetAfter2, 424179844, false, (String) objArr95[0], new Class[]{String.class});
                                }
                                str2 = (String) ((Method) D887120).invoke(null, objArr94);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            if (str2 != null) {
                                int i414 = 1064826425 - (~(-Color.alpha(0)));
                                int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i415 = jumpTapTimeout * 319;
                                int i416 = ((i415 | 13314) << 1) - (i415 ^ 13314);
                                int i417 = ~jumpTapTimeout;
                                int i418 = (i31 | (~((i417 & i4) | (i417 ^ i4)))) * (-318);
                                int i419 = (i416 ^ i418) + ((i418 & i416) << 1);
                                int i420 = ~((i31 ^ i4) | (i31 & i4));
                                int i421 = (i17 ^ jumpTapTimeout) | (i17 & jumpTapTimeout);
                                int i422 = ~((i421 & (-42)) | (i421 ^ (-42)));
                                int i423 = (((i420 & i422) | (i420 ^ i422)) * 318) + i419;
                                int i424 = (i31 ^ i17) | (i31 & i17);
                                int i425 = ~((i424 & jumpTapTimeout) | (i424 ^ jumpTapTimeout));
                                int i426 = (jumpTapTimeout & (-42)) | (jumpTapTimeout ^ (-42));
                                int i427 = ~((i426 & i4) | (i426 ^ i4));
                                int i428 = -(-(((i427 & i425) | (i425 ^ i427)) * 318));
                                int i429 = (i423 ^ i428) + ((i428 & i423) << 1);
                                int i430 = -(Process.myTid() >> 22);
                                int i431 = i430 * 714;
                                int i432 = (i431 & (-437658920)) + (i431 | (-437658920));
                                int i433 = ~i430;
                                int i434 = ~((i433 ^ i17) | (i433 & i17));
                                int i435 = ~(i433 | (-1024869075));
                                int i436 = (i435 & i434) | (i434 ^ i435);
                                int i437 = (1024869074 ^ i430) | (1024869074 & i430);
                                int i438 = ~((i437 & i4) | (i437 ^ i4));
                                int i439 = i430 | 1024869074;
                                int i440 = ((~((i439 & i4) | (i439 ^ i4))) * 1426) + ((i432 - (~(-(-(((i436 & i438) | (i436 ^ i438)) * (-713)))))) - 1);
                                int i441 = -(-((~((1024869074 ^ i17) | (1024869074 & i17))) * 713));
                                int i442 = (i440 & i441) + (i440 | i441);
                                int i443 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                Object[] objArr96 = new Object[1];
                                delta(i414, i429, i442, (short) (((i443 | (-10)) << 1) - (i443 ^ (-10))), (byte) View.MeasureSpec.getSize(0), objArr96);
                                String[] strArr7 = {(String) objArr96[0]};
                                for (int i444 = 0; i444 <= 0; i444 = (i444 & (-21)) + (i444 | (-21)) + 22) {
                                    int i445 = juliet;
                                    int i446 = ((i445 | 117) << 1) - (i445 ^ 117);
                                    kilo = i446 % 128;
                                    if (i446 % 2 == 0) {
                                        str2.contains(strArr7[i444]);
                                        throw null;
                                    }
                                    if (!str2.contains(strArr7[i444])) {
                                    }
                                }
                                i33 = juliet + 33;
                                kilo = i33 % 128;
                                i34 = 0;
                                if (i34 != 0) {
                                    int[] iArr10 = new int[1];
                                    int[] iArr11 = new int[1];
                                    int[] iArr12 = new int[1];
                                    int i447 = ~(i4 & i34);
                                    iArr12[0] = i4;
                                    iArr11[0] = (i34 | i4) & i447;
                                    Object[] objArr97 = new Object[4];
                                    objArr97[0] = iArr10;
                                    objArr97[1] = iArr11;
                                    objArr97[2] = iArr12;
                                    objArr97[i13] = null;
                                    int foxtrot4 = A0.z.foxtrot((~(i4 | (-388290271))) | (~(i17 | 122231633)), 333, (((~((-388290271) | i17)) | (~(i4 | 122231633))) * 333) + 2107309331, i21);
                                    int i448 = (foxtrot4 & i19) + (foxtrot4 | i19);
                                    int i449 = i448 << 13;
                                    int i450 = (i449 | i448) & (~(i448 & i449));
                                    int i451 = i450 >>> 17;
                                    int i452 = ((~i450) & i451) | ((~i451) & i450);
                                    int i453 = i452 << 5;
                                    iArr10[0] = ((~i452) & i453) | ((~i453) & i452);
                                    return objArr97;
                                }
                                int i454 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int i455 = (i454 & 1064826440) + (i454 | 1064826440);
                                int i456 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i457 = (i456 & (-40)) + (i456 | (-40));
                                int edgeSlop4 = ViewConfiguration.getEdgeSlop() >> 16;
                                int i458 = (edgeSlop4 & (-1024869087)) + (edgeSlop4 | (-1024869087));
                                short s9 = (short) (32 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                                int i459 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                Object[] objArr98 = new Object[1];
                                delta(i455, i457, i458, s9, (byte) ((i459 ^ (-1)) + (i459 << 1)), objArr98);
                                Object[] objArr99 = {(String) objArr98[0]};
                                Object D887121 = uH18377.D8871(i20);
                                if (D887121 == null) {
                                    int i460 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51;
                                    int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 3158;
                                    char size2 = (char) (58074 - View.MeasureSpec.getSize(0));
                                    byte b48 = (byte) (i5 - 3);
                                    byte b49 = (byte) (b48 - 1);
                                    Object[] objArr100 = new Object[1];
                                    bravo(b48, b49, (byte) (b49 + 1), objArr100);
                                    D887121 = uH18377.setPivotYN16904(i460, edgeSlop5, size2, 424179844, false, (String) objArr100[0], new Class[]{String.class});
                                }
                                Object invoke6 = ((Method) D887121).invoke(null, objArr99);
                                if (invoke6 != null) {
                                    int i461 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                    int i462 = (i461 ^ 1064826426) + ((i461 & 1064826426) << 1);
                                    int i463 = -(-Color.green(0));
                                    Object[] objArr101 = new Object[1];
                                    delta(i462, (i463 & (-42)) + (i463 | (-42)), (-1024869076) - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (short) ((-11) - View.MeasureSpec.getSize(0)), (byte) Gravity.getAbsoluteGravity(0, 0), objArr101);
                                    Object[] objArr102 = {invoke6, new String[]{(String) objArr101[0]}};
                                    Object D887122 = uH18377.D8871(-1363379003);
                                    if (D887122 == null) {
                                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52;
                                        int myTid7 = (Process.myTid() >> 22) + 1415;
                                        char absoluteGravity4 = (char) (3047 - Gravity.getAbsoluteGravity(0, 0));
                                        byte b50 = (byte) (i5 - 4);
                                        byte b51 = b50;
                                        Object[] objArr103 = new Object[1];
                                        bravo(b50, b51, b51, objArr103);
                                        D887122 = uH18377.setPivotYN16904(maximumFlingVelocity, myTid7, absoluteGravity4, 1896341008, false, (String) objArr103[0], new Class[]{String.class, String[].class});
                                    }
                                    long longValue14 = ((Long) ((Method) D887122).invoke(null, objArr102)).longValue();
                                    long j98 = -1225076457;
                                    long j99 = -406;
                                    long j100 = longValue14 ^ j5;
                                    long j101 = (HttpConstants.HTTP_NOT_ACCEPTABLE * (((j73 | longValue14) ^ j5) | (((j98 ^ j5) | j72) ^ j5))) + (j99 * (((j100 | j73) | j98) ^ j5)) + ((((j100 | j72) ^ j5) | (((j73 | j98) | longValue14) ^ j5)) * j99) + (HttpConstants.HTTP_PROXY_AUTH * longValue14) + ((-405) * j98) + 2015204080;
                                    int i464 = ((int) (j101 >> 32)) & ((((~((-268977413) | i17)) | (~((-187085465) | i4))) * 318) + (((~((-1893289288) | i4)) | (~((-187085465) | i17))) * 318) + (((~(456062876 | i4)) | (-1893289288)) * (-318)) + 1667547762);
                                    int i465 = ((int) j101) & ((((~((-1759203291) | i4)) | 18878497 | (~(1098537595 | i17))) * 904) + (((~((-1079659099) | i4)) | (~(1778081787 | i17))) * 904) + ((((~((-1098537596) | i4)) | (~(1759203290 | i17))) * (-1808)) - 1678560547));
                                    if (((i464 & i465) | (i464 ^ i465)) != 1) {
                                        int i466 = juliet;
                                        kilo = (((i466 | 7) << 1) - (i466 ^ 7)) % 128;
                                        int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 1064826374;
                                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                        Object[] objArr104 = new Object[1];
                                        delta(pressedStateDuration4, ((packedPositionChild2 | (-40)) << 1) - (packedPositionChild2 ^ (-40)), (-1024869025) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((-5) - View.resolveSize(0, 0)), (byte) (0 - (~TextUtils.lastIndexOf(str, '0'))), objArr104);
                                        String str44 = (String) objArr104[0];
                                        Object[] objArr105 = new Object[1];
                                        charlie((char) (15196 - (~(-(-Drawable.resolveOpacity(0, 0))))), ViewConfiguration.getJumpTapTimeout() >> 16, "㐠\u0ff0ꭻ♉\u197a䷸裛糤ꁭ㲚㒒檃늭\udf08岨碌", "\uf60c\ue52a嵸踻", objArr105);
                                        String str45 = (String) objArr105[0];
                                        char c17 = (char) (23011 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
                                        int i467 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        int i468 = ((i467 | (-1891194488)) << 1) - (i467 ^ (-1891194488));
                                        Object[] objArr106 = new Object[1];
                                        charlie(c17, i468, "\udc40\ude17上ﶾࢸ䊣翢⌐稞Ⲝ↗ൗꔈ슇風え츂", "表䚩\ue48fꅙ", objArr106);
                                        String str46 = (String) objArr106[0];
                                        int i469 = -TextUtils.getOffsetAfter(str, 0);
                                        int i470 = (i469 & 1064826374) + (i469 | 1064826374);
                                        int myTid8 = (Process.myTid() >> 22) - 47;
                                        int i471 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        int i472 = (i471 ^ (-1024869015)) + ((i471 & (-1024869015)) << 1);
                                        int i473 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        int i474 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i475 = i474 * 881;
                                        int i476 = ((i475 | 881) << 1) - (i475 ^ 881);
                                        int i477 = ~i474;
                                        int i478 = ~((i477 ^ (-2)) | (i477 & (-2)));
                                        int i479 = ~((i477 ^ i4) | (i477 & i4));
                                        int i480 = ((i478 & i479) | (i478 ^ i479) | (~((i23 ^ i4) | (i23 & i4)))) * (-880);
                                        int i481 = ((i476 | i480) << 1) - (i476 ^ i480);
                                        int i482 = ~((i477 & i17) | (i477 ^ i17));
                                        int i483 = ~((i474 & i4) | (i474 ^ i4));
                                        int i484 = ((i482 & 1) | (i482 ^ 1) | i483) * (-880);
                                        byte b52 = (byte) ((i483 * 880) + (((i481 | i484) << 1) - (i484 ^ i481)));
                                        Object[] objArr107 = new Object[1];
                                        delta(i470, myTid8, i472, (short) ((i473 ^ (-57)) + ((i473 & (-57)) << 1)), b52, objArr107);
                                        String str47 = (String) objArr107[0];
                                        int i485 = -(-Process.getGidForName(str));
                                        int i486 = (i485 ^ 1064826375) + ((i485 & 1064826375) << 1);
                                        int i487 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        int i488 = (i487 & (-42)) + (i487 | (-42));
                                        int rgb = Color.rgb(0, 0, 0);
                                        Object[] objArr108 = new Object[1];
                                        delta(i486, i488, (rgb & (-1008091948)) + (rgb | (-1008091948)), (short) (1 - (~KeyEvent.normalizeMetaState(0))), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr108);
                                        String str48 = (String) objArr108[0];
                                        int i489 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                        int i490 = ((i489 | 1064826373) << 1) - (i489 ^ 1064826373);
                                        int axisFromString = (-37) - MotionEvent.axisFromString(str);
                                        int indexOf10 = (-1024869011) - TextUtils.indexOf((CharSequence) str, '0', 0);
                                        int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                        Object[] objArr109 = new Object[1];
                                        delta(i490, axisFromString, indexOf10, (short) ((windowTouchSlop2 ^ (-103)) + ((windowTouchSlop2 & (-103)) << 1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr109);
                                        String str49 = (String) objArr109[0];
                                        int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                        int i491 = ((resolveSizeAndState2 | 1064826374) << 1) - (resolveSizeAndState2 ^ 1064826374);
                                        int i492 = (-33) - (~(ViewConfiguration.getPressedStateDuration() >> 16));
                                        int i493 = -(-View.resolveSize(0, 0));
                                        int i494 = (i493 ^ (-1024868994)) + ((i493 & (-1024868994)) << 1);
                                        int i495 = -(-KeyEvent.normalizeMetaState(0));
                                        Object[] objArr110 = new Object[1];
                                        delta(i491, i492, i494, (short) ((i495 & (-35)) + (i495 | (-35))), (byte) (ViewConfiguration.getScrollBarSize() >> 8), objArr110);
                                        String str50 = (String) objArr110[0];
                                        int normalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 1064826374;
                                        int i496 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                        int i497 = ((i496 | (-37)) << 1) - (i496 ^ (-37));
                                        int i498 = -(-(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                        int i499 = (i498 ^ (-1024868975)) + ((i498 & (-1024868975)) << 1);
                                        int i500 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                        Object[] objArr111 = new Object[1];
                                        delta(normalizeMetaState2, i497, i499, (short) ((i500 ^ 57) + ((i500 & 57) << 1)), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr111);
                                        String str51 = (String) objArr111[0];
                                        char makeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int i501 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                                        int i502 = ((i501 | (-55888610)) << 1) - (i501 ^ (-55888610));
                                        Object[] objArr112 = new Object[1];
                                        charlie(makeMeasureSpec, i502, "쒌佱哌䏘녭⼱짗\uec49\ue38c\udedeᾂ㙴埓⮋\uf5f3\ue32d\uf3a2쎔ﶃ⨍洴\uf868ᅏ纏끰", "Ụꬵ韼ꕈ", objArr112);
                                        String str52 = (String) objArr112[0];
                                        int combineMeasuredStates4 = 1064826374 - View.combineMeasuredStates(0, 0);
                                        int lastIndexOf11 = TextUtils.lastIndexOf(str, '0', 0, 0);
                                        int i503 = (lastIndexOf11 ^ (-39)) + ((lastIndexOf11 & (-39)) << 1);
                                        int i504 = -TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                        Object[] objArr113 = new Object[1];
                                        delta(combineMeasuredStates4, i503, (i504 ^ (-1024868960)) + ((i504 & (-1024868960)) << 1), (short) ((-41) - ImageFormat.getBitsPerPixel(0)), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr113);
                                        String str53 = (String) objArr113[0];
                                        int i505 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                                        int i506 = (i505 ^ 221446814) + ((i505 & 221446814) << 1);
                                        Object[] objArr114 = new Object[1];
                                        charlie((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), i506, "ᓦ盠쨕鯾ƣ\udc41慿鈺\udad7", "鸯㌂\uf10d횖", objArr114);
                                        String str54 = (String) objArr114[0];
                                        int i507 = 1064826373 - (~View.MeasureSpec.getSize(0));
                                        int i508 = -KeyEvent.normalizeMetaState(0);
                                        int i509 = (i508 ^ (-45)) + ((i508 & (-45)) << 1);
                                        int i510 = -(-View.getDefaultSize(0, 0));
                                        int i511 = (i510 & (-1024868947)) + (i510 | (-1024868947));
                                        int trimmedLength3 = TextUtils.getTrimmedLength(str);
                                        Object[] objArr115 = new Object[1];
                                        delta(i507, i509, i511, (short) (((trimmedLength3 | (-13)) << 1) - (trimmedLength3 ^ (-13))), (byte) View.resolveSizeAndState(0, 0, 0), objArr115);
                                        String[] strArr8 = {str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, (String) objArr115[0]};
                                        int i512 = 0;
                                        while (i512 < 12) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strArr8[i512]);
                                            int i513 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int deadChar3 = (-51) - KeyEvent.getDeadChar(0, 0);
                                            int i514 = -Process.getGidForName(str);
                                            Object[] objArr116 = new Object[1];
                                            delta((i513 ^ 1064826442) + ((i513 & 1064826442) << 1), deadChar3, (i514 & (-1024869226)) + (i514 | (-1024869226)), (short) ((-69) - (~(-Color.argb(0, 0, 0, 0)))), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr116);
                                            sb2.append((String) objArr116[0]);
                                            Object[] objArr117 = {sb2.toString()};
                                            Object D887123 = uH18377.D8871(1979478258);
                                            if (D887123 == null) {
                                                int keyRepeatTimeout5 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52;
                                                int i515 = 2952 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                char c18 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte b53 = (byte) (i5 - 3);
                                                byte b54 = (byte) (b53 + 1);
                                                strArr2 = strArr8;
                                                Object[] objArr118 = new Object[1];
                                                bravo(b53, b54, (byte) (b54 - 1), objArr118);
                                                D887123 = uH18377.setPivotYN16904(keyRepeatTimeout5, i515, c18, -1438133721, false, (String) objArr118[0], new Class[]{String.class});
                                            } else {
                                                strArr2 = strArr8;
                                            }
                                            long longValue15 = ((Long) ((Method) D887123).invoke(null, objArr117)).longValue();
                                            long j102 = -1175445233;
                                            long j103 = -167;
                                            int i516 = i512;
                                            long j104 = 168;
                                            long j105 = j102 ^ j5;
                                            long j106 = longValue15 ^ j5;
                                            long j107 = j105 | j106;
                                            long j108 = (j104 * (((j105 | j73) ^ j5) | ((j105 | longValue15) ^ j5) | (((j106 | j102) | j72) ^ j5))) + (((j107 | j72) ^ j5) * j104) + (((j107 ^ j5) | ((j106 | j73) ^ j5)) * j104) + (j103 * longValue15) + (j103 * j102) + 1950266539;
                                            int foxtrot5 = ((int) (j108 >> 32)) & A0.z.foxtrot((~(1751190779 | i4)) | (~((-313964369) | i4)), -1324, ((1749092523 | i17) * 1324) - 818884594, 1444983096);
                                            int i517 = ((int) j108) & ((((~(143066252 | i4)) | (~((-8651905) | i17))) * 765) + (((~(143066252 | i17)) | (-1302812062)) * 1530) + (((~(1302812061 | i17)) | (~((-1159745810) | i4)) | (~((-8651905) | i4))) * 765) + 600851373);
                                            if (((foxtrot5 & i517) | (foxtrot5 ^ i517)) != 0) {
                                                i35 = i516 + 110;
                                                break;
                                            }
                                            i512 = i516 + 1;
                                            strArr8 = strArr2;
                                        }
                                    }
                                }
                                i35 = 0;
                                if (i35 != 0) {
                                    int[] iArr13 = new int[1];
                                    int[] iArr14 = new int[1];
                                    int i518 = (~i35) & i4;
                                    iArr14[0] = i4;
                                    iArr13[0] = (i35 & i17) | i518;
                                    Object[] objArr119 = new Object[4];
                                    objArr119[0] = new int[1];
                                    objArr119[1] = iArr13;
                                    objArr119[2] = iArr14;
                                    objArr119[i13] = null;
                                    int freeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                    int i519 = (((~(freeMemory3 | 339466222)) | 578816016) * 116) + ((849988126 | freeMemory3) * 116) + ((~((~freeMemory3) | (-68294113))) * (-116)) + 1419523299;
                                    int i520 = (i519 ^ 16) + ((i519 & 16) << 1);
                                    int alpha12 = C1211g1.alpha();
                                    int i521 = i520 * 628;
                                    int i522 = (i521 & (-1207812936)) + (i521 | (-1207812936));
                                    int i523 = alpha12 | i19;
                                    int i524 = ~i520;
                                    int i525 = -(-(((i523 & i524) | (i523 ^ i524)) * (-627)));
                                    int i526 = (i522 & i525) + (i525 | i522);
                                    int i527 = ~(((-1406935431) & alpha12) | ((-1406935431) ^ alpha12));
                                    int i528 = ((i527 & i520) | (i520 ^ i527)) * (-627);
                                    int i529 = ((i526 | i528) << 1) - (i528 ^ i526);
                                    int i530 = ~alpha12;
                                    int i531 = (i529 - (~(((~(alpha12 | i520)) | (~((i530 & i19) | (i530 ^ i19)))) * 627))) - 1;
                                    int i532 = (i531 << 13) ^ i531;
                                    int i533 = i532 >>> 17;
                                    int i534 = ((~i532) & i533) | ((~i533) & i532);
                                    int i535 = i534 << 5;
                                    ((int[]) objArr119[0])[0] = ((~i534) & i535) | ((~i535) & i534);
                                    return objArr119;
                                }
                                long[] jArr = new long[1];
                                jArr[0] = 472001035;
                                int i536 = -((byte) KeyEvent.getModifierMetaStateMask());
                                int i537 = (i536 & 1064826373) + (i536 | 1064826373);
                                int i538 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i539 = (i538 & (-36)) + (i538 | (-36));
                                int i540 = -(-TextUtils.getOffsetBefore(str, 0));
                                int i541 = ((i540 | (-1024868940)) << 1) - (i540 ^ (-1024868940));
                                int deadChar4 = KeyEvent.getDeadChar(0, 0);
                                Object[] objArr120 = new Object[1];
                                delta(i537, i539, i541, (short) ((deadChar4 ^ 126) + ((deadChar4 & 126) << 1)), (byte) TextUtils.indexOf(str, str, 0, 0), objArr120);
                                String str55 = (String) objArr120[0];
                                Object[] objArr121 = new Object[4];
                                objArr121[i13] = jArr;
                                objArr121[2] = 1073741823L;
                                objArr121[1] = Integer.valueOf(i12);
                                objArr121[0] = str55;
                                Object D887124 = uH18377.D8871(130458176);
                                if (D887124 == null) {
                                    int lastIndexOf12 = 51 - TextUtils.lastIndexOf(str, '0', 0);
                                    int i542 = 2381 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    char green = (char) (Color.green(0) + 9779);
                                    byte b55 = (byte) (i5 - 4);
                                    byte b56 = b55;
                                    Object[] objArr122 = new Object[1];
                                    bravo(b55, b56, b56, objArr122);
                                    String str56 = (String) objArr122[0];
                                    Class[] clsArr5 = new Class[4];
                                    clsArr5[0] = String.class;
                                    clsArr5[1] = cls;
                                    clsArr5[2] = Long.TYPE;
                                    clsArr5[i13] = long[].class;
                                    D887124 = uH18377.setPivotYN16904(lastIndexOf12, i542, green, -662896491, false, str56, clsArr5);
                                }
                                long longValue16 = ((Long) ((Method) D887124).invoke(null, objArr121)).longValue();
                                long j109 = -37118787;
                                long freeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                long j110 = freeMemory4 ^ j5;
                                long j111 = longValue16 ^ j5;
                                long j112 = (757 * ((((j109 ^ j5) | j111) ^ j5) | ((j111 | j110) ^ j5) | (((j109 | longValue16) | freeMemory4) ^ j5))) + (1514 * (((j111 | j109) | freeMemory4) ^ j5)) + ((-757) * (j109 | j110)) + ((-756) * longValue16) + (758 * j109) + 890606224;
                                if (((((int) (j112 >> 32)) & A0.z.foxtrot(~(2112854591 | i17), -948, (((~(1013881375 | i4)) | 1843859509) * (-948)) - 2017485022, 1850443212)) | (((int) j112) & ((((~((-1692635507) | i17)) | 545358096) * 672) + (((~(1692635506 | i4)) | (~((-1165105380) | i17))) * (-672)) + (((~(1165105379 | i4)) | 1692635506) * 672) + 1260087221))) > 0) {
                                    i37 = 240;
                                    i36 = i17;
                                } else if (Build.VERSION.SDK_INT >= i24) {
                                    i36 = i17;
                                    i37 = 0;
                                } else {
                                    int myPid3 = (Process.myPid() >> 22) + 1064826418;
                                    int i543 = -((Process.getThreadPriority(0) + 20) >> 6);
                                    int i544 = (i543 ^ (-47)) + ((i543 & (-47)) << 1);
                                    int i545 = (-1024868925) - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                                    int i546 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i547 = -Color.rgb(0, 0, 0);
                                    Object[] objArr123 = new Object[1];
                                    delta(myPid3, i544, i545, (short) (((i546 | (-122)) << 1) - (i546 ^ (-122))), (byte) (((i547 | ShapeBuilder.DEFAULT_SHAPE_COLOR) << 1) - (i547 ^ ShapeBuilder.DEFAULT_SHAPE_COLOR)), objArr123);
                                    Matcher matcher = Pattern.compile((String) objArr123[0]).matcher(str);
                                    int absoluteGravity5 = Gravity.getAbsoluteGravity(0, 0);
                                    int i548 = -(Process.myTid() >> 22);
                                    int i549 = ((i548 | (-47)) << 1) - (i548 ^ (-47));
                                    int indexOf11 = (-1024868919) - TextUtils.indexOf(str, str, 0);
                                    int i550 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    Object[] objArr124 = new Object[1];
                                    delta(((absoluteGravity5 | 1064826374) << 1) - (absoluteGravity5 ^ 1064826374), i549, indexOf11, (short) ((i550 ^ (-39)) + ((i550 & (-39)) << 1)), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr124);
                                    File[] listFiles = new File((String) objArr124[0]).listFiles();
                                    if (listFiles != null) {
                                        int i551 = 0;
                                        int i552 = 0;
                                        while (i551 < listFiles.length && i552 < i13) {
                                            int i553 = kilo;
                                            int i554 = (i553 & 21) + (i553 | 21);
                                            juliet = i554 % 128;
                                            if (i554 % 2 != 0) {
                                                File file = listFiles[i551];
                                                throw null;
                                            }
                                            File file2 = listFiles[i551];
                                            if (file2 != null && file2.isDirectory()) {
                                                int i555 = juliet + 99;
                                                kilo = i555 % 128;
                                                if (i555 % 2 == 0) {
                                                    int i556 = 83 / 0;
                                                }
                                                cause = th.getCause();
                                                if (cause == null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                            long[] jArr2 = jArr;
                                            Matcher matcher2 = matcher;
                                            i36 = i17;
                                            i551 = ((i551 | 1) << 1) - (i551 ^ 1);
                                            jArr = jArr2;
                                            matcher = matcher2;
                                            i17 = i36;
                                            i15 = -1;
                                            i13 = 3;
                                        }
                                    }
                                    i36 = i17;
                                    f10 = 0.0f;
                                    i37 = 0;
                                    if (i37 != 0) {
                                        Object[] objArr125 = {new int[1], new int[]{i37 ^ i4}, new int[]{i4}, null};
                                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                        int i557 = 1406935429 - (~(-(-A0.z.foxtrot(~((~elapsedCpuTime3) | (-582366273)), -948, (((~(340280117 | elapsedCpuTime3)) | (-850802022)) * (-948)) + 941052979, -1504551596))));
                                        int i558 = (i557 << 13) ^ i557;
                                        int i559 = i558 >>> 17;
                                        int i560 = (i558 | i559) & (~(i558 & i559));
                                        int i561 = i560 << 5;
                                        ((int[]) objArr125[0])[0] = (i560 | i561) & (~(i560 & i561));
                                        return objArr125;
                                    }
                                    float f13 = f10;
                                    long[] jArr3 = {472001035};
                                    Object[] objArr126 = new Object[1];
                                    charlie((char) (TypedValue.complexToFraction(0, f13, f13) > f13 ? 1 : (TypedValue.complexToFraction(0, f13, f13) == f13 ? 0 : -1)), View.resolveSizeAndState(0, 0, 0), "\uf6b4淺찎慢ꁣ㝩樃郲\udcbf뀛쭬䛹搲湗┛옲㱐闼텳\u1756𢡄뜍", "캔됚悱탵", objArr126);
                                    try {
                                        bufferedInputStream = new BufferedInputStream(new FileInputStream((String) objArr126[0]));
                                        long j113 = 0;
                                        loop5: while (true) {
                                            try {
                                                int read = bufferedInputStream.read();
                                                if (read == -1) {
                                                    f11 = f13;
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Exception unused2) {
                                                    }
                                                    i38 = 0;
                                                    break;
                                                }
                                                f11 = f13;
                                                bufferedInputStream2 = bufferedInputStream;
                                                j113 = 1073741823 & (read ^ (j113 << i12));
                                                for (int i562 = 0; i562 < 1; i562++) {
                                                    try {
                                                        if (!(j113 != jArr3[i562])) {
                                                            i38 = i562 + 1;
                                                            try {
                                                                bufferedInputStream2.close();
                                                                break loop5;
                                                            } catch (Exception unused3) {
                                                            }
                                                        }
                                                    } catch (IOException unused4) {
                                                        if (bufferedInputStream2 != null) {
                                                            try {
                                                                bufferedInputStream2.close();
                                                            } catch (Exception unused5) {
                                                            }
                                                        }
                                                        i38 = -1;
                                                        if (!(i38 <= 0)) {
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        bufferedInputStream = bufferedInputStream2;
                                                        if (bufferedInputStream != null) {
                                                            try {
                                                                bufferedInputStream.close();
                                                                int i563 = kilo;
                                                                juliet = ((i563 & 7) + (i563 | 7)) % 128;
                                                            } catch (Exception unused6) {
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                bufferedInputStream = bufferedInputStream2;
                                                f13 = f11;
                                            } catch (IOException unused7) {
                                                f11 = f13;
                                                bufferedInputStream2 = bufferedInputStream;
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                    } catch (IOException unused8) {
                                        f11 = f13;
                                        bufferedInputStream2 = null;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        bufferedInputStream = null;
                                    }
                                    if (!(i38 <= 0)) {
                                        Object[] objArr127 = {new int[1], new int[]{(~(i4 & 242)) & (i4 | 242)}, new int[]{i4}, null};
                                        int i564 = ~((~ao.ad.tango(1090940160)) | (-382065135));
                                        int i565 = ((i564 | 556925968) * 970) + (((-938991103) | i564) * (-970)) + 1169909081;
                                        int i566 = 1406935429 - (~((i565 & 16) + (i565 | 16)));
                                        int i567 = i566 << 13;
                                        int i568 = (i567 | i566) & (~(i566 & i567));
                                        int i569 = i568 >>> 17;
                                        int i570 = ((~i568) & i569) | ((~i569) & i568);
                                        int i571 = i570 << 5;
                                        ((int[]) objArr127[0])[0] = ((~i570) & i571) | ((~i571) & i570);
                                        return objArr127;
                                    }
                                    Object D887125 = uH18377.D8871(-30259255);
                                    if (D887125 == null) {
                                        int gidForName3 = Process.getGidForName(str) + 53;
                                        int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 3520;
                                        char gidForName4 = (char) (Process.getGidForName(str) + 1);
                                        byte b57 = (byte) (i5 - 4);
                                        byte b58 = b57;
                                        Object[] objArr128 = new Object[1];
                                        bravo(b57, b58, b58, objArr128);
                                        D887125 = uH18377.setPivotYN16904(gidForName3, threadPriority3, gidForName4, 562685212, false, (String) objArr128[0], new Class[0]);
                                    }
                                    long longValue17 = ((Long) ((Method) D887125).invoke(null, null)).longValue();
                                    long j114 = -230968188;
                                    long j115 = j114 ^ j5;
                                    long j116 = 184;
                                    long j117 = longValue17 ^ j5;
                                    long j118 = ((j116 * (((longValue17 | j114) ^ j5) | (((j115 | j117) ^ j5) | ((j73 | j114) ^ j5)))) + ((((j114 | j117) | j73) * j116) + (((-368) * (longValue17 | j115)) + ((185 * longValue17) + ((-183) * j114))))) - 776871453;
                                    int i572 = ((int) (j118 >> 32)) & ((((~(557441132 | i4)) | (~(i36 | 1994667543))) * 959) + (((~(557441132 | i36)) | (~(1994667543 | i4))) * 959) + 778088933);
                                    int i573 = ((int) j118) & ((((-135267345) | i4) * 465) + (((-1578894395) | (~((-141667985) | i4))) * 930) + (((~((-1578894395) | i4)) | (-141667985)) * (-465)) + 899609883);
                                    if ((!(((i572 & i573) | (i572 ^ i573)) == 0) ? 'U' : (char) 2) != 'U') {
                                        Object D887126 = uH18377.D8871(-688378724);
                                        if (D887126 == null) {
                                            int lastIndexOf13 = 51 - TextUtils.lastIndexOf(str, '0', 0, 0);
                                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2588;
                                            char scrollDefaultDelay2 = (char) (14485 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                            byte b59 = (byte) (i5 - 4);
                                            byte b60 = b59;
                                            Object[] objArr129 = new Object[1];
                                            bravo(b59, b60, b60, objArr129);
                                            D887126 = uH18377.setPivotYN16904(lastIndexOf13, longPressTimeout, scrollDefaultDelay2, 155422281, false, (String) objArr129[0], new Class[0]);
                                        }
                                        long longValue18 = ((Long) ((Method) D887126).invoke(null, null)).longValue();
                                        long j119 = -857227594;
                                        long j120 = 164;
                                        long j121 = longValue18 ^ j5;
                                        long j122 = ((j120 * (((longValue18 | (j73 | j119)) ^ j5) | ((((j119 ^ j5) | j121) ^ j5) | ((j121 | j72) ^ j5)))) + (((j119 | j72) * j120) + (((-328) * (j119 | ((j73 | longValue18) ^ j5))) + (((-163) * longValue18) + (165 * j119))))) - 778387038;
                                        int i574 = ((((int) (j122 >> 32)) & (((((~(1396434271 | i4)) | (-1463543296)) | (~(i36 | (-1394197590)))) * 988) + ((((~(i36 | (-67109025))) | (~((-1394197590) | i4))) * 988) + (-647898082)))) | (((int) j122) & ((((~(912258463 | i4)) | 1168785705) * 70) + (((~(2013263295 | i4)) * 70) + ((((~(1945482422 | i4)) | 67780873) * (-140)) + (-748459509)))))) != 0 ? (~(i4 & 281)) & (i4 | 281) : i4;
                                        if (i574 != i4) {
                                            objArr = new Object[]{r3, new int[]{i574}, new int[]{i4}, null};
                                            int i575 = -(-((((~(i36 | 89617631)) | 402655488) * 560) + ((~((-71368848) | i4)) * (-560)) + (((~(i36 | 420904272)) * (-560)) - 326403329) + 16));
                                            int i576 = ((i575 | i19) << 1) - (i575 ^ i19);
                                            int i577 = (i576 << 13) ^ i576;
                                            int i578 = i577 >>> 17;
                                            int i579 = (i577 | i578) & (~(i577 & i578));
                                            int i580 = i579 << 5;
                                            int i581 = (i579 | i580) & (~(i579 & i580));
                                            c13 = 0;
                                            int[] iArr15 = {i581};
                                        } else {
                                            Object D887127 = uH18377.D8871(-1380029587);
                                            if (D887127 == null) {
                                                byte b61 = (byte) (i5 - 3);
                                                byte b62 = b61;
                                                Object[] objArr130 = new Object[1];
                                                bravo(b61, b62, b62, objArr130);
                                                D887127 = uH18377.setPivotYN16904(View.resolveSizeAndState(0, 0, 0) + 52, (ViewConfiguration.getEdgeSlop() >> 16) + 3622, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1912981944, false, (String) objArr130[0], new Class[0]);
                                            }
                                            long longValue19 = ((Long) ((Method) D887127).invoke(null, null)).longValue();
                                            long j123 = 978764270;
                                            long j124 = -949;
                                            long j125 = (950 * (((j73 | longValue19) ^ j5) | ((j123 | j72) ^ j5))) + ((-950) * (((j73 | j123) ^ j5) | ((longValue19 | j72) ^ j5))) + (1900 * ((((longValue19 ^ j5) | j73) ^ j5) | (((j123 ^ j5) | j72) ^ j5))) + (j124 * longValue19) + (j124 * j123) + 804223419;
                                            int i582 = ((int) (j125 >> 32)) & (((~((~Process.myTid()) | (-1101283593))) * HttpConstants.HTTP_NOT_IMPLEMENTED) + ((((~((-1101283593) | r2)) | 268502176) * HttpConstants.HTTP_NOT_IMPLEMENTED) - 1925643294));
                                            int i583 = (((~(i36 | (-1316857213))) | 1213269328) * (-1188)) + 1136187309;
                                            int i584 = 1213269328 | (~(1316857212 | i4));
                                            int i585 = ~(i36 | (-120369198));
                                            int i586 = ((int) j125) & ((((~(1316857212 | i36)) | 16781313 | i585) * 594) + ((i584 | i585) * 594) + i583);
                                            if (((i582 & i586) | (i582 ^ i586)) != 0) {
                                                juliet = (kilo + 49) % 128;
                                                objArr = new Object[]{r0, new int[]{(~(i4 & 268)) & (i4 | 268)}, new int[]{i4}, null};
                                                int i587 = 1406935429 - (~(-(-A0.z.foxtrot(((~(i36 | 520354981)) | (~(i36 | (-9833078)))) | (~((-520221825) | i4)), Smooth$Close.expectedVersionCode, ((((~((-520354982) | i4)) | (~(9833077 | i4))) | (~(i36 | (-9699921)))) * (-568)) + (((((~((-520354982) | i36)) | 520221824) | (~(9833077 | i36))) * (-1136)) - 1570813321), 16))));
                                                int i588 = i587 << 13;
                                                int i589 = (i588 | i587) & (~(i587 & i588));
                                                int i590 = i589 >>> 17;
                                                int i591 = (i589 | i590) & (~(i589 & i590));
                                                int i592 = i591 << 5;
                                                int i593 = (i591 | i592) & (~(i591 & i592));
                                                c13 = 0;
                                                int[] iArr16 = {i593};
                                            } else {
                                                Object D887128 = uH18377.D8871(-986684210);
                                                if (D887128 == null) {
                                                    int i594 = (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 52;
                                                    int blue = Color.blue(0) + 3622;
                                                    char c19 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                    byte b63 = (byte) (i5 - 4);
                                                    byte b64 = b63;
                                                    Object[] objArr131 = new Object[1];
                                                    bravo(b63, b64, b64, objArr131);
                                                    D887128 = uH18377.setPivotYN16904(i594, blue, c19, 445367835, false, (String) objArr131[0], new Class[0]);
                                                }
                                                long longValue20 = ((Long) ((Method) D887128).invoke(null, null)).longValue();
                                                long j126 = 717440755;
                                                long j127 = 765;
                                                long j128 = j126 ^ j5;
                                                long j129 = longValue20 ^ j5;
                                                long j130 = j128 | j129;
                                                long j131 = (j127 * (((j128 | j72) ^ j5) | (((j129 | j73) | j126) ^ j5))) + (1530 * ((j130 ^ j5) | ((j128 | j73) ^ j5))) + ((((j130 | j73) ^ j5) | (((j128 | longValue20) | j72) ^ j5) | (((j129 | j126) | j72) ^ j5)) * j127) + ((-764) * longValue20) + ((-1529) * j126) + 260380759;
                                                int romeo6 = ao.ad.romeo();
                                                int foxtrot6 = ((int) (j131 >> 32)) & A0.z.foxtrot(~((~romeo6) | (-1747605074)), -948, (((~(398524846 | romeo6)) | (-1835751258)) * (-948)) + 762356746, -1283335092);
                                                int i595 = ((int) j131) & ((((~((-1228014274) | i36)) | 135266369) * 672) + (((~(1228014273 | i4)) | (~((-1629726613) | i36))) * (-672)) + (((~(1629726612 | i4)) | 1228014273) * 672) + 1633622421);
                                                if (((foxtrot6 & i595) | (foxtrot6 ^ i595)) != 0) {
                                                    objArr = new Object[]{new int[1], new int[]{i4 ^ 266}, new int[]{i4}, null};
                                                    int myUid3 = Process.myUid();
                                                    int i596 = ~myUid3;
                                                    int i597 = ((myUid3 | (-71307361)) * 220) + (((~(i596 | (-223352176))) | 733874079) * (-440)) + (((~((-71307361) | i596)) | 581829264) * 220) + 646900499;
                                                    int i598 = -(-((i597 ^ 16) + ((i597 & 16) << 1)));
                                                    int i599 = (i598 & i19) + (i598 | i19);
                                                    int i600 = i599 << 13;
                                                    int i601 = (i600 | i599) & (~(i599 & i600));
                                                    int i602 = i601 >>> 17;
                                                    int i603 = ((~i601) & i602) | ((~i602) & i601);
                                                    int i604 = i603 << 5;
                                                    c4 = 0;
                                                    ((int[]) objArr[0])[0] = ((~i603) & i604) | ((~i604) & i603);
                                                    i39 = i36;
                                                } else {
                                                    Object D887129 = uH18377.D8871(-317201951);
                                                    if (D887129 == null) {
                                                        int gidForName5 = Process.getGidForName(str) + 53;
                                                        int i605 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1311;
                                                        char c20 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28021);
                                                        byte b65 = (byte) (i5 - 4);
                                                        byte b66 = b65;
                                                        Object[] objArr132 = new Object[1];
                                                        bravo(b65, b66, b66, objArr132);
                                                        D887129 = uH18377.setPivotYN16904(gidForName5, i605, c20, 850150196, false, (String) objArr132[0], new Class[0]);
                                                    }
                                                    long longValue21 = ((Long) ((Method) D887129).invoke(null, null)).longValue();
                                                    long j132 = -858343390;
                                                    long j133 = 521;
                                                    long j134 = j132 ^ j5;
                                                    long j135 = ((((j134 | longValue21) | j72) ^ j5) * j133) + (522 * longValue21) + ((-520) * j132);
                                                    long j136 = ((longValue21 ^ j5) | j132) ^ j5;
                                                    long j137 = ((j133 * ((((j134 | j73) | longValue21) ^ j5) | j136)) + (((-1042) * j136) + j135)) - 838816574;
                                                    int myPid4 = Process.myPid();
                                                    int i606 = ((int) (j137 >> 32)) & ((((~(myPid4 | 1425947546)) | (~((~myPid4) | (-351157017))) | 11278864) * 757) + ((~((-339878153) | myPid4)) * 1514) + (((1086069394 | r3) * (-757)) - 579851924));
                                                    int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                                    int foxtrot7 = ((int) j137) & A0.z.foxtrot(~((~elapsedCpuTime4) | (-344632087)), -948, (((~(1802846440 | elapsedCpuTime4)) | (-365620031)) * (-948)) + 145893865, -4855656);
                                                    if (((i606 & foxtrot7) | (i606 ^ foxtrot7)) == 0) {
                                                        i39 = i36;
                                                        objArr = new Object[]{r0, new int[]{i4}, new int[]{i4}, null};
                                                        int i607 = (((-138412075) | i4) * 465) + (((-181600763) | (~((-692122667) | i4))) * 930) + ((((~(i4 | (-181600763))) | (-692122667)) * (-465)) - 2113952837);
                                                        int i608 = ((i607 << 1) - i607) + i19;
                                                        int i609 = i608 << 13;
                                                        int i610 = ((~i608) & i609) | ((~i609) & i608);
                                                        int i611 = i610 ^ (i610 >>> 17);
                                                        int i612 = i611 << 5;
                                                        int[] iArr17 = {((~i611) & i612) | ((~i612) & i611)};
                                                        c10 = 2;
                                                        c4 = 0;
                                                        if (((int[]) objArr[c10])[c4] == ((int[]) objArr[1])[c4]) {
                                                            c11 = 11;
                                                            c12 = c3;
                                                        } else {
                                                            c11 = c3;
                                                            c12 = c11;
                                                        }
                                                        if (c11 == c12) {
                                                            int i613 = juliet + 73;
                                                            kilo = i613 % 128;
                                                            if ((i613 % 2 == 0 ? 'C' : '.') == '.') {
                                                                return objArr;
                                                            }
                                                            throw null;
                                                        }
                                                        Object[] objArr133 = {2};
                                                        Object D887130 = uH18377.D8871(-38624464);
                                                        if (D887130 == null) {
                                                            int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 52;
                                                            int i614 = 2848 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            char indexOf12 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 62568);
                                                            byte b67 = (byte) (i5 - 4);
                                                            byte b68 = b67;
                                                            Object[] objArr134 = new Object[1];
                                                            bravo(b67, b68, b68, objArr134);
                                                            D887130 = uH18377.setPivotYN16904(scrollBarSize4, i614, indexOf12, 571015653, false, (String) objArr134[0], new Class[]{cls});
                                                        }
                                                        long longValue22 = ((Long) ((Method) D887130).invoke(null, objArr133)).longValue();
                                                        long j138 = 191726500;
                                                        long j139 = -574;
                                                        long j140 = (j139 * longValue22) + (j139 * j138);
                                                        long j141 = j138 ^ j5;
                                                        long myUid4 = Process.myUid();
                                                        long j142 = myUid4 ^ j5;
                                                        long j143 = ((longValue22 ^ j5) | myUid4) ^ j5;
                                                        long j144 = (575 * (((j141 | myUid4) ^ j5) | ((j142 | j138) ^ j5))) + ((-575) * (j143 | ((j142 | longValue22) ^ j5))) + (1150 * (((j141 | j142) ^ j5) | j143)) + j140 + 1800400266;
                                                        int i615 = (~(149058476 | i4)) | 1443661907;
                                                        int i616 = ~((-6435497) | i39);
                                                        int i617 = ((int) (j144 >> 32)) & (((i616 | (~(1592720383 | i4))) * 470) + ((i615 | i616) * (-470)) + 1353489932);
                                                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                                                        int i618 = ((int) j144) & (((uptimeMillis | 1129111315) * 104) + ((~((~uptimeMillis) | 1733091155)) * (-104)) + (((~((-1728629571) | uptimeMillis)) | 1124649730) * 104) + 2005432269);
                                                        if (((i617 & i618) | (i617 ^ i618)) == 2) {
                                                            int i619 = kilo;
                                                            juliet = ((i619 & 67) + (i619 | 67)) % 128;
                                                            Object[] objArr135 = {new int[1], new int[]{(i4 & (-271)) | (i39 & 270)}, new int[]{i4}, null};
                                                            int i620 = (int) Runtime.getRuntime().totalMemory();
                                                            int i621 = (((~(i620 | (-327292969))) | 42080256 | (~((~i620) | 468441647))) * 164) + ((183228935 | i620) * 164) + ((((~(327292968 | r2)) | 183228935) * (-328)) - 1641143029);
                                                            int i622 = ((i621 | 16) << 1) - (i621 ^ 16);
                                                            int i623 = (i622 ^ i19) + ((i622 & i19) << 1);
                                                            int i624 = i623 << 13;
                                                            int i625 = (i623 | i624) & (~(i623 & i624));
                                                            int i626 = i625 >>> 17;
                                                            int i627 = ((~i625) & i626) | ((~i626) & i625);
                                                            int i628 = i627 << 5;
                                                            ((int[]) objArr135[0])[0] = ((~i627) & i628) | ((~i628) & i627);
                                                            return objArr135;
                                                        }
                                                        Object D887131 = uH18377.D8871(-1225586509);
                                                        if (D887131 == null) {
                                                            int axisFromString2 = MotionEvent.axisFromString(str) + 52;
                                                            int i629 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2795;
                                                            char myTid9 = (char) (32779 - (Process.myTid() >> 22));
                                                            byte b69 = (byte) (i5 - 4);
                                                            byte b70 = b69;
                                                            Object[] objArr136 = new Object[1];
                                                            bravo(b69, b70, b70, objArr136);
                                                            D887131 = uH18377.setPivotYN16904(axisFromString2, i629, myTid9, 1766369894, false, (String) objArr136[0], new Class[0]);
                                                        }
                                                        long longValue23 = ((Long) ((Method) D887131).invoke(null, null)).longValue();
                                                        long j145 = -542929659;
                                                        long j146 = 983;
                                                        long j147 = longValue23 ^ j5;
                                                        long j148 = ((j145 | j147) * j146) + (984 * longValue23) + ((-1965) * j145);
                                                        long j149 = j145 ^ j5;
                                                        long j150 = ((j146 * (((j149 | j73) ^ j5) | ((longValue23 | j149) ^ j5))) + (((-983) * (j149 | ((j147 | j73) ^ j5))) + j148)) - 1195629560;
                                                        int elapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                                        int i630 = ~elapsedRealtime4;
                                                        int i631 = ((int) (j150 >> 32)) & ((((~(i630 | 1108656861)) | (~((-328569550) | i630))) * 865) + ((~(elapsedRealtime4 | 1108656861)) * 865) + (((~((-1108656862) | i630)) | (-328569550)) * (-865)) + 1902885818);
                                                        int myPid5 = Process.myPid();
                                                        int i632 = ((int) j150) & ((((~((~myPid5) | 1953694326)) | (-904046560)) * 168) + (((~(1953694326 | myPid5)) | (-1978902528)) * (-168)) + ((((~((-904046560) | myPid5)) | 878838358) * 336) - 501357939));
                                                        if (((i631 & i632) | (i631 ^ i632)) != 0) {
                                                            Object[] objArr137 = {r0, new int[]{(i4 & (-273)) | (i39 & 272)}, new int[]{i4}, null};
                                                            int foxtrot8 = A0.z.foxtrot((~(i4 | 718491646)) | 138494254, 446, (((~(173231998 | i39)) | 545259648) * 446) + 451019853, -1627332864);
                                                            int i633 = -(-(((foxtrot8 | 16) << 1) - (foxtrot8 ^ 16)));
                                                            int i634 = (i633 & i19) + (i633 | i19);
                                                            int i635 = i634 << 13;
                                                            int i636 = (i635 & (~i634)) | ((~i635) & i634);
                                                            int i637 = i636 ^ (i636 >>> 17);
                                                            int[] iArr18 = {i637 ^ (i637 << 5)};
                                                            return objArr137;
                                                        }
                                                        long[] jArr4 = {624887784092251L};
                                                        int i638 = 1064826372 - (~(AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1)));
                                                        int indexOf13 = (-37) - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                                                        int i639 = (AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1)) - 1024868941;
                                                        int i640 = -TextUtils.getTrimmedLength(str);
                                                        Object[] objArr138 = new Object[1];
                                                        delta(i638, indexOf13, i639, (short) (((i640 | 126) << 1) - (i640 ^ 126)), (byte) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr138);
                                                        Object[] objArr139 = {(String) objArr138[0], 3, 2251799813685247L, jArr4};
                                                        Object D887132 = uH18377.D8871(130458176);
                                                        if (D887132 == null) {
                                                            int doubleTapTimeout2 = 52 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int mirror2 = 2429 - AndroidCharacter.getMirror('0');
                                                            char c21 = (char) (9779 - (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)));
                                                            byte b71 = (byte) (i5 - 4);
                                                            byte b72 = b71;
                                                            Object[] objArr140 = new Object[1];
                                                            bravo(b71, b72, b72, objArr140);
                                                            D887132 = uH18377.setPivotYN16904(doubleTapTimeout2, mirror2, c21, -662896491, false, (String) objArr140[0], new Class[]{String.class, cls, Long.TYPE, long[].class});
                                                        }
                                                        long longValue24 = ((Long) ((Method) D887132).invoke(null, objArr139)).longValue();
                                                        long j151 = 210514509;
                                                        long j152 = -375;
                                                        long j153 = 376;
                                                        long j154 = j151 ^ j5;
                                                        long j155 = (j151 | longValue24) ^ j5;
                                                        long j156 = (j153 * (longValue24 | ((j154 | j72) ^ j5))) + ((-376) * (((j73 | j151) ^ j5) | j155)) + ((j72 | ((j154 | (longValue24 ^ j5)) ^ j5) | j155) * j153) + (j152 * longValue24) + (j152 * j151) + 642972928;
                                                        int i641 = (int) Runtime.getRuntime().totalMemory();
                                                        int i642 = ~i641;
                                                        int i643 = (((~(1767660641 | i642)) | (-1778212340) | (~(1090080243 | i642)) | (~((-1079528546) | i641))) * (-84)) + 1905160562;
                                                        int i644 = (~(i641 | 1090080243)) | (-1767660642);
                                                        int i645 = ~(i642 | (-1090080244));
                                                        int i646 = ((int) (j156 >> 32)) & (((i645 | 1079528545) * 84) + ((i644 | i645) * (-84)) + i643);
                                                        int i647 = ((int) j156) & (((~(1437586911 | i39)) * HttpConstants.HTTP_NOT_IMPLEMENTED) + (((~(1437586911 | i4)) | 9) * HttpConstants.HTTP_NOT_IMPLEMENTED) + 1534273560);
                                                        int i648 = (i646 & i647) | (i646 ^ i647);
                                                        if ((i648 > 0 ? ';' : '/') == ';') {
                                                            Object[] objArr141 = {r0, new int[]{(i4 & (-276)) | (i39 & 275)}, new int[]{i4}, null};
                                                            int i649 = ((~(i4 | (-587208753))) * 345) + (((~((-855742714) | i39)) | (-932429562)) * 345) + (((~((-855742714) | i4)) | 587208752) * 345) + 474124504;
                                                            int i650 = (i649 & 16) + (i649 | 16);
                                                            int i651 = ((i650 | i19) << 1) - (i650 ^ i19);
                                                            int i652 = i651 ^ (i651 << 13);
                                                            int i653 = i652 >>> 17;
                                                            int i654 = ((~i652) & i653) | ((~i653) & i652);
                                                            int i655 = i654 << 5;
                                                            int[] iArr19 = {(i654 | i655) & (~(i654 & i655))};
                                                            return objArr141;
                                                        }
                                                        if (i648 == -1) {
                                                            Object[] objArr142 = {new int[1], new int[]{(~(i4 & 277)) & (i4 | 277)}, new int[]{i4}, null};
                                                            int i656 = (((~((~((int) Process.getElapsedCpuTime())) | (-6948912))) | (-671088640)) * 521) + (((~((-6948912) | r0)) * 521) - 1365030264);
                                                            int i657 = (((i656 | 16) << 1) - (i656 ^ 16)) + i19;
                                                            int i658 = i657 << 13;
                                                            int i659 = (i658 | i657) & (~(i657 & i658));
                                                            int i660 = i659 >>> 17;
                                                            int i661 = (i659 | i660) & (~(i659 & i660));
                                                            ((int[]) objArr142[0])[0] = i661 ^ (i661 << 5);
                                                            return objArr142;
                                                        }
                                                        int scrollBarSize5 = 1064826374 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                        int i662 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                        Object[] objArr143 = new Object[1];
                                                        delta(scrollBarSize5, ((i662 | (-43)) << 1) - (i662 ^ (-43)), (-1024868916) - (~(-ImageFormat.getBitsPerPixel(0))), (short) (85 - (TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1))), (byte) ((-2) - ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) ^ (-1))), objArr143);
                                                        Object[] objArr144 = {(String) objArr143[0]};
                                                        Object D887133 = uH18377.D8871(-2104138125);
                                                        if (D887133 == null) {
                                                            int keyCodeFromString = 52 - KeyEvent.keyCodeFromString(str);
                                                            int i663 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2950;
                                                            char resolveSize2 = (char) View.resolveSize(0, 0);
                                                            byte b73 = (byte) (i5 - 3);
                                                            byte b74 = b73;
                                                            Object[] objArr145 = new Object[1];
                                                            bravo(b73, b74, b74, objArr145);
                                                            D887133 = uH18377.setPivotYN16904(keyCodeFromString, i663, resolveSize2, 1563346086, false, (String) objArr145[0], new Class[]{String.class});
                                                        }
                                                        long longValue25 = ((Long) ((Method) D887133).invoke(null, objArr144)).longValue();
                                                        long j157 = -349821398;
                                                        long j158 = 399;
                                                        long j159 = 398;
                                                        long j160 = ((j157 ^ j5) | longValue25) ^ j5;
                                                        long j161 = longValue25 ^ j5;
                                                        long j162 = (j161 | j157) ^ j5;
                                                        long j163 = ((j159 * ((((j161 | j73) ^ j5) | j160) | j162)) + (((-1194) * (longValue25 | j157)) + ((((j160 | j162) | ((j161 | j72) ^ j5)) * j159) + ((j158 * longValue25) + (j158 * j157))))) - 879799132;
                                                        int myUid5 = Process.myUid();
                                                        int i664 = ((int) (j163 >> 32)) & ((((~(myUid5 | (-73594580))) | 1510820990) * 519) + (((~((~myUid5) | (-17491))) | (~((-73577090) | myUid5))) * (-519)) + ((((~((-1510820991) | r3)) | (-73594580)) * 519) - 1453938172));
                                                        int i665 = ((int) j163) & ((((~(2020312284 | i39)) | (~((-2020312285) | i4)) | (~(583085874 | i4))) * 831) + ((~((-541131793) | i4)) * (-1662)) + (((~((-583085875) | i39)) | (~((-1479180493) | i4))) * (-831)) + 1618093830);
                                                        if (((i664 & i665) | (i664 ^ i665)) != 0) {
                                                            juliet = (kilo + 103) % 128;
                                                            Object[] objArr146 = {r0, new int[]{(~(i4 & 276)) & (i4 | 276)}, new int[]{i4}, null};
                                                            int i666 = (~((-293489797) | i4)) | 7210112;
                                                            int i667 = 1406935429 - (~(-(-(((((~(i4 | (-286279685))) | (~(503311791 | i39))) * 470) + (((i666 | r3) * (-470)) - 395692753)) + 16))));
                                                            int i668 = i667 << 13;
                                                            int i669 = (i668 & (~i667)) | ((~i668) & i667);
                                                            int i670 = i669 >>> 17;
                                                            int i671 = ((~i669) & i670) | ((~i670) & i669);
                                                            int i672 = i671 << 5;
                                                            int[] iArr20 = {(i671 | i672) & (~(i671 & i672))};
                                                            return objArr146;
                                                        }
                                                        Object D887134 = uH18377.D8871(-1450000215);
                                                        if (D887134 == null) {
                                                            int i673 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 51;
                                                            int combineMeasuredStates5 = 2640 - View.combineMeasuredStates(0, 0);
                                                            char indexOf14 = (char) (23984 - TextUtils.indexOf(str, str, 0));
                                                            byte b75 = (byte) (i5 - 4);
                                                            byte b76 = b75;
                                                            Object[] objArr147 = new Object[1];
                                                            bravo(b75, b76, b76, objArr147);
                                                            D887134 = uH18377.setPivotYN16904(i673, combineMeasuredStates5, indexOf14, 1982423676, false, (String) objArr147[0], new Class[0]);
                                                        }
                                                        long longValue26 = ((Long) ((Method) D887134).invoke(null, null)).longValue();
                                                        long j164 = -1377702883;
                                                        long j165 = ((-50) * (j164 | j72)) + ((-49) * longValue26) + (51 * j164);
                                                        long j166 = 50;
                                                        long j167 = longValue26 ^ j5;
                                                        long j168 = j167 | j73;
                                                        long j169 = (j166 * (((j167 | j164) ^ j5) | (j168 ^ j5) | ((j73 | j164) ^ j5))) + ((((((j164 ^ j5) | j167) | j72) ^ j5) | ((j168 | j164) ^ j5)) * j166) + j165 + 1919874327;
                                                        int elapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                                                        int i674 = ((int) (j169 >> 32)) & ((((~(elapsedRealtime5 | 172253742)) | (~((~elapsedRealtime5) | 1264972668))) * 627) + (((~((-1264972669) | elapsedRealtime5)) | 172253742) * (-627)) + ((elapsedRealtime5 | (-3)) * (-627)) + 635053320);
                                                        int i675 = ((int) j169) & ((((~(2017959146 | i39)) | 1480759466) * 564) + ((~(2061492202 | i4)) * 1128) + (((((~((-580732737) | i39)) | 2017959146) | (~(580732736 | i4))) * (-564)) - 358852335));
                                                        if (((i674 & i675) | (i674 ^ i675)) != 0) {
                                                            Object[] objArr148 = {r0, new int[]{(i4 & (-274)) | (i39 & 273)}, new int[]{i4}, null};
                                                            int i676 = (((~(i4 | (-367143473))) | (-502001664)) * 433) + (((~((-143378432) | i4)) | (-367143473)) * (-433)) + (((~((-358623233) | i39)) * 433) - 1890460338);
                                                            int i677 = 1406935429 - (~((i676 ^ 16) + ((i676 & 16) << 1)));
                                                            int i678 = i677 << 13;
                                                            int i679 = (i678 | i677) & (~(i677 & i678));
                                                            int i680 = i679 >>> 17;
                                                            int i681 = (i679 | i680) & (~(i679 & i680));
                                                            int[] iArr21 = {i681 ^ (i681 << 5)};
                                                            return objArr148;
                                                        }
                                                        Object D887135 = uH18377.D8871(47451215);
                                                        if (D887135 == null) {
                                                            int axisFromString3 = 50 - MotionEvent.axisFromString(str);
                                                            int i682 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1261;
                                                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                                            byte b77 = (byte) (i5 - 4);
                                                            byte b78 = b77;
                                                            Object[] objArr149 = new Object[1];
                                                            bravo(b77, b78, b78, objArr149);
                                                            D887135 = uH18377.setPivotYN16904(axisFromString3, i682, packedPositionType, -579883366, false, (String) objArr149[0], new Class[0]);
                                                        }
                                                        long longValue27 = ((Long) ((Method) D887135).invoke(null, null)).longValue();
                                                        long j170 = -353470760;
                                                        long j171 = -919;
                                                        long j172 = 920;
                                                        long j173 = j170 ^ j5;
                                                        long j174 = longValue27 ^ j5;
                                                        long j175 = j173 | j174;
                                                        long tango4 = ao.ad.tango(308571731);
                                                        long j176 = tango4 ^ j5;
                                                        long j177 = (j172 * ((((longValue27 | j173) | tango4) ^ j5) | ((j175 | j176) ^ j5) | (((j174 | j170) | tango4) ^ j5))) + (((j175 ^ j5) | ((j173 | j176) ^ j5)) * j172) + ((((j175 | tango4) ^ j5) | (((j174 | j176) | j170) ^ j5)) * j172) + (j171 * longValue27) + (j171 * j170) + 375972536;
                                                        int i683 = ~((~((int) Process.getElapsedCpuTime())) | 1035181727);
                                                        int i684 = ((int) (j177 >> 32)) & (((i683 | 364025355) * 374) + ((671156372 | i683) * (-374)) + 340109776);
                                                        int elapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                                                        int i685 = ((int) j177) & (((elapsedRealtime6 | (-1206610621)) * 496) + (((~(230615789 | elapsedRealtime6)) | (-1342171902) | (~((~elapsedRealtime6) | (-95054509)))) * (-496)) + ((r4 * 992) - 1537497691));
                                                        if (!(((i684 & i685) | (i684 ^ i685)) == 0)) {
                                                            Object[] objArr150 = {new int[1], new int[]{(i4 & (-280)) | (i39 & 279)}, new int[]{i4}, null};
                                                            int i686 = (int) Runtime.getRuntime().totalMemory();
                                                            int i687 = (((~((~i686) | (-141135112))) | 335806664) * 449) + (((~((-141135112) | i686)) | 335806664) * 449) + 658692952;
                                                            int i688 = 1406935429 - (~(-(-((i687 & 16) + (i687 | 16)))));
                                                            int i689 = i688 << 13;
                                                            int i690 = (i689 | i688) & (~(i688 & i689));
                                                            int i691 = i690 ^ (i690 >>> 17);
                                                            ((int[]) objArr150[0])[0] = i691 ^ (i691 << 5);
                                                            return objArr150;
                                                        }
                                                        Object[] objArr151 = {Integer.valueOf(i4), obj, Integer.valueOf(i19), Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)};
                                                        Object D887136 = uH18377.D8871(-1078133633);
                                                        if (D887136 == null) {
                                                            D887136 = uH18377.setPivotYN16904(52 - ExpandableListView.getPackedPositionType(0L), 2483 - Process.getGidForName(str), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1611095722, false, null, new Class[]{cls, (Class) uH18377.charlie((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 18791), 52 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2536), cls, cls});
                                                        }
                                                        Object newInstance = ((Constructor) D887136).newInstance(objArr151);
                                                        try {
                                                            int i692 = -MotionEvent.axisFromString(str);
                                                            int i693 = ((i692 | 1064826432) << 1) - (i692 ^ 1064826432);
                                                            int axisFromString4 = MotionEvent.axisFromString(str);
                                                            int i694 = ((axisFromString4 | (-36)) << 1) - (axisFromString4 ^ (-36));
                                                            int mirror3 = 48648 - AndroidCharacter.getMirror('0');
                                                            int i695 = -View.getDefaultSize(0, 0);
                                                            int i696 = i695 * (-665);
                                                            int i697 = (i696 ^ 31062) + ((i696 & 31062) << 1);
                                                            int i698 = ~i695;
                                                            int i699 = i698 * (-333);
                                                            int i700 = ((i697 | i699) << 1) - (i699 ^ i697);
                                                            int i701 = ~((i698 ^ i39) | (i698 & i39));
                                                            int i702 = ~((i4 ^ 93) | (i4 & 93));
                                                            int i703 = (i700 - (~(((i701 & i702) | (i701 ^ i702)) * 333))) - 1;
                                                            int i704 = ~((i698 & i4) | (i698 ^ i4));
                                                            int i705 = ~((i39 ^ 93) | (i39 & 93));
                                                            int i706 = -(-(((i704 & i705) | (i704 ^ i705)) * 333));
                                                            Object[] objArr152 = new Object[1];
                                                            delta(i693, i694, mirror3, (short) ((i703 & i706) + (i706 | i703)), (byte) ((-1) - TextUtils.lastIndexOf(str, '0', 0, 0)), objArr152);
                                                            Class<?> cls3 = Class.forName((String) objArr152[0]);
                                                            Object[] objArr153 = new Object[1];
                                                            charlie((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 57036), View.resolveSize(0, 0) - 868797364, "\u0ec5猕垑﴾顖", "䳜㜴쳌烞", objArr153);
                                                            cls3.getMethod((String) objArr153[0], null).invoke(newInstance, null);
                                                            Object[] objArr154 = {new int[1], new int[]{i4}, new int[]{i4}, null};
                                                            int freeMemory5 = (int) Runtime.getRuntime().freeMemory();
                                                            int i707 = ~freeMemory5;
                                                            int i708 = -(-((((~(freeMemory5 | (-2381402))) | 512903305) * 519) + (((~(i707 | (-16394))) | (~((-2365009) | freeMemory5))) * (-519)) + (((~((-512903306) | i707)) | (-2381402)) * 519) + 1837626598));
                                                            int i709 = (i708 & i19) + (i708 | i19);
                                                            int i710 = i709 << 13;
                                                            int i711 = (i710 & (~i709)) | ((~i710) & i709);
                                                            int i712 = i711 ^ (i711 >>> 17);
                                                            int i713 = i712 << 5;
                                                            ((int[]) objArr154[0])[0] = ((~i712) & i713) | ((~i713) & i712);
                                                            return objArr154;
                                                        } catch (Throwable th6) {
                                                            Throwable cause3 = th6.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th6;
                                                        }
                                                    }
                                                    i39 = i36;
                                                    objArr = new Object[]{new int[1], new int[]{(i4 & (-281)) | (i39 & 280)}, new int[]{i4}, null};
                                                    int i714 = ~((int) SystemClock.elapsedRealtime());
                                                    int i715 = (((~((-296583548) | i714)) | (~(i714 | 213938356))) * 590) + (((~((-213938357) | i714)) | 205549700 | (~(296583547 | i714))) * (-1180)) + ((((~(r0 | (-288194892))) | r4) * 590) - 1005500531);
                                                    int i716 = -(-((i715 & 16) + (i715 | 16)));
                                                    int i717 = (i716 ^ i19) + ((i716 & i19) << 1);
                                                    int i718 = (i717 << 13) ^ i717;
                                                    int i719 = i718 ^ (i718 >>> 17);
                                                    int i720 = i719 << 5;
                                                    c4 = 0;
                                                    ((int[]) objArr[0])[0] = (i719 | i720) & (~(i719 & i720));
                                                }
                                            }
                                        }
                                        c4 = c13;
                                        i39 = i36;
                                    } else {
                                        i39 = i36;
                                        objArr = new Object[]{r0, new int[]{(i4 & (-265)) | (i39 & 264)}, new int[]{i4}, null};
                                        int foxtrot9 = A0.z.foxtrot((~(281791146 | i39)) | (-493481264), 494, (((-220210438) | i39) * 494) - 522869059, 1406935446);
                                        int i721 = foxtrot9 ^ (foxtrot9 << 13);
                                        int i722 = i721 >>> 17;
                                        int i723 = ((~i721) & i722) | ((~i722) & i721);
                                        int i724 = i723 << 5;
                                        c4 = 0;
                                        int[] iArr22 = {((~i723) & i724) | ((~i724) & i723)};
                                    }
                                    c10 = 2;
                                    if (((int[]) objArr[c10])[c4] == ((int[]) objArr[1])[c4]) {
                                    }
                                    if (c11 == c12) {
                                    }
                                }
                                f10 = 0.0f;
                                if (i37 != 0) {
                                }
                            }
                            Object[] objArr155 = {(String) objArr2[0]};
                            Object D887137 = uH18377.D8871(i20);
                            if (D887137 == null) {
                                int i725 = 52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int edgeSlop6 = (ViewConfiguration.getEdgeSlop() >> 16) + 3158;
                                char normalizeMetaState3 = (char) (58074 - KeyEvent.normalizeMetaState(0));
                                byte b79 = (byte) (i5 - 3);
                                byte b80 = (byte) (b79 - 1);
                                Object[] objArr156 = new Object[1];
                                bravo(b79, b80, (byte) (b80 + 1), objArr156);
                                D887137 = uH18377.setPivotYN16904(i725, edgeSlop6, normalizeMetaState3, 424179844, false, (String) objArr156[0], new Class[]{String.class});
                            }
                            Object invoke7 = ((Method) D887137).invoke(null, objArr155);
                            if (invoke7 != null) {
                                int i726 = juliet;
                                kilo = ((i726 ^ 115) + ((i726 & 115) << 1)) % 128;
                                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i727 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                Object[] objArr157 = new Object[1];
                                charlie(jumpTapTimeout2, (i727 ^ 30169703) + ((i727 & 30169703) << 1), "㴎㩁\uf8d1孬๊ꐴ엇", "柙챚ⴁ豾", objArr157);
                                if (invoke7.equals((String) objArr157[0])) {
                                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1064826439;
                                    int indexOf15 = (-31) - TextUtils.indexOf((CharSequence) str, '0');
                                    int i728 = -(-TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                                    int i729 = (i728 ^ (-1024869047)) + ((i728 & (-1024869047)) << 1);
                                    int capsMode3 = TextUtils.getCapsMode(str, 0, 0);
                                    Object[] objArr158 = new Object[1];
                                    delta(touchSlop2, indexOf15, i729, (short) (((capsMode3 | (-111)) << 1) - (capsMode3 ^ (-111))), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr158);
                                    try {
                                        Object[] objArr159 = {(String) objArr158[0]};
                                        Object D887138 = uH18377.D8871(i20);
                                        if (D887138 == null) {
                                            int size3 = 52 - View.MeasureSpec.getSize(0);
                                            int i730 = 3158 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            char axisFromString5 = (char) (58073 - MotionEvent.axisFromString(str));
                                            byte b81 = (byte) (i5 - 3);
                                            byte b82 = (byte) (b81 - 1);
                                            Object[] objArr160 = new Object[1];
                                            bravo(b81, b82, (byte) (b82 + 1), objArr160);
                                            D887138 = uH18377.setPivotYN16904(size3, i730, axisFromString5, 424179844, false, (String) objArr160[0], new Class[]{String.class});
                                        }
                                        String str57 = (String) ((Method) D887138).invoke(null, objArr159);
                                        if (str57 != null) {
                                            int i731 = juliet + 45;
                                            kilo = i731 % 128;
                                            if (i731 % 2 == 0) {
                                                parseInt = Integer.parseInt(str57);
                                                int i732 = 48 / 0;
                                            } else {
                                                parseInt = Integer.parseInt(str57);
                                            }
                                            i34 = (parseInt | 170) + (parseInt & 170);
                                            if (i34 != 0) {
                                            }
                                        }
                                        i33 = juliet + 109;
                                        kilo = i33 % 128;
                                    } catch (Throwable th7) {
                                        Throwable cause4 = th7.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th7;
                                    }
                                }
                            }
                            i34 = 0;
                            if (i34 != 0) {
                            }
                        } catch (Throwable th8) {
                            Throwable cause5 = th8.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th8;
                        }
                        int i733 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1064826431;
                        int combineMeasuredStates6 = View.combineMeasuredStates(0, 0) - 35;
                        int i734 = -(-View.resolveSize(0, 0));
                        objArr2 = new Object[1];
                        delta(i733, combineMeasuredStates6, ((i734 | (-1024869065)) << 1) - (i734 ^ (-1024869065)), (short) (16777163 - (~Color.rgb(0, 0, 0))), (byte) ((-1) - TextUtils.lastIndexOf(str, '0')), objArr2);
                    }
                    if (obj2 != null) {
                        Object[] objArr161 = {obj2, 42};
                        Object D887139 = uH18377.D8871(i11);
                        if (D887139 == null) {
                            int absoluteGravity6 = 51 - Gravity.getAbsoluteGravity(0, 0);
                            int indexOf16 = TextUtils.indexOf(str, str, 0, 0) + 1209;
                            char indexOf17 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 44357);
                            byte b83 = (byte) (i5 - 4);
                            byte b84 = b83;
                            Object[] objArr162 = new Object[1];
                            bravo(b83, b84, b84, objArr162);
                            D887139 = uH18377.setPivotYN16904(absoluteGravity6, indexOf16, indexOf17, -1540336361, false, (String) objArr162[0], new Class[]{String.class, cls});
                        }
                        long longValue28 = ((Long) ((Method) D887139).invoke(null, objArr161)).longValue();
                        long j178 = 1922347913;
                        long j179 = 497;
                        long j180 = j178 ^ j5;
                        long j181 = longValue28 ^ j5;
                        long j182 = j180 | j181;
                        long j183 = ((j182 ^ j5) * j179) + (j22 * longValue28) + (j22 * j178);
                        long myUid6 = Process.myUid();
                        long j184 = (j182 | myUid6) ^ j5;
                        long j185 = myUid6 ^ j5;
                        long j186 = ((j179 * ((((j180 | j185) ^ j5) | ((j180 | longValue28) ^ j5)) | (((j181 | j178) | myUid6) ^ j5))) + (((j184 | (((j181 | j185) | j178) ^ j5)) * j179) + j183)) - 1929792943;
                        int i735 = ((int) (j186 >> 32)) & ((((~((-1568085022) | i17)) | (~((-42510947) | i4))) * 338) + (((((-1610595968) | r2) | (~(1568085021 | i4))) * (-338)) - 1778331478));
                        int i736 = ((int) j186) & ((((~(885374427 | i4)) | 1091190816) * 464) + (((-881175643) | i4) * (-464)) + (((~((-1972366459) | i17)) | 1091190816 | (~(i17 | 885374427))) * 464) + 1004612133);
                    }
                    f5 = 0.0f;
                    i26 = 0;
                    int i1192 = -(-(TypedValue.complexToFraction(i26, f5, f5) > f5 ? 1 : (TypedValue.complexToFraction(i26, f5, f5) == f5 ? 0 : -1)));
                    int i1202 = ((1064826424 | i1192) << 1) - (i1192 ^ 1064826424);
                    int i1212 = (-47) - (~(-TextUtils.lastIndexOf(str, '0')));
                    int i1222 = -Color.alpha(0);
                    int i1232 = ((-1024869270) ^ i1222) + ((i1222 & (-1024869270)) << 1);
                    int gidForName22 = Process.getGidForName(str);
                    Object[] objArr242 = new Object[1];
                    delta(i1202, i1212, i1232, (short) ((gidForName22 ^ 70) + ((gidForName22 & 70) << 1)), (byte) (ViewConfiguration.getTapTimeout() >> 16), objArr242);
                    String str102 = (String) objArr242[0];
                    int i1242 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1064826423;
                    int packedPositionChild3 = (-48) - ExpandableListView.getPackedPositionChild(0L);
                    int keyRepeatTimeout32 = (-1024869263) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i1252 = -((Process.getThreadPriority(0) + 20) >> 6);
                    Object[] objArr252 = new Object[1];
                    delta(i1242, packedPositionChild3, keyRepeatTimeout32, (short) ((i1252 ^ (-87)) + ((i1252 & (-87)) << 1)), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr252);
                    String str112 = (String) objArr252[0];
                    char c142 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int i1262 = (((-738748223) | keyRepeatDelay2) << 1) - (keyRepeatDelay2 ^ (-738748223));
                    Object[] objArr262 = new Object[1];
                    charlie(c142, i1262, "뷨畷Ꙙ掉퍚⊷䑎", "섊\uf798⛓\udbf2", objArr262);
                    String str122 = (String) objArr262[0];
                    char c152 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i1272 = -TextUtils.lastIndexOf(str, '0');
                    int i1282 = ((-121840607) & i1272) + (i1272 | (-121840607));
                    Object[] objArr272 = new Object[1];
                    charlie(c152, i1282, "寂綿떀‱痣᠍⩃ꎨ৽", "⋅볜룸ᑚ", objArr272);
                    String str132 = (String) objArr272[0];
                    int i1292 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    int i1302 = (1064826432 & i1292) + (i1292 | 1064826432);
                    int i1312 = -(-(Process.myTid() >> 22));
                    int i1322 = (i1312 & (-47)) + (i1312 | (-47));
                    int i1332 = (-1024869258) - (~TextUtils.lastIndexOf(str, '0', 0, 0));
                    int i1342 = -(KeyEvent.getMaxKeyCode() >> 16);
                    int i1352 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr282 = new Object[1];
                    delta(i1302, i1322, i1332, (short) (((i1342 | 123) << 1) - (i1342 ^ 123)), (byte) ((i1352 ^ 1) + ((i1352 & 1) << 1)), objArr282);
                    String str142 = (String) objArr282[0];
                    int i1362 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    int i1372 = -AndroidCharacter.getMirror('0');
                    int i1382 = ((-52795631) ^ i1372) + ((i1372 & (-52795631)) << 1);
                    Object[] objArr292 = new Object[1];
                    charlie((char) ((48578 ^ i1362) + ((i1362 & 48578) << 1)), i1382, "炘Ϊ芋\ue9a3붬\ud8c7\ue5ea➏ₙ蛑ᨓ䍐甭", "\ue1a8\uda66싼沽", objArr292);
                    String str152 = (String) objArr292[0];
                    int i1392 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr302 = new Object[1];
                    charlie((char) ((i1392 & 19970) + (i1392 | 19970)), (ViewConfiguration.getScrollBarSize() >> 8) - 407602602, "ힼ쮭Ѧ헭椕", "囋둺˧㉎", objArr302);
                    String str162 = (String) objArr302[0];
                    Object[] objArr312 = new Object[1];
                    charlie((char) (28715 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), Process.myPid() >> 22, "殨婝ዬ奪傉器", "㋺䇦ⴓ셰", objArr312);
                    String str172 = (String) objArr312[0];
                    int i1402 = 1064826431 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                    int i1412 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 52;
                    int pressedStateDuration32 = ViewConfiguration.getPressedStateDuration() >> 16;
                    int alpha52 = C1211g1.alpha();
                    int i1422 = pressedStateDuration32 * 1773;
                    int i1432 = (771189449 ^ i1422) + ((i1422 & 771189449) << 1);
                    int i1442 = ~pressedStateDuration32;
                    int i1452 = ~((i1442 & 1024869252) | (1024869252 ^ i1442));
                    int i1462 = ~((1024869252 ^ alpha52) | (1024869252 & alpha52));
                    int i1472 = (i1452 & i1462) | (i1452 ^ i1462);
                    int i1482 = ~alpha52;
                    int i1492 = ~(i1482 | pressedStateDuration32 | (-1024869253));
                    int i1502 = -(-(((i1472 & i1492) | (i1472 ^ i1492)) * 886));
                    int i1512 = (i1432 ^ i1502) + ((i1502 & i1432) << 1);
                    int i1522 = ~(((-1024869253) ^ i1482) | ((-1024869253) & i1482));
                    int i1532 = (i1512 - (~(-(-(((i1522 & pressedStateDuration32) | (pressedStateDuration32 ^ i1522)) * (-1772)))))) - 1;
                    int i1542 = -(-((~((pressedStateDuration32 & i1482) | (i1482 ^ pressedStateDuration32))) * 886));
                    int i1552 = (i1532 ^ i1542) + ((i1542 & i1532) << 1);
                    int i1562 = -(-View.MeasureSpec.getMode(0));
                    int lastIndexOf14 = TextUtils.lastIndexOf(str, '0');
                    int alpha62 = C1211g1.alpha();
                    int i1572 = ~(i23 | alpha62);
                    int i1582 = ~alpha62;
                    int i1592 = (((lastIndexOf14 * (-515)) + 517) - (~(-(-(((i1572 | (~((i1582 ^ lastIndexOf14) | (i1582 & lastIndexOf14)))) | (~((i1582 ^ 1) | (i1582 & 1)))) * (-516)))))) - 1;
                    int i1602 = ~lastIndexOf14;
                    int i1612 = ~(alpha62 | (i1602 ^ (-2)) | (i1602 & (-2)));
                    int i1622 = i1602 | i1582;
                    int i1632 = ~((i1622 & 1) | (i1622 ^ 1));
                    int i1642 = (((i1612 & i1632) | (i1612 ^ i1632)) * 516) + i1592;
                    int i1652 = ((~(i1602 | 1)) | (~(i1582 | 1))) * 516;
                    byte b232 = (byte) (((i1642 | i1652) << 1) - (i1652 ^ i1642));
                    Object[] objArr322 = new Object[1];
                    delta(i1402, i1412, i1552, (short) ((i1562 & (-120)) + (i1562 | (-120))), b232, objArr322);
                    String str182 = (String) objArr322[0];
                    int i1662 = -Process.getGidForName(str);
                    Object[] objArr332 = new Object[1];
                    charlie((char) (((50926 | i1662) << 1) - (i1662 ^ 50926)), (Process.getThreadPriority(0) + 20) >> 6, "Ềטּ깚袐䭤䭌㖀面Ѻ廿㪷猆\uee55ࣩ놏\uffe7", "ꎰ\ud837\uefc1ꗆ", objArr332);
                    String str192 = (String) objArr332[0];
                    Object[] objArr342 = new Object[1];
                    charlie((char) (0 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "뛍详鞬ꓻ퀸挚鹃댬\uf20e릵", "蝹\ue2d2\udae9鸝", objArr342);
                    String str202 = (String) objArr342[0];
                    int i1672 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int i1682 = (1064826438 & i1672) + (i1672 | 1064826438);
                    int i1692 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                    Object[] objArr352 = new Object[1];
                    delta(i1682, ((i1692 | (-45)) << 1) - (i1692 ^ (-45)), View.MeasureSpec.getMode(0) - 1024869252, (short) ((-127) - (Process.myTid() >> 22)), (byte) Color.blue(0), objArr352);
                    String str212 = (String) objArr352[0];
                    int i1702 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int threadPriority4 = Process.getThreadPriority(0);
                    int i1712 = threadPriority4 * (-344);
                    int i1722 = (((-6880) | i1712) << 1) - (i1712 ^ (-6880));
                    int i1732 = ~threadPriority4;
                    int i1742 = ((-21) ^ i1732) | ((-21) & i1732);
                    int i1752 = ~i1742;
                    int i1762 = ~(((-21) ^ i4) | ((-21) & i4));
                    int i1772 = (((i1752 & i1762) | (i1752 ^ i1762)) * 345) + i1722;
                    int i1782 = -(-(((~(i1732 | 20)) | (~(((-21) ^ i17) | ((-21) & i17)))) * 345));
                    int i1792 = (i1772 & i1782) + (i1782 | i1772);
                    int i1802 = -(-((~((i1742 ^ i4) | (i1742 & i4))) * 345));
                    Object[] objArr362 = new Object[1];
                    charlie((char) ((i1702 ^ 1) + ((i1702 & 1) << 1)), ((i1792 & i1802) + (i1802 | i1792)) >> 6, "ਜ\ued3e\uf7cc婬礜檟\uee0fሺ纴⊌ꋉ\uf45f", "ᓴ⬎纝튦", objArr362);
                    String str222 = (String) objArr362[0];
                    int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1064826439;
                    int i1812 = -(-TextUtils.getCapsMode(str, 0, 0));
                    int i1822 = (i1812 & (-39)) + (i1812 | (-39));
                    int i1832 = (-1024869245) - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i1842 = -View.getDefaultSize(0, 0);
                    Object[] objArr372 = new Object[1];
                    delta(doubleTapTimeout3, i1822, i1832, (short) ((i1842 ^ (-33)) + ((i1842 & (-33)) << 1)), (byte) View.resolveSizeAndState(0, 0, 0), objArr372);
                    String str232 = (String) objArr372[0];
                    int i1852 = -(-TextUtils.getOffsetAfter(str, 0));
                    int i1862 = (1064826441 ^ i1852) + ((i1852 & 1064826441) << 1);
                    int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) - 45;
                    int i1872 = -Process.getGidForName(str);
                    int i1882 = ((-1024869233) ^ i1872) + ((i1872 & (-1024869233)) << 1);
                    int i1892 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr382 = new Object[1];
                    delta(i1862, modifierMetaStateMask3, i1882, (short) ((i1892 & (-128)) + (i1892 | (-128))), (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr382);
                    String str242 = (String) objArr382[0];
                    char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int scrollBarSize6 = ViewConfiguration.getScrollBarSize() >> 8;
                    int i1902 = ((-1599843150) & scrollBarSize6) + (scrollBarSize6 | (-1599843150));
                    Object[] objArr392 = new Object[1];
                    charlie(touchSlop3, i1902, "ᱚ븝⤅\ud944㻙駯嵋", "눚ꑔ\uf0a0ᩯ", objArr392);
                    String str252 = (String) objArr392[0];
                    int lastIndexOf22 = TextUtils.lastIndexOf(str, '0', 0, 0);
                    int i1912 = -Drawable.resolveOpacity(0, 0);
                    int i1922 = (((-1849261104) | i1912) << 1) - (i1912 ^ (-1849261104));
                    Object[] objArr402 = new Object[1];
                    charlie((char) ((lastIndexOf22 ^ 1) + ((lastIndexOf22 & 1) << 1)), i1922, "嵂퇩湒ꝫ䳼䨈\ueeef", "탅욃妑ᝲ", objArr402);
                    String str262 = (String) objArr402[0];
                    int trimmedLength4 = 1064826442 - TextUtils.getTrimmedLength(str);
                    int i1932 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i1942 = ((i1932 | (-50)) << 1) - (i1932 ^ (-50));
                    int deadChar22 = KeyEvent.getDeadChar(0, 0);
                    int i1952 = deadChar22 * 46;
                    int i1962 = ((100655860 | i1952) << 1) - (i1952 ^ 100655860);
                    int i1972 = ~(1024869225 | i17);
                    int i1982 = (((i1972 & deadChar22) | (deadChar22 ^ i1972)) * (-90)) + i1962;
                    int i1992 = ~((1024869225 ^ i4) | (1024869225 & i4));
                    int i2002 = ~(((-1024869226) ^ deadChar22) | ((-1024869226) & deadChar22));
                    int i2012 = -(-(((i1992 & i2002) | (i1992 ^ i2002)) * (-45)));
                    int i2022 = (i1982 ^ i2012) + ((i1982 & i2012) << 1);
                    int i2032 = (~((~deadChar22) | i4)) | 1024869225;
                    int i2042 = ~((deadChar22 & i17) | (i17 ^ deadChar22));
                    int i2052 = -(-(((i2042 & i2032) | (i2032 ^ i2042)) * 45));
                    int i2062 = (i2022 & i2052) + (i2052 | i2022);
                    short s32 = (short) (45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int i2072 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr412 = new Object[1];
                    delta(trimmedLength4, i1942, i2062, s32, (byte) ((i2072 & 1) + (i2072 | 1)), objArr412);
                    String str272 = (String) objArr412[0];
                    int i2082 = -(-AndroidCharacter.getMirror('0'));
                    Object[] objArr422 = new Object[1];
                    charlie((char) (((i2082 | (-48)) << 1) - (i2082 ^ (-48))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "䒊ﰓฆ\uf6a0뵸幰俴竺⩴䅛\ude9c\ud9ee\ua7efׯ貐훵擠䣄\uf7d2\uf04a", "ꆰ\uf394搔㰾", objArr422);
                    String str282 = (String) objArr422[0];
                    Object[] objArr432 = new Object[1];
                    charlie((char) (Gravity.getAbsoluteGravity(0, 0) + 18306), TextUtils.getTrimmedLength(str), "샥欧ᔃ⮊崟\ud8ee", "⳺搗芾\udd47", objArr432);
                    String str292 = (String) objArr432[0];
                    int scrollBarSize22 = ViewConfiguration.getScrollBarSize() >> 8;
                    int i2092 = (1064826442 & scrollBarSize22) + (scrollBarSize22 | 1064826442);
                    int i2102 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int i2112 = ((i2102 | (-52)) << 1) - (i2102 ^ (-52));
                    int i2122 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    int i2132 = ((-1024869225) & i2122) + (i2122 | (-1024869225));
                    int i2142 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                    Object[] objArr442 = new Object[1];
                    delta(i2092, i2112, i2132, (short) (((i2142 | (-68)) << 1) - (i2142 ^ (-68))), (byte) TextUtils.getOffsetAfter(str, 0), objArr442);
                    String str302 = (String) objArr442[0];
                    int i2152 = 1064826441 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                    int i2162 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i2172 = (i2162 & (-36)) + (i2162 | (-36));
                    int i2182 = (-1024869226) - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int i2192 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    Object[] objArr452 = new Object[1];
                    delta(i2152, i2172, i2182, (short) ((i2192 & (-49)) + (i2192 | (-49))), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr452);
                    String str312 = (String) objArr452[0];
                    int i2202 = 1064826444 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i2212 = (-45) - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                    int indexOf32 = (-1024869209) - TextUtils.indexOf(str, str);
                    int i2222 = -View.combineMeasuredStates(0, 0);
                    Object[] objArr462 = new Object[1];
                    delta(i2202, i2212, indexOf32, (short) ((i2222 ^ 19) + ((i2222 & 19) << 1)), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr462);
                    String str322 = (String) objArr462[0];
                    Object[] objArr472 = new Object[1];
                    charlie((char) View.MeasureSpec.getMode(0), TextUtils.indexOf(str, str, 0, 0), "ᇨ㤺ㆅ士\udaa9\uf1a2ဂ쒴ӿ\uf717", "㯯獲䉛⤧", objArr472);
                    String str332 = (String) objArr472[0];
                    int i2232 = 1064826442 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
                    int i2242 = -KeyEvent.getDeadChar(0, 0);
                    Object[] objArr482 = new Object[1];
                    delta(i2232, (i2242 ^ (-42)) + ((i2242 & (-42)) << 1), (-1024869201) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (36 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) View.MeasureSpec.getSize(0), objArr482);
                    String str342 = (String) objArr482[0];
                    int combineMeasuredStates22 = View.combineMeasuredStates(0, 0);
                    int i2252 = ((-1064777821) ^ combineMeasuredStates22) + ((combineMeasuredStates22 & (-1064777821)) << 1);
                    Object[] objArr492 = new Object[1];
                    charlie((char) ((-TextUtils.indexOf((CharSequence) str, '0', 0)) - 1), i2252, "\ue693\ue314᱃ᅀ춷ꓤᴐ\ue3a8\udceb巇ᨦ", "ꎾ裇ダᳪ", objArr492);
                    String str352 = (String) objArr492[0];
                    int i2262 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i2272 = (1064826444 ^ i2262) + ((i2262 & 1064826444) << 1);
                    int i2282 = -Color.argb(0, 0, 0, 0);
                    int i2292 = (i2282 ^ (-38)) + ((i2282 & (-38)) << 1);
                    int i2302 = -TextUtils.getOffsetBefore(str, 0);
                    int i2312 = (((-1024869191) | i2302) << 1) - (i2302 ^ (-1024869191));
                    int lastIndexOf32 = TextUtils.lastIndexOf(str, '0', 0);
                    Object[] objArr502 = new Object[1];
                    delta(i2272, i2292, i2312, (short) ((lastIndexOf32 & (-100)) + (lastIndexOf32 | (-100))), (byte) Color.argb(0, 0, 0, 0), objArr502);
                    String str362 = (String) objArr502[0];
                    int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                    int i2322 = (1064826444 & tapTimeout2) + (tapTimeout2 | 1064826444);
                    int i2332 = -(-ExpandableListView.getPackedPositionType(0L));
                    int i2342 = (i2332 & (-39)) + (i2332 | (-39));
                    int myTid10 = (Process.myTid() >> 22) - 1024869177;
                    int indexOf42 = TextUtils.indexOf(str, str, 0);
                    int i2352 = (indexOf42 * 471) - 44745;
                    int i2362 = ((indexOf42 ^ (-95)) | (indexOf42 & (-95))) * (-470);
                    int i2372 = (i2352 ^ i2362) + ((i2352 & i2362) << 1);
                    int i2382 = ~indexOf42;
                    int i2392 = ~((i2382 & 94) | (i2382 ^ 94));
                    int i2402 = ~((94 ^ i4) | (94 & i4));
                    int i2412 = (i2392 & i2402) | (i2392 ^ i2402);
                    int i2422 = i17 | indexOf42;
                    int i2432 = ~((i2422 & (-95)) | (i2422 ^ (-95)));
                    int i2442 = ((i2412 & i2432) | (i2412 ^ i2432)) * (-470);
                    int i2452 = (i2372 & i2442) + (i2442 | i2372);
                    int i2462 = (94 ^ indexOf42) | (94 & indexOf42);
                    int i2472 = ~((i2462 & i4) | (i2462 ^ i4));
                    int i2482 = (indexOf42 & i17) | (i17 ^ indexOf42);
                    int i2492 = ~((i2482 & (-95)) | (i2482 ^ (-95)));
                    Object[] objArr512 = new Object[1];
                    delta(i2322, i2342, myTid10, (short) ((((i2492 & i2472) | (i2472 ^ i2492)) * 470) + i2452), (byte) TextUtils.getOffsetAfter(str, 0), objArr512);
                    String[] strArr62 = {str102, str112, str122, str132, str142, str152, str162, str172, str182, str192, str202, str212, str222, str232, str242, str252, str262, str272, str282, str292, str302, str312, str322, str332, str342, str352, str362, (String) objArr512[0]};
                    char normalizeMetaState4 = (char) KeyEvent.normalizeMetaState(0);
                    int indexOf52 = TextUtils.indexOf((CharSequence) str, '0', 0);
                    int i2502 = (((-1716522125) | indexOf52) << 1) - (indexOf52 ^ (-1716522125));
                    Object[] objArr522 = new Object[1];
                    charlie(normalizeMetaState4, i2502, "꩐Ὗ濴ᮻᵄꘘ耡ኻ旺\ueabaꏖ", "牱꿳墙\udab3", objArr522);
                    Object[] objArr532 = {(String) objArr522[0]};
                    D8871 = uH18377.D8871(i20);
                    if (D8871 == null) {
                    }
                    invoke = ((Method) D8871).invoke(null, objArr532);
                    if (invoke != null) {
                    }
                    int i2712 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int i2722 = (i2712 & 1064826374) + (i2712 | 1064826374);
                    int myPid22 = (-30) - (Process.myPid() >> 22);
                    int i2732 = -TextUtils.getOffsetBefore(str, 0);
                    int i2742 = ((i2732 | (-1024869153)) << 1) - (i2732 ^ (-1024869153));
                    int i2752 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                    Object[] objArr692 = new Object[1];
                    delta(i2722, myPid22, i2742, (short) ((i2752 & 59) + (i2752 | 59)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr692);
                    Object[] objArr702 = {(String) objArr692[0]};
                    D88712 = uH18377.D8871(1553409481);
                    if (D88712 == null) {
                    }
                    long longValue92 = ((Long) ((Method) D88712).invoke(null, objArr702)).longValue();
                    long j672 = 1790493339;
                    long j682 = 471;
                    long j692 = -470;
                    long j702 = ((j672 | longValue92) * j692) + (j682 * longValue92) + (j682 * j672);
                    long j712 = longValue92 ^ j5;
                    long j722 = i4;
                    long j732 = j722 ^ j5;
                    long j742 = ((j732 | j672) | longValue92) ^ j5;
                    long j752 = ((470 * (j742 | (((j712 | j672) | j722) ^ j5))) + ((j692 * (((((j672 ^ j5) | j712) ^ j5) | ((j712 | j722) ^ j5)) | j742)) + j702)) - 1933140995;
                    int i2762 = ((int) (j752 >> 32)) & (((i4 | (-2063466238)) * 54) + (((~((-2023243389) | i4)) | (-2063466238) | (~(2023243388 | i17))) * 54) + ((((~((-586016978) | i17)) | 545794128) * (-108)) - 2111456150));
                    int myUid22 = Process.myUid();
                    int i2772 = ((int) j752) & ((((~(myUid22 | 1432689544)) | 4536865 | (~((~myUid22) | (-1432689545)))) * 45) + (((~(4536865 | myUid22)) | 4528640) * (-45)) + ((((~(4536865 | r4)) | (-1432689545)) * (-90)) - 1687905466));
                    j7 = (i2762 & i2772) | (i2762 ^ i2772);
                    int i2782 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int trimmedLength22 = TextUtils.getTrimmedLength(str);
                    int i2792 = (trimmedLength22 & (-1006181703)) + (trimmedLength22 | (-1006181703));
                    Object[] objArr722 = new Object[1];
                    charlie((char) (((i2782 | 59449) << 1) - (i2782 ^ 59449)), i2792, "챧\uf84eך낙蛕呵箼搌즹ⷓﴜ䥷\ue26bﰴ栃⿑魓", "뤯ۢ㧄ꫨ", objArr722);
                    Object[] objArr732 = {(String) objArr722[0]};
                    D88713 = uH18377.D8871(1553409481);
                    if (D88713 == null) {
                    }
                    long longValue102 = ((Long) ((Method) D88713).invoke(null, objArr732)).longValue();
                    long j762 = 1544374147;
                    long j772 = 370;
                    long j782 = -369;
                    long romeo32 = ao.ad.romeo();
                    long j792 = romeo32 ^ j5;
                    long j802 = ((j762 | longValue102 | j792) * j782) + (j772 * longValue102) + (j772 * j762);
                    long j812 = (j762 ^ j5) | j792;
                    long j822 = ((369 * (((longValue102 | j812) ^ j5) | ((((longValue102 ^ j5) | j762) ^ j5) | ((j762 | romeo32) ^ j5)))) + ((j782 * (longValue102 | (j812 ^ j5))) + j802)) - 1687021803;
                    int myTid52 = Process.myTid();
                    int i2812 = ((int) (j822 >> 32)) & ((((~(myTid52 | (-1291703174))) | (~((~myTid52) | (-1566037712)))) * 627) + (((~(1566037711 | myTid52)) | (-1291703174)) * (-627)) + (((-285344843) | myTid52) * (-627)) + 635053320);
                    int i2822 = ((int) j822) & ((((~(i17 | (-70816427))) | (~((-1366409984) | i4))) * 950) + (((~(i17 | (-1366409984))) | (~((-70816427) | i4))) * (-950)) + ((((~(70816426 | i17)) | (~(1366409983 | i4))) * 1900) - 1871736089));
                    j10 = (i2812 & i2822) | (i2812 ^ i2822);
                    if (j7 > 0) {
                        int i2832 = kilo;
                        juliet = (i2832 + 95) % 128;
                        if (j10 - 3 < j7) {
                        }
                    }
                    int lastIndexOf62 = TextUtils.lastIndexOf(str, '0', 0);
                    int i2912 = (lastIndexOf62 ^ 1064826375) + ((lastIndexOf62 & 1064826375) << 1);
                    int i2922 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i2932 = ((i2922 | (-30)) << 1) - (i2922 ^ (-30));
                    int i2942 = (-1024869154) - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                    int i2952 = -(-AndroidCharacter.getMirror('0'));
                    Object[] objArr762 = new Object[1];
                    delta(i2912, i2932, i2942, (short) ((i2952 & 11) + (i2952 | 11)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr762);
                    Object[] objArr772 = {(String) objArr762[0]};
                    D88714 = uH18377.D8871(1553409481);
                    if (D88714 == null) {
                    }
                    long longValue112 = ((Long) ((Method) D88714).invoke(null, objArr772)).longValue();
                    long j832 = 1158045533;
                    long j842 = (949 * longValue112) + ((-947) * j832);
                    long j852 = -948;
                    long j862 = j832 ^ j5;
                    long j872 = longValue112 ^ j5;
                    long freeMemory6 = (int) Runtime.getRuntime().freeMemory();
                    long j882 = ((948 * (j832 | j872)) + ((j852 * (((j862 | j872) | (freeMemory6 ^ j5)) ^ j5)) + (((j862 | ((j872 | freeMemory6) ^ j5)) * j852) + j842))) - 1300693189;
                    int i2962 = ((int) (j882 >> 32)) & ((((-169873537) | i4) * 465) + (((-171490521) | (~((-1608716932) | i4))) * 930) + (((~((-171490521) | i4)) | (-1608716932)) * (-465)) + 1280557577);
                    int foxtrot32 = ((int) j882) & A0.z.foxtrot((~(i23 | i4)) | 553735200, 446, (((~(995480804 | i17)) | (-995480806)) * 446) - 384374209, -1602807988);
                    j11 = (i2962 & foxtrot32) | (i2962 ^ foxtrot32);
                    int i2972 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i2982 = -((byte) KeyEvent.getModifierMetaStateMask());
                    int alpha72 = C1211g1.alpha();
                    int i2992 = i2982 * (-589);
                    int i3002 = (i2992 ^ (-591)) + ((i2992 & (-591)) << 1);
                    int i3012 = ~alpha72;
                    int i3022 = ~i3012;
                    int i3032 = ~i2982;
                    int i3042 = i3022 | i3032;
                    int i3052 = ~(i3012 | i2982);
                    int i3062 = (i3042 & i3052) | (i3042 ^ i3052);
                    int i3072 = ~((~i3032) | i3032 | alpha72);
                    int i3082 = ((i3062 & i3072) | (i3062 ^ i3072)) * 590;
                    int i3092 = (i3002 ^ i3082) + ((i3082 & i3002) << 1);
                    int i3102 = ((i3022 ^ i3032) | (i3022 & i3032) | (~((i2982 & i3012) | (i3012 ^ i2982)))) * (-1180);
                    int i3112 = (i3092 & i3102) + (i3102 | i3092);
                    int i3122 = ~((i3032 ^ i3012) | (i3032 & i3012));
                    int i3132 = ~(i3022 | i3012);
                    int i3142 = ((i3122 & i3132) | (i3122 ^ i3132)) * 590;
                    int i3152 = ((i3112 | i3142) << 1) - (i3142 ^ i3112);
                    Object[] objArr792 = new Object[1];
                    charlie((char) ((i2972 ^ 32030) + ((i2972 & 32030) << 1)), i3152, "還\uea37༾\uab1b", "\ude7a\ue3f6ṁ乽", objArr792);
                    Object[] objArr802 = {(String) objArr792[0]};
                    D88715 = uH18377.D8871(1553409481);
                    if (D88715 == null) {
                    }
                    long longValue122 = ((Long) ((Method) D88715).invoke(null, objArr802)).longValue();
                    long j892 = 1753242004;
                    long j902 = j892 ^ j5;
                    long j912 = ((-191) * j902) + (192 * longValue122) + ((-381) * j892);
                    long j922 = 191;
                    long elapsedRealtime32 = (int) SystemClock.elapsedRealtime();
                    long j932 = ((j922 * ((((elapsedRealtime32 ^ j5) | longValue122) ^ j5) | ((j902 | longValue122) ^ j5))) + (((j892 | ((longValue122 | elapsedRealtime32) ^ j5)) * j922) + j912)) - 1895889660;
                    int i3162 = ((int) (j932 >> 32)) & ((((~(1686717974 | i17)) | 558178856) * 398) + (((~(1686717974 | i4)) | 558178856) * 398) + 671684412);
                    int myTid62 = Process.myTid();
                    int i3172 = ~(646895893 | myTid62);
                    int i3182 = ~myTid62;
                    int i3192 = ((int) j932) & ((((~(myTid62 | 790330516)) | 152118400 | (~((-646895894) | i3182))) * 904) + (((~(i3182 | (-638212117))) | (~(799014293 | myTid62))) * 904) + (((i3172 | (~((-790330517) | i3182))) * (-1808)) - 621346099));
                    j12 = (i3162 & i3192) | (i3162 ^ i3192);
                    if (j11 > 0) {
                        int i3202 = kilo;
                        juliet = ((i3202 & 67) + (i3202 | 67)) % 128;
                        if (j12 + 100 < j11) {
                        }
                    }
                    int fadingEdgeLength2 = 1064826374 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i3302 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i3312 = (i3302 & (-45)) + (i3302 | (-45));
                    int i3322 = (-1024869132) - (~(-TextUtils.getOffsetBefore(str, 0)));
                    int i3332 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    Object[] objArr832 = new Object[1];
                    delta(fadingEdgeLength2, i3312, i3322, (short) ((i3332 ^ 97) + ((i3332 & 97) << 1)), (byte) ((-2) - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr832);
                    String str382 = (String) objArr832[0];
                    int i3342 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int i3352 = (i3342 & 1064826374) + (i3342 | 1064826374);
                    int i3362 = -(-Gravity.getAbsoluteGravity(0, 0));
                    int i3372 = (i3362 ^ (-42)) + ((i3362 & (-42)) << 1);
                    int i3382 = -View.getDefaultSize(0, 0);
                    Object[] objArr842 = new Object[1];
                    delta(i3352, i3372, (i3382 ^ (-1024869125)) + ((i3382 & (-1024869125)) << 1), (short) ((-104) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) Color.blue(0), objArr842);
                    String str392 = (String) objArr842[0];
                    Object[] objArr852 = new Object[1];
                    charlie((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0), "ዢ쒪塢\ud8cb䳬頷醘ྛ⠤ӥᅯ㐔", "\udc3b\ue8aa쭁猶", objArr852);
                    String str402 = (String) objArr852[0];
                    int i3392 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int alpha82 = C1211g1.alpha();
                    int i3402 = i3392 * 934;
                    int i3412 = (i3402 & (-280734260)) + (i3402 | (-280734260));
                    int i3422 = ~i3392;
                    int i3432 = ~alpha82;
                    int i3442 = ~(i3422 | i3432);
                    int i3452 = ((i3442 & (-1064826374)) | ((-1064826374) ^ i3442)) * (-933);
                    int i3462 = (i3412 & i3452) + (i3452 | i3412);
                    int i3472 = ~((i3432 & (-1064826374)) | ((-1064826374) ^ i3432));
                    int i3482 = ~((-1064826374) | i3392);
                    int i3492 = ((i3472 & i3482) | (i3472 ^ i3482)) * 933;
                    int i3502 = ((~(i3392 | 1064826373)) * 933) + (i3462 ^ i3492) + ((i3492 & i3462) << 1);
                    int i3512 = -ExpandableListView.getPackedPositionChild(0L);
                    int alpha92 = C1211g1.alpha();
                    int i3522 = (i3512 * (-963)) - 964;
                    int i3532 = (i3522 & (-40530)) + (i3522 | (-40530));
                    int i3542 = ~i3512;
                    i27 = 41;
                    int i3552 = ~((41 ^ alpha92) | (41 & alpha92));
                    int i3562 = -(-(((i3542 & i3552) | (i3542 ^ i3552)) * (-964)));
                    int i3572 = ((i3532 | i3562) << 1) - (i3562 ^ i3532);
                    int i3582 = ((~((i3512 & 41) | (41 ^ i3512))) | (~((~alpha92) | 41))) * (-964);
                    int i3592 = (i3572 ^ i3582) + ((i3582 & i3572) << 1);
                    int i3602 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr862 = new Object[1];
                    delta(i3502, i3592, ((i3602 | (-1024869115)) << 1) - (i3602 ^ (-1024869115)), (short) ((-28) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) KeyEvent.keyCodeFromString(str), objArr862);
                    String str412 = (String) objArr862[0];
                    int scrollBarFadeDuration2 = 1064826374 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i3612 = (-91) - (~(-(-AndroidCharacter.getMirror('0'))));
                    int keyRepeatTimeout42 = (-1024869104) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i3622 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr872 = new Object[1];
                    delta(scrollBarFadeDuration2, i3612, keyRepeatTimeout42, (short) ((i3622 & (-6)) + (i3622 | (-6))), (byte) Color.blue(0), objArr872);
                    String str422 = (String) objArr872[0];
                    int i3632 = -(-(KeyEvent.getMaxKeyCode() >> 16));
                    int i3642 = (i3632 ^ 1064826374) + ((i3632 & 1064826374) << 1);
                    int lastIndexOf92 = TextUtils.lastIndexOf(str, '0', 0, 0);
                    int i3652 = (lastIndexOf92 ^ (-47)) + ((lastIndexOf92 & (-47)) << 1);
                    int i3662 = -TextUtils.indexOf(str, str, 0);
                    int i3672 = ((i3662 | (-1024869094)) << 1) - (i3662 ^ (-1024869094));
                    int lastIndexOf102 = TextUtils.lastIndexOf(str, '0', 0, 0);
                    int alpha102 = C1211g1.alpha();
                    int i3682 = lastIndexOf102 * (-129);
                    int i3692 = (i3682 ^ (-11790)) + ((i3682 & (-11790)) << 1);
                    int i3702 = (~alpha102) | 89;
                    int i3712 = (i3692 - (~(-(-((~((i3702 & lastIndexOf102) | (i3702 ^ lastIndexOf102))) * 130))))) - 1;
                    int i3722 = -(-((~(89 | lastIndexOf102)) * (-260)));
                    int i3732 = (i3712 ^ i3722) + ((i3722 & i3712) << 1);
                    int i3742 = ~((~lastIndexOf102) | (-90));
                    int i3752 = (lastIndexOf102 & 89) | (89 ^ lastIndexOf102);
                    Object[] objArr882 = new Object[1];
                    delta(i3642, i3652, i3672, (short) ((i3732 - (~(((~((i3752 & alpha102) | (i3752 ^ alpha102))) | i3742) * 130))) - 1), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr882);
                    String str432 = (String) objArr882[0];
                    int i3762 = 1064826375 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i3772 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    i28 = 1;
                    int i3782 = (i3772 ^ (-49)) + ((i3772 & (-49)) << 1);
                    int defaultSize2 = View.getDefaultSize(0, 0);
                    int i3792 = ((defaultSize2 | (-1024869090)) << 1) - (defaultSize2 ^ (-1024869090));
                    int i3802 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i3812 = -MotionEvent.axisFromString(str);
                    Object[] objArr892 = new Object[1];
                    delta(i3762, i3782, i3792, (short) ((i3802 ^ (-31)) + ((i3802 & (-31)) << 1)), (byte) ((i3812 ^ (-1)) + (i3812 << 1)), objArr892);
                    i29 = 0;
                    strArr = new String[]{str382, str392, str402, str412, str422, str432, (String) objArr892[0]};
                    i30 = 0;
                    while (true) {
                        if (i30 >= 7) {
                        }
                        int i3852 = ((i40 | (-14)) << 1) - (i40 ^ (-14));
                        i30 = ((i3852 | 15) << 1) - (i3852 ^ 15);
                        i27 = i31;
                        strArr = strArr3;
                        i29 = 0;
                        i28 = 1;
                    }
                    if (i32 != 0) {
                    }
                } else {
                    Class cls4 = cls2;
                    int i737 = ((i73 | (-64)) << 1) - (i73 ^ (-64));
                    i73 = ((i737 | 65) << 1) - (i737 ^ 65);
                    cls2 = cls4;
                    j21 = j22;
                    f12 = 0.0f;
                    i74 = 2;
                    i43 = 0;
                    i44 = 1;
                    i14 = 53;
                    i22 = 4;
                    i63 = 52;
                }
            }
            cls = cls2;
        } else {
            cls = cls2;
            str = "";
            i23 = -2;
            i24 = 24;
            i25 = -49;
        }
        f5 = f12;
        i26 = i43;
        int i11922 = -(-(TypedValue.complexToFraction(i26, f5, f5) > f5 ? 1 : (TypedValue.complexToFraction(i26, f5, f5) == f5 ? 0 : -1)));
        int i12022 = ((1064826424 | i11922) << 1) - (i11922 ^ 1064826424);
        int i12122 = (-47) - (~(-TextUtils.lastIndexOf(str, '0')));
        int i12222 = -Color.alpha(0);
        int i12322 = ((-1024869270) ^ i12222) + ((i12222 & (-1024869270)) << 1);
        int gidForName222 = Process.getGidForName(str);
        Object[] objArr2422 = new Object[1];
        delta(i12022, i12122, i12322, (short) ((gidForName222 ^ 70) + ((gidForName222 & 70) << 1)), (byte) (ViewConfiguration.getTapTimeout() >> 16), objArr2422);
        String str1022 = (String) objArr2422[0];
        int i12422 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1064826423;
        int packedPositionChild32 = (-48) - ExpandableListView.getPackedPositionChild(0L);
        int keyRepeatTimeout322 = (-1024869263) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i12522 = -((Process.getThreadPriority(0) + 20) >> 6);
        Object[] objArr2522 = new Object[1];
        delta(i12422, packedPositionChild32, keyRepeatTimeout322, (short) ((i12522 ^ (-87)) + ((i12522 & (-87)) << 1)), (byte) (KeyEvent.getMaxKeyCode() >> 16), objArr2522);
        String str1122 = (String) objArr2522[0];
        char c1422 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int keyRepeatDelay22 = ViewConfiguration.getKeyRepeatDelay() >> 16;
        int i12622 = (((-738748223) | keyRepeatDelay22) << 1) - (keyRepeatDelay22 ^ (-738748223));
        Object[] objArr2622 = new Object[1];
        charlie(c1422, i12622, "뷨畷Ꙙ掉퍚⊷䑎", "섊\uf798⛓\udbf2", objArr2622);
        String str1222 = (String) objArr2622[0];
        char c1522 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int i12722 = -TextUtils.lastIndexOf(str, '0');
        int i12822 = ((-121840607) & i12722) + (i12722 | (-121840607));
        Object[] objArr2722 = new Object[1];
        charlie(c1522, i12822, "寂綿떀‱痣᠍⩃ꎨ৽", "⋅볜룸ᑚ", objArr2722);
        String str1322 = (String) objArr2722[0];
        int i12922 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
        int i13022 = (1064826432 & i12922) + (i12922 | 1064826432);
        int i13122 = -(-(Process.myTid() >> 22));
        int i13222 = (i13122 & (-47)) + (i13122 | (-47));
        int i13322 = (-1024869258) - (~TextUtils.lastIndexOf(str, '0', 0, 0));
        int i13422 = -(KeyEvent.getMaxKeyCode() >> 16);
        int i13522 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        Object[] objArr2822 = new Object[1];
        delta(i13022, i13222, i13322, (short) (((i13422 | 123) << 1) - (i13422 ^ 123)), (byte) ((i13522 ^ 1) + ((i13522 & 1) << 1)), objArr2822);
        String str1422 = (String) objArr2822[0];
        int i13622 = -(ViewConfiguration.getEdgeSlop() >> 16);
        int i13722 = -AndroidCharacter.getMirror('0');
        int i13822 = ((-52795631) ^ i13722) + ((i13722 & (-52795631)) << 1);
        Object[] objArr2922 = new Object[1];
        charlie((char) ((48578 ^ i13622) + ((i13622 & 48578) << 1)), i13822, "炘Ϊ芋\ue9a3붬\ud8c7\ue5ea➏ₙ蛑ᨓ䍐甭", "\ue1a8\uda66싼沽", objArr2922);
        String str1522 = (String) objArr2922[0];
        int i13922 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        Object[] objArr3022 = new Object[1];
        charlie((char) ((i13922 & 19970) + (i13922 | 19970)), (ViewConfiguration.getScrollBarSize() >> 8) - 407602602, "ힼ쮭Ѧ헭椕", "囋둺˧㉎", objArr3022);
        String str1622 = (String) objArr3022[0];
        Object[] objArr3122 = new Object[1];
        charlie((char) (28715 - (~(-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))))), Process.myPid() >> 22, "殨婝ዬ奪傉器", "㋺䇦ⴓ셰", objArr3122);
        String str1722 = (String) objArr3122[0];
        int i14022 = 1064826431 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
        int i14122 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 52;
        int pressedStateDuration322 = ViewConfiguration.getPressedStateDuration() >> 16;
        int alpha522 = C1211g1.alpha();
        int i14222 = pressedStateDuration322 * 1773;
        int i14322 = (771189449 ^ i14222) + ((i14222 & 771189449) << 1);
        int i14422 = ~pressedStateDuration322;
        int i14522 = ~((i14422 & 1024869252) | (1024869252 ^ i14422));
        int i14622 = ~((1024869252 ^ alpha522) | (1024869252 & alpha522));
        int i14722 = (i14522 & i14622) | (i14522 ^ i14622);
        int i14822 = ~alpha522;
        int i14922 = ~(i14822 | pressedStateDuration322 | (-1024869253));
        int i15022 = -(-(((i14722 & i14922) | (i14722 ^ i14922)) * 886));
        int i15122 = (i14322 ^ i15022) + ((i15022 & i14322) << 1);
        int i15222 = ~(((-1024869253) ^ i14822) | ((-1024869253) & i14822));
        int i15322 = (i15122 - (~(-(-(((i15222 & pressedStateDuration322) | (pressedStateDuration322 ^ i15222)) * (-1772)))))) - 1;
        int i15422 = -(-((~((pressedStateDuration322 & i14822) | (i14822 ^ pressedStateDuration322))) * 886));
        int i15522 = (i15322 ^ i15422) + ((i15422 & i15322) << 1);
        int i15622 = -(-View.MeasureSpec.getMode(0));
        int lastIndexOf142 = TextUtils.lastIndexOf(str, '0');
        int alpha622 = C1211g1.alpha();
        int i15722 = ~(i23 | alpha622);
        int i15822 = ~alpha622;
        int i15922 = (((lastIndexOf142 * (-515)) + 517) - (~(-(-(((i15722 | (~((i15822 ^ lastIndexOf142) | (i15822 & lastIndexOf142)))) | (~((i15822 ^ 1) | (i15822 & 1)))) * (-516)))))) - 1;
        int i16022 = ~lastIndexOf142;
        int i16122 = ~(alpha622 | (i16022 ^ (-2)) | (i16022 & (-2)));
        int i16222 = i16022 | i15822;
        int i16322 = ~((i16222 & 1) | (i16222 ^ 1));
        int i16422 = (((i16122 & i16322) | (i16122 ^ i16322)) * 516) + i15922;
        int i16522 = ((~(i16022 | 1)) | (~(i15822 | 1))) * 516;
        byte b2322 = (byte) (((i16422 | i16522) << 1) - (i16522 ^ i16422));
        Object[] objArr3222 = new Object[1];
        delta(i14022, i14122, i15522, (short) ((i15622 & (-120)) + (i15622 | (-120))), b2322, objArr3222);
        String str1822 = (String) objArr3222[0];
        int i16622 = -Process.getGidForName(str);
        Object[] objArr3322 = new Object[1];
        charlie((char) (((50926 | i16622) << 1) - (i16622 ^ 50926)), (Process.getThreadPriority(0) + 20) >> 6, "Ềטּ깚袐䭤䭌㖀面Ѻ廿㪷猆\uee55ࣩ놏\uffe7", "ꎰ\ud837\uefc1ꗆ", objArr3322);
        String str1922 = (String) objArr3322[0];
        Object[] objArr3422 = new Object[1];
        charlie((char) (0 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "뛍详鞬ꓻ퀸挚鹃댬\uf20e릵", "蝹\ue2d2\udae9鸝", objArr3422);
        String str2022 = (String) objArr3422[0];
        int i16722 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
        int i16822 = (1064826438 & i16722) + (i16722 | 1064826438);
        int i16922 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
        Object[] objArr3522 = new Object[1];
        delta(i16822, ((i16922 | (-45)) << 1) - (i16922 ^ (-45)), View.MeasureSpec.getMode(0) - 1024869252, (short) ((-127) - (Process.myTid() >> 22)), (byte) Color.blue(0), objArr3522);
        String str2122 = (String) objArr3522[0];
        int i17022 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
        int threadPriority42 = Process.getThreadPriority(0);
        int i17122 = threadPriority42 * (-344);
        int i17222 = (((-6880) | i17122) << 1) - (i17122 ^ (-6880));
        int i17322 = ~threadPriority42;
        int i17422 = ((-21) ^ i17322) | ((-21) & i17322);
        int i17522 = ~i17422;
        int i17622 = ~(((-21) ^ i4) | ((-21) & i4));
        int i17722 = (((i17522 & i17622) | (i17522 ^ i17622)) * 345) + i17222;
        int i17822 = -(-(((~(i17322 | 20)) | (~(((-21) ^ i17) | ((-21) & i17)))) * 345));
        int i17922 = (i17722 & i17822) + (i17822 | i17722);
        int i18022 = -(-((~((i17422 ^ i4) | (i17422 & i4))) * 345));
        Object[] objArr3622 = new Object[1];
        charlie((char) ((i17022 ^ 1) + ((i17022 & 1) << 1)), ((i17922 & i18022) + (i18022 | i17922)) >> 6, "ਜ\ued3e\uf7cc婬礜檟\uee0fሺ纴⊌ꋉ\uf45f", "ᓴ⬎纝튦", objArr3622);
        String str2222 = (String) objArr3622[0];
        int doubleTapTimeout32 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1064826439;
        int i18122 = -(-TextUtils.getCapsMode(str, 0, 0));
        int i18222 = (i18122 & (-39)) + (i18122 | (-39));
        int i18322 = (-1024869245) - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        int i18422 = -View.getDefaultSize(0, 0);
        Object[] objArr3722 = new Object[1];
        delta(doubleTapTimeout32, i18222, i18322, (short) ((i18422 ^ (-33)) + ((i18422 & (-33)) << 1)), (byte) View.resolveSizeAndState(0, 0, 0), objArr3722);
        String str2322 = (String) objArr3722[0];
        int i18522 = -(-TextUtils.getOffsetAfter(str, 0));
        int i18622 = (1064826441 ^ i18522) + ((i18522 & 1064826441) << 1);
        int modifierMetaStateMask32 = ((byte) KeyEvent.getModifierMetaStateMask()) - 45;
        int i18722 = -Process.getGidForName(str);
        int i18822 = ((-1024869233) ^ i18722) + ((i18722 & (-1024869233)) << 1);
        int i18922 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        Object[] objArr3822 = new Object[1];
        delta(i18622, modifierMetaStateMask32, i18822, (short) ((i18922 & (-128)) + (i18922 | (-128))), (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr3822);
        String str2422 = (String) objArr3822[0];
        char touchSlop32 = (char) (ViewConfiguration.getTouchSlop() >> 8);
        int scrollBarSize62 = ViewConfiguration.getScrollBarSize() >> 8;
        int i19022 = ((-1599843150) & scrollBarSize62) + (scrollBarSize62 | (-1599843150));
        Object[] objArr3922 = new Object[1];
        charlie(touchSlop32, i19022, "ᱚ븝⤅\ud944㻙駯嵋", "눚ꑔ\uf0a0ᩯ", objArr3922);
        String str2522 = (String) objArr3922[0];
        int lastIndexOf222 = TextUtils.lastIndexOf(str, '0', 0, 0);
        int i19122 = -Drawable.resolveOpacity(0, 0);
        int i19222 = (((-1849261104) | i19122) << 1) - (i19122 ^ (-1849261104));
        Object[] objArr4022 = new Object[1];
        charlie((char) ((lastIndexOf222 ^ 1) + ((lastIndexOf222 & 1) << 1)), i19222, "嵂퇩湒ꝫ䳼䨈\ueeef", "탅욃妑ᝲ", objArr4022);
        String str2622 = (String) objArr4022[0];
        int trimmedLength42 = 1064826442 - TextUtils.getTrimmedLength(str);
        int i19322 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        int i19422 = ((i19322 | (-50)) << 1) - (i19322 ^ (-50));
        int deadChar222 = KeyEvent.getDeadChar(0, 0);
        int i19522 = deadChar222 * 46;
        int i19622 = ((100655860 | i19522) << 1) - (i19522 ^ 100655860);
        int i19722 = ~(1024869225 | i17);
        int i19822 = (((i19722 & deadChar222) | (deadChar222 ^ i19722)) * (-90)) + i19622;
        int i19922 = ~((1024869225 ^ i4) | (1024869225 & i4));
        int i20022 = ~(((-1024869226) ^ deadChar222) | ((-1024869226) & deadChar222));
        int i20122 = -(-(((i19922 & i20022) | (i19922 ^ i20022)) * (-45)));
        int i20222 = (i19822 ^ i20122) + ((i19822 & i20122) << 1);
        int i20322 = (~((~deadChar222) | i4)) | 1024869225;
        int i20422 = ~((deadChar222 & i17) | (i17 ^ deadChar222));
        int i20522 = -(-(((i20422 & i20322) | (i20322 ^ i20422)) * 45));
        int i20622 = (i20222 & i20522) + (i20522 | i20222);
        short s322 = (short) (45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
        int i20722 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
        Object[] objArr4122 = new Object[1];
        delta(trimmedLength42, i19422, i20622, s322, (byte) ((i20722 & 1) + (i20722 | 1)), objArr4122);
        String str2722 = (String) objArr4122[0];
        int i20822 = -(-AndroidCharacter.getMirror('0'));
        Object[] objArr4222 = new Object[1];
        charlie((char) (((i20822 | (-48)) << 1) - (i20822 ^ (-48))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "䒊ﰓฆ\uf6a0뵸幰俴竺⩴䅛\ude9c\ud9ee\ua7efׯ貐훵擠䣄\uf7d2\uf04a", "ꆰ\uf394搔㰾", objArr4222);
        String str2822 = (String) objArr4222[0];
        Object[] objArr4322 = new Object[1];
        charlie((char) (Gravity.getAbsoluteGravity(0, 0) + 18306), TextUtils.getTrimmedLength(str), "샥欧ᔃ⮊崟\ud8ee", "⳺搗芾\udd47", objArr4322);
        String str2922 = (String) objArr4322[0];
        int scrollBarSize222 = ViewConfiguration.getScrollBarSize() >> 8;
        int i20922 = (1064826442 & scrollBarSize222) + (scrollBarSize222 | 1064826442);
        int i21022 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        int i21122 = ((i21022 | (-52)) << 1) - (i21022 ^ (-52));
        int i21222 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
        int i21322 = ((-1024869225) & i21222) + (i21222 | (-1024869225));
        int i21422 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        Object[] objArr4422 = new Object[1];
        delta(i20922, i21122, i21322, (short) (((i21422 | (-68)) << 1) - (i21422 ^ (-68))), (byte) TextUtils.getOffsetAfter(str, 0), objArr4422);
        String str3022 = (String) objArr4422[0];
        int i21522 = 1064826441 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
        int i21622 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i21722 = (i21622 & (-36)) + (i21622 | (-36));
        int i21822 = (-1024869226) - (~(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
        int i21922 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
        Object[] objArr4522 = new Object[1];
        delta(i21522, i21722, i21822, (short) ((i21922 & (-49)) + (i21922 | (-49))), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4522);
        String str3122 = (String) objArr4522[0];
        int i22022 = 1064826444 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        int i22122 = (-45) - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
        int indexOf322 = (-1024869209) - TextUtils.indexOf(str, str);
        int i22222 = -View.combineMeasuredStates(0, 0);
        Object[] objArr4622 = new Object[1];
        delta(i22022, i22122, indexOf322, (short) ((i22222 ^ 19) + ((i22222 & 19) << 1)), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4622);
        String str3222 = (String) objArr4622[0];
        Object[] objArr4722 = new Object[1];
        charlie((char) View.MeasureSpec.getMode(0), TextUtils.indexOf(str, str, 0, 0), "ᇨ㤺ㆅ士\udaa9\uf1a2ဂ쒴ӿ\uf717", "㯯獲䉛⤧", objArr4722);
        String str3322 = (String) objArr4722[0];
        int i22322 = 1064826442 - (~View.MeasureSpec.makeMeasureSpec(0, 0));
        int i22422 = -KeyEvent.getDeadChar(0, 0);
        Object[] objArr4822 = new Object[1];
        delta(i22322, (i22422 ^ (-42)) + ((i22422 & (-42)) << 1), (-1024869201) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (36 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) View.MeasureSpec.getSize(0), objArr4822);
        String str3422 = (String) objArr4822[0];
        int combineMeasuredStates222 = View.combineMeasuredStates(0, 0);
        int i22522 = ((-1064777821) ^ combineMeasuredStates222) + ((combineMeasuredStates222 & (-1064777821)) << 1);
        Object[] objArr4922 = new Object[1];
        charlie((char) ((-TextUtils.indexOf((CharSequence) str, '0', 0)) - 1), i22522, "\ue693\ue314᱃ᅀ춷ꓤᴐ\ue3a8\udceb巇ᨦ", "ꎾ裇ダᳪ", objArr4922);
        String str3522 = (String) objArr4922[0];
        int i22622 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        int i22722 = (1064826444 ^ i22622) + ((i22622 & 1064826444) << 1);
        int i22822 = -Color.argb(0, 0, 0, 0);
        int i22922 = (i22822 ^ (-38)) + ((i22822 & (-38)) << 1);
        int i23022 = -TextUtils.getOffsetBefore(str, 0);
        int i23122 = (((-1024869191) | i23022) << 1) - (i23022 ^ (-1024869191));
        int lastIndexOf322 = TextUtils.lastIndexOf(str, '0', 0);
        Object[] objArr5022 = new Object[1];
        delta(i22722, i22922, i23122, (short) ((lastIndexOf322 & (-100)) + (lastIndexOf322 | (-100))), (byte) Color.argb(0, 0, 0, 0), objArr5022);
        String str3622 = (String) objArr5022[0];
        int tapTimeout22 = ViewConfiguration.getTapTimeout() >> 16;
        int i23222 = (1064826444 & tapTimeout22) + (tapTimeout22 | 1064826444);
        int i23322 = -(-ExpandableListView.getPackedPositionType(0L));
        int i23422 = (i23322 & (-39)) + (i23322 | (-39));
        int myTid102 = (Process.myTid() >> 22) - 1024869177;
        int indexOf422 = TextUtils.indexOf(str, str, 0);
        int i23522 = (indexOf422 * 471) - 44745;
        int i23622 = ((indexOf422 ^ (-95)) | (indexOf422 & (-95))) * (-470);
        int i23722 = (i23522 ^ i23622) + ((i23522 & i23622) << 1);
        int i23822 = ~indexOf422;
        int i23922 = ~((i23822 & 94) | (i23822 ^ 94));
        int i24022 = ~((94 ^ i4) | (94 & i4));
        int i24122 = (i23922 & i24022) | (i23922 ^ i24022);
        int i24222 = i17 | indexOf422;
        int i24322 = ~((i24222 & (-95)) | (i24222 ^ (-95)));
        int i24422 = ((i24122 & i24322) | (i24122 ^ i24322)) * (-470);
        int i24522 = (i23722 & i24422) + (i24422 | i23722);
        int i24622 = (94 ^ indexOf422) | (94 & indexOf422);
        int i24722 = ~((i24622 & i4) | (i24622 ^ i4));
        int i24822 = (indexOf422 & i17) | (i17 ^ indexOf422);
        int i24922 = ~((i24822 & (-95)) | (i24822 ^ (-95)));
        Object[] objArr5122 = new Object[1];
        delta(i23222, i23422, myTid102, (short) ((((i24922 & i24722) | (i24722 ^ i24922)) * 470) + i24522), (byte) TextUtils.getOffsetAfter(str, 0), objArr5122);
        String[] strArr622 = {str1022, str1122, str1222, str1322, str1422, str1522, str1622, str1722, str1822, str1922, str2022, str2122, str2222, str2322, str2422, str2522, str2622, str2722, str2822, str2922, str3022, str3122, str3222, str3322, str3422, str3522, str3622, (String) objArr5122[0]};
        char normalizeMetaState42 = (char) KeyEvent.normalizeMetaState(0);
        int indexOf522 = TextUtils.indexOf((CharSequence) str, '0', 0);
        int i25022 = (((-1716522125) | indexOf522) << 1) - (indexOf522 ^ (-1716522125));
        Object[] objArr5222 = new Object[1];
        charlie(normalizeMetaState42, i25022, "꩐Ὗ濴ᮻᵄꘘ耡ኻ旺\ueabaꏖ", "牱꿳墙\udab3", objArr5222);
        Object[] objArr5322 = {(String) objArr5222[0]};
        D8871 = uH18377.D8871(i20);
        if (D8871 == null) {
        }
        invoke = ((Method) D8871).invoke(null, objArr5322);
        if (invoke != null) {
        }
        int i27122 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
        int i27222 = (i27122 & 1064826374) + (i27122 | 1064826374);
        int myPid222 = (-30) - (Process.myPid() >> 22);
        int i27322 = -TextUtils.getOffsetBefore(str, 0);
        int i27422 = ((i27322 | (-1024869153)) << 1) - (i27322 ^ (-1024869153));
        int i27522 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
        Object[] objArr6922 = new Object[1];
        delta(i27222, myPid222, i27422, (short) ((i27522 & 59) + (i27522 | 59)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), objArr6922);
        Object[] objArr7022 = {(String) objArr6922[0]};
        D88712 = uH18377.D8871(1553409481);
        if (D88712 == null) {
        }
        long longValue922 = ((Long) ((Method) D88712).invoke(null, objArr7022)).longValue();
        long j6722 = 1790493339;
        long j6822 = 471;
        long j6922 = -470;
        long j7022 = ((j6722 | longValue922) * j6922) + (j6822 * longValue922) + (j6822 * j6722);
        long j7122 = longValue922 ^ j5;
        long j7222 = i4;
        long j7322 = j7222 ^ j5;
        long j7422 = ((j7322 | j6722) | longValue922) ^ j5;
        long j7522 = ((470 * (j7422 | (((j7122 | j6722) | j7222) ^ j5))) + ((j6922 * (((((j6722 ^ j5) | j7122) ^ j5) | ((j7122 | j7222) ^ j5)) | j7422)) + j7022)) - 1933140995;
        int i27622 = ((int) (j7522 >> 32)) & (((i4 | (-2063466238)) * 54) + (((~((-2023243389) | i4)) | (-2063466238) | (~(2023243388 | i17))) * 54) + ((((~((-586016978) | i17)) | 545794128) * (-108)) - 2111456150));
        int myUid222 = Process.myUid();
        int i27722 = ((int) j7522) & ((((~(myUid222 | 1432689544)) | 4536865 | (~((~myUid222) | (-1432689545)))) * 45) + (((~(4536865 | myUid222)) | 4528640) * (-45)) + ((((~(4536865 | r4)) | (-1432689545)) * (-90)) - 1687905466));
        j7 = (i27622 & i27722) | (i27622 ^ i27722);
        int i27822 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
        int trimmedLength222 = TextUtils.getTrimmedLength(str);
        int i27922 = (trimmedLength222 & (-1006181703)) + (trimmedLength222 | (-1006181703));
        Object[] objArr7222 = new Object[1];
        charlie((char) (((i27822 | 59449) << 1) - (i27822 ^ 59449)), i27922, "챧\uf84eך낙蛕呵箼搌즹ⷓﴜ䥷\ue26bﰴ栃⿑魓", "뤯ۢ㧄ꫨ", objArr7222);
        Object[] objArr7322 = {(String) objArr7222[0]};
        D88713 = uH18377.D8871(1553409481);
        if (D88713 == null) {
        }
        long longValue1022 = ((Long) ((Method) D88713).invoke(null, objArr7322)).longValue();
        long j7622 = 1544374147;
        long j7722 = 370;
        long j7822 = -369;
        long romeo322 = ao.ad.romeo();
        long j7922 = romeo322 ^ j5;
        long j8022 = ((j7622 | longValue1022 | j7922) * j7822) + (j7722 * longValue1022) + (j7722 * j7622);
        long j8122 = (j7622 ^ j5) | j7922;
        long j8222 = ((369 * (((longValue1022 | j8122) ^ j5) | ((((longValue1022 ^ j5) | j7622) ^ j5) | ((j7622 | romeo322) ^ j5)))) + ((j7822 * (longValue1022 | (j8122 ^ j5))) + j8022)) - 1687021803;
        int myTid522 = Process.myTid();
        int i28122 = ((int) (j8222 >> 32)) & ((((~(myTid522 | (-1291703174))) | (~((~myTid522) | (-1566037712)))) * 627) + (((~(1566037711 | myTid522)) | (-1291703174)) * (-627)) + (((-285344843) | myTid522) * (-627)) + 635053320);
        int i28222 = ((int) j8222) & ((((~(i17 | (-70816427))) | (~((-1366409984) | i4))) * 950) + (((~(i17 | (-1366409984))) | (~((-70816427) | i4))) * (-950)) + ((((~(70816426 | i17)) | (~(1366409983 | i4))) * 1900) - 1871736089));
        j10 = (i28122 & i28222) | (i28122 ^ i28222);
        if (j7 > 0) {
        }
        int lastIndexOf622 = TextUtils.lastIndexOf(str, '0', 0);
        int i29122 = (lastIndexOf622 ^ 1064826375) + ((lastIndexOf622 & 1064826375) << 1);
        int i29222 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i29322 = ((i29222 | (-30)) << 1) - (i29222 ^ (-30));
        int i29422 = (-1024869154) - (~(-(-View.resolveSizeAndState(0, 0, 0))));
        int i29522 = -(-AndroidCharacter.getMirror('0'));
        Object[] objArr7622 = new Object[1];
        delta(i29122, i29322, i29422, (short) ((i29522 & 11) + (i29522 | 11)), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr7622);
        Object[] objArr7722 = {(String) objArr7622[0]};
        D88714 = uH18377.D8871(1553409481);
        if (D88714 == null) {
        }
        long longValue1122 = ((Long) ((Method) D88714).invoke(null, objArr7722)).longValue();
        long j8322 = 1158045533;
        long j8422 = (949 * longValue1122) + ((-947) * j8322);
        long j8522 = -948;
        long j8622 = j8322 ^ j5;
        long j8722 = longValue1122 ^ j5;
        long freeMemory62 = (int) Runtime.getRuntime().freeMemory();
        long j8822 = ((948 * (j8322 | j8722)) + ((j8522 * (((j8622 | j8722) | (freeMemory62 ^ j5)) ^ j5)) + (((j8622 | ((j8722 | freeMemory62) ^ j5)) * j8522) + j8422))) - 1300693189;
        int i29622 = ((int) (j8822 >> 32)) & ((((-169873537) | i4) * 465) + (((-171490521) | (~((-1608716932) | i4))) * 930) + (((~((-171490521) | i4)) | (-1608716932)) * (-465)) + 1280557577);
        int foxtrot322 = ((int) j8822) & A0.z.foxtrot((~(i23 | i4)) | 553735200, 446, (((~(995480804 | i17)) | (-995480806)) * 446) - 384374209, -1602807988);
        j11 = (i29622 & foxtrot322) | (i29622 ^ foxtrot322);
        int i29722 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        int i29822 = -((byte) KeyEvent.getModifierMetaStateMask());
        int alpha722 = C1211g1.alpha();
        int i29922 = i29822 * (-589);
        int i30022 = (i29922 ^ (-591)) + ((i29922 & (-591)) << 1);
        int i30122 = ~alpha722;
        int i30222 = ~i30122;
        int i30322 = ~i29822;
        int i30422 = i30222 | i30322;
        int i30522 = ~(i30122 | i29822);
        int i30622 = (i30422 & i30522) | (i30422 ^ i30522);
        int i30722 = ~((~i30322) | i30322 | alpha722);
        int i30822 = ((i30622 & i30722) | (i30622 ^ i30722)) * 590;
        int i30922 = (i30022 ^ i30822) + ((i30822 & i30022) << 1);
        int i31022 = ((i30222 ^ i30322) | (i30222 & i30322) | (~((i29822 & i30122) | (i30122 ^ i29822)))) * (-1180);
        int i31122 = (i30922 & i31022) + (i31022 | i30922);
        int i31222 = ~((i30322 ^ i30122) | (i30322 & i30122));
        int i31322 = ~(i30222 | i30122);
        int i31422 = ((i31222 & i31322) | (i31222 ^ i31322)) * 590;
        int i31522 = ((i31122 | i31422) << 1) - (i31422 ^ i31122);
        Object[] objArr7922 = new Object[1];
        charlie((char) ((i29722 ^ 32030) + ((i29722 & 32030) << 1)), i31522, "還\uea37༾\uab1b", "\ude7a\ue3f6ṁ乽", objArr7922);
        Object[] objArr8022 = {(String) objArr7922[0]};
        D88715 = uH18377.D8871(1553409481);
        if (D88715 == null) {
        }
        long longValue1222 = ((Long) ((Method) D88715).invoke(null, objArr8022)).longValue();
        long j8922 = 1753242004;
        long j9022 = j8922 ^ j5;
        long j9122 = ((-191) * j9022) + (192 * longValue1222) + ((-381) * j8922);
        long j9222 = 191;
        long elapsedRealtime322 = (int) SystemClock.elapsedRealtime();
        long j9322 = ((j9222 * ((((elapsedRealtime322 ^ j5) | longValue1222) ^ j5) | ((j9022 | longValue1222) ^ j5))) + (((j8922 | ((longValue1222 | elapsedRealtime322) ^ j5)) * j9222) + j9122)) - 1895889660;
        int i31622 = ((int) (j9322 >> 32)) & ((((~(1686717974 | i17)) | 558178856) * 398) + (((~(1686717974 | i4)) | 558178856) * 398) + 671684412);
        int myTid622 = Process.myTid();
        int i31722 = ~(646895893 | myTid622);
        int i31822 = ~myTid622;
        int i31922 = ((int) j9322) & ((((~(myTid622 | 790330516)) | 152118400 | (~((-646895894) | i31822))) * 904) + (((~(i31822 | (-638212117))) | (~(799014293 | myTid622))) * 904) + (((i31722 | (~((-790330517) | i31822))) * (-1808)) - 621346099));
        j12 = (i31622 & i31922) | (i31622 ^ i31922);
        if (j11 > 0) {
        }
        int fadingEdgeLength22 = 1064826374 - (ViewConfiguration.getFadingEdgeLength() >> 16);
        int i33022 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i33122 = (i33022 & (-45)) + (i33022 | (-45));
        int i33222 = (-1024869132) - (~(-TextUtils.getOffsetBefore(str, 0)));
        int i33322 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        Object[] objArr8322 = new Object[1];
        delta(fadingEdgeLength22, i33122, i33222, (short) ((i33322 ^ 97) + ((i33322 & 97) << 1)), (byte) ((-2) - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr8322);
        String str3822 = (String) objArr8322[0];
        int i33422 = -(ViewConfiguration.getScrollBarSize() >> 8);
        int i33522 = (i33422 & 1064826374) + (i33422 | 1064826374);
        int i33622 = -(-Gravity.getAbsoluteGravity(0, 0));
        int i33722 = (i33622 ^ (-42)) + ((i33622 & (-42)) << 1);
        int i33822 = -View.getDefaultSize(0, 0);
        Object[] objArr8422 = new Object[1];
        delta(i33522, i33722, (i33822 ^ (-1024869125)) + ((i33822 & (-1024869125)) << 1), (short) ((-104) - (ViewConfiguration.getEdgeSlop() >> 16)), (byte) Color.blue(0), objArr8422);
        String str3922 = (String) objArr8422[0];
        Object[] objArr8522 = new Object[1];
        charlie((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0), "ዢ쒪塢\ud8cb䳬頷醘ྛ⠤ӥᅯ㐔", "\udc3b\ue8aa쭁猶", objArr8522);
        String str4022 = (String) objArr8522[0];
        int i33922 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
        int alpha822 = C1211g1.alpha();
        int i34022 = i33922 * 934;
        int i34122 = (i34022 & (-280734260)) + (i34022 | (-280734260));
        int i34222 = ~i33922;
        int i34322 = ~alpha822;
        int i34422 = ~(i34222 | i34322);
        int i34522 = ((i34422 & (-1064826374)) | ((-1064826374) ^ i34422)) * (-933);
        int i34622 = (i34122 & i34522) + (i34522 | i34122);
        int i34722 = ~((i34322 & (-1064826374)) | ((-1064826374) ^ i34322));
        int i34822 = ~((-1064826374) | i33922);
        int i34922 = ((i34722 & i34822) | (i34722 ^ i34822)) * 933;
        int i35022 = ((~(i33922 | 1064826373)) * 933) + (i34622 ^ i34922) + ((i34922 & i34622) << 1);
        int i35122 = -ExpandableListView.getPackedPositionChild(0L);
        int alpha922 = C1211g1.alpha();
        int i35222 = (i35122 * (-963)) - 964;
        int i35322 = (i35222 & (-40530)) + (i35222 | (-40530));
        int i35422 = ~i35122;
        i27 = 41;
        int i35522 = ~((41 ^ alpha922) | (41 & alpha922));
        int i35622 = -(-(((i35422 & i35522) | (i35422 ^ i35522)) * (-964)));
        int i35722 = ((i35322 | i35622) << 1) - (i35622 ^ i35322);
        int i35822 = ((~((i35122 & 41) | (41 ^ i35122))) | (~((~alpha922) | 41))) * (-964);
        int i35922 = (i35722 ^ i35822) + ((i35822 & i35722) << 1);
        int i36022 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        Object[] objArr8622 = new Object[1];
        delta(i35022, i35922, ((i36022 | (-1024869115)) << 1) - (i36022 ^ (-1024869115)), (short) ((-28) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) KeyEvent.keyCodeFromString(str), objArr8622);
        String str4122 = (String) objArr8622[0];
        int scrollBarFadeDuration22 = 1064826374 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
        int i36122 = (-91) - (~(-(-AndroidCharacter.getMirror('0'))));
        int keyRepeatTimeout422 = (-1024869104) - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i36222 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
        Object[] objArr8722 = new Object[1];
        delta(scrollBarFadeDuration22, i36122, keyRepeatTimeout422, (short) ((i36222 & (-6)) + (i36222 | (-6))), (byte) Color.blue(0), objArr8722);
        String str4222 = (String) objArr8722[0];
        int i36322 = -(-(KeyEvent.getMaxKeyCode() >> 16));
        int i36422 = (i36322 ^ 1064826374) + ((i36322 & 1064826374) << 1);
        int lastIndexOf922 = TextUtils.lastIndexOf(str, '0', 0, 0);
        int i36522 = (lastIndexOf922 ^ (-47)) + ((lastIndexOf922 & (-47)) << 1);
        int i36622 = -TextUtils.indexOf(str, str, 0);
        int i36722 = ((i36622 | (-1024869094)) << 1) - (i36622 ^ (-1024869094));
        int lastIndexOf1022 = TextUtils.lastIndexOf(str, '0', 0, 0);
        int alpha1022 = C1211g1.alpha();
        int i36822 = lastIndexOf1022 * (-129);
        int i36922 = (i36822 ^ (-11790)) + ((i36822 & (-11790)) << 1);
        int i37022 = (~alpha1022) | 89;
        int i37122 = (i36922 - (~(-(-((~((i37022 & lastIndexOf1022) | (i37022 ^ lastIndexOf1022))) * 130))))) - 1;
        int i37222 = -(-((~(89 | lastIndexOf1022)) * (-260)));
        int i37322 = (i37122 ^ i37222) + ((i37222 & i37122) << 1);
        int i37422 = ~((~lastIndexOf1022) | (-90));
        int i37522 = (lastIndexOf1022 & 89) | (89 ^ lastIndexOf1022);
        Object[] objArr8822 = new Object[1];
        delta(i36422, i36522, i36722, (short) ((i37322 - (~(((~((i37522 & alpha1022) | (i37522 ^ alpha1022))) | i37422) * 130))) - 1), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr8822);
        String str4322 = (String) objArr8822[0];
        int i37622 = 1064826375 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        int i37722 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        i28 = 1;
        int i37822 = (i37722 ^ (-49)) + ((i37722 & (-49)) << 1);
        int defaultSize22 = View.getDefaultSize(0, 0);
        int i37922 = ((defaultSize22 | (-1024869090)) << 1) - (defaultSize22 ^ (-1024869090));
        int i38022 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i38122 = -MotionEvent.axisFromString(str);
        Object[] objArr8922 = new Object[1];
        delta(i37622, i37822, i37922, (short) ((i38022 ^ (-31)) + ((i38022 & (-31)) << 1)), (byte) ((i38122 ^ (-1)) + (i38122 << 1)), objArr8922);
        i29 = 0;
        strArr = new String[]{str3822, str3922, str4022, str4122, str4222, str4322, (String) objArr8922[0]};
        i30 = 0;
        while (true) {
            if (i30 >= 7) {
            }
            int i38522 = ((i40 | (-14)) << 1) - (i40 ^ (-14));
            i30 = ((i38522 | 15) << 1) - (i38522 ^ 15);
            i27 = i31;
            strArr = strArr3;
            i29 = 0;
            i28 = 1;
        }
        if (i32 != 0) {
        }
        int i738 = 0;
        if (i738 <= 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final N14263A23323 echo() {
        Object m206constructorimpl;
        String[] strArr;
        int[] iArr;
        int i4 = juliet;
        kilo = ((i4 ^ 9) + ((i4 & 9) << 1)) % 128;
        PackageManager packageManager = this.alpha;
        if (packageManager != null) {
            int identityHashCode = System.identityHashCode(this);
            int i5 = ((1823861972 | identityHashCode) * (-859)) + 720147340;
            int i10 = ~identityHashCode;
            int i11 = -(-(((~((identityHashCode & (-77662417)) | ((-77662417) ^ identityHashCode))) | (~((1823861972 & i10) | (i10 ^ 1823861972)))) * 859));
            int i12 = (i5 & i11) + (i11 | i5);
            int i13 = ~((1746859557 & i10) | (1746859557 ^ i10));
            int i14 = (i12 - (~(((i13 & (-1824521974)) | (i13 ^ (-1824521974))) * 859))) - 1;
            int i15 = ~C1211g1.alpha();
            int i16 = ~((i15 & (-1449302411)) | (i15 ^ (-1449302411)));
            int i17 = (((9978885 & i16) | (9978885 ^ i16)) * (-970)) + 1873695479;
            if (i14 > (((i17 ^ (-158204416)) + ((i17 & (-158204416)) << 1)) - (~(-(-(((i16 & (-1459281296)) | ((-1459281296) ^ i16)) * 970))))) - 1) {
                String str = this.bravo;
                if (str != null) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 4096);
                        Intrinsics.checkNotNull(packageInfo);
                        strArr = packageInfo.requestedPermissions;
                        Intrinsics.checkNotNull(strArr);
                        iArr = packageInfo.requestedPermissionsFlags;
                        Intrinsics.checkNotNull(iArr);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (strArr.length == iArr.length) {
                        ArrayList H10 = CollectionsKt.H(ArraysKt.b(strArr), ArraysKt.yellow(iArr));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = H10.iterator();
                        while (it.hasNext()) {
                            int i18 = kilo;
                            juliet = ((i18 ^ 3) + ((i18 & 3) << 1)) % 128;
                            Object next = it.next();
                            if (((Pair) next).getFirst() != null) {
                                int i19 = juliet + 9;
                                kilo = i19 % 128;
                                if (i19 % 2 != 0) {
                                    arrayList.add(next);
                                } else {
                                    arrayList.add(next);
                                    throw null;
                                }
                            }
                        }
                        m206constructorimpl = Result.m206constructorimpl(kotlin.collections.y.yankee(arrayList));
                        N14263A23323 component5 = bk.component5(m206constructorimpl);
                        if (component5 instanceof component8) {
                            kilo = (juliet + 39) % 128;
                            return component5;
                        }
                        if (component5 instanceof setTopP6481) {
                            setTopP6481 settopp6481 = new setTopP6481(Unit.INSTANCE);
                            int i20 = juliet + 17;
                            kilo = i20 % 128;
                            if (i20 % 2 != 0) {
                                return settopp6481;
                            }
                            throw null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException();
                }
            } else {
                throw null;
            }
        }
        return new setTopP6481(Unit.INSTANCE);
    }
}
