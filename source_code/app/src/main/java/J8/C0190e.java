package J8;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: J8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0190e implements InterfaceC0733c {
    public static final C0190e alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("performance");
    public static final C0732b charlie = C0732b.charlie("crashlytics");
    public static final C0732b delta = C0732b.charlie("sessionSamplingRate");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        k kVar = (k) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, kVar.alpha);
        interfaceC0734d.alpha(charlie, kVar.bravo);
        interfaceC0734d.golf(delta, kVar.charlie);
    }
}
