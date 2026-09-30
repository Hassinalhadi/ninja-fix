package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah implements G0 {
    public final ax alpha;

    public ah(ax axVar) {
        this.alpha = axVar;
    }

    @Override // androidx.compose.runtime.G0
    public final Object alpha(I i4) {
        return ((t0) this.alpha).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && Intrinsics.areEqual(this.alpha, ((ah) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.alpha + ')';
    }
}
