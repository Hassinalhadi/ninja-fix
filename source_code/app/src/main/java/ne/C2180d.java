package ne;

/* renamed from: ne.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2180d {
    public final EnumC2181e alpha;
    public final int bravo;

    public C2180d(EnumC2181e enumC2181e, int i4) {
        this.alpha = enumC2181e;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2180d)) {
            return false;
        }
        C2180d c2180d = (C2180d) obj;
        if (this.alpha == c2180d.alpha && this.bravo == c2180d.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
        sb2.append(this.alpha);
        sb2.append(", arity=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
