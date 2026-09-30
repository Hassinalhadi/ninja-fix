package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class L2 implements InterfaceC0733c {
    public static final L2 alpha = new Object();
    public static final C0732b bravo = new C0732b("inferenceCommonLogEvent", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("options", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("detectedBarcodeFormats", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("detectedBarcodeValueTypes", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));
    public static final C0732b foxtrot = new C0732b("imageInfo", A0.z.november(AbstractC2327c.yankee(Q.class, new N(5))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        M5 m5 = (M5) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, m5.alpha);
        interfaceC0734d.alpha(charlie, m5.bravo);
        interfaceC0734d.alpha(delta, m5.charlie);
        interfaceC0734d.alpha(echo, m5.delta);
        interfaceC0734d.alpha(foxtrot, m5.echo);
    }
}
