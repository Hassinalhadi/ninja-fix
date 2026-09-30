package je;

import ge.InterfaceC1785q;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class ay extends L implements ge.s {

    /* renamed from: f, reason: collision with root package name */
    public final Object f12905f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        kotlin.i iVar = kotlin.i.alpha;
        this.f12905f = LazyKt.alpha(iVar, new ax(this, 0));
        this.f12906g = LazyKt.alpha(iVar, new ax(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.v
    public final InterfaceC1785q bravo() {
        return (aw) this.f12905f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.s
    public final Object get() {
        return ((aw) this.f12905f.getValue()).call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.L
    public final H yankee() {
        return (aw) this.f12905f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.v
    public final ge.r bravo() {
        return (aw) this.f12905f.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(af container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
        kotlin.i iVar = kotlin.i.alpha;
        this.f12905f = LazyKt.alpha(iVar, new ax(this, 0));
        this.f12906g = LazyKt.alpha(iVar, new ax(this, 1));
    }
}
