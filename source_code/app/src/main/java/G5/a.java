package G5;

/* loaded from: classes3.dex */
public final class a implements Kd.a {
    public static final Object charlie = new Object();
    public volatile b alpha;
    public volatile Object bravo;

    /* JADX WARN: Type inference failed for: r0v1, types: [G5.a, java.lang.Object, Kd.a] */
    public static Kd.a alpha(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.bravo = charlie;
        obj.alpha = bVar;
        return obj;
    }

    @Override // Kd.a
    public final Object get() {
        Object obj;
        Object obj2 = this.bravo;
        Object obj3 = charlie;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
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
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
