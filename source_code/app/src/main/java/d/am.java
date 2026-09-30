package d;

import a2.C0393r;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class am extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ah red;
    public final /* synthetic */ ap silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ah ahVar, ap apVar, Nd.c cVar) {
        super(2, cVar);
        this.red = ahVar;
        this.silver = apVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        am amVar = new am(this.red, this.silver, cVar);
        amVar.purple = obj;
        return amVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((am) create((androidx.compose.material3.internal.r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            C0393r c0393r = new C0393r(22, (androidx.compose.material3.internal.r) this.purple, this.silver);
            this.alpha = 1;
            if (this.red.invoke(c0393r, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
