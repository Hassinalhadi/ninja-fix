package of;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: of.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2255j implements Iterator {
    public static final C2255j alpha = new Object();

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
        throw new IllegalStateException();
    }
}
