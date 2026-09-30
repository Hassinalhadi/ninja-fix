package com.bumptech.glide.load.engine;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class n {
    public final U3.h alpha;
    public final Executor bravo;

    public n(U3.h hVar, Executor executor) {
        this.alpha = hVar;
        this.bravo = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.alpha.equals(((n) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
