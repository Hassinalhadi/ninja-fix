package Wf;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements o {
    public final String alpha;

    public p(String region) {
        Intrinsics.echo(region, "region");
        this.alpha = region;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((p) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("RegionQualifier(region='"), this.alpha, "')");
    }
}
