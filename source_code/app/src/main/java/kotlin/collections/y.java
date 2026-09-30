package kotlin.collections;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class y extends ab {
    public static LinkedHashMap amber(Map map) {
        Intrinsics.echo(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map azure(Map map) {
        Intrinsics.echo(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.delta(singletonMap, "with(...)");
        return singletonMap;
    }

    public static TreeMap beige(LinkedHashMap linkedHashMap, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }

    public static Object papa(Map map, Object obj) {
        Intrinsics.echo(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int quebec(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return LottieConstants.IterateForever;
    }

    public static Map romeo(Pair pair) {
        Intrinsics.echo(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.delta(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map sierra(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec(pairArr.length));
            whiskey(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        return t.alpha;
    }

    public static LinkedHashMap tango(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec(pairArr.length));
        whiskey(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap uniform(Map map, Map map2) {
        Intrinsics.echo(map, "<this>");
        Intrinsics.echo(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map victor(Map map, Pair pair) {
        Intrinsics.echo(map, "<this>");
        Intrinsics.echo(pair, "pair");
        if (map.isEmpty()) {
            return romeo(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final void whiskey(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.first, pair.second);
        }
    }

    public static List xray(LinkedHashMap linkedHashMap) {
        Intrinsics.echo(linkedHashMap, "<this>");
        if (linkedHashMap.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return ab.juliet(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map yankee(List list) {
        Intrinsics.echo(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec(list.size()));
                Intrinsics.echo(list, "<this>");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    linkedHashMap.put(pair.first, pair.second);
                }
                return linkedHashMap;
            }
            return romeo((Pair) list.get(0));
        }
        return t.alpha;
    }

    public static Map zulu(Map map) {
        Intrinsics.echo(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return amber(map);
            }
            return azure(map);
        }
        return t.alpha;
    }
}
