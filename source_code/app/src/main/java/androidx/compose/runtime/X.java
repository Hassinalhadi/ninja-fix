package androidx.compose.runtime;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X extends Pd.i implements Xd.m {
    public List alpha;
    public List purple;
    public List red;

    /* renamed from: s, reason: collision with root package name */
    public bv.am f2999s;
    public bv.am silver;

    /* renamed from: t, reason: collision with root package name */
    public int f3000t;
    public bv.am teal;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ at f3001u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y f3002v;
    public bv.am white;
    public Set yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y10, Nd.c cVar) {
        super(3, cVar);
        this.f3002v = y10;
    }

    public static final void foxtrot(Y y10, List list, List list2, List list3, bv.am amVar, bv.am amVar2, bv.am amVar3, bv.am amVar4) {
        char c3;
        long j5;
        long j6;
        synchronized (y10.bravo) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0590w c0590w = (C0590w) list3.get(i4);
                    c0590w.alpha();
                    y10.gray(c0590w);
                }
                list3.clear();
                Object[] objArr = amVar.bravo;
                long[] jArr = amVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    j5 = 255;
                    while (true) {
                        long j7 = jArr[i5];
                        c3 = 7;
                        j6 = -9187201950435737472L;
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j7 & 255) < 128) {
                                    C0590w c0590w2 = (C0590w) objArr[(i5 << 3) + i11];
                                    c0590w2.alpha();
                                    y10.gray(c0590w2);
                                }
                                j7 >>= 8;
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
                } else {
                    c3 = 7;
                    j5 = 255;
                    j6 = -9187201950435737472L;
                }
                amVar.bravo();
                Object[] objArr2 = amVar2.bravo;
                long[] jArr2 = amVar2.alpha;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j10 = jArr2[i12];
                        if ((((~j10) << c3) & j10 & j6) != j6) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j10 & j5) < 128) {
                                    ((C0590w) objArr2[(i12 << 3) + i14]).golf();
                                }
                                j10 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length2) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                amVar2.bravo();
                amVar3.bravo();
                Object[] objArr3 = amVar4.bravo;
                long[] jArr3 = amVar4.alpha;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j11 = jArr3[i15];
                        if ((((~j11) << c3) & j11 & j6) != j6) {
                            int i16 = 8 - ((~(i15 - length3)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j11 & j5) < 128) {
                                    C0590w c0590w3 = (C0590w) objArr3[(i15 << 3) + i17];
                                    c0590w3.alpha();
                                    y10.gray(c0590w3);
                                }
                                j11 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length3) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                amVar4.bravo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void india(List list, Y y10) {
        list.clear();
        synchronized (y10.bravo) {
            try {
                ArrayList arrayList = y10.juliet;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.add((av) arrayList.get(i4));
                }
                y10.juliet.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        X x4 = new X(this.f3002v, (Nd.c) obj3);
        x4.f3001u = (at) obj2;
        x4.invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e7 -> B:6:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00f5 -> B:7:0x008c). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        at atVar;
        bv.am amVar;
        bv.am amVar2;
        List list;
        Set set;
        final List list2;
        bv.am amVar3;
        List list3;
        bv.am amVar4;
        final List list4;
        final bv.am amVar5;
        final List list5;
        final bv.am amVar6;
        Y y10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f3000t;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    bv.am amVar7 = this.f2999s;
                    set = this.yellow;
                    amVar3 = this.white;
                    amVar4 = this.teal;
                    amVar = this.silver;
                    list3 = this.red;
                    list2 = this.purple;
                    list = this.alpha;
                    at atVar2 = this.f3001u;
                    ResultKt.alpha(obj);
                    amVar2 = amVar7;
                    atVar = atVar2;
                    Y.victor(this.f3002v);
                    synchronized (this.f3002v.bravo) {
                    }
                    Y y11 = this.f3002v;
                    this.f3001u = atVar;
                    this.alpha = list;
                    this.purple = list2;
                    this.red = list3;
                    this.silver = amVar;
                    this.teal = amVar4;
                    this.white = amVar3;
                    this.yellow = set;
                    this.f2999s = amVar2;
                    this.f3000t = 1;
                    if (Y.uniform(y11, this) != aVar) {
                        List list6 = list;
                        amVar5 = amVar;
                        amVar6 = amVar2;
                        list4 = list3;
                        list5 = list6;
                        final Set set2 = set;
                        final bv.am amVar8 = amVar4;
                        final bv.am amVar9 = amVar3;
                        y10 = this.f3002v;
                        yf.N n5 = Y.yankee;
                        if (!y10.gold()) {
                            final Y y12 = this.f3002v;
                            Function1 function1 = new Function1() { // from class: androidx.compose.runtime.W
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    boolean z2;
                                    Unit unit;
                                    S.g akVar;
                                    long j5;
                                    List list7;
                                    List list8;
                                    Y y13 = Y.this;
                                    bv.am amVar10 = amVar9;
                                    bv.am amVar11 = amVar6;
                                    List list9 = list5;
                                    List list10 = list2;
                                    bv.am amVar12 = amVar5;
                                    List list11 = list4;
                                    bv.am amVar13 = amVar8;
                                    Set set3 = set2;
                                    long longValue = ((Long) obj2).longValue();
                                    if (Y.whiskey(y13)) {
                                        Trace.beginSection("Recomposer:animation");
                                        try {
                                            y13.alpha.bravo(longValue);
                                            r6.u.lima();
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                    Trace.beginSection("Recomposer:recompose");
                                    try {
                                        y13.gold();
                                        synchronized (y13.bravo) {
                                            try {
                                                J.e eVar = y13.hotel;
                                                Object[] objArr = eVar.alpha;
                                                int i5 = eVar.red;
                                                z2 = 0;
                                                for (int i10 = 0; i10 < i5; i10++) {
                                                    list9.add((C0590w) objArr[i10]);
                                                }
                                                y13.hotel.india();
                                            } finally {
                                            }
                                        }
                                        amVar10.bravo();
                                        amVar11.bravo();
                                        while (true) {
                                            if (list9.isEmpty() && list10.isEmpty()) {
                                                break;
                                            }
                                            try {
                                                int size = list9.size();
                                                for (int i11 = 0; i11 < size; i11++) {
                                                    C0590w c0590w = (C0590w) list9.get(i11);
                                                    C0590w emerald = y13.emerald(c0590w, amVar10);
                                                    if (emerald != null) {
                                                        list11.add(emerald);
                                                    }
                                                    amVar11.alpha(c0590w);
                                                }
                                                list9.clear();
                                                if (amVar10.hotel() || y13.hotel.red != 0) {
                                                    synchronized (y13.bravo) {
                                                        try {
                                                            List blue = y13.blue();
                                                            int size2 = blue.size();
                                                            for (int i12 = 0; i12 < size2; i12++) {
                                                                C0590w c0590w2 = (C0590w) blue.get(i12);
                                                                if (!amVar11.charlie(c0590w2) && c0590w2.whiskey(set3)) {
                                                                    list9.add(c0590w2);
                                                                }
                                                            }
                                                            J.e eVar2 = y13.hotel;
                                                            int i13 = eVar2.red;
                                                            int i14 = 0;
                                                            for (int i15 = 0; i15 < i13; i15++) {
                                                                C0590w c0590w3 = (C0590w) eVar2.alpha[i15];
                                                                if (!amVar11.charlie(c0590w3) && !list9.contains(c0590w3)) {
                                                                    list9.add(c0590w3);
                                                                    i14++;
                                                                } else if (i14 > 0) {
                                                                    Object[] objArr2 = eVar2.alpha;
                                                                    objArr2[i15 - i14] = objArr2[i15];
                                                                }
                                                            }
                                                            int i16 = i13 - i14;
                                                            Arrays.fill(eVar2.alpha, i16, i13, (Object) null);
                                                            eVar2.red = i16;
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (list9.isEmpty()) {
                                                    try {
                                                        X.india(list10, y13);
                                                        while (!list10.isEmpty()) {
                                                            List elements = y13.cyan(list10, amVar10);
                                                            amVar12.getClass();
                                                            Intrinsics.echo(elements, "elements");
                                                            Iterator it = elements.iterator();
                                                            while (it.hasNext()) {
                                                                amVar12.kilo(it.next());
                                                            }
                                                            X.india(list10, y13);
                                                        }
                                                    } catch (Throwable th) {
                                                        y13.fuchsia(th, null);
                                                        X.foxtrot(y13, list9, list10, list11, amVar12, amVar13, amVar10, amVar11);
                                                        unit = Unit.INSTANCE;
                                                        return unit;
                                                    }
                                                }
                                                z2 = 0;
                                            } catch (Throwable th2) {
                                                try {
                                                    y13.fuchsia(th2, null);
                                                    X.foxtrot(y13, list9, list10, list11, amVar12, amVar13, amVar10, amVar11);
                                                    unit = Unit.INSTANCE;
                                                    list9.clear();
                                                    return unit;
                                                } catch (Throwable th3) {
                                                    list9.clear();
                                                    throw th3;
                                                }
                                            }
                                        }
                                        S.g kilo = S.n.kilo();
                                        if (kilo instanceof S.c) {
                                            akVar = new S.aj((S.c) kilo, null, null, true, false);
                                        } else {
                                            akVar = new S.ak(kilo, null, true, z2);
                                        }
                                        try {
                                            S.g juliet = akVar.juliet();
                                            try {
                                                if (!list11.isEmpty()) {
                                                    try {
                                                        int size3 = list11.size();
                                                        for (int i17 = z2; i17 < size3; i17++) {
                                                            amVar13.alpha((C0590w) list11.get(i17));
                                                        }
                                                        int size4 = list11.size();
                                                        for (int i18 = z2; i18 < size4; i18++) {
                                                            ((C0590w) list11.get(i18)).delta();
                                                        }
                                                    } catch (Throwable th4) {
                                                        try {
                                                            y13.fuchsia(th4, null);
                                                            X.foxtrot(y13, list9, list10, list11, amVar12, amVar13, amVar10, amVar11);
                                                            unit = Unit.INSTANCE;
                                                            return unit;
                                                        } finally {
                                                            list11.clear();
                                                        }
                                                    }
                                                }
                                                if (amVar12.hotel()) {
                                                    try {
                                                        amVar13.juliet(amVar12);
                                                        Object[] objArr3 = amVar12.bravo;
                                                        long[] jArr = amVar12.alpha;
                                                        j5 = 128;
                                                        int length = jArr.length - 2;
                                                        if (length >= 0) {
                                                            int i19 = 0;
                                                            while (true) {
                                                                long j6 = jArr[i19];
                                                                Object[] objArr4 = objArr3;
                                                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                                    for (int i21 = 0; i21 < i20; i21++) {
                                                                        if ((j6 & 255) < 128) {
                                                                            ((C0590w) objArr4[(i19 << 3) + i21]).foxtrot();
                                                                        }
                                                                        j6 >>= 8;
                                                                    }
                                                                    if (i20 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i19 == length) {
                                                                    break;
                                                                }
                                                                i19++;
                                                                objArr3 = objArr4;
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        try {
                                                            y13.fuchsia(th5, null);
                                                            X.foxtrot(y13, list9, list10, list11, amVar12, amVar13, amVar10, amVar11);
                                                            unit = Unit.INSTANCE;
                                                            S.g.quebec(juliet);
                                                            return unit;
                                                        } finally {
                                                            amVar12.bravo();
                                                        }
                                                    }
                                                } else {
                                                    j5 = 128;
                                                }
                                                if (amVar13.hotel()) {
                                                    try {
                                                        Object[] objArr5 = amVar13.bravo;
                                                        long[] jArr2 = amVar13.alpha;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i22 = 0;
                                                            while (true) {
                                                                long j7 = jArr2[i22];
                                                                list7 = list9;
                                                                list8 = list10;
                                                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j7 & 255) < j5) {
                                                                            try {
                                                                                ((C0590w) objArr5[(i22 << 3) + i24]).golf();
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                try {
                                                                                    y13.fuchsia(th, null);
                                                                                    X.foxtrot(y13, list7, list8, list11, amVar12, amVar13, amVar10, amVar11);
                                                                                    unit = Unit.INSTANCE;
                                                                                    S.g.quebec(juliet);
                                                                                    return unit;
                                                                                } finally {
                                                                                    amVar13.bravo();
                                                                                }
                                                                            }
                                                                        }
                                                                        i24++;
                                                                        j7 >>= 8;
                                                                    }
                                                                    if (i23 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i22 == length2) {
                                                                    break;
                                                                }
                                                                i22++;
                                                                list9 = list7;
                                                                list10 = list8;
                                                            }
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        list7 = list9;
                                                        list8 = list10;
                                                    }
                                                }
                                                akVar.charlie();
                                                synchronized (y13.bravo) {
                                                    y13.azure();
                                                }
                                                S.n.kilo().mike();
                                                amVar11.bravo();
                                                amVar10.bravo();
                                                y13.papa = null;
                                                Trace.endSection();
                                                return Unit.INSTANCE;
                                            } finally {
                                                S.g.quebec(juliet);
                                            }
                                        } finally {
                                            akVar.charlie();
                                        }
                                    } catch (Throwable th8) {
                                        throw th8;
                                    }
                                }
                            };
                            this.f3001u = atVar;
                            this.alpha = list5;
                            this.purple = list2;
                            this.red = list4;
                            this.silver = amVar5;
                            this.teal = amVar8;
                            this.white = amVar9;
                            this.yellow = set2;
                            this.f2999s = amVar6;
                            this.f3000t = 2;
                            if (atVar.blue(function1, this) != aVar) {
                                List list7 = list4;
                                amVar2 = amVar6;
                                amVar = amVar5;
                                list = list5;
                                list3 = list7;
                                amVar3 = amVar9;
                                amVar4 = amVar8;
                                set = set2;
                                Y.victor(this.f3002v);
                                synchronized (this.f3002v.bravo) {
                                }
                            }
                        } else {
                            List list8 = list4;
                            amVar2 = amVar6;
                            amVar = amVar5;
                            list = list5;
                            list3 = list8;
                            amVar3 = amVar9;
                            amVar4 = amVar8;
                            set = set2;
                            synchronized (this.f3002v.bravo) {
                            }
                        }
                    }
                    return aVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bv.am amVar10 = this.f2999s;
            set = this.yellow;
            amVar3 = this.white;
            amVar4 = this.teal;
            bv.am amVar11 = this.silver;
            List list9 = this.red;
            list2 = this.purple;
            List list10 = this.alpha;
            at atVar3 = this.f3001u;
            ResultKt.alpha(obj);
            amVar6 = amVar10;
            atVar = atVar3;
            list4 = list9;
            list5 = list10;
            amVar5 = amVar11;
            final Set set22 = set;
            final bv.am amVar82 = amVar4;
            final bv.am amVar92 = amVar3;
            y10 = this.f3002v;
            yf.N n52 = Y.yankee;
            if (!y10.gold()) {
            }
        } else {
            ResultKt.alpha(obj);
            atVar = this.f3001u;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            bv.am amVar12 = bv.av.alpha;
            amVar = new bv.am();
            bv.am amVar13 = new bv.am();
            bv.am amVar14 = new bv.am();
            J.h hVar = new J.h(amVar14);
            amVar2 = new bv.am();
            list = arrayList;
            set = hVar;
            list2 = arrayList2;
            amVar3 = amVar14;
            list3 = arrayList3;
            amVar4 = amVar13;
            synchronized (this.f3002v.bravo) {
            }
        }
    }
}
