package D5;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes3.dex */
public final class b implements InterfaceC0733c {
    public static final b alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("sdkVersion");
    public static final C0732b charlie = C0732b.charlie("model");
    public static final C0732b delta = C0732b.charlie("hardware");
    public static final C0732b echo = C0732b.charlie("device");
    public static final C0732b foxtrot = C0732b.charlie("product");
    public static final C0732b golf = C0732b.charlie("osBuild");
    public static final C0732b hotel = C0732b.charlie("manufacturer");
    public static final C0732b india = C0732b.charlie("fingerprint");
    public static final C0732b juliet = C0732b.charlie("locale");
    public static final C0732b kilo = C0732b.charlie("country");
    public static final C0732b lima = C0732b.charlie("mccMnc");
    public static final C0732b mike = C0732b.charlie("applicationBuild");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        l lVar = (l) ((a) obj);
        interfaceC0734d.alpha(bravo, lVar.alpha);
        interfaceC0734d.alpha(charlie, lVar.bravo);
        interfaceC0734d.alpha(delta, lVar.charlie);
        interfaceC0734d.alpha(echo, lVar.delta);
        interfaceC0734d.alpha(foxtrot, lVar.echo);
        interfaceC0734d.alpha(golf, lVar.foxtrot);
        interfaceC0734d.alpha(hotel, lVar.golf);
        interfaceC0734d.alpha(india, lVar.hotel);
        interfaceC0734d.alpha(juliet, lVar.india);
        interfaceC0734d.alpha(kilo, lVar.juliet);
        interfaceC0734d.alpha(lima, lVar.kilo);
        interfaceC0734d.alpha(mike, lVar.lima);
    }
}
