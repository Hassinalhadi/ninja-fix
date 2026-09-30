package S;

import Lb.am;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class n {
    public static final am alpha = new am(18);
    public static final C1915c bravo = new C1915c(15);
    public static final Object charlie = new Object();
    public static l delta;
    public static long echo;
    public static final j foxtrot;
    public static final B0.a golf;
    public static List hotel;
    public static List india;
    public static final b juliet;
    public static final P.a kilo;

    /* JADX WARN: Type inference failed for: r0v9, types: [P.a, java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Type inference failed for: r1v2, types: [S.b, S.c, S.g] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, S.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    static {
        l lVar = l.teal;
        delta = lVar;
        long j5 = 1;
        echo = j5 + j5;
        ?? obj = new Object();
        obj.charlie = new long[16];
        obj.delta = new int[16];
        int[] iArr = new int[16];
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i4 + 1;
            iArr[i4] = i5;
            i4 = i5;
        }
        obj.echo = iArr;
        foxtrot = obj;
        B0.a aVar = new B0.a((char) 0, 2);
        aVar.charlie = new int[16];
        aVar.delta = new P.l[16];
        golf = aVar;
        hotel = CollectionsKt.emptyList();
        india = CollectionsKt.emptyList();
        long j6 = echo;
        echo = j5 + j6;
        ?? cVar = new c(j6, lVar, null, new am(17));
        delta = delta.india(cVar.bravo);
        juliet = cVar;
        kilo = new AtomicInteger(0);
    }

    public static final void alpha() {
        foxtrot(alpha);
    }

    public static final Function1 bravo(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && function1 != function12) {
            return new m(function1, function12, 1);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final HashMap charlie(long j5, c cVar, l lVar) {
        long[] jArr;
        l lVar2;
        long[] jArr2;
        l lVar3;
        int i4;
        ae tango;
        long j6 = j5;
        bv.am xray = cVar.xray();
        if (xray != null) {
            l hotel2 = cVar.delta().india(cVar.golf()).hotel(cVar.juliet);
            Object[] objArr = xray.bravo;
            long[] jArr3 = xray.alpha;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j7 = jArr3[i5];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i5 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j7 & 255) < 128) {
                                ac acVar = (ac) objArr[(i5 << 3) + i12];
                                ae hotel3 = acVar.hotel();
                                jArr2 = jArr3;
                                i4 = i10;
                                ae tango2 = tango(hotel3, j6, lVar);
                                if (tango2 != null && (tango = tango(hotel3, j6, hotel2)) != null && !Intrinsics.areEqual(tango2, tango)) {
                                    lVar3 = hotel2;
                                    ae tango3 = tango(hotel3, cVar.golf(), cVar.delta());
                                    if (tango3 != null) {
                                        ae delta2 = acVar.delta(tango, tango2, tango3);
                                        if (delta2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(tango2, delta2);
                                        hashMap = hashMap;
                                    } else {
                                        sierra();
                                        throw null;
                                    }
                                } else {
                                    lVar3 = hotel2;
                                }
                            } else {
                                jArr2 = jArr3;
                                lVar3 = hotel2;
                                i4 = i10;
                            }
                            j7 >>= i4;
                            i12++;
                            j6 = j5;
                            i10 = i4;
                            jArr3 = jArr2;
                            hotel2 = lVar3;
                        }
                        jArr = jArr3;
                        lVar2 = hotel2;
                        if (i11 != i10) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        lVar2 = hotel2;
                    }
                    if (i5 != length) {
                        i5++;
                        j6 = j5;
                        jArr3 = jArr;
                        hotel2 = lVar2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final void delta(g gVar) {
        c cVar;
        Object obj;
        long j5;
        if (!delta.delta(gVar.golf())) {
            StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
            sb2.append(gVar.golf());
            sb2.append(", disposed=");
            sb2.append(gVar.charlie);
            sb2.append(", applied=");
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                obj = Boolean.valueOf(cVar.mike);
            } else {
                obj = "read-only";
            }
            sb2.append(obj);
            sb2.append(", lowestPin=");
            synchronized (charlie) {
                j jVar = foxtrot;
                if (jVar.alpha > 0) {
                    j5 = ((long[]) jVar.charlie)[0];
                } else {
                    j5 = -1;
                }
            }
            sb2.append(j5);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static final l echo(l lVar, long j5, long j6) {
        while (Intrinsics.hotel(j5, j6) < 0) {
            lVar = lVar.india(j5);
            j5++;
        }
        return lVar;
    }

    public static final Object foxtrot(Function1 function1) {
        bv.am amVar;
        Object whiskey;
        b bVar = juliet;
        synchronized (charlie) {
            try {
                amVar = bVar.hotel;
                if (amVar != null) {
                    kilo.addAndGet(1);
                }
                whiskey = whiskey(bVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (amVar != null) {
            try {
                List list = hotel;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((Xd.l) list.get(i4)).invoke(new J.h(amVar), bVar);
                }
            } finally {
                kilo.addAndGet(-1);
            }
        }
        synchronized (charlie) {
            golf();
            if (amVar != null) {
                Object[] objArr = amVar.bravo;
                long[] jArr = amVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j5) < 128) {
                                    romeo((ac) objArr[(i5 << 3) + i11]);
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
        return whiskey;
    }

    public static final void golf() {
        B0.a aVar = golf;
        int i4 = aVar.bravo;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            Object obj = null;
            if (i5 >= i4) {
                break;
            }
            P.l lVar = ((P.l[]) aVar.delta)[i5];
            if (lVar != null) {
                obj = lVar.get();
            }
            if (obj != null && quebec((ac) obj)) {
                if (i10 != i5) {
                    ((P.l[]) aVar.delta)[i10] = lVar;
                    int[] iArr = (int[]) aVar.charlie;
                    iArr[i10] = iArr[i5];
                }
                i10++;
            }
            i5++;
        }
        for (int i11 = i10; i11 < i4; i11++) {
            ((P.l[]) aVar.delta)[i11] = null;
            ((int[]) aVar.charlie)[i11] = 0;
        }
        if (i10 != i4) {
            aVar.bravo = i10;
        }
    }

    public static final g hotel(g gVar, Function1 function1, boolean z2) {
        c cVar;
        boolean z10 = gVar instanceof c;
        if (!z10 && gVar != null) {
            return new ak(gVar, function1, false, z2);
        }
        if (z10) {
            cVar = (c) gVar;
        } else {
            cVar = null;
        }
        return new aj(cVar, function1, null, false, z2);
    }

    public static final ae india(ae aeVar) {
        ae tango;
        g kilo2 = kilo();
        ae tango2 = tango(aeVar, kilo2.golf(), kilo2.delta());
        if (tango2 == null) {
            synchronized (charlie) {
                g kilo3 = kilo();
                tango = tango(aeVar, kilo3.golf(), kilo3.delta());
            }
            if (tango != null) {
                return tango;
            }
            sierra();
            throw null;
        }
        return tango2;
    }

    public static final ae juliet(ae aeVar, g gVar) {
        ae tango;
        ae tango2 = tango(aeVar, gVar.golf(), gVar.delta());
        if (tango2 == null) {
            synchronized (charlie) {
                tango = tango(aeVar, gVar.golf(), gVar.delta());
            }
            if (tango != null) {
                return tango;
            }
            sierra();
            throw null;
        }
        return tango2;
    }

    public static final g kilo() {
        g gVar = (g) bravo.mike();
        if (gVar == null) {
            return juliet;
        }
        return gVar;
    }

    public static final Function1 lima(Function1 function1, Function1 function12, boolean z2) {
        if (!z2) {
            function12 = null;
        }
        if (function1 != null && function12 != null && function1 != function12) {
            return new m(function1, function12, 0);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ae mike(ae aeVar, ac acVar) {
        ae hotel2 = acVar.hotel();
        long j5 = echo;
        j jVar = foxtrot;
        if (jVar.alpha > 0) {
            j5 = ((long[]) jVar.charlie)[0];
        }
        long j6 = j5 - 1;
        l lVar = l.teal;
        ae aeVar2 = null;
        ae aeVar3 = null;
        while (true) {
            if (hotel2 == null) {
                break;
            }
            long j7 = hotel2.alpha;
            if (j7 == 0) {
                break;
            }
            if (j7 != 0 && Intrinsics.hotel(j7, j6) <= 0 && !lVar.delta(j7)) {
                if (aeVar3 == null) {
                    aeVar3 = hotel2;
                } else if (Intrinsics.hotel(hotel2.alpha, aeVar3.alpha) >= 0) {
                    aeVar2 = aeVar3;
                }
            }
            hotel2 = hotel2.bravo;
        }
        if (aeVar2 != null) {
            aeVar2.alpha = Long.MAX_VALUE;
            return aeVar2;
        }
        ae bravo2 = aeVar.bravo(Long.MAX_VALUE);
        bravo2.bravo = acVar.hotel();
        acVar.india(bravo2);
        return bravo2;
    }

    public static final ae november(ae aeVar, androidx.compose.runtime.ad adVar, g gVar) {
        ae mike;
        synchronized (charlie) {
            mike = mike(aeVar, adVar);
            mike.alpha(aeVar);
            mike.alpha = gVar.golf();
        }
        return mike;
    }

    public static final void oscar(g gVar, ac acVar) {
        gVar.tango(gVar.hotel() + 1);
        Function1 india2 = gVar.india();
        if (india2 != null) {
            india2.invoke(acVar);
        }
    }

    public static final ae papa(ae aeVar, ad adVar, g gVar, ae aeVar2) {
        ae mike;
        if (gVar.foxtrot()) {
            gVar.november(adVar);
        }
        long golf2 = gVar.golf();
        if (aeVar2.alpha == golf2) {
            return aeVar2;
        }
        synchronized (charlie) {
            mike = mike(aeVar, adVar);
        }
        mike.alpha = golf2;
        if (aeVar2.alpha != 1) {
            gVar.november(adVar);
        }
        return mike;
    }

    public static final boolean quebec(ac acVar) {
        ae aeVar;
        long j5 = echo;
        j jVar = foxtrot;
        if (jVar.alpha > 0) {
            j5 = ((long[]) jVar.charlie)[0];
        }
        ae aeVar2 = null;
        ae aeVar3 = null;
        int i4 = 0;
        for (ae hotel2 = acVar.hotel(); hotel2 != null; hotel2 = hotel2.bravo) {
            long j6 = hotel2.alpha;
            if (j6 != 0) {
                if (Intrinsics.hotel(j6, j5) < 0) {
                    if (aeVar2 == null) {
                        i4++;
                        aeVar2 = hotel2;
                    } else {
                        if (Intrinsics.hotel(hotel2.alpha, aeVar2.alpha) < 0) {
                            aeVar = aeVar2;
                            aeVar2 = hotel2;
                        } else {
                            aeVar = hotel2;
                        }
                        if (aeVar3 == null) {
                            aeVar3 = acVar.hotel();
                            ae aeVar4 = aeVar3;
                            while (true) {
                                if (aeVar3 != null) {
                                    if (Intrinsics.hotel(aeVar3.alpha, j5) >= 0) {
                                        break;
                                    }
                                    if (Intrinsics.hotel(aeVar4.alpha, aeVar3.alpha) < 0) {
                                        aeVar4 = aeVar3;
                                    }
                                    aeVar3 = aeVar3.bravo;
                                } else {
                                    aeVar3 = aeVar4;
                                    break;
                                }
                            }
                        }
                        aeVar2.alpha = 0L;
                        aeVar2.alpha(aeVar3);
                        aeVar2 = aeVar;
                    }
                } else {
                    i4++;
                }
            }
        }
        if (i4 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void romeo(ac acVar) {
        Object obj;
        Object obj2;
        Object obj3;
        if (quebec(acVar)) {
            B0.a aVar = golf;
            int i4 = aVar.bravo;
            int identityHashCode = System.identityHashCode(acVar);
            int i5 = -1;
            if (i4 > 0) {
                int i10 = aVar.bravo - 1;
                int i11 = 0;
                while (true) {
                    if (i11 <= i10) {
                        int i12 = (i11 + i10) >>> 1;
                        int i13 = ((int[]) aVar.charlie)[i12];
                        if (i13 < identityHashCode) {
                            i11 = i12 + 1;
                        } else if (i13 > identityHashCode) {
                            i10 = i12 - 1;
                        } else {
                            P.l lVar = ((P.l[]) aVar.delta)[i12];
                            if (lVar != null) {
                                obj = lVar.get();
                            } else {
                                obj = null;
                            }
                            if (acVar != obj) {
                                for (int i14 = i12 - 1; -1 < i14 && ((int[]) aVar.charlie)[i14] == identityHashCode; i14--) {
                                    P.l lVar2 = ((P.l[]) aVar.delta)[i14];
                                    if (lVar2 != null) {
                                        obj3 = lVar2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == acVar) {
                                        i5 = i14;
                                        break;
                                    }
                                }
                                i12++;
                                int i15 = aVar.bravo;
                                while (true) {
                                    if (i12 < i15) {
                                        if (((int[]) aVar.charlie)[i12] != identityHashCode) {
                                            i5 = -(i12 + 1);
                                            break;
                                        }
                                        P.l lVar3 = ((P.l[]) aVar.delta)[i12];
                                        if (lVar3 != null) {
                                            obj2 = lVar3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == acVar) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    } else {
                                        i5 = -(aVar.bravo + 1);
                                        break;
                                    }
                                }
                            }
                            i5 = i12;
                        }
                    } else {
                        i5 = -(i11 + 1);
                        break;
                    }
                }
                if (i5 >= 0) {
                    return;
                }
            }
            int i16 = -(i5 + 1);
            P.l[] lVarArr = (P.l[]) aVar.delta;
            int length = lVarArr.length;
            if (i4 == length) {
                int i17 = length * 2;
                P.l[] lVarArr2 = new P.l[i17];
                int[] iArr = new int[i17];
                int i18 = i16 + 1;
                System.arraycopy(lVarArr, i16, lVarArr2, i18, i4 - i16);
                System.arraycopy((P.l[]) aVar.delta, 0, lVarArr2, 0, i16);
                ArraysKt.zulu(i18, i16, (int[]) aVar.charlie, iArr, i4);
                ArraysKt.black(0, i16, (int[]) aVar.charlie, iArr, 6);
                aVar.delta = lVarArr2;
                aVar.charlie = iArr;
            } else {
                int i19 = i16 + 1;
                System.arraycopy(lVarArr, i16, lVarArr, i19, i4 - i16);
                int[] iArr2 = (int[]) aVar.charlie;
                ArraysKt.zulu(i19, i16, iArr2, iArr2, i4);
            }
            ((P.l[]) aVar.delta)[i16] = new WeakReference(acVar);
            ((int[]) aVar.charlie)[i16] = identityHashCode;
            aVar.bravo++;
        }
    }

    public static final void sierra() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final ae tango(ae aeVar, long j5, l lVar) {
        ae aeVar2 = null;
        while (aeVar != null) {
            long j6 = aeVar.alpha;
            if (j6 != 0 && Intrinsics.hotel(j6, j5) <= 0 && !lVar.delta(j6) && (aeVar2 == null || Intrinsics.hotel(aeVar2.alpha, aeVar.alpha) < 0)) {
                aeVar2 = aeVar;
            }
            aeVar = aeVar.bravo;
        }
        if (aeVar2 == null) {
            return null;
        }
        return aeVar2;
    }

    public static final ae uniform(ae aeVar, ac acVar) {
        ae tango;
        g kilo2 = kilo();
        Function1 echo2 = kilo2.echo();
        if (echo2 != null) {
            echo2.invoke(acVar);
        }
        ae tango2 = tango(aeVar, kilo2.golf(), kilo2.delta());
        if (tango2 == null) {
            synchronized (charlie) {
                g kilo3 = kilo();
                ae hotel2 = acVar.hotel();
                Intrinsics.charlie(hotel2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
                tango = tango(hotel2, kilo3.golf(), kilo3.delta());
                if (tango == null) {
                    sierra();
                    throw null;
                }
            }
            return tango;
        }
        return tango2;
    }

    public static final void victor(int i4) {
        j jVar = foxtrot;
        int i5 = ((int[]) jVar.echo)[i4];
        jVar.november(i5, jVar.alpha - 1);
        jVar.alpha--;
        long[] jArr = (long[]) jVar.charlie;
        long j5 = jArr[i5];
        int i10 = i5;
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (Intrinsics.hotel(jArr[i11], j5) <= 0) {
                break;
            }
            jVar.november(i11, i10);
            i10 = i11;
        }
        long[] jArr2 = (long[]) jVar.charlie;
        int i12 = jVar.alpha >> 1;
        while (i5 < i12) {
            int i13 = (i5 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 < jVar.alpha && Intrinsics.hotel(jArr2[i13], jArr2[i14]) < 0) {
                if (Intrinsics.hotel(jArr2[i13], jArr2[i5]) >= 0) {
                    break;
                }
                jVar.november(i13, i5);
                i5 = i13;
            } else {
                if (Intrinsics.hotel(jArr2[i14], jArr2[i5]) >= 0) {
                    break;
                }
                jVar.november(i14, i5);
                i5 = i14;
            }
        }
        ((int[]) jVar.echo)[i4] = jVar.bravo;
        jVar.bravo = i4;
    }

    public static final Object whiskey(b bVar, Function1 function1) {
        long j5 = bVar.bravo;
        Object invoke = function1.invoke(delta.bravo(j5));
        long j6 = echo;
        echo = 1 + j6;
        l bravo2 = delta.bravo(j5);
        delta = bravo2;
        bVar.bravo = j6;
        bVar.alpha = bravo2;
        bVar.golf = 0;
        bVar.hotel = null;
        bVar.oscar();
        delta = delta.india(j6);
        return invoke;
    }

    public static final ae xray(ae aeVar, ac acVar, g gVar) {
        ae tango;
        if (gVar.foxtrot()) {
            gVar.november(acVar);
        }
        long golf2 = gVar.golf();
        ae tango2 = tango(aeVar, golf2, gVar.delta());
        if (tango2 != null) {
            if (tango2.alpha == gVar.golf()) {
                return tango2;
            }
            synchronized (charlie) {
                tango = tango(acVar.hotel(), golf2, gVar.delta());
                if (tango != null) {
                    if (tango.alpha != golf2) {
                        ae mike = mike(tango, acVar);
                        mike.alpha(tango);
                        mike.alpha = gVar.golf();
                        tango = mike;
                    }
                } else {
                    sierra();
                    throw null;
                }
            }
            if (tango2.alpha != 1) {
                gVar.november(acVar);
            }
            return tango;
        }
        sierra();
        throw null;
    }
}
