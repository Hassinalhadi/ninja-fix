package com.fingerprintjs.android.fpjs_pro_internal;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import fe.C1713e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286z1 {
    public static int alpha = 0;
    public static int bravo = 1;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115 A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:5:0x0088, B:8:0x00be, B:10:0x00c4, B:13:0x00d2, B:14:0x00d6, B:17:0x00e6, B:19:0x00ec, B:24:0x0105, B:25:0x0110, B:27:0x0115, B:29:0x011b, B:32:0x012e, B:34:0x013a), top: B:4:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N14263A23323 alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        N14263A23323 settopp6481;
        int i14;
        N14263A23323 settopp64812;
        Date parse;
        long parseLong;
        long j5;
        N14263A23323 settopp64813;
        MatchResult find$default;
        String str;
        String str2;
        M.l alpha2;
        kotlin.text.i bravo2;
        kotlin.text.i bravo3;
        kotlin.text.i bravo4;
        int i15 = ~i12;
        int i16 = ~i11;
        int i17 = (~(i15 | i16)) | (~(i16 | i10));
        int i18 = ~i10;
        int i19 = i17 | (~(i18 | i12 | i11));
        int i20 = i12 | i11;
        int i21 = i18 | i20;
        int i22 = (~(i10 | i12)) | (~i20);
        int i23 = (611057664 * i4) + ((-1693188096) * i13) + (1422655488 * i5) + (226102882 * i22) + ((-226102882) * i21) + (i19 * (-226102882)) + (1648758371 * i11) + ((i12 * 1648758371) - 594280448);
        int papa = AbstractC2327c.papa(i4, -1919980423, (1068639271 * i13) + i12 + i11 + i5);
        int i24 = i5 * 982246413;
        int i25 = i13 * 1533776379;
        int i26 = i4 * 1016546853;
        int i27 = i26 + i25 + i24 + (i22 * 762) + (i21 * (-762)) + (i19 * (-762)) + (i11 * 982247175) + (i12 * 982247175) + 1844138806;
        String str3 = null;
        if (AbstractC2327c.quebec(papa, -1070530560, i27, 1708326912, ((-810221568) * papa) + i23) != 1) {
            C1286z1 c1286z1 = (C1286z1) objArr[0];
            String str4 = (String) objArr[1];
            String str5 = (String) objArr[2];
            try {
                find$default = Regex.find$default(new Regex(str5 + "(.*?)(" + P28427.Q1.echo.vD14832N6715() + ")"), str4, 0, 2, null);
            } catch (Throwable th) {
                settopp64813 = new setTopP6481(th);
            }
            if (find$default != null) {
                int i28 = alpha;
                bravo = (((i28 | 95) << 1) - (i28 ^ 95)) % 128;
                M.l alpha3 = find$default.alpha();
                if (alpha3 != null && (bravo4 = alpha3.bravo(3)) != null) {
                    bravo = (alpha + 91) % 128;
                    str = bravo4.alpha;
                    Intrinsics.checkNotNull(str);
                    if (find$default != null) {
                        int i29 = bravo;
                        alpha = (((i29 | 5) << 1) - (i29 ^ 5)) % 128;
                        M.l alpha4 = find$default.alpha();
                        if (alpha4 != null && (bravo3 = alpha4.bravo(5)) != null) {
                            int i30 = bravo;
                            int i31 = (i30 ^ 95) + ((i30 & 95) << 1);
                            alpha = i31 % 128;
                            int i32 = i31 % 2;
                            str2 = bravo3.alpha;
                            if (i32 != 0) {
                                int i33 = 93 / 0;
                            }
                            Intrinsics.checkNotNull(str2);
                            if (find$default == null && (alpha2 = find$default.alpha()) != null && (bravo2 = alpha2.bravo(7)) != null) {
                                int i34 = alpha;
                                bravo = (((i34 | 85) << 1) - (i34 ^ 85)) % 128;
                                str3 = bravo2.alpha;
                            } else {
                                alpha = (bravo + 27) % 128;
                            }
                            settopp64813 = new component8(alpha(new Object[]{c1286z1, str, str2, str3}, T.D8871(), T.D8871(), T.D8871(), -1761252773, 1761252774, T.D8871()));
                            alpha = (bravo + 89) % 128;
                            return bk.D8871(settopp64813);
                        }
                    }
                    bravo = (alpha + 7) % 128;
                    str2 = null;
                    Intrinsics.checkNotNull(str2);
                    if (find$default == null) {
                    }
                    alpha = (bravo + 27) % 128;
                    settopp64813 = new component8(alpha(new Object[]{c1286z1, str, str2, str3}, T.D8871(), T.D8871(), T.D8871(), -1761252773, 1761252774, T.D8871()));
                    alpha = (bravo + 89) % 128;
                    return bk.D8871(settopp64813);
                }
            }
            str = null;
            Intrinsics.checkNotNull(str);
            if (find$default != null) {
            }
            bravo = (alpha + 7) % 128;
            str2 = null;
            Intrinsics.checkNotNull(str2);
            if (find$default == null) {
            }
            alpha = (bravo + 27) % 128;
            settopp64813 = new component8(alpha(new Object[]{c1286z1, str, str2, str3}, T.D8871(), T.D8871(), T.D8871(), -1761252773, 1761252774, T.D8871()));
            alpha = (bravo + 89) % 128;
            return bk.D8871(settopp64813);
        }
        C1286z1 c1286z12 = (C1286z1) objArr[0];
        String str6 = (String) objArr[1];
        String str7 = (String) objArr[2];
        String str8 = (String) objArr[3];
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(P28427.T1.echo.vD14832N6715(), Locale.US);
            try {
                settopp64812 = new component8(TimeZone.getTimeZone(P28427.C1072j5.echo.vD14832N6715()));
                bravo = (alpha + 81) % 128;
            } catch (Throwable th2) {
                settopp64812 = new setTopP6481(th2);
            }
            simpleDateFormat.getCalendar().setTimeZone((TimeZone) component13.vD14832N6715(settopp64812, TimeZone.getTimeZone(P28427.C1067j0.echo.vD14832N6715())));
            parse = simpleDateFormat.parse(str6);
            Intrinsics.checkNotNull(parse);
            parseLong = Long.parseLong(str7);
        } catch (Throwable th3) {
            settopp6481 = new setTopP6481(th3);
        }
        if (str8 != null) {
            int i35 = alpha + 39;
            bravo = i35 % 128;
            if (i35 % 2 != 0) {
                c1286z12.getClass();
                Long l10 = (Long) component13.alpha(charlie(str8));
                if (l10 != null) {
                    j5 = l10.longValue();
                    settopp6481 = new component8(Long.valueOf((parse.getTime() * 1000000) + parseLong + j5));
                    N14263A23323 n14263a23323 = settopp6481;
                    i14 = bravo + 83;
                    alpha = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i36 = 14 / 0;
                        return n14263a23323;
                    }
                    return n14263a23323;
                }
            } else {
                c1286z12.getClass();
                throw null;
            }
        }
        j5 = 0;
        settopp6481 = new component8(Long.valueOf((parse.getTime() * 1000000) + parseLong + j5));
        N14263A23323 n14263a233232 = settopp6481;
        i14 = bravo + 83;
        alpha = i14 % 128;
        if (i14 % 2 == 0) {
        }
    }

    public static /* synthetic */ N14263A23323 bravo(C1286z1 c1286z1, String str, String str2) {
        N14263A23323 alpha2;
        int i4 = alpha;
        int i5 = (i4 & 27) + (i4 | 27);
        bravo = i5 % 128;
        if (i5 % 2 == 0) {
            alpha2 = alpha(new Object[]{c1286z1, str, str2}, T.D8871(), T.D8871(), T.D8871(), -1115580756, 1115580756, T.D8871());
            int i10 = 11 / 0;
        } else {
            alpha2 = alpha(new Object[]{c1286z1, str, str2}, T.D8871(), T.D8871(), T.D8871(), -1115580756, 1115580756, T.D8871());
        }
        int i11 = alpha;
        int i12 = (i11 ^ 125) + ((i11 & 125) << 1);
        bravo = i12 % 128;
        if (i12 % 2 != 0) {
            return alpha2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r8 < 24) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r12 = (r5 & 43) + (r5 | 43);
        com.fingerprintjs.android.fpjs_pro_internal.C1286z1.bravo = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if ((r12 % 2) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        r12 = java.lang.Long.parseLong(kotlin.text.StringsKt.peach(new fe.C1713e(3, 4, 1), r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (0 > r12) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (r12 >= 60) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        r15 = r15.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        if (r15 != '+') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        r15 = com.fingerprintjs.android.fpjs_pro_internal.C1286z1.alpha;
        com.fingerprintjs.android.fpjs_pro_internal.C1286z1.bravo = (((r15 | 21) << 1) - (r15 ^ 21)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        java.lang.Long.signum(r8);
        r8 = ((r8 * 60) + r12) * 60000000000L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0102, code lost:
    
        if (r0 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        r15 = com.fingerprintjs.android.fpjs_pro_internal.C1286z1.alpha;
        com.fingerprintjs.android.fpjs_pro_internal.C1286z1.bravo = ((r15 ^ 13) + ((r15 & 13) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:
    
        return new com.fingerprintjs.android.fpjs_pro_internal.component8(java.lang.Long.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0111, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r15 != '-') goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0121, code lost:
    
        throw new java.lang.Exception();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        throw new java.lang.IllegalArgumentException("Failed requirement.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1286z1.alpha = (com.fingerprintjs.android.fpjs_pro_internal.C1286z1.bravo + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        if (r8 < 24) goto L34;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r5v5, types: [fe.g, fe.e] */
    /* JADX WARN: Type inference failed for: r5v7, types: [fe.g, fe.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N14263A23323 charlie(String str) {
        boolean z2 = false;
        alpha = (bravo + 29) % 128;
        try {
            if (str.length() == 5) {
                int i4 = alpha + 1;
                bravo = i4 % 128;
                if (i4 % 2 != 0) {
                    if (CollectionsKt.listOf(Character.valueOf(NumberOnlyZipVisualTransformation.HYPHEN), '+').contains(Character.valueOf(str.charAt(0)))) {
                        String peach = StringsKt.peach(new C1713e(1, 4, 1), str);
                        alpha = (bravo + 89) % 128;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= peach.length()) {
                                break;
                            }
                            if (!Character.isDigit(peach.charAt(i5))) {
                                int i10 = bravo;
                                int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
                                alpha = i11 % 128;
                                if (i11 % 2 == 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                            } else {
                                int i12 = (i5 & 51) + (i5 | 51);
                                i5 = ((i12 | (-50)) << 1) - (i12 ^ (-50));
                                alpha = (bravo + 105) % 128;
                            }
                        }
                        long parseLong = Long.parseLong(StringsKt.peach(new C1713e(1, 2, 1), str));
                        if (0 <= parseLong) {
                            int i13 = bravo;
                            int i14 = (i13 ^ 23) + ((i13 & 23) << 1);
                            int i15 = i14 % 128;
                            alpha = i15;
                            if (i14 % 2 != 0) {
                                int i16 = 96 / 0;
                            }
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                bravo = (alpha + 51) % 128;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } catch (Throwable th) {
            return new setTopP6481(th);
        }
    }
}
