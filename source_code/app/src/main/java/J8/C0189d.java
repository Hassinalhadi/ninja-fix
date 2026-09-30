package J8;

import android.os.Build;
import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;

/* renamed from: J8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0189d implements InterfaceC0733c {
    public static final C0189d alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("appId");
    public static final C0732b charlie = C0732b.charlie("deviceModel");
    public static final C0732b delta = C0732b.charlie("sessionSdkVersion");
    public static final C0732b echo = C0732b.charlie("osVersion");
    public static final C0732b foxtrot = C0732b.charlie("logEnvironment");
    public static final C0732b golf = C0732b.charlie("androidAppInfo");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C0187b c0187b = (C0187b) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c0187b.alpha);
        interfaceC0734d.alpha(charlie, Build.MODEL);
        interfaceC0734d.alpha(delta, "2.1.2");
        interfaceC0734d.alpha(echo, Build.VERSION.RELEASE);
        interfaceC0734d.alpha(foxtrot, ac.LOG_ENVIRONMENT_PROD);
        interfaceC0734d.alpha(golf, c0187b.bravo);
    }
}
