package J8;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: J8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0192g implements InterfaceC0733c {
    public static final C0192g alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("eventType");
    public static final C0732b charlie = C0732b.charlie("sessionData");
    public static final C0732b delta = C0732b.charlie("applicationInfo");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        an anVar = (an) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        anVar.getClass();
        interfaceC0734d.alpha(bravo, n.SESSION_START);
        interfaceC0734d.alpha(charlie, anVar.alpha);
        interfaceC0734d.alpha(delta, anVar.bravo);
    }
}
