package zf;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ f red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Nd.c cVar) {
        super(2, cVar);
        this.red = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.red, cVar);
        eVar.purple = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((xf.r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            xf.r rVar = (xf.r) this.purple;
            this.alpha = 1;
            if (this.red.delta(rVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
