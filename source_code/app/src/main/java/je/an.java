package je;

import ge.InterfaceC1776h;
import ge.InterfaceC1781m;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class an extends E implements InterfaceC1781m {

    /* renamed from: h, reason: collision with root package name */
    public final Object f12903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        this.f12903h = LazyKt.alpha(kotlin.i.alpha, new ab(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1781m
    public final InterfaceC1776h charlie() {
        return (am) this.f12903h.getValue();
    }
}
