package E;

import f.C1674k;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.az;

/* loaded from: classes3.dex */
public final class m extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ b red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, Nd.c cVar) {
        super(2, cVar);
        this.red = bVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        m mVar = new m(this.red, cVar);
        mVar.purple = obj;
        return mVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        ab abVar = (ab) this.purple;
        b bVar = this.red;
        az azVar = ((C1674k) bVar.alpha).alpha;
        e eVar = new e(1, bVar, abVar);
        this.alpha = 1;
        azVar.getClass();
        az.juliet(azVar, eVar, this);
        return aVar;
    }
}
