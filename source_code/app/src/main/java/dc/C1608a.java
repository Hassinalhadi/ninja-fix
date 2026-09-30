package dc;

import N9.i;
import com.app.network.network.models.Order;
import kotlin.jvm.internal.Intrinsics;
import q3.g;

/* renamed from: dc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1608a {
    public final g alpha;

    public C1608a(g flags) {
        Intrinsics.echo(flags, "flags");
        this.alpha = flags;
    }

    public final boolean alpha(Order order) {
        boolean z2;
        if (((Boolean) ((i) this.alpha).alpha(N9.a.bravo)).booleanValue()) {
            if (order != null) {
                z2 = Intrinsics.areEqual(order.getIsHybrid(), Boolean.TRUE);
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
