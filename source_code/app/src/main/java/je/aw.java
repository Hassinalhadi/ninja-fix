package je;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aw extends H implements ge.r {

    /* renamed from: b, reason: collision with root package name */
    public final ay f12904b;

    public aw(ay property) {
        Intrinsics.echo(property, "property");
        this.f12904b = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f12904b.get();
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12904b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12904b;
    }
}
