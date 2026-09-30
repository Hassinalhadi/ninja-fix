package t6;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2963a implements InterfaceC2978d {
    public final int alpha;

    public C2963a(int i4) {
        this.alpha = i4;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC2978d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InterfaceC2978d) {
                C2963a c2963a = (C2963a) ((InterfaceC2978d) obj);
                if (this.alpha == c2963a.alpha) {
                    Object obj2 = EnumC2973c.alpha;
                    c2963a.getClass();
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
        return (this.alpha ^ 14552422) + (EnumC2973c.alpha.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.alpha + "intEncoding=" + EnumC2973c.alpha + ')';
    }
}
