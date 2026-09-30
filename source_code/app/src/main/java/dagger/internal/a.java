package dagger.internal;

/* loaded from: classes2.dex */
public final class a implements d {
    public static final Object charlie = new Object();
    public volatile d alpha;
    public volatile Object bravo;

    public static d alpha(b bVar) {
        bVar.getClass();
        return bravo(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dagger.internal.d, dagger.internal.a, java.lang.Object] */
    public static d bravo(d dVar) {
        dVar.getClass();
        if (dVar instanceof a) {
            return dVar;
        }
        ?? obj = new Object();
        obj.bravo = charlie;
        obj.alpha = dVar;
        return obj;
    }

    @Override // Kd.a
    public final Object get() {
        Object obj;
        Object obj2 = this.bravo;
        Object obj3 = charlie;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.bravo;
                if (obj == obj3) {
                    obj = this.alpha.get();
                    Object obj4 = this.bravo;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.bravo = obj;
                    this.alpha = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
