package s0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2561v implements List, Yd.a {
    public final bv.ah alpha = new bv.ah(16);
    public final bv.ac purple = new bv.ac(16);
    public int red = -1;

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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long alpha() {
        long alpha = AbstractC2557q.alpha(Float.POSITIVE_INFINITY, false, false);
        int i4 = this.red + 1;
        int ivory = CollectionsKt.ivory(this);
        if (i4 <= ivory) {
            while (true) {
                bv.ac acVar = this.purple;
                if (i4 >= 0) {
                    if (i4 >= acVar.bravo) {
                        break;
                    }
                    long j5 = acVar.alpha[i4];
                    if (AbstractC2557q.delta(j5, alpha) < 0) {
                        alpha = j5;
                    }
                    if ((AbstractC2557q.hotel(alpha) >= 0.0f || !AbstractC2557q.kilo(alpha)) && i4 != ivory) {
                        i4++;
                    }
                } else {
                    acVar.getClass();
                    break;
                }
            }
            bw.a.delta("Index must be between 0 and size");
            throw null;
        }
        return alpha;
    }

    public final void bravo(int i4, int i5) {
        if (i4 < i5) {
            this.alpha.lima(i4, i5);
            bv.ac acVar = this.purple;
            if (i4 >= 0) {
                int i10 = acVar.bravo;
                if (i4 <= i10 && i5 >= 0 && i5 <= i10) {
                    if (i5 >= i4) {
                        if (i5 != i4) {
                            if (i5 < i10) {
                                long[] jArr = acVar.alpha;
                                ArraysKt.azure(jArr, jArr, i4, i5, i10);
                            }
                            acVar.bravo -= i5 - i4;
                            return;
                        }
                        return;
                    }
                    bw.a.charlie("The end index must be < start index");
                    throw null;
                }
            } else {
                acVar.getClass();
            }
            bw.a.delta("Index must be between 0 and size");
            throw null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.red = -1;
        this.alpha.india();
        this.purple.bravo = 0;
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
        Object bravo = this.alpha.bravo(i4);
        Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (T.r) bravo;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof T.r)) {
            return -1;
        }
        T.r rVar = (T.r) obj;
        int ivory = CollectionsKt.ivory(this);
        if (ivory >= 0) {
            int i4 = 0;
            while (!Intrinsics.areEqual(this.alpha.bravo(i4), rVar)) {
                if (i4 != ivory) {
                    i4++;
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.delta();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Ld.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof T.r)) {
            return -1;
        }
        T.r rVar = (T.r) obj;
        for (int ivory = CollectionsKt.ivory(this); -1 < ivory; ivory--) {
            if (Intrinsics.areEqual(this.alpha.bravo(ivory), rVar)) {
                return ivory;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Ld.a(this, 0, 7);
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
        return this.alpha.bravo;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        return new C2560u(this, i4, i5);
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
        return new Ld.a(this, i4, 6);
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
