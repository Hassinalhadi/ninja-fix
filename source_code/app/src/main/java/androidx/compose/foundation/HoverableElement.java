package androidx.compose.foundation;

import T.r;
import b.A;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Ls0/F;", "Lb/A;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HoverableElement extends F {
    public final InterfaceC1673j alpha;

    public HoverableElement(InterfaceC1673j interfaceC1673j) {
        this.alpha = interfaceC1673j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b.A, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && Intrinsics.areEqual(((HoverableElement) obj).alpha, this.alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() * 31;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "hoverable";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "interactionSource");
        oVar.bravo(Boolean.TRUE, "enabled");
    }

    @Override // s0.F
    public final void update(r rVar) {
        A a6 = (A) rVar;
        InterfaceC1673j interfaceC1673j = a6.alpha;
        InterfaceC1673j interfaceC1673j2 = this.alpha;
        if (!Intrinsics.areEqual(interfaceC1673j, interfaceC1673j2)) {
            a6.d();
            a6.alpha = interfaceC1673j2;
        }
    }
}
