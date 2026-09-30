package C1;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class p extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ B purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(B b2, Nd.c cVar) {
        super(2, cVar);
        this.purple = b2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        p pVar = new p(this.purple, cVar);
        pVar.alpha = obj;
        return pVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((B) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        B b2 = (B) this.alpha;
        if ((b2 instanceof C0080b) && b2.alpha <= this.purple.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
