package ve;

import ge.InterfaceC1774f;
import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.h implements Function1 {
    public static final k alpha = new kotlin.jvm.internal.h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.bravo(t.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Constructor p02 = (Constructor) obj;
        Intrinsics.echo(p02, "p0");
        return new t(p02);
    }
}
