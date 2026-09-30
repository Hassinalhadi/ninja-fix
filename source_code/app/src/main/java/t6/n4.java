package t6;

/* loaded from: classes2.dex */
public final class n4 extends o4 {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ o4 teal;

    public n4(o4 o4Var, int i4, int i5) {
        this.teal = o4Var;
        this.red = i4;
        this.silver = i5;
    }

    @Override // t6.G3
    public final int bravo() {
        return this.teal.delta() + this.red + this.silver;
    }

    @Override // t6.G3
    public final int delta() {
        return this.teal.delta() + this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC3026m2.charlie(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // t6.G3
    public final Object[] hotel() {
        return this.teal.hotel();
    }

    @Override // t6.o4, java.util.List
    /* renamed from: india, reason: merged with bridge method [inline-methods] */
    public final o4 subList(int i4, int i5) {
        AbstractC3026m2.delta(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
