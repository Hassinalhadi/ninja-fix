package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import t6.AbstractC3013k;

/* loaded from: classes2.dex */
public abstract class d extends a implements List, RandomAccess {
    public static final b purple = new b(h.teal, 0);

    public static h india(int i4, Object[] objArr) {
        if (i4 == 0) {
            return h.teal;
        }
        return new h(i4, objArr);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a
    public int alpha(Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = get(i4);
        }
        return size;
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj2 = get(i4);
                            Object obj3 = list.get(i4);
                            if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                                return false;
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj4 : this) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (obj4 != next && (obj4 == null || !obj4.equals(next))) {
                                    return false;
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = ~(~(get(i5).hashCode() + (i4 * 31)));
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: kilo, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i4) {
        AbstractC3013k.charlie(i4, size());
        if (isEmpty()) {
            return purple;
        }
        return new b(this, i4);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* renamed from: lima */
    public d subList(int i4, int i5) {
        AbstractC3013k.delta(i4, i5, size());
        int i10 = i5 - i4;
        if (i10 == size()) {
            return this;
        }
        if (i10 == 0) {
            return h.teal;
        }
        return new c(this, i4, i10);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
