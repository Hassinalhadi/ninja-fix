package com.fingerprintjs.android.fpjs_pro_internal;

import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class T2 {
    public static int delta = 0;
    public static int echo = 1;
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public T2(String str, String str2, String str3) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
    }

    public static /* synthetic */ String alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~((~i10) | i14);
        int i16 = (~i4) | (~(i14 | i10));
        int i17 = i10 | i4 | i14;
        int i18 = (1566572544 * i13) + (1462763520 * i12) + (1798307840 * i5) + ((-1309823443) * i17) + (1309823443 * i16) + (i15 * 1309823443) + (488484398 * i11) + (((-1186836012) * i4) - 711983104);
        int papa = AbstractC2327c.papa(i13, -1141649966, (1635157569 * i12) + i4 + i11 + i5);
        int i19 = i16 * (-227);
        int i20 = i17 * 227;
        int i21 = i5 * 1521345871;
        int i22 = i12 * (-1382509809);
        int i23 = i13 * 37969358;
        int quebec = AbstractC2327c.quebec(papa, -671350784, i23 + i22 + i21 + i20 + i19 + (i15 * (-227)) + (i11 * 1521346098) + (i4 * 1521345644) + 2088555610, -1069809664, (1631846400 * papa) + i18);
        if (quebec != 1) {
            if (quebec != 2) {
                T2 t22 = (T2) objArr[0];
                int i24 = echo + 85;
                delta = i24 % 128;
                int i25 = i24 % 2;
                String str = t22.bravo;
                if (i25 == 0) {
                    return str;
                }
                throw null;
            }
            T2 t23 = (T2) objArr[0];
            int i26 = delta + 71;
            echo = i26 % 128;
            if (i26 % 2 != 0) {
                String str2 = t23.alpha;
                int identityHashCode = System.identityHashCode(t23);
                int i27 = (((-209370750) ^ identityHashCode) | ((-209370750) & identityHashCode)) * (-859);
                int i28 = ((-778473982) & i27) + (i27 | (-778473982));
                int i29 = ~identityHashCode;
                int i30 = ~(((-209370750) & i29) | (i29 ^ (-209370750)));
                int i31 = ~((identityHashCode & (-814039043)) | ((-814039043) ^ identityHashCode));
                int i32 = -(-(((i31 & i30) | (i30 ^ i31)) * 859));
                int i33 = ((i28 | i32) << 1) - (i32 ^ i28);
                int i34 = ~(((-1017466920) & i29) | ((-1017466920) ^ i29));
                int i35 = (((i34 & 203427877) | (i34 ^ 203427877)) * 859) + i33;
                int bravo = d3.bravo();
                int i36 = ~bravo;
                int i37 = ~((-411320645) | i36);
                int i38 = ~((-559953449) | bravo);
                int i39 = ((i37 & i38) | (i37 ^ i38)) * 988;
                int i40 = ((-61885088) & i39) + (i39 | (-61885088));
                int i41 = (i40 & (-1637095860)) + ((-1637095860) | i40);
                int i42 = ~(bravo | (-480233926));
                int i43 = (i42 & 68913281) | (68913281 ^ i42);
                int i44 = ~((i36 & (-971274093)) | (i36 ^ (-971274093)) | 480233925);
                int i45 = ((i43 & i44) | (i43 ^ i44)) * 988;
                if (i35 > (i41 ^ i45) + ((i45 & i41) << 1)) {
                    return str2;
                }
                throw null;
            }
            String str3 = t23.alpha;
            throw null;
        }
        T2 t24 = (T2) objArr[0];
        int i46 = echo;
        int i47 = i46 + 7;
        delta = i47 % 128;
        int i48 = i47 % 2;
        String str4 = t24.charlie;
        if (i48 == 0) {
            int i49 = i46 + 21;
            delta = i49 % 128;
            if (i49 % 2 == 0) {
                return str4;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        r8 = (com.fingerprintjs.android.fpjs_pro_internal.T2) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.alpha, r8.alpha) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        r8 = com.fingerprintjs.android.fpjs_pro_internal.T2.echo;
        r0 = ((r8 & 49) + (r8 | 49)) % 128;
        com.fingerprintjs.android.fpjs_pro_internal.T2.delta = r0;
        com.fingerprintjs.android.fpjs_pro_internal.T2.echo = (((r0 | 67) << 1) - (r0 ^ 67)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.bravo, r8.bravo) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        r8 = (com.fingerprintjs.android.fpjs_pro_internal.T2.echo + 5) % 128;
        com.fingerprintjs.android.fpjs_pro_internal.T2.delta = r8;
        com.fingerprintjs.android.fpjs_pro_internal.T2.echo = ((r8 & 73) + (r8 | 73)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.charlie, r8.charlie) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f9, code lost:
    
        java.lang.System.identityHashCode(r7);
        com.fingerprintjs.android.fpjs_pro_internal.d3.bravo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.T2.echo = (com.fingerprintjs.android.fpjs_pro_internal.T2.delta + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0091, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a1, code lost:
    
        if ((r8 instanceof com.fingerprintjs.android.fpjs_pro_internal.T2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a3, code lost:
    
        r8 = com.fingerprintjs.android.fpjs_pro_internal.T2.delta + 121;
        com.fingerprintjs.android.fpjs_pro_internal.T2.echo = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ad, code lost:
    
        if ((r8 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00af, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int identityHashCode = System.identityHashCode(this);
        int i4 = ((((-588836361) ^ identityHashCode) | ((-588836361) & identityHashCode)) * 140) - 1776062393;
        int i5 = ~identityHashCode;
        int i10 = ~(((-588836361) & i5) | (i5 ^ (-588836361)));
        int i11 = -(-(((i10 & 571483144) | (571483144 ^ i10)) * (-280)));
        int i12 = ((i4 | i11) << 1) - (i11 ^ i4);
        int i13 = ~identityHashCode;
        int i14 = ~((i13 & (-294378408)) | (i13 ^ (-294378408)));
        int i15 = (i14 & 277025191) | (277025191 ^ i14);
        int i16 = ~((identityHashCode & (-571483145)) | ((-571483145) ^ identityHashCode));
        int i17 = (((i16 & i15) | (i15 ^ i16)) * 140) + i12;
        int identityHashCode2 = System.identityHashCode(this);
        int i18 = ~(((-808517633) ^ identityHashCode2) | ((-808517633) & identityHashCode2));
        int i19 = -(-(((i18 & (-1979682175)) | ((-1979682175) ^ i18)) * (-476)));
        int i20 = ((1132096161 | i19) << 1) - (i19 ^ 1132096161);
        int i21 = -(-((~(((-808517633) & identityHashCode2) | ((-808517633) ^ identityHashCode2))) * 952));
        int i22 = (i20 & i21) + (i21 | i20);
        int i23 = (~identityHashCode2) | (-1979254819);
        int i24 = -(-((~((i23 & (-808944989)) | (i23 ^ (-808944989)))) * 476));
        if (i17 > ((i22 | i24) << 1) - (i24 ^ i22)) {
            int i25 = 36 / 0;
        }
    }

    public final int hashCode() {
        delta = (echo + 1) % 128;
        int hashCode = this.alpha.hashCode();
        int i4 = hashCode * 31;
        int hashCode2 = this.bravo.hashCode();
        int bravo = d3.bravo();
        int i5 = hashCode2 * 673;
        int i10 = hashCode * (-41633);
        int i11 = (i5 & i10) + (i10 | i5);
        int i12 = ~(hashCode2 | bravo);
        int i13 = (i11 - (~(-(-(((i12 & i4) | (i4 ^ i12)) * 672))))) - 1;
        int i14 = ~hashCode2;
        int i15 = ~bravo;
        int i16 = ((~((i14 & i15) | (i14 ^ i15))) | (~(bravo | i4))) * (-672);
        int i17 = (i13 ^ i16) + ((i16 & i13) << 1);
        int i18 = ~((~i4) | i15);
        int i19 = ~((~i4) | hashCode2);
        int i20 = ((i18 & i19) | (i18 ^ i19)) * 672;
        int hashCode3 = this.charlie.hashCode() + ((((i17 | i20) << 1) - (i20 ^ i17)) * 31);
        int i21 = delta;
        echo = ((i21 & 77) + (i21 | 77)) % 128;
        return hashCode3;
    }

    public final String toString() {
        echo = (delta + 105) % 128;
        StringBuilder sb2 = new StringBuilder("CameraInfo(cameraName=");
        sb2.append(this.alpha);
        sb2.append(", cameraType=");
        sb2.append(this.bravo);
        sb2.append(", cameraOrientation=");
        String gold = androidx.appcompat.widget.P0.gold(sb2, this.charlie, ")");
        int i4 = echo;
        delta = ((i4 & 41) + (i4 | 41)) % 128;
        return gold;
    }
}
