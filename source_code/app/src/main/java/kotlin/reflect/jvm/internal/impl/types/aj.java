package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aj extends as {
    public final pe.aq alpha;
    public final Object bravo;

    public aj(pe.aq typeParameter) {
        Intrinsics.echo(typeParameter, "typeParameter");
        this.alpha = typeParameter;
        this.bravo = LazyKt.alpha(kotlin.i.alpha, new je.ab(7, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final int alpha() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.as
    public final y bravo() {
        return (y) this.bravo.getValue();
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
