package s0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ar extends Lambda implements Function0 {
    public final /* synthetic */ at alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ a0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(at atVar, long j5, long j6, a0 a0Var) {
        super(0);
        this.alpha = atVar;
        this.purple = j5;
        this.red = j6;
        this.silver = a0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        at atVar = this.alpha;
        atVar.l().alpha = false;
        atVar.l().purple = this.purple;
        atVar.l().red = this.red;
        Function1 echo = this.silver.alpha.echo();
        if (echo != null) {
            echo.invoke(atVar.l());
        }
        return Unit.INSTANCE;
    }
}
