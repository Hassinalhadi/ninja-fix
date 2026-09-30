package gf;

import ef.C1656d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.aq;
import s6.O5;

/* renamed from: gf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1790e {
    public static final C1790e alpha = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static ae bravo(ae aeVar) {
        int collectionSizeOrDefault;
        B b2;
        int collectionSizeOrDefault2;
        y bravo;
        ap green = aeVar.green();
        aq aqVar = null;
        B b4 = null;
        if (green instanceof Re.c) {
            Re.c cVar = (Re.c) green;
            as asVar = cVar.alpha;
            if (asVar.alpha() != 2) {
                asVar = null;
            }
            if (asVar != null && (bravo = asVar.bravo()) != null) {
                b2 = bravo.ochre();
            } else {
                b2 = null;
            }
            if (cVar.bravo == null) {
                Collection lima = cVar.lima();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(lima, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                Iterator it = lima.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y) it.next()).ochre());
                }
                as projection = cVar.alpha;
                Intrinsics.echo(projection, "projection");
                cVar.bravo = new C1794i(projection, new C1656d(1, arrayList), aqVar, 8);
            }
            C1794i c1794i = cVar.bravo;
            Intrinsics.checkNotNull(c1794i);
            return new C1793h(1, c1794i, b2, aeVar.gold(), aeVar.indigo(), 32);
        }
        if ((green instanceof x) && aeVar.indigo()) {
            x xVar = (x) green;
            LinkedHashSet linkedHashSet = xVar.bravo;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = linkedHashSet.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                arrayList2.add(O5.juliet((y) it2.next()));
                z2 = true;
            }
            if (z2) {
                y yVar = xVar.alpha;
                if (yVar != null) {
                    b4 = O5.juliet(yVar);
                }
                arrayList2.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                linkedHashSet2.hashCode();
                x xVar2 = new x(linkedHashSet2);
                xVar2.alpha = b4;
                aqVar = xVar2;
            }
            if (aqVar != null) {
                xVar = aqVar;
            }
            return xVar.bravo();
        }
        return aeVar;
    }

    public final B alpha(p000if.c type) {
        B alpha2;
        y yVar;
        Intrinsics.echo(type, "type");
        if (type instanceof y) {
            B ochre = ((y) type).ochre();
            if (ochre instanceof ae) {
                alpha2 = bravo((ae) ochre);
            } else if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.s) {
                kotlin.reflect.jvm.internal.impl.types.s sVar = (kotlin.reflect.jvm.internal.impl.types.s) ochre;
                ae aeVar = sVar.purple;
                ae bravo = bravo(aeVar);
                ae aeVar2 = sVar.red;
                ae bravo2 = bravo(aeVar2);
                if (bravo == aeVar && bravo2 == aeVar2) {
                    alpha2 = ochre;
                } else {
                    alpha2 = ab.alpha(bravo, bravo2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Ce.l lVar = new Ce.l(1, this, 6);
            y echo = kotlin.reflect.jvm.internal.impl.types.c.echo(ochre);
            if (echo != null) {
                yVar = (y) lVar.invoke(echo);
            } else {
                yVar = null;
            }
            return kotlin.reflect.jvm.internal.impl.types.c.amber(alpha2, yVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
