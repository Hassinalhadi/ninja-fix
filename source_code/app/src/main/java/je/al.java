package je;

import ge.InterfaceC1776h;
import ge.InterfaceC1779k;
import ge.InterfaceC1780l;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class al extends C1961B implements InterfaceC1780l {

    /* renamed from: h, reason: collision with root package name */
    public final Object f12901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(af container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
        this.f12901h = LazyKt.alpha(kotlin.i.alpha, new ab(2, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1781m
    public final InterfaceC1776h charlie() {
        return (ak) this.f12901h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1780l
    public final void echo(Object obj, Object obj2) {
        ((ak) this.f12901h.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.InterfaceC1780l, ge.InterfaceC1781m
    public final InterfaceC1779k charlie() {
        return (ak) this.f12901h.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        this.f12901h = LazyKt.alpha(kotlin.i.alpha, new ab(2, this));
    }
}
