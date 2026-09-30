package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1303d implements Iterator {
    public final /* synthetic */ Iterator alpha;
    public final /* synthetic */ Iterator purple;

    public C1303d(Iterator it, Iterator it2) {
        this.alpha = it;
        this.purple = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.alpha.hasNext()) {
            return true;
        }
        return this.purple.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.alpha;
        if (it.hasNext()) {
            return new r(((Integer) it.next()).toString());
        }
        Iterator it2 = this.purple;
        if (it2.hasNext()) {
            return new r((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
