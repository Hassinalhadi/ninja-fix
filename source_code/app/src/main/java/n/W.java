package n;

import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class W extends Pd.i implements Xd.m {
    public int alpha;
    public /* synthetic */ d.N purple;
    public /* synthetic */ long red;
    public final /* synthetic */ vf.ab silver;
    public final /* synthetic */ androidx.compose.runtime.ax teal;
    public final /* synthetic */ InterfaceC1673j white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(vf.ab abVar, androidx.compose.runtime.ax axVar, InterfaceC1673j interfaceC1673j, Nd.c cVar) {
        super(3, cVar);
        this.silver = abVar;
        this.teal = axVar;
        this.white = interfaceC1673j;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j5 = ((Z.b) obj2).alpha;
        W w4 = new W(this.silver, this.teal, this.white, (Nd.c) obj3);
        w4.purple = (d.N) obj;
        w4.red = j5;
        return w4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        vf.ab abVar = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            d.N n5 = this.purple;
            vf.ad.zulu(abVar, null, null, new U(this.teal, this.red, this.white, null), 3);
            this.alpha = 1;
            obj = n5.golf(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        vf.ad.zulu(abVar, null, null, new V(this.teal, ((Boolean) obj).booleanValue(), this.white, null), 3);
        return Unit.INSTANCE;
    }
}
