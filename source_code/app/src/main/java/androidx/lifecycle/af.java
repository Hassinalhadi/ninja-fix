package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class af extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ ag purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ag agVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = agVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        af afVar = new af(this.purple, cVar);
        afVar.alpha = obj;
        return afVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((af) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        vf.ab abVar = (vf.ab) this.alpha;
        ag agVar = this.purple;
        ac acVar = agVar.alpha;
        if (acVar.bravo().compareTo(ab.purple) >= 0) {
            acVar.alpha(agVar);
        } else {
            vf.ad.juliet(abVar.charlie(), null);
        }
        return Unit.INSTANCE;
    }
}
