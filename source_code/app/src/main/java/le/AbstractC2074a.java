package le;

import Ne.b;
import Ne.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ye.ab;

/* renamed from: le.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2074a {
    public static final LinkedHashSet alpha;
    public static final b bravo;

    static {
        List listOf = CollectionsKt.listOf(ab.alpha, ab.hotel, ab.india, ab.charlie, ab.delta, ab.foxtrot);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.juliet((c) it.next()));
        }
        alpha = linkedHashSet;
        bravo = b.juliet(ab.golf);
    }
}
