package t6;

/* loaded from: classes2.dex */
public final class q4 extends o4 {
    public static final q4 teal = new q4(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public q4(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // t6.o4, t6.G3
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.red;
        int i4 = this.silver;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // t6.G3
    public final int bravo() {
        return this.silver;
    }

    @Override // t6.G3
    public final int delta() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC3026m2.charlie(i4, this.silver);
        Object obj = this.red[i4];
        obj.getClass();
        return obj;
    }

    @Override // t6.G3
    public final Object[] hotel() {
        return this.red;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
