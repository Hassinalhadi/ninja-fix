package n;

import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class U extends Pd.i implements Xd.l {
    public Object alpha;
    public int purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ InterfaceC1673j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(androidx.compose.runtime.ax axVar, long j5, InterfaceC1673j interfaceC1673j, Nd.c cVar) {
        super(2, cVar);
        this.red = axVar;
        this.silver = j5;
        this.teal = interfaceC1673j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new U(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (((f.C1674k) r2).alpha(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.runtime.ax axVar;
        C1676m c1676m;
        C1676m c1676m2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        InterfaceC1673j interfaceC1673j = this.teal;
        androidx.compose.runtime.ax axVar2 = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    c1676m2 = (C1676m) this.alpha;
                    ResultKt.alpha(obj);
                    c1676m = c1676m2;
                    axVar2.setValue(c1676m);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            axVar = (androidx.compose.runtime.ax) this.alpha;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            C1676m c1676m3 = (C1676m) axVar2.getValue();
            if (c1676m3 != null) {
                C1675l c1675l = new C1675l(c1676m3);
                if (interfaceC1673j != null) {
                    this.alpha = axVar2;
                    this.purple = 1;
                }
                axVar = axVar2;
            }
            c1676m = new C1676m(this.silver);
            if (interfaceC1673j != null) {
                this.alpha = c1676m;
                this.purple = 2;
                if (((C1674k) interfaceC1673j).alpha(c1676m, this) != aVar) {
                    c1676m2 = c1676m;
                    c1676m = c1676m2;
                }
                return aVar;
            }
            axVar2.setValue(c1676m);
            return Unit.INSTANCE;
        }
        axVar.setValue(null);
        c1676m = new C1676m(this.silver);
        if (interfaceC1673j != null) {
        }
        axVar2.setValue(c1676m);
        return Unit.INSTANCE;
    }
}
