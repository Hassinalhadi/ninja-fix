package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* renamed from: s6.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2705l4 implements InterfaceC0733c {
    public static final C2705l4 alpha = new Object();
    public static final C0732b bravo = new C0732b("xMin", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("yMin", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("xMax", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("yMax", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));
    public static final C0732b foxtrot = new C0732b("confidenceScore", A0.z.november(AbstractC2327c.yankee(Q.class, new N(5))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2654f7 c2654f7 = (C2654f7) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2654f7.alpha);
        interfaceC0734d.alpha(charlie, c2654f7.bravo);
        interfaceC0734d.alpha(delta, c2654f7.charlie);
        interfaceC0734d.alpha(echo, c2654f7.delta);
        interfaceC0734d.alpha(foxtrot, c2654f7.echo);
    }
}
