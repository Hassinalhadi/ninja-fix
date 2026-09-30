package androidx.compose.runtime;

import android.os.Trace;
import com.google.android.gms.internal.measurement.C1298c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s6.I5;

/* renamed from: androidx.compose.runtime.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0590w implements InterfaceC0586s {

    /* renamed from: a, reason: collision with root package name */
    public final bv.am f3007a;
    public final AbstractC0587t alpha;

    /* renamed from: b, reason: collision with root package name */
    public final bv.am f3008b;

    /* renamed from: c, reason: collision with root package name */
    public final bv.al f3009c;

    /* renamed from: d, reason: collision with root package name */
    public final I.a f3010d;
    public final I.a e;

    /* renamed from: f, reason: collision with root package name */
    public final bv.al f3011f;

    /* renamed from: g, reason: collision with root package name */
    public bv.al f3012g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3013h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.firebase.messaging.l f3014i;

    /* renamed from: j, reason: collision with root package name */
    public E f3015j;

    /* renamed from: k, reason: collision with root package name */
    public C0590w f3016k;

    /* renamed from: l, reason: collision with root package name */
    public int f3017l;

    /* renamed from: m, reason: collision with root package name */
    public final O7.j f3018m;

    /* renamed from: n, reason: collision with root package name */
    public final B9.r f3019n;

    /* renamed from: o, reason: collision with root package name */
    public final C0585q f3020o;

    /* renamed from: p, reason: collision with root package name */
    public int f3021p;
    public final C1298c purple;
    public final AtomicReference red = new AtomicReference(null);
    public final Object silver = new Object();
    public final bv.ao teal;
    public final C0575g0 white;
    public final bv.al yellow;

    public C0590w(AbstractC0587t abstractC0587t, C1298c c1298c) {
        this.alpha = abstractC0587t;
        this.purple = c1298c;
        bv.ao aoVar = new bv.ao(new bv.am());
        this.teal = aoVar;
        C0575g0 c0575g0 = new C0575g0();
        if (abstractC0587t.delta()) {
            c0575g0.f3006d = new bv.aa();
        }
        if (abstractC0587t.foxtrot()) {
            c0575g0.bravo();
        }
        this.white = c0575g0;
        this.yellow = I5.charlie();
        this.f3007a = new bv.am();
        this.f3008b = new bv.am();
        this.f3009c = I5.charlie();
        I.a aVar = new I.a();
        this.f3010d = aVar;
        I.a aVar2 = new I.a();
        this.e = aVar2;
        this.f3011f = I5.charlie();
        this.f3012g = I5.charlie();
        O7.j jVar = new O7.j(29, abstractC0587t);
        this.f3018m = jVar;
        this.f3019n = new B9.r();
        C0585q c0585q = new C0585q(c1298c, abstractC0587t, c0575g0, aoVar, aVar, aVar2, jVar, this);
        abstractC0587t.oscar(c0585q);
        this.f3020o = c0585q;
        boolean z2 = abstractC0587t instanceof Y;
        int i4 = AbstractC0577i.alpha;
    }

    public final void alpha() {
        this.red.set(null);
        this.f3010d.alpha.bravo();
        this.e.alpha.bravo();
        bv.ao aoVar = this.teal;
        if (!aoVar.alpha.golf()) {
            B9.r rVar = this.f3019n;
            try {
                rVar.golf(aoVar, this.f3020o.black());
                rVar.bravo();
            } finally {
                rVar.alpha();
            }
        }
    }

    public final void amber(Object obj) {
        synchronized (this.silver) {
            try {
                victor(obj);
                Object golf = this.f3009c.golf(obj);
                if (golf != null) {
                    if (golf instanceof bv.am) {
                        bv.am amVar = (bv.am) golf;
                        Object[] objArr = amVar.bravo;
                        long[] jArr = amVar.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j5 = jArr[i4];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i5; i10++) {
                                        if ((255 & j5) < 128) {
                                            victor((ad) objArr[(i4 << 3) + i10]);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        victor((ad) golf);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void azure(Xd.l lVar) {
        boolean india = india();
        quebec();
        AbstractC0587t abstractC0587t = this.alpha;
        if (india) {
            C0585q c0585q = this.f3020o;
            c0585q.zulu = 100;
            c0585q.yankee = true;
            abstractC0587t.alpha(this, lVar);
            c0585q.victor();
            return;
        }
        abstractC0587t.alpha(this, lVar);
    }

    public final void bravo(Object obj, boolean z2) {
        int i4;
        Object golf = this.yellow.golf(obj);
        if (golf != null) {
            boolean z10 = golf instanceof bv.am;
            bv.am amVar = this.f3007a;
            bv.am amVar2 = this.f3008b;
            bv.al alVar = this.f3011f;
            if (z10) {
                bv.am amVar3 = (bv.am) golf;
                Object[] objArr = amVar3.bravo;
                long[] jArr = amVar3.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i5 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((255 & j5) < 128) {
                                    Q q4 = (Q) objArr[(i5 << 3) + i12];
                                    if (!I5.delta(alVar, obj, q4)) {
                                        i4 = i10;
                                        if (q4.charlie(obj) != an.alpha) {
                                            if (q4.golf != null && !z2) {
                                                amVar2.alpha(q4);
                                            } else {
                                                amVar.alpha(q4);
                                            }
                                        }
                                        j5 >>= i4;
                                        i12++;
                                        i10 = i4;
                                    }
                                }
                                i4 = i10;
                                j5 >>= i4;
                                i12++;
                                i10 = i4;
                            }
                            if (i11 != i10) {
                                return;
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Q q5 = (Q) golf;
                if (!I5.delta(alVar, obj, q5) && q5.charlie(obj) != an.alpha) {
                    if (q5.golf != null && !z2) {
                        amVar2.alpha(q5);
                    } else {
                        amVar.alpha(q5);
                    }
                }
            }
        }
    }

    public final void charlie(Set set, boolean z2) {
        long j5;
        long j6;
        long j7;
        char c3;
        long[] jArr;
        String str;
        boolean z10;
        long[] jArr2;
        String str2;
        long j10;
        boolean charlie;
        boolean z11;
        String str3;
        long j11;
        long[] jArr3;
        long[] jArr4;
        int i4;
        long j12;
        boolean z12;
        int i5;
        long j13;
        long[] jArr5;
        long[] jArr6;
        char c4;
        long j14;
        int i10;
        int i11;
        long[] jArr7;
        boolean z13 = set instanceof J.h;
        bv.al alVar = this.f3009c;
        Object obj = null;
        int i12 = 8;
        if (z13) {
            bv.am amVar = ((J.h) set).alpha;
            Object[] objArr = amVar.bravo;
            long[] jArr8 = amVar.alpha;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j5 = 128;
                j6 = 255;
                while (true) {
                    long j15 = jArr8[i13];
                    char c10 = 7;
                    j7 = -9187201950435737472L;
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j15 & 255) < 128) {
                                Object obj2 = objArr[(i13 << 3) + i15];
                                c4 = c10;
                                if (obj2 instanceof Q) {
                                    ((Q) obj2).charlie(obj);
                                } else {
                                    bravo(obj2, z2);
                                    Object golf = alVar.golf(obj2);
                                    if (golf != null) {
                                        if (golf instanceof bv.am) {
                                            bv.am amVar2 = (bv.am) golf;
                                            Object[] objArr2 = amVar2.bravo;
                                            long[] jArr9 = amVar2.alpha;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i16 = i12;
                                                i10 = length;
                                                int i17 = 0;
                                                while (true) {
                                                    long j16 = jArr9[i17];
                                                    j14 = j15;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j16) << c4) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                        int i19 = 0;
                                                        while (i19 < i18) {
                                                            if ((j16 & 255) < 128) {
                                                                jArr7 = jArr8;
                                                                bravo((ad) objArr2[(i17 << 3) + i19], z2);
                                                            } else {
                                                                jArr7 = jArr8;
                                                            }
                                                            j16 >>= i16;
                                                            i19++;
                                                            jArr8 = jArr7;
                                                        }
                                                        jArr6 = jArr8;
                                                        if (i18 != i16) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr6 = jArr8;
                                                    }
                                                    if (i17 == length2) {
                                                        break;
                                                    }
                                                    i17++;
                                                    jArr9 = jArr10;
                                                    j15 = j14;
                                                    jArr8 = jArr6;
                                                    i16 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr8;
                                            j14 = j15;
                                            i10 = length;
                                            bravo((ad) golf, z2);
                                        }
                                        i11 = 8;
                                    }
                                }
                                jArr6 = jArr8;
                                j14 = j15;
                                i10 = length;
                                i11 = 8;
                            } else {
                                jArr6 = jArr8;
                                c4 = c10;
                                j14 = j15;
                                i10 = length;
                                i11 = i12;
                            }
                            j15 = j14 >> i11;
                            i15++;
                            length = i10;
                            i12 = i11;
                            c10 = c4;
                            jArr8 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr8;
                        c3 = c10;
                        int i20 = length;
                        if (i14 != i12) {
                            break;
                        } else {
                            length = i20;
                        }
                    } else {
                        jArr5 = jArr8;
                        c3 = 7;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    jArr8 = jArr5;
                    obj = null;
                    i12 = 8;
                }
            } else {
                j5 = 128;
                j6 = 255;
                j7 = -9187201950435737472L;
                c3 = 7;
            }
        } else {
            j5 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            c3 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof Q) {
                    ((Q) obj3).charlie(null);
                } else {
                    bravo(obj3, z2);
                    Object golf2 = alVar.golf(obj3);
                    if (golf2 != null) {
                        if (golf2 instanceof bv.am) {
                            bv.am amVar3 = (bv.am) golf2;
                            Object[] objArr3 = amVar3.bravo;
                            long[] jArr11 = amVar3.alpha;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j17 = jArr11[i21];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                        for (int i23 = 0; i23 < i22; i23++) {
                                            if ((j17 & 255) < 128) {
                                                bravo((ad) objArr3[(i21 << 3) + i23], z2);
                                            }
                                            j17 >>= 8;
                                        }
                                        if (i22 != 8) {
                                            break;
                                        }
                                    }
                                    if (i21 != length3) {
                                        i21++;
                                    }
                                }
                            }
                        } else {
                            bravo((ad) golf2, z2);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        bv.al alVar2 = this.yellow;
        bv.am amVar4 = this.f3007a;
        if (z2) {
            bv.am amVar5 = this.f3008b;
            if (amVar5.hotel()) {
                long[] jArr12 = alVar2.alpha;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i24 = 0;
                    while (true) {
                        long j18 = jArr12[i24];
                        if ((((~j18) << c3) & j18 & j7) != j7) {
                            int i25 = 8 - ((~(i24 - length4)) >>> 31);
                            int i26 = 0;
                            while (i26 < i25) {
                                if ((j18 & j6) < j5) {
                                    int i27 = (i24 << 3) + i26;
                                    Object obj4 = alVar2.bravo[i27];
                                    Object obj5 = alVar2.charlie[i27];
                                    if (obj5 instanceof bv.am) {
                                        Intrinsics.charlie(obj5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        bv.am amVar6 = (bv.am) obj5;
                                        Object[] objArr4 = amVar6.bravo;
                                        long[] jArr13 = amVar6.alpha;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j12 = j18;
                                            int i28 = 0;
                                            while (true) {
                                                long j19 = jArr13[i28];
                                                jArr4 = jArr12;
                                                i4 = length4;
                                                if ((((~j19) << c3) & j19 & j7) != j7) {
                                                    int i29 = 8 - ((~(i28 - length5)) >>> 31);
                                                    for (int i30 = 0; i30 < i29; i30 = i5 + 1) {
                                                        if ((j19 & j6) < j5) {
                                                            i5 = i30;
                                                            int i31 = (i28 << 3) + i5;
                                                            j13 = j19;
                                                            Q q4 = (Q) objArr4[i31];
                                                            if (amVar5.charlie(q4) || amVar4.charlie(q4)) {
                                                                amVar6.mike(i31);
                                                            }
                                                        } else {
                                                            i5 = i30;
                                                            j13 = j19;
                                                        }
                                                        j19 = j13 >> 8;
                                                    }
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i28 == length5) {
                                                    break;
                                                }
                                                i28++;
                                                length4 = i4;
                                                jArr12 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr12;
                                            i4 = length4;
                                            j12 = j18;
                                        }
                                        z12 = amVar6.golf();
                                    } else {
                                        jArr4 = jArr12;
                                        i4 = length4;
                                        j12 = j18;
                                        Intrinsics.charlie(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        Q q5 = (Q) obj5;
                                        if (!amVar5.charlie(q5) && !amVar4.charlie(q5)) {
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                        }
                                    }
                                    if (z12) {
                                        alVar2.lima(i27);
                                    }
                                } else {
                                    jArr4 = jArr12;
                                    i4 = length4;
                                    j12 = j18;
                                }
                                j18 = j12 >> 8;
                                i26++;
                                length4 = i4;
                                jArr12 = jArr4;
                            }
                            jArr3 = jArr12;
                            int i32 = length4;
                            if (i25 != 8) {
                                break;
                            } else {
                                length4 = i32;
                            }
                        } else {
                            jArr3 = jArr12;
                        }
                        if (i24 == length4) {
                            break;
                        }
                        i24++;
                        jArr12 = jArr3;
                    }
                }
                amVar5.bravo();
                hotel();
                return;
            }
        }
        if (amVar4.hotel()) {
            long[] jArr14 = alVar2.alpha;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i33 = 0;
                while (true) {
                    long j20 = jArr14[i33];
                    if ((((~j20) << c3) & j20 & j7) != j7) {
                        int i34 = 8 - ((~(i33 - length6)) >>> 31);
                        int i35 = 0;
                        while (i35 < i34) {
                            if ((j20 & j6) < j5) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i36 = (i33 << 3) + i35;
                                Object obj6 = alVar2.bravo[i36];
                                Object obj7 = alVar2.charlie[i36];
                                if (obj7 instanceof bv.am) {
                                    Intrinsics.charlie(obj7, str4);
                                    bv.am amVar7 = (bv.am) obj7;
                                    Object[] objArr5 = amVar7.bravo;
                                    long[] jArr15 = amVar7.alpha;
                                    int length7 = jArr15.length - 2;
                                    jArr2 = jArr14;
                                    if (length7 >= 0) {
                                        j10 = j20;
                                        int i37 = 0;
                                        while (true) {
                                            long j21 = jArr15[i37];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j21) << c3) & j21 & j7) != j7) {
                                                int i38 = 8 - ((~(i37 - length7)) >>> 31);
                                                int i39 = 0;
                                                while (i39 < i38) {
                                                    if ((j21 & j6) < j5) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        str3 = str4;
                                                        int i40 = (i37 << 3) + i39;
                                                        j11 = j21;
                                                        if (amVar4.charlie((Q) objArr6[i40])) {
                                                            amVar7.mike(i40);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j11 = j21;
                                                    }
                                                    i39++;
                                                    str4 = str3;
                                                    j21 = j11 >> 8;
                                                }
                                                str2 = str4;
                                                if (i38 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i37 == length7) {
                                                break;
                                            }
                                            i37++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j10 = j20;
                                    }
                                    charlie = amVar7.golf();
                                } else {
                                    jArr2 = jArr14;
                                    str2 = str4;
                                    j10 = j20;
                                    Intrinsics.charlie(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    charlie = amVar4.charlie((Q) obj7);
                                }
                                if (charlie) {
                                    alVar2.lima(i36);
                                }
                            } else {
                                jArr2 = jArr14;
                                str2 = str4;
                                j10 = j20;
                            }
                            i35++;
                            j20 = j10 >> 8;
                            jArr14 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr14;
                        str = str4;
                        if (i34 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                        str = str4;
                    }
                    if (i33 == length6) {
                        break;
                    }
                    i33++;
                    jArr14 = jArr;
                    str4 = str;
                }
            }
            hotel();
            amVar4.bravo();
        }
    }

    public final void delta() {
        synchronized (this.silver) {
            try {
                echo(this.f3010d);
                oscar();
            } catch (Throwable th) {
                try {
                    if (!this.teal.alpha.golf()) {
                        B9.r rVar = this.f3019n;
                        try {
                            rVar.golf(this.teal, this.f3020o.black());
                            rVar.bravo();
                            rVar.alpha();
                        } catch (Throwable th2) {
                            rVar.alpha();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    alpha();
                    throw th3;
                }
            }
        }
    }

    public final void echo(I.a aVar) {
        InterfaceC0566c interfaceC0566c;
        B9.r rVar;
        B9.r rVar2;
        long[] jArr;
        int i4;
        long[] jArr2;
        B9.r rVar3;
        long j5;
        char c3;
        long j6;
        int i5;
        boolean z2;
        long j7;
        I.a aVar2 = this.e;
        C0585q c0585q = this.f3020o;
        androidx.compose.runtime.tooling.c black = c0585q.black();
        B9.r rVar4 = this.f3019n;
        rVar4.golf(this.teal, black);
        try {
            if (aVar.alpha.delta()) {
                try {
                    if (aVar2.alpha.delta() && this.f3015j == null) {
                        rVar4.bravo();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    E e = this.f3015j;
                    if (e == null || (interfaceC0566c = e.kilo) == null) {
                        interfaceC0566c = this.purple;
                    }
                    if (e == null || (rVar = e.juliet) == null) {
                        rVar = rVar4;
                    }
                    j0 hotel = this.white.hotel();
                    int i10 = 0;
                    try {
                        aVar.bravo(interfaceC0566c, hotel, rVar, c0585q.black());
                        hotel.echo(true);
                        interfaceC0566c.mike();
                        Trace.endSection();
                        rVar4.charlie();
                        rVar4.delta();
                        if (this.f3013h) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f3013h = false;
                                bv.al alVar = this.yellow;
                                long[] jArr3 = alVar.alpha;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    while (true) {
                                        long j10 = jArr3[i11];
                                        char c4 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8;
                                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                                            int i14 = i10;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < 128) {
                                                    c3 = c4;
                                                    int i15 = (i11 << 3) + i14;
                                                    j6 = j11;
                                                    Object obj = alVar.bravo[i15];
                                                    Object obj2 = alVar.charlie[i15];
                                                    if (obj2 instanceof bv.am) {
                                                        Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        bv.am amVar = (bv.am) obj2;
                                                        Object[] objArr = amVar.bravo;
                                                        long[] jArr4 = amVar.alpha;
                                                        int i16 = i12;
                                                        int length2 = jArr4.length - 2;
                                                        i4 = i14;
                                                        jArr2 = jArr3;
                                                        rVar3 = rVar4;
                                                        if (length2 >= 0) {
                                                            int i17 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr4[i17];
                                                                    j5 = j10;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j12) << c3) & j12 & j6) != j6) {
                                                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                                        for (int i19 = 0; i19 < i18; i19++) {
                                                                            if ((j12 & 255) < 128) {
                                                                                j7 = j12;
                                                                                int i20 = (i17 << 3) + i19;
                                                                                if (!((Q) objArr[i20]).bravo()) {
                                                                                    amVar.mike(i20);
                                                                                }
                                                                            } else {
                                                                                j7 = j12;
                                                                            }
                                                                            j12 = j7 >> i16;
                                                                        }
                                                                        if (i18 != i16) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i17 == length2) {
                                                                        break;
                                                                    }
                                                                    i17++;
                                                                    jArr4 = jArr5;
                                                                    j10 = j5;
                                                                    i16 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j5 = j10;
                                                        }
                                                        z2 = amVar.golf();
                                                    } else {
                                                        i4 = i14;
                                                        jArr2 = jArr3;
                                                        rVar3 = rVar4;
                                                        j5 = j10;
                                                        Intrinsics.charlie(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        if (!((Q) obj2).bravo()) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z2) {
                                                        alVar.lima(i15);
                                                    }
                                                    i5 = 8;
                                                } else {
                                                    i4 = i14;
                                                    jArr2 = jArr3;
                                                    rVar3 = rVar4;
                                                    j5 = j10;
                                                    c3 = c4;
                                                    j6 = j11;
                                                    i5 = i12;
                                                }
                                                j10 = j5 >> i5;
                                                i14 = i4 + 1;
                                                i12 = i5;
                                                c4 = c3;
                                                j11 = j6;
                                                rVar4 = rVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            rVar2 = rVar4;
                                            if (i13 != i12) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            rVar2 = rVar4;
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                        rVar4 = rVar2;
                                        jArr3 = jArr;
                                        i10 = 0;
                                    }
                                } else {
                                    rVar2 = rVar4;
                                }
                                hotel();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            rVar2 = rVar4;
                        }
                        try {
                            if (aVar2.alpha.delta() && this.f3015j == null) {
                                rVar2.bravo();
                            }
                        } finally {
                            rVar2.alpha();
                        }
                    } catch (Throwable th3) {
                        try {
                            hotel.echo(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (aVar2.alpha.delta() && this.f3015j == null) {
                        rVar4.bravo();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void foxtrot() {
        synchronized (this.silver) {
            try {
                if (this.e.alpha.echo()) {
                    echo(this.e);
                }
            } catch (Throwable th) {
                try {
                    if (!this.teal.alpha.golf()) {
                        B9.r rVar = this.f3019n;
                        try {
                            rVar.golf(this.teal, this.f3020o.black());
                            rVar.bravo();
                            rVar.alpha();
                        } catch (Throwable th2) {
                            rVar.alpha();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    alpha();
                    throw th3;
                }
            }
        }
    }

    public final void golf() {
        B9.r rVar;
        synchronized (this.silver) {
            try {
                this.f3020o.victor = null;
                if (!this.teal.alpha.golf()) {
                    rVar = this.f3019n;
                    try {
                        rVar.golf(this.teal, this.f3020o.black());
                        rVar.bravo();
                        rVar.alpha();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.teal.alpha.golf()) {
                        rVar = this.f3019n;
                        try {
                            rVar.golf(this.teal, this.f3020o.black());
                            rVar.bravo();
                            rVar.alpha();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    alpha();
                    throw th2;
                }
            }
        }
    }

    public final void hotel() {
        char c3;
        long j5;
        long j6;
        long j7;
        boolean z2;
        boolean z10;
        long[] jArr;
        long[] jArr2;
        int i4;
        long j10;
        char c4;
        long j11;
        long j12;
        int i5;
        boolean z11;
        int i10;
        long j13;
        bv.al alVar = this.f3009c;
        long[] jArr3 = alVar.alpha;
        int length = jArr3.length - 2;
        char c10 = 7;
        long j14 = -9187201950435737472L;
        int i11 = 8;
        if (length >= 0) {
            int i12 = 0;
            long j15 = 128;
            while (true) {
                long j16 = jArr3[i12];
                j6 = 255;
                if ((((~j16) << c10) & j16 & j14) != j14) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j16 & 255) < j15) {
                            c4 = c10;
                            int i15 = (i12 << 3) + i14;
                            j11 = j14;
                            Object obj = alVar.bravo[i15];
                            Object obj2 = alVar.charlie[i15];
                            boolean z12 = obj2 instanceof bv.am;
                            bv.al alVar2 = this.yellow;
                            if (z12) {
                                Intrinsics.charlie(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                bv.am amVar = (bv.am) obj2;
                                Object[] objArr = amVar.bravo;
                                long[] jArr4 = amVar.alpha;
                                j12 = j15;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j10 = j16;
                                    int i16 = i11;
                                    int i17 = 0;
                                    while (true) {
                                        long j17 = jArr4[i17];
                                        jArr2 = jArr3;
                                        i4 = length;
                                        if ((((~j17) << c4) & j17 & j11) != j11) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j17 & 255) < j12) {
                                                    i10 = i19;
                                                    int i20 = (i17 << 3) + i10;
                                                    j13 = j17;
                                                    if (!alVar2.charlie((ad) objArr[i20])) {
                                                        amVar.mike(i20);
                                                    }
                                                } else {
                                                    i10 = i19;
                                                    j13 = j17;
                                                }
                                                j17 = j13 >> i16;
                                                i19 = i10 + 1;
                                            }
                                            if (i18 != i16) {
                                                break;
                                            }
                                        }
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        jArr3 = jArr2;
                                        length = i4;
                                        i16 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i4 = length;
                                    j10 = j16;
                                }
                                z11 = amVar.golf();
                            } else {
                                jArr2 = jArr3;
                                i4 = length;
                                j10 = j16;
                                j12 = j15;
                                Intrinsics.charlie(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                if (!alVar2.charlie((ad) obj2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                alVar.lima(i15);
                            }
                            i5 = 8;
                        } else {
                            jArr2 = jArr3;
                            i4 = length;
                            j10 = j16;
                            c4 = c10;
                            j11 = j14;
                            j12 = j15;
                            i5 = i11;
                        }
                        j16 = j10 >> i5;
                        i14++;
                        i11 = i5;
                        c10 = c4;
                        j14 = j11;
                        j15 = j12;
                        jArr3 = jArr2;
                        length = i4;
                    }
                    jArr = jArr3;
                    int i21 = length;
                    c3 = c10;
                    j5 = j14;
                    j7 = j15;
                    if (i13 != i11) {
                        break;
                    } else {
                        length = i21;
                    }
                } else {
                    jArr = jArr3;
                    c3 = c10;
                    j5 = j14;
                    j7 = j15;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                c10 = c3;
                j14 = j5;
                j15 = j7;
                jArr3 = jArr;
                i11 = 8;
            }
        } else {
            c3 = 7;
            j5 = -9187201950435737472L;
            j6 = 255;
            j7 = 128;
        }
        bv.am amVar2 = this.f3008b;
        if (amVar2.hotel()) {
            Object[] objArr2 = amVar2.bravo;
            long[] jArr5 = amVar2.alpha;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i22 = 0;
                while (true) {
                    long j18 = jArr5[i22];
                    if ((((~j18) << c3) & j18 & j5) != j5) {
                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                        for (int i24 = 0; i24 < i23; i24++) {
                            if ((j18 & j6) < j7) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                int i25 = (i22 << 3) + i24;
                                if (((Q) objArr2[i25]).golf != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    amVar2.mike(i25);
                                }
                            }
                            j18 >>= 8;
                        }
                        if (i23 != 8) {
                            return;
                        }
                    }
                    if (i22 != length3) {
                        i22++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean india() {
        boolean z2;
        synchronized (this.silver) {
            z2 = true;
            if (this.f3021p != 1) {
                z2 = false;
            }
            if (z2) {
                this.f3021p = 0;
            }
        }
        return z2;
    }

    public final void juliet(Xd.l lVar) {
        try {
            synchronized (this.silver) {
                november();
                bv.al alVar = this.f3012g;
                this.f3012g = I5.charlie();
                try {
                    C0585q c0585q = this.f3020o;
                    com.google.firebase.messaging.l lVar2 = this.f3014i;
                    if (!c0585q.echo.alpha.delta()) {
                        r.charlie("Expected applyChanges() to have been called");
                    }
                    c0585q.ivory = lVar2;
                    try {
                        c0585q.oscar(alVar, lVar);
                    } finally {
                        c0585q.ivory = null;
                    }
                } catch (Throwable th) {
                    this.f3012g = alVar;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.teal.alpha.golf()) {
                    B9.r rVar = this.f3019n;
                    try {
                        rVar.golf(this.teal, this.f3020o.black());
                        rVar.bravo();
                        rVar.alpha();
                    } catch (Throwable th3) {
                        rVar.alpha();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                alpha();
                throw th4;
            }
        }
    }

    public final E kilo(boolean z2, Xd.l lVar) {
        if (this.f3015j != null) {
            J.bravo("A pausable composition is in progress");
        }
        Object obj = this.silver;
        E e = new E(this, this.alpha, this.f3020o, this.teal, lVar, z2, this.purple, obj);
        this.f3015j = e;
        return e;
    }

    public final void lima() {
        boolean z2;
        B9.r rVar;
        synchronized (this.silver) {
            try {
                if (this.f3015j != null) {
                    J.bravo("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.white.purple > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    try {
                        if (!z2) {
                            if (!this.teal.alpha.golf()) {
                            }
                            this.yellow.alpha();
                            this.f3009c.alpha();
                            this.f3012g.alpha();
                            this.f3010d.alpha.bravo();
                            this.e.alpha.bravo();
                            C0585q c0585q = this.f3020o;
                            c0585q.blue.clear();
                            c0585q.sierra.clear();
                            c0585q.echo.alpha.bravo();
                            c0585q.victor = null;
                            this.f3021p = 1;
                        }
                        rVar.golf(this.teal, this.f3020o.black());
                        if (z2) {
                            j0 hotel = this.white.hotel();
                            try {
                                hotel.november(hotel.tango, new Cb.a(22, this.f3019n, hotel));
                                hotel.echo(true);
                                this.purple.mike();
                                rVar.charlie();
                            } catch (Throwable th) {
                                hotel.echo(false);
                                throw th;
                            }
                        }
                        rVar.bravo();
                        rVar.alpha();
                        this.yellow.alpha();
                        this.f3009c.alpha();
                        this.f3012g.alpha();
                        this.f3010d.alpha.bravo();
                        this.e.alpha.bravo();
                        C0585q c0585q2 = this.f3020o;
                        c0585q2.blue.clear();
                        c0585q2.sierra.clear();
                        c0585q2.echo.alpha.bravo();
                        c0585q2.victor = null;
                        this.f3021p = 1;
                    } catch (Throwable th2) {
                        rVar.alpha();
                        throw th2;
                    }
                    rVar = this.f3019n;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void mike() {
        boolean z2;
        synchronized (this.silver) {
            try {
                if (this.f3020o.bronze) {
                    J.bravo("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f3021p != 3) {
                    this.f3021p = 3;
                    int i4 = AbstractC0577i.alpha;
                    I.a aVar = this.f3020o.gold;
                    if (aVar != null) {
                        echo(aVar);
                    }
                    if (this.white.purple > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || !this.teal.alpha.golf()) {
                        B9.r rVar = this.f3019n;
                        try {
                            rVar.golf(this.teal, this.f3020o.black());
                            if (z2) {
                                j0 hotel = this.white.hotel();
                                try {
                                    hotel.november(hotel.tango, new Ac.k(27, this.f3019n));
                                    hotel.coral();
                                    hotel.echo(true);
                                    this.purple.papa();
                                    this.purple.mike();
                                    rVar.charlie();
                                } catch (Throwable th) {
                                    hotel.echo(false);
                                    throw th;
                                }
                            }
                            rVar.bravo();
                            rVar.alpha();
                        } catch (Throwable th2) {
                            rVar.alpha();
                            throw th2;
                        }
                    }
                    C0585q c0585q = this.f3020o;
                    c0585q.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0585q.bravo.sierra(c0585q);
                        c0585q.blue.clear();
                        c0585q.sierra.clear();
                        c0585q.echo.alpha.bravo();
                        c0585q.victor = null;
                        c0585q.alpha.papa();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.alpha.tango(this);
    }

    public final void november() {
        AtomicReference atomicReference = this.red;
        Object obj = C0564b.alpha;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!Intrinsics.areEqual(andSet, obj)) {
                if (andSet instanceof Set) {
                    charlie((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        charlie(set, true);
                    }
                    return;
                }
                r.delta("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            r.delta("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    public final void oscar() {
        AtomicReference atomicReference = this.red;
        Object andSet = atomicReference.getAndSet(null);
        if (!Intrinsics.areEqual(andSet, C0564b.alpha)) {
            if (andSet instanceof Set) {
                charlie((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    charlie(set, false);
                }
                return;
            }
            if (andSet == null) {
                r.delta("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            }
            r.delta("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
    }

    public final void papa() {
        AtomicReference atomicReference = this.red;
        Object andSet = atomicReference.getAndSet(kotlin.collections.u.alpha);
        if (!Intrinsics.areEqual(andSet, C0564b.alpha) && andSet != null) {
            if (andSet instanceof Set) {
                charlie((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    charlie(set, false);
                }
                return;
            }
            r.delta("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
    }

    public final void quebec() {
        String str;
        int i4 = this.f3021p;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        str = "";
                    } else {
                        str = "The composition is disposed";
                    }
                } else {
                    str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
                }
            } else {
                str = "The composition should be activated before setting content.";
            }
            J.bravo(str);
        }
        if (this.f3015j == null) {
            return;
        }
        J.bravo("A pausable composition is in progress");
    }

    public final void romeo(ArrayList arrayList) {
        C0585q c0585q = this.f3020o;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((av) ((Pair) arrayList.get(i4)).getFirst()).getClass();
            if (!Intrinsics.areEqual(null, this)) {
                r.charlie("Check failed");
                break;
            }
        }
        try {
            c0585q.getClass();
            try {
                c0585q.coral(arrayList);
                c0585q.juliet();
            } catch (Throwable th) {
                c0585q.alpha();
                throw th;
            }
        } catch (Throwable th2) {
            bv.ao aoVar = this.teal;
            try {
                if (!aoVar.alpha.golf()) {
                    B9.r rVar = this.f3019n;
                    try {
                        rVar.golf(aoVar, c0585q.black());
                        rVar.bravo();
                        rVar.alpha();
                    } catch (Throwable th3) {
                        rVar.alpha();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                alpha();
                throw th4;
            }
        }
    }

    public final an sierra(Q q4, Object obj) {
        C0590w c0590w;
        int i4 = q4.bravo;
        if ((i4 & 2) != 0) {
            q4.bravo = i4 | 4;
        }
        C0562a c0562a = q4.charlie;
        if (c0562a != null && c0562a.alpha()) {
            if (!this.white.india(c0562a)) {
                synchronized (this.silver) {
                    c0590w = this.f3016k;
                }
                if (c0590w != null) {
                    C0585q c0585q = c0590w.f3020o;
                    if (c0585q.bronze && c0585q.a(q4, obj)) {
                        return an.silver;
                    }
                }
                return an.alpha;
            }
            if (q4.delta != null) {
                an uniform = uniform(q4, c0562a, obj);
                if (uniform != an.alpha) {
                    this.f3018m.alpha();
                }
                return uniform;
            }
            return an.alpha;
        }
        return an.alpha;
    }

    public final void tango() {
        Q q4;
        C0590w c0590w;
        synchronized (this.silver) {
            try {
                for (Object obj : this.white.red) {
                    if (obj instanceof Q) {
                        q4 = (Q) obj;
                    } else {
                        q4 = null;
                    }
                    if (q4 != null && (c0590w = q4.alpha) != null) {
                        c0590w.sierra(q4, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final an uniform(Q q4, C0562a c0562a, Object obj) {
        boolean z2;
        int i4;
        synchronized (this.silver) {
            try {
                C0590w c0590w = this.f3016k;
                C0590w c0590w2 = null;
                if (c0590w != null) {
                    C0575g0 c0575g0 = this.white;
                    int i5 = this.f3017l;
                    if (c0575g0.yellow) {
                        r.charlie("Writer is active");
                    }
                    if (i5 < 0 || i5 >= c0575g0.purple) {
                        r.charlie("Invalid group index");
                    }
                    if (c0575g0.india(c0562a)) {
                        int i10 = c0575g0.alpha[(i5 * 5) + 3] + i5;
                        int i11 = c0562a.alpha;
                        if (i5 <= i11 && i11 < i10) {
                            c0590w2 = c0590w;
                        }
                    }
                    c0590w = null;
                    c0590w2 = c0590w;
                }
                if (c0590w2 == null) {
                    C0585q c0585q = this.f3020o;
                    if (c0585q.bronze && c0585q.a(q4, obj)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return an.silver;
                    }
                    if (obj == null) {
                        this.f3012g.mike(q4, as.teal);
                    } else if (!(obj instanceof ad)) {
                        this.f3012g.mike(q4, as.teal);
                    } else {
                        Object golf = this.f3012g.golf(q4);
                        if (golf != null) {
                            if (golf instanceof bv.am) {
                                bv.am amVar = (bv.am) golf;
                                Object[] objArr = amVar.bravo;
                                long[] jArr = amVar.alpha;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i12 = 0;
                                    loop0: while (true) {
                                        long j5 = jArr[i12];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8;
                                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j5 & 255) < 128) {
                                                    i4 = i13;
                                                    if (objArr[(i12 << 3) + i15] == as.teal) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i4 = i13;
                                                }
                                                j5 >>= i4;
                                                i15++;
                                                i13 = i4;
                                            }
                                            if (i14 != i13) {
                                                break;
                                            }
                                        }
                                        if (i12 == length) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            } else if (golf == as.teal) {
                            }
                        }
                        I5.bravo(this.f3012g, q4, obj);
                    }
                }
                if (c0590w2 != null) {
                    return c0590w2.uniform(q4, c0562a, obj);
                }
                this.alpha.kilo(this);
                if (this.f3020o.bronze) {
                    return an.red;
                }
                return an.purple;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void victor(Object obj) {
        Object golf = this.yellow.golf(obj);
        if (golf != null) {
            boolean z2 = golf instanceof bv.am;
            bv.al alVar = this.f3011f;
            if (z2) {
                bv.am amVar = (bv.am) golf;
                Object[] objArr = amVar.bravo;
                long[] jArr = amVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr[i4];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i10 = 0; i10 < i5; i10++) {
                                if ((255 & j5) < 128) {
                                    Q q4 = (Q) objArr[(i4 << 3) + i10];
                                    if (q4.charlie(obj) == an.silver) {
                                        I5.bravo(alVar, obj, q4);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                return;
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Q q5 = (Q) golf;
                if (q5.charlie(obj) == an.silver) {
                    I5.bravo(alVar, obj, q5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean whiskey(Set set) {
        boolean z2 = set instanceof J.h;
        bv.al alVar = this.f3009c;
        bv.al alVar2 = this.yellow;
        if (z2) {
            bv.am amVar = ((J.h) set).alpha;
            Object[] objArr = amVar.bravo;
            long[] jArr = amVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                loop0: while (true) {
                    long j5 = jArr[i4];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i10 = 0; i10 < i5; i10++) {
                            if ((255 & j5) < 128) {
                                Object obj = objArr[(i4 << 3) + i10];
                                if (alVar2.charlie(obj) || alVar.charlie(obj)) {
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (alVar2.charlie(obj2) || alVar.charlie(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean xray() {
        synchronized (this.silver) {
            E e = this.f3015j;
            boolean z2 = false;
            if (e != null && e.hotel.get() != F.teal) {
                e.echo();
                return false;
            }
            november();
            try {
                bv.al alVar = this.f3012g;
                this.f3012g = I5.charlie();
                try {
                    C0585q c0585q = this.f3020o;
                    com.google.firebase.messaging.l lVar = this.f3014i;
                    I.am amVar = c0585q.echo.alpha;
                    if (!amVar.delta()) {
                        r.charlie("Expected applyChanges() to have been called");
                    }
                    if (alVar.echo > 0 || !c0585q.sierra.isEmpty()) {
                        c0585q.ivory = lVar;
                        try {
                            c0585q.oscar(alVar, null);
                            c0585q.ivory = null;
                            z2 = amVar.echo();
                        } catch (Throwable th) {
                            c0585q.ivory = null;
                            throw th;
                        }
                    }
                    if (!z2) {
                        oscar();
                    }
                    return z2;
                } catch (Throwable th2) {
                    this.f3012g = alVar;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.teal.alpha.golf()) {
                        B9.r rVar = this.f3019n;
                        try {
                            rVar.golf(this.teal, this.f3020o.black());
                            rVar.bravo();
                            rVar.alpha();
                        } catch (Throwable th4) {
                            rVar.alpha();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    alpha();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void yankee(J.h hVar) {
        J.h hVar2;
        while (true) {
            Object obj = this.red.get();
            if (obj != null && !Intrinsics.areEqual(obj, C0564b.alpha)) {
                if (obj instanceof Set) {
                    hVar2 = new Set[]{obj, hVar};
                } else if (obj instanceof Object[]) {
                    Set[] setArr = (Set[]) obj;
                    int length = setArr.length;
                    ?? copyOf = Arrays.copyOf(setArr, length + 1);
                    copyOf[length] = hVar;
                    Intrinsics.checkNotNull(copyOf);
                    hVar2 = copyOf;
                } else {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.red).toString());
                }
            } else {
                hVar2 = hVar;
            }
            AtomicReference atomicReference = this.red;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.silver) {
                    oscar();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zulu(Object obj) {
        Q azure;
        int i4;
        boolean z2;
        boolean z10;
        boolean z11;
        int i5;
        C0585q c0585q = this.f3020o;
        if (c0585q.amber <= 0 && (azure = c0585q.azure()) != null) {
            boolean z12 = true;
            int i10 = azure.bravo | 1;
            azure.bravo = i10;
            if ((i10 & 32) == 0) {
                bv.ag agVar = azure.foxtrot;
                if (agVar == null) {
                    agVar = new bv.ag();
                    azure.foxtrot = agVar;
                }
                int i11 = azure.echo;
                int charlie = agVar.charlie(obj);
                if (charlie < 0) {
                    charlie = ~charlie;
                    i4 = -1;
                } else {
                    i4 = agVar.charlie[charlie];
                }
                agVar.bravo[charlie] = obj;
                agVar.charlie[charlie] = i11;
                if (i4 == azure.echo) {
                    z2 = true;
                    this.f3018m.alpha();
                    if (z2) {
                        if (obj instanceof S.ad) {
                            ((S.ad) obj).golf(1);
                        }
                        I5.bravo(this.yellow, obj, azure);
                        if (obj instanceof ad) {
                            ad adVar = (ad) obj;
                            ac kilo = adVar.kilo();
                            bv.al alVar = this.f3009c;
                            I5.echo(alVar, obj);
                            bv.ag agVar2 = kilo.echo;
                            Object[] objArr = agVar2.bravo;
                            long[] jArr = agVar2.alpha;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j5 = jArr[i12];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8;
                                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j5 & 255) < 128) {
                                                i5 = i13;
                                                S.ac acVar = (S.ac) objArr[(i12 << 3) + i15];
                                                if (acVar instanceof S.ad) {
                                                    z11 = true;
                                                    ((S.ad) acVar).golf(1);
                                                } else {
                                                    z11 = true;
                                                }
                                                I5.bravo(alVar, acVar, obj);
                                            } else {
                                                z11 = z12;
                                                i5 = i13;
                                            }
                                            j5 >>= i5;
                                            i15++;
                                            z12 = z11;
                                            i13 = i5;
                                        }
                                        z10 = z12;
                                        if (i14 != i13) {
                                            break;
                                        }
                                    } else {
                                        z10 = z12;
                                    }
                                    if (i12 == length) {
                                        break;
                                    }
                                    i12++;
                                    z12 = z10;
                                }
                            }
                            Object obj2 = kilo.foxtrot;
                            bv.al alVar2 = azure.golf;
                            if (alVar2 == null) {
                                alVar2 = new bv.al();
                                azure.golf = alVar2;
                            }
                            alVar2.mike(adVar, obj2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            this.f3018m.alpha();
            if (z2) {
            }
        }
    }
}
