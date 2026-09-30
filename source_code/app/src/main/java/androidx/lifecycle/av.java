package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class av extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ aw purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(aw awVar, Object obj, Nd.c cVar) {
        super(2, cVar);
        this.purple = awVar;
        this.red = obj;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new av(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((av) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        aw awVar = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            C0639i c0639i = awVar.alpha;
            this.alpha = 1;
            if (c0639i.charlie(this) == aVar) {
                return aVar;
            }
        }
        awVar.alpha.setValue(this.red);
        return Unit.INSTANCE;
    }
}
