package bx;

import bz.C0778c;
import bz.C0785j;
import bz.EnumC0784i;
import bz.InterfaceC0787l;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class H extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ G purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ J silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(G g2, long j5, J j6, Nd.c cVar) {
        super(2, cVar);
        this.purple = g2;
        this.red = j5;
        this.silver = j6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        G g2 = this.purple;
        J j5 = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C0778c c0778c = g2.alpha;
            Q0.m mVar = new Q0.m(this.red);
            InterfaceC0787l interfaceC0787l = j5.purple;
            this.alpha = 1;
            obj = C0778c.charlie(c0778c, mVar, interfaceC0787l, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((C0785j) obj).bravo == EnumC0784i.purple) {
            j5.getClass();
        }
        return Unit.INSTANCE;
    }
}
