package ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class am {
    public static final ArrayList alpha;
    public static final ArrayList bravo;
    public static final Object charlie;
    public static final LinkedHashMap delta;
    public static final Set echo;
    public static final Set foxtrot;
    public static final aj golf;
    public static final Object hotel;
    public static final LinkedHashMap india;
    public static final ArrayList juliet;
    public static final LinkedHashMap kilo;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map, java.lang.Object] */
    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        int collectionSizeOrDefault5;
        int collectionSizeOrDefault6;
        int collectionSizeOrDefault7;
        int collectionSizeOrDefault8;
        Set<String> g2 = ArraysKt.g(new String[]{"containsAll", "removeAll", "retainAll"});
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(g2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : g2) {
            String charlie2 = Ve.c.BOOLEAN.charlie();
            Intrinsics.delta(charlie2, "BOOLEAN.desc");
            arrayList.add(q.alpha("java/util/Collection", str, "Ljava/util/Collection;", charlie2));
        }
        alpha = arrayList;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((aj) it.next()).bravo);
        }
        bravo = arrayList2;
        ArrayList arrayList3 = alpha;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((aj) it2.next()).alpha.bravo());
        }
        String concat = "java/util/".concat("Collection");
        Ve.c cVar = Ve.c.BOOLEAN;
        String charlie3 = cVar.charlie();
        Intrinsics.delta(charlie3, "BOOLEAN.desc");
        aj alpha2 = q.alpha(concat, "contains", "Ljava/lang/Object;", charlie3);
        al alVar = al.silver;
        Pair pair = new Pair(alpha2, alVar);
        String concat2 = "java/util/".concat("Collection");
        String charlie4 = cVar.charlie();
        Intrinsics.delta(charlie4, "BOOLEAN.desc");
        Pair pair2 = new Pair(q.alpha(concat2, "remove", "Ljava/lang/Object;", charlie4), alVar);
        String concat3 = "java/util/".concat("Map");
        String charlie5 = cVar.charlie();
        Intrinsics.delta(charlie5, "BOOLEAN.desc");
        Pair pair3 = new Pair(q.alpha(concat3, "containsKey", "Ljava/lang/Object;", charlie5), alVar);
        String concat4 = "java/util/".concat("Map");
        String charlie6 = cVar.charlie();
        Intrinsics.delta(charlie6, "BOOLEAN.desc");
        Pair pair4 = new Pair(q.alpha(concat4, "containsValue", "Ljava/lang/Object;", charlie6), alVar);
        String concat5 = "java/util/".concat("Map");
        String charlie7 = cVar.charlie();
        Intrinsics.delta(charlie7, "BOOLEAN.desc");
        Pair pair5 = new Pair(q.alpha(concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", charlie7), alVar);
        Pair pair6 = new Pair(q.alpha("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), al.teal);
        aj alpha3 = q.alpha("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        al alVar2 = al.purple;
        Pair pair7 = new Pair(alpha3, alVar2);
        Pair pair8 = new Pair(q.alpha("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), alVar2);
        String concat6 = "java/util/".concat("List");
        Ve.c cVar2 = Ve.c.INT;
        String charlie8 = cVar2.charlie();
        Intrinsics.delta(charlie8, "INT.desc");
        aj alpha4 = q.alpha(concat6, "indexOf", "Ljava/lang/Object;", charlie8);
        al alVar3 = al.red;
        Pair pair9 = new Pair(alpha4, alVar3);
        String concat7 = "java/util/".concat("List");
        String charlie9 = cVar2.charlie();
        Intrinsics.delta(charlie9, "INT.desc");
        Map sierra = kotlin.collections.y.sierra(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(q.alpha(concat7, "lastIndexOf", "Ljava/lang/Object;", charlie9), alVar3));
        charlie = sierra;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y.quebec(sierra.size()));
        for (Map.Entry entry : sierra.entrySet()) {
            linkedHashMap.put(((aj) entry.getKey()).bravo, entry.getValue());
        }
        delta = linkedHashMap;
        LinkedHashSet mike = kotlin.collections.ab.mike(charlie.keySet(), alpha);
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(mike, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault4);
        Iterator it3 = mike.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((aj) it3.next()).alpha);
        }
        echo = CollectionsKt.D(arrayList5);
        collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(mike, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault5);
        Iterator it4 = mike.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((aj) it4.next()).bravo);
        }
        foxtrot = CollectionsKt.D(arrayList6);
        Ve.c cVar3 = Ve.c.INT;
        String charlie10 = cVar3.charlie();
        Intrinsics.delta(charlie10, "INT.desc");
        aj alpha5 = q.alpha("java/util/List", "removeAt", charlie10, "Ljava/lang/Object;");
        golf = alpha5;
        String concat8 = "java/lang/".concat("Number");
        String charlie11 = Ve.c.BYTE.charlie();
        Intrinsics.delta(charlie11, "BYTE.desc");
        Pair pair10 = new Pair(q.alpha(concat8, "toByte", "", charlie11), Ne.f.echo("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String charlie12 = Ve.c.SHORT.charlie();
        Intrinsics.delta(charlie12, "SHORT.desc");
        Pair pair11 = new Pair(q.alpha(concat9, "toShort", "", charlie12), Ne.f.echo("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String charlie13 = cVar3.charlie();
        Intrinsics.delta(charlie13, "INT.desc");
        Pair pair12 = new Pair(q.alpha(concat10, "toInt", "", charlie13), Ne.f.echo("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String charlie14 = Ve.c.LONG.charlie();
        Intrinsics.delta(charlie14, "LONG.desc");
        Pair pair13 = new Pair(q.alpha(concat11, "toLong", "", charlie14), Ne.f.echo("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String charlie15 = Ve.c.FLOAT.charlie();
        Intrinsics.delta(charlie15, "FLOAT.desc");
        Pair pair14 = new Pair(q.alpha(concat12, "toFloat", "", charlie15), Ne.f.echo("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String charlie16 = Ve.c.DOUBLE.charlie();
        Intrinsics.delta(charlie16, "DOUBLE.desc");
        Pair pair15 = new Pair(q.alpha(concat13, "toDouble", "", charlie16), Ne.f.echo("doubleValue"));
        Pair pair16 = new Pair(alpha5, Ne.f.echo("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String charlie17 = cVar3.charlie();
        Intrinsics.delta(charlie17, "INT.desc");
        String charlie18 = Ve.c.CHAR.charlie();
        Intrinsics.delta(charlie18, "CHAR.desc");
        Map sierra2 = kotlin.collections.y.sierra(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(q.alpha(concat14, "get", charlie17, charlie18), Ne.f.echo("charAt")));
        hotel = sierra2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.y.quebec(sierra2.size()));
        for (Map.Entry entry2 : sierra2.entrySet()) {
            linkedHashMap2.put(((aj) entry2.getKey()).bravo, entry2.getValue());
        }
        india = linkedHashMap2;
        Set keySet = hotel.keySet();
        collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault6);
        Iterator it5 = keySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((aj) it5.next()).alpha);
        }
        juliet = arrayList7;
        Set<Map.Entry> entrySet = hotel.entrySet();
        collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault7);
        for (Map.Entry entry3 : entrySet) {
            arrayList8.add(new Pair(((aj) entry3.getKey()).alpha, entry3.getValue()));
        }
        collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault8);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(quebec);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            Pair pair17 = (Pair) it6.next();
            linkedHashMap3.put((Ne.f) pair17.getSecond(), (Ne.f) pair17.getFirst());
        }
        kilo = linkedHashMap3;
    }
}
