package tc;

import kotlin.jvm.internal.Intrinsics;
import sc.C2847b;

/* renamed from: tc.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3110o extends AbstractC3112q {
    public final C2847b alpha;

    public C3110o(C2847b c2847b) {
        this.alpha = c2847b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3110o) && Intrinsics.areEqual(this.alpha, ((C3110o) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "Loaded(assignment=" + this.alpha + ")";
    }
}
