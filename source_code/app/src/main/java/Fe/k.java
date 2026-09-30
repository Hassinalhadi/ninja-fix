package Fe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class k extends Lambda implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s function = (s) obj;
        Intrinsics.echo(function, "$this$function");
        String concat = "java/util/".concat("Spliterator");
        f fVar = m.bravo;
        function.charlie(concat, fVar, fVar);
        return Unit.INSTANCE;
    }
}
