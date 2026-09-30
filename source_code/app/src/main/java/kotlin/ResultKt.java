package kotlin;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "exception", "", "createFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResultKt {
    public static final void alpha(Object obj) {
        if (!(obj instanceof k)) {
        } else {
            throw ((k) obj).alpha;
        }
    }

    @NotNull
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.echo(exception, "exception");
        return new k(exception);
    }
}
