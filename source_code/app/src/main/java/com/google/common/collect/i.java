package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Objects;
import t6.AbstractC3013k;

/* loaded from: classes2.dex */
public final class i extends d {
    public final /* synthetic */ j red;

    public i(j jVar) {
        this.red = jVar;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        j jVar = this.red;
        AbstractC3013k.bravo(i4, jVar.white);
        int i5 = i4 * 2;
        Object[] objArr = jVar.teal;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red.white;
    }
}
