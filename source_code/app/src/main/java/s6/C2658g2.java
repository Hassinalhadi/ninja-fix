package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* renamed from: s6.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2658g2 implements InterfaceC0733c {
    public static final C2658g2 alpha = new Object();
    public static final C0732b bravo = new C0732b("maxMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("minMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("avgMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("firstQuartileMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));
    public static final C0732b foxtrot = new C0732b("medianMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(5))));
    public static final C0732b golf = new C0732b("thirdQuartileMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(6))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2652f5 c2652f5 = (C2652f5) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2652f5.alpha);
        interfaceC0734d.alpha(charlie, c2652f5.bravo);
        interfaceC0734d.alpha(delta, c2652f5.charlie);
        interfaceC0734d.alpha(echo, c2652f5.delta);
        interfaceC0734d.alpha(foxtrot, c2652f5.echo);
        interfaceC0734d.alpha(golf, c2652f5.foxtrot);
    }
}
