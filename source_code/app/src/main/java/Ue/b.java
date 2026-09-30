package Ue;

import ge.InterfaceC1774f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import se.aq;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends h implements Function1 {
    public static final b alpha = new h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return u.alpha.bravo(aq.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        aq p02 = (aq) obj;
        Intrinsics.echo(p02, "p0");
        return Boolean.valueOf(p02.a0());
    }
}
