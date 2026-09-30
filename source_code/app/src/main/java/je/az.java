package je;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class az extends H implements ge.t {

    /* renamed from: b, reason: collision with root package name */
    public final C1961B f12907b;

    public az(C1961B property) {
        Intrinsics.echo(property, "property");
        this.f12907b = property;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f12907b.get(obj);
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12907b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12907b;
    }
}
