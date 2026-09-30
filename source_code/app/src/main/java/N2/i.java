package N2;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.t0;
import f0.AbstractC1680b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q0.C2391j;
import q0.InterfaceC2392k;
import vf.ao;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ n red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.red, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((X2.h) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        Y2.g gVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AbstractC1680b abstractC1680b = null;
        if (i4 != 0) {
            if (i4 == 1) {
                nVar = (n) this.purple;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            X2.h hVar = (X2.h) this.purple;
            n nVar2 = this.red;
            M2.f fVar = (M2.f) ((t0) nVar2.f1866i).getValue();
            X2.g alpha = X2.h.alpha(hVar);
            alpha.delta = new Aa.m(28, nVar2);
            alpha.oscar = null;
            alpha.papa = null;
            alpha.quebec = null;
            X2.c cVar = hVar.yankee;
            if (cVar.alpha == null) {
                alpha.mike = new D8.c(28, nVar2);
                alpha.oscar = null;
                alpha.papa = null;
                alpha.quebec = null;
            }
            if (cVar.bravo == null) {
                InterfaceC2392k interfaceC2392k = nVar2.f1862d;
                Y2.e eVar = af.bravo;
                if (!Intrinsics.areEqual(interfaceC2392k, C2391j.bravo) && !Intrinsics.areEqual(interfaceC2392k, C2391j.delta)) {
                    gVar = Y2.g.alpha;
                } else {
                    gVar = Y2.g.purple;
                }
                alpha.november = gVar;
            }
            if (cVar.delta != Y2.d.alpha) {
                alpha.echo = Y2.d.purple;
            }
            X2.h alpha2 = alpha.alpha();
            this.purple = nVar2;
            this.alpha = 1;
            M2.k kVar = (M2.k) fVar;
            kVar.getClass();
            Cf.e eVar2 = ao.alpha;
            obj = vf.ad.blue(Af.n.alpha.teal, new M2.g(kVar, alpha2, null), this);
            if (obj == aVar) {
                return aVar;
            }
            nVar = nVar2;
        }
        X2.i iVar = (X2.i) obj;
        nVar.getClass();
        if (iVar instanceof X2.m) {
            X2.m mVar = (X2.m) iVar;
            return new g(nVar.charlie(mVar.alpha), mVar);
        }
        if (iVar instanceof X2.d) {
            X2.d dVar = (X2.d) iVar;
            Drawable drawable = dVar.alpha;
            if (drawable != null) {
                abstractC1680b = nVar.charlie(drawable);
            }
            return new e(abstractC1680b, dVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
