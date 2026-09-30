package bv;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2770s7;

/* loaded from: classes3.dex */
public final class h implements Set, Yd.a {
    public final /* synthetic */ int alpha;
    public final al purple;

    public h(al parent, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(parent, "parent");
                this.purple = parent;
                return;
            default:
                Intrinsics.echo(parent, "parent");
                this.purple = parent;
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                Intrinsics.echo(element, "element");
                return Intrinsics.areEqual(this.purple.golf(element.getKey()), element.getValue());
            default:
                return this.purple.charlie(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                Collection<Map.Entry> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection) {
                    if (!Intrinsics.areEqual(this.purple.golf(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                Intrinsics.echo(elements, "elements");
                Collection collection2 = elements;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!this.purple.charlie(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                return this.purple.india();
            default:
                return this.purple.india();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return AbstractC2770s7.bravo(new g(this, null));
            default:
                return AbstractC2770s7.bravo(new q(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return this.purple.echo;
            default:
                return this.purple.echo;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.j.charlie(this);
            default:
                return kotlin.jvm.internal.j.charlie(this);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(array, "array");
                return kotlin.jvm.internal.j.delta(this, array);
            default:
                Intrinsics.echo(array, "array");
                return kotlin.jvm.internal.j.delta(this, array);
        }
    }
}
