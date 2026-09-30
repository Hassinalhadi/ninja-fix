package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0273f implements InterfaceC0733c {
    public static final C0273f alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("filename");
    public static final C0732b charlie = C0732b.charlie("contents");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ah ahVar = (ah) ((S) obj);
        interfaceC0734d.alpha(bravo, ahVar.alpha);
        interfaceC0734d.alpha(charlie, ahVar.bravo);
    }
}
