package androidx.compose.material3.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class m extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ t purple;
    public final /* synthetic */ F2.m red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(F2.m mVar, Nd.c cVar, t tVar) {
        super(1, cVar);
        this.purple = tVar;
        this.red = mVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new m(this.red, cVar, this.purple);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
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
            t tVar = this.purple;
            k kVar = new k(tVar, 0);
            l lVar = new l(this.red, null, tVar);
            this.alpha = 1;
            if (i.bravo(kVar, lVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
