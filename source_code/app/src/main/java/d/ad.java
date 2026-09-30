package d;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2683j0;

/* loaded from: classes3.dex */
public final class ad extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ m0.u red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ac f11980s;
    public final /* synthetic */ aj silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ac.n f11981t;
    public final /* synthetic */ Ec.af teal;
    public final /* synthetic */ Cb.ac white;
    public final /* synthetic */ ac yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(m0.u uVar, aj ajVar, Ec.af afVar, Cb.ac acVar, ac acVar2, ac acVar3, Ac.n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = uVar;
        this.silver = ajVar;
        this.teal = afVar;
        this.white = acVar;
        this.yellow = acVar2;
        this.f11980s = acVar3;
        this.f11981t = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ac acVar = this.f11980s;
        Ac.n nVar = this.f11981t;
        ad adVar = new ad(this.red, this.silver, this.teal, this.white, this.yellow, acVar, nVar, cVar);
        adVar.purple = obj;
        return adVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ad) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [vf.ab, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.t, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        ?? r12 = this.alpha;
        aj ajVar = this.silver;
        try {
            if (r12 != 0) {
                if (r12 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                vf.ab abVar = (vf.ab) this.purple;
                m0.u uVar = this.red;
                K k6 = ajVar.red;
                Ec.af afVar = this.teal;
                Cb.ac acVar = this.white;
                ac acVar2 = this.yellow;
                ac acVar3 = this.f11980s;
                Ac.n nVar = this.f11981t;
                this.purple = abVar;
                this.alpha = 1;
                float f5 = ab.alpha;
                Object bravo = AbstractC2683j0.bravo(uVar, new C1562z(acVar3, new Object(), k6, afVar, nVar, acVar2, acVar, null), this);
                if (bravo != obj2) {
                    bravo = Unit.INSTANCE;
                }
                if (bravo == obj2) {
                    return obj2;
                }
            }
        } catch (CancellationException e) {
            xf.e eVar = ajVar.yellow;
            if (eVar != null) {
                eVar.mike(r.alpha);
            }
            if (!vf.ad.xray(r12)) {
                throw e;
            }
        }
        return Unit.INSTANCE;
    }
}
