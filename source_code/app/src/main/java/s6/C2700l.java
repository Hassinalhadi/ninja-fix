package s6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: s6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2700l implements Iterator {
    public final /* synthetic */ int alpha = 0;
    public final Iterator purple;
    public Object red;
    public final /* synthetic */ Object silver;

    public C2700l(C2718n c2718n, Iterator it) {
        this.purple = it;
        this.silver = c2718n;
    }

    public void alpha() {
        C2745q c2745q = (C2745q) this.silver;
        c2745q.bravo();
        if (c2745q.purple == ((Collection) this.red)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                return this.purple.hasNext();
            case 1:
                return this.purple.hasNext();
            default:
                alpha();
                return this.purple.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2745q c2745q;
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) this.purple.next();
                this.red = (Collection) entry.getValue();
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                C2780u c2780u = ((C2709m) this.silver).silver;
                List list = (List) collection;
                if (list instanceof RandomAccess) {
                    c2745q = new C2745q(c2780u, key, list, null);
                } else {
                    c2745q = new C2745q(c2780u, key, list, null);
                }
                return new ab(key, c2745q);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.purple.next();
                this.red = entry2;
                return entry2.getKey();
            default:
                alpha();
                return this.purple.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                if (((Collection) this.red) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                t6.ae.delta("no calls to next() since the last call to remove()", z2);
                this.purple.remove();
                ((C2709m) this.silver).silver.teal -= ((Collection) this.red).size();
                ((Collection) this.red).clear();
                this.red = null;
                return;
            case 1:
                if (((Map.Entry) this.red) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.ae.delta("no calls to next() since the last call to remove()", z10);
                Collection collection = (Collection) ((Map.Entry) this.red).getValue();
                this.purple.remove();
                ((C2718n) this.silver).purple.teal -= collection.size();
                collection.clear();
                this.red = null;
                return;
            default:
                this.purple.remove();
                C2745q c2745q = (C2745q) this.silver;
                C2780u c2780u = c2745q.teal;
                c2780u.teal--;
                c2745q.delta();
                return;
        }
    }

    public C2700l(C2745q c2745q, ListIterator listIterator) {
        this.silver = c2745q;
        this.red = c2745q.purple;
        this.purple = listIterator;
    }

    public C2700l(C2709m c2709m) {
        this.silver = c2709m;
        this.purple = c2709m.red.entrySet().iterator();
    }

    public C2700l(C2745q c2745q) {
        Iterator it;
        this.silver = c2745q;
        Collection collection = c2745q.purple;
        this.red = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.purple = it;
    }
}
