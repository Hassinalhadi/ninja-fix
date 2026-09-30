package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;

/* loaded from: classes2.dex */
public final class ai extends as {
    public final ae alpha;

    public ai(AbstractC2120h kotlinBuiltIns) {
        Intrinsics.echo(kotlinBuiltIns, "kotlinBuiltIns");
        this.alpha = kotlinBuiltIns.november();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final int alpha() {
        return 3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final y bravo() {
        return this.alpha;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final boolean charlie() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final as delta(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
