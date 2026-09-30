package lf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;

/* loaded from: classes2.dex */
public final class z extends Lambda implements Function1 {
    public static final z alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2120h abstractC2120h = (AbstractC2120h) obj;
        Intrinsics.echo(abstractC2120h, "$this$null");
        return abstractC2120h.romeo(me.j.INT);
    }
}
