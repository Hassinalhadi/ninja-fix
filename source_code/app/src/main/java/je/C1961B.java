package je;

import ge.InterfaceC1785q;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1961B extends L implements ge.u {

    /* renamed from: f, reason: collision with root package name */
    public final Object f12883f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1961B(af container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
        kotlin.i iVar = kotlin.i.alpha;
        this.f12883f = LazyKt.alpha(iVar, new C1960A(this, 0));
        this.f12884g = LazyKt.alpha(iVar, new C1960A(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.v
    public final InterfaceC1785q bravo() {
        return (az) this.f12883f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.u
    public final Object get(Object obj) {
        return ((az) this.f12883f.getValue()).call(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.L
    public final H yankee() {
        return (az) this.f12883f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ge.v
    public final ge.t bravo() {
        return (az) this.f12883f.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1961B(af container, se.ah descriptor) {
        super(container, descriptor);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        kotlin.i iVar = kotlin.i.alpha;
        this.f12883f = LazyKt.alpha(iVar, new C1960A(this, 0));
        this.f12884g = LazyKt.alpha(iVar, new C1960A(this, 1));
    }
}
