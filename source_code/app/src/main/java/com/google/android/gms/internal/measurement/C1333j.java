package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1333j implements Iterator {
    public final /* synthetic */ Iterator alpha;

    public C1333j(Iterator it) {
        this.alpha = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.alpha.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new r((String) this.alpha.next());
    }
}
