package s6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: s6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2745q extends AbstractCollection implements List {
    public final Object alpha;
    public Collection purple;
    public final C2745q red;
    public final Collection silver;
    public final /* synthetic */ C2780u teal;
    public final /* synthetic */ C2780u white;

    public C2745q(C2780u c2780u, Object obj, List list, C2745q c2745q) {
        Collection collection;
        this.white = c2780u;
        this.teal = c2780u;
        this.alpha = obj;
        this.purple = list;
        this.red = c2745q;
        if (c2745q == null) {
            collection = null;
        } else {
            collection = c2745q.purple;
        }
        this.silver = collection;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        bravo();
        boolean isEmpty = this.purple.isEmpty();
        ((List) this.purple).add(i4, obj);
        this.white.teal++;
        if (isEmpty) {
            alpha();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.purple).addAll(i4, collection);
        if (!addAll) {
            return addAll;
        }
        this.white.teal += this.purple.size() - size;
        if (size != 0) {
            return addAll;
        }
        alpha();
        return true;
    }

    public final void alpha() {
        C2745q c2745q = this.red;
        if (c2745q != null) {
            c2745q.alpha();
            return;
        }
        this.teal.silver.put(this.alpha, this.purple);
    }

    public final void bravo() {
        Collection collection;
        C2745q c2745q = this.red;
        if (c2745q != null) {
            c2745q.bravo();
            if (c2745q.purple != this.silver) {
                throw new ConcurrentModificationException();
            }
        } else if (this.purple.isEmpty() && (collection = (Collection) this.teal.silver.get(this.alpha)) != null) {
            this.purple = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.purple.clear();
        this.teal.teal -= size;
        delta();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        bravo();
        return this.purple.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        bravo();
        return this.purple.containsAll(collection);
    }

    public final void delta() {
        C2745q c2745q = this.red;
        if (c2745q != null) {
            c2745q.delta();
        } else if (this.purple.isEmpty()) {
            this.teal.silver.remove(this.alpha);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        bravo();
        return this.purple.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        bravo();
        return ((List) this.purple).get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        bravo();
        return this.purple.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        bravo();
        return ((List) this.purple).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        bravo();
        return new C2700l(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        bravo();
        return ((List) this.purple).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        bravo();
        return new C2736p(this);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        bravo();
        Object remove = ((List) this.purple).remove(i4);
        C2780u c2780u = this.white;
        c2780u.teal--;
        delta();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.purple.removeAll(collection);
        if (removeAll) {
            this.teal.teal += this.purple.size() - size;
            delta();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.purple.retainAll(collection);
        if (retainAll) {
            this.teal.teal += this.purple.size() - size;
            delta();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        bravo();
        return ((List) this.purple).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        bravo();
        return this.purple.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        bravo();
        List subList = ((List) this.purple).subList(i4, i5);
        C2745q c2745q = this.red;
        if (c2745q == null) {
            c2745q = this;
        }
        C2780u c2780u = this.white;
        c2780u.getClass();
        boolean z2 = subList instanceof RandomAccess;
        Object obj = this.alpha;
        if (z2) {
            return new C2745q(c2780u, obj, subList, c2745q);
        }
        return new C2745q(c2780u, obj, subList, c2745q);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        bravo();
        return this.purple.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        bravo();
        return new C2736p(this, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        bravo();
        boolean remove = this.purple.remove(obj);
        if (remove) {
            C2780u c2780u = this.teal;
            c2780u.teal--;
            delta();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        bravo();
        boolean isEmpty = this.purple.isEmpty();
        boolean add = this.purple.add(obj);
        if (add) {
            this.teal.teal++;
            if (isEmpty) {
                alpha();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.purple.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        this.teal.teal += this.purple.size() - size;
        if (size != 0) {
            return addAll;
        }
        alpha();
        return true;
    }
}
