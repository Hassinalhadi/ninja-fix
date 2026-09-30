package J8;

import android.os.Build;
import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: J8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0188c implements InterfaceC0733c {
    public static final C0188c alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("packageName");
    public static final C0732b charlie = C0732b.charlie("versionName");
    public static final C0732b delta = C0732b.charlie("appBuildVersion");
    public static final C0732b echo = C0732b.charlie("deviceManufacturer");
    public static final C0732b foxtrot = C0732b.charlie("currentProcessDetails");
    public static final C0732b golf = C0732b.charlie("appProcessDetails");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C0186a c0186a = (C0186a) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c0186a.alpha);
        interfaceC0734d.alpha(charlie, c0186a.bravo);
        interfaceC0734d.alpha(delta, c0186a.charlie);
        interfaceC0734d.alpha(echo, Build.MANUFACTURER);
        interfaceC0734d.alpha(foxtrot, c0186a.delta);
        interfaceC0734d.alpha(golf, c0186a.echo);
    }
}
