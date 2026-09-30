package q6;

import s6.AbstractC2779t7;

/* loaded from: classes2.dex */
public final class p extends q {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ q teal;

    public p(q qVar, int i4, int i5) {
        this.teal = qVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // q6.n
    public final int bravo() {
        return this.teal.delta() + this.red + this.silver;
    }

    @Override // q6.n
    public final int delta() {
        return this.teal.delta() + this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2779t7.charlie(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // q6.n
    public final Object[] hotel() {
        return this.teal.hotel();
    }

    @Override // q6.q, java.util.List
    /* renamed from: india */
    public final q subList(int i4, int i5) {
        AbstractC2779t7.delta(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
