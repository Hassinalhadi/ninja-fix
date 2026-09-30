package Lb;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class Y extends Pd.i implements Xd.l {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Function0 function0, androidx.compose.runtime.ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = function0;
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new Y(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        int i4 = Z.alpha;
        if (((C2492a) this.purple.getValue()).alpha == 1) {
            this.alpha.invoke();
        }
        return Unit.INSTANCE;
    }
}
