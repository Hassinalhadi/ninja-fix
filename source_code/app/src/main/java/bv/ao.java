package bv;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ao implements Yd.f, Set, Yd.a {
    public final am alpha;
    public final am purple;

    public ao(am amVar) {
        this.alpha = amVar;
        this.purple = amVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.purple.alpha(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        am amVar = this.purple;
        int i4 = amVar.delta;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            amVar.kilo(it.next());
        }
        if (i4 != amVar.delta) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.purple.bravo();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.alpha.charlie(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.alpha.charlie(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ao.class == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((ao) obj).alpha);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.golf();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N.d(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.purple.lima(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.echo(elements, "elements");
        am amVar = this.purple;
        amVar.getClass();
        int i4 = amVar.delta;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            amVar.india(it.next());
        }
        if (i4 != amVar.delta) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z2;
        Intrinsics.echo(elements, "elements");
        am amVar = this.purple;
        amVar.getClass();
        Object[] objArr = amVar.bravo;
        int i4 = amVar.delta;
        long[] jArr = amVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            int i12 = (i5 << 3) + i11;
                            if (!CollectionsKt.bronze(elements, objArr[i12])) {
                                amVar.mike(i12);
                            }
                        }
                        j5 >>= 8;
                    }
                    z2 = false;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    z2 = false;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        } else {
            z2 = false;
        }
        if (i4 != amVar.delta) {
            return true;
        }
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.alpha.delta;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.echo(array, "array");
        return kotlin.jvm.internal.j.delta(this, array);
    }
}
