package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class H extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Xd.l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.red = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        H h4 = new H(this.red, cVar);
        h4.purple = obj;
        return h4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            vf.ab abVar = (vf.ab) this.purple;
            this.alpha = 1;
            if (this.red.invoke(abVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
