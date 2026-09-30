package S;

import Lb.am;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class e extends g {
    public final Function1 echo;
    public final g foxtrot;

    public e(long j5, l lVar, Function1 function1, g gVar) {
        super(j5, lVar);
        this.echo = function1;
        this.foxtrot = gVar;
        gVar.kilo();
    }

    @Override // S.g
    public final void charlie() {
        if (!this.charlie) {
            long j5 = this.bravo;
            g gVar = this.foxtrot;
            if (j5 != gVar.golf()) {
                alpha();
            }
            gVar.lima();
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
        u.charlie();
        throw null;
    }

    @Override // S.g
    public final void lima() {
        u.charlie();
        throw null;
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
        return new e(this.bravo, this.alpha, n.lima(function1, this.echo, true), this.foxtrot);
    }
}
