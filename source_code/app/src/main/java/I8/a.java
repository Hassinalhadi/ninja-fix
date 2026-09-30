package I8;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC0733c {
    public static final a alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("rolloutId");
    public static final C0732b charlie = C0732b.charlie("variantId");
    public static final C0732b delta = C0732b.charlie("parameterKey");
    public static final C0732b echo = C0732b.charlie("parameterValue");
    public static final C0732b foxtrot = C0732b.charlie("templateVersion");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        c cVar = (c) ((e) obj);
        interfaceC0734d.alpha(bravo, cVar.bravo);
        interfaceC0734d.alpha(charlie, cVar.charlie);
        interfaceC0734d.alpha(delta, cVar.delta);
        interfaceC0734d.alpha(echo, cVar.echo);
        interfaceC0734d.foxtrot(foxtrot, cVar.foxtrot);
    }
}
