package C1;

import kotlin.ResultKt;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class n extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ap purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new n(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (ap.echo(this.purple, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
