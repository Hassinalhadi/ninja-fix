package E5;

import A0.z;
import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import e8.C1633a;
import e8.InterfaceC1637e;

/* loaded from: classes3.dex */
public final class a implements InterfaceC0733c {
    public static final a alpha = new Object();
    public static final C0732b bravo = new C0732b("window", z.november(z.mike(InterfaceC1637e.class, new C1633a(1))));
    public static final C0732b charlie = new C0732b("logSourceMetrics", z.november(z.mike(InterfaceC1637e.class, new C1633a(2))));
    public static final C0732b delta = new C0732b("globalMetrics", z.november(z.mike(InterfaceC1637e.class, new C1633a(3))));
    public static final C0732b echo = new C0732b("appNamespace", z.november(z.mike(InterfaceC1637e.class, new C1633a(4))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        H5.a aVar = (H5.a) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, aVar.alpha);
        interfaceC0734d.alpha(charlie, aVar.bravo);
        interfaceC0734d.alpha(delta, aVar.charlie);
        interfaceC0734d.alpha(echo, aVar.delta);
    }
}
