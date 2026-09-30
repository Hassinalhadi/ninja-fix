package se;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ne.C2183g;
import pe.InterfaceC2345u;
import qe.C2474j;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class ap extends aq {
    public final Lazy e;

    public ap(InterfaceC2345u interfaceC2345u, aq aqVar, int i4, InterfaceC2472h interfaceC2472h, Ne.f fVar, kotlin.reflect.jvm.internal.impl.types.y yVar, boolean z2, boolean z10, boolean z11, kotlin.reflect.jvm.internal.impl.types.y yVar2, pe.an anVar, Function0 function0) {
        super(interfaceC2345u, aqVar, i4, interfaceC2472h, fVar, yVar, z2, z10, z11, yVar2, anVar);
        this.e = LazyKt.lazy(function0);
    }

    @Override // se.aq
    public final aq Z(C2183g c2183g, Ne.f fVar, int i4) {
        InterfaceC2472h annotations = getAnnotations();
        Intrinsics.delta(annotations, "annotations");
        kotlin.reflect.jvm.internal.impl.types.y type = getType();
        Intrinsics.delta(type, "type");
        boolean a02 = a0();
        pe.ao aoVar = pe.an.magenta;
        C2474j c2474j = new C2474j(6, this);
        return new ap(c2183g, null, i4, annotations, fVar, type, a02, this.f13745a, this.f13746b, this.f13747c, aoVar, c2474j);
    }
}
