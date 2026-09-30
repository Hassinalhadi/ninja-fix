package J8;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes2.dex */
public final class h implements InterfaceC0733c {
    public static final h alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("sessionId");
    public static final C0732b charlie = C0732b.charlie("firstSessionId");
    public static final C0732b delta = C0732b.charlie("sessionIndex");
    public static final C0732b echo = C0732b.charlie("eventTimestampUs");
    public static final C0732b foxtrot = C0732b.charlie("dataCollectionStatus");
    public static final C0732b golf = C0732b.charlie("firebaseInstallationId");
    public static final C0732b hotel = C0732b.charlie("firebaseAuthenticationToken");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        aw awVar = (aw) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, awVar.alpha);
        interfaceC0734d.alpha(charlie, awVar.bravo);
        interfaceC0734d.echo(delta, awVar.charlie);
        interfaceC0734d.foxtrot(echo, awVar.delta);
        interfaceC0734d.alpha(foxtrot, awVar.echo);
        interfaceC0734d.alpha(golf, awVar.foxtrot);
        interfaceC0734d.alpha(hotel, awVar.golf);
    }
}
