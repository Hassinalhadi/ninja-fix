package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class n extends q implements Iterable {
    public final ArrayList alpha = new ArrayList();

    @Override // com.google.gson.q
    public final int alpha() {
        return hotel().alpha();
    }

    @Override // com.google.gson.q
    public final String delta() {
        return hotel().delta();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof n) || !((n) obj).alpha.equals(this.alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final q hotel() {
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        throw new IllegalStateException(ao.ad.zulu(size, "Array must have size 1, but has size "));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }
}
