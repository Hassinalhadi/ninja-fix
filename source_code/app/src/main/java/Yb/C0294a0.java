package Yb;

import com.app.network.network.models.OrderTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: Yb.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0294a0 implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ C0329s0 red;
    public final /* synthetic */ OrderTask silver;
    public final /* synthetic */ Function1 teal;

    public /* synthetic */ C0294a0(boolean z2, C0329s0 c0329s0, OrderTask orderTask, Function1 function1, int i4) {
        this.alpha = i4;
        this.purple = z2;
        this.red = c0329s0;
        this.silver = orderTask;
        this.teal = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                OrderTask orderTask = this.silver;
                if (this.purple) {
                    C0329s0 c0329s0 = this.red;
                    if (c0329s0 != null) {
                        c0329s0.alpha(orderTask);
                    }
                } else {
                    this.teal.invoke(orderTask);
                }
                return Unit.INSTANCE;
            default:
                OrderTask orderTask2 = this.silver;
                if (this.purple) {
                    C0329s0 c0329s02 = this.red;
                    if (c0329s02 != null) {
                        c0329s02.alpha(orderTask2);
                    }
                } else {
                    this.teal.invoke(orderTask2);
                }
                return Unit.INSTANCE;
        }
    }
}
