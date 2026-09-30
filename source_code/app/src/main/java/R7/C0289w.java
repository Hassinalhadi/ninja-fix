package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0289w implements InterfaceC0733c {
    public static final C0289w alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("rolloutId");
    public static final C0732b charlie = C0732b.charlie("variantId");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        F f5 = (F) ((h0) obj);
        interfaceC0734d.alpha(bravo, f5.alpha);
        interfaceC0734d.alpha(charlie, f5.bravo);
    }
}
