package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0274g implements InterfaceC0733c {
    public static final C0274g alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("identifier");
    public static final C0732b charlie = C0732b.charlie("version");
    public static final C0732b delta = C0732b.charlie("displayVersion");
    public static final C0732b echo = C0732b.charlie("organization");
    public static final C0732b foxtrot = C0732b.charlie("installationUuid");
    public static final C0732b golf = C0732b.charlie("developmentPlatform");
    public static final C0732b hotel = C0732b.charlie("developmentPlatformVersion");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ak akVar = (ak) ((V) obj);
        interfaceC0734d.alpha(bravo, akVar.alpha);
        interfaceC0734d.alpha(charlie, akVar.bravo);
        interfaceC0734d.alpha(delta, akVar.charlie);
        interfaceC0734d.alpha(echo, null);
        interfaceC0734d.alpha(foxtrot, akVar.delta);
        interfaceC0734d.alpha(golf, akVar.echo);
        interfaceC0734d.alpha(hotel, akVar.foxtrot);
    }
}
