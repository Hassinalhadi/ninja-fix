package androidx.compose.runtime.snapshots;

import N.b;
import N.c;
import N.d;
import S.ac;
import S.ae;
import S.af;
import S.ag;
import S.g;
import S.n;
import S.q;
import S.y;
import Yd.f;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "LS/ac;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class SnapshotStateSet<T> implements Parcelable, ac, Set<T>, RandomAccess, f {

    @NotNull
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new q(1);
    public ag alpha;

    public SnapshotStateSet() {
        b bVar = b.silver;
        ag agVar = new ag(n.kilo().golf(), bVar);
        if (n.bravo.mike() != null) {
            agVar.bravo = new ag(1, bVar);
        }
        this.alpha = agVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i4;
        b bVar;
        g kilo;
        boolean alpha;
        do {
            synchronized (y.alpha) {
                ag agVar = this.alpha;
                Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                ag agVar2 = (ag) n.india(agVar);
                i4 = agVar2.delta;
                bVar = agVar2.charlie;
            }
            Intrinsics.checkNotNull(bVar);
            b bravo = bVar.bravo(obj);
            if (Intrinsics.areEqual(bravo, bVar)) {
                return false;
            }
            ag agVar3 = this.alpha;
            Intrinsics.charlie(agVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = y.alpha((ag) n.xray(agVar3, this, kilo), i4, bravo);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i4;
        b bVar;
        g kilo;
        boolean alpha;
        do {
            synchronized (y.alpha) {
                ag agVar = this.alpha;
                Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                ag agVar2 = (ag) n.india(agVar);
                i4 = agVar2.delta;
                bVar = agVar2.charlie;
            }
            Intrinsics.checkNotNull(bVar);
            bVar.getClass();
            c cVar = new c(bVar);
            cVar.addAll(collection);
            b bravo = cVar.bravo();
            if (Intrinsics.areEqual(bravo, bVar)) {
                return false;
            }
            ag agVar3 = this.alpha;
            Intrinsics.charlie(agVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = y.alpha((ag) n.xray(agVar3, this, kilo), i4, bravo);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        g kilo;
        ag agVar = this.alpha;
        Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        synchronized (n.charlie) {
            kilo = n.kilo();
            ag agVar2 = (ag) n.xray(agVar, this, kilo);
            synchronized (y.alpha) {
                agVar2.charlie = b.silver;
                agVar2.delta++;
            }
        }
        n.oscar(kilo, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return y.charlie(this).charlie.red.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return y.charlie(this).charlie.containsAll(collection);
    }

    @Override // S.ac
    public final /* synthetic */ ae delta(ae aeVar, ae aeVar2, ae aeVar3) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // S.ac
    public final ae hotel() {
        return this.alpha;
    }

    @Override // S.ac
    public final void india(ae aeVar) {
        aeVar.bravo = this.alpha;
        this.alpha = (ag) aeVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return y.charlie(this).charlie.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new af(this, y.charlie(this).charlie.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i4;
        b bVar;
        g kilo;
        boolean alpha;
        do {
            synchronized (y.alpha) {
                ag agVar = this.alpha;
                Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                ag agVar2 = (ag) n.india(agVar);
                i4 = agVar2.delta;
                bVar = agVar2.charlie;
            }
            Intrinsics.checkNotNull(bVar);
            b delta = bVar.delta(obj);
            if (Intrinsics.areEqual(delta, bVar)) {
                return false;
            }
            ag agVar3 = this.alpha;
            Intrinsics.charlie(agVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = y.alpha((ag) n.xray(agVar3, this, kilo), i4, delta);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i4;
        b bVar;
        g kilo;
        boolean alpha;
        do {
            synchronized (y.alpha) {
                ag agVar = this.alpha;
                Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                ag agVar2 = (ag) n.india(agVar);
                i4 = agVar2.delta;
                bVar = agVar2.charlie;
            }
            Intrinsics.checkNotNull(bVar);
            bVar.getClass();
            c cVar = new c(bVar);
            cVar.removeAll(collection);
            b bravo = cVar.bravo();
            if (Intrinsics.areEqual(bravo, bVar)) {
                return false;
            }
            ag agVar3 = this.alpha;
            Intrinsics.charlie(agVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                alpha = y.alpha((ag) n.xray(agVar3, this, kilo), i4, bravo);
            }
            n.oscar(kilo, this);
        } while (!alpha);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i4;
        b bVar;
        boolean retainAll;
        g kilo;
        boolean alpha;
        do {
            synchronized (y.alpha) {
                ag agVar = this.alpha;
                Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                ag agVar2 = (ag) n.india(agVar);
                i4 = agVar2.delta;
                bVar = agVar2.charlie;
            }
            if (bVar != null) {
                c cVar = new c(bVar);
                retainAll = cVar.retainAll(CollectionsKt.D(collection));
                b bravo = cVar.bravo();
                if (Intrinsics.areEqual(bravo, bVar)) {
                    break;
                }
                ag agVar3 = this.alpha;
                Intrinsics.charlie(agVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
                synchronized (n.charlie) {
                    kilo = n.kilo();
                    alpha = y.alpha((ag) n.xray(agVar3, this, kilo), i4, bravo);
                }
                n.oscar(kilo, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!alpha);
        return retainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return y.charlie(this).charlie.alpha();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return j.charlie(this);
    }

    public final String toString() {
        ag agVar = this.alpha;
        Intrinsics.charlie(agVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((ag) n.india(agVar)).charlie + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        b bVar = y.charlie(this).charlie;
        parcel.writeInt(size());
        d dVar = (d) bVar.iterator();
        if (dVar.hasNext()) {
            parcel.writeValue(dVar.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.delta(this, objArr);
    }
}
