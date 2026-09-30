package s6;

/* loaded from: classes2.dex */
public final class ae extends af {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ af teal;

    public ae(af afVar, int i4, int i5) {
        this.teal = afVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // s6.aa
    public final int bravo() {
        return this.teal.delta() + this.red + this.silver;
    }

    @Override // s6.aa
    public final int delta() {
        return this.teal.delta() + this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        t6.ae.bravo(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // s6.aa
    public final Object[] hotel() {
        return this.teal.hotel();
    }

    @Override // s6.af, java.util.List
    /* renamed from: india, reason: merged with bridge method [inline-methods] */
    public final af subList(int i4, int i5) {
        t6.ae.charlie(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
