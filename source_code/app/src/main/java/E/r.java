package E;

import bz.C0778c;
import bz.f0;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class r extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ f0 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, f0 f0Var, Nd.c cVar) {
        super(2, cVar);
        this.purple = sVar;
        this.red = f0Var;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C0778c c0778c = (C0778c) this.purple.charlie;
            Float f5 = new Float(0.0f);
            this.alpha = 1;
            if (C0778c.charlie(c0778c, f5, this.red, null, this, 12) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
