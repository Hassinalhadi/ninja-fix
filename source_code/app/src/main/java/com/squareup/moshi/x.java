package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x implements Iterator, Cloneable {
    public final JsonReader.Token alpha;
    public final Object[] purple;
    public int red;

    public x(JsonReader.Token token, Object[] objArr, int i4) {
        this.alpha = token;
        this.purple = objArr;
        this.red = i4;
    }

    public final Object clone() {
        return new x(this.alpha, this.purple, this.red);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.red < this.purple.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.red;
        this.red = i4 + 1;
        return this.purple[i4];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
