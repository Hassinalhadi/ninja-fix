package I8;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class d {
    public final HashSet alpha;

    public d(HashSet hashSet) {
        this.alpha = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.alpha.equals(((d) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.alpha + "}";
    }
}
