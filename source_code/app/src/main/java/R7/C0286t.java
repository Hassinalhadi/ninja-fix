package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.Constants;

/* renamed from: R7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0286t implements InterfaceC0733c {
    public static final C0286t alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("timestamp");
    public static final C0732b charlie = C0732b.charlie(Constants.KEY_TYPE);
    public static final C0732b delta = C0732b.charlie("app");
    public static final C0732b echo = C0732b.charlie("device");
    public static final C0732b foxtrot = C0732b.charlie("log");
    public static final C0732b golf = C0732b.charlie("rollouts");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ap apVar = (ap) ((k0) obj);
        interfaceC0734d.foxtrot(bravo, apVar.alpha);
        interfaceC0734d.alpha(charlie, apVar.bravo);
        interfaceC0734d.alpha(delta, apVar.charlie);
        interfaceC0734d.alpha(echo, apVar.delta);
        interfaceC0734d.alpha(foxtrot, apVar.echo);
        interfaceC0734d.alpha(golf, apVar.foxtrot);
    }
}
