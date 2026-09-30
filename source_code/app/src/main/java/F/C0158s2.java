package F;

import a0.C0366t;
import a0.InterfaceC0368v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0158s2 implements InterfaceC0368v, kotlin.jvm.internal.f {
    public final /* synthetic */ Af.i alpha;

    public C0158s2(Af.i iVar) {
        this.alpha = iVar;
    }

    @Override // a0.InterfaceC0368v
    public final long alpha() {
        return ((C0366t) this.alpha.get()).alpha;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0368v) && (obj instanceof kotlin.jvm.internal.f)) {
            return Intrinsics.areEqual(this.alpha, ((kotlin.jvm.internal.f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public final kotlin.e getFunctionDelegate() {
        return this.alpha;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
