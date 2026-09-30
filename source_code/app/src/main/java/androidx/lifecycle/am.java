package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class am {
    public ab alpha;
    public aj bravo;

    public final void alpha(al alVar, aa aaVar) {
        ab alpha = aaVar.alpha();
        ab state1 = this.alpha;
        Intrinsics.echo(state1, "state1");
        if (alpha.compareTo(state1) < 0) {
            state1 = alpha;
        }
        this.alpha = state1;
        Intrinsics.checkNotNull(alVar);
        this.bravo.onStateChanged(alVar, aaVar);
        this.alpha = alpha;
    }
}
