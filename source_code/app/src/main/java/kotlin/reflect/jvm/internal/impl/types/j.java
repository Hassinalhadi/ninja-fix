package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class j {
    public final InterfaceC2472h alpha;

    public j(InterfaceC2472h annotations) {
        Intrinsics.echo(annotations, "annotations");
        this.alpha = annotations;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return Intrinsics.areEqual(((j) obj).alpha, this.alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
