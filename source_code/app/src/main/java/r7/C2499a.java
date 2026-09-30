package r7;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2499a extends AbstractC2500b {
    public static final C2499a alpha = new Object();

    @Override // r7.AbstractC2500b
    public final Object alpha() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // r7.AbstractC2500b
    public final boolean bravo() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
