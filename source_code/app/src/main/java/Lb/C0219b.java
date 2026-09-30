package Lb;

import kotlin.ResultKt;
import kotlin.Unit;
import z3.C3462a;

/* renamed from: Lb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0219b extends Pd.i implements Xd.l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;
    public final /* synthetic */ androidx.compose.runtime.ax silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219b(boolean z2, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, androidx.compose.runtime.ax axVar3, Nd.c cVar) {
        super(2, cVar);
        this.alpha = z2;
        this.purple = axVar;
        this.red = axVar2;
        this.silver = axVar3;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        androidx.compose.runtime.ax axVar = this.red;
        androidx.compose.runtime.ax axVar2 = this.silver;
        return new C0219b(this.alpha, this.purple, axVar, axVar2, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0219b) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        if (this.alpha) {
            C3462a.alpha("HomeV2", 12, "evt=TIMEOUT_CRITERIA_MET hasValidatedInternet=" + ((Boolean) this.purple.getValue()).booleanValue() + " consecutiveFailures=" + ((Number) this.red.getValue()).intValue() + " isDriverOnline=" + ((Boolean) this.silver.getValue()).booleanValue(), null);
        }
        return Unit.INSTANCE;
    }
}
