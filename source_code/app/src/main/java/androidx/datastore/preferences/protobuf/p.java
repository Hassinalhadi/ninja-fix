package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class p implements ag {
    public static final p bravo = new p(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ p(int i4) {
        this.alpha = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.ag
    public final ar alpha(Class cls) {
        switch (this.alpha) {
            case 0:
                if (s.class.isAssignableFrom(cls)) {
                    try {
                        return (ar) s.charlie(cls.asSubclass(s.class)).bravo(3);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ag
    public final boolean bravo(Class cls) {
        switch (this.alpha) {
            case 0:
                return s.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
