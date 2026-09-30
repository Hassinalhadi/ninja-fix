package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes2.dex */
public final class r implements InterfaceC0733c {
    public static final r alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("processName");
    public static final C0732b charlie = C0732b.charlie("pid");
    public static final C0732b delta = C0732b.charlie("importance");
    public static final C0732b echo = C0732b.charlie("defaultProcess");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        az azVar = (az) ((d0) obj);
        interfaceC0734d.alpha(bravo, azVar.alpha);
        interfaceC0734d.echo(charlie, azVar.bravo);
        interfaceC0734d.echo(delta, azVar.charlie);
        interfaceC0734d.delta(echo, azVar.delta);
    }
}
