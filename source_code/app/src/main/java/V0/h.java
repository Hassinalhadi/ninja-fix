package V0;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h {
    public Object alpha;
    public k bravo;
    public m charlie;
    public boolean delta;

    public final void alpha(Runnable runnable, Executor executor) {
        m mVar = this.charlie;
        if (mVar != null) {
            mVar.foxtrot(runnable, executor);
        }
    }

    public final boolean bravo(Object obj) {
        boolean z2 = true;
        this.delta = true;
        k kVar = this.bravo;
        if (kVar == null || !kVar.purple.juliet(obj)) {
            z2 = false;
        }
        if (z2) {
            this.alpha = null;
            this.bravo = null;
            this.charlie = null;
        }
        return z2;
    }

    public final void charlie() {
        this.delta = true;
        k kVar = this.bravo;
        if (kVar != null && kVar.purple.cancel(true)) {
            this.alpha = null;
            this.bravo = null;
            this.charlie = null;
        }
    }

    public final boolean delta(Throwable th) {
        boolean z2 = true;
        this.delta = true;
        k kVar = this.bravo;
        if (kVar == null || !kVar.purple.kilo(th)) {
            z2 = false;
        }
        if (z2) {
            this.alpha = null;
            this.bravo = null;
            this.charlie = null;
        }
        return z2;
    }

    public final void finalize() {
        m mVar;
        k kVar = this.bravo;
        if (kVar != null) {
            j jVar = kVar.purple;
            if (!jVar.isDone()) {
                jVar.kilo(new Dd.c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.alpha, 2));
            }
        }
        if (!this.delta && (mVar = this.charlie) != null) {
            mVar.juliet(null);
        }
    }
}
