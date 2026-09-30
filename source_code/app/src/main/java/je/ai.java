package je;

import ge.InterfaceC1777i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ai extends J implements InterfaceC1777i {

    /* renamed from: b, reason: collision with root package name */
    public final aj f12898b;

    public ai(aj property) {
        Intrinsics.echo(property, "property");
        this.f12898b = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((ai) this.f12898b.f12899h.getValue()).call(obj);
        return Unit.INSTANCE;
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12898b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12898b;
    }
}
