package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0269b implements InterfaceC0733c {
    public static final C0269b alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("pid");
    public static final C0732b charlie = C0732b.charlie("processName");
    public static final C0732b delta = C0732b.charlie("reasonCode");
    public static final C0732b echo = C0732b.charlie("importance");
    public static final C0732b foxtrot = C0732b.charlie("pss");
    public static final C0732b golf = C0732b.charlie("rss");
    public static final C0732b hotel = C0732b.charlie("timestamp");
    public static final C0732b india = C0732b.charlie("traceFile");
    public static final C0732b juliet = C0732b.charlie("buildIdMappingForArch");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ad adVar = (ad) ((P) obj);
        interfaceC0734d.echo(bravo, adVar.alpha);
        interfaceC0734d.alpha(charlie, adVar.bravo);
        interfaceC0734d.echo(delta, adVar.charlie);
        interfaceC0734d.echo(echo, adVar.delta);
        interfaceC0734d.foxtrot(foxtrot, adVar.echo);
        interfaceC0734d.foxtrot(golf, adVar.foxtrot);
        interfaceC0734d.foxtrot(hotel, adVar.golf);
        interfaceC0734d.alpha(india, adVar.hotel);
        interfaceC0734d.alpha(juliet, adVar.india);
    }
}
