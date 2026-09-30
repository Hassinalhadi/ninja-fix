package Pe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i extends Lambda implements Function1 {
    public static final i alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v withOptions = (v) obj;
        Intrinsics.echo(withOptions, "$this$withOptions");
        withOptions.delta(u.purple);
        return Unit.INSTANCE;
    }
}
