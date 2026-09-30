package p7;

/* loaded from: classes2.dex */
public final class k implements m {
    public static final Object red = new Object();
    public volatile l alpha;
    public volatile Object purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [p7.k, java.lang.Object] */
    public static k alpha(l lVar) {
        if (lVar instanceof k) {
            return (k) lVar;
        }
        ?? obj = new Object();
        obj.purple = red;
        obj.alpha = lVar;
        return obj;
    }

    @Override // p7.m
    public final Object bravo() {
        Object obj;
        Object obj2 = this.purple;
        Object obj3 = red;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.purple;
                    if (obj == obj3) {
                        obj = this.alpha.bravo();
                        Object obj4 = this.purple;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.purple = obj;
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
