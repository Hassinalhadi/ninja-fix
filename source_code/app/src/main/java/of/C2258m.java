package of;

import java.util.Iterator;
import java.util.NoSuchElementException;
import lf.r;

/* renamed from: of.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2258m implements Iterator, Yd.a {
    public final /* synthetic */ int alpha;
    public boolean purple = true;
    public final Object red;

    public /* synthetic */ C2258m(int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            case 1:
                return this.purple;
            default:
                return this.purple;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                if (this.purple) {
                    this.purple = false;
                    return this.red;
                }
                throw new NoSuchElementException();
            case 1:
                if (this.purple) {
                    this.purple = false;
                    return this.red;
                }
                throw new NoSuchElementException();
            default:
                if (this.purple) {
                    this.purple = false;
                    return ((r) this.red).alpha;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
