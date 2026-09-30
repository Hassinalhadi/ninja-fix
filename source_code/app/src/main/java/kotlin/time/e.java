package kotlin.time;

import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.zendesk.service.HttpConstants;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Comparable, Serializable {
    public static final e red = new e(-31557014167219200L, 0);
    public static final e silver = new e(31556889864403199L, 999999999);
    public final long alpha;
    public final int purple;

    public e(long j5, int i4) {
        this.alpha = j5;
        this.purple = i4;
        if (-31557014167219200L <= j5 && j5 < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e other = (e) obj;
        Intrinsics.echo(other, "other");
        int hotel = Intrinsics.hotel(this.alpha, other.alpha);
        if (hotel != 0) {
            return hotel;
        }
        return Intrinsics.golf(this.purple, other.purple);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.alpha != eVar.alpha || this.purple != eVar.purple) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return (this.purple * 51) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        long j5;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j6 = this.alpha;
        long j7 = j6 / 86400;
        long j10 = 0;
        if ((j6 ^ 86400) < 0 && j7 * 86400 != j6) {
            j7--;
        }
        long j11 = j6 % 86400;
        int i4 = (int) (j11 + (86400 & (((j11 ^ 86400) & ((-j11) | j11)) >> 63)));
        long j12 = (j7 + 719528) - 60;
        if (j12 < 0) {
            long j13 = 146097;
            long j14 = ((j12 + 1) / j13) - 1;
            j5 = 0;
            j10 = HttpConstants.HTTP_BAD_REQUEST * j14;
            j12 += (-j14) * j13;
        } else {
            j5 = 0;
        }
        long j15 = HttpConstants.HTTP_BAD_REQUEST;
        long j16 = ((j15 * j12) + 591) / 146097;
        long j17 = 365;
        long j18 = 4;
        long j19 = 100;
        long j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
        if (j20 < j5) {
            j16--;
            j20 = j12 - ((j16 / j15) + (((j16 / j18) + (j17 * j16)) - (j16 / j19)));
        }
        int i5 = (int) j20;
        int i10 = ((i5 * 5) + 2) / 153;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i5 - (((i10 * 306) + 5) / 10)) + 1;
        int i13 = (int) (j16 + j10 + (i10 / 10));
        int i14 = i4 / 3600;
        int i15 = i4 - (i14 * 3600);
        int i16 = i15 / 60;
        int i17 = i15 - (i16 * 60);
        int i18 = 0;
        if (Math.abs(i13) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i13 >= 0) {
                sb3.append(i13 + 10000);
                Intrinsics.delta(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i13 - 10000);
                Intrinsics.delta(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i13 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i13);
        }
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        g.hotel(sb2, sb2, i11);
        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
        g.hotel(sb2, sb2, i12);
        sb2.append('T');
        g.hotel(sb2, sb2, i14);
        sb2.append(':');
        g.hotel(sb2, sb2, i16);
        sb2.append(':');
        g.hotel(sb2, sb2, i17);
        int i19 = this.purple;
        if (i19 != 0) {
            sb2.append('.');
            while (true) {
                iArr = g.alpha;
                int i20 = i18 + 1;
                if (i19 % iArr[i20] != 0) {
                    break;
                }
                i18 = i20;
            }
            int i21 = i18 - (i18 % 3);
            String valueOf = String.valueOf((i19 / iArr[i21]) + iArr[9 - i21]);
            Intrinsics.charlie(valueOf, "null cannot be cast to non-null type java.lang.String");
            String substring = valueOf.substring(1);
            Intrinsics.delta(substring, "substring(...)");
            sb2.append(substring);
        }
        sb2.append('Z');
        return sb2.toString();
    }
}
