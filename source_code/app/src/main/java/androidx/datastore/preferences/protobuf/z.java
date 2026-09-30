package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class z implements ag {
    public ag[] alpha;

    @Override // androidx.datastore.preferences.protobuf.ag
    public final ar alpha(Class cls) {
        for (ag agVar : this.alpha) {
            if (agVar.bravo(cls)) {
                return agVar.alpha(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.ag
    public final boolean bravo(Class cls) {
        for (ag agVar : this.alpha) {
            if (agVar.bravo(cls)) {
                return true;
            }
        }
        return false;
    }
}
