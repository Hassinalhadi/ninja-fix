package r7;

import androidx.appcompat.widget.P0;

/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501c extends AbstractC2500b {
    public final Object alpha;

    public C2501c(Object obj) {
        this.alpha = obj;
    }

    @Override // r7.AbstractC2500b
    public final Object alpha() {
        return this.alpha;
    }

    @Override // r7.AbstractC2500b
    public final boolean bravo() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2501c) {
            return this.alpha.equals(((C2501c) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() + 1502476572;
    }

    public final String toString() {
        return P0.emerald(new StringBuilder("Optional.of("), this.alpha, ")");
    }
}
