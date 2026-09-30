package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes2.dex */
public final class r extends s {
    public r() {
        super("UNKNOWN", 2);
    }

    @Override // gf.s
    public final s alpha(B nextType) {
        Intrinsics.echo(nextType, "nextType");
        s bravo = s.bravo(nextType);
        if (bravo == s.purple) {
            return this;
        }
        return bravo;
    }
}
