package M;

/* loaded from: classes3.dex */
public final class p extends n {
    public final h silver;

    public p(h hVar) {
        this.silver = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.red;
        this.red = i4 + 2;
        Object[] objArr = this.alpha;
        return new b(this.silver, objArr[i4], objArr[i4 + 1]);
    }
}
