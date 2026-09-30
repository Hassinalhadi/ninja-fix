package Yb;

import android.content.Intent;
import com.app.network.network.models.Item;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.scanner.invoice.InvoiceScannerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ai implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0329s0 purple;
    public final /* synthetic */ OrderTask red;

    public /* synthetic */ ai(C0329s0 c0329s0, OrderTask orderTask, int i4) {
        this.alpha = i4;
        this.purple = c0329s0;
        this.red = orderTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                C0329s0 c0329s0 = this.purple;
                if (c0329s0 != null) {
                    c0329s0.alpha.magenta(this.red);
                }
                return Unit.INSTANCE;
            case 1:
                C0329s0 c0329s02 = this.purple;
                if (c0329s02 != null) {
                    OrderTask orderTask = this.red;
                    c0329s02.getClass();
                    List<Item> items = orderTask.getItems();
                    if (items != null) {
                        L0 l02 = new L0();
                        l02.f2334u = items;
                        l02.f14101q = true;
                        l02.romeo(c0329s02.alpha.getSupportFragmentManager(), "");
                    }
                }
                return Unit.INSTANCE;
            case 2:
                OrderTask orderTask2 = this.red;
                TaskStatus taskStatus = orderTask2.getTaskStatus();
                if (taskStatus == null) {
                    i4 = -1;
                } else {
                    i4 = as.$EnumSwitchMapping$1[taskStatus.ordinal()];
                }
                C0329s0 c0329s03 = this.purple;
                if (i4 != 1) {
                    if (i4 == 2 && c0329s03 != null) {
                        c0329s03.bravo(orderTask2, TaskStatus.COMPLETED);
                    }
                } else if (c0329s03 != null) {
                    c0329s03.bravo(orderTask2, TaskStatus.STARTED);
                }
                return Unit.INSTANCE;
            case 3:
                OrderTask orderTask3 = this.red;
                TaskStatus taskStatus2 = orderTask3.getTaskStatus();
                if (taskStatus2 == null) {
                    i5 = -1;
                } else {
                    i5 = AbstractC0302e0.$EnumSwitchMapping$0[taskStatus2.ordinal()];
                }
                C0329s0 c0329s04 = this.purple;
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3 && c0329s04 != null) {
                            c0329s04.bravo(orderTask3, TaskStatus.COMPLETED);
                        }
                    } else if (c0329s04 != null) {
                        c0329s04.bravo(orderTask3, TaskStatus.COMPLETED);
                    }
                } else if (c0329s04 != null) {
                    c0329s04.bravo(orderTask3, TaskStatus.STARTED);
                }
                return Unit.INSTANCE;
            case 4:
                C0329s0 c0329s05 = this.purple;
                if (c0329s05 != null) {
                    OrderTask orderTask4 = this.red;
                    ProcessOrderActivityV2 processOrderActivityV2 = c0329s05.alpha;
                    processOrderActivityV2.f12409Z = orderTask4;
                    processOrderActivityV2.f12387H0.golf();
                }
                return Unit.INSTANCE;
            case 5:
                C0329s0 c0329s06 = this.purple;
                if (c0329s06 != null) {
                    ((androidx.compose.runtime.t0) c0329s06.alpha.f12433y0).setValue(this.red);
                }
                return Unit.INSTANCE;
            case 6:
                C0329s0 c0329s07 = this.purple;
                if (c0329s07 != null) {
                    ((androidx.compose.runtime.t0) c0329s07.alpha.f12434z0).setValue(this.red);
                }
                return Unit.INSTANCE;
            case 7:
                C0329s0 c0329s08 = this.purple;
                if (c0329s08 != null) {
                    OrderTask orderTask5 = this.red;
                    ProcessOrderActivityV2 processOrderActivityV22 = c0329s08.alpha;
                    processOrderActivityV22.f12410a0 = orderTask5;
                    processOrderActivityV22.f12417h0.alpha(new Intent(processOrderActivityV22, (Class<?>) InvoiceScannerActivity.class));
                }
                return Unit.INSTANCE;
            default:
                C0329s0 c0329s09 = this.purple;
                if (c0329s09 != null) {
                    c0329s09.alpha(this.red);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ai(OrderTask orderTask, C0329s0 c0329s0, int i4) {
        this.alpha = i4;
        this.red = orderTask;
        this.purple = c0329s0;
    }
}
