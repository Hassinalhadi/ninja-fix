package n;

import d.O0;
import kotlin.ResultKt;
import kotlin.Unit;
import y.C3344D;

/* loaded from: classes3.dex */
public final class ai extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ m0.u purple;
    public final /* synthetic */ C3344D red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(m0.u uVar, C3344D c3344d, Nd.c cVar) {
        super(2, cVar);
        this.purple = uVar;
        this.red = c3344d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ai(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C2149y c2149y = new C2149y(this.red, 1);
            this.alpha = 1;
            if (O0.delta(this.purple, c2149y, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
