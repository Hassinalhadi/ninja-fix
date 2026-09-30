package cf;

import ge.InterfaceC1774f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.h implements Function1 {
    public static final x alpha = new kotlin.jvm.internal.h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.bravo(Ne.b.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Ne.b p02 = (Ne.b) obj;
        Intrinsics.echo(p02, "p0");
        return p02.foxtrot();
    }
}
