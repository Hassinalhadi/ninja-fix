package bv;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2770s7;

/* loaded from: classes3.dex */
public final class A implements Collection, Yd.a {
    public final /* synthetic */ int alpha = 1;
    public final Object purple;

    public A() {
        int i4 = at.alpha;
        this.purple = new ai(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((ai) this.purple).alpha(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((ai) this.purple).bravo();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((al) this.purple).delta(obj);
            default:
                return ((ai) this.purple).charlie(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((al) this.purple).delta(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((ai) this.purple).charlie(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                return ((al) this.purple).india();
            default:
                if (((ai) this.purple).golf == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return AbstractC2770s7.bravo(new az(this, null));
            default:
                ai aiVar = (ai) this.purple;
                aiVar.getClass();
                return new N.d(new ak(aiVar));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((ai) this.purple).golf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((ai) this.purple).golf(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((ai) this.purple).india(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return ((al) this.purple).echo;
            default:
                return ((ai) this.purple).golf;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.j.charlie(this);
            default:
                return kotlin.jvm.internal.j.charlie(this);
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(array, "array");
                return kotlin.jvm.internal.j.delta(this, array);
            default:
                return kotlin.jvm.internal.j.delta(this, array);
        }
    }

    public A(al parent) {
        Intrinsics.echo(parent, "parent");
        this.purple = parent;
    }
}
