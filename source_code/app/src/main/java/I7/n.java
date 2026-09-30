package I7;

import A2.ao;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;

/* loaded from: classes2.dex */
public final class n implements InterfaceC1904b {
    public static final A8.a charlie = new A8.a(15);
    public static final E8.h delta = new E8.h(2);
    public InterfaceC1903a alpha;
    public volatile InterfaceC1904b bravo;

    public n(A8.a aVar, InterfaceC1904b interfaceC1904b) {
        this.alpha = aVar;
        this.bravo = interfaceC1904b;
    }

    public final void alpha(InterfaceC1903a interfaceC1903a) {
        InterfaceC1904b interfaceC1904b;
        InterfaceC1904b interfaceC1904b2;
        InterfaceC1904b interfaceC1904b3 = this.bravo;
        E8.h hVar = delta;
        if (interfaceC1904b3 != hVar) {
            interfaceC1903a.delta(interfaceC1904b3);
            return;
        }
        synchronized (this) {
            interfaceC1904b = this.bravo;
            if (interfaceC1904b != hVar) {
                interfaceC1904b2 = interfaceC1904b;
            } else {
                this.alpha = new ao(7, this.alpha, interfaceC1903a);
                interfaceC1904b2 = null;
            }
        }
        if (interfaceC1904b2 != null) {
            interfaceC1903a.delta(interfaceC1904b);
        }
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        return this.bravo.get();
    }
}
