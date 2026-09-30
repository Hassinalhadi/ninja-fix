package N2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements InterfaceC3440j, kotlin.jvm.internal.f {
    public final /* synthetic */ n alpha;

    public j(n nVar) {
        this.alpha = nVar;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        this.alpha.echo((h) obj);
        Unit unit = Unit.INSTANCE;
        Od.a aVar = Od.a.alpha;
        return unit;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3440j) || !(obj instanceof kotlin.jvm.internal.f)) {
            return false;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.f) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.f
    public final kotlin.e getFunctionDelegate() {
        return new kotlin.jvm.internal.a(2, 4, n.class, this.alpha, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
