package L;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class a implements ListIterator, Yd.a {
    public final /* synthetic */ int alpha;
    public int purple;
    public int red;

    public /* synthetic */ a(int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = i4;
        this.red = i5;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.purple < this.red) {
                    return true;
                }
                return false;
            default:
                if (this.purple < this.red) {
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
            default:
                if (this.purple > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                return this.purple;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.alpha) {
            case 0:
                return this.purple - 1;
            default:
                return this.purple - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
