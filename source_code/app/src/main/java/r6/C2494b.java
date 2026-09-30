package r6;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import t6.AbstractC2998h;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2494b extends com.google.common.collect.p implements ListIterator {
    public final int purple;
    public int red;
    public final AbstractC2496d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2494b(AbstractC2496d abstractC2496d, int i4) {
        super(4);
        int size = abstractC2496d.size();
        AbstractC2998h.golf(i4, size);
        this.purple = size;
        this.red = i4;
        this.silver = abstractC2496d;
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
