package Kc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends e {
    public final List alpha;
    public final boolean bravo;
    public final boolean charlie;

    public d(List items, boolean z2, boolean z10) {
        Intrinsics.echo(items, "items");
        this.alpha = items;
        this.bravo = z2;
        this.charlie = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.alpha, dVar.alpha) && this.bravo == dVar.bravo && this.charlie == dVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        int i5 = 1237;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (hashCode + i4) * 31;
        if (this.charlie) {
            i5 = 1231;
        }
        return i10 + i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(items=");
        sb2.append(this.alpha);
        sb2.append(", hasMore=");
        sb2.append(this.bravo);
        sb2.append(", isLoadingMore=");
        return Q0.c.romeo(sb2, this.charlie, ")");
    }
}
