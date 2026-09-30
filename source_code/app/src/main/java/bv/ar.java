package bv;

import com.clevertap.android.sdk.Constants;
import fe.C1715g;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class ar {
    public Object[] alpha;
    public int bravo;

    public final Object alpha() {
        if (!delta()) {
            return this.alpha[0];
        }
        bw.a.echo("ObjectList is empty.");
        throw null;
    }

    public final Object bravo(int i4) {
        if (i4 >= 0 && i4 < this.bravo) {
            return this.alpha[i4];
        }
        foxtrot(i4);
        throw null;
    }

    public final int charlie(Object obj) {
        int i4 = 0;
        if (obj == null) {
            Object[] objArr = this.alpha;
            int i5 = this.bravo;
            while (i4 < i5) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        Object[] objArr2 = this.alpha;
        int i10 = this.bravo;
        while (i4 < i10) {
            if (obj.equals(objArr2[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final boolean delta() {
        if (this.bravo == 0) {
            return true;
        }
        return false;
    }

    public final boolean echo() {
        if (this.bravo != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ar) {
            ar arVar = (ar) obj;
            int i4 = arVar.bravo;
            int i5 = this.bravo;
            if (i4 == i5) {
                Object[] objArr = this.alpha;
                Object[] objArr2 = arVar.alpha;
                C1715g hotel = J4.hotel(0, i5);
                int i10 = hotel.alpha;
                int i11 = hotel.purple;
                if (i10 <= i11) {
                    while (Intrinsics.areEqual(objArr[i10], objArr2[i10])) {
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

    public final void foxtrot(int i4) {
        StringBuilder sierra = Q0.c.sierra(i4, "Index ", " must be in 0..");
        sierra.append(this.bravo - 1);
        bw.a.delta(sierra.toString());
        throw null;
    }

    public final int hashCode() {
        int i4;
        Object[] objArr = this.alpha;
        int i5 = this.bravo;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i10 += i4 * 31;
        }
        return i10;
    }

    public final String toString() {
        A0.p pVar = new A0.p(27, this);
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        Object[] objArr = this.alpha;
        int i4 = this.bravo;
        int i5 = 0;
        while (true) {
            if (i5 < i4) {
                Object obj = objArr[i5];
                if (i5 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i5 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) pVar.invoke(obj));
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
