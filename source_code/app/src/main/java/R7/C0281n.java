package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.Constants;

/* renamed from: R7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0281n implements InterfaceC0733c {
    public static final C0281n alpha = new Object();
    public static final C0732b bravo = C0732b.charlie(Constants.KEY_TYPE);
    public static final C0732b charlie = C0732b.charlie("reason");
    public static final C0732b delta = C0732b.charlie("frames");
    public static final C0732b echo = C0732b.charlie("causedBy");
    public static final C0732b foxtrot = C0732b.charlie("overflowCount");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        at atVar = (at) ((Y) obj);
        interfaceC0734d.alpha(bravo, atVar.alpha);
        interfaceC0734d.alpha(charlie, atVar.bravo);
        interfaceC0734d.alpha(delta, atVar.charlie);
        interfaceC0734d.alpha(echo, atVar.delta);
        interfaceC0734d.echo(foxtrot, atVar.echo);
    }
}
