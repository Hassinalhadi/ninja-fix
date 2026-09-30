package je;

import ge.InterfaceC1779k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ak extends J implements InterfaceC1779k {

    /* renamed from: b, reason: collision with root package name */
    public final al f12900b;

    public ak(al property) {
        Intrinsics.echo(property, "property");
        this.f12900b = property;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        this.f12900b.echo(obj, obj2);
        return Unit.INSTANCE;
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12900b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12900b;
    }
}
