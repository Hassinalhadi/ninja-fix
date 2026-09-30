package Pe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class l extends Lambda implements Function1 {
    public static final l alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v withOptions = (v) obj;
        Intrinsics.echo(withOptions, "$this$withOptions");
        withOptions.india();
        withOptions.delta(kotlin.collections.u.alpha);
        withOptions.golf(b.charlie);
        withOptions.foxtrot();
        withOptions.kilo(ad.red);
        withOptions.alpha();
        withOptions.charlie();
        withOptions.mike();
        withOptions.hotel();
        return Unit.INSTANCE;
    }
}
