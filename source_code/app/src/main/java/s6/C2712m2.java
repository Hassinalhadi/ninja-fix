package s6;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import pe.AbstractC2327c;

/* renamed from: s6.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712m2 implements InterfaceC0733c {
    public static final C2712m2 alpha = new Object();
    public static final C0732b bravo = new C0732b("imageFormat", A0.z.november(AbstractC2327c.yankee(Q.class, new N(1))));
    public static final C0732b charlie = new C0732b("originalImageSize", A0.z.november(AbstractC2327c.yankee(Q.class, new N(2))));
    public static final C0732b delta = new C0732b("compressedImageSize", A0.z.november(AbstractC2327c.yankee(Q.class, new N(3))));
    public static final C0732b echo = new C0732b("isOdmlImage", A0.z.november(AbstractC2327c.yankee(Q.class, new N(4))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2697k5 c2697k5 = (C2697k5) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.alpha(bravo, c2697k5.alpha);
        interfaceC0734d.alpha(charlie, c2697k5.bravo);
        interfaceC0734d.alpha(delta, null);
        interfaceC0734d.alpha(echo, null);
    }
}
