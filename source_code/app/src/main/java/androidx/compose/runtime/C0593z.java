package androidx.compose.runtime;

/* renamed from: androidx.compose.runtime.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0593z implements InterfaceC0563a0 {
    public final vf.ab alpha;

    public C0593z(vf.ab abVar) {
        this.alpha = abVar;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
        vf.ab abVar = this.alpha;
        if (abVar instanceof C0569d0) {
            ((C0569d0) abVar).echo();
        } else {
            vf.ad.kilo(abVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        vf.ab abVar = this.alpha;
        if (abVar instanceof C0569d0) {
            ((C0569d0) abVar).echo();
        } else {
            vf.ad.kilo(abVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
    }
}
