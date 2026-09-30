package je;

import ge.InterfaceC1776h;
import ge.InterfaceC1777i;
import ge.InterfaceC1778j;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aj extends ay implements InterfaceC1778j {

    /* renamed from: h, reason: collision with root package name */
    public final Object f12899h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        this.f12899h = LazyKt.alpha(kotlin.i.alpha, new ab(1, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1781m
    public final InterfaceC1776h charlie() {
        return (ai) this.f12899h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1778j, ge.InterfaceC1781m
    public final InterfaceC1777i charlie() {
        return (ai) this.f12899h.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(af container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
        this.f12899h = LazyKt.alpha(kotlin.i.alpha, new ab(1, this));
    }
}
