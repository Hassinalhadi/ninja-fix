package s6;

import java.util.Map;
import java.util.Set;

/* renamed from: s6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2771t {
    public transient C2762s alpha;
    public transient C2718n purple;
    public transient C2709m red;

    public final Map alpha() {
        C2709m c2709m = this.red;
        if (c2709m == null) {
            C2780u c2780u = (C2780u) this;
            C2709m c2709m2 = new C2709m(c2780u, c2780u.silver);
            this.red = c2709m2;
            return c2709m2;
        }
        return c2709m;
    }

    public final Set bravo() {
        C2718n c2718n = this.purple;
        if (c2718n == null) {
            C2780u c2780u = (C2780u) this;
            C2718n c2718n2 = new C2718n(c2780u, c2780u.silver);
            this.purple = c2718n2;
            return c2718n2;
        }
        return c2718n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2771t)) {
            return false;
        }
        return alpha().equals(((AbstractC2771t) obj).alpha());
    }

    public final int hashCode() {
        return ((C2709m) alpha()).red.hashCode();
    }

    public final String toString() {
        return ((C2709m) alpha()).red.toString();
    }
}
