package Ne;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    public static final c alpha;
    public static final c bravo;
    public static final c charlie;
    public static final c delta;
    public static final c echo;
    public static final c foxtrot;
    public static final c golf;
    public static final b hotel;
    public static final b india;
    public static final b juliet;
    public static final b kilo;
    public static final b lima;
    public static final b mike;
    public static final b november;
    public static final Set oscar;
    public static final Set papa;
    public static final b quebec;
    public static final b romeo;
    public static final b sierra;
    public static final b tango;

    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        c cVar = new c("kotlin");
        alpha = cVar;
        c charlie2 = cVar.charlie(f.echo("reflect"));
        bravo = charlie2;
        c charlie3 = cVar.charlie(f.echo("collections"));
        charlie = charlie3;
        c charlie4 = cVar.charlie(f.echo("ranges"));
        delta = charlie4;
        cVar.charlie(f.echo("jvm")).charlie(f.echo("internal"));
        c charlie5 = cVar.charlie(f.echo("annotation"));
        echo = charlie5;
        c charlie6 = cVar.charlie(f.echo("internal"));
        charlie6.charlie(f.echo("ir"));
        c charlie7 = cVar.charlie(f.echo("coroutines"));
        foxtrot = charlie7;
        golf = cVar.charlie(f.echo("enums"));
        ArraysKt.g(new c[]{cVar, charlie3, charlie4, charlie5, charlie2, charlie6, charlie7});
        j.alpha("Nothing");
        j.alpha("Unit");
        j.alpha("Any");
        j.alpha("Enum");
        j.alpha("Annotation");
        hotel = j.alpha("Array");
        b alpha2 = j.alpha("Boolean");
        b alpha3 = j.alpha("Char");
        b alpha4 = j.alpha("Byte");
        b alpha5 = j.alpha("Short");
        b alpha6 = j.alpha("Int");
        b alpha7 = j.alpha("Long");
        b alpha8 = j.alpha("Float");
        b alpha9 = j.alpha("Double");
        india = j.foxtrot(alpha4);
        juliet = j.foxtrot(alpha5);
        kilo = j.foxtrot(alpha6);
        lima = j.foxtrot(alpha7);
        j.alpha("CharSequence");
        mike = j.alpha("String");
        j.alpha("Throwable");
        j.alpha("Cloneable");
        j.echo("KProperty");
        j.echo("KMutableProperty");
        j.echo("KProperty0");
        j.echo("KMutableProperty0");
        j.echo("KProperty1");
        j.echo("KMutableProperty1");
        j.echo("KProperty2");
        j.echo("KMutableProperty2");
        november = j.echo("KFunction");
        j.echo("KClass");
        j.echo("KCallable");
        j.alpha("Comparable");
        j.alpha("Number");
        j.alpha("Function");
        Set g2 = ArraysKt.g(new b[]{alpha2, alpha3, alpha4, alpha5, alpha6, alpha7, alpha8, alpha9});
        oscar = g2;
        Set set = g2;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        int quebec2 = y.quebec(collectionSizeOrDefault);
        int i4 = 16;
        if (quebec2 < 16) {
            quebec2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec2);
        for (Object obj : set) {
            f india2 = ((b) obj).india();
            Intrinsics.delta(india2, "id.shortClassName");
            linkedHashMap.put(obj, j.delta(india2));
        }
        j.charlie(linkedHashMap);
        Set g5 = ArraysKt.g(new b[]{india, juliet, kilo, lima});
        papa = g5;
        Set set2 = g5;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10);
        int quebec3 = y.quebec(collectionSizeOrDefault2);
        if (quebec3 >= 16) {
            i4 = quebec3;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
        for (Object obj2 : set2) {
            f india3 = ((b) obj2).india();
            Intrinsics.delta(india3, "id.shortClassName");
            linkedHashMap2.put(obj2, j.delta(india3));
        }
        j.charlie(linkedHashMap2);
        ab.november(ab.mike(oscar, papa), mike);
        c cVar2 = foxtrot;
        f echo2 = f.echo("Continuation");
        if (cVar2 != null) {
            c.juliet(echo2);
            j.bravo("Iterator");
            j.bravo("Iterable");
            j.bravo("Collection");
            j.bravo("List");
            j.bravo("ListIterator");
            j.bravo("Set");
            b bravo2 = j.bravo("Map");
            j.bravo("MutableIterator");
            j.bravo("CharIterator");
            j.bravo("MutableIterable");
            j.bravo("MutableCollection");
            quebec = j.bravo("MutableList");
            j.bravo("MutableListIterator");
            romeo = j.bravo("MutableSet");
            b bravo3 = j.bravo("MutableMap");
            sierra = bravo3;
            bravo2.delta(f.echo("Entry"));
            bravo3.delta(f.echo("MutableEntry"));
            j.alpha("Result");
            c cVar3 = delta;
            f echo3 = f.echo("IntRange");
            if (cVar3 != null) {
                c.juliet(echo3);
                c.juliet(f.echo("LongRange"));
                c.juliet(f.echo("CharRange"));
                c cVar4 = echo;
                f echo4 = f.echo("AnnotationRetention");
                if (cVar4 != null) {
                    c.juliet(echo4);
                    c.juliet(f.echo("AnnotationTarget"));
                    tango = new b(golf, f.echo("EnumEntries"));
                    return;
                }
                b.alpha(3);
                throw null;
            }
            b.alpha(3);
            throw null;
        }
        b.alpha(3);
        throw null;
    }
}
