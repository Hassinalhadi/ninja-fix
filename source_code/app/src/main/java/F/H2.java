package F;

import bz.C0778c;
import bz.InterfaceC0787l;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class H2 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ L2 purple;
    public final /* synthetic */ float red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(L2 l22, float f5, Nd.c cVar) {
        super(2, cVar);
        this.purple = l22;
        this.red = f5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H2(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((H2) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0787l interfaceC0787l;
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
            L2 l22 = this.purple;
            C0778c c0778c = l22.teal;
            if (c0778c != null) {
                Float f5 = new Float(this.red);
                if (l22.red) {
                    interfaceC0787l = androidx.compose.material3.a.foxtrot;
                } else {
                    interfaceC0787l = androidx.compose.material3.a.golf;
                }
                InterfaceC0787l interfaceC0787l2 = interfaceC0787l;
                this.alpha = 1;
                obj = C0778c.charlie(c0778c, f5, interfaceC0787l2, null, this, 12);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
