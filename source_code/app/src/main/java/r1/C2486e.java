package r1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2486e extends W0.d {
    public final Object red;

    public C2486e(int i4) {
        super(i4);
        this.red = new Object();
    }

    @Override // W0.d, r1.InterfaceC2485d
    public final boolean alpha(Object instance) {
        boolean alpha;
        Intrinsics.echo(instance, "instance");
        synchronized (this.red) {
            alpha = super.alpha(instance);
        }
        return alpha;
    }

    @Override // W0.d, r1.InterfaceC2485d
    public final Object charlie() {
        Object charlie;
        synchronized (this.red) {
            charlie = super.charlie();
        }
        return charlie;
    }
}
