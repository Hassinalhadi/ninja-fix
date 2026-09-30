package Ce;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {
    public final Ne.f alpha;
    public final ve.q bravo;

    public s(Ne.f name, ve.q qVar) {
        Intrinsics.echo(name, "name");
        this.alpha = name;
        this.bravo = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (Intrinsics.areEqual(this.alpha, ((s) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
