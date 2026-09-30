package g3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends s {
    public final List alpha;

    public q(List recommendations) {
        Intrinsics.echo(recommendations, "recommendations");
        this.alpha = recommendations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q) && Intrinsics.areEqual(this.alpha, ((q) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Ready(recommendations=" + this.alpha + ")";
    }

    public /* synthetic */ q() {
        this(CollectionsKt.emptyList());
    }
}
