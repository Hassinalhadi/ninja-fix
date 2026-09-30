package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0272e implements InterfaceC0733c {
    public static final C0272e alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("files");
    public static final C0732b charlie = C0732b.charlie("orgId");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ag agVar = (ag) ((T) obj);
        interfaceC0734d.alpha(bravo, agVar.alpha);
        interfaceC0734d.alpha(charlie, agVar.bravo);
    }
}
