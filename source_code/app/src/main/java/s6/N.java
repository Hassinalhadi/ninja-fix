package s6;

/* loaded from: classes2.dex */
public final class N implements Q {
    public final int alpha;

    public N(int i4) {
        this.alpha = i4;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return Q.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q) {
                N n5 = (N) ((Q) obj);
                if (this.alpha == n5.alpha) {
                    Object obj2 = P.alpha;
                    n5.getClass();
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.alpha ^ 14552422) + (P.alpha.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.alpha + "intEncoding=" + P.alpha + ')';
    }
}
