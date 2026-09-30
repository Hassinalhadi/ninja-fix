package com.google.common.collect;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o extends f {
    public final transient Object silver;

    public o(Object obj) {
        this.silver = obj;
    }

    @Override // com.google.common.collect.a
    public final int alpha(Object[] objArr) {
        objArr[0] = this.silver;
        return 1;
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.silver.equals(obj);
    }

    @Override // com.google.common.collect.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.silver.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.silver);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Constants.AES_PREFIX + this.silver.toString() + ']';
    }
}
