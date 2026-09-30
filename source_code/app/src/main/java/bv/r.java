package bv;

import com.clevertap.android.sdk.Constants;
import fe.C1715g;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class r {
    public long[] alpha;
    public int bravo;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            int i4 = rVar.bravo;
            int i5 = this.bravo;
            if (i4 == i5) {
                long[] jArr = this.alpha;
                long[] jArr2 = rVar.alpha;
                C1715g hotel = J4.hotel(0, i5);
                int i10 = hotel.alpha;
                int i11 = hotel.purple;
                if (i10 <= i11) {
                    while (jArr[i10] == jArr2[i10]) {
                        if (i10 != i11) {
                            i10++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.alpha;
        int i4 = this.bravo;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            long j5 = jArr[i10];
            i5 += ((int) (j5 ^ (j5 >>> 32))) * 31;
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) Constants.AES_PREFIX);
        long[] jArr = this.alpha;
        int i4 = this.bravo;
        int i5 = 0;
        while (true) {
            if (i5 < i4) {
                long j5 = jArr[i5];
                if (i5 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i5 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(j5);
                i5++;
            } else {
                sb2.append((CharSequence) Constants.AES_SUFFIX);
                break;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
