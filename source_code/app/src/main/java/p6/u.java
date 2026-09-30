package p6;

import s6.AbstractC2681i7;

/* loaded from: classes2.dex */
public final class u extends v {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ v teal;

    public u(v vVar, int i4, int i5) {
        this.teal = vVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // p6.s
    public final Object[] alpha() {
        return this.teal.alpha();
    }

    @Override // p6.s
    public final int bravo() {
        return this.teal.bravo() + this.red;
    }

    @Override // p6.s
    public final int delta() {
        return this.teal.bravo() + this.red + this.silver;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2681i7.bravo(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // p6.s
    public final boolean hotel() {
        return true;
    }

    @Override // p6.v, java.util.List
    /* renamed from: kilo, reason: merged with bridge method [inline-methods] */
    public final v subList(int i4, int i5) {
        AbstractC2681i7.charlie(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
