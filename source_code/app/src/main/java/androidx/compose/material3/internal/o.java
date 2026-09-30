package androidx.compose.material3.internal;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ c red;
    public final /* synthetic */ t silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, t tVar, Nd.c cVar2) {
        super(2, cVar2);
        this.red = cVar;
        this.silver = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        o oVar = new o(this.red, this.silver, cVar);
        oVar.purple = obj;
        return oVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((Pair) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Pair pair = (Pair) this.purple;
            ad adVar = (ad) pair.first;
            q qVar = (q) this.silver.november;
            this.alpha = 1;
            if (this.red.invoke(qVar, adVar, pair.second, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
