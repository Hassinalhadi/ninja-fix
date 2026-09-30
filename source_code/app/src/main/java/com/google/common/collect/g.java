package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class g extends p {
    public boolean purple;
    public final /* synthetic */ Object red;

    public g(Object obj) {
        super(0);
        this.red = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.purple;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.purple) {
            this.purple = true;
            return this.red;
        }
        throw new NoSuchElementException();
    }
}
