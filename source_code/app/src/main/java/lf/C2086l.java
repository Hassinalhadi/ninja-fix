package lf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2086l implements Iterator, Yd.a {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
