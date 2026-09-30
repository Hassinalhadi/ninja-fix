package n;

import f.C1674k;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class f0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ay purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ay ayVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = ayVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f0(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        this.alpha = 1;
        ay ayVar = this.purple;
        ayVar.getClass();
        bv.ah ahVar = new bv.ah();
        yf.az azVar = ((C1674k) ayVar.alpha).alpha;
        E.e eVar = new E.e(7, ahVar, ayVar);
        azVar.getClass();
        yf.az.juliet(azVar, eVar, this);
        return aVar;
    }
}
