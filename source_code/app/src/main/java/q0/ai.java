package q0;

import java.util.List;

/* loaded from: classes3.dex */
public final class ai extends s0.ah {
    public final /* synthetic */ al bravo;
    public final /* synthetic */ Xd.l charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(al alVar, Xd.l lVar, String str) {
        super(str);
        this.bravo = alVar;
        this.charlie = lVar;
    }

    @Override // q0.ap
    public final aq delta(ar arVar, List list, long j5) {
        al alVar = this.bravo;
        Q0.n layoutDirection = arVar.getLayoutDirection();
        ag agVar = alVar.f13150a;
        agVar.alpha = layoutDirection;
        agVar.purple = arVar.alpha();
        agVar.red = arVar.indigo();
        boolean ivory = arVar.ivory();
        Xd.l lVar = this.charlie;
        if (!ivory && alVar.alpha.yellow != null) {
            alVar.teal = 0;
            aq aqVar = (aq) lVar.invoke(alVar.f13151b, new Q0.a(j5));
            return new ah(aqVar, alVar, alVar.teal, aqVar, 0);
        }
        alVar.silver = 0;
        aq aqVar2 = (aq) lVar.invoke(agVar, new Q0.a(j5));
        return new ah(aqVar2, alVar, alVar.silver, aqVar2, 1);
    }
}
