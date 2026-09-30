package androidx.compose.runtime;

import Yb.C0312j0;
import a2.C0393r;
import android.util.Log;
import id.C1915c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import vf.C3207k;
import vf.InterfaceC3206j;
import yf.AbstractC3428A;

/* loaded from: classes3.dex */
public final class Y extends AbstractC0587t {
    public static final yf.N yankee = AbstractC3428A.charlie(N.b.silver);
    public static final AtomicReference zulu = new AtomicReference(Boolean.FALSE);
    public final C0572f alpha;
    public final Object bravo;
    public vf.I charlie;
    public Throwable delta;
    public final ArrayList echo;
    public List foxtrot;
    public bv.am golf;
    public final J.e hotel;
    public final ArrayList india;
    public final ArrayList juliet;
    public final bv.al kilo;
    public final w.o lima;
    public final bv.al mike;
    public final bv.al november;
    public ArrayList oscar;
    public LinkedHashSet papa;
    public C3207k quebec;
    public O7.l romeo;
    public boolean sierra;
    public final yf.N tango;
    public final C1915c uniform;
    public final vf.J victor;
    public final Nd.h whiskey;
    public final as xray;

    public Y(Nd.h hVar) {
        C0572f c0572f = new C0572f(new C0312j0(7, this));
        this.alpha = c0572f;
        this.bravo = new Object();
        this.echo = new ArrayList();
        this.golf = new bv.am();
        this.hotel = new J.e(new C0590w[16]);
        this.india = new ArrayList();
        this.juliet = new ArrayList();
        this.kilo = new bv.al();
        this.lima = new w.o(22);
        this.mike = new bv.al();
        this.november = new bv.al();
        this.tango = AbstractC3428A.charlie(S.red);
        this.uniform = new C1915c(15);
        vf.J j5 = new vf.J((vf.I) hVar.get(vf.H.alpha));
        j5.crimson(new Ya.c(12, this));
        this.victor = j5;
        this.whiskey = hVar.plus(c0572f).plus(j5);
        this.xray = new as(8);
    }

    public static final void crimson(ArrayList arrayList, Y y10, C0590w c0590w) {
        arrayList.clear();
        synchronized (y10.bravo) {
            Iterator it = y10.juliet.iterator();
            while (it.hasNext()) {
                av avVar = (av) it.next();
                avVar.getClass();
                if (Intrinsics.areEqual(null, c0590w)) {
                    arrayList.add(avVar);
                    it.remove();
                }
            }
        }
    }

    public static final Object uniform(Y y10, X x4) {
        C3207k c3207k;
        if (!y10.black()) {
            C3207k c3207k2 = new C3207k(1, J6.delta(x4));
            c3207k2.tango();
            synchronized (y10.bravo) {
                if (y10.black()) {
                    c3207k = c3207k2;
                } else {
                    y10.quebec = c3207k2;
                    c3207k = null;
                }
            }
            if (c3207k != null) {
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
            Object sierra = c3207k2.sierra();
            if (sierra == Od.a.alpha) {
                return sierra;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void victor(Y y10) {
        int i4;
        bv.ah ahVar;
        synchronized (y10.bravo) {
            try {
                if (y10.kilo.juliet()) {
                    bv.ah bravo = J.a.bravo(y10.kilo);
                    y10.kilo.alpha();
                    w.o oVar = y10.lima;
                    ((bv.al) oVar.purple).alpha();
                    ((bv.al) oVar.red).alpha();
                    y10.november.alpha();
                    ahVar = new bv.ah(bravo.bravo);
                    Object[] objArr = bravo.alpha;
                    int i5 = bravo.bravo;
                    for (int i10 = 0; i10 < i5; i10++) {
                        av avVar = (av) objArr[i10];
                        ahVar.golf(new Pair(avVar, y10.mike.golf(avVar)));
                    }
                    y10.mike.alpha();
                } else {
                    ahVar = bv.as.bravo;
                    Intrinsics.charlie(ahVar, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = ahVar.alpha;
        int i11 = ahVar.bravo;
        for (i4 = 0; i4 < i11; i4++) {
            Pair pair = (Pair) objArr2[i4];
        }
    }

    public static final boolean whiskey(Y y10) {
        boolean beige;
        synchronized (y10.bravo) {
            beige = y10.beige();
        }
        return beige;
    }

    public static final List xray(Y y10) {
        List blue;
        synchronized (y10.bravo) {
            blue = y10.blue();
        }
        return blue;
    }

    public static final void yankee(Y y10, vf.I i4) {
        synchronized (y10.bravo) {
            Throwable th = y10.delta;
            if (th == null) {
                if (((S) y10.tango.getValue()).compareTo(S.purple) > 0) {
                    if (y10.charlie == null) {
                        y10.charlie = i4;
                        y10.azure();
                    } else {
                        throw new IllegalStateException("Recomposer already running");
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down");
                }
            } else {
                throw th;
            }
        }
    }

    public static void zulu(S.c cVar) {
        try {
            if (!(cVar.whiskey() instanceof S.h)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.charlie();
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void alpha(C0590w c0590w, Xd.l lVar) {
        Object obj;
        boolean z2;
        S.c cVar;
        S.c black;
        boolean z10 = c0590w.f3020o.bronze;
        synchronized (this.bravo) {
            obj = null;
            if (((S) this.tango.getValue()).compareTo(S.purple) > 0) {
                boolean contains = blue().contains(c0590w);
                z2 = !contains;
                if (!contains) {
                    this.echo.add(c0590w);
                    this.foxtrot = null;
                }
            } else {
                z2 = true;
            }
        }
        try {
            Ya.c cVar2 = new Ya.c(11, c0590w);
            C0393r c0393r = new C0393r(10, c0590w, obj);
            S.g kilo = S.n.kilo();
            if (kilo instanceof S.c) {
                cVar = (S.c) kilo;
            } else {
                cVar = null;
            }
            if (cVar != null && (black = cVar.black(cVar2, c0393r)) != null) {
                try {
                    S.g juliet = black.juliet();
                    try {
                        c0590w.juliet(lVar);
                        if (!z10) {
                            S.n.kilo().mike();
                        }
                        try {
                            coral(c0590w);
                            try {
                                c0590w.delta();
                                c0590w.foxtrot();
                                if (!z10) {
                                    S.n.kilo().mike();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                fuchsia(th, null);
                                return;
                            }
                        } catch (Throwable th2) {
                            fuchsia(th2, c0590w);
                            return;
                        }
                    } finally {
                        S.g.quebec(juliet);
                    }
                } finally {
                    zulu(black);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            fuchsia(th3, c0590w);
            if (z2) {
                synchronized (this.bravo) {
                    if (this.echo.remove(c0590w)) {
                        this.foxtrot = null;
                    }
                }
            }
        }
    }

    public final void amber() {
        synchronized (this.bravo) {
            if (((S) this.tango.getValue()).compareTo(S.teal) >= 0) {
                yf.N n5 = this.tango;
                S s3 = S.purple;
                n5.getClass();
                n5.juliet(null, s3);
            }
        }
        this.victor.foxtrot(null);
    }

    public final InterfaceC3206j azure() {
        S s3;
        yf.N n5 = this.tango;
        int compareTo = ((S) n5.getValue()).compareTo(S.purple);
        ArrayList arrayList = this.juliet;
        ArrayList arrayList2 = this.india;
        J.e eVar = this.hotel;
        if (compareTo <= 0) {
            for (C0590w c0590w : blue()) {
            }
            this.echo.clear();
            this.foxtrot = CollectionsKt.emptyList();
            this.golf = new bv.am();
            eVar.india();
            arrayList2.clear();
            arrayList.clear();
            this.oscar = null;
            C3207k c3207k = this.quebec;
            if (c3207k != null) {
                c3207k.delta(null);
            }
            this.quebec = null;
            this.romeo = null;
            return null;
        }
        if (this.romeo != null) {
            s3 = S.red;
        } else if (this.charlie == null) {
            this.golf = new bv.am();
            eVar.india();
            if (beige()) {
                s3 = S.silver;
            } else {
                s3 = S.red;
            }
        } else if (eVar.red == 0 && !this.golf.hotel() && arrayList2.isEmpty() && arrayList.isEmpty() && !beige() && !this.kilo.juliet()) {
            s3 = S.teal;
        } else {
            s3 = S.white;
        }
        n5.getClass();
        n5.juliet(null, s3);
        if (s3 != S.white) {
            return null;
        }
        C3207k c3207k2 = this.quebec;
        this.quebec = null;
        return c3207k2;
    }

    public final boolean beige() {
        if (!this.sierra && (this.alpha.silver.get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean black() {
        boolean z2;
        synchronized (this.bravo) {
            if (!this.golf.hotel() && this.hotel.red == 0) {
                if (!beige()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final List blue() {
        List arrayList;
        List list = this.foxtrot;
        if (list != null) {
            return list;
        }
        ArrayList arrayList2 = this.echo;
        if (arrayList2.isEmpty()) {
            arrayList = CollectionsKt.emptyList();
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.foxtrot = arrayList;
        return arrayList;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final bv.am bravo(C0590w c0590w, com.google.firebase.messaging.l lVar, Xd.l lVar2) {
        C1915c c1915c = this.uniform;
        try {
            com.google.firebase.messaging.l lVar3 = c0590w.f3014i;
            c0590w.f3014i = lVar;
            try {
                alpha(c0590w, lVar2);
                bv.am amVar = (bv.am) c1915c.mike();
                if (amVar == null) {
                    bv.am amVar2 = bv.av.alpha;
                    Intrinsics.charlie(amVar2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    amVar = amVar2;
                }
                return amVar;
            } finally {
                c0590w.f3014i = lVar3;
            }
        } finally {
            c1915c.yankee(null);
        }
    }

    public final void bronze() {
        synchronized (this.bravo) {
            this.sierra = true;
        }
    }

    public final void coral(C0590w c0590w) {
        synchronized (this.bravo) {
            ArrayList arrayList = this.juliet;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((av) arrayList.get(i4)).getClass();
                if (Intrinsics.areEqual(null, c0590w)) {
                    ArrayList arrayList2 = new ArrayList();
                    crimson(arrayList2, this, c0590w);
                    while (!arrayList2.isEmpty()) {
                        cyan(arrayList2, null);
                        crimson(arrayList2, this, c0590w);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0157, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).getSecond() == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0176, code lost:
    
        if (r11.getSecond() != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0178, code lost:
    
        r11 = (androidx.compose.runtime.av) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0181, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        r4 = r17.bravo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0187, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r17.juliet, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019b, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019d, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
    
        if (((kotlin.Pair) r11).getSecond() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01aa, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ad, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b0, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List cyan(List list, bv.am amVar) {
        S.c cVar;
        S.c black;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            ((av) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0590w c0590w = (C0590w) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0590w.f3020o.bronze) {
                r.charlie("Check failed");
            }
            Ya.c cVar2 = new Ya.c(11, c0590w);
            C0393r c0393r = new C0393r(10, c0590w, amVar);
            S.g kilo = S.n.kilo();
            if (kilo instanceof S.c) {
                cVar = (S.c) kilo;
            } else {
                cVar = null;
            }
            if (cVar != null && (black = cVar.black(cVar2, c0393r)) != null) {
                try {
                    S.g juliet = black.juliet();
                    try {
                        synchronized (this.bravo) {
                            try {
                                arrayList = new ArrayList(list2.size());
                                int size2 = list2.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    av avVar = (av) list2.get(i5);
                                    bv.al alVar = this.kilo;
                                    avVar.getClass();
                                    Object alpha = J.a.alpha(alVar);
                                    arrayList.add(new Pair(avVar, alpha));
                                }
                                int size3 = arrayList.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size3) {
                                        break;
                                    }
                                    Pair pair = (Pair) arrayList.get(i10);
                                    if (pair.getSecond() == null) {
                                        w.o oVar = this.lima;
                                        ((av) pair.getFirst()).getClass();
                                        if (((bv.al) oVar.purple).bravo(null)) {
                                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                            Iterator it = arrayList.iterator();
                                            while (it.hasNext()) {
                                                Pair pair2 = (Pair) it.next();
                                                if (pair2.getSecond() == null) {
                                                    w.o oVar2 = this.lima;
                                                    ((av) pair2.getFirst()).getClass();
                                                    bv.al alVar2 = (bv.al) oVar2.purple;
                                                    if (alVar2.india()) {
                                                        ((bv.al) oVar2.red).alpha();
                                                    }
                                                }
                                                arrayList2.add(pair2);
                                            }
                                            arrayList = arrayList2;
                                        }
                                    }
                                    i10++;
                                }
                            } finally {
                            }
                        }
                        int size4 = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size4) {
                                break;
                            }
                            if (((Pair) arrayList.get(i11)).getSecond() != null) {
                                break;
                            }
                            i11++;
                        }
                        c0590w.romeo(arrayList);
                        S.g.quebec(juliet);
                    } catch (Throwable th) {
                        S.g.quebec(juliet);
                        throw th;
                    }
                } finally {
                    zulu(black);
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return CollectionsKt.z(hashMap.keySet());
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean delta() {
        return ((Boolean) zulu.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean echo() {
        return false;
    }

    public final C0590w emerald(C0590w c0590w, bv.am amVar) {
        S.c cVar;
        S.c black;
        if (c0590w.f3020o.bronze || c0590w.f3021p == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.papa;
        if (linkedHashSet == null || !linkedHashSet.contains(c0590w)) {
            Ya.c cVar2 = new Ya.c(11, c0590w);
            C0393r c0393r = new C0393r(10, c0590w, amVar);
            S.g kilo = S.n.kilo();
            if (kilo instanceof S.c) {
                cVar = (S.c) kilo;
            } else {
                cVar = null;
            }
            if (cVar != null && (black = cVar.black(cVar2, c0393r)) != null) {
                try {
                    S.g juliet = black.juliet();
                    if (amVar != null) {
                        try {
                            if (amVar.hotel()) {
                                Yb.F f5 = new Yb.F(6, amVar, c0590w);
                                C0585q c0585q = c0590w.f3020o;
                                if (c0585q.bronze) {
                                    r.charlie("Preparing a composition while composing is not supported");
                                }
                                c0585q.bronze = true;
                                try {
                                    f5.invoke();
                                    c0585q.bronze = false;
                                } catch (Throwable th) {
                                    c0585q.bronze = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            S.g.quebec(juliet);
                            throw th2;
                        }
                    }
                    boolean xray = c0590w.xray();
                    S.g.quebec(juliet);
                    if (xray) {
                        return c0590w;
                    }
                } finally {
                    zulu(black);
                }
            } else {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final boolean foxtrot() {
        return false;
    }

    public final void fuchsia(Throwable th, C0590w c0590w) {
        if (((Boolean) zulu.get()).booleanValue() && !(th instanceof ComposeRuntimeError)) {
            synchronized (this.bravo) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.india.clear();
                    this.hotel.india();
                    this.golf = new bv.am();
                    this.juliet.clear();
                    this.kilo.alpha();
                    this.mike.alpha();
                    this.romeo = new O7.l(27, th);
                    if (c0590w != null) {
                        gray(c0590w);
                    }
                    azure();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.bravo) {
            O7.l lVar = this.romeo;
            if (lVar == null) {
                this.romeo = new O7.l(27, th);
            } else {
                throw ((Throwable) lVar.purple);
            }
        }
        throw th;
    }

    public final boolean gold() {
        CollectionsKt.emptyList();
        synchronized (this.bravo) {
            boolean z2 = true;
            if (this.golf.golf()) {
                if (this.hotel.red == 0 && !beige() && !this.kilo.juliet()) {
                    z2 = false;
                }
                return z2;
            }
            List blue = blue();
            J.h hVar = new J.h(this.golf);
            this.golf = new bv.am();
            try {
                int size = blue.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C0590w) blue.get(i4)).yankee(hVar);
                    if (((S) this.tango.getValue()).compareTo(S.purple) <= 0) {
                        break;
                    }
                }
                synchronized (this.bravo) {
                    if (azure() == null) {
                        if (this.hotel.red == 0 && !beige() && !this.kilo.juliet()) {
                            z2 = false;
                        }
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (this.bravo) {
                    bv.am amVar = this.golf;
                    amVar.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        amVar.kilo(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final long golf() {
        return 1000;
    }

    public final void gray(C0590w c0590w) {
        ArrayList arrayList = this.oscar;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.oscar = arrayList;
        }
        if (!arrayList.contains(c0590w)) {
            arrayList.add(c0590w);
        }
        if (this.echo.remove(c0590w)) {
            this.foxtrot = null;
        }
    }

    public final void green() {
        InterfaceC3206j interfaceC3206j;
        synchronized (this.bravo) {
            if (this.sierra) {
                this.sierra = false;
                interfaceC3206j = azure();
            } else {
                interfaceC3206j = null;
            }
        }
        if (interfaceC3206j != null) {
            Result.Companion companion = Result.INSTANCE;
            ((C3207k) interfaceC3206j).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final InterfaceC0586s hotel() {
        return null;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final Nd.h juliet() {
        return this.whiskey;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void kilo(C0590w c0590w) {
        InterfaceC3206j interfaceC3206j;
        synchronized (this.bravo) {
            if (!this.hotel.juliet(c0590w)) {
                this.hotel.bravo(c0590w);
                interfaceC3206j = azure();
            } else {
                interfaceC3206j = null;
            }
        }
        if (interfaceC3206j != null) {
            Result.Companion companion = Result.INSTANCE;
            ((C3207k) interfaceC3206j).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final au lima(av avVar) {
        au auVar;
        synchronized (this.bravo) {
            auVar = (au) this.mike.kilo(avVar);
        }
        return auVar;
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final bv.am mike(C0590w c0590w, com.google.firebase.messaging.l lVar, bv.am amVar) {
        C1915c c1915c = this.uniform;
        try {
            gold();
            c0590w.yankee(new J.h(amVar));
            com.google.firebase.messaging.l lVar2 = c0590w.f3014i;
            c0590w.f3014i = lVar;
            try {
                C0590w emerald = emerald(c0590w, null);
                if (emerald != null) {
                    coral(c0590w);
                    emerald.delta();
                    emerald.foxtrot();
                }
                bv.am amVar2 = (bv.am) c1915c.mike();
                if (amVar2 == null) {
                    bv.am amVar3 = bv.av.alpha;
                    Intrinsics.charlie(amVar3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                    amVar2 = amVar3;
                }
                return amVar2;
            } finally {
                c0590w.f3014i = lVar2;
            }
        } finally {
            c1915c.yankee(null);
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void november(Set set) {
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void papa(Q q4) {
        C1915c c1915c = this.uniform;
        bv.am amVar = (bv.am) c1915c.mike();
        if (amVar == null) {
            bv.am amVar2 = bv.av.alpha;
            amVar = new bv.am();
            c1915c.yankee(amVar);
        }
        amVar.alpha(q4);
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void quebec(C0590w c0590w) {
        synchronized (this.bravo) {
            try {
                LinkedHashSet linkedHashSet = this.papa;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.papa = linkedHashSet;
                }
                linkedHashSet.add(c0590w);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC0587t
    public final void tango(C0590w c0590w) {
        synchronized (this.bravo) {
            if (this.echo.remove(c0590w)) {
                this.foxtrot = null;
            }
            this.hotel.lima(c0590w);
            this.india.remove(c0590w);
        }
    }
}
