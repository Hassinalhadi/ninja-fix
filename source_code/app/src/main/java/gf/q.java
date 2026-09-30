package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes2.dex */
public final class q extends s {
    public q() {
        super("START", 0);
    }

    @Override // gf.s
    public final s alpha(B nextType) {
        Intrinsics.echo(nextType, "nextType");
        return s.bravo(nextType);
    }
}
