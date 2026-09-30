package Jb;

import com.app.network.network.models.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: Jb.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0204l implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Order red;

    public /* synthetic */ C0204l(Function1 function1, Order order, int i4) {
        this.alpha = i4;
        this.purple = function1;
        this.red = order;
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
