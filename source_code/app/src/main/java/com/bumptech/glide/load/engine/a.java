package com.bumptech.glide.load.engine;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class a extends WeakReference {
    public final q alpha;
    public final boolean bravo;
    public w charlie;

    public a(q qVar, r rVar, ReferenceQueue referenceQueue) {
        super(rVar, referenceQueue);
        Y3.f.charlie(qVar, "Argument must not be null");
        this.alpha = qVar;
        boolean z2 = rVar.alpha;
        this.charlie = null;
        this.bravo = z2;
    }
}
