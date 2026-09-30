package ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i {
    public static final Object alpha;
    public static final LinkedHashMap bravo;
    public static final Set charlie;
    public static final Set delta;

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map, java.lang.Object] */
    static {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Ne.e eVar = me.m.juliet;
        Ne.c golf = eVar.bravo(Ne.f.echo("name")).golf();
        Intrinsics.delta(golf, "child(Name.identifier(name)).toSafe()");
        Pair pair = new Pair(golf, Ne.f.echo("name"));
        Ne.c golf2 = eVar.bravo(Ne.f.echo("ordinal")).golf();
        Intrinsics.delta(golf2, "child(Name.identifier(name)).toSafe()");
        Pair pair2 = new Pair(golf2, Ne.f.echo("ordinal"));
        Pair pair3 = new Pair(me.m.azure.charlie(Ne.f.echo("size")), Ne.f.echo("size"));
        Ne.c cVar = me.m.bronze;
        Pair pair4 = new Pair(cVar.charlie(Ne.f.echo("size")), Ne.f.echo("size"));
        Ne.c golf3 = me.m.echo.bravo(Ne.f.echo("length")).golf();
        Intrinsics.delta(golf3, "child(Name.identifier(name)).toSafe()");
        Map sierra = kotlin.collections.y.sierra(pair, pair2, pair3, pair4, new Pair(golf3, Ne.f.echo("length")), new Pair(cVar.charlie(Ne.f.echo("keys")), Ne.f.echo("keySet")), new Pair(cVar.charlie(Ne.f.echo("values")), Ne.f.echo("values")), new Pair(cVar.charlie(Ne.f.echo("entries")), Ne.f.echo("entrySet")));
        alpha = sierra;
        Set<Map.Entry> entrySet = sierra.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((Ne.c) entry.getKey()).foxtrot(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair5 = (Pair) it.next();
            Ne.f fVar = (Ne.f) pair5.getSecond();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((Ne.f) pair5.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.y.quebec(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.coral((Iterable) entry2.getValue()));
        }
        bravo = linkedHashMap2;
        Set keySet = alpha.keySet();
        charlie = keySet;
        Set set = keySet;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Ne.c) it2.next()).foxtrot());
        }
        delta = CollectionsKt.D(arrayList2);
    }
}
