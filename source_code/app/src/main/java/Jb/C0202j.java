package Jb;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: Jb.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0202j extends Pd.i implements Xd.l {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;
    public final /* synthetic */ androidx.compose.runtime.ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202j(Function0 function0, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.alpha = function0;
        this.purple = axVar;
        this.red = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0202j(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0202j) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        androidx.compose.runtime.ax axVar = this.purple;
        boolean booleanValue = ((Boolean) axVar.getValue()).booleanValue();
        androidx.compose.runtime.ax axVar2 = this.red;
        if (!booleanValue && ((Boolean) axVar2.getValue()).booleanValue()) {
            this.alpha.invoke();
        }
        Boolean bool = (Boolean) axVar2.getValue();
        bool.booleanValue();
        axVar.setValue(bool);
        return Unit.INSTANCE;
    }
}
