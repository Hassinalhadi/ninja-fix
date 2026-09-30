package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class R0 implements InterfaceC0733c {
    public static final R0 alpha = new Object();
    public static final C0732b bravo = new C0732b("errorCode", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("hasResult", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("isColdCall", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("imageInfo", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));
    public static final C0732b foxtrot = new C0732b("options", A0.z.november(AbstractC2327c.yankee(Q.class, new N(5))));
    public static final C0732b golf = new C0732b("detectedBarcodeFormats", A0.z.november(AbstractC2327c.yankee(Q.class, new N(6))));
    public static final C0732b hotel = new C0732b("detectedBarcodeValueTypes", A0.z.november(AbstractC2327c.yankee(Q.class, new N(7))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2602a0 c2602a0 = (C2602a0) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2602a0.alpha);
        interfaceC0734d.alpha(charlie, null);
        interfaceC0734d.alpha(delta, c2602a0.bravo);
        interfaceC0734d.alpha(echo, null);
        interfaceC0734d.alpha(foxtrot, c2602a0.charlie);
        interfaceC0734d.alpha(golf, c2602a0.delta);
        interfaceC0734d.alpha(hotel, c2602a0.echo);
    }
}
