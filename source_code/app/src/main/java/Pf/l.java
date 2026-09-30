package Pf;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import kotlin.UByte;
import kotlin.UInt;

/* loaded from: classes2.dex */
public final class l extends j {
    public final boolean silver;

    public l(Fe.c cVar, boolean z2) {
        super(0, cVar);
        this.silver = z2;
    }

    @Override // Pf.j
    public final void india(byte b2) {
        boolean z2 = this.silver;
        byte m209constructorimpl = UByte.m209constructorimpl(b2);
        if (z2) {
            quebec(String.valueOf(m209constructorimpl & 255));
        } else {
            november(String.valueOf(m209constructorimpl & 255));
        }
    }

    @Override // Pf.j
    public final void lima(int i4) {
        boolean z2 = this.silver;
        int m210constructorimpl = UInt.m210constructorimpl(i4);
        if (z2) {
            quebec(Long.toString(4294967295L & m210constructorimpl, 10));
        } else {
            november(Long.toString(4294967295L & m210constructorimpl, 10));
        }
    }

    @Override // Pf.j
    public final void mike(long j5) {
        boolean z2 = this.silver;
        int i4 = 63;
        String str = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        if (z2) {
            if (j5 != 0) {
                if (j5 > 0) {
                    str = Long.toString(j5, 10);
                } else {
                    char[] cArr = new char[64];
                    long j6 = (j5 >>> 1) / 5;
                    long j7 = 10;
                    cArr[63] = Character.forDigit((int) (j5 - (j6 * j7)), 10);
                    while (j6 > 0) {
                        i4--;
                        cArr[i4] = Character.forDigit((int) (j6 % j7), 10);
                        j6 /= j7;
                    }
                    str = new String(cArr, i4, 64 - i4);
                }
            }
            quebec(str);
            return;
        }
        if (j5 != 0) {
            if (j5 > 0) {
                str = Long.toString(j5, 10);
            } else {
                char[] cArr2 = new char[64];
                long j10 = (j5 >>> 1) / 5;
                long j11 = 10;
                cArr2[63] = Character.forDigit((int) (j5 - (j10 * j11)), 10);
                while (j10 > 0) {
                    i4--;
                    cArr2[i4] = Character.forDigit((int) (j10 % j11), 10);
                    j10 /= j11;
                }
                str = new String(cArr2, i4, 64 - i4);
            }
        }
        november(str);
    }

    @Override // Pf.j
    public final void oscar(short s3) {
        if (this.silver) {
            quebec(String.valueOf(s3 & 65535));
        } else {
            november(String.valueOf(s3 & 65535));
        }
    }
}
