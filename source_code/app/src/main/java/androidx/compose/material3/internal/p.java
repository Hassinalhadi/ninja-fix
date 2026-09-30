package androidx.compose.material3.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class p extends Pd.i implements Function1 {
    public int alpha;
    public final /* synthetic */ t purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ c silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, Object obj, c cVar, Nd.c cVar2) {
        super(1, cVar2);
        this.purple = tVar;
        this.red = obj;
        this.silver = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new p(this.purple, this.red, this.silver, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
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
            Object obj2 = this.red;
            t tVar = this.purple;
            tVar.india(obj2);
            k kVar = new k(tVar, 1);
            o oVar = new o(this.silver, tVar, null);
            this.alpha = 1;
            if (i.bravo(kVar, oVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
