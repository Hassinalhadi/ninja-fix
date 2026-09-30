package r6;

import t6.AbstractC2998h;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2495c extends AbstractC2496d {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ AbstractC2496d teal;

    public C2495c(AbstractC2496d abstractC2496d, int i4, int i5) {
        this.teal = abstractC2496d;
        this.red = i4;
        this.silver = i5;
    }

    @Override // r6.AbstractC2493a
    public final int bravo() {
        return this.teal.delta() + this.red + this.silver;
    }

    @Override // r6.AbstractC2493a
    public final int delta() {
        return this.teal.delta() + this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2998h.foxtrot(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // r6.AbstractC2493a
    public final Object[] hotel() {
        return this.teal.hotel();
    }

    @Override // r6.AbstractC2496d, java.util.List
    /* renamed from: india, reason: merged with bridge method [inline-methods] */
    public final AbstractC2496d subList(int i4, int i5) {
        AbstractC2998h.hotel(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
