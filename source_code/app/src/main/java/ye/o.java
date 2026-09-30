package ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class o {
    public static final LinkedHashMap alpha;
    public static final Map bravo;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        alpha = linkedHashMap;
        bravo(Ne.i.quebec, alpha("java.util.ArrayList", "java.util.LinkedList"));
        bravo(Ne.i.romeo, alpha("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        bravo(Ne.i.sierra, alpha("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        bravo(Ne.b.juliet(new Ne.c("java.util.function.Function")), alpha("java.util.function.UnaryOperator"));
        bravo(Ne.b.juliet(new Ne.c("java.util.function.BiFunction")), alpha("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((Ne.b) entry.getKey()).bravo(), ((Ne.b) entry.getValue()).bravo()));
        }
        bravo = kotlin.collections.y.yankee(arrayList);
    }

    public static ArrayList alpha(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Ne.b.juliet(new Ne.c(str)));
        }
        return arrayList;
    }

    public static void bravo(Ne.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            alpha.put(next, bVar);
        }
    }
}
