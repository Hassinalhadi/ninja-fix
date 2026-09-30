package Pe;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function1 {
    public static final q alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v withOptions = (v) obj;
        Intrinsics.echo(withOptions, "$this$withOptions");
        withOptions.echo(kotlin.collections.ab.mike(withOptions.juliet(), CollectionsKt.listOf(me.m.papa, me.m.quebec)));
        return Unit.INSTANCE;
    }
}
