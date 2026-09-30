package S;

import androidx.compose.runtime.J;
import bv.am;
import bv.av;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class c extends g {
    public static final int[] november = new int[0];
    public final Function1 echo;
    public final Function1 foxtrot;
    public int golf;
    public am hotel;
    public ArrayList india;
    public l juliet;
    public int[] kilo;
    public int lima;
    public boolean mike;

    public c(long j5, l lVar, Function1 function1, Function1 function12) {
        super(j5, lVar);
        this.echo = function1;
        this.foxtrot = function12;
        this.juliet = l.teal;
        this.kilo = november;
        this.lima = 1;
    }

    public final void amber(long j5) {
        synchronized (n.charlie) {
            this.juliet = this.juliet.india(j5);
        }
    }

    public final void azure(l lVar) {
        synchronized (n.charlie) {
            this.juliet = this.juliet.hotel(lVar);
        }
    }

    public void beige(am amVar) {
        this.hotel = amVar;
    }

    public c black(Function1 function1, Function1 function12) {
        if (this.charlie) {
            J.alpha("Cannot use a disposed snapshot");
        }
        if (this.mike && this.delta < 0) {
            J.bravo("Unsupported operation on a disposed or applied snapshot");
        }
        amber(golf());
        Object obj = n.charlie;
        synchronized (obj) {
            try {
                long j5 = n.echo;
                long j6 = 1;
                n.echo = j5 + j6;
                n.delta = n.delta.india(j5);
                l delta = delta();
                romeo(delta.india(j5));
                try {
                    d dVar = new d(j5, n.echo(delta, golf() + j6, j5), n.lima(function1, echo(), true), n.bravo(function12, india()), this);
                    if (!this.mike && !this.charlie) {
                        long golf = golf();
                        synchronized (obj) {
                            long j7 = n.echo;
                            n.echo = j7 + j6;
                            sierra(j7);
                            n.delta = n.delta.india(golf());
                        }
                        romeo(n.echo(delta(), golf + j6, golf()));
                        return dVar;
                    }
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // S.g
    public final void bravo() {
        n.delta = n.delta.bravo(golf()).alpha(this.juliet);
    }

    @Override // S.g
    public void charlie() {
        if (!this.charlie) {
            this.charlie = true;
            synchronized (n.charlie) {
                oscar();
            }
            lima();
        }
    }

    @Override // S.g
    public boolean foxtrot() {
        return false;
    }

    @Override // S.g
    public int hotel() {
        return this.golf;
    }

    @Override // S.g
    public Function1 india() {
        return this.foxtrot;
    }

    @Override // S.g
    public void kilo() {
        this.lima++;
    }

    @Override // S.g
    public void lima() {
        if (this.lima <= 0) {
            J.alpha("no pending nested snapshots");
        }
        int i4 = this.lima - 1;
        this.lima = i4;
        if (i4 == 0 && !this.mike) {
            am xray = xray();
            if (xray != null) {
                if (this.mike) {
                    J.bravo("Unsupported operation on a snapshot that has been applied");
                }
                beige(null);
                long golf = golf();
                Object[] objArr = xray.bravo;
                long[] jArr = xray.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j5) < 128) {
                                    for (ae hotel = ((ac) objArr[(i5 << 3) + i11]).hotel(); hotel != null; hotel = hotel.bravo) {
                                        long j6 = hotel.alpha;
                                        if (j6 == golf || CollectionsKt.bronze(this.juliet, Long.valueOf(j6))) {
                                            Lb.am amVar = n.alpha;
                                            hotel.alpha = 0L;
                                        }
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            alpha();
        }
    }

    @Override // S.g
    public void mike() {
        if (!this.mike && !this.charlie) {
            victor();
        }
    }

    @Override // S.g
    public void november(ac acVar) {
        am xray = xray();
        if (xray == null) {
            am amVar = av.alpha;
            xray = new am();
            beige(xray);
        }
        xray.alpha(acVar);
    }

    @Override // S.g
    public final void papa() {
        int length = this.kilo.length;
        for (int i4 = 0; i4 < length; i4++) {
            n.victor(this.kilo[i4]);
        }
        oscar();
    }

    @Override // S.g
    public void tango(int i4) {
        this.golf = i4;
    }

    @Override // S.g
    public g uniform(Function1 function1) {
        if (this.charlie) {
            J.alpha("Cannot use a disposed snapshot");
        }
        if (this.mike && this.delta < 0) {
            J.bravo("Unsupported operation on a disposed or applied snapshot");
        }
        long golf = golf();
        boolean z2 = this instanceof b;
        amber(golf());
        Object obj = n.charlie;
        synchronized (obj) {
            try {
                long j5 = n.echo;
                long j6 = 1;
                n.echo = j5 + j6;
                n.delta = n.delta.india(j5);
                try {
                    e eVar = new e(j5, n.echo(delta(), golf + j6, j5), n.lima(function1, echo(), true), this);
                    if (!this.mike && !this.charlie) {
                        long golf2 = golf();
                        synchronized (obj) {
                            long j7 = n.echo;
                            n.echo = j7 + j6;
                            sierra(j7);
                            n.delta = n.delta.india(golf());
                        }
                        romeo(n.echo(delta(), golf2 + j6, golf()));
                        return eVar;
                    }
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void victor() {
        long j5;
        amber(golf());
        if (!this.mike && !this.charlie) {
            long golf = golf();
            synchronized (n.charlie) {
                long j6 = n.echo;
                j5 = 1;
                n.echo = j6 + j5;
                sierra(j6);
                n.delta = n.delta.india(golf());
            }
            romeo(n.echo(delta(), golf + j5, golf()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[LOOP:1: B:31:0x00ab->B:32:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:37:0x00bc, B:39:0x00cc, B:42:0x00d8, B:44:0x00e4, B:46:0x00ee, B:48:0x00f4, B:50:0x0102, B:56:0x0113, B:59:0x011d, B:61:0x0127, B:63:0x0131, B:65:0x0137, B:67:0x0141, B:73:0x0149, B:75:0x014c, B:77:0x0150, B:79:0x0157, B:81:0x0163, B:87:0x010a), top: B:36:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:37:0x00bc, B:39:0x00cc, B:42:0x00d8, B:44:0x00e4, B:46:0x00ee, B:48:0x00f4, B:50:0x0102, B:56:0x0113, B:59:0x011d, B:61:0x0127, B:63:0x0131, B:65:0x0137, B:67:0x0141, B:73:0x0149, B:75:0x014c, B:77:0x0150, B:79:0x0157, B:81:0x0163, B:87:0x010a), top: B:36:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u whiskey() {
        HashMap hashMap;
        List list;
        am amVar;
        long j5;
        long j6;
        ArrayList arrayList;
        int size;
        int i4;
        am xray = xray();
        if (xray != null) {
            long j7 = n.juliet.bravo;
            hashMap = n.charlie(j7, this, n.delta.bravo(j7));
        } else {
            hashMap = null;
        }
        List emptyList = CollectionsKt.emptyList();
        synchronized (n.charlie) {
            try {
                n.delta(this);
                if (xray != null && xray.delta != 0) {
                    b bVar = n.juliet;
                    u zulu = zulu(n.echo, xray, hashMap, n.delta.bravo(bVar.bravo));
                    if (!Intrinsics.areEqual(zulu, i.bravo)) {
                        return zulu;
                    }
                    bravo();
                    amVar = bVar.hotel;
                    n.whiskey(bVar, n.alpha);
                    beige(null);
                    bVar.hotel = null;
                    list = n.hotel;
                    this.mike = true;
                    if (amVar != null) {
                        J.h hVar = new J.h(amVar);
                        if (!amVar.golf()) {
                            int size2 = list.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                ((Xd.l) list.get(i5)).invoke(hVar, this);
                            }
                        }
                    }
                    if (xray != null && xray.hotel()) {
                        J.h hVar2 = new J.h(xray);
                        size = list.size();
                        for (i4 = 0; i4 < size; i4++) {
                            ((Xd.l) list.get(i4)).invoke(hVar2, this);
                        }
                    }
                    synchronized (n.charlie) {
                        try {
                            papa();
                            n.golf();
                            if (amVar != null) {
                                Object[] objArr = amVar.bravo;
                                long[] jArr = amVar.alpha;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    j5 = 128;
                                    while (true) {
                                        long j10 = jArr[i10];
                                        j6 = 255;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j10 & 255) < 128) {
                                                    n.romeo((ac) objArr[(i10 << 3) + i12]);
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (xray != null) {
                                        Object[] objArr2 = xray.bravo;
                                        long[] jArr2 = xray.alpha;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i13 = 0;
                                            while (true) {
                                                long j11 = jArr2[i13];
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                    for (int i15 = 0; i15 < i14; i15++) {
                                                        if ((j11 & j6) < j5) {
                                                            n.romeo((ac) objArr2[(i13 << 3) + i15]);
                                                        }
                                                        j11 >>= 8;
                                                    }
                                                    if (i14 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i13 == length2) {
                                                    break;
                                                }
                                                i13++;
                                            }
                                        }
                                    }
                                    arrayList = this.india;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i16 = 0; i16 < size3; i16++) {
                                            n.romeo((ac) arrayList.get(i16));
                                        }
                                    }
                                    this.india = null;
                                }
                            }
                            j5 = 128;
                            j6 = 255;
                            if (xray != null) {
                            }
                            arrayList = this.india;
                            if (arrayList != null) {
                            }
                            this.india = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return i.bravo;
                }
                bravo();
                b bVar2 = n.juliet;
                am amVar2 = bVar2.hotel;
                n.whiskey(bVar2, n.alpha);
                if (amVar2 != null && amVar2.hotel()) {
                    list = n.hotel;
                    amVar = amVar2;
                } else {
                    list = emptyList;
                    amVar = null;
                }
                this.mike = true;
                if (amVar != null) {
                }
                if (xray != null) {
                    J.h hVar22 = new J.h(xray);
                    size = list.size();
                    while (i4 < size) {
                    }
                }
                synchronized (n.charlie) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public am xray() {
        return this.hotel;
    }

    @Override // S.g
    /* renamed from: yankee, reason: merged with bridge method [inline-methods] */
    public Function1 echo() {
        return this.echo;
    }

    public final u zulu(long j5, am amVar, HashMap hashMap, l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        long j6;
        ArrayList arrayList4;
        ae delta;
        Pair pair;
        ArrayList arrayList5;
        l hotel = delta().india(golf()).hotel(this.juliet);
        Object[] objArr3 = amVar.bravo;
        long[] jArr3 = amVar.alpha;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j7 = jArr3[i5];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i5 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j7 & 255) < 128) {
                            objArr2 = objArr3;
                            ac acVar = (ac) objArr3[(i5 << 3) + i11];
                            jArr2 = jArr3;
                            ae hotel2 = acVar.hotel();
                            i4 = i11;
                            ArrayList arrayList6 = arrayList3;
                            ae tango = n.tango(hotel2, j5, lVar);
                            if (tango == null) {
                                lVar3 = hotel;
                                arrayList4 = arrayList2;
                                j6 = j7;
                            } else {
                                arrayList4 = arrayList2;
                                j6 = j7;
                                ae tango2 = n.tango(hotel2, golf(), hotel);
                                if (tango2 == null) {
                                    lVar3 = hotel;
                                } else {
                                    lVar3 = hotel;
                                    if (tango2.alpha != 1 && !Intrinsics.areEqual(tango, tango2)) {
                                        ae tango3 = n.tango(hotel2, golf(), delta());
                                        if (tango3 != null) {
                                            if (hashMap == null || (delta = (ae) hashMap.get(tango)) == null) {
                                                delta = acVar.delta(tango2, tango, tango3);
                                            }
                                            if (delta == null) {
                                                return new h(this);
                                            }
                                            if (!Intrinsics.areEqual(delta, tango3)) {
                                                if (Intrinsics.areEqual(delta, tango)) {
                                                    if (arrayList6 == null) {
                                                        arrayList5 = new ArrayList();
                                                    } else {
                                                        arrayList5 = arrayList6;
                                                    }
                                                    arrayList5.add(new Pair(acVar, tango.bravo(golf())));
                                                    if (arrayList4 == null) {
                                                        arrayList2 = new ArrayList();
                                                    } else {
                                                        arrayList2 = arrayList4;
                                                    }
                                                    arrayList2.add(acVar);
                                                    arrayList3 = arrayList5;
                                                } else {
                                                    if (arrayList6 == null) {
                                                        arrayList3 = new ArrayList();
                                                    } else {
                                                        arrayList3 = arrayList6;
                                                    }
                                                    if (!Intrinsics.areEqual(delta, tango2)) {
                                                        pair = new Pair(acVar, delta);
                                                    } else {
                                                        pair = new Pair(acVar, tango2.bravo(golf()));
                                                    }
                                                    arrayList3.add(pair);
                                                    arrayList2 = arrayList4;
                                                }
                                            }
                                        } else {
                                            n.sierra();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            lVar3 = hotel;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = i11;
                            j6 = j7;
                        }
                        j7 = j6 >> 8;
                        i11 = i4 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        hotel = lVar3;
                    }
                    lVar2 = hotel;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    lVar2 = hotel;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i5 != length) {
                    i5++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    hotel = lVar2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            victor();
            int size = arrayList3.size();
            for (int i12 = 0; i12 < size; i12++) {
                Pair pair2 = (Pair) arrayList3.get(i12);
                ac acVar2 = (ac) pair2.first;
                ae aeVar = (ae) pair2.second;
                aeVar.alpha = j5;
                synchronized (n.charlie) {
                    aeVar.bravo = acVar2.hotel();
                    acVar2.india(aeVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                amVar.lima((ac) arrayList2.get(i13));
            }
            ArrayList arrayList7 = this.india;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.a(arrayList7, arrayList2);
            }
            this.india = arrayList2;
        }
        return i.bravo;
    }
}
