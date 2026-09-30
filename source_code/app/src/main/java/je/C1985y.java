package je;

import ge.InterfaceC1774f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1985y extends kotlin.jvm.internal.h implements Xd.l {
    public static final C1985y alpha = new kotlin.jvm.internal.h(2);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.bravo(cf.q.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        cf.q p02 = (cf.q) obj;
        Ie.ag p12 = (Ie.ag) obj2;
        Intrinsics.echo(p02, "p0");
        Intrinsics.echo(p12, "p1");
        return p02.foxtrot(p12);
    }
}
