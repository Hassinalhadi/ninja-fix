package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class x implements Iterator, Yd.a {
    public abstract int alpha();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(alpha());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
