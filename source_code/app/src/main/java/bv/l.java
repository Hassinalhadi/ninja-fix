package bv;

import com.clevertap.android.sdk.Constants;
import fe.C1715g;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class l {
    public int[] alpha;
    public int bravo;

    public final int alpha(int i4) {
        if (i4 >= 0 && i4 < this.bravo) {
            return this.alpha[i4];
        }
        bw.a.delta("Index must be between 0 and size");
        throw null;
    }

    public final int bravo() {
        int i4 = this.bravo;
        if (i4 != 0) {
            return this.alpha[i4 - 1];
        }
        bw.a.echo("IntList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            int i4 = lVar.bravo;
            int i5 = this.bravo;
            if (i4 == i5) {
                int[] iArr = this.alpha;
                int[] iArr2 = lVar.alpha;
                C1715g hotel = J4.hotel(0, i5);
                int i10 = hotel.alpha;
                int i11 = hotel.purple;
                if (i10 <= i11) {
                    while (iArr[i10] == iArr2[i10]) {
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
        int[] iArr = this.alpha;
        int i4 = this.bravo;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i5 += iArr[i10] * 31;
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) Constants.AES_PREFIX);
        int[] iArr = this.alpha;
        int i4 = this.bravo;
        int i5 = 0;
        while (true) {
            if (i5 < i4) {
                int i10 = iArr[i5];
                if (i5 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i5 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i10);
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
