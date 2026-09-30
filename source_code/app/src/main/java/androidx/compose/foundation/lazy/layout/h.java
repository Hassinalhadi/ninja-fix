package androidx.compose.foundation.lazy.layout;

import g.AbstractC1719b;

/* loaded from: classes3.dex */
public final class h {
    public final int alpha;
    public final int bravo;

    public h(int i4, int i5) {
        boolean z2;
        this.alpha = i4;
        this.bravo = i5;
        if (i4 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC1719b.alpha("negative start index");
        }
        if (!(i5 >= i4)) {
            AbstractC1719b.alpha("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.alpha == hVar.alpha && this.bravo == hVar.bravo;
    }

    public final int hashCode() {
        return (this.alpha * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.alpha);
        sb2.append(", end=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
