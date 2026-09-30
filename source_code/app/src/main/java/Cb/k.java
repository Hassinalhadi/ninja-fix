package Cb;

import androidx.compose.runtime.ax;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ax axVar, ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.purple = axVar;
        this.red = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new k(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            if (vf.ad.november(300L, this) == aVar) {
                return aVar;
            }
        }
        this.red.setValue((String) this.purple.getValue());
        return Unit.INSTANCE;
    }
}
