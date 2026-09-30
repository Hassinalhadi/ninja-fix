package Pa;

import Xd.l;
import androidx.compose.runtime.ax;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z2, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = z2;
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (!this.alpha) {
            ax axVar = this.purple;
            if (a.bravo(axVar) > 0.0f) {
                axVar.setValue(Float.valueOf(0.0f));
            }
        }
        return Unit.INSTANCE;
    }
}
