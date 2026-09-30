package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0271d implements InterfaceC0733c {
    public static final C0271d alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("sdkVersion");
    public static final C0732b charlie = C0732b.charlie("gmpAppId");
    public static final C0732b delta = C0732b.charlie("platform");
    public static final C0732b echo = C0732b.charlie("installationUuid");
    public static final C0732b foxtrot = C0732b.charlie("firebaseInstallationId");
    public static final C0732b golf = C0732b.charlie("firebaseAuthenticationToken");
    public static final C0732b hotel = C0732b.charlie("appQualitySessionId");
    public static final C0732b india = C0732b.charlie("buildVersion");
    public static final C0732b juliet = C0732b.charlie("displayVersion");
    public static final C0732b kilo = C0732b.charlie("session");
    public static final C0732b lima = C0732b.charlie("ndkPayload");
    public static final C0732b mike = C0732b.charlie("appExitInfo");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ab abVar = (ab) ((o0) obj);
        interfaceC0734d.alpha(bravo, abVar.bravo);
        interfaceC0734d.alpha(charlie, abVar.charlie);
        interfaceC0734d.echo(delta, abVar.delta);
        interfaceC0734d.alpha(echo, abVar.echo);
        interfaceC0734d.alpha(foxtrot, abVar.foxtrot);
        interfaceC0734d.alpha(golf, abVar.golf);
        interfaceC0734d.alpha(hotel, abVar.hotel);
        interfaceC0734d.alpha(india, abVar.india);
        interfaceC0734d.alpha(juliet, abVar.juliet);
        interfaceC0734d.alpha(kilo, abVar.kilo);
        interfaceC0734d.alpha(lima, abVar.lima);
        interfaceC0734d.alpha(mike, abVar.mike);
    }
}
