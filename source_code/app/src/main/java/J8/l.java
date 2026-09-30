package J8;

import i8.InterfaceC1904b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {
    public final InterfaceC1904b alpha;

    public l(InterfaceC1904b transportFactoryProvider) {
        Intrinsics.echo(transportFactoryProvider, "transportFactoryProvider");
        this.alpha = transportFactoryProvider;
    }

    public final void alpha(an anVar) {
        ((E5.q) ((B5.f) this.alpha.get())).alpha("FIREBASE_APPQUALITY_SESSION", new B5.c("json"), new B2.s(8, this)).alpha(new B5.a(anVar, B5.d.alpha, null), new A8.a(9));
    }
}
