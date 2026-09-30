package Yb;

import android.content.Intent;
import android.os.Bundle;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yb.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0324p0 implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 purple;

    public /* synthetic */ C0324p0(ProcessOrderActivityV2 processOrderActivityV2, int i4) {
        this.alpha = i4;
        this.purple = processOrderActivityV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int intValue;
        Integer num = null;
        ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
        switch (this.alpha) {
            case 0:
                OrderTask it = (OrderTask) obj;
                int i4 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(it, "it");
                Integer orderId = it.getOrderId();
                if (orderId != null) {
                    intValue = orderId.intValue();
                } else {
                    Order order = processOrderActivityV2.f12418i0;
                    if (order != null) {
                        num = order.getId();
                    }
                    if (num != null) {
                        intValue = num.intValue();
                    }
                    return Unit.INSTANCE;
                }
                C0321o c0321o = new C0321o();
                Bundle bundle = new Bundle();
                bundle.putInt("orderId", intValue);
                c0321o.setArguments(bundle);
                c0321o.romeo(processOrderActivityV2.getSupportFragmentManager(), "CallCustomerSheet");
                return Unit.INSTANCE;
            case 1:
                OrderTask it2 = (OrderTask) obj;
                int i5 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(it2, "it");
                processOrderActivityV2.gold(it2);
                return Unit.INSTANCE;
            case 2:
                OrderTask it3 = (OrderTask) obj;
                int i10 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(it3, "it");
                Cb.ad adVar = new Cb.ad(25, processOrderActivityV2, it3);
                C0307h c0307h = new C0307h();
                c0307h.f2418v = adVar;
                c0307h.romeo(processOrderActivityV2.getSupportFragmentManager(), null);
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i11 = ProcessOrderActivityV2.f12378N0;
                Intent intent = new Intent(processOrderActivityV2, (Class<?>) AddSupportTicketActivity.class);
                intent.putExtra("ORDER_ID", intValue2);
                processOrderActivityV2.startActivity(intent);
                return Unit.INSTANCE;
        }
    }
}
