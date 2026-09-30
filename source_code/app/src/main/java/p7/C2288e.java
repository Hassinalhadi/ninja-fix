package p7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import s6.AbstractC2699k7;

/* renamed from: p7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2288e extends com.google.common.collect.p implements ListIterator {
    public final int purple;
    public int red;
    public final g silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2288e(g gVar, int i4) {
        super(2);
        int size = gVar.size();
        if (i4 >= 0 && i4 <= size) {
            this.purple = size;
            this.red = i4;
            this.silver = gVar;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2699k7.charlie(i4, size, "index"));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object alpha(int i4) {
        return this.silver.get(i4);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.red < this.purple) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.red > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i4 = this.red;
            this.red = i4 + 1;
            return alpha(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.red;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.red - 1;
            this.red = i4;
            return alpha(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.red - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
