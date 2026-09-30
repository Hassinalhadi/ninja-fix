package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;
import t6.AbstractC3013k;

/* loaded from: classes2.dex */
public final class c extends d {
    public final transient int red;
    public final transient int silver;
    public final /* synthetic */ d teal;

    public c(d dVar, int i4, int i5) {
        this.teal = dVar;
        this.red = i4;
        this.silver = i5;
    }

    @Override // com.google.common.collect.a
    public final Object[] bravo() {
        return this.teal.bravo();
    }

    @Override // com.google.common.collect.a
    public final int delta() {
        return this.teal.hotel() + this.red + this.silver;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC3013k.bravo(i4, this.silver);
        return this.teal.get(i4 + this.red);
    }

    @Override // com.google.common.collect.a
    public final int hotel() {
        return this.teal.hotel() + this.red;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.d, java.util.List
    /* renamed from: lima, reason: merged with bridge method [inline-methods] */
    public final d subList(int i4, int i5) {
        AbstractC3013k.delta(i4, i5, this.silver);
        int i10 = this.red;
        return this.teal.subList(i4 + i10, i5 + i10);
    }

    @Override // com.google.common.collect.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }

    @Override // com.google.common.collect.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
        return listIterator(i4);
    }
}
