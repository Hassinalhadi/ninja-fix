package pe;

import ge.InterfaceC1774f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2342r extends kotlin.jvm.internal.h implements Function1 {
    public static final C2342r alpha = new kotlin.jvm.internal.h(1);

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
