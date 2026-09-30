package n;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2125E extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2125E(m0.u uVar, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C2125E c2125e = new C2125E(this.purple, this.red, cVar);
        c2125e.alpha = obj;
        return c2125e;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2125E) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        vf.ab abVar = (vf.ab) this.alpha;
        vf.ac acVar = vf.ac.silver;
        m0.u uVar = this.purple;
        K k6 = this.red;
        vf.ad.zulu(abVar, null, acVar, new C2123C(uVar, k6, null), 1);
        return vf.ad.zulu(abVar, null, acVar, new C2124D(uVar, k6, null), 1);
    }
}
