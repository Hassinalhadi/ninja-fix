package Wf;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3077x;

/* loaded from: classes2.dex */
public final class ag extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ad red;
    public final /* synthetic */ ArrayList silver;
    public final /* synthetic */ x teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ad adVar, ArrayList arrayList, x xVar, Nd.c cVar) {
        super(2, cVar);
        this.red = adVar;
        this.silver = arrayList;
        this.teal = xVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ag agVar = new ag(this.red, this.silver, this.teal, cVar);
        agVar.purple = obj;
        return agVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ag) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        r rVar = (r) this.purple;
        this.alpha = 1;
        Object alpha = AbstractC3077x.alpha(this.red, this.silver, this.teal, rVar, this);
        if (alpha == aVar) {
            return aVar;
        }
        return alpha;
    }
}
