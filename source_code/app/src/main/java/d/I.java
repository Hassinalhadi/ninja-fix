package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class I extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C1548o0 purple;
    public final /* synthetic */ C red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C1548o0 c1548o0, C c3, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1548o0;
        this.red = c3;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new I(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            b.M m4 = b.M.purple;
            this.alpha = 1;
            if (this.purple.foxtrot(m4, this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
