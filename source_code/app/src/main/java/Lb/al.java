package Lb;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class al extends Pd.i implements Xd.l {
    public final /* synthetic */ aj alpha;
    public final /* synthetic */ au purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;
    public final /* synthetic */ androidx.compose.runtime.ax teal;
    public final /* synthetic */ androidx.compose.runtime.ax white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(aj ajVar, au auVar, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, androidx.compose.runtime.ax axVar3, androidx.compose.runtime.ax axVar4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = ajVar;
        this.purple = auVar;
        this.red = axVar;
        this.silver = axVar2;
        this.teal = axVar3;
        this.white = axVar4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new al(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((al) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return Unit.INSTANCE;
    }
}
