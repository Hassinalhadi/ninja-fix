package F;

import bz.C0797w;
import bz.InterfaceC0787l;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ae extends Pd.i implements Xd.m {
    public int alpha;
    public /* synthetic */ float purple;
    public final /* synthetic */ Q2 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(Q2 q22, Nd.c cVar) {
        super(3, cVar);
        this.red = q22;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        ae aeVar = new ae(this.red, (Nd.c) obj3);
        aeVar.purple = floatValue;
        return aeVar.invokeSuspend(Unit.INSTANCE);
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
            float f5 = this.purple;
            Q2 q22 = this.red;
            R2 state = q22.getState();
            C0797w lima = q22.lima();
            InterfaceC0787l papa = q22.papa();
            this.alpha = 1;
            if (ag.golf(state, f5, lima, papa, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
