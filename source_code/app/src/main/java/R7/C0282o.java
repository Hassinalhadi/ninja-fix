package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0282o implements InterfaceC0733c {
    public static final C0282o alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("name");
    public static final C0732b charlie = C0732b.charlie("code");
    public static final C0732b delta = C0732b.charlie("address");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        au auVar = (au) ((Z) obj);
        interfaceC0734d.alpha(bravo, auVar.alpha);
        interfaceC0734d.alpha(charlie, auVar.bravo);
        interfaceC0734d.foxtrot(delta, auVar.charlie);
    }
}
