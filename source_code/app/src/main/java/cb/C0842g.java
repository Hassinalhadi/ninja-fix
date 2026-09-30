package cb;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0842g {
    public final String alpha;
    public final int bravo;

    public C0842g(String str, int i4) {
        this.alpha = str;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0842g)) {
            return false;
        }
        C0842g c0842g = (C0842g) obj;
        if (Intrinsics.areEqual(this.alpha, c0842g.alpha) && this.bravo == c0842g.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        return "OrderItemRow(name=" + this.alpha + ", quantity=" + this.bravo + ")";
    }
}
