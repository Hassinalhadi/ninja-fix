package S;

import Lb.am;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ak extends g {
    public final g echo;
    public final boolean foxtrot;
    public final boolean golf;
    public Function1 hotel;
    public final long india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(g gVar, Function1 function1, boolean z2, boolean z10) {
        super(0L, l.teal);
        Function1 echo;
        am amVar = n.alpha;
        this.echo = gVar;
        this.foxtrot = z2;
        this.golf = z10;
        this.hotel = n.lima(function1, (gVar == null || (echo = gVar.echo()) == null) ? n.juliet.echo : echo, z2);
        this.india = P.e.charlie();
    }

    @Override // S.g
    public final void charlie() {
        g gVar;
        this.charlie = true;
        if (this.golf && (gVar = this.echo) != null) {
            gVar.charlie();
        }
    }

    @Override // S.g
    public final l delta() {
        return victor().delta();
    }

    @Override // S.g
    public final Function1 echo() {
        return this.hotel;
    }

    @Override // S.g
    public final boolean foxtrot() {
        return victor().foxtrot();
    }

    @Override // S.g
    public final long golf() {
        return victor().golf();
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
        victor().mike();
    }

    @Override // S.g
    public final void november(ac acVar) {
        victor().november(acVar);
    }

    @Override // S.g
    public final g uniform(Function1 function1) {
        Function1 lima = n.lima(function1, this.hotel, true);
        if (!this.foxtrot) {
            return n.hotel(victor().uniform(null), lima, true);
        }
        return victor().uniform(lima);
    }

    public final g victor() {
        g gVar = this.echo;
        if (gVar == null) {
            return n.juliet;
        }
        return gVar;
    }
}
