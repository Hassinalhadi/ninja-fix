package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class F0 implements G0 {
    public final Object alpha;

    public F0(Object obj) {
        this.alpha = obj;
    }

    @Override // androidx.compose.runtime.G0
    public final Object alpha(I i4) {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F0) && Intrinsics.areEqual(this.alpha, ((F0) obj).alpha);
    }

    public final int hashCode() {
        Object obj = this.alpha;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.alpha + ')';
    }
}
