package je;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class am extends J implements Xd.m {

    /* renamed from: b, reason: collision with root package name */
    public final an f12902b;

    public am(an property) {
        Intrinsics.echo(property, "property");
        this.f12902b = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((am) this.f12902b.f12903h.getValue()).call(obj, obj2, obj3);
        return Unit.INSTANCE;
    }

    @Override // ge.InterfaceC1784p
    public final ge.v oscar() {
        return this.f12902b;
    }

    @Override // je.F
    public final L xray() {
        return this.f12902b;
    }
}
