package S;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements ac, Map, Yd.e {
    public s alpha;
    public final o purple;
    public final o red;
    public final o silver;

    public t() {
        M.c cVar = M.c.red;
        g kilo = n.kilo();
        s sVar = new s(kilo.golf(), cVar);
        if (!(kilo instanceof b)) {
            sVar.bravo = new s(1, cVar);
        }
        this.alpha = sVar;
        this.purple = new o(this, 0);
        this.red = new o(this, 1);
        this.silver = new o(this, 2);
    }

    public static final boolean alpha(t tVar, s sVar, int i4, K.d dVar) {
        boolean z2;
        tVar.getClass();
        synchronized (u.alpha) {
            int i5 = sVar.delta;
            if (i5 == i4) {
                sVar.charlie = dVar;
                z2 = true;
                sVar.delta = i5 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static void bravo(s sVar) {
        M.c cVar = M.c.red;
        synchronized (u.alpha) {
            sVar.charlie = cVar;
            sVar.delta++;
        }
    }

    public final s charlie() {
        s sVar = this.alpha;
        Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (s) n.uniform(sVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        g kilo;
        s sVar = this.alpha;
        Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        if (M.c.red != ((s) n.india(sVar)).charlie) {
            s sVar2 = this.alpha;
            Intrinsics.charlie(sVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo((s) n.xray(sVar2, this, kilo));
            }
            n.oscar(kilo, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return charlie().charlie.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return charlie().charlie.containsValue(obj);
    }

    @Override // S.ac
    public final /* synthetic */ ae delta(ae aeVar, ae aeVar2, ae aeVar3) {
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.purple;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return charlie().charlie.get(obj);
    }

    @Override // S.ac
    public final ae hotel() {
        return this.alpha;
    }

    @Override // S.ac
    public final void india(ae aeVar) {
        Intrinsics.charlie(aeVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.alpha = (s) aeVar;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((kotlin.collections.f) charlie().charlie).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.red;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        K.d dVar;
        int i4;
        Object put;
        g kilo;
        boolean alpha;
        do {
            synchronized (u.alpha) {
                s sVar = this.alpha;
                Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) n.india(sVar);
                dVar = sVar2.charlie;
                i4 = sVar2.delta;
            }
            Intrinsics.checkNotNull(dVar);
            M.e eVar = (M.e) dVar.builder();
            put = eVar.put(obj, obj2);
            K.d build = eVar.build();
            if (Intrinsics.areEqual(build, dVar)) {
                break;
            }
            s sVar3 = this.alpha;
            Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = alpha(this, (s) n.xray(sVar3, this, kilo), i4, build);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        K.d dVar;
        int i4;
        g kilo;
        boolean alpha;
        do {
            synchronized (u.alpha) {
                s sVar = this.alpha;
                Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) n.india(sVar);
                dVar = sVar2.charlie;
                i4 = sVar2.delta;
            }
            Intrinsics.checkNotNull(dVar);
            M.e eVar = (M.e) dVar.builder();
            eVar.putAll(map);
            K.d build = eVar.build();
            if (!Intrinsics.areEqual(build, dVar)) {
                s sVar3 = this.alpha;
                Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (n.charlie) {
                    kilo = n.kilo();
                    alpha = alpha(this, (s) n.xray(sVar3, this, kilo), i4, build);
                }
                n.oscar(kilo, this);
            } else {
                return;
            }
        } while (!alpha);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        K.d dVar;
        int i4;
        Object remove;
        g kilo;
        boolean alpha;
        do {
            synchronized (u.alpha) {
                s sVar = this.alpha;
                Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                s sVar2 = (s) n.india(sVar);
                dVar = sVar2.charlie;
                i4 = sVar2.delta;
            }
            Intrinsics.checkNotNull(dVar);
            K.c builder = dVar.builder();
            remove = builder.remove(obj);
            K.d build = builder.build();
            if (Intrinsics.areEqual(build, dVar)) {
                break;
            }
            s sVar3 = this.alpha;
            Intrinsics.charlie(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = alpha(this, (s) n.xray(sVar3, this, kilo), i4, build);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        kotlin.collections.f fVar = (kotlin.collections.f) charlie().charlie;
        fVar.getClass();
        return ((M.c) fVar).purple;
    }

    public final String toString() {
        s sVar = this.alpha;
        Intrinsics.charlie(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((s) n.india(sVar)).charlie + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.silver;
    }
}
