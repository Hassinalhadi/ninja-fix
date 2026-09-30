package D5;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes3.dex */
public final class j implements InterfaceC0733c {
    public static final j alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("requestTimeMs");
    public static final C0732b charlie = C0732b.charlie("requestUptimeMs");
    public static final C0732b delta = C0732b.charlie("clientInfo");
    public static final C0732b echo = C0732b.charlie("logSource");
    public static final C0732b foxtrot = C0732b.charlie("logSourceName");
    public static final C0732b golf = C0732b.charlie("logEvent");
    public static final C0732b hotel = C0732b.charlie("qosTier");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        u uVar = (u) ((ag) obj);
        interfaceC0734d.foxtrot(bravo, uVar.alpha);
        interfaceC0734d.foxtrot(charlie, uVar.bravo);
        interfaceC0734d.alpha(delta, uVar.charlie);
        interfaceC0734d.alpha(echo, uVar.delta);
        interfaceC0734d.alpha(foxtrot, uVar.echo);
        interfaceC0734d.alpha(golf, uVar.foxtrot);
        interfaceC0734d.alpha(hotel, ak.alpha);
    }
}
