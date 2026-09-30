package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class b implements Iterator, Yd.a {
    public int alpha;
    public Object purple;

    public abstract void alpha();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                return true;
            }
            if (i4 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        this.alpha = 3;
        alpha();
        if (this.alpha != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.alpha;
        if (i4 == 1) {
            this.alpha = 0;
            return this.purple;
        }
        if (i4 != 2) {
            this.alpha = 3;
            alpha();
            if (this.alpha == 1) {
                this.alpha = 0;
                return this.purple;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
