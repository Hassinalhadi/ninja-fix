package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0276i implements InterfaceC0733c {
    public static final C0276i alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("arch");
    public static final C0732b charlie = C0732b.charlie("model");
    public static final C0732b delta = C0732b.charlie("cores");
    public static final C0732b echo = C0732b.charlie("ram");
    public static final C0732b foxtrot = C0732b.charlie("diskSpace");
    public static final C0732b golf = C0732b.charlie("simulator");
    public static final C0732b hotel = C0732b.charlie("state");
    public static final C0732b india = C0732b.charlie("manufacturer");
    public static final C0732b juliet = C0732b.charlie("modelClass");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        an anVar = (an) ((W) obj);
        interfaceC0734d.echo(bravo, anVar.alpha);
        interfaceC0734d.alpha(charlie, anVar.bravo);
        interfaceC0734d.echo(delta, anVar.charlie);
        interfaceC0734d.foxtrot(echo, anVar.delta);
        interfaceC0734d.foxtrot(foxtrot, anVar.echo);
        interfaceC0734d.delta(golf, anVar.foxtrot);
        interfaceC0734d.echo(hotel, anVar.golf);
        interfaceC0734d.alpha(india, anVar.hotel);
        interfaceC0734d.alpha(juliet, anVar.india);
    }
}
