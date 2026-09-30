package me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: me.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2116d {
    public static final LinkedHashSet alpha;

    static {
        int collectionSizeOrDefault;
        Set<j> set = j.teal;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (j primitiveType : set) {
            Intrinsics.echo(primitiveType, "primitiveType");
            arrayList.add(n.juliet.charlie(primitiveType.alpha));
        }
        Ne.c golf = m.foxtrot.golf();
        Intrinsics.delta(golf, "string.toSafe()");
        List plus = CollectionsKt.plus(arrayList, golf);
        Ne.c golf2 = m.hotel.golf();
        Intrinsics.delta(golf2, "_boolean.toSafe()");
        List plus2 = CollectionsKt.plus(plus, golf2);
        Ne.c golf3 = m.juliet.golf();
        Intrinsics.delta(golf3, "_enum.toSafe()");
        List plus3 = CollectionsKt.plus(plus2, golf3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = plus3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Ne.b.juliet((Ne.c) it.next()));
        }
        alpha = linkedHashSet;
    }
}
