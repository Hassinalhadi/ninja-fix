package k;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC2972b3;
import vf.ab;

/* loaded from: classes3.dex */
public final class f extends i implements l {
    public int alpha;
    public final /* synthetic */ h purple;
    public final /* synthetic */ Ac.l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Ac.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = hVar;
        this.red = lVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (AbstractC2972b3.alpha(this.purple, this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
