package zf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class m extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ n red;
    public final /* synthetic */ InterfaceC3440j silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        super(2, cVar);
        this.red = nVar;
        this.silver = interfaceC3440j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        m mVar = new m(this.red, this.silver, cVar);
        mVar.purple = obj;
        return mVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            vf.ab abVar = (vf.ab) this.purple;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            n nVar = this.red;
            InterfaceC3439i interfaceC3439i = nVar.silver;
            l lVar = new l(objectRef, abVar, nVar, this.silver);
            this.alpha = 1;
            if (interfaceC3439i.collect(lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
