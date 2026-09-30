package td;

import Yb.B0;
import Yb.C0304f0;
import Yb.C0333u0;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Platform;
import com.app.network.network.models.PlatformSettings;
import com.app.network.network.models.TaskStatus;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {
    public static void alpha(C0333u0 c0333u0, OrderTask orderTask, TaskStatus taskStatus, String str, File file) {
        Integer id2 = orderTask.getId();
        if (id2 != null) {
            int intValue = id2.intValue();
            if (Intrinsics.areEqual(orderTask.getDeliveryConfirmationCodeRequired(), Boolean.TRUE)) {
                Integer deliveryConfirmationCodeLength = orderTask.getDeliveryConfirmationCodeLength();
                if (deliveryConfirmationCodeLength != null) {
                    int intValue2 = deliveryConfirmationCodeLength.intValue();
                    B0 b02 = new B0(c0333u0, intValue, taskStatus, str, file);
                    c0333u0.getClass();
                    new C0304f0(intValue2, b02).romeo(c0333u0.alpha.getSupportFragmentManager(), "PinVerificationDialog");
                    return;
                }
                return;
            }
            Q0.c.bronze(c0333u0, intValue, taskStatus, str, null, file, null, 88);
        }
    }

    public static void bravo(C0333u0 c0333u0, OrderTask task, Order order, TaskStatus taskStatus, String str) {
        boolean z2;
        PlatformSettings settings;
        Platform platform = order.getPlatform();
        if (platform != null && (settings = platform.getSettings()) != null) {
            z2 = Intrinsics.areEqual(settings.getPickupTaskConfirmationImageRequired(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        File file = null;
        if (z2) {
            c0333u0.getClass();
            Intrinsics.echo(task, "task");
            String quebec = L9.d.quebec(c0333u0.alpha, task.generateImageId());
            if (quebec != null) {
                File file2 = new File(quebec);
                if (file2.exists()) {
                    file = file2;
                }
            }
            alpha(c0333u0, task, taskStatus, str, file);
            return;
        }
        alpha(c0333u0, task, taskStatus, str, null);
    }
}
