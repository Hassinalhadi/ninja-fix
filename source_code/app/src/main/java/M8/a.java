package M8;

/* loaded from: classes2.dex */
public final class a implements Kd.a, L8.a {
    public static final Object charlie = new Object();
    public volatile Kd.a alpha;
    public volatile Object bravo = charlie;

    public a(Kd.a aVar) {
        this.alpha = aVar;
    }

    public static Kd.a alpha(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
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
