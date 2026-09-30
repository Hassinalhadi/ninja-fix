package kotlin.collections;

import Oe.ah;
import androidx.appcompat.widget.P0;
import fe.C1715g;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2769s6;

@Metadata(d1 = {"kotlin/collections/ab", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/p", "kotlin/collections/p", "kotlin/collections/p", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/q", "kotlin/collections/q", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes2.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static long[] A(List list) {
        Intrinsics.echo(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = ((Number) it.next()).longValue();
            i4++;
        }
        return jArr;
    }

    public static ArrayList B(Collection collection) {
        Intrinsics.echo(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet C(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.xray(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set D(Iterable iterable) {
        Object next;
        Intrinsics.echo(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        u uVar = u.alpha;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(y.quebec(collection.size()));
                    CollectionsKt___CollectionsKt.xray(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return ab.oscar(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            CollectionsKt___CollectionsKt.xray(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return ab.oscar(linkedHashSet2.iterator().next());
            }
        }
        return uVar;
    }

    public static LinkedHashSet E(Set set, Set other) {
        Intrinsics.echo(set, "<this>");
        Intrinsics.echo(other, "other");
        LinkedHashSet C = C(set);
        CollectionsKt__MutableCollectionsKt.addAll(C, other);
        return C;
    }

    public static ArrayList F(ArrayList arrayList, Function1 transform) {
        Intrinsics.echo(transform, "transform");
        int i4 = 1;
        ab.echo(1);
        int size = arrayList.size();
        if (size % 1 == 0) {
            i4 = 0;
        }
        ArrayList arrayList2 = new ArrayList(i4 + size);
        d dVar = new d(arrayList);
        for (int i5 = 0; i5 >= 0 && i5 < size; i5++) {
            int i10 = size - i5;
            if (2 <= i10) {
                i10 = 2;
            }
            if (i10 < 2) {
                break;
            }
            int i11 = i10 + i5;
            ab.delta(i5, i11, dVar.silver.size());
            dVar.purple = i5;
            dVar.red = i11 - i5;
            arrayList2.add(transform.invoke(dVar));
        }
        return arrayList2;
    }

    public static Lf.i G(List list) {
        Intrinsics.echo(list, "<this>");
        return new Lf.i(2, new Jf.f(2, list));
    }

    public static ArrayList H(Collection collection, Collection other) {
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(other, "other");
        Iterator it = collection.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static ArrayList a(Collection collection, Iterable elements) {
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, elements);
        return arrayList2;
    }

    public static void amber(Collection collection, Object[] elements) {
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(elements, "elements");
        collection.addAll(ArraysKt.sierra(elements));
    }

    public static ArrayList azure(Object... elements) {
        Intrinsics.echo(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new k(elements, true));
    }

    public static List b(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return CollectionsKt___CollectionsKt.plus((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static o beige(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        return new o(1, iterable);
    }

    public static int black(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.echo(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size >= 0) {
            if (size <= size2) {
                int i4 = size - 1;
                int i5 = 0;
                while (i5 <= i4) {
                    int i10 = (i5 + i4) >>> 1;
                    int bravo = AbstractC2769s6.bravo((Comparable) arrayList.get(i10), comparable);
                    if (bravo < 0) {
                        i5 = i10 + 1;
                    } else if (bravo > 0) {
                        i4 = i10 - 1;
                    } else {
                        return i10;
                    }
                }
                return -(i5 + 1);
            }
            throw new IndexOutOfBoundsException(P0.azure(size, size2, "toIndex (", ") is greater than size (", ")."));
        }
        throw new IllegalArgumentException(av.q.delta(size, "fromIndex (0) is greater than toIndex (", ")."));
    }

    public static /* bridge */ /* synthetic */ int blue(Iterable iterable) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
    }

    public static boolean bronze(Iterable iterable, Object obj) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (lavender(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static void c(Iterable iterable, Function1 predicate) {
        Intrinsics.echo(iterable, "<this>");
        Intrinsics.echo(predicate, "predicate");
        CollectionsKt__MutableCollectionsKt.sierra(iterable, predicate, true);
    }

    public static List coral(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        return z(C(iterable));
    }

    public static List crimson(List list) {
        Intrinsics.echo(list, "<this>");
        int size = list.size() - 1;
        if (size <= 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (size == 1) {
            return ab.juliet(navy(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i4 = 1; i4 < size2; i4++) {
                arrayList.add(list.get(i4));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List cyan(List list) {
        Intrinsics.echo(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return r(list, size);
    }

    public static boolean d(List list, Function1 predicate) {
        int i4;
        Intrinsics.echo(list, "<this>");
        Intrinsics.echo(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof Yd.a) && !(list instanceof Yd.b)) {
                kotlin.jvm.internal.x.hotel(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            return CollectionsKt__MutableCollectionsKt.sierra(list, predicate, true);
        }
        int ivory = ivory(list);
        if (ivory >= 0) {
            int i5 = 0;
            i4 = 0;
            while (true) {
                Object obj = list.get(i5);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i4 != i5) {
                        list.set(i4, obj);
                    }
                    i4++;
                }
                if (i5 == ivory) {
                    break;
                }
                i5++;
            }
        } else {
            i4 = 0;
        }
        if (i4 >= list.size()) {
            return false;
        }
        int ivory2 = ivory(list);
        if (i4 <= ivory2) {
            while (true) {
                list.remove(ivory2);
                if (ivory2 == i4) {
                    break;
                }
                ivory2--;
            }
        }
        return true;
    }

    public static Object e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static ArrayList emerald(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object f(List list) {
        Intrinsics.echo(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(ivory(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object fuchsia(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            return gold((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object g(AbstractList abstractList) {
        Intrinsics.echo(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(ivory(abstractList));
    }

    public static Object gold(List list) {
        Intrinsics.echo(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object gray(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object green(List list) {
        Intrinsics.echo(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static void h(ah ahVar, A0.p pVar) {
        CollectionsKt__MutableCollectionsKt.sierra(ahVar, pVar, false);
    }

    public static List i(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return z(iterable);
        }
        List yankee = CollectionsKt___CollectionsKt.yankee(iterable);
        Collections.reverse(yankee);
        return yankee;
    }

    public static ArrayList indigo(Collection collection) {
        Intrinsics.echo(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static int ivory(List list) {
        Intrinsics.echo(list, "<this>");
        return list.size() - 1;
    }

    public static Object j(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            return k((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object jade(int i4, List list) {
        Intrinsics.echo(list, "<this>");
        if (i4 >= 0 && i4 < list.size()) {
            return list.get(i4);
        }
        return null;
    }

    public static Object k(List list) {
        Intrinsics.echo(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object l(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    public static int lavender(Iterable iterable, Object obj) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i4 = 0;
        for (Object obj2 : iterable) {
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static LinkedHashSet lime(Collection collection, Collection other) {
        Collection z2;
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(other, "other");
        LinkedHashSet C = C(collection);
        Collection collection2 = other;
        if (collection2 instanceof Collection) {
            z2 = collection2;
        } else {
            z2 = z(collection2);
        }
        C.retainAll(z2);
        return C;
    }

    public static Object m(List list) {
        Intrinsics.echo(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static /* synthetic */ void magenta(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, Function1 function1, int i4) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        if ((i4 & 8) != 0) {
            str3 = "";
        }
        if ((i4 & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.whiskey(iterable, sb2, str, str2, str3, "...", function1);
    }

    public static String maroon(Iterable iterable, String str, String str2, String str3, Function1 function1, int i4) {
        String prefix;
        String str4;
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i4 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i4 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if ((i4 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.echo(iterable, "<this>");
        Intrinsics.echo(separator, "separator");
        Intrinsics.echo(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.whiskey(iterable, sb2, separator, prefix, str4, "...", function1);
        return sb2.toString();
    }

    public static List n(ArrayList arrayList, C1715g c1715g) {
        if (c1715g.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return z(arrayList.subList(c1715g.alpha, c1715g.purple + 1));
    }

    public static Object navy(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof List) {
            return ochre((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List o(AbstractCollection abstractCollection) {
        Intrinsics.echo(abstractCollection, "<this>");
        if (abstractCollection.size() <= 1) {
            return z(abstractCollection);
        }
        Object[] array = abstractCollection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.echo(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ArraysKt.sierra(array);
    }

    public static Object ochre(List list) {
        Intrinsics.echo(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(ivory(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object olive(List list) {
        Intrinsics.echo(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List orange(Object obj) {
        if (obj != null) {
            return ab.juliet(obj);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static List p(Iterable iterable, Comparator comparator) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return z(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            ArraysKt.pink(array, comparator);
            return ArraysKt.sierra(array);
        }
        List yankee = CollectionsKt___CollectionsKt.yankee(iterable);
        p.romeo(yankee, comparator);
        return yankee;
    }

    public static List peach(Object... elements) {
        Intrinsics.echo(elements, "elements");
        return ArraysKt___ArraysKt.filterNotNull(elements);
    }

    public static ArrayList pink(Collection collection, Function1 transform) {
        Intrinsics.echo(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable plum(List list) {
        Intrinsics.echo(list, "<this>");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable purple(Collection collection) {
        Intrinsics.echo(collection, "<this>");
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
        throw new NoSuchElementException();
    }

    public static double q(Collection collection) {
        Intrinsics.echo(collection, "<this>");
        Iterator it = collection.iterator();
        double d4 = 0.0d;
        while (it.hasNext()) {
            d4 += ((Number) it.next()).doubleValue();
        }
        return d4;
    }

    public static List r(Iterable iterable, int i4) {
        Intrinsics.echo(iterable, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (iterable instanceof Collection) {
                if (i4 >= ((Collection) iterable).size()) {
                    return z(iterable);
                }
                if (i4 == 1) {
                    return ab.juliet(fuchsia(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i4);
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i5++;
                if (i5 == i4) {
                    break;
                }
            }
            return CollectionsKt__CollectionsKt.papa(arrayList);
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Requested element count ", " is less than zero.").toString());
    }

    public static Comparable red(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List s(int i4, List list) {
        Intrinsics.echo(list, "<this>");
        if (i4 >= 0) {
            if (i4 == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int size = list.size();
            if (i4 >= size) {
                return z(list);
            }
            if (i4 == 1) {
                return ab.juliet(ochre(list));
            }
            ArrayList arrayList = new ArrayList(i4);
            if (list instanceof RandomAccess) {
                for (int i5 = size - i4; i5 < size; i5++) {
                    arrayList.add(list.get(i5));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i4);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Requested element count ", " is less than zero.").toString());
    }

    public static Float silver(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static void t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static ArrayList teal(List list, Object obj) {
        Intrinsics.echo(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        boolean z2 = false;
        for (Object obj2 : list) {
            boolean z10 = true;
            if (!z2 && Intrinsics.areEqual(obj2, obj)) {
                z2 = true;
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static boolean[] u(List list) {
        Intrinsics.echo(list, "<this>");
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        return zArr;
    }

    public static float[] w(List list) {
        Intrinsics.echo(list, "<this>");
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            fArr[i4] = ((Number) it.next()).floatValue();
            i4++;
        }
        return fArr;
    }

    public static ArrayList white(Object... elements) {
        Intrinsics.echo(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new k(elements, true));
    }

    public static HashSet x(List list) {
        Intrinsics.echo(list, "<this>");
        HashSet hashSet = new HashSet(y.quebec(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 12)));
        CollectionsKt___CollectionsKt.xray(list, hashSet);
        return hashSet;
    }

    public static int[] y(Collection collection) {
        Intrinsics.echo(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Number) it.next()).intValue();
            i4++;
        }
        return iArr;
    }

    public static ArrayList yellow(Iterable iterable, Iterable elements) {
        Intrinsics.echo(iterable, "<this>");
        Intrinsics.echo(elements, "elements");
        if (iterable instanceof Collection) {
            return a((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, elements);
        return arrayList;
    }

    public static List z(Iterable iterable) {
        Object next;
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return B(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return ab.juliet(next);
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return CollectionsKt__CollectionsKt.papa(CollectionsKt___CollectionsKt.yankee(iterable));
    }

    public static /* bridge */ /* synthetic */ void zulu(Collection collection, Iterable iterable) {
        CollectionsKt__MutableCollectionsKt.addAll(collection, iterable);
    }
}
