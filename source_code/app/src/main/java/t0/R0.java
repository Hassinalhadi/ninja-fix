package t0;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class R0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ T0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(T0 t02, Nd.c cVar) {
        super(2, cVar);
        this.purple = t02;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new R0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((R0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C2946x c2946x = this.purple.alpha;
            this.alpha = 1;
            Object alpha = c2946x.f13898m.alpha(this);
            if (alpha != aVar) {
                alpha = Unit.INSTANCE;
            }
            if (alpha == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
