package X;

import a0.InterfaceC0341aa;
import bv.ah;
import bv.as;
import d0.C1564b;
import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class h implements InterfaceC0341aa {
    public ah alpha;
    public InterfaceC0341aa bravo;

    @Override // a0.InterfaceC0341aa
    public final void alpha(C1564b c1564b) {
        InterfaceC0341aa interfaceC0341aa = this.bravo;
        if (interfaceC0341aa != null) {
            interfaceC0341aa.alpha(c1564b);
        }
    }

    @Override // a0.InterfaceC0341aa
    public final C1564b bravo() {
        InterfaceC0341aa interfaceC0341aa = this.bravo;
        if (interfaceC0341aa == null) {
            AbstractC2264a.bravo("GraphicsContext not provided");
        }
        C1564b bravo = interfaceC0341aa.bravo();
        ah ahVar = this.alpha;
        if (ahVar == null) {
            Object[] objArr = as.alpha;
            ah ahVar2 = new ah(1);
            ahVar2.golf(bravo);
            this.alpha = ahVar2;
            return bravo;
        }
        ahVar.golf(bravo);
        return bravo;
    }

    public final void charlie() {
        ah ahVar = this.alpha;
        if (ahVar != null) {
            Object[] objArr = ahVar.alpha;
            int i4 = ahVar.bravo;
            for (int i5 = 0; i5 < i4; i5++) {
                alpha((C1564b) objArr[i5]);
            }
            ahVar.india();
        }
    }
}
