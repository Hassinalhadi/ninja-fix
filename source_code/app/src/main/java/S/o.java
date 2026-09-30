package S;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o implements Set, Yd.f {
    public final t alpha;
    public final /* synthetic */ int purple;

    public o(t tVar, int i4) {
        this.purple = i4;
        this.alpha = tVar;
    }

    private final boolean alpha(Collection collection) {
        int collectionSizeOrDefault;
        K.d dVar;
        int i4;
        g kilo;
        boolean alpha;
        Collection<Map.Entry> collection2 = collection;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Map.Entry entry : collection2) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        t tVar = this.alpha;
        boolean z2 = false;
        do {
            synchronized (u.alpha) {
                s sVar = tVar.alpha;
                Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) n.india(sVar);
                dVar = sVar2.charlie;
                i4 = sVar2.delta;
            }
            Intrinsics.checkNotNull(dVar);
            K.c builder = dVar.builder();
            Iterator it = tVar.purple.iterator();
            while (((ab) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((ab) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.areEqual(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z2 = true;
                }
            }
            K.d build = builder.build();
            if (Intrinsics.areEqual(build, dVar)) {
                break;
            }
            s sVar3 = tVar.alpha;
            Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = t.alpha(tVar, (s) n.xray(sVar3, tVar, kilo), i4, build);
            }
            n.oscar(kilo, tVar);
        } while (!alpha);
        return z2;
    }

    private final boolean bravo(Collection collection) {
        K.d dVar;
        int i4;
        g kilo;
        boolean alpha;
        Set D10 = CollectionsKt.D(collection);
        t tVar = this.alpha;
        boolean z2 = false;
        do {
            synchronized (u.alpha) {
                s sVar = tVar.alpha;
                Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) n.india(sVar);
                dVar = sVar2.charlie;
                i4 = sVar2.delta;
            }
            Intrinsics.checkNotNull(dVar);
            K.c builder = dVar.builder();
            Iterator it = tVar.purple.iterator();
            while (((ab) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((ab) it).next();
                if (!D10.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            K.d build = builder.build();
            if (Intrinsics.areEqual(build, dVar)) {
                break;
            }
            s sVar3 = tVar.alpha;
            Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = t.alpha(tVar, (s) n.xray(sVar3, tVar, kilo), i4, build);
            }
            n.oscar(kilo, tVar);
        } while (!alpha);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.purple) {
            case 0:
                u.charlie();
                throw null;
            case 1:
                u.charlie();
                throw null;
            default:
                u.charlie();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.purple) {
            case 0:
                u.charlie();
                throw null;
            case 1:
                u.charlie();
                throw null;
            default:
                u.charlie();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.purple) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof Yd.a) || (obj instanceof Yd.d))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return Intrinsics.areEqual(this.alpha.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return this.alpha.containsKey(obj);
            default:
                return this.alpha.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.purple) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.alpha.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.alpha.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.purple) {
            case 0:
                t tVar = this.alpha;
                return new ab(tVar, ((K.b) ((kotlin.collections.f) tVar.charlie().charlie).entrySet()).iterator(), 0);
            case 1:
                t tVar2 = this.alpha;
                return new ab(tVar2, ((K.b) ((kotlin.collections.f) tVar2.charlie().charlie).entrySet()).iterator(), 1);
            default:
                t tVar3 = this.alpha;
                return new ab(tVar3, ((K.b) ((kotlin.collections.f) tVar3.charlie().charlie).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        boolean z2;
        Object obj2;
        switch (this.purple) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof Yd.a) || (obj instanceof Yd.d))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                if (this.alpha.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (this.alpha.remove(obj) != null) {
                    return true;
                }
                return false;
            default:
                t tVar = this.alpha;
                Iterator it = tVar.purple.iterator();
                while (true) {
                    if (((ab) it).hasNext()) {
                        obj2 = ((ab) it).next();
                        if (Intrinsics.areEqual(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    tVar.remove(entry.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        K.d dVar;
        int i4;
        g kilo;
        boolean alpha;
        switch (this.purple) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.alpha.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        if (this.alpha.remove(it2.next()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                    break;
                }
            default:
                Set D10 = CollectionsKt.D(collection);
                t tVar = this.alpha;
                boolean z11 = false;
                do {
                    synchronized (u.alpha) {
                        s sVar = tVar.alpha;
                        Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        s sVar2 = (s) n.india(sVar);
                        dVar = sVar2.charlie;
                        i4 = sVar2.delta;
                    }
                    Intrinsics.checkNotNull(dVar);
                    K.c builder = dVar.builder();
                    Iterator it3 = tVar.purple.iterator();
                    while (((ab) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((ab) it3).next();
                        if (D10.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z11 = true;
                        }
                    }
                    K.d build = builder.build();
                    if (!Intrinsics.areEqual(build, dVar)) {
                        s sVar3 = tVar.alpha;
                        Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (n.charlie) {
                            kilo = n.kilo();
                            alpha = t.alpha(tVar, (s) n.xray(sVar3, tVar, kilo), i4, build);
                        }
                        n.oscar(kilo, tVar);
                    }
                    return z11;
                } while (!alpha);
                return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        K.d dVar;
        int i4;
        g kilo;
        boolean alpha;
        switch (this.purple) {
            case 0:
                return alpha(collection);
            case 1:
                return bravo(collection);
            default:
                Set D10 = CollectionsKt.D(collection);
                t tVar = this.alpha;
                boolean z2 = false;
                do {
                    synchronized (u.alpha) {
                        s sVar = tVar.alpha;
                        Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        s sVar2 = (s) n.india(sVar);
                        dVar = sVar2.charlie;
                        i4 = sVar2.delta;
                    }
                    Intrinsics.checkNotNull(dVar);
                    K.c builder = dVar.builder();
                    Iterator it = tVar.purple.iterator();
                    while (((ab) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((ab) it).next();
                        if (!D10.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z2 = true;
                        }
                    }
                    K.d build = builder.build();
                    if (!Intrinsics.areEqual(build, dVar)) {
                        s sVar3 = tVar.alpha;
                        Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (n.charlie) {
                            kilo = n.kilo();
                            alpha = t.alpha(tVar, (s) n.xray(sVar3, tVar, kilo), i4, build);
                        }
                        n.oscar(kilo, tVar);
                    }
                    return z2;
                } while (!alpha);
                return z2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.alpha.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.delta(this, objArr);
    }
}
