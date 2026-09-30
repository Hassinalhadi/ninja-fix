package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes2.dex */
public final class o extends s {
    public o() {
        super("ACCEPT_NULL", 1);
    }

    @Override // gf.s
    public final s alpha(B nextType) {
        Intrinsics.echo(nextType, "nextType");
        return s.bravo(nextType);
    }
}
