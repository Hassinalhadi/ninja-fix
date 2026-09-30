package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: R7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0279l implements InterfaceC0733c {
    public static final C0279l alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("baseAddress");
    public static final C0732b charlie = C0732b.charlie("size");
    public static final C0732b delta = C0732b.charlie("name");
    public static final C0732b echo = C0732b.charlie("uuid");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        byte[] bArr;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        as asVar = (as) ((X) obj);
        interfaceC0734d.foxtrot(bravo, asVar.alpha);
        interfaceC0734d.foxtrot(charlie, asVar.bravo);
        interfaceC0734d.alpha(delta, asVar.charlie);
        String str = asVar.delta;
        if (str != null) {
            bArr = str.getBytes(o0.alpha);
        } else {
            bArr = null;
        }
        interfaceC0734d.alpha(echo, bArr);
    }
}
