package ie;

import Ie.y;
import Xd.l;
import cf.q;
import ge.InterfaceC1774f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;

/* renamed from: ie.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1917a extends h implements l {
    public static final C1917a alpha = new h(2);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return u.alpha.bravo(q.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        q p02 = (q) obj;
        y p12 = (y) obj2;
        Intrinsics.echo(p02, "p0");
        Intrinsics.echo(p12, "p1");
        return p02.echo(p12);
    }
}
