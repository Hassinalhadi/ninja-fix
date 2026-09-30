package Z9;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import pe.AbstractC2327c;
import vf.ab;
import yf.N;
import yf.at;

/* loaded from: classes2.dex */
public final class a extends i implements l {
    public int alpha;
    public final /* synthetic */ at purple;
    public final /* synthetic */ c red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(at atVar, c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = atVar;
        this.red = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new a(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        Ba.e eVar = new Ba.e(8, this.red);
        this.alpha = 1;
        ((N) this.purple).collect(eVar, this);
        return aVar;
    }
}
