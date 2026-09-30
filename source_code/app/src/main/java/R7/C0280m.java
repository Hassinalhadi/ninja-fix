package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0280m implements InterfaceC0733c {
    public static final C0280m alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("threads");
    public static final C0732b charlie = C0732b.charlie("exception");
    public static final C0732b delta = C0732b.charlie("appExitInfo");
    public static final C0732b echo = C0732b.charlie("signal");
    public static final C0732b foxtrot = C0732b.charlie("binaries");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ar arVar = (ar) ((c0) obj);
        interfaceC0734d.alpha(bravo, arVar.alpha);
        interfaceC0734d.alpha(charlie, arVar.bravo);
        interfaceC0734d.alpha(delta, arVar.charlie);
        interfaceC0734d.alpha(echo, arVar.delta);
        interfaceC0734d.alpha(foxtrot, arVar.echo);
    }
}
