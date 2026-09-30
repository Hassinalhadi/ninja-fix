package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class Q0 implements InterfaceC0733c {
    public static final Q0 alpha = new Object();
    public static final C0732b bravo = new C0732b("logEventKey", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("eventCount", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("inferenceDurationStats", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2611b0 c2611b0 = (C2611b0) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2611b0.alpha);
        interfaceC0734d.alpha(charlie, c2611b0.bravo);
        interfaceC0734d.alpha(delta, c2611b0.charlie);
    }
}
