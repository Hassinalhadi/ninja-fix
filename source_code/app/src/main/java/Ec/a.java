package Ec;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ a(int i4, androidx.compose.runtime.ax axVar, Function1 function1) {
        this.alpha = i4;
        this.purple = axVar;
        this.red = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                String reason = (String) obj;
                Intrinsics.echo(reason, "reason");
                this.purple.setValue(Boolean.FALSE);
                this.red.invoke(reason);
                return Unit.INSTANCE;
            case 1:
                D0.ak akVar = (D0.ak) obj;
                this.purple.setValue(akVar);
                this.red.invoke(akVar);
                return Unit.INSTANCE;
            default:
                Z.b bVar = (Z.b) obj;
                D0.ak akVar2 = (D0.ak) this.purple.getValue();
                if (akVar2 != null) {
                    this.red.invoke(Integer.valueOf(akVar2.bravo.golf(bVar.alpha)));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Function1 function1, androidx.compose.runtime.ax axVar) {
        this.alpha = 0;
        this.red = function1;
        this.purple = axVar;
    }
}
