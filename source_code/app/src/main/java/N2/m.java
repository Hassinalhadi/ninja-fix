package N2;

import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.N;

/* loaded from: classes3.dex */
public final class m implements InterfaceC3439i {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ N purple;

    public /* synthetic */ m(N n5, int i4) {
        this.alpha = i4;
        this.purple = n5;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                this.purple.collect(new C1.s(interfaceC3440j, 3), cVar);
                return Od.a.alpha;
            default:
                this.purple.collect(new C1.s(interfaceC3440j, 4), cVar);
                return Od.a.alpha;
        }
    }
}
