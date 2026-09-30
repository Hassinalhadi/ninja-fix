package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;

/* loaded from: classes3.dex */
public final class Q implements aj, AutoCloseable {
    public final String alpha;
    public final P purple;
    public boolean red;

    public Q(String str, P p4) {
        this.alpha = str;
        this.purple = p4;
    }

    public final void charlie(ac lifecycle, C2194d registry) {
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(lifecycle, "lifecycle");
        if (!this.red) {
            this.red = true;
            lifecycle.alpha(this);
            registry.charlie(this.alpha, (S1.a) this.purple.bravo.teal);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        if (aaVar == aa.ON_DESTROY) {
            this.red = false;
            alVar.getLifecycle().charlie(this);
        }
    }
}
