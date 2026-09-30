package D5;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes3.dex */
public final class f implements InterfaceC0733c {
    public static final f alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("clearBlob");
    public static final C0732b charlie = C0732b.charlie("encryptedBlob");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        p pVar = (p) ((ac) obj);
        interfaceC0734d.alpha(bravo, pVar.alpha);
        interfaceC0734d.alpha(charlie, pVar.bravo);
    }
}
