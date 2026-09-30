package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes2.dex */
public final class p extends s {
    public p() {
        super("NOT_NULL", 3);
    }

    @Override // gf.s
    public final s alpha(B nextType) {
        Intrinsics.echo(nextType, "nextType");
        return this;
    }
}
