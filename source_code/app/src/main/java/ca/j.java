package ca;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ n red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        j jVar = new j(this.red, cVar);
        jVar.purple = obj;
        return jVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ab abVar = (ab) this.purple;
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
            this.purple = abVar;
            this.alpha = 1;
            if (ad.november(15000L, this) == aVar) {
                return aVar;
            }
        }
        if (ad.xray(abVar)) {
            this.red.kilo();
        }
        return Unit.INSTANCE;
    }
}
