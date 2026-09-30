package kd;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class t extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ vd.e purple;
    public final /* synthetic */ io.ktor.utils.io.m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vd.e eVar, io.ktor.utils.io.m mVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = eVar;
        this.red = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new t(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        io.ktor.utils.io.m mVar = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vd.a aVar2 = (vd.a) this.purple;
            this.alpha = 1;
            if (aVar2.echo(mVar, this) == aVar) {
                return aVar;
            }
        }
        mVar.alpha();
        return Unit.INSTANCE;
    }
}
