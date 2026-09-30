package A0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import t0.C2915g0;

/* loaded from: classes3.dex */
public abstract class o {
    public static final AtomicInteger alpha = new AtomicInteger(0);

    public static final void alpha(C2915g0 c2915g0, k kVar) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(kVar, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = new Pair(((ac) entry.getKey()).alpha, entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        c2915g0.charlie.bravo(linkedHashMap, "properties");
    }

    public static final T.s bravo(T.s sVar, boolean z2, Function1 function1) {
        return sVar.then(new AppendedSemanticsElement(function1, z2));
    }
}
