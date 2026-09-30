package yf;

import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class H extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ zf.ad red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(zf.ad adVar, Nd.c cVar) {
        super(2, cVar);
        this.red = adVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        H h4 = new H(this.red, cVar);
        h4.purple = obj;
        return h4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((H) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        int i5 = 9;
        E.e eVar = new E.e(i5, new Object(), (InterfaceC3440j) this.purple);
        this.alpha = 1;
        this.red.collect(eVar, this);
        return aVar;
    }
}
