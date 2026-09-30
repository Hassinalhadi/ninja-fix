package D0;

import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final Object alpha;
    public final int bravo;
    public int charlie;
    public final String delta;

    public c(String str, int i4, int i5, Object obj) {
        this.alpha = obj;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = str;
    }

    public final e alpha(int i4) {
        boolean z2;
        int i5 = this.charlie;
        if (i5 != Integer.MIN_VALUE) {
            i4 = i5;
        }
        if (i4 != Integer.MIN_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J0.a.bravo("Item.end should be set first");
        }
        return new e(this.delta, this.bravo, i4, this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && this.bravo == cVar.bravo && this.charlie == cVar.charlie && Intrinsics.areEqual(this.delta, cVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.delta.hashCode() + (((((hashCode * 31) + this.bravo) * 31) + this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.alpha);
        sb2.append(", start=");
        sb2.append(this.bravo);
        sb2.append(", end=");
        sb2.append(this.charlie);
        sb2.append(", tag=");
        return P0.fuchsia(sb2, this.delta, ')');
    }

    public /* synthetic */ c(b bVar, int i4, int i5, String str, int i10) {
        this((i10 & 8) != 0 ? "" : str, i4, (i10 & 4) != 0 ? RecyclerView.UNDEFINED_DURATION : i5, bVar);
    }
}
