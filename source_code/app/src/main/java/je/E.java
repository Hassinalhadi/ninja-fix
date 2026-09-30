package je;

import ge.InterfaceC1785q;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class E extends L implements Xd.l {

    /* renamed from: f, reason: collision with root package name */
    public final Object f12886f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        kotlin.i iVar = kotlin.i.alpha;
        this.f12886f = LazyKt.alpha(iVar, new D(this, 0));
        this.f12887g = LazyKt.alpha(iVar, new D(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.v
    public final InterfaceC1785q bravo() {
        return (C) this.f12886f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C) this.f12886f.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.L
    public final H yankee() {
        return (C) this.f12886f.getValue();
    }
}
