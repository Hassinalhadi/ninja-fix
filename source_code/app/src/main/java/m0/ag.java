package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ag extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ah purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ah ahVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = ahVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ag(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ag) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            ah ahVar = this.purple;
            ahVar.getClass();
            PointerInputEventHandler pointerInputEventHandler = ahVar.red;
            this.alpha = 2;
            if (pointerInputEventHandler.invoke(ahVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
