package s6;

import com.google.android.gms.measurement.internal.C1473v;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public abstract class U5 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer alpha(C1473v c1473v, ge.w wVar, boolean z2) {
        int collectionSizeOrDefault;
        Object n5;
        KSerializer kSerializer;
        KSerializer alpha2;
        Jf.b bVar;
        InterfaceC1772d clazz = Nf.az.hotel(wVar);
        boolean alpha3 = wVar.alpha();
        List<ge.z> delta = wVar.delta();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(delta, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ge.z zVar : delta) {
            Intrinsics.echo(zVar, "<this>");
            ge.w wVar2 = zVar.bravo;
            if (wVar2 != null) {
                arrayList.add(wVar2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + wVar2).toString());
            }
        }
        if (arrayList.isEmpty()) {
            if (Nf.az.golf(clazz)) {
                C1473v.bravo(c1473v, clazz);
            }
            Nf.L l10 = Jf.g.alpha;
            if (!alpha3) {
                kSerializer = Jf.g.alpha.charlie(clazz);
                if (kSerializer == null) {
                    kSerializer = null;
                }
            } else {
                kSerializer = Jf.g.bravo.charlie(clazz);
            }
        } else {
            c1473v.getClass();
            Nf.L l11 = Jf.g.alpha;
            Intrinsics.echo(clazz, "clazz");
            if (!alpha3) {
                n5 = Jf.g.charlie.n(clazz, arrayList);
            } else {
                n5 = Jf.g.delta.n(clazz, arrayList);
            }
            Result.Companion companion = Result.INSTANCE;
            if (n5 instanceof kotlin.k) {
                n5 = null;
            }
            kSerializer = (KSerializer) n5;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            alpha2 = T5.delta(clazz);
            if (alpha2 == null) {
                C1473v.bravo(c1473v, clazz);
                if (Nf.az.golf(clazz)) {
                    bVar = new Jf.b(clazz);
                    alpha2 = bVar;
                }
                alpha2 = null;
            }
            if (alpha2 != null) {
                if (alpha3) {
                    return AbstractC2644e6.bravo(alpha2);
                }
                return alpha2;
            }
        } else {
            ArrayList echo = T5.echo(c1473v, arrayList, z2);
            if (echo != null) {
                alpha2 = T5.alpha(clazz, echo, new Jf.h(0, arrayList));
                if (alpha2 == null) {
                    if (Nf.az.golf(clazz)) {
                        bVar = new Jf.b(clazz);
                        alpha2 = bVar;
                    }
                    alpha2 = null;
                }
                if (alpha2 != null) {
                }
            }
        }
        return null;
    }
}
