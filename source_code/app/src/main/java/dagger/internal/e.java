package dagger.internal;

/* loaded from: classes2.dex */
public final class e implements d {
    public static final Object charlie = new Object();
    public volatile d alpha;
    public volatile Object bravo;

    /* JADX WARN: Type inference failed for: r0v2, types: [dagger.internal.d, java.lang.Object, dagger.internal.e] */
    public static d alpha(b bVar) {
        bVar.getClass();
        if (!(bVar instanceof e) && !(bVar instanceof a)) {
            ?? obj = new Object();
            obj.bravo = charlie;
            obj.alpha = bVar;
            return obj;
        }
        return bVar;
    }

    @Override // Kd.a
    public final Object get() {
        Object obj = this.bravo;
        if (obj == charlie) {
            d dVar = this.alpha;
            if (dVar == null) {
                return this.bravo;
            }
            Object obj2 = dVar.get();
            this.bravo = obj2;
            this.alpha = null;
            return obj2;
        }
        return obj;
    }
}
