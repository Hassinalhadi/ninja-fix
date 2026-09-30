package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0283p implements InterfaceC0733c {
    public static final C0283p alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("name");
    public static final C0732b charlie = C0732b.charlie("importance");
    public static final C0732b delta = C0732b.charlie("frames");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        av avVar = (av) ((b0) obj);
        interfaceC0734d.alpha(bravo, avVar.alpha);
        interfaceC0734d.echo(charlie, avVar.bravo);
        interfaceC0734d.alpha(delta, avVar.charlie);
    }
}
