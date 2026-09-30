package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0288v implements InterfaceC0733c {
    public static final C0288v alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("rolloutVariant");
    public static final C0732b charlie = C0732b.charlie("parameterKey");
    public static final C0732b delta = C0732b.charlie("parameterValue");
    public static final C0732b echo = C0732b.charlie("templateVersion");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        E e = (E) ((i0) obj);
        interfaceC0734d.alpha(bravo, e.alpha);
        interfaceC0734d.alpha(charlie, e.bravo);
        interfaceC0734d.alpha(delta, e.charlie);
        interfaceC0734d.foxtrot(echo, e.delta);
    }
}
