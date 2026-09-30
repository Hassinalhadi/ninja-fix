package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.Constants;

/* renamed from: R7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0285s implements InterfaceC0733c {
    public static final C0285s alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("batteryLevel");
    public static final C0732b charlie = C0732b.charlie("batteryVelocity");
    public static final C0732b delta = C0732b.charlie("proximityOn");
    public static final C0732b echo = C0732b.charlie(Constants.KEY_ORIENTATION);
    public static final C0732b foxtrot = C0732b.charlie("ramUsed");
    public static final C0732b golf = C0732b.charlie("diskUsed");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        B b2 = (B) ((f0) obj);
        interfaceC0734d.alpha(bravo, b2.alpha);
        interfaceC0734d.echo(charlie, b2.bravo);
        interfaceC0734d.delta(delta, b2.charlie);
        interfaceC0734d.echo(echo, b2.delta);
        interfaceC0734d.foxtrot(foxtrot, b2.echo);
        interfaceC0734d.foxtrot(golf, b2.foxtrot);
    }
}
