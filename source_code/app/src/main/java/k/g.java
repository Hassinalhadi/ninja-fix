package k;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import qa.j;
import s0.L;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class g extends i implements l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ h purple;
    public final /* synthetic */ L red;
    public final /* synthetic */ j silver;
    public final /* synthetic */ Ac.l teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, L l10, j jVar, Ac.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
        this.red = l10;
        this.silver = jVar;
        this.teal = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        j jVar = this.silver;
        Ac.l lVar = this.teal;
        g gVar = new g(this.purple, this.red, jVar, lVar, cVar);
        gVar.alpha = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ab abVar = (ab) this.alpha;
        L l10 = this.red;
        j jVar = this.silver;
        h hVar = this.purple;
        ad.zulu(abVar, null, null, new C1993e(hVar, l10, jVar, null), 3);
        return ad.zulu(abVar, null, null, new f(hVar, this.teal, null), 3);
    }
}
