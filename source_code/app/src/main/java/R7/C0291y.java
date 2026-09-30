package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0291y implements InterfaceC0733c {
    public static final C0291y alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("platform");
    public static final C0732b charlie = C0732b.charlie("version");
    public static final C0732b delta = C0732b.charlie("buildVersion");
    public static final C0732b echo = C0732b.charlie("jailbroken");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        I i4 = (I) ((l0) obj);
        interfaceC0734d.echo(bravo, i4.alpha);
        interfaceC0734d.alpha(charlie, i4.bravo);
        interfaceC0734d.alpha(delta, i4.charlie);
        interfaceC0734d.delta(echo, i4.delta);
    }
}
