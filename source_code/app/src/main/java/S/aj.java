package S;

import Lb.am;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class aj extends c {
    public final c oscar;
    public final boolean papa;
    public final boolean quebec;
    public Function1 romeo;
    public Function1 sierra;
    public final long tango;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aj(c cVar, Function1 function1, Function1 function12, boolean z2, boolean z10) {
        super(0L, l.teal, n.lima(function1, (cVar == null || (r0 = cVar.echo()) == null) ? n.juliet.echo : r0, z2), n.bravo(function12, (cVar == null || (r9 = cVar.india()) == null) ? n.juliet.foxtrot : r9));
        Function1 india;
        Function1 echo;
        am amVar = n.alpha;
        this.oscar = cVar;
        this.papa = z2;
        this.quebec = z10;
        this.romeo = this.echo;
        this.sierra = this.foxtrot;
        this.tango = P.e.charlie();
    }

    @Override // S.c
    public final void beige(bv.am amVar) {
        u.charlie();
        throw null;
    }

    @Override // S.c
    public final c black(Function1 function1, Function1 function12) {
        Function1 lima = n.lima(function1, this.romeo, true);
        Function1 bravo = n.bravo(function12, this.sierra);
        if (!this.papa) {
            return new aj(blue().black(null, bravo), lima, bravo, false, true);
        }
        return blue().black(lima, bravo);
    }

    public final c blue() {
        c cVar = this.oscar;
        if (cVar == null) {
            return n.juliet;
        }
        return cVar;
    }

    @Override // S.c, S.g
    public final void charlie() {
        c cVar;
        this.charlie = true;
        if (this.quebec && (cVar = this.oscar) != null) {
            cVar.charlie();
        }
    }

    @Override // S.g
    public final l delta() {
        return blue().delta();
    }

    @Override // S.c, S.g
    public final Function1 echo() {
        return this.romeo;
    }

    @Override // S.c, S.g
    public final boolean foxtrot() {
        return blue().foxtrot();
    }

    @Override // S.g
    public final long golf() {
        return blue().golf();
    }

    @Override // S.c, S.g
    public final int hotel() {
        return blue().hotel();
    }

    @Override // S.c, S.g
    public final Function1 india() {
        return this.sierra;
    }

    @Override // S.c, S.g
    public final void kilo() {
        u.charlie();
        throw null;
    }

    @Override // S.c, S.g
    public final void lima() {
        u.charlie();
        throw null;
    }

    @Override // S.c, S.g
    public final void mike() {
        blue().mike();
    }

    @Override // S.c, S.g
    public final void november(ac acVar) {
        blue().november(acVar);
    }

    @Override // S.g
    public final void romeo(l lVar) {
        u.charlie();
        throw null;
    }

    @Override // S.g
    public final void sierra(long j5) {
        u.charlie();
        throw null;
    }

    @Override // S.c, S.g
    public final void tango(int i4) {
        blue().tango(i4);
    }

    @Override // S.c, S.g
    public final g uniform(Function1 function1) {
        Function1 lima = n.lima(function1, this.romeo, true);
        if (!this.papa) {
            return n.hotel(blue().uniform(null), lima, true);
        }
        return blue().uniform(lima);
    }

    @Override // S.c
    public final u whiskey() {
        return blue().whiskey();
    }

    @Override // S.c
    public final bv.am xray() {
        return blue().xray();
    }

    @Override // S.c
    /* renamed from: yankee */
    public final Function1 echo() {
        return this.romeo;
    }
}
