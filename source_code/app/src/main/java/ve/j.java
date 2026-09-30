package ve;

import ge.InterfaceC1774f;
import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.h implements Function1 {
    public static final j alpha = new kotlin.jvm.internal.h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.bravo(Member.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p02 = (Member) obj;
        Intrinsics.echo(p02, "p0");
        return Boolean.valueOf(p02.isSynthetic());
    }
}
