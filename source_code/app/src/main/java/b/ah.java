package b;

import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ah extends Pd.i implements Xd.m {
    public int alpha;
    public /* synthetic */ d.N purple;
    public /* synthetic */ long red;
    public final /* synthetic */ ai silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ai aiVar, Nd.c cVar) {
        super(3, cVar);
        this.silver = aiVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5 = ((Z.b) obj2).alpha;
        ah ahVar = new ah(this.silver, (Nd.c) obj3);
        ahVar.purple = (d.N) obj;
        ahVar.red = j5;
        return ahVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            d.N n5 = this.purple;
            long j5 = this.red;
            ai aiVar = this.silver;
            if (aiVar.f3307a) {
                this.alpha = 1;
                InterfaceC1673j interfaceC1673j = aiVar.red;
                if (interfaceC1673j == null || (obj2 = vf.ad.mike(new C0690e(n5, j5, interfaceC1673j, aiVar, null), this)) != obj3) {
                    obj2 = Unit.INSTANCE;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
