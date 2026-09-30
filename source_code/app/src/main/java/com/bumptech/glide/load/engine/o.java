package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o implements Iterable {
    public final ArrayList alpha;

    public o(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.alpha.iterator();
    }
}
