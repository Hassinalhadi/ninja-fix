package Yb;

import com.app.network.network.models.OrderTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ OrderTask red;

    public /* synthetic */ aq(Function1 function1, OrderTask orderTask, int i4) {
        this.alpha = i4;
        this.purple = function1;
        this.red = orderTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke(this.red);
                return Unit.INSTANCE;
            default:
                this.purple.invoke(this.red);
                return Unit.INSTANCE;
        }
    }
}
