package kotlin.collections;

import S.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class z extends g {
    public final ArrayList alpha;

    public z(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        this.alpha.add(q.uniform(i4, this), obj);
    }

    @Override // kotlin.collections.g
    public final int alpha() {
        return this.alpha.size();
    }

    @Override // kotlin.collections.g
    public final Object bravo(int i4) {
        return this.alpha.remove(q.tango(i4, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return this.alpha.get(q.tango(i4, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ah(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new ah(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        return this.alpha.set(q.tango(i4, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new ah(this, i4);
    }
}
