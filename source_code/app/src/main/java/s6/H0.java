package s6;

import android.content.Context;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class H0 {
    public static I7.b alpha(String str, String str2) {
        D8.a aVar = new D8.a(str, str2);
        I7.a bravo = I7.b.bravo(D8.a.class);
        bravo.echo = 1;
        bravo.foxtrot = new B2.s(7, aVar);
        return bravo.bravo();
    }

    public static I7.b bravo(String str, A8.a aVar) {
        I7.a bravo = I7.b.bravo(D8.a.class);
        bravo.echo = 1;
        bravo.alpha(I7.j.charlie(Context.class));
        bravo.foxtrot = new A2.ao(1, str, aVar);
        return bravo.bravo();
    }

    public static final boolean charlie(Order order, OrderTask task) {
        Intrinsics.echo(order, "<this>");
        Intrinsics.echo(task, "task");
        if (Intrinsics.areEqual(order.getIsOnDemand(), Boolean.TRUE) && task.getTaskType() == TaskType.PICK_UP) {
            return true;
        }
        return false;
    }
}
