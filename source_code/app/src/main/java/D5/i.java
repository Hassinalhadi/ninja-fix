package D5;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes3.dex */
public final class i implements InterfaceC0733c {
    public static final i alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("eventTimeMs");
    public static final C0732b charlie = C0732b.charlie("eventCode");
    public static final C0732b delta = C0732b.charlie("complianceData");
    public static final C0732b echo = C0732b.charlie("eventUptimeMs");
    public static final C0732b foxtrot = C0732b.charlie("sourceExtension");
    public static final C0732b golf = C0732b.charlie("sourceExtensionJsonProto3");
    public static final C0732b hotel = C0732b.charlie("timezoneOffsetSeconds");
    public static final C0732b india = C0732b.charlie("networkConnectionInfo");
    public static final C0732b juliet = C0732b.charlie("experimentIds");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        t tVar = (t) ((af) obj);
        interfaceC0734d.foxtrot(bravo, tVar.alpha);
        interfaceC0734d.alpha(charlie, tVar.bravo);
        interfaceC0734d.alpha(delta, tVar.charlie);
        interfaceC0734d.foxtrot(echo, tVar.delta);
        interfaceC0734d.alpha(foxtrot, tVar.echo);
        interfaceC0734d.alpha(golf, tVar.foxtrot);
        interfaceC0734d.foxtrot(hotel, tVar.golf);
        interfaceC0734d.alpha(india, tVar.hotel);
        interfaceC0734d.alpha(juliet, tVar.india);
    }
}
