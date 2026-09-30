package s0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2560u implements List, Yd.a {
    public final int alpha;
    public final int purple;
    public final /* synthetic */ C2561v red;

    public C2560u(C2561v c2561v, int i4, int i5) {
        this.red = c2561v;
        this.alpha = i4;
        this.purple = i5;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof T.r) || indexOf((T.r) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((T.r) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Object bravo = this.red.alpha.bravo(i4 + this.alpha);
        Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (T.r) bravo;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof T.r)) {
            return -1;
        }
        T.r rVar = (T.r) obj;
        int i4 = this.alpha;
        int i5 = this.purple;
        if (i4 <= i5) {
            int i10 = i4;
            while (!Intrinsics.areEqual(this.red.alpha.bravo(i10), rVar)) {
                if (i10 != i5) {
                    i10++;
                }
            }
            return i10 - i4;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i4 = this.alpha;
        return new Ld.a(this.red, i4, i4, this.purple);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof T.r)) {
            return -1;
        }
        T.r rVar = (T.r) obj;
        int i4 = this.purple;
        int i5 = this.alpha;
        if (i5 <= i4) {
            while (!Intrinsics.areEqual(this.red.alpha.bravo(i4), rVar)) {
                if (i4 != i5) {
                    i4--;
                }
            }
            return i4 - i5;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i4 = this.alpha;
        return new Ld.a(this.red, i4, i4, this.purple);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.purple - this.alpha;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        int i10 = this.alpha;
        return new C2560u(this.red, i4 + i10, i10 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        int i5 = this.alpha;
        int i10 = this.purple;
        return new Ld.a(this.red, i4 + i5, i5, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.delta(this, objArr);
    }
}
