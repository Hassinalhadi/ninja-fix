package N2;

import f0.AbstractC1680b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends h {
    public final AbstractC1680b alpha;

    public f(AbstractC1680b abstractC1680b) {
        this.alpha = abstractC1680b;
    }

    @Override // N2.h
    public final AbstractC1680b alpha() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && Intrinsics.areEqual(this.alpha, ((f) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC1680b abstractC1680b = this.alpha;
        if (abstractC1680b == null) {
            return 0;
        }
        return abstractC1680b.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.alpha + ')';
    }
}
