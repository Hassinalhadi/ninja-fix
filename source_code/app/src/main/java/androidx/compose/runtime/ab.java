package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab implements G0 {
    public final Function1 alpha;

    public ab(Function1 function1) {
        this.alpha = function1;
    }

    @Override // androidx.compose.runtime.G0
    public final Object alpha(I i4) {
        return this.alpha.invoke(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && Intrinsics.areEqual(this.alpha, ((ab) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.alpha + ')';
    }
}
