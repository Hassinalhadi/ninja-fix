package t6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class B0 implements InterfaceC0733c {
    public static final B0 alpha = new Object();
    public static final C0732b bravo = new C0732b("durationMs", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(1))));
    public static final C0732b charlie = new C0732b("imageSource", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(2))));
    public static final C0732b delta = new C0732b("imageFormat", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(3))));
    public static final C0732b echo = new C0732b("imageByteSize", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(4))));
    public static final C0732b foxtrot = new C0732b("imageWidth", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(5))));
    public static final C0732b golf = new C0732b("imageHeight", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(6))));
    public static final C0732b hotel = new C0732b("rotationDegrees", A0.z.november(AbstractC2327c.zulu(InterfaceC2978d.class, new C2963a(7))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        E2 e22 = (E2) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, e22.alpha);
        interfaceC0734d.alpha(charlie, e22.bravo);
        interfaceC0734d.alpha(delta, e22.charlie);
        interfaceC0734d.alpha(echo, e22.delta);
        interfaceC0734d.alpha(foxtrot, e22.echo);
        interfaceC0734d.alpha(golf, e22.foxtrot);
        interfaceC0734d.alpha(hotel, e22.golf);
    }
}
