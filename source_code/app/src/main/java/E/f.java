package E;

import f.C1674k;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.az;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ InterfaceC1673j red;
    public final /* synthetic */ a silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC1673j interfaceC1673j, a aVar, Nd.c cVar) {
        super(2, cVar);
        this.red = interfaceC1673j;
        this.silver = aVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = new f(this.red, this.silver, cVar);
        fVar.purple = obj;
        return fVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
        az azVar = ((C1674k) this.red).alpha;
        e eVar = new e(0, this.silver, abVar);
        this.alpha = 1;
        azVar.getClass();
        az.juliet(azVar, eVar, this);
        return aVar;
    }
}
