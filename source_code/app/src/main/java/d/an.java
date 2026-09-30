package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class an extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ap red;
    public final /* synthetic */ long silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ap apVar, long j5, Nd.c cVar) {
        super(2, cVar);
        this.red = apVar;
        this.silver = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        an anVar = new an(this.red, this.silver, cVar);
        anVar.purple = obj;
        return anVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((an) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            ak akVar = this.red.f11988h;
            this.alpha = 1;
            akVar.getClass();
            if (new ak(3, 0, this).invokeSuspend(Unit.INSTANCE) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
