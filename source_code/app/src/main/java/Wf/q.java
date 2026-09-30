package Wf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {
    public final String alpha;
    public final Set bravo;

    public q(String str, Set set) {
        this.alpha = str;
        this.bravo = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((q) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
