package p7;

import s6.AbstractC2699k7;

/* renamed from: p7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2289f extends g {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ g teal;

    public C2289f(g gVar, int i4, int i5) {
        this.teal = gVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // p7.AbstractC2287d
    public final int bravo() {
        return this.teal.delta() + this.red + this.silver;
    }

    @Override // p7.AbstractC2287d
    public final int delta() {
        return this.teal.delta() + this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2699k7.alpha(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // p7.AbstractC2287d
    public final Object[] hotel() {
        return this.teal.hotel();
    }

    @Override // p7.g, java.util.List
    /* renamed from: india, reason: merged with bridge method [inline-methods] */
    public final g subList(int i4, int i5) {
        AbstractC2699k7.bravo(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
