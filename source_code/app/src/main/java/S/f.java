package S;

import Lb.am;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class f extends g {
    public final Function1 echo;
    public int foxtrot;

    public f(long j5, l lVar, Function1 function1) {
        super(j5, lVar);
        this.echo = function1;
        this.foxtrot = 1;
    }

    @Override // S.g
    public final void charlie() {
        if (!this.charlie) {
            lima();
            this.charlie = true;
            synchronized (n.charlie) {
                oscar();
            }
        }
    }

    @Override // S.g
    public final Function1 echo() {
        return this.echo;
    }

    @Override // S.g
    public final boolean foxtrot() {
        return true;
    }

    @Override // S.g
    public final Function1 india() {
        return null;
    }

    @Override // S.g
    public final void kilo() {
        this.foxtrot++;
    }

    @Override // S.g
    public final void lima() {
        int i4 = this.foxtrot - 1;
        this.foxtrot = i4;
        if (i4 == 0) {
            alpha();
        }
    }

    @Override // S.g
    public final void mike() {
    }

    @Override // S.g
    public final void november(ac acVar) {
        am amVar = n.alpha;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // S.g
    public final g uniform(Function1 function1) {
        n.delta(this);
        return new e(this.bravo, this.alpha, n.lima(function1, this.echo, true), this);
    }
}
