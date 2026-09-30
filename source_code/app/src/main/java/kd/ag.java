package kd;

import io.ktor.utils.io.ar;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ag extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ vd.a red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(vd.a aVar, Nd.c cVar) {
        super(2, cVar);
        this.red = aVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ag agVar = new ag(this.red, cVar);
        agVar.purple = obj;
        return agVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ag) create((ar) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            io.ktor.utils.io.ag agVar = ((ar) this.purple).alpha;
            this.alpha = 1;
            if (this.red.echo(agVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
