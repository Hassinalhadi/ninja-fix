package Ec;

import androidx.compose.runtime.p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class au implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ p0 purple;

    public /* synthetic */ au(p0 p0Var, int i4) {
        this.alpha = i4;
        this.purple = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.kilo(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                D0.ak result = (D0.ak) obj;
                Intrinsics.echo(result, "result");
                this.purple.kilo(result.bravo.foxtrot);
                return Unit.INSTANCE;
        }
    }
}
