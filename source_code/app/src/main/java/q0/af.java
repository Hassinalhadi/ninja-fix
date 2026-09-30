package q0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import s0.C2562w;
import s0.C2563x;

/* loaded from: classes3.dex */
public final class af implements aq {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ Map charlie;
    public final /* synthetic */ B2.ap delta;
    public final /* synthetic */ ag echo;
    public final /* synthetic */ al foxtrot;
    public final /* synthetic */ Function1 golf;

    public af(int i4, int i5, Map map, B2.ap apVar, ag agVar, al alVar, Function1 function1) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = map;
        this.delta = apVar;
        this.echo = agVar;
        this.foxtrot = alVar;
        this.golf = function1;
    }

    @Override // q0.aq
    public final int alpha() {
        return this.bravo;
    }

    @Override // q0.aq
    public final int bravo() {
        return this.alpha;
    }

    @Override // q0.aq
    public final Map charlie() {
        return this.charlie;
    }

    @Override // q0.aq
    public final void delta() {
        C2562w c2562w;
        boolean ivory = this.echo.ivory();
        Function1 function1 = this.golf;
        al alVar = this.foxtrot;
        if (ivory && (c2562w = ((C2563x) alVar.alpha.f13305x.echo).f13352L) != null) {
            function1.invoke(c2562w.e);
        } else {
            function1.invoke(((C2563x) alVar.alpha.f13305x.echo).e);
        }
    }

    @Override // q0.aq
    public final Function1 echo() {
        return this.delta;
    }
}
