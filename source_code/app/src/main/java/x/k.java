package x;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class k {
    public final String alpha;
    public String bravo;
    public boolean charlie = false;
    public C3274e delta = null;

    public k(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Intrinsics.areEqual(this.alpha, kVar.alpha) && Intrinsics.areEqual(this.bravo, kVar.bravo) && this.charlie == kVar.charlie && Intrinsics.areEqual(this.delta, kVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (sierra + i4) * 31;
        C3274e c3274e = this.delta;
        if (c3274e == null) {
            hashCode = 0;
        } else {
            hashCode = c3274e.hashCode();
        }
        return i5 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.delta);
        sb2.append(", isShowingSubstitution=");
        return P0.gray(sb2, this.charlie, ')');
    }
}
