package fe;

import java.util.Iterator;
import s6.AbstractC2770s7;

/* renamed from: fe.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1713e implements Iterable, Yd.a {
    public final int alpha;
    public final int purple;
    public final int red;

    public C1713e(int i4, int i5, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.alpha = i4;
                this.purple = AbstractC2770s7.alpha(i4, i5, i10);
                this.red = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1713e) {
            if (!isEmpty() || !((C1713e) obj).isEmpty()) {
                C1713e c1713e = (C1713e) obj;
                if (this.alpha == c1713e.alpha && this.purple == c1713e.purple && this.red == c1713e.red) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.alpha * 31) + this.purple) * 31) + this.red;
    }

    public boolean isEmpty() {
        int i4 = this.red;
        int i5 = this.purple;
        int i10 = this.alpha;
        if (i4 > 0) {
            if (i10 <= i5) {
                return false;
            }
            return true;
        }
        if (i10 >= i5) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1714f(this.alpha, this.purple, this.red);
    }

    public String toString() {
        StringBuilder sb2;
        int i4 = this.purple;
        int i5 = this.alpha;
        int i10 = this.red;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i5);
            sb2.append("..");
            sb2.append(i4);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i5);
            sb2.append(" downTo ");
            sb2.append(i4);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }
}
