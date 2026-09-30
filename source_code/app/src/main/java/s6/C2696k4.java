package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* renamed from: s6.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2696k4 implements InterfaceC0733c {
    public static final C2696k4 alpha = new Object();
    public static final C0732b bravo = new C0732b("appName", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("sessionId", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("startZoomLevel", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("endZoomLevel", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));
    public static final C0732b foxtrot = new C0732b("durationMs", A0.z.november(AbstractC2327c.yankee(Q.class, new N(5))));
    public static final C0732b golf = new C0732b("predictedArea", A0.z.november(AbstractC2327c.yankee(Q.class, new N(6))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2663g7 c2663g7 = (C2663g7) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2663g7.alpha);
        interfaceC0734d.alpha(charlie, c2663g7.bravo);
        interfaceC0734d.alpha(delta, c2663g7.charlie);
        interfaceC0734d.alpha(echo, c2663g7.delta);
        interfaceC0734d.alpha(foxtrot, c2663g7.echo);
        interfaceC0734d.alpha(golf, c2663g7.foxtrot);
    }
}
