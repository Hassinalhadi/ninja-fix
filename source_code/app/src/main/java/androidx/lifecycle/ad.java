package androidx.lifecycle;

import ae.C0428g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ad {
    public final ac alpha;
    public final C0644n bravo;
    public final C0428g charlie;

    public ad(ac acVar, C0644n dispatchQueue, vf.I i4) {
        ab abVar = ab.alpha;
        Intrinsics.echo(dispatchQueue, "dispatchQueue");
        this.alpha = acVar;
        this.bravo = dispatchQueue;
        C0428g c0428g = new C0428g(1, this, i4);
        this.charlie = c0428g;
        if (acVar.bravo() == ab.alpha) {
            i4.foxtrot(null);
            alpha();
        } else {
            acVar.alpha(c0428g);
        }
    }

    public final void alpha() {
        this.alpha.charlie(this.charlie);
        C0644n c0644n = this.bravo;
        c0644n.bravo = true;
        c0644n.alpha();
    }
}
