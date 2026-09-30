package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0268a implements InterfaceC0733c {
    public static final C0268a alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("arch");
    public static final C0732b charlie = C0732b.charlie("libraryName");
    public static final C0732b delta = C0732b.charlie("buildId");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ae aeVar = (ae) ((O) obj);
        interfaceC0734d.alpha(bravo, aeVar.alpha);
        interfaceC0734d.alpha(charlie, aeVar.bravo);
        interfaceC0734d.alpha(delta, aeVar.charlie);
    }
}
