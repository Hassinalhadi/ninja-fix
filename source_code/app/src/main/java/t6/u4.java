package t6;

/* loaded from: classes2.dex */
public final class u4 extends o4 {
    public final transient Object[] red;
    public final transient int silver;
    public final transient int teal = 1;

    public u4(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC3026m2.charlie(i4, this.teal);
        Object obj = this.red[i4 + i4 + this.silver];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.teal;
    }
}
