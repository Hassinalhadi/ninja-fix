package Kb;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.aq;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ h purple;
    public final /* synthetic */ m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, m mVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
        this.red = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Pd.i, o3.f] */
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
            h hVar = this.purple;
            o3.g gVar = hVar.f1698v;
            if (gVar != null) {
                InterfaceC3439i lima = AbstractC3428A.lima(AbstractC3428A.lima(new aq(AbstractC3428A.india(new o3.c(gVar, null)), AbstractC3428A.india(new o3.e(gVar, null)), new Pd.i(3, null))));
                E.e eVar = new E.e(5, hVar, this.red);
                this.alpha = 1;
                if (lima.collect(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.lima("locationHealthChecker");
                throw null;
            }
        }
        return Unit.INSTANCE;
    }
}
