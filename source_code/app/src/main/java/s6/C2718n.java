package s6;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: s6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2718n extends ap {
    public final C2825z alpha;
    public final /* synthetic */ C2780u purple;

    public C2718n(C2780u c2780u, C2825z c2825z) {
        this.purple = c2780u;
        this.alpha = c2825z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C2700l c2700l = (C2700l) it;
            if (c2700l.hasNext()) {
                c2700l.next();
                c2700l.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.alpha.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.alpha.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.alpha.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.alpha.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2700l(this, this.alpha.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.alpha.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.purple.teal -= size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.alpha.size();
    }
}
