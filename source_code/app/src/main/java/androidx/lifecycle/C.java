package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3220y;
import wf.C3268e;

/* loaded from: classes3.dex */
public final class C extends AbstractC3220y {
    public final C0644n purple = new C0644n();

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h context, Runnable block) {
        boolean z2;
        int i4 = 0;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(block, "block");
        C0644n c0644n = this.purple;
        c0644n.getClass();
        Cf.e eVar = vf.ao.alpha;
        C3268e c3268e = Af.n.alpha.teal;
        if (!c3268e.indigo(context)) {
            if (!c0644n.bravo && c0644n.alpha) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (c0644n.delta.offer(block)) {
                    c0644n.alpha();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
        }
        c3268e.beige(context, new RunnableC0643m(i4, c0644n, block));
    }

    @Override // vf.AbstractC3220y
    public final boolean indigo(Nd.h context) {
        boolean z2;
        Intrinsics.echo(context, "context");
        Cf.e eVar = vf.ao.alpha;
        if (Af.n.alpha.teal.indigo(context)) {
            return true;
        }
        C0644n c0644n = this.purple;
        if (!c0644n.bravo && c0644n.alpha) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }
}
