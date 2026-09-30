package Wf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa {
    public final ArrayList alpha;

    public aa(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof aa) || !Intrinsics.areEqual(this.alpha, ((aa) obj).alpha)) {
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
        return "Array(items=" + this.alpha + ")";
    }
}
