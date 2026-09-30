package N9;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import vf.ab;
import xf.EnumC3340a;
import yf.C3438h;
import yf.InterfaceC3439i;
import yf.ae;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = iVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            i iVar = this.purple;
            InterfaceC3439i[] interfaceC3439iArr = {iVar.alpha.foxtrot(), C3438h.purple};
            int i5 = ae.alpha;
            zf.p pVar = new zf.p(ArraysKt.romeo(interfaceC3439iArr), Nd.i.alpha, -2, EnumC3340a.alpha);
            Ba.e eVar = new Ba.e(6, iVar);
            this.alpha = 1;
            if (pVar.collect(eVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
