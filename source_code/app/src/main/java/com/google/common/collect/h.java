package com.google.common.collect;

import java.util.Objects;
import t6.AbstractC3013k;

/* loaded from: classes2.dex */
public final class h extends d {
    public static final h teal = new h(0, new Object[0]);
    public final transient Object[] red;
    public final transient int silver;

    public h(int i4, Object[] objArr) {
        this.red = objArr;
        this.silver = i4;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.a
    public final int alpha(Object[] objArr) {
        Object[] objArr2 = this.red;
        int i4 = this.silver;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.common.collect.a
    public final Object[] bravo() {
        return this.red;
    }

    @Override // com.google.common.collect.a
    public final int delta() {
        return this.silver;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC3013k.bravo(i4, this.silver);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.a
    public final int hotel() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.silver;
    }
}
