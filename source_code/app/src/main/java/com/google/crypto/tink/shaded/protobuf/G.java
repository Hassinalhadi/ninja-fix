package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class G implements Iterator {
    public Iterator alpha;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.alpha.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.alpha.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
