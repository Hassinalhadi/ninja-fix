package e8;

/* renamed from: e8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1633a implements InterfaceC1637e {
    public final int alpha;

    public C1633a(int i4) {
        this.alpha = i4;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC1637e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InterfaceC1637e) {
                C1633a c1633a = (C1633a) ((InterfaceC1637e) obj);
                if (this.alpha == c1633a.alpha) {
                    Object obj2 = EnumC1636d.alpha;
                    c1633a.getClass();
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
        return (14552422 ^ this.alpha) + (EnumC1636d.alpha.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.alpha + "intEncoding=" + EnumC1636d.alpha + ')';
    }
}
