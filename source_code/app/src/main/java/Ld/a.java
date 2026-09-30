package Ld;

import S.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bv.ah;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import s0.C2561v;

/* loaded from: classes2.dex */
public final class a implements ListIterator, Yd.a {
    public final /* synthetic */ int alpha;
    public int purple;
    public int red;
    public int silver;
    public final Object teal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C2561v c2561v, int i4, int i5) {
        this(c2561v, (i5 & 1) != 0 ? 0 : i4, 0, c2561v.alpha.bravo);
        this.alpha = 3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                alpha();
                int i10 = this.purple;
                this.purple = i10 + 1;
                b bVar = (b) this.teal;
                bVar.add(i10, obj);
                this.red = -1;
                i4 = ((AbstractList) bVar).modCount;
                this.silver = i4;
                return;
            case 1:
                bravo();
                int i11 = this.purple;
                this.purple = i11 + 1;
                c cVar = (c) this.teal;
                cVar.add(i11, obj);
                this.red = -1;
                i5 = ((AbstractList) cVar).modCount;
                this.silver = i5;
                return;
            case 2:
                charlie();
                int i12 = this.purple + 1;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.teal;
                snapshotStateList.add(i12, obj);
                this.red = -1;
                this.purple++;
                this.silver = r.delta(snapshotStateList);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void alpha() {
        int i4;
        i4 = ((AbstractList) ((b) this.teal).teal).modCount;
        if (i4 == this.silver) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void bravo() {
        int i4;
        i4 = ((AbstractList) ((c) this.teal)).modCount;
        if (i4 == this.silver) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void charlie() {
        if (r.delta((SnapshotStateList) this.teal) == this.silver) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple < ((b) this.teal).red) {
                    return true;
                }
                return false;
            case 1:
                if (this.purple < ((c) this.teal).purple) {
                    return true;
                }
                return false;
            case 2:
                if (this.purple < ((SnapshotStateList) this.teal).size() - 1) {
                    return true;
                }
                return false;
            default:
                if (this.purple < this.silver) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.alpha) {
            case 0:
                if (this.purple > 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.purple > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.purple >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.purple > this.red) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                alpha();
                int i4 = this.purple;
                b bVar = (b) this.teal;
                if (i4 < bVar.red) {
                    this.purple = i4 + 1;
                    this.red = i4;
                    return bVar.alpha[bVar.purple + i4];
                }
                throw new NoSuchElementException();
            case 1:
                bravo();
                int i5 = this.purple;
                c cVar = (c) this.teal;
                if (i5 < cVar.purple) {
                    this.purple = i5 + 1;
                    this.red = i5;
                    return cVar.alpha[i5];
                }
                throw new NoSuchElementException();
            case 2:
                charlie();
                int i10 = this.purple + 1;
                this.red = i10;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.teal;
                r.alpha(i10, snapshotStateList.size());
                Object obj = snapshotStateList.get(i10);
                this.purple = i10;
                return obj;
            default:
                ah ahVar = ((C2561v) this.teal).alpha;
                int i11 = this.purple;
                this.purple = i11 + 1;
                Object bravo = ahVar.bravo(i11);
                Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (T.r) bravo;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            case 1:
                return this.purple;
            case 2:
                return this.purple + 1;
            default:
                return this.purple - this.red;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.alpha) {
            case 0:
                alpha();
                int i4 = this.purple;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.purple = i5;
                    this.red = i5;
                    b bVar = (b) this.teal;
                    return bVar.alpha[bVar.purple + i5];
                }
                throw new NoSuchElementException();
            case 1:
                bravo();
                int i10 = this.purple;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.purple = i11;
                    this.red = i11;
                    return ((c) this.teal).alpha[i11];
                }
                throw new NoSuchElementException();
            case 2:
                charlie();
                int i12 = this.purple;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.teal;
                r.alpha(i12, snapshotStateList.size());
                int i13 = this.purple;
                this.red = i13;
                this.purple--;
                return snapshotStateList.get(i13);
            default:
                ah ahVar = ((C2561v) this.teal).alpha;
                int i14 = this.purple - 1;
                this.purple = i14;
                Object bravo = ahVar.bravo(i14);
                Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (T.r) bravo;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.alpha) {
            case 0:
                return this.purple - 1;
            case 1:
                return this.purple - 1;
            case 2:
                return this.purple;
            default:
                return (this.purple - this.red) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                alpha();
                int i10 = this.red;
                if (i10 != -1) {
                    b bVar = (b) this.teal;
                    bVar.bravo(i10);
                    this.purple = this.red;
                    this.red = -1;
                    i4 = ((AbstractList) bVar).modCount;
                    this.silver = i4;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            case 1:
                bravo();
                int i11 = this.red;
                if (i11 != -1) {
                    c cVar = (c) this.teal;
                    cVar.bravo(i11);
                    this.purple = this.red;
                    this.red = -1;
                    i5 = ((AbstractList) cVar).modCount;
                    this.silver = i5;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            case 2:
                charlie();
                int i12 = this.red;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.teal;
                snapshotStateList.remove(i12);
                this.purple--;
                this.red = -1;
                this.silver = r.delta(snapshotStateList);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.alpha) {
            case 0:
                alpha();
                int i4 = this.red;
                if (i4 != -1) {
                    ((b) this.teal).set(i4, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            case 1:
                bravo();
                int i5 = this.red;
                if (i5 != -1) {
                    ((c) this.teal).set(i5, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            case 2:
                charlie();
                int i10 = this.red;
                if (i10 >= 0) {
                    SnapshotStateList snapshotStateList = (SnapshotStateList) this.teal;
                    snapshotStateList.set(i10, obj);
                    this.silver = r.delta(snapshotStateList);
                    return;
                }
                throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i4) {
        int i5;
        this.alpha = 1;
        this.teal = cVar;
        this.purple = i4;
        this.red = -1;
        i5 = ((AbstractList) cVar).modCount;
        this.silver = i5;
    }

    public a(SnapshotStateList snapshotStateList, int i4) {
        this.alpha = 2;
        this.teal = snapshotStateList;
        this.purple = i4 - 1;
        this.red = -1;
        this.silver = r.delta(snapshotStateList);
    }

    public a(C2561v c2561v, int i4, int i5, int i10) {
        this.alpha = 3;
        this.teal = c2561v;
        this.purple = i4;
        this.red = i5;
        this.silver = i10;
    }

    public a(b bVar, int i4) {
        int i5;
        this.alpha = 0;
        this.teal = bVar;
        this.purple = i4;
        this.red = -1;
        i5 = ((AbstractList) bVar).modCount;
        this.silver = i5;
    }
}
