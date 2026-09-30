package Wf;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ab {
    public final LinkedHashMap alpha;

    public ab(LinkedHashMap linkedHashMap) {
        this.alpha = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ab) || !Intrinsics.areEqual(this.alpha, ((ab) obj).alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Plurals(items=" + this.alpha + ")";
    }
}
