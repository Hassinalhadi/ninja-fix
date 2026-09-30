package Ne;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;

/* loaded from: classes2.dex */
public abstract class j {
    static {
        new c("java.lang").charlie(f.echo("annotation"));
    }

    public static final b alpha(String str) {
        c cVar = i.alpha;
        return new b(i.alpha, f.echo(str));
    }

    public static final b bravo(String str) {
        c cVar = i.alpha;
        return new b(i.charlie, f.echo(str));
    }

    public static final void charlie(LinkedHashMap linkedHashMap) {
        int collectionSizeOrDefault;
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(quebec);
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final b delta(f fVar) {
        c cVar = i.alpha;
        b bVar = i.hotel;
        return new b(bVar.golf(), f.echo(fVar.charlie().concat(bVar.india().charlie())));
    }

    public static final b echo(String str) {
        c cVar = i.alpha;
        return new b(i.bravo, f.echo(str));
    }

    public static final b foxtrot(b bVar) {
        c cVar = i.alpha;
        return new b(i.alpha, f.echo("U".concat(bVar.india().charlie())));
    }
}
