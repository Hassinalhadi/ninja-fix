package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1545n extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C1551q red;
    public final /* synthetic */ Xd.l silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1545n(C1551q c1551q, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = c1551q;
        this.silver = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1545n c1545n = new C1545n(this.red, this.silver, cVar);
        c1545n.purple = obj;
        return c1545n;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1545n) create((O) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C1551q c1551q = this.red;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                O o5 = (O) this.purple;
                ((androidx.compose.runtime.t0) c1551q.delta).setValue(Boolean.TRUE);
                Xd.l lVar = this.silver;
                this.alpha = 1;
                if (lVar.invoke(o5, this) == aVar) {
                    return aVar;
                }
            }
            ((androidx.compose.runtime.t0) c1551q.delta).setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ((androidx.compose.runtime.t0) c1551q.delta).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
