package S;

import androidx.compose.runtime.J;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class ai implements List, Yd.c {
    public final SnapshotStateList alpha;
    public final int purple;
    public int red;
    public int silver;

    public ai(SnapshotStateList snapshotStateList, int i4, int i5) {
        this.alpha = snapshotStateList;
        this.purple = i4;
        this.red = r.delta(snapshotStateList);
        this.silver = i5 - i4;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        alpha();
        int i4 = this.purple + this.silver;
        SnapshotStateList snapshotStateList = this.alpha;
        snapshotStateList.add(i4, obj);
        this.silver++;
        this.red = r.delta(snapshotStateList);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.silver, collection);
    }

    public final void alpha() {
        if (r.delta(this.alpha) == this.red) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.silver > 0) {
            alpha();
            int i4 = this.silver;
            int i5 = this.purple;
            SnapshotStateList snapshotStateList = this.alpha;
            snapshotStateList.kilo(i5, i4 + i5);
            this.silver = 0;
            this.red = r.delta(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        alpha();
        r.alpha(i4, this.silver);
        return this.alpha.get(this.purple + i4);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        alpha();
        int i4 = this.silver;
        int i5 = this.purple;
        Iterator it = J4.hotel(i5, i4 + i5).iterator();
        while (it.hasNext()) {
            int alpha = ((kotlin.collections.x) it).alpha();
            if (Intrinsics.areEqual(obj, this.alpha.get(alpha))) {
                return alpha - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.silver == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        alpha();
        int i4 = this.silver;
        int i5 = this.purple;
        for (int i10 = (i4 + i5) - 1; i10 >= i5; i10--) {
            if (Intrinsics.areEqual(obj, this.alpha.get(i10))) {
                return i10 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i4;
        L.c cVar;
        g kilo;
        boolean bravo;
        alpha();
        SnapshotStateList snapshotStateList = this.alpha;
        int i5 = this.purple;
        int i10 = this.silver + i5;
        int size = snapshotStateList.size();
        do {
            synchronized (r.alpha) {
                z zVar = snapshotStateList.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.g india = cVar.india();
            india.subList(i5, i10).retainAll(collection);
            L.c delta = india.delta();
            if (Intrinsics.areEqual(delta, cVar)) {
                break;
            }
            z zVar3 = snapshotStateList.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, snapshotStateList, kilo), i4, delta, true);
            }
            n.oscar(kilo, snapshotStateList);
        } while (!bravo);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.red = r.delta(this.alpha);
            this.silver -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        r.alpha(i4, this.silver);
        alpha();
        int i5 = i4 + this.purple;
        SnapshotStateList snapshotStateList = this.alpha;
        Object obj2 = snapshotStateList.set(i5, obj);
        this.red = r.delta(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.silver;
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        boolean z2;
        if (i4 >= 0 && i4 <= i5 && i5 <= this.silver) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J.alpha("fromIndex or toIndex are out of bounds");
        }
        alpha();
        int i10 = this.purple;
        return new ai(this.alpha, i4 + i10, i5 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        alpha();
        ?? obj = new Object();
        obj.alpha = i4 - 1;
        return new ah((kotlin.jvm.internal.s) obj, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.delta(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        alpha();
        int i5 = i4 + this.purple;
        SnapshotStateList snapshotStateList = this.alpha;
        boolean addAll = snapshotStateList.addAll(i5, collection);
        if (addAll) {
            this.silver = collection.size() + this.silver;
            this.red = r.delta(snapshotStateList);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        alpha();
        int i5 = this.purple + i4;
        SnapshotStateList snapshotStateList = this.alpha;
        Object remove = snapshotStateList.remove(i5);
        this.silver--;
        this.red = r.delta(snapshotStateList);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        alpha();
        int i5 = this.purple + i4;
        SnapshotStateList snapshotStateList = this.alpha;
        snapshotStateList.add(i5, obj);
        this.silver++;
        this.red = r.delta(snapshotStateList);
    }
}
