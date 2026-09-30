package E5;

import A0.z;
import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import e8.C1633a;
import e8.InterfaceC1637e;

/* loaded from: classes3.dex */
public final class c implements InterfaceC0733c {
    public static final c alpha = new Object();
    public static final C0732b bravo = new C0732b("eventsDroppedCount", z.november(z.mike(InterfaceC1637e.class, new C1633a(1))));
    public static final C0732b charlie = new C0732b("reason", z.november(z.mike(InterfaceC1637e.class, new C1633a(3))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        H5.d dVar = (H5.d) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.foxtrot(bravo, dVar.alpha);
        interfaceC0734d.alpha(charlie, dVar.bravo);
    }
}
