package R1;

import Pd.i;
import Xd.l;
import androidx.compose.runtime.K;
import androidx.lifecycle.T;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.L;

/* loaded from: classes3.dex */
public final class d extends i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ac red;
    public final /* synthetic */ L silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ac acVar, L l10, Nd.c cVar) {
        super(2, cVar);
        ab abVar = ab.alpha;
        this.red = acVar;
        this.silver = l10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ab abVar = ab.alpha;
        d dVar = new d(this.red, this.silver, cVar);
        dVar.purple = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((K) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            c cVar = new c(this.silver, (K) this.purple, null);
            this.alpha = 1;
            ab abVar = ab.alpha;
            if (T.india(this.red, cVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
