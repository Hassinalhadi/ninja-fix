package com.google.mlkit.common.sdkinternal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o extends PhantomReference {
    public final Set alpha;
    public final K1.n bravo;

    public /* synthetic */ o(a aVar, ReferenceQueue referenceQueue, Set set, K1.n nVar) {
        super(aVar, referenceQueue);
        this.alpha = set;
        this.bravo = nVar;
    }
}
