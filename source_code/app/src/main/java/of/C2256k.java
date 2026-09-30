package of;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: of.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2256k implements Iterator {
    public boolean alpha;
    public final int purple;
    public final /* synthetic */ C2257l red;

    public C2256k(C2257l c2257l) {
        int i4;
        this.red = c2257l;
        i4 = ((AbstractList) c2257l).modCount;
        this.purple = i4;
    }

    public final void alpha() {
        int i4;
        int i5;
        C2257l c2257l = this.red;
        i4 = ((AbstractList) c2257l).modCount;
        int i10 = this.purple;
        if (i4 == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ModCount: ");
        i5 = ((AbstractList) c2257l).modCount;
        sb2.append(i5);
        sb2.append("; expected: ");
        sb2.append(i10);
        throw new ConcurrentModificationException(sb2.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.alpha;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.alpha) {
            this.alpha = true;
            alpha();
            return this.red.purple;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        alpha();
        this.red.clear();
    }
}
