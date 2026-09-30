package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0278k implements InterfaceC0733c {
    public static final C0278k alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("execution");
    public static final C0732b charlie = C0732b.charlie("customAttributes");
    public static final C0732b delta = C0732b.charlie("internalKeys");
    public static final C0732b echo = C0732b.charlie("background");
    public static final C0732b foxtrot = C0732b.charlie("currentProcessDetails");
    public static final C0732b golf = C0732b.charlie("appProcessDetails");
    public static final C0732b hotel = C0732b.charlie("uiOrientation");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        aq aqVar = (aq) ((e0) obj);
        interfaceC0734d.alpha(bravo, aqVar.alpha);
        interfaceC0734d.alpha(charlie, aqVar.bravo);
        interfaceC0734d.alpha(delta, aqVar.charlie);
        interfaceC0734d.alpha(echo, aqVar.delta);
        interfaceC0734d.alpha(foxtrot, aqVar.echo);
        interfaceC0734d.alpha(golf, aqVar.foxtrot);
        interfaceC0734d.echo(hotel, aqVar.golf);
    }
}
