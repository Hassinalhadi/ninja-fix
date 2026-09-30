package ge;

import g0.C1726f;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.N;
import je.T;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class ah {
    public static C1726f alpha;

    public static final String alpha(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                InterfaceC2358h lima = AbstractC2360j.lima(type, ag.alpha);
                return ((Class) AbstractC2360j.november(lima)).getName() + kotlin.text.r.mike(AbstractC2360j.echo(lima), _UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return cls.getName();
        }
        return type.toString();
    }

    public static final Type bravo(w wVar, boolean z2) {
        Class bravo;
        int i4;
        InterfaceC1773e foxtrot = wVar.foxtrot();
        if (foxtrot instanceof x) {
            return new ae((x) foxtrot);
        }
        if (foxtrot instanceof InterfaceC1772d) {
            InterfaceC1772d interfaceC1772d = (InterfaceC1772d) foxtrot;
            if (z2) {
                bravo = AbstractC3062u.charlie(interfaceC1772d);
            } else {
                bravo = AbstractC3062u.bravo(interfaceC1772d);
            }
            List delta = wVar.delta();
            if (!delta.isEmpty()) {
                if (bravo.isArray()) {
                    if (!bravo.getComponentType().isPrimitive()) {
                        z zVar = (z) CollectionsKt.m(delta);
                        if (zVar != null) {
                            aa aaVar = zVar.alpha;
                            if (aaVar == null) {
                                i4 = -1;
                            } else {
                                i4 = af.$EnumSwitchMapping$0[aaVar.ordinal()];
                            }
                            if (i4 != -1 && i4 != 1) {
                                if (i4 != 2 && i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                w wVar2 = zVar.bravo;
                                Intrinsics.checkNotNull(wVar2);
                                Type bravo2 = bravo(wVar2, false);
                                if (!(bravo2 instanceof Class)) {
                                    return new C1769a(bravo2);
                                }
                                return bravo;
                            }
                            return bravo;
                        }
                        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + wVar);
                    }
                    return bravo;
                }
                return charlie(bravo, delta);
            }
            return bravo;
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + wVar);
    }

    public static final ad charlie(Class cls, List list) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(echo((z) it.next()));
            }
            return new ad(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(echo((z) it2.next()));
            }
            return new ad(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        ad charlie = charlie(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(echo((z) it3.next()));
        }
        return new ad(cls, charlie, arrayList3);
    }

    public static final Type delta(w wVar) {
        Type type;
        Intrinsics.echo(wVar, "<this>");
        if (wVar instanceof kotlin.jvm.internal.k) {
            T t5 = ((N) ((kotlin.jvm.internal.k) wVar)).purple;
            if (t5 != null) {
                type = (Type) t5.invoke();
            } else {
                type = null;
            }
            if (type != null) {
                return type;
            }
        }
        return bravo(wVar, false);
    }

    public static final Type echo(z zVar) {
        aa aaVar = zVar.alpha;
        if (aaVar == null) {
            return ai.red;
        }
        w wVar = zVar.bravo;
        Intrinsics.checkNotNull(wVar);
        int i4 = af.$EnumSwitchMapping$0[aaVar.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return new ai(bravo(wVar, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return bravo(wVar, true);
        }
        return new ai(null, bravo(wVar, true));
    }

    public static long foxtrot(long j5) {
        return (j5 >>> 1) ^ (-(1 & j5));
    }
}
