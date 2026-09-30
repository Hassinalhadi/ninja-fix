package kotlin.jvm.internal;

import ge.InterfaceC1772d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je.InterfaceC1966e;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public final class e implements InterfaceC1772d, d {
    public static final Map purple;
    public final Class alpha;

    static {
        int collectionSizeOrDefault;
        int i4 = 0;
        List listOf = CollectionsKt.listOf(Function0.class, Function1.class, Xd.l.class, Xd.m.class, Xd.n.class, Xd.o.class, Xd.p.class, Xd.q.class, Xd.r.class, Xd.s.class, Xd.a.class, Xd.b.class, InterfaceC1966e.class, Xd.c.class, Xd.d.class, Xd.e.class, Xd.f.class, Xd.g.class, Xd.h.class, Xd.i.class, Xd.j.class, Xd.k.class, InterfaceC1966e.class);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Object obj : listOf) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        purple = kotlin.collections.y.yankee(arrayList);
    }

    public e(Class jClass) {
        Intrinsics.echo(jClass, "jClass");
        this.alpha = jClass;
    }

    public static void oscar() {
        throw new Wd.a();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && Intrinsics.areEqual(AbstractC3062u.charlie(this), AbstractC3062u.charlie((InterfaceC1772d) obj))) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final List getTypeParameters() {
        oscar();
        throw null;
    }

    @Override // kotlin.jvm.internal.d
    public final Class golf() {
        return this.alpha;
    }

    @Override // ge.InterfaceC1772d
    public final int hashCode() {
        return AbstractC3062u.charlie(this).hashCode();
    }

    @Override // ge.InterfaceC1772d
    public final boolean hotel() {
        oscar();
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final boolean india() {
        oscar();
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final boolean isAbstract() {
        oscar();
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final String juliet() {
        String alpha;
        Class jClass = this.alpha;
        Intrinsics.echo(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (jClass.isArray()) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (alpha = j.alpha(componentType.getName())) != null) {
                str = alpha.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String alpha2 = j.alpha(jClass.getName());
        if (alpha2 == null) {
            return jClass.getCanonicalName();
        }
        return alpha2;
    }

    @Override // ge.InterfaceC1772d
    public final String kilo() {
        String bravo;
        Class jClass = this.alpha;
        Intrinsics.echo(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.plum(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt.plum(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            Intrinsics.checkNotNull(simpleName);
            return StringsKt.pink('$', simpleName, simpleName);
        }
        if (jClass.isArray()) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (bravo = j.bravo(componentType.getName())) != null) {
                str = bravo.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        }
        String bravo2 = j.bravo(jClass.getName());
        if (bravo2 == null) {
            return jClass.getSimpleName();
        }
        return bravo2;
    }

    @Override // ge.InterfaceC1772d
    public final Object lima() {
        oscar();
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final boolean mike() {
        oscar();
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final boolean november(Object obj) {
        Class jClass = this.alpha;
        Intrinsics.echo(jClass, "jClass");
        Map map = purple;
        Intrinsics.charlie(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return x.foxtrot(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC3062u.charlie(AbstractC3062u.echo(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final String toString() {
        return this.alpha + " (Kotlin reflection is not available)";
    }
}
