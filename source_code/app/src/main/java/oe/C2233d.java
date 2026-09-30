package oe;

import ao.ad;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import me.C2116d;
import ne.EnumC2181e;
import s6.A6;

/* renamed from: oe.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2233d {
    public static final String alpha;
    public static final String bravo;
    public static final String charlie;
    public static final String delta;
    public static final Ne.b echo;
    public static final Ne.c foxtrot;
    public static final Ne.b golf;
    public static final HashMap hotel;
    public static final HashMap india;
    public static final HashMap juliet;
    public static final HashMap kilo;
    public static final HashMap lima;
    public static final HashMap mike;
    public static final List november;

    static {
        StringBuilder sb2 = new StringBuilder();
        EnumC2181e enumC2181e = EnumC2181e.silver;
        sb2.append(enumC2181e.alpha.alpha.toString());
        sb2.append('.');
        sb2.append(enumC2181e.purple);
        alpha = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        EnumC2181e enumC2181e2 = EnumC2181e.white;
        sb3.append(enumC2181e2.alpha.alpha.toString());
        sb3.append('.');
        sb3.append(enumC2181e2.purple);
        bravo = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        EnumC2181e enumC2181e3 = EnumC2181e.teal;
        sb4.append(enumC2181e3.alpha.alpha.toString());
        sb4.append('.');
        sb4.append(enumC2181e3.purple);
        charlie = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        EnumC2181e enumC2181e4 = EnumC2181e.yellow;
        sb5.append(enumC2181e4.alpha.alpha.toString());
        sb5.append('.');
        sb5.append(enumC2181e4.purple);
        delta = sb5.toString();
        Ne.b juliet2 = Ne.b.juliet(new Ne.c("kotlin.jvm.functions.FunctionN"));
        echo = juliet2;
        foxtrot = juliet2.bravo();
        golf = Ne.i.november;
        delta(Class.class);
        hotel = new HashMap();
        india = new HashMap();
        juliet = new HashMap();
        kilo = new HashMap();
        lima = new HashMap();
        mike = new HashMap();
        Ne.b juliet3 = Ne.b.juliet(me.m.amber);
        Ne.c cVar = me.m.cyan;
        Ne.c golf2 = juliet3.golf();
        Ne.c golf3 = juliet3.golf();
        Intrinsics.delta(golf3, "kotlinReadOnly.packageFqName");
        C2232c c2232c = new C2232c(delta(Iterable.class), juliet3, new Ne.b(golf2, A6.alpha(cVar, golf3), false));
        Ne.b juliet4 = Ne.b.juliet(me.m.zulu);
        Ne.c cVar2 = me.m.crimson;
        Ne.c golf4 = juliet4.golf();
        Ne.c golf5 = juliet4.golf();
        Intrinsics.delta(golf5, "kotlinReadOnly.packageFqName");
        C2232c c2232c2 = new C2232c(delta(Iterator.class), juliet4, new Ne.b(golf4, A6.alpha(cVar2, golf5), false));
        Ne.b juliet5 = Ne.b.juliet(me.m.azure);
        Ne.c cVar3 = me.m.emerald;
        Ne.c golf6 = juliet5.golf();
        Ne.c golf7 = juliet5.golf();
        Intrinsics.delta(golf7, "kotlinReadOnly.packageFqName");
        C2232c c2232c3 = new C2232c(delta(Collection.class), juliet5, new Ne.b(golf6, A6.alpha(cVar3, golf7), false));
        Ne.b juliet6 = Ne.b.juliet(me.m.beige);
        Ne.c cVar4 = me.m.fuchsia;
        Ne.c golf8 = juliet6.golf();
        Ne.c golf9 = juliet6.golf();
        Intrinsics.delta(golf9, "kotlinReadOnly.packageFqName");
        C2232c c2232c4 = new C2232c(delta(List.class), juliet6, new Ne.b(golf8, A6.alpha(cVar4, golf9), false));
        Ne.b juliet7 = Ne.b.juliet(me.m.blue);
        Ne.c cVar5 = me.m.gray;
        Ne.c golf10 = juliet7.golf();
        Ne.c golf11 = juliet7.golf();
        Intrinsics.delta(golf11, "kotlinReadOnly.packageFqName");
        C2232c c2232c5 = new C2232c(delta(Set.class), juliet7, new Ne.b(golf10, A6.alpha(cVar5, golf11), false));
        Ne.b juliet8 = Ne.b.juliet(me.m.black);
        Ne.c cVar6 = me.m.gold;
        Ne.c golf12 = juliet8.golf();
        Ne.c golf13 = juliet8.golf();
        Intrinsics.delta(golf13, "kotlinReadOnly.packageFqName");
        C2232c c2232c6 = new C2232c(delta(ListIterator.class), juliet8, new Ne.b(golf12, A6.alpha(cVar6, golf13), false));
        Ne.c cVar7 = me.m.bronze;
        Ne.b juliet9 = Ne.b.juliet(cVar7);
        Ne.c cVar8 = me.m.green;
        Ne.c golf14 = juliet9.golf();
        Ne.c golf15 = juliet9.golf();
        Intrinsics.delta(golf15, "kotlinReadOnly.packageFqName");
        C2232c c2232c7 = new C2232c(delta(Map.class), juliet9, new Ne.b(golf14, A6.alpha(cVar8, golf15), false));
        Ne.b delta2 = Ne.b.juliet(cVar7).delta(me.m.coral.foxtrot());
        Ne.c cVar9 = me.m.indigo;
        Ne.c golf16 = delta2.golf();
        Ne.c golf17 = delta2.golf();
        Intrinsics.delta(golf17, "kotlinReadOnly.packageFqName");
        List<C2232c> listOf = CollectionsKt.listOf(c2232c, c2232c2, c2232c3, c2232c4, c2232c5, c2232c6, c2232c7, new C2232c(delta(Map.Entry.class), delta2, new Ne.b(golf16, A6.alpha(cVar9, golf17), false)));
        november = listOf;
        charlie(Object.class, me.m.alpha);
        charlie(String.class, me.m.foxtrot);
        charlie(CharSequence.class, me.m.echo);
        alpha(delta(Throwable.class), Ne.b.juliet(me.m.kilo));
        charlie(Cloneable.class, me.m.charlie);
        charlie(Number.class, me.m.india);
        alpha(delta(Comparable.class), Ne.b.juliet(me.m.lima));
        charlie(Enum.class, me.m.juliet);
        alpha(delta(Annotation.class), Ne.b.juliet(me.m.sierra));
        for (C2232c c2232c8 : listOf) {
            Ne.b bVar = c2232c8.alpha;
            Ne.b bVar2 = c2232c8.bravo;
            alpha(bVar, bVar2);
            Ne.b bVar3 = c2232c8.charlie;
            bravo(bVar3.bravo(), bVar);
            lima.put(bVar3, bVar2);
            mike.put(bVar2, bVar3);
            Ne.c bravo2 = bVar2.bravo();
            Ne.c bravo3 = bVar3.bravo();
            Ne.e india2 = bVar3.bravo().india();
            Intrinsics.delta(india2, "mutableClassId.asSingleFqName().toUnsafe()");
            juliet.put(india2, bravo2);
            Ne.e india3 = bravo2.india();
            Intrinsics.delta(india3, "readOnlyFqName.toUnsafe()");
            kilo.put(india3, bravo3);
        }
        for (Ve.c cVar10 : Ve.c.values()) {
            Ne.b juliet10 = Ne.b.juliet(cVar10.echo());
            me.j delta3 = cVar10.delta();
            Intrinsics.delta(delta3, "jvmType.primitiveType");
            alpha(juliet10, Ne.b.juliet(me.n.juliet.charlie(delta3.alpha)));
        }
        for (Ne.b bVar4 : C2116d.alpha) {
            alpha(Ne.b.juliet(new Ne.c("kotlin.jvm.internal." + bVar4.india().bravo() + "CompanionObject")), bVar4.delta(Ne.h.bravo));
        }
        for (int i4 = 0; i4 < 23; i4++) {
            alpha(Ne.b.juliet(new Ne.c(ad.zulu(i4, "kotlin.jvm.functions.Function"))), new Ne.b(me.n.juliet, Ne.f.echo("Function" + i4)));
            bravo(new Ne.c(bravo + i4), golf);
        }
        for (int i5 = 0; i5 < 22; i5++) {
            EnumC2181e enumC2181e5 = EnumC2181e.yellow;
            bravo(new Ne.c((enumC2181e5.alpha.alpha.toString() + '.' + enumC2181e5.purple) + i5), golf);
        }
        Ne.c golf18 = me.m.bravo.golf();
        Intrinsics.delta(golf18, "nothing.toSafe()");
        bravo(golf18, delta(Void.class));
    }

    public static void alpha(Ne.b bVar, Ne.b bVar2) {
        Ne.e india2 = bVar.bravo().india();
        Intrinsics.delta(india2, "javaClassId.asSingleFqName().toUnsafe()");
        hotel.put(india2, bVar2);
        bravo(bVar2.bravo(), bVar);
    }

    public static void bravo(Ne.c cVar, Ne.b bVar) {
        Ne.e india2 = cVar.india();
        Intrinsics.delta(india2, "kotlinFqNameUnsafe.toUnsafe()");
        india.put(india2, bVar);
    }

    public static void charlie(Class cls, Ne.e eVar) {
        Ne.c golf2 = eVar.golf();
        Intrinsics.delta(golf2, "kotlinFqName.toSafe()");
        alpha(delta(cls), Ne.b.juliet(golf2));
    }

    public static Ne.b delta(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return Ne.b.juliet(new Ne.c(cls.getCanonicalName()));
        }
        return delta(declaringClass).delta(Ne.f.echo(cls.getSimpleName()));
    }

    public static boolean echo(Ne.e eVar, String str) {
        Integer tango;
        String str2 = eVar.alpha;
        if (str2 != null) {
            String plum = StringsKt.plum(str2, str, "");
            if (plum.length() > 0 && !StringsKt.orange(plum, '0') && (tango = r.tango(plum)) != null && tango.intValue() >= 23) {
                return true;
            }
            return false;
        }
        Ne.e.alpha(4);
        throw null;
    }

    public static Ne.b foxtrot(Ne.e eVar) {
        if (echo(eVar, alpha) || echo(eVar, charlie)) {
            return echo;
        }
        if (echo(eVar, bravo) || echo(eVar, delta)) {
            return golf;
        }
        return (Ne.b) india.get(eVar);
    }
}
