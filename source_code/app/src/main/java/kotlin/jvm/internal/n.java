package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class n implements d {
    public final Class alpha;

    public n(Class jClass, String str) {
        Intrinsics.echo(jClass, "jClass");
        this.alpha = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            if (Intrinsics.areEqual(this.alpha, ((n) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d
    public final Class golf() {
        return this.alpha;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha + " (Kotlin reflection is not available)";
    }
}
