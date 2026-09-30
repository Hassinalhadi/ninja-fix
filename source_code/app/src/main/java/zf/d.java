package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.AbstractC3428A;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ InterfaceC3440j red;
    public final /* synthetic */ f silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC3440j interfaceC3440j, f fVar, Nd.c cVar) {
        super(2, cVar);
        this.red = interfaceC3440j;
        this.silver = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.red, this.silver, cVar);
        dVar.purple = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            xf.t golf = this.silver.golf((vf.ab) this.purple);
            this.alpha = 1;
            Object mike = AbstractC3428A.mike(this.red, golf, true, this);
            if (mike != obj2) {
                mike = Unit.INSTANCE;
            }
            if (mike == obj2) {
                return obj2;
            }
        }
        return Unit.INSTANCE;
    }
}
