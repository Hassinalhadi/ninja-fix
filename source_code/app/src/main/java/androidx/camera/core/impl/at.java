package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class at implements androidx.lifecycle.A {
    public final AtomicBoolean alpha = new AtomicBoolean(true);
    public final bp.c purple;
    public final Executor red;

    public at(Executor executor, bp.c cVar) {
        this.red = executor;
        this.purple = cVar;
    }

    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        this.red.execute(new A8.g(29, this, (au) obj));
    }
}
