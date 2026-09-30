package A2;

import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3220y;

/* loaded from: classes3.dex */
public final class e extends AbstractC3220y {
    public static final e purple = new AbstractC3220y();
    public static final Cf.e red = vf.ao.alpha;

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h context, Runnable block) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(block, "block");
        red.beige(context, block);
    }

    @Override // vf.AbstractC3220y
    public final boolean indigo(Nd.h context) {
        Intrinsics.echo(context, "context");
        red.getClass();
        return !false;
    }
}
