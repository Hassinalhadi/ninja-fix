package E1;

import C1.A;
import Tf.ah;
import Tf.u;
import Xd.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements l {
    public static final d alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ah path = (ah) obj;
        Intrinsics.echo(path, "path");
        Intrinsics.echo((u) obj2, "<anonymous parameter 1>");
        return new A(r6.u.bravo(path.alpha.romeo(), true).alpha.romeo());
    }
}
