package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag implements aj, vf.ab {
    public final ac alpha;
    public final Nd.h purple;

    public ag(ac acVar, Nd.h coroutineContext) {
        Intrinsics.echo(coroutineContext, "coroutineContext");
        this.alpha = acVar;
        this.purple = coroutineContext;
        if (acVar.bravo() == ab.alpha) {
            vf.ad.juliet(coroutineContext, null);
        }
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.purple;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        ac acVar = this.alpha;
        if (acVar.bravo().compareTo(ab.alpha) <= 0) {
            acVar.charlie(this);
            vf.ad.juliet(this.purple, null);
        }
    }
}
