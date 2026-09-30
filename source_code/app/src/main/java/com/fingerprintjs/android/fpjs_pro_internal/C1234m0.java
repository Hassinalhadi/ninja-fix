package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1234m0 {
    public static int charlie = 0;
    public static int delta = 1;
    public final String alpha;
    public final String bravo;

    public C1234m0(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public static /* synthetic */ Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int hashCode;
        int i14 = ~i5;
        int i15 = ~i13;
        int i16 = ~(i14 | i15 | i12);
        int i17 = ~i12;
        int i18 = i16 | (~(i14 | i17 | i13));
        int i19 = (~(i12 | i15)) | i14 | (~(i17 | i13));
        int i20 = 1305971684 * i19;
        int i21 = (892338176 * i10) + ((-1446510592) * i11) + ((-89653248) * i4) + i20 + ((-1305971684) * i15) + (i18 * (-1305971684)) + ((-1395624931) * i13) + ((1216318437 * i5) - 781189120);
        int papa = AbstractC2327c.papa(i10, -1897213938, (1112421973 * i11) + i5 + i13 + i4);
        if (AbstractC2327c.quebec(papa, 563281920, (i10 * 856652822) + (i11 * (-1378896031)) + (i4 * 2010091741) + (i19 * 980) + (i15 * (-980)) + (i18 * (-980)) + (i13 * 2010090761) + (i5 * 2010092721) + 1217064380, -1077346304, ((-1657864192) * papa) + i21) != 1) {
            C1234m0 c1234m0 = (C1234m0) objArr[0];
            int i22 = delta + 39;
            charlie = i22 % 128;
            if (i22 % 2 != 0) {
                int hashCode2 = c1234m0.alpha.hashCode() << 112;
                int i23 = -(-c1234m0.bravo.hashCode());
                hashCode = (hashCode2 & i23) + (i23 | hashCode2);
            } else {
                hashCode = c1234m0.bravo.hashCode() + (c1234m0.alpha.hashCode() * 31);
            }
            return Integer.valueOf(hashCode);
        }
        int i24 = delta;
        int i25 = (i24 & 65) + (i24 | 65);
        charlie = i25 % 128;
        if (i25 % 2 == 0) {
            return "";
        }
        throw null;
    }

    public final String alpha() {
        int i4 = charlie;
        int i5 = (i4 ^ 15) + ((i4 & 15) << 1);
        int i10 = i5 % 128;
        delta = i10;
        if (i5 % 2 != 0) {
            int i11 = (i10 & 91) + (i10 | 91);
            charlie = i11 % 128;
            if (i11 % 2 == 0) {
                return this.alpha;
            }
            throw null;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i4 = delta;
        int i5 = ((i4 | 27) << 1) - (i4 ^ 27);
        charlie = i5 % 128;
        if (i5 % 2 == 0) {
            if (this == obj) {
                charlie = ((i4 & 85) + (i4 | 85)) % 128;
                return true;
            }
            if (!(obj instanceof C1234m0)) {
                int i10 = i4 + 125;
                charlie = i10 % 128;
                if (i10 % 2 != 0) {
                    return true;
                }
                return false;
            }
            if (!Intrinsics.areEqual(this.alpha, ((C1234m0) obj).alpha)) {
                int i11 = (delta + 39) % 128;
                charlie = i11;
                delta = (i11 + 97) % 128;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.bravo, r5.bravo))) {
                return true;
            }
            int i12 = charlie;
            delta = (((i12 | 105) << 1) - (i12 ^ 105)) % 128;
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        return ((Integer) bravo(new Object[]{this}, bx.alpha(), 27784300, bx.alpha(), bx.alpha(), bx.alpha(), -27784300)).intValue();
    }

    public final String toString() {
        return (String) bravo(new Object[]{this}, bx.alpha(), 1381410949, bx.alpha(), bx.alpha(), bx.alpha(), -1381410948);
    }
}
