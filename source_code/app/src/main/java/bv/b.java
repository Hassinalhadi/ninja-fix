package bv;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class b implements Set {
    public final /* synthetic */ e alpha;

    public b(e eVar) {
        this.alpha = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.alpha.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.alpha.kilo(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                e eVar = this.alpha;
                try {
                    if (eVar.red == set.size()) {
                        if (eVar.kilo(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        e eVar = this.alpha;
        int i4 = 0;
        for (int i5 = eVar.red - 1; i5 >= 0; i5--) {
            Object foxtrot = eVar.foxtrot(i5);
            if (foxtrot == null) {
                hashCode = 0;
            } else {
                hashCode = foxtrot.hashCode();
            }
            i4 += hashCode;
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0762a(this.alpha, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.alpha;
        int delta = eVar.delta(obj);
        if (delta >= 0) {
            eVar.hotel(delta);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.alpha.lima(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.alpha.mike(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.alpha.red;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.alpha;
        int i4 = eVar.red;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.foxtrot(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.alpha;
        int i4 = eVar.red;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.foxtrot(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
