package me;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class m {
    public static final Ne.c amber;
    public static final Ne.c azure;
    public static final Ne.c beige;
    public static final Ne.c black;
    public static final Ne.c blue;
    public static final Ne.c bronze;
    public static final Ne.c coral;
    public static final Ne.c crimson;
    public static final Ne.c cyan;
    public static final Ne.e delta;
    public static final Ne.e echo;
    public static final Ne.c emerald;
    public static final Ne.e foxtrot;
    public static final Ne.c fuchsia;
    public static final Ne.c gold;
    public static final Ne.e golf;
    public static final Ne.c gray;
    public static final Ne.c green;
    public static final Ne.e hotel;
    public static final Ne.e india;
    public static final Ne.c indigo;
    public static final Ne.e ivory;
    public static final Ne.b jade;
    public static final Ne.e juliet;
    public static final Ne.c kilo;
    public static final Ne.b lavender;
    public static final Ne.c lima;
    public static final Ne.b lime;
    public static final Ne.b magenta;
    public static final Ne.b maroon;
    public static final Ne.c mike;
    public static final Ne.c navy;
    public static final Ne.c november;
    public static final Ne.c ochre;
    public static final Ne.c olive;
    public static final Ne.c orange;
    public static final Ne.c oscar;
    public static final Ne.c papa;
    public static final HashSet peach;
    public static final HashSet pink;
    public static final HashMap plum;
    public static final HashMap purple;
    public static final Ne.c quebec;
    public static final Ne.c romeo;
    public static final Ne.c sierra;
    public static final Ne.c tango;
    public static final Ne.c uniform;
    public static final Ne.c victor;
    public static final Ne.c whiskey;
    public static final Ne.c xray;
    public static final Ne.c yankee;
    public static final Ne.c zulu;
    public static final Ne.e alpha = delta("Any");
    public static final Ne.e bravo = delta("Nothing");
    public static final Ne.e charlie = delta("Cloneable");

    static {
        int i4;
        int i5;
        int i10;
        charlie("Suppress");
        delta = delta("Unit");
        echo = delta("CharSequence");
        foxtrot = delta("String");
        golf = delta("Array");
        hotel = delta("Boolean");
        delta("Char");
        delta("Byte");
        delta("Short");
        delta("Int");
        delta("Long");
        delta("Float");
        delta("Double");
        india = delta("Number");
        juliet = delta("Enum");
        delta("Function");
        kilo = charlie("Throwable");
        lima = charlie("Comparable");
        Ne.c cVar = n.mike;
        Intrinsics.delta(cVar.charlie(Ne.f.echo("IntRange")).india(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
        Intrinsics.delta(cVar.charlie(Ne.f.echo("LongRange")).india(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
        mike = charlie("Deprecated");
        charlie("DeprecatedSinceKotlin");
        november = charlie("DeprecationLevel");
        oscar = charlie("ReplaceWith");
        papa = charlie("ExtensionFunctionType");
        quebec = charlie("ContextFunctionTypeParams");
        Ne.c charlie2 = charlie("ParameterName");
        romeo = charlie2;
        Ne.b.juliet(charlie2);
        sierra = charlie("Annotation");
        Ne.c alpha2 = alpha("Target");
        tango = alpha2;
        Ne.b.juliet(alpha2);
        uniform = alpha("AnnotationTarget");
        victor = alpha("AnnotationRetention");
        Ne.c alpha3 = alpha("Retention");
        whiskey = alpha3;
        Ne.b.juliet(alpha3);
        Ne.b.juliet(alpha("Repeatable"));
        xray = alpha("MustBeDocumented");
        yankee = charlie("UnsafeVariance");
        charlie("PublishedApi");
        n.november.charlie(Ne.f.echo("AccessibleLateinitPropertyLiteral"));
        zulu = bravo("Iterator");
        amber = bravo("Iterable");
        azure = bravo("Collection");
        beige = bravo("List");
        black = bravo("ListIterator");
        blue = bravo("Set");
        Ne.c bravo2 = bravo("Map");
        bronze = bravo2;
        coral = bravo2.charlie(Ne.f.echo("Entry"));
        crimson = bravo("MutableIterator");
        cyan = bravo("MutableIterable");
        emerald = bravo("MutableCollection");
        fuchsia = bravo("MutableList");
        gold = bravo("MutableListIterator");
        gray = bravo("MutableSet");
        Ne.c bravo3 = bravo("MutableMap");
        green = bravo3;
        indigo = bravo3.charlie(Ne.f.echo("MutableEntry"));
        ivory = echo("KClass");
        echo("KCallable");
        echo("KProperty0");
        echo("KProperty1");
        echo("KProperty2");
        echo("KMutableProperty0");
        echo("KMutableProperty1");
        echo("KMutableProperty2");
        Ne.e echo2 = echo("KProperty");
        echo("KMutableProperty");
        jade = Ne.b.juliet(echo2.golf());
        echo("KDeclarationContainer");
        Ne.c charlie3 = charlie("UByte");
        Ne.c charlie4 = charlie("UShort");
        Ne.c charlie5 = charlie("UInt");
        Ne.c charlie6 = charlie("ULong");
        lavender = Ne.b.juliet(charlie3);
        lime = Ne.b.juliet(charlie4);
        magenta = Ne.b.juliet(charlie5);
        maroon = Ne.b.juliet(charlie6);
        navy = charlie("UByteArray");
        ochre = charlie("UShortArray");
        olive = charlie("UIntArray");
        orange = charlie("ULongArray");
        int length = j.values().length;
        int i11 = 3;
        if (length < 3) {
            i4 = 3;
        } else {
            i4 = (length / 3) + length + 1;
        }
        HashSet hashSet = new HashSet(i4);
        for (j jVar : j.values()) {
            hashSet.add(jVar.alpha);
        }
        peach = hashSet;
        int length2 = j.values().length;
        if (length2 < 3) {
            i5 = 3;
        } else {
            i5 = (length2 / 3) + length2 + 1;
        }
        HashSet hashSet2 = new HashSet(i5);
        for (j jVar2 : j.values()) {
            hashSet2.add(jVar2.purple);
        }
        pink = hashSet2;
        int length3 = j.values().length;
        if (length3 < 3) {
            i10 = 3;
        } else {
            i10 = (length3 / 3) + length3 + 1;
        }
        HashMap hashMap = new HashMap(i10);
        for (j jVar3 : j.values()) {
            String bravo4 = jVar3.alpha.bravo();
            Intrinsics.delta(bravo4, "primitiveType.typeName.asString()");
            hashMap.put(delta(bravo4), jVar3);
        }
        plum = hashMap;
        int length4 = j.values().length;
        if (length4 >= 3) {
            i11 = (length4 / 3) + length4 + 1;
        }
        HashMap hashMap2 = new HashMap(i11);
        for (j jVar4 : j.values()) {
            String bravo5 = jVar4.purple.bravo();
            Intrinsics.delta(bravo5, "primitiveType.arrayTypeName.asString()");
            hashMap2.put(delta(bravo5), jVar4);
        }
        purple = hashMap2;
    }

    public static Ne.c alpha(String str) {
        return n.kilo.charlie(Ne.f.echo(str));
    }

    public static Ne.c bravo(String str) {
        return n.lima.charlie(Ne.f.echo(str));
    }

    public static Ne.c charlie(String str) {
        return n.juliet.charlie(Ne.f.echo(str));
    }

    public static Ne.e delta(String str) {
        Ne.e india2 = charlie(str).india();
        Intrinsics.delta(india2, "fqName(simpleName).toUnsafe()");
        return india2;
    }

    public static final Ne.e echo(String str) {
        Ne.e india2 = n.hotel.charlie(Ne.f.echo(str)).india();
        Intrinsics.delta(india2, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
        return india2;
    }
}
