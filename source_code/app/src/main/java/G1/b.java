package G1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {
    public final LinkedHashMap alpha;
    public final E1.a bravo;

    public b(LinkedHashMap linkedHashMap, boolean z2) {
        this.alpha = linkedHashMap;
        this.bravo = new E1.a(z2);
    }

    public final Map alpha() {
        int collectionSizeOrDefault;
        Pair pair;
        Set<Map.Entry> entrySet = this.alpha.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.delta(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.delta(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void bravo() {
        if (!this.bravo.alpha.get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object charlie(f key) {
        Intrinsics.echo(key, "key");
        Object obj = this.alpha.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.delta(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void delta(f key, Object obj) {
        Intrinsics.echo(key, "key");
        bravo();
        LinkedHashMap linkedHashMap = this.alpha;
        if (obj == null) {
            bravo();
            linkedHashMap.remove(key);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.D((Set) obj));
            Intrinsics.delta(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, unmodifiableSet);
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.delta(copyOf, "copyOf(this, size)");
                linkedHashMap.put(key, copyOf);
                return;
            }
            linkedHashMap.put(key, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.alpha;
            LinkedHashMap linkedHashMap2 = this.alpha;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.alpha;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                        z2 = true;
                                    }
                                } else {
                                    z2 = Intrinsics.areEqual(value, obj2);
                                }
                                if (z2) {
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.alpha.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i4 += hashCode;
        }
        return i4;
    }

    public final String toString() {
        return CollectionsKt.maroon(this.alpha.entrySet(), ",\n", "{\n", "\n}", a.alpha, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
