package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class G extends j0 {
    public final List alpha;

    public G(List list) {
        this.alpha = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            return this.alpha.equals(((G) ((j0) obj)).alpha);
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
