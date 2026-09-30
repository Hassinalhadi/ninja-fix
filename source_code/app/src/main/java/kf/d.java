package kf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.aq;

/* loaded from: classes2.dex */
public final class d {
    public final aq alpha;
    public final y bravo;
    public final y charlie;

    public d(aq typeParameter, y inProjection, y outProjection) {
        Intrinsics.echo(typeParameter, "typeParameter");
        Intrinsics.echo(inProjection, "inProjection");
        Intrinsics.echo(outProjection, "outProjection");
        this.alpha = typeParameter;
        this.bravo = inProjection;
        this.charlie = outProjection;
    }
}
