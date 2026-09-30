package androidx.compose.foundation.lazy.layout;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ap extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ aq purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(aq aqVar, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = aqVar;
        this.red = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ap(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ap) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            am amVar = this.purple.purple;
            this.alpha = 1;
            if (amVar.echo(this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
