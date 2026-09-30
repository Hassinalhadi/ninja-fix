package androidx.compose.material3.internal;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ F2.m red;
    public final /* synthetic */ t silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(F2.m mVar, Nd.c cVar, t tVar) {
        super(2, cVar);
        this.red = mVar;
        this.silver = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        l lVar = new l(this.red, cVar, this.silver);
        lVar.purple = obj;
        return lVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ad) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ad adVar = (ad) this.purple;
            q qVar = (q) this.silver.november;
            this.alpha = 1;
            if (this.red.invoke(qVar, adVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
