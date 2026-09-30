package y;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3383w {
    public final C3382v alpha;
    public final C3382v bravo;
    public final boolean charlie;

    public C3383w(C3382v c3382v, C3382v c3382v2, boolean z2) {
        this.alpha = c3382v;
        this.bravo = c3382v2;
        this.charlie = z2;
    }

    public static C3383w alpha(C3383w c3383w, C3382v c3382v, C3382v c3382v2, boolean z2, int i4) {
        if ((i4 & 1) != 0) {
            c3382v = c3383w.alpha;
        }
        if ((i4 & 2) != 0) {
            c3382v2 = c3383w.bravo;
        }
        c3383w.getClass();
        return new C3383w(c3382v, c3382v2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3383w)) {
            return false;
        }
        C3383w c3383w = (C3383w) obj;
        if (Intrinsics.areEqual(this.alpha, c3383w.alpha) && Intrinsics.areEqual(this.bravo, c3383w.bravo) && this.charlie == c3383w.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.alpha);
        sb2.append(", end=");
        sb2.append(this.bravo);
        sb2.append(", handlesCrossed=");
        return P0.gray(sb2, this.charlie, ')');
    }
}
