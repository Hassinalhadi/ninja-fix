package H0;

/* loaded from: classes3.dex */
public final class b {
    public final int alpha;

    public b(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.alpha == ((b) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return Q0.c.quebec(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.alpha, ')');
    }
}
