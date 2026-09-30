package s6;

import ff.C1717b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.t7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2779t7 {
    public static final kotlin.reflect.jvm.internal.impl.types.as alpha(kotlin.reflect.jvm.internal.impl.types.as asVar, pe.aq aqVar) {
        if (aqVar != null && asVar.alpha() != 1) {
            if (aqVar.fuchsia() == asVar.alpha()) {
                if (asVar.charlie()) {
                    C1717b NO_LOCKS = ff.l.echo;
                    Intrinsics.delta(NO_LOCKS, "NO_LOCKS");
                    return new kotlin.reflect.jvm.internal.impl.types.at(1, new kotlin.reflect.jvm.internal.impl.types.ac(NO_LOCKS, new Lb.C(11, asVar)));
                }
                return new kotlin.reflect.jvm.internal.impl.types.at(asVar.bravo());
            }
            Re.c cVar = new Re.c(asVar);
            kotlin.reflect.jvm.internal.impl.types.al.purple.getClass();
            return new kotlin.reflect.jvm.internal.impl.types.at(1, new Re.a(asVar, cVar, false, kotlin.reflect.jvm.internal.impl.types.al.red));
        }
        return asVar;
    }

    public static kotlin.reflect.jvm.internal.impl.types.av bravo(kotlin.reflect.jvm.internal.impl.types.av avVar) {
        int collectionSizeOrDefault;
        if (avVar instanceof kotlin.reflect.jvm.internal.impl.types.v) {
            kotlin.reflect.jvm.internal.impl.types.v vVar = (kotlin.reflect.jvm.internal.impl.types.v) avVar;
            kotlin.reflect.jvm.internal.impl.types.as[] asVarArr = vVar.charlie;
            pe.aq[] aqVarArr = vVar.bravo;
            ArrayList i4 = ArraysKt.i(asVarArr, aqVarArr);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(i4, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = i4.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(alpha((kotlin.reflect.jvm.internal.impl.types.as) pair.getFirst(), (pe.aq) pair.getSecond()));
            }
            return new kotlin.reflect.jvm.internal.impl.types.v(aqVarArr, (kotlin.reflect.jvm.internal.impl.types.as[]) arrayList.toArray(new kotlin.reflect.jvm.internal.impl.types.as[0]), true);
        }
        return new Re.d(avVar, 0);
    }

    public static void charlie(int i4, int i5) {
        String bravo;
        if (i4 >= 0 && i4 < i5) {
            return;
        }
        if (i4 >= 0) {
            if (i5 < 0) {
                throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
            }
            bravo = AbstractC2788u7.bravo("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            bravo = AbstractC2788u7.bravo("%s (%s) must not be negative", "index", Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(bravo);
    }

    public static void delta(int i4, int i5, int i10) {
        String echo;
        if (i4 >= 0 && i5 >= i4 && i5 <= i10) {
            return;
        }
        if (i4 >= 0 && i4 <= i10) {
            if (i5 >= 0 && i5 <= i10) {
                echo = AbstractC2788u7.bravo("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
            } else {
                echo = echo(i5, i10, "end index");
            }
        } else {
            echo = echo(i4, i10, "start index");
        }
        throw new IndexOutOfBoundsException(echo);
    }

    public static String echo(int i4, int i5, String str) {
        if (i4 < 0) {
            return AbstractC2788u7.bravo("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return AbstractC2788u7.bravo("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(ao.ad.zulu(i5, "negative size: "));
    }
}
