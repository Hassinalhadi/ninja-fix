package com.google.common.collect;

/* loaded from: classes2.dex */
public final class k extends f {
    public final transient m silver;
    public final transient l teal;

    public k(m mVar, l lVar) {
        this.silver = mVar;
        this.teal = lVar;
    }

    @Override // com.google.common.collect.a
    public final int alpha(Object[] objArr) {
        return this.teal.alpha(objArr);
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.silver.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.f
    public final d india() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: november, reason: merged with bridge method [inline-methods] */
    public final p iterator() {
        return this.teal.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.silver.white;
    }
}
