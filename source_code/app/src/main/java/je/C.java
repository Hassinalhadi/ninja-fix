package je;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class C extends H implements Xd.l {

    /* renamed from: b, reason: collision with root package name */
    public final E f12885b;

    public C(E property) {
        Intrinsics.echo(property, "property");
        this.f12885b = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C) this.f12885b.f12886f.getValue()).call(obj, obj2);
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12885b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12885b;
    }
}
