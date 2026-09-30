package J8;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ad {
    public final String alpha;
    public final int bravo;
    public final int charlie;
    public final boolean delta;

    public ad(String str, int i4, int i5, boolean z2) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (Intrinsics.areEqual(this.alpha, adVar.alpha) && this.bravo == adVar.bravo && this.charlie == adVar.charlie && this.delta == adVar.delta) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.alpha.hashCode() * 31) + this.bravo) * 31) + this.charlie) * 31;
        boolean z2 = this.delta;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.alpha);
        sb2.append(", pid=");
        sb2.append(this.bravo);
        sb2.append(", importance=");
        sb2.append(this.charlie);
        sb2.append(", isDefaultProcess=");
        return P0.gray(sb2, this.delta, ')');
    }
}
