package T1;

import ge.InterfaceC1772d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final InterfaceC1772d alpha;
    public final Function1 bravo;

    public f(InterfaceC1772d clazz, Function1 initializer) {
        Intrinsics.echo(clazz, "clazz");
        Intrinsics.echo(initializer, "initializer");
        this.alpha = clazz;
        this.bravo = initializer;
    }
}
