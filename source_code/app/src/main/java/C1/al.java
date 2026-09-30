package C1;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class al extends Lambda implements Xd.l {
    public static final al alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        as msg = (as) obj;
        Throwable th = (Throwable) obj2;
        Intrinsics.echo(msg, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.bravo.yellow(th);
        return Unit.INSTANCE;
    }
}
