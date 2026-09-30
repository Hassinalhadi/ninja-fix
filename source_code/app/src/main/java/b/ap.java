package b;

import f.C1674k;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ap extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC1673j purple;
    public final /* synthetic */ InterfaceC1672i red;
    public final /* synthetic */ vf.aq silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(InterfaceC1673j interfaceC1673j, InterfaceC1672i interfaceC1672i, vf.aq aqVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC1673j;
        this.red = interfaceC1672i;
        this.silver = aqVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ap(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ap) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            if (((C1674k) this.purple).alpha(this.red, this) == aVar) {
                return aVar;
            }
        }
        vf.aq aqVar = this.silver;
        if (aqVar != null) {
            aqVar.dispose();
        }
        return Unit.INSTANCE;
    }
}
