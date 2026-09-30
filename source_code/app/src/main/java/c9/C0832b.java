package c9;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;

/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0832b {
    public final C0831a alpha;
    public final int[] bravo;

    public C0832b(C0831a c0831a, int[] iArr) {
        if (iArr.length != 0) {
            this.alpha = c0831a;
            int length = iArr.length;
            int i4 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i4 < length && iArr[i4] == 0) {
                    i4++;
                }
                if (i4 == length) {
                    this.bravo = new int[]{0};
                    return;
                }
                int i5 = length - i4;
                int[] iArr2 = new int[i5];
                this.bravo = iArr2;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                return;
            }
            this.bravo = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final C0832b alpha(C0832b c0832b) {
        C0831a c0831a = c0832b.alpha;
        C0831a c0831a2 = this.alpha;
        if (c0831a2.equals(c0831a)) {
            if (charlie()) {
                return c0832b;
            }
            if (c0832b.charlie()) {
                return this;
            }
            int[] iArr = this.bravo;
            int length = iArr.length;
            int[] iArr2 = c0832b.bravo;
            if (length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length2 = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            for (int i4 = length2; i4 < iArr.length; i4++) {
                iArr3[i4] = iArr2[i4 - length2] ^ iArr[i4];
            }
            return new C0832b(c0831a2, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final int bravo() {
        return this.bravo.length - 1;
    }

    public final boolean charlie() {
        if (this.bravo[0] != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (charlie()) {
            return ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        StringBuilder sb2 = new StringBuilder(bravo() * 8);
        for (int bravo = bravo(); bravo >= 0; bravo--) {
            int[] iArr = this.bravo;
            int i4 = iArr[(iArr.length - 1) - bravo];
            if (i4 != 0) {
                if (i4 < 0) {
                    if (bravo == bravo()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    i4 = -i4;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (bravo == 0 || i4 != 1) {
                    C0831a c0831a = this.alpha;
                    if (i4 != 0) {
                        int i5 = c0831a.bravo[i4];
                        if (i5 == 0) {
                            sb2.append(ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK);
                        } else if (i5 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i5);
                        }
                    } else {
                        c0831a.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (bravo != 0) {
                    if (bravo == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(bravo);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
