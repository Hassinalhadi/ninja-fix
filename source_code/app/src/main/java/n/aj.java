package n;

import kotlin.ResultKt;
import kotlin.Unit;
import y.C3344D;

/* loaded from: classes3.dex */
public final class aj extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ K red;
    public final /* synthetic */ C3344D silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(m0.u uVar, K k6, C3344D c3344d, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = k6;
        this.silver = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        aj ajVar = new aj(this.purple, this.red, this.silver, cVar);
        ajVar.alpha = obj;
        return ajVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        vf.ab abVar = (vf.ab) this.alpha;
        vf.ac acVar = vf.ac.silver;
        m0.u uVar = this.purple;
        vf.ad.zulu(abVar, null, acVar, new ah(uVar, this.red, null), 1);
        vf.ad.zulu(abVar, null, acVar, new ai(uVar, this.silver, null), 1);
        return Unit.INSTANCE;
    }
}
