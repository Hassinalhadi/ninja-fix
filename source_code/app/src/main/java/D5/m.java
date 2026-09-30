package D5;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class m extends x {
    public final ArrayList alpha;

    public m(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return this.alpha.equals(((m) ((x) obj)).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.alpha + "}";
    }
}
