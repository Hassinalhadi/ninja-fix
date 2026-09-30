package F;

import bz.C0778c;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class O0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0778c purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C0778c c0778c, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0778c;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new O0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Float f5 = new Float(0.0f);
            this.alpha = 1;
            if (C0778c.charlie(this.purple, f5, null, null, this, 14) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
