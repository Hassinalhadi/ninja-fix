package pe;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oe.C2240k;

/* renamed from: pe.ac, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2320ac extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ J2.i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2320ac(J2.i iVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2331g interfaceC2331g;
        int i4;
        switch (this.alpha) {
            case 0:
                C2318aa c2318aa = (C2318aa) obj;
                Intrinsics.echo(c2318aa, "<name for destructuring parameter 0>");
                Ne.b bVar = c2318aa.alpha;
                if (!bVar.charlie) {
                    Ne.b foxtrot = bVar.foxtrot();
                    J2.i iVar = this.purple;
                    List list = c2318aa.bravo;
                    if (foxtrot != null) {
                        interfaceC2331g = iVar.alpha(foxtrot, CollectionsKt.crimson(list));
                    } else {
                        ff.e eVar = (ff.e) iVar.red;
                        Ne.c golf = bVar.golf();
                        Intrinsics.delta(golf, "classId.packageFqName");
                        interfaceC2331g = (InterfaceC2331g) eVar.invoke(golf);
                    }
                    InterfaceC2331g interfaceC2331g2 = interfaceC2331g;
                    boolean z2 = !bVar.bravo.echo().delta();
                    ff.l lVar = (ff.l) iVar.alpha;
                    Ne.f india = bVar.india();
                    Intrinsics.delta(india, "classId.shortClassName");
                    Integer num = (Integer) CollectionsKt.green(list);
                    if (num != null) {
                        i4 = num.intValue();
                    } else {
                        i4 = 0;
                    }
                    return new C2319ab(lVar, interfaceC2331g2, india, z2, i4);
                }
                throw new UnsupportedOperationException("Unresolved local class: " + bVar);
            default:
                Ne.c fqName = (Ne.c) obj;
                Intrinsics.echo(fqName, "fqName");
                return new C2240k((InterfaceC2349y) this.purple.purple, fqName, 1);
        }
    }
}
