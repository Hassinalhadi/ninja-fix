package n;

import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class V extends Pd.i implements Xd.l {
    public androidx.compose.runtime.ax alpha;
    public int purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ InterfaceC1673j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(androidx.compose.runtime.ax axVar, boolean z2, InterfaceC1673j interfaceC1673j, Nd.c cVar) {
        super(2, cVar);
        this.red = axVar;
        this.silver = z2;
        this.teal = interfaceC1673j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new V(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        androidx.compose.runtime.ax axVar;
        InterfaceC1672i c1675l;
        androidx.compose.runtime.ax axVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                axVar2 = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            axVar = this.red;
            C1676m c1676m = (C1676m) axVar.getValue();
            if (c1676m != null) {
                if (this.silver) {
                    c1675l = new C1677n(c1676m);
                } else {
                    c1675l = new C1675l(c1676m);
                }
                InterfaceC1673j interfaceC1673j = this.teal;
                if (interfaceC1673j != null) {
                    this.alpha = axVar;
                    this.purple = 1;
                    if (((C1674k) interfaceC1673j).alpha(c1675l, this) == aVar) {
                        return aVar;
                    }
                    axVar2 = axVar;
                }
                axVar.setValue(null);
            }
            return Unit.INSTANCE;
        }
        axVar = axVar2;
        axVar.setValue(null);
        return Unit.INSTANCE;
    }
}
