package N2;

import androidx.compose.runtime.C0564b;
import kotlin.ResultKt;
import kotlin.Unit;
import xf.EnumC3340a;

/* loaded from: classes3.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ n purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            n nVar = this.purple;
            C1.t bronze = C0564b.bronze(new B2.q(15, nVar));
            i iVar = new i(nVar, null);
            int i5 = yf.ae.alpha;
            zf.n nVar2 = new zf.n(new cd.a(iVar, (Nd.c) null), bronze, Nd.i.alpha, -2, EnumC3340a.alpha);
            j jVar = new j(nVar);
            this.alpha = 1;
            if (nVar2.collect(jVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
