package androidx.compose.runtime.snapshots;

import Aa.d;
import L.j;
import Ld.a;
import S.ac;
import S.ae;
import S.ai;
import S.b;
import S.g;
import S.n;
import S.q;
import S.r;
import S.z;
import Yd.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.J;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "LS/ac;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class SnapshotStateList<T> implements Parcelable, ac, List<T>, RandomAccess, c {

    @NotNull
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new q(0);
    public z alpha;

    public SnapshotStateList(L.c cVar) {
        g kilo = n.kilo();
        z zVar = new z(kilo.golf(), cVar);
        if (!(kilo instanceof b)) {
            zVar.bravo = new z(1, cVar);
        }
        this.alpha = zVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i4;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.c delta = cVar.delta(obj);
            if (Intrinsics.areEqual(delta, cVar)) {
                return false;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i4, delta, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        return r.echo(this, new d(i4, collection, 1));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g kilo;
        z zVar = this.alpha;
        Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (n.charlie) {
            kilo = n.kilo();
            z zVar2 = (z) n.xray(zVar, this, kilo);
            synchronized (r.alpha) {
                zVar2.charlie = j.purple;
                zVar2.delta++;
                zVar2.echo++;
            }
        }
        n.oscar(kilo, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return r.charlie(this).charlie.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return r.charlie(this).charlie.containsAll(collection);
    }

    @Override // S.ac
    public final /* synthetic */ ae delta(ae aeVar, ae aeVar2, ae aeVar3) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return r.charlie(this).charlie.get(i4);
    }

    @Override // S.ac
    public final ae hotel() {
        return this.alpha;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return r.charlie(this).charlie.indexOf(obj);
    }

    @Override // S.ac
    public final void india(ae aeVar) {
        aeVar.bravo = this.alpha;
        this.alpha = (z) aeVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return r.charlie(this).charlie.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final void kilo(int i4, int i5) {
        int i10;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i10 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.g india = cVar.india();
            india.subList(i4, i5).clear();
            L.c delta = india.delta();
            if (!Intrinsics.areEqual(delta, cVar)) {
                z zVar3 = this.alpha;
                Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
                synchronized (n.charlie) {
                    kilo = n.kilo();
                    bravo = r.bravo((z) n.xray(zVar3, this, kilo), i10, delta, true);
                }
                n.oscar(kilo, this);
            } else {
                return;
            }
        } while (!bravo);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return r.charlie(this).charlie.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        int i5;
        L.c cVar;
        g kilo;
        boolean bravo;
        Object obj = get(i4);
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i5 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.c lima = cVar.lima(i4);
            if (Intrinsics.areEqual(lima, cVar)) {
                break;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i5, lima, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i4;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            cVar.getClass();
            L.c kilo2 = cVar.kilo(new L.b(0, collection));
            if (Intrinsics.areEqual(kilo2, cVar)) {
                return false;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i4, kilo2, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return r.echo(this, new L.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        int i5;
        L.c cVar;
        g kilo;
        boolean bravo;
        Object obj2 = get(i4);
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i5 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.c mike = cVar.mike(i4, obj);
            if (Intrinsics.areEqual(mike, cVar)) {
                break;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i5, mike, false);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return r.charlie(this).charlie.alpha();
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        boolean z2;
        if (i4 >= 0 && i4 <= i5 && i5 <= size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            J.alpha("fromIndex or toIndex are out of bounds");
        }
        return new ai(this, i4, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.charlie(this);
    }

    public final String toString() {
        z zVar = this.alpha;
        Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((z) n.india(zVar)).charlie + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        L.c cVar = r.charlie(this).charlie;
        int alpha = cVar.alpha();
        parcel.writeInt(alpha);
        for (int i5 = 0; i5 < alpha; i5++) {
            parcel.writeValue(cVar.get(i5));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i4;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.c hotel = cVar.hotel(collection);
            if (Intrinsics.areEqual(hotel, cVar)) {
                return false;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i4, hotel, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return new a(this, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.j.delta(this, objArr);
    }

    public SnapshotStateList() {
        this(j.purple);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i5 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            L.c bravo2 = cVar.bravo(i4, obj);
            if (Intrinsics.areEqual(bravo2, cVar)) {
                return;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i5, bravo2, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i4;
        L.c cVar;
        g kilo;
        boolean bravo;
        do {
            synchronized (r.alpha) {
                z zVar = this.alpha;
                Intrinsics.charlie(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                z zVar2 = (z) n.india(zVar);
                i4 = zVar2.delta;
                cVar = zVar2.charlie;
            }
            Intrinsics.checkNotNull(cVar);
            int indexOf = cVar.indexOf(obj);
            L.c lima = indexOf != -1 ? cVar.lima(indexOf) : cVar;
            if (Intrinsics.areEqual(lima, cVar)) {
                return false;
            }
            z zVar3 = this.alpha;
            Intrinsics.charlie(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.charlie) {
                kilo = n.kilo();
                bravo = r.bravo((z) n.xray(zVar3, this, kilo), i4, lima, true);
            }
            n.oscar(kilo, this);
        } while (!bravo);
        return true;
    }
}
