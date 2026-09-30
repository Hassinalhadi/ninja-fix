package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.widget.P0;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2777t5;
import s6.I5;
import t6.AbstractC3081x3;

/* renamed from: androidx.compose.runtime.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0585q implements InterfaceC0581m {
    public final C1298c alpha;
    public int amber;
    public int azure;
    public boolean beige;
    public final S.v black;
    public final ArrayList blue;
    public final AbstractC0587t bravo;
    public boolean bronze;
    public final C0575g0 charlie;
    public C0573f0 coral;
    public C0575g0 crimson;
    public j0 cyan;
    public final bv.ao delta;
    public final I.a echo;
    public boolean emerald;
    public final I.a foxtrot;
    public I fuchsia;
    public I.a gold;
    public final O7.j golf;
    public final I.b gray;
    public C0562a green;
    public final C0590w hotel;
    public I.c indigo;
    public com.google.firebase.messaging.l ivory;
    public final androidx.compose.runtime.tooling.c jade;
    public H juliet;
    public int kilo;
    public final Nd.h lavender;
    public int lima;
    public boolean lime;
    public long magenta;
    public C0589v maroon;
    public int mike;
    public int[] oscar;
    public bv.y papa;
    public boolean quebec;
    public boolean romeo;
    public bv.aa victor;
    public boolean whiskey;
    public boolean yankee;
    public final ArrayList india = new ArrayList();
    public final al november = new al();
    public final ArrayList sierra = new ArrayList();
    public final al tango = new al();
    public I uniform = P.i.silver;
    public final al xray = new al();
    public int zulu = -1;

    public C0585q(C1298c c1298c, AbstractC0587t abstractC0587t, C0575g0 c0575g0, bv.ao aoVar, I.a aVar, I.a aVar2, O7.j jVar, C0590w c0590w) {
        boolean z2;
        this.alpha = c1298c;
        this.bravo = abstractC0587t;
        this.charlie = c0575g0;
        this.delta = aoVar;
        this.echo = aVar;
        this.foxtrot = aVar2;
        this.golf = jVar;
        this.hotel = c0590w;
        if (!abstractC0587t.foxtrot() && !abstractC0587t.delta()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.beige = z2;
        this.black = new S.v(1, this);
        this.blue = new ArrayList();
        C0573f0 delta = c0575g0.delta();
        delta.charlie();
        this.coral = delta;
        C0575g0 c0575g02 = new C0575g0();
        if (abstractC0587t.foxtrot()) {
            c0575g02.bravo();
        }
        if (abstractC0587t.delta()) {
            c0575g02.f3006d = new bv.aa();
        }
        this.crimson = c0575g02;
        j0 hotel = c0575g02.hotel();
        hotel.echo(true);
        this.cyan = hotel;
        this.gray = new I.b(this, aVar);
        C0573f0 delta2 = this.crimson.delta();
        try {
            C0562a alpha = delta2.alpha(0);
            delta2.charlie();
            this.green = alpha;
            this.indigo = new I.c();
            this.jade = new androidx.compose.runtime.tooling.c(this);
            Nd.h juliet = abstractC0587t.juliet();
            Nd.h black = black();
            this.lavender = juliet.plus(black == null ? Nd.i.alpha : black);
        } catch (Throwable th) {
            delta2.charlie();
            throw th;
        }
    }

    public static final int lime(C0585q c0585q, int i4, boolean z2, int i5) {
        boolean z10;
        int i10;
        C0583o c0583o;
        C0573f0 c0573f0 = c0585q.coral;
        if (c0573f0.juliet(i4)) {
            int india = c0573f0.india(i4);
            Object papa = c0573f0.papa(i4, c0573f0.bravo);
            if (india == 206 && Intrinsics.areEqual(papa, r.echo)) {
                Object hotel = c0573f0.hotel(i4, 0);
                if (hotel instanceof C0583o) {
                    c0583o = (C0583o) hotel;
                } else {
                    c0583o = null;
                }
                if (c0583o != null) {
                    for (C0585q c0585q2 : c0583o.alpha.echo) {
                        C0575g0 c0575g0 = c0585q2.charlie;
                        if (c0575g0.purple > 0 && (c0575g0.alpha[1] & 67108864) != 0) {
                            C0590w c0590w = c0585q2.hotel;
                            synchronized (c0590w.silver) {
                                c0590w.papa();
                                bv.al alVar = c0590w.f3012g;
                                c0590w.f3012g = I5.charlie();
                                try {
                                    c0590w.f3020o.b(alVar);
                                } finally {
                                }
                            }
                            I.a aVar = new I.a();
                            c0585q2.gold = aVar;
                            C0573f0 delta = c0585q2.charlie.delta();
                            try {
                                c0585q2.coral = delta;
                                I.b bVar = c0585q2.gray;
                                I.a aVar2 = bVar.bravo;
                                try {
                                    bVar.bravo = aVar;
                                    c0585q2.lavender(0);
                                    I.b bVar2 = c0585q2.gray;
                                    bVar2.charlie();
                                    if (bVar2.charlie) {
                                        I.a aVar3 = bVar2.bravo;
                                        aVar3.getClass();
                                        aVar3.alpha.foxtrot(I.ac.delta);
                                        if (bVar2.charlie) {
                                            bVar2.echo(false);
                                            bVar2.echo(false);
                                            I.a aVar4 = bVar2.bravo;
                                            aVar4.getClass();
                                            aVar4.alpha.foxtrot(I.m.delta);
                                            bVar2.charlie = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                delta.charlie();
                            }
                        }
                        c0585q.bravo.quebec(c0585q2.hotel);
                    }
                }
                return c0573f0.oscar(i4);
            }
            if (!c0573f0.lima(i4)) {
                return c0573f0.oscar(i4);
            }
        } else if (c0573f0.delta(i4)) {
            int i11 = c0573f0.bravo[(i4 * 5) + 3] + i4;
            int i12 = 0;
            for (int i13 = i4 + 1; i13 < i11; i13 += c0573f0.bravo[(i13 * 5) + 3]) {
                boolean lima = c0573f0.lima(i13);
                if (lima) {
                    c0585q.gray.delta();
                    I.b bVar3 = c0585q.gray;
                    Object november = c0573f0.november(i13);
                    bVar3.delta();
                    bVar3.hotel.add(november);
                }
                if (!lima && !z2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (lima) {
                    i10 = 0;
                } else {
                    i10 = i5 + i12;
                }
                i12 += lime(c0585q, i13, z10, i10);
                if (lima) {
                    c0585q.gray.delta();
                    c0585q.gray.bravo();
                }
            }
            if (!c0573f0.lima(i4)) {
                return i12;
            }
        } else if (!c0573f0.lima(i4)) {
            return c0573f0.oscar(i4);
        }
        return 1;
    }

    public final boolean a(Q q4, Object obj) {
        C0562a c0562a = q4.charlie;
        if (c0562a != null) {
            int alpha = this.coral.alpha.alpha(c0562a);
            if (this.bronze && alpha >= this.coral.golf) {
                ArrayList arrayList = this.sierra;
                int echo = r.echo(alpha, arrayList);
                if (echo < 0) {
                    int i4 = -(echo + 1);
                    if (!(obj instanceof ad)) {
                        obj = null;
                    }
                    arrayList.add(i4, new am(q4, alpha, obj));
                    return true;
                }
                am amVar = (am) arrayList.get(echo);
                if (obj instanceof ad) {
                    Object obj2 = amVar.charlie;
                    if (obj2 == null) {
                        amVar.charlie = obj;
                        return true;
                    }
                    if (obj2 instanceof bv.am) {
                        ((bv.am) obj2).alpha(obj);
                        return true;
                    }
                    bv.am amVar2 = bv.av.alpha;
                    bv.am amVar3 = new bv.am(2);
                    amVar3.kilo(obj2);
                    amVar3.kilo(obj);
                    amVar.charlie = amVar3;
                    return true;
                }
                amVar.charlie = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void alpha() {
        juliet();
        this.india.clear();
        this.november.bravo = 0;
        this.tango.bravo = 0;
        this.xray.bravo = 0;
        this.victor = null;
        I.c cVar = this.indigo;
        cVar.bravo.bravo();
        cVar.alpha.bravo();
        this.magenta = 0;
        this.amber = 0;
        this.romeo = false;
        this.lime = false;
        this.yankee = false;
        this.bronze = false;
        this.zulu = -1;
        C0573f0 c0573f0 = this.coral;
        if (!c0573f0.foxtrot) {
            c0573f0.charlie();
        }
        if (!this.cyan.whiskey) {
            yankee();
        }
    }

    public final I amber() {
        return mike();
    }

    public final Q azure() {
        if (this.amber == 0) {
            ArrayList arrayList = this.blue;
            if (!arrayList.isEmpty()) {
                return (Q) P0.amber(1, arrayList);
            }
            return null;
        }
        return null;
    }

    public final void b(bv.al alVar) {
        ArrayList arrayList = this.sierra;
        for (int ivory = CollectionsKt.ivory(arrayList); -1 < ivory; ivory--) {
            am amVar = (am) arrayList.get(ivory);
            C0562a c0562a = amVar.alpha.charlie;
            if (c0562a != null && c0562a.alpha()) {
                int i4 = amVar.bravo;
                int i5 = c0562a.alpha;
                if (i4 != i5) {
                    amVar.bravo = i5;
                }
            } else {
                arrayList.remove(ivory);
            }
        }
        Object[] objArr = alVar.bravo;
        Object[] objArr2 = alVar.charlie;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j5 = jArr[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j5) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            Q q4 = (Q) obj;
                            C0562a c0562a2 = q4.charlie;
                            if (c0562a2 != null) {
                                int i14 = c0562a2.alpha;
                                if (obj2 == as.teal) {
                                    obj2 = null;
                                }
                                arrayList.add(new am(q4, i14, obj2));
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        kotlin.collections.p.romeo(arrayList, r.foxtrot);
    }

    public final boolean beige() {
        if (bronze() && !this.whiskey) {
            Q azure = azure();
            if (azure == null || (azure.bravo & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final androidx.compose.runtime.tooling.c black() {
        if (this.beige) {
            return this.jade;
        }
        return null;
    }

    public final boolean blue() {
        return this.lime;
    }

    public final void bravo(Object obj, Xd.l lVar) {
        if (this.lime) {
            I.c cVar = this.indigo;
            cVar.getClass();
            I.ag agVar = I.ag.delta;
            I.am amVar = cVar.alpha;
            amVar.foxtrot(agVar);
            AbstractC2777t5.bravo(amVar, 0, obj);
            Intrinsics.charlie(lVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.x.echo(2, lVar);
            AbstractC2777t5.bravo(amVar, 1, lVar);
            return;
        }
        I.b bVar = this.gray;
        bVar.charlie();
        I.a aVar = bVar.bravo;
        aVar.getClass();
        I.ag agVar2 = I.ag.delta;
        I.am amVar2 = aVar.alpha;
        amVar2.foxtrot(agVar2);
        Intrinsics.charlie(lVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.x.echo(2, lVar);
        AbstractC2777t5.charlie(amVar2, 0, obj, 1, lVar);
    }

    public final boolean bronze() {
        Q azure;
        if (!this.lime && !this.yankee && !this.whiskey && (azure = azure()) != null && (azure.bravo & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void c(int i4, int i5) {
        if (h(i4) != i5) {
            if (i4 < 0) {
                bv.y yVar = this.papa;
                if (yVar == null) {
                    yVar = new bv.y();
                    this.papa = yVar;
                }
                yVar.foxtrot(i4, i5);
                return;
            }
            int[] iArr = this.oscar;
            if (iArr == null) {
                iArr = new int[this.coral.charlie];
                ArraysKt.crimson(-1, iArr);
                this.oscar = iArr;
            }
            iArr[i4] = i5;
        }
    }

    public final boolean charlie(double d4) {
        Object cyan = cyan();
        if ((cyan instanceof Double) && d4 == ((Number) cyan).doubleValue()) {
            return false;
        }
        g(Double.valueOf(d4));
        return true;
    }

    public final void coral(ArrayList arrayList) {
        I.a aVar = this.foxtrot;
        I.b bVar = this.gray;
        I.a aVar2 = bVar.bravo;
        try {
            bVar.bravo = aVar;
            aVar.alpha.foxtrot(I.aa.delta);
            if (arrayList.size() <= 0) {
                I.a aVar3 = bVar.bravo;
                aVar3.getClass();
                aVar3.alpha.foxtrot(I.n.delta);
                bVar.foxtrot = 0;
                return;
            }
            Pair pair = (Pair) arrayList.get(0);
            av avVar = (av) pair.first;
            avVar.getClass();
            throw null;
        } finally {
            bVar.bravo = aVar2;
        }
    }

    public final void crimson(I i4, Object obj) {
        boolean z2;
        pink(126665345, null);
        cyan();
        g(obj);
        long j5 = this.magenta;
        try {
            this.magenta = 126665345;
            if (this.lime) {
                j0.yankee(this.cyan);
            }
            if (this.lime || Intrinsics.areEqual(this.coral.foxtrot(), i4)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                indigo(i4);
            }
            olive(202, 0, r.charlie, i4);
            this.fuchsia = null;
            boolean z10 = this.whiskey;
            this.whiskey = z2;
            P.e.delta(this, new P.d(new androidx.compose.foundation.layout.ai(1, obj), 316014703, true));
            this.whiskey = z10;
        } finally {
        }
    }

    public final Object cyan() {
        boolean z2 = this.lime;
        as asVar = C0580l.alpha;
        if (z2) {
            if (this.romeo) {
                r.charlie("A call to createNode(), emitNode() or useNode() expected");
                return asVar;
            }
        } else {
            Object mike = this.coral.mike();
            if (!this.yankee || (mike instanceof C0583o)) {
                return mike;
            }
        }
        return asVar;
    }

    public final void d(int i4, int i5) {
        int h4 = h(i4);
        if (h4 != i5) {
            int i10 = i5 - h4;
            ArrayList arrayList = this.india;
            int size = arrayList.size() - 1;
            while (i4 != -1) {
                int h10 = h(i4) + i10;
                c(i4, h10);
                int i11 = size;
                while (true) {
                    if (-1 < i11) {
                        H h11 = (H) arrayList.get(i11);
                        if (h11 != null && h11.alpha(i4, h10)) {
                            size = i11 - 1;
                            break;
                        }
                        i11--;
                    } else {
                        break;
                    }
                }
                if (i4 < 0) {
                    i4 = this.coral.india;
                } else if (!this.coral.lima(i4)) {
                    i4 = this.coral.quebec(i4);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean delta(float f5) {
        Object cyan = cyan();
        if ((cyan instanceof Float) && f5 == ((Number) cyan).floatValue()) {
            return false;
        }
        g(Float.valueOf(f5));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M.e, P.h] */
    public final P.i e(I i4, P.i iVar) {
        P.i iVar2 = (P.i) i4;
        iVar2.getClass();
        ?? eVar = new M.e(iVar2);
        eVar.yellow = iVar2;
        eVar.putAll(iVar);
        P.i build = eVar.build();
        peach(204, r.delta);
        cyan();
        g(build);
        cyan();
        g(iVar);
        quebec(false);
        return build;
    }

    public final boolean echo(int i4) {
        Object cyan = cyan();
        if ((cyan instanceof Integer) && i4 == ((Number) cyan).intValue()) {
            return false;
        }
        g(Integer.valueOf(i4));
        return true;
    }

    public final List emerald() {
        C0590w c0590w;
        AbstractC0587t abstractC0587t = this.bravo;
        InterfaceC0586s hotel = abstractC0587t.hotel();
        if (av.q.kilo(hotel)) {
            c0590w = (C0590w) hotel;
        } else {
            c0590w = null;
        }
        if (c0590w == null) {
            return CollectionsKt.emptyList();
        }
        C0575g0 c0575g0 = c0590w.white;
        C0573f0 delta = c0575g0.delta();
        try {
            Integer charlie = AbstractC3081x3.charlie(delta, abstractC0587t, 0, delta.charlie);
            if (charlie != null) {
                try {
                    return AbstractC3081x3.delta(c0575g0.delta(), charlie.intValue(), 0);
                } finally {
                }
            }
            return CollectionsKt.emptyList();
        } finally {
        }
    }

    public final void f(Object obj) {
        int i4;
        C0573f0 c0573f0;
        int i5;
        j0 j0Var;
        if (obj instanceof InterfaceC0563a0) {
            InterfaceC0563a0 interfaceC0563a0 = (InterfaceC0563a0) obj;
            C0562a c0562a = null;
            if (this.lime) {
                j0 j0Var2 = this.cyan;
                int i10 = j0Var2.tango;
                if (i10 > j0Var2.victor + 1) {
                    int i11 = i10 - 1;
                    int black = j0Var2.black(i11, j0Var2.bravo);
                    while (true) {
                        i5 = i11;
                        i11 = black;
                        j0Var = this.cyan;
                        if (i11 == j0Var.victor || i11 < 0) {
                            break;
                        } else {
                            black = j0Var.black(i11, j0Var.bravo);
                        }
                    }
                    c0562a = j0Var.bravo(i5);
                }
            } else {
                C0573f0 c0573f02 = this.coral;
                int i12 = c0573f02.golf;
                if (i12 > c0573f02.india + 1) {
                    int i13 = i12 - 1;
                    int quebec = c0573f02.quebec(i13);
                    while (true) {
                        i4 = i13;
                        i13 = quebec;
                        c0573f0 = this.coral;
                        if (i13 == c0573f0.india || i13 < 0) {
                            break;
                        } else {
                            quebec = c0573f0.quebec(i13);
                        }
                    }
                    c0562a = c0573f0.alpha(i4);
                }
            }
            C0565b0 c0565b0 = new C0565b0(interfaceC0563a0, c0562a);
            if (this.lime) {
                I.a aVar = this.gray.bravo;
                aVar.getClass();
                I.w wVar = I.w.delta;
                I.am amVar = aVar.alpha;
                amVar.foxtrot(wVar);
                AbstractC2777t5.bravo(amVar, 0, c0565b0);
            }
            this.delta.add(obj);
            obj = c0565b0;
        }
        g(obj);
    }

    public final boolean foxtrot(long j5) {
        Object cyan = cyan();
        if ((cyan instanceof Long) && j5 == ((Number) cyan).longValue()) {
            return false;
        }
        g(Long.valueOf(j5));
        return true;
    }

    public final int fuchsia(int i4) {
        int quebec = this.coral.quebec(i4) + 1;
        int i5 = 0;
        while (quebec < i4) {
            if (!this.coral.kilo(quebec)) {
                i5++;
            }
            quebec += i0.alpha(quebec, this.coral.bravo);
        }
        return i5;
    }

    public final void g(Object obj) {
        if (this.lime) {
            j0 j0Var = this.cyan;
            if (j0Var.november > 0 && j0Var.india != j0Var.kilo) {
                bv.aa aaVar = j0Var.sierra;
                if (aaVar == null) {
                    aaVar = new bv.aa();
                }
                j0Var.sierra = aaVar;
                int i4 = j0Var.victor;
                Object bravo = aaVar.bravo(i4);
                if (bravo == null) {
                    bravo = new bv.ah();
                    aaVar.hotel(i4, bravo);
                }
                ((bv.ah) bravo).golf(obj);
                return;
            }
            j0Var.blue(obj);
            return;
        }
        C0573f0 c0573f0 = this.coral;
        boolean z2 = c0573f0.november;
        I.b bVar = this.gray;
        if (z2) {
            int charlie = (c0573f0.lima - i0.charlie(c0573f0.india, c0573f0.bravo)) - 1;
            if (bVar.alpha.coral.india - bVar.foxtrot < 0) {
                C0573f0 c0573f02 = this.coral;
                C0562a alpha = c0573f02.alpha(c0573f02.india);
                I.a aVar = bVar.bravo;
                I.r rVar = I.r.golf;
                I.am amVar = aVar.alpha;
                amVar.foxtrot(rVar);
                AbstractC2777t5.charlie(amVar, 0, obj, 1, alpha);
                amVar.charlie[amVar.delta - amVar.alpha[amVar.bravo - 1].bravo] = charlie;
                return;
            }
            bVar.echo(true);
            I.a aVar2 = bVar.bravo;
            I.r rVar2 = I.r.hotel;
            I.am amVar2 = aVar2.alpha;
            amVar2.foxtrot(rVar2);
            AbstractC2777t5.bravo(amVar2, 0, obj);
            amVar2.charlie[amVar2.delta - amVar2.alpha[amVar2.bravo - 1].bravo] = charlie;
            return;
        }
        C0562a alpha2 = c0573f0.alpha(c0573f0.india);
        I.a aVar3 = bVar.bravo;
        aVar3.getClass();
        I.e eVar = I.e.delta;
        I.am amVar3 = aVar3.alpha;
        amVar3.foxtrot(eVar);
        AbstractC2777t5.charlie(amVar3, 0, alpha2, 1, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gold(C0590w c0590w, C0590w c0590w2, Integer num, List list, Function0 function0) {
        Object invoke;
        int i4;
        boolean z2 = this.bronze;
        int i5 = this.kilo;
        try {
            this.bronze = true;
            this.kilo = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) list.get(i10);
                Q q4 = (Q) pair.first;
                Object obj = pair.second;
                if (obj != null) {
                    a(q4, obj);
                } else {
                    a(q4, null);
                }
            }
            if (c0590w != null) {
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = -1;
                }
                if (c0590w2 != null && !Intrinsics.areEqual(c0590w2, c0590w) && i4 >= 0) {
                    c0590w.f3016k = c0590w2;
                    c0590w.f3017l = i4;
                    try {
                        invoke = function0.invoke();
                        c0590w.f3016k = null;
                        c0590w.f3017l = 0;
                    } catch (Throwable th) {
                        c0590w.f3016k = null;
                        c0590w.f3017l = 0;
                        throw th;
                    }
                } else {
                    invoke = function0.invoke();
                }
            }
            invoke = function0.invoke();
            this.bronze = z2;
            this.kilo = i5;
            return invoke;
        } catch (Throwable th2) {
            this.bronze = z2;
            this.kilo = i5;
            throw th2;
        }
    }

    public final boolean golf(Object obj) {
        if (!Intrinsics.areEqual(cyan(), obj)) {
            g(obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.bravo < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gray() {
        am amVar;
        int i4;
        int i5;
        long j5;
        int i10;
        int i11;
        boolean z2;
        int i12;
        long j6;
        int i13;
        int i14;
        long j7;
        bv.ag agVar;
        int i15;
        int echo;
        int i16;
        int i17;
        long j10;
        boolean z10;
        long j11;
        int i18;
        Object bravo;
        int fuchsia;
        int h4;
        boolean z11 = this.bronze;
        boolean z12 = true;
        this.bronze = true;
        C0573f0 c0573f0 = this.coral;
        int i19 = c0573f0.india;
        int i20 = (i19 * 5) + 3;
        int i21 = c0573f0.bravo[i20] + i19;
        int i22 = this.kilo;
        long j12 = this.magenta;
        int i23 = this.lima;
        int i24 = this.mike;
        ArrayList arrayList = this.sierra;
        int echo2 = r.echo(c0573f0.golf, arrayList);
        if (echo2 < 0) {
            echo2 = -(echo2 + 1);
        }
        if (echo2 < arrayList.size()) {
            amVar = (am) arrayList.get(echo2);
        }
        amVar = null;
        boolean z13 = false;
        int i25 = i19;
        while (amVar != null) {
            boolean z14 = z12;
            int i26 = amVar.bravo;
            int echo3 = r.echo(i26, arrayList);
            if (echo3 >= 0) {
            }
            Object obj = amVar.charlie;
            Q q4 = amVar.alpha;
            if (obj == null) {
                q4.getClass();
                i4 = i20;
            } else {
                int i27 = 8;
                bv.al alVar = q4.golf;
                if (alVar == null) {
                    i4 = i20;
                } else {
                    i4 = i20;
                    if (obj instanceof ad) {
                        z2 = Q.alpha((ad) obj, alVar);
                        i5 = i22;
                        j5 = j12;
                        i10 = i23;
                        i11 = i24;
                    } else if (obj instanceof bv.am) {
                        bv.am amVar2 = (bv.am) obj;
                        if (amVar2.hotel()) {
                            Object[] objArr = amVar2.bravo;
                            long[] jArr = amVar2.alpha;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i5 = i22;
                                i10 = i23;
                                i11 = i24;
                                int i28 = 0;
                                while (true) {
                                    long j13 = jArr[i28];
                                    j5 = j12;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i28 - length)) >>> 31);
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            if ((j13 & 255) < 128) {
                                                i12 = i30;
                                                Object obj2 = objArr[(i28 << 3) + i30];
                                                j6 = j13;
                                                if (!(obj2 instanceof ad) || Q.alpha((ad) obj2, alVar)) {
                                                    break;
                                                }
                                            } else {
                                                i12 = i30;
                                                j6 = j13;
                                            }
                                            j13 = j6 >> i27;
                                            i30 = i12 + 1;
                                        }
                                        if (i29 != i27) {
                                            break;
                                        }
                                    }
                                    if (i28 == length) {
                                        break;
                                    }
                                    i28++;
                                    j12 = j5;
                                    i27 = 8;
                                }
                                z2 = z14 ? 1 : 0;
                            }
                        }
                        i5 = i22;
                        j5 = j12;
                        i10 = i23;
                        i11 = i24;
                        z2 = false;
                    }
                    if (!z2) {
                        this.coral.romeo(i26);
                        int i31 = this.coral.golf;
                        ivory(i25, i31, i19);
                        int quebec = this.coral.quebec(i31);
                        while (quebec != i19 && !this.coral.lima(quebec)) {
                            quebec = this.coral.quebec(quebec);
                        }
                        if (this.coral.lima(quebec)) {
                            i16 = 0;
                        } else {
                            i16 = i5;
                        }
                        if (quebec != i31) {
                            int h10 = (h(quebec) - this.coral.oscar(i31)) + i16;
                            while (i16 < h10 && quebec != i26) {
                                quebec++;
                                while (quebec < i26) {
                                    C0573f0 c0573f02 = this.coral;
                                    int i32 = c0573f02.bravo[(quebec * 5) + 3] + quebec;
                                    if (i26 >= i32) {
                                        if (c0573f02.lima(quebec)) {
                                            h4 = z14 ? 1 : 0;
                                        } else {
                                            h4 = h(quebec);
                                        }
                                        i16 += h4;
                                        quebec = i32;
                                    }
                                }
                                break;
                            }
                        }
                        this.kilo = i16;
                        this.mike = fuchsia(i31);
                        int quebec2 = this.coral.quebec(i31);
                        long j14 = 0;
                        int i33 = 3;
                        int i34 = 0;
                        while (true) {
                            if (quebec2 >= 0) {
                                if (quebec2 == i19) {
                                    j10 = j5;
                                    j14 ^= Long.rotateLeft(j10, i34);
                                    i17 = i31;
                                    break;
                                }
                                j10 = j5;
                                C0573f0 c0573f03 = this.coral;
                                boolean kilo = c0573f03.kilo(quebec2);
                                i17 = i31;
                                int[] iArr = c0573f03.bravo;
                                if (kilo) {
                                    Object papa = c0573f03.papa(quebec2, iArr);
                                    if (papa != null) {
                                        if (papa instanceof Enum) {
                                            i18 = ((Enum) papa).ordinal();
                                        } else {
                                            i18 = papa.hashCode();
                                        }
                                        j11 = j14;
                                    } else {
                                        j11 = j14;
                                        i18 = 0;
                                    }
                                } else {
                                    int india = c0573f03.india(quebec2);
                                    j11 = j14;
                                    if (india == 207 && (bravo = c0573f03.bravo(quebec2, iArr)) != null && !Intrinsics.areEqual(bravo, C0580l.alpha)) {
                                        i18 = bravo.hashCode();
                                    } else {
                                        i18 = india;
                                    }
                                }
                                if (i18 == 126665345) {
                                    j14 = j11 ^ Long.rotateLeft(i18, i34);
                                    break;
                                }
                                if (this.coral.kilo(quebec2)) {
                                    fuchsia = 0;
                                } else {
                                    fuchsia = fuchsia(quebec2);
                                }
                                j14 = Long.rotateLeft(fuchsia, i34) ^ (j11 ^ Long.rotateLeft(i18, i33));
                                i33 = (i33 + 6) % 64;
                                i34 = (i34 + 6) % 64;
                                quebec2 = this.coral.quebec(quebec2);
                                j5 = j10;
                                i31 = i17;
                            } else {
                                i17 = i31;
                                j10 = j5;
                                break;
                            }
                        }
                        this.magenta = j14;
                        this.fuchsia = null;
                        Xd.l lVar = q4.delta;
                        if (lVar != null) {
                            lVar.invoke(this, Integer.valueOf(z14 ? 1 : 0));
                            this.fuchsia = null;
                            C0573f0 c0573f04 = this.coral;
                            int i35 = c0573f04.bravo[i4] + i19;
                            int i36 = c0573f04.golf;
                            if (i36 >= i19 && i36 <= i35) {
                                z10 = z14 ? 1 : 0;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                r.charlie("Index " + i19 + " is not a parent of " + i36);
                            }
                            c0573f04.india = i19;
                            c0573f04.hotel = i35;
                            c0573f04.lima = 0;
                            c0573f04.mike = 0;
                            i13 = i19;
                            i14 = i21;
                            j7 = j10;
                            i25 = i17;
                            z13 = z14 ? 1 : 0;
                        } else {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                    } else {
                        long j15 = j5;
                        ArrayList arrayList2 = this.blue;
                        arrayList2.add(q4);
                        this.golf.alpha();
                        C0590w c0590w = q4.alpha;
                        if (c0590w != null && (agVar = q4.foxtrot) != null) {
                            q4.echo(z14);
                            try {
                                Object[] objArr2 = agVar.bravo;
                                int[] iArr2 = agVar.charlie;
                                long[] jArr2 = agVar.alpha;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    j7 = j15;
                                    int i37 = 0;
                                    while (true) {
                                        long j16 = jArr2[i37];
                                        i13 = i19;
                                        i14 = i21;
                                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                            for (int i39 = 0; i39 < i38; i39 = i15 + 1) {
                                                if ((j16 & 255) < 128) {
                                                    int i40 = (i37 << 3) + i39;
                                                    i15 = i39;
                                                    Object obj3 = objArr2[i40];
                                                    int i41 = iArr2[i40];
                                                    c0590w.zulu(obj3);
                                                } else {
                                                    i15 = i39;
                                                }
                                                j16 >>= 8;
                                            }
                                            if (i38 != 8) {
                                                break;
                                            }
                                        }
                                        if (i37 == length2) {
                                            break;
                                        }
                                        i37++;
                                        i19 = i13;
                                        i21 = i14;
                                    }
                                } else {
                                    i13 = i19;
                                    i14 = i21;
                                    j7 = j15;
                                }
                                q4.echo(false);
                            } catch (Throwable th) {
                                q4.echo(false);
                                throw th;
                            }
                        } else {
                            i13 = i19;
                            i14 = i21;
                            j7 = j15;
                        }
                        z14 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    echo = r.echo(this.coral.golf, arrayList);
                    if (echo < 0) {
                        echo = -(echo + 1);
                    }
                    if (echo >= arrayList.size()) {
                        amVar = (am) arrayList.get(echo);
                        i21 = i14;
                        if (amVar.bravo < i21) {
                            z12 = z14;
                            i20 = i4;
                            i19 = i13;
                            i22 = i5;
                            i23 = i10;
                            i24 = i11;
                            j12 = j7;
                        }
                    } else {
                        i21 = i14;
                    }
                    amVar = null;
                    z12 = z14;
                    i20 = i4;
                    i19 = i13;
                    i22 = i5;
                    i23 = i10;
                    i24 = i11;
                    j12 = j7;
                }
            }
            i5 = i22;
            j5 = j12;
            i10 = i23;
            i11 = i24;
            z2 = z14 ? 1 : 0;
            if (!z2) {
            }
            echo = r.echo(this.coral.golf, arrayList);
            if (echo < 0) {
            }
            if (echo >= arrayList.size()) {
            }
            amVar = null;
            z12 = z14;
            i20 = i4;
            i19 = i13;
            i22 = i5;
            i23 = i10;
            i24 = i11;
            j12 = j7;
        }
        int i42 = i19;
        int i43 = i22;
        long j17 = j12;
        int i44 = i23;
        int i45 = i24;
        if (z13) {
            ivory(i25, i42, i42);
            this.coral.tango();
            int h11 = h(i42);
            this.kilo = i43 + h11;
            this.lima = i44 + h11;
            this.mike = i45;
        } else {
            navy();
        }
        this.magenta = j17;
        this.bronze = z11;
    }

    public final void green() {
        lavender(this.coral.golf);
        I.b bVar = this.gray;
        bVar.echo(false);
        C0585q c0585q = bVar.alpha;
        C0573f0 c0573f0 = c0585q.coral;
        if (c0573f0.charlie > 0) {
            int i4 = c0573f0.india;
            al alVar = bVar.delta;
            if (alVar.alpha(-2) != i4) {
                if (!bVar.charlie && bVar.echo) {
                    bVar.echo(false);
                    I.a aVar = bVar.bravo;
                    aVar.getClass();
                    aVar.alpha.foxtrot(I.q.delta);
                    bVar.charlie = true;
                }
                if (i4 > 0) {
                    C0562a alpha = c0573f0.alpha(i4);
                    alVar.charlie(i4);
                    bVar.echo(false);
                    I.a aVar2 = bVar.bravo;
                    aVar2.getClass();
                    I.p pVar = I.p.delta;
                    I.am amVar = aVar2.alpha;
                    amVar.foxtrot(pVar);
                    AbstractC2777t5.bravo(amVar, 0, alpha);
                    bVar.charlie = true;
                }
            }
        }
        I.a aVar3 = bVar.bravo;
        aVar3.getClass();
        aVar3.alpha.foxtrot(I.y.delta);
        int i5 = bVar.foxtrot;
        C0573f0 c0573f02 = c0585q.coral;
        bVar.foxtrot = c0573f02.bravo[(c0573f02.golf * 5) + 3] + i5;
    }

    public final int h(int i4) {
        int i5;
        if (i4 < 0) {
            bv.y yVar = this.papa;
            if (yVar == null || yVar.charlie(i4) < 0) {
                return 0;
            }
            int charlie = yVar.charlie(i4);
            if (charlie >= 0) {
                return yVar.charlie[charlie];
            }
            bw.a.echo("Cannot find value for key " + i4);
            throw null;
        }
        int[] iArr = this.oscar;
        if (iArr != null && (i5 = iArr[i4]) >= 0) {
            return i5;
        }
        return this.coral.oscar(i4);
    }

    public final boolean hotel(boolean z2) {
        Object cyan = cyan();
        if ((cyan instanceof Boolean) && z2 == ((Boolean) cyan).booleanValue()) {
            return false;
        }
        g(Boolean.valueOf(z2));
        return true;
    }

    public final void i() {
        if (!this.romeo) {
            r.charlie("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.romeo = false;
        if (this.lime) {
            r.charlie("useNode() called while inserting");
        }
        C0573f0 c0573f0 = this.coral;
        Object november = c0573f0.november(c0573f0.india);
        I.b bVar = this.gray;
        bVar.delta();
        bVar.hotel.add(november);
        if (this.yankee && (november instanceof InterfaceC0578j)) {
            bVar.charlie();
            I.a aVar = bVar.bravo;
            aVar.getClass();
            if (((InterfaceC0578j) november) != null) {
                aVar.alpha.foxtrot(I.ai.delta);
            }
        }
    }

    public final boolean india(Object obj) {
        if (cyan() != obj) {
            g(obj);
            return true;
        }
        return false;
    }

    public final void indigo(I i4) {
        bv.aa aaVar = this.victor;
        if (aaVar == null) {
            aaVar = new bv.aa();
            this.victor = aaVar;
        }
        aaVar.hotel(this.coral.golf, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ivory(int i4, int i5, int i10) {
        C0573f0 c0573f0 = this.coral;
        if (i4 != i5) {
            if (i4 != i10 && i5 != i10) {
                if (c0573f0.quebec(i4) == i5) {
                    i10 = i5;
                } else if (c0573f0.quebec(i5) != i4) {
                    if (c0573f0.quebec(i4) == c0573f0.quebec(i5)) {
                        i10 = c0573f0.quebec(i4);
                    } else {
                        int i11 = i4;
                        int i12 = 0;
                        while (i11 > 0 && i11 != i10) {
                            i11 = c0573f0.quebec(i11);
                            i12++;
                        }
                        int i13 = i5;
                        int i14 = 0;
                        while (i13 > 0 && i13 != i10) {
                            i13 = c0573f0.quebec(i13);
                            i14++;
                        }
                        int i15 = i12 - i14;
                        int i16 = i4;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = c0573f0.quebec(i16);
                        }
                        int i18 = i14 - i12;
                        int i19 = i5;
                        for (int i20 = 0; i20 < i18; i20++) {
                            i19 = c0573f0.quebec(i19);
                        }
                        i10 = i16;
                        for (int i21 = i19; i10 != i21; i21 = c0573f0.quebec(i21)) {
                            i10 = c0573f0.quebec(i10);
                        }
                    }
                }
            }
            while (i4 > 0 && i4 != i10) {
                if (!c0573f0.lima(i4)) {
                    this.gray.bravo();
                }
                i4 = c0573f0.quebec(i4);
            }
            papa(i5, i10);
        }
        i10 = i4;
        while (i4 > 0) {
            if (!c0573f0.lima(i4)) {
            }
            i4 = c0573f0.quebec(i4);
        }
        papa(i5, i10);
    }

    public final Object jade() {
        boolean z2 = this.lime;
        as asVar = C0580l.alpha;
        if (z2) {
            if (this.romeo) {
                r.charlie("A call to createNode(), emitNode() or useNode() expected");
                return asVar;
            }
        } else {
            Object mike = this.coral.mike();
            if (!this.yankee || (mike instanceof C0583o)) {
                if (mike instanceof C0565b0) {
                    return ((C0565b0) mike).alpha;
                }
                return mike;
            }
        }
        return asVar;
    }

    public final void juliet() {
        this.juliet = null;
        this.kilo = 0;
        this.lima = 0;
        this.magenta = 0L;
        this.romeo = false;
        I.b bVar = this.gray;
        bVar.charlie = false;
        bVar.delta.bravo = 0;
        bVar.foxtrot = 0;
        bVar.echo = true;
        bVar.golf = 0;
        bVar.hotel.clear();
        bVar.india = -1;
        bVar.juliet = -1;
        bVar.kilo = -1;
        bVar.lima = 0;
        this.blue.clear();
        this.oscar = null;
        this.papa = null;
    }

    public final Object kilo(N n5) {
        return C0564b.azure(mike(), n5);
    }

    public final void lavender(int i4) {
        boolean lima = this.coral.lima(i4);
        I.b bVar = this.gray;
        if (lima) {
            bVar.delta();
            Object november = this.coral.november(i4);
            bVar.delta();
            bVar.hotel.add(november);
        }
        lime(this, i4, lima, 0);
        bVar.delta();
        if (lima) {
            bVar.bravo();
        }
    }

    public final void lima(Function0 function0) {
        if (!this.romeo) {
            r.charlie("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.romeo = false;
        if (!this.lime) {
            r.charlie("createNode() can only be called when inserting");
        }
        al alVar = this.november;
        int i4 = alVar.alpha[alVar.bravo - 1];
        j0 j0Var = this.cyan;
        C0562a bravo = j0Var.bravo(j0Var.victor);
        this.lima++;
        I.c cVar = this.indigo;
        I.r rVar = I.r.echo;
        I.am amVar = cVar.alpha;
        amVar.foxtrot(rVar);
        AbstractC2777t5.bravo(amVar, 0, function0);
        amVar.charlie[amVar.delta - amVar.alpha[amVar.bravo - 1].bravo] = i4;
        AbstractC2777t5.bravo(amVar, 1, bravo);
        I.r rVar2 = I.r.foxtrot;
        I.am amVar2 = cVar.bravo;
        amVar2.foxtrot(rVar2);
        amVar2.charlie[amVar2.delta - amVar2.alpha[amVar2.bravo - 1].bravo] = i4;
        AbstractC2777t5.bravo(amVar2, 0, bravo);
    }

    public final boolean magenta(int i4, boolean z2) {
        if ((i4 & 1) == 0 && (this.lime || this.yankee)) {
            com.google.firebase.messaging.l lVar = this.ivory;
            if (lVar != null && azure() != null) {
                lVar.getClass();
            }
        } else if (!z2 && bronze()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void maroon() {
        Object obj;
        int[] iArr;
        int hashCode;
        long rotateLeft;
        long j5;
        if (this.sierra.isEmpty()) {
            this.lima = this.coral.sierra() + this.lima;
            return;
        }
        C0573f0 c0573f0 = this.coral;
        int golf = c0573f0.golf();
        int i4 = c0573f0.golf;
        int i5 = c0573f0.hotel;
        int[] iArr2 = c0573f0.bravo;
        if (i4 < i5) {
            obj = c0573f0.papa(i4, iArr2);
        } else {
            obj = null;
        }
        Object foxtrot = c0573f0.foxtrot();
        int i10 = this.mike;
        as asVar = C0580l.alpha;
        if (obj == null) {
            if (foxtrot != null && golf == 207 && !Intrinsics.areEqual(foxtrot, asVar)) {
                iArr = iArr2;
                this.magenta = Long.rotateLeft(foxtrot.hashCode() ^ Long.rotateLeft(this.magenta, 3), 3) ^ i10;
                boolean z2 = true;
                if ((iArr[(c0573f0.golf * 5) + 1] & 1073741824) == 0) {
                    z2 = false;
                }
                plum(null, z2);
                gray();
                c0573f0.echo();
                if (obj != null) {
                    if (foxtrot != null && golf == 207 && !Intrinsics.areEqual(foxtrot, asVar)) {
                        this.magenta = Long.rotateRight(Long.rotateRight(this.magenta ^ i10, 3) ^ foxtrot.hashCode(), 3);
                        return;
                    } else {
                        this.magenta = Long.rotateRight(golf ^ Long.rotateRight(this.magenta ^ i10, 3), 3);
                        return;
                    }
                }
                if (obj instanceof Enum) {
                    this.magenta = Long.rotateRight(Long.rotateRight(this.magenta ^ 0, 3) ^ ((Enum) obj).ordinal(), 3);
                    return;
                } else {
                    this.magenta = Long.rotateRight(Long.rotateRight(this.magenta ^ 0, 3) ^ obj.hashCode(), 3);
                    return;
                }
            }
            iArr = iArr2;
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.magenta, 3) ^ golf, 3);
            j5 = i10;
        } else {
            iArr = iArr2;
            if (obj instanceof Enum) {
                hashCode = ((Enum) obj).ordinal();
            } else {
                hashCode = obj.hashCode();
            }
            rotateLeft = Long.rotateLeft(hashCode ^ Long.rotateLeft(this.magenta, 3), 3);
            j5 = 0;
        }
        this.magenta = rotateLeft ^ j5;
        boolean z22 = true;
        if ((iArr[(c0573f0.golf * 5) + 1] & 1073741824) == 0) {
        }
        plum(null, z22);
        gray();
        c0573f0.echo();
        if (obj != null) {
        }
    }

    public final I mike() {
        I i4;
        I i5 = this.fuchsia;
        if (i5 != null) {
            return i5;
        }
        int i10 = this.coral.india;
        boolean z2 = this.lime;
        az azVar = r.charlie;
        if (z2 && this.emerald) {
            int i11 = this.cyan.victor;
            while (i11 > 0) {
                j0 j0Var = this.cyan;
                if (j0Var.bravo[j0Var.romeo(i11) * 5] == 202 && Intrinsics.areEqual(this.cyan.sierra(i11), azVar)) {
                    Object quebec = this.cyan.quebec(i11);
                    Intrinsics.charlie(quebec, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    I i12 = (I) quebec;
                    this.fuchsia = i12;
                    return i12;
                }
                j0 j0Var2 = this.cyan;
                i11 = j0Var2.black(i11, j0Var2.bravo);
            }
        }
        if (this.coral.charlie > 0) {
            while (i10 > 0) {
                if (this.coral.india(i10) == 202) {
                    C0573f0 c0573f0 = this.coral;
                    if (Intrinsics.areEqual(c0573f0.papa(i10, c0573f0.bravo), azVar)) {
                        bv.aa aaVar = this.victor;
                        if (aaVar == null || (i4 = (I) aaVar.bravo(i10)) == null) {
                            C0573f0 c0573f02 = this.coral;
                            Object bravo = c0573f02.bravo(i10, c0573f02.bravo);
                            Intrinsics.charlie(bravo, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            i4 = (I) bravo;
                        }
                        this.fuchsia = i4;
                        return i4;
                    }
                }
                i10 = this.coral.quebec(i10);
            }
        }
        I i13 = this.uniform;
        this.fuchsia = i13;
        return i13;
    }

    public final void navy() {
        int i4;
        C0573f0 c0573f0 = this.coral;
        int i5 = c0573f0.india;
        if (i5 >= 0) {
            i4 = c0573f0.bravo[(i5 * 5) + 1] & 67108863;
        } else {
            i4 = 0;
        }
        this.lima = i4;
        c0573f0.tango();
    }

    public final List november() {
        Collection emptyList;
        if (!this.beige) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        j0 j0Var = this.cyan;
        arrayList.addAll(AbstractC3081x3.alpha(j0Var, null, j0Var.tango, null));
        C0573f0 c0573f0 = this.coral;
        if (!c0573f0.foxtrot && c0573f0.charlie != 0) {
            androidx.compose.runtime.tooling.h hVar = new androidx.compose.runtime.tooling.h(c0573f0);
            int i4 = c0573f0.india;
            Object valueOf = Integer.valueOf(c0573f0.lima - i0.charlie(i4, c0573f0.bravo));
            while (i4 >= 0) {
                hVar.golf(c0573f0.alpha.kilo(i4), valueOf);
                valueOf = c0573f0.alpha(i4);
                i4 = c0573f0.quebec(i4);
            }
            emptyList = hVar.alpha;
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        arrayList.addAll(emptyList);
        arrayList.addAll(emerald());
        return arrayList;
    }

    public final void ochre() {
        if (this.lima != 0) {
            r.charlie("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.lime) {
            Q azure = azure();
            if (azure != null) {
                int i4 = azure.bravo;
                if ((i4 & 128) == 0) {
                    azure.bravo = i4 | 16;
                }
            }
            if (this.sierra.isEmpty()) {
                navy();
            } else {
                gray();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void olive(int i4, int i5, Object obj, Object obj2) {
        int hashCode;
        long rotateLeft;
        long j5;
        boolean z2;
        boolean z10;
        int i10;
        H h4;
        H h10;
        Object valueOf;
        Object obj3;
        int i11;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        Object[] objArr2;
        int i15;
        int i16;
        int i17;
        Object obj4;
        Object obj5 = obj;
        if (this.romeo) {
            r.charlie("A call to createNode(), emitNode() or useNode() expected");
        }
        int i18 = this.mike;
        as asVar = C0580l.alpha;
        if (obj5 == null) {
            if (obj2 != null && i4 == 207 && !Intrinsics.areEqual(obj2, asVar)) {
                this.magenta = Long.rotateLeft(Long.rotateLeft(this.magenta, 3) ^ obj2.hashCode(), 3) ^ i18;
                if (obj5 == null) {
                    this.mike++;
                }
                if (i5 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!this.lime) {
                    this.coral.kilo++;
                    j0 j0Var = this.cyan;
                    int i19 = j0Var.tango;
                    if (z2) {
                        j0Var.ivory(i4, asVar, asVar, true);
                    } else if (obj2 != null) {
                        if (obj5 == null) {
                            obj5 = asVar;
                        }
                        j0Var.ivory(i4, obj5, obj2, false);
                    } else {
                        if (obj5 == null) {
                            obj5 = asVar;
                        }
                        j0Var.ivory(i4, obj5, asVar, false);
                    }
                    H h11 = this.juliet;
                    if (h11 != null) {
                        int i20 = (-2) - i19;
                        ap apVar = new ap(-1, i4, i20, -1);
                        h11.echo.hotel(i20, new ai(-1, this.kilo - h11.bravo, 0));
                        h11.delta.add(apVar);
                    }
                    xray(z2, null);
                    return;
                }
                if (i5 == 1 && this.yankee) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.juliet == null) {
                    int golf = this.coral.golf();
                    if (!z10 && golf == i4) {
                        C0573f0 c0573f0 = this.coral;
                        int i21 = c0573f0.golf;
                        if (i21 < c0573f0.hotel) {
                            obj4 = c0573f0.papa(i21, c0573f0.bravo);
                        } else {
                            obj4 = null;
                        }
                        if (Intrinsics.areEqual(obj5, obj4)) {
                            plum(obj2, z2);
                        }
                    }
                    C0573f0 c0573f02 = this.coral;
                    c0573f02.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (c0573f02.kilo > 0) {
                        i10 = -1;
                    } else {
                        int i22 = c0573f02.golf;
                        i10 = -1;
                        while (i22 < c0573f02.hotel) {
                            int i23 = i22 * 5;
                            int[] iArr = c0573f02.bravo;
                            int i24 = iArr[i23];
                            Object papa = c0573f02.papa(i22, iArr);
                            int i25 = iArr[i23 + 1];
                            if ((i25 & 1073741824) != 0) {
                                i17 = 1;
                            } else {
                                i17 = i25 & 67108863;
                            }
                            arrayList.add(new ap(papa, i24, i22, i17));
                            i22 += iArr[i23 + 3];
                        }
                    }
                    this.juliet = new H(this.kilo, arrayList);
                    h4 = this.juliet;
                    if (h4 != null) {
                        if (obj5 != null) {
                            valueOf = new ao(Integer.valueOf(i4), obj5);
                        } else {
                            valueOf = Integer.valueOf(i4);
                        }
                        bv.al alVar = ((J.a) h4.foxtrot.getValue()).alpha;
                        Object golf2 = alVar.golf(valueOf);
                        if (golf2 == null) {
                            obj3 = null;
                        } else if (golf2 instanceof bv.ah) {
                            bv.ah ahVar = (bv.ah) golf2;
                            obj3 = ahVar.kilo(0);
                            if (ahVar.delta()) {
                                alVar.kilo(valueOf);
                            }
                            if (ahVar.bravo == 1) {
                                alVar.mike(valueOf, ahVar.alpha());
                            }
                        } else {
                            alVar.kilo(valueOf);
                            obj3 = golf2;
                        }
                        ap apVar2 = (ap) obj3;
                        ArrayList arrayList2 = h4.delta;
                        bv.aa aaVar = h4.echo;
                        int i26 = h4.bravo;
                        if (!z10 && apVar2 != null) {
                            arrayList2.add(apVar2);
                            int i27 = apVar2.charlie;
                            ai aiVar = (ai) aaVar.bravo(i27);
                            if (aiVar != null) {
                                i12 = aiVar.bravo;
                            } else {
                                i12 = i10;
                            }
                            this.kilo = i12 + i26;
                            ai aiVar2 = (ai) aaVar.bravo(i27);
                            if (aiVar2 != null) {
                                i13 = aiVar2.alpha;
                            } else {
                                i13 = i10;
                            }
                            int i28 = h4.charlie;
                            int i29 = i13 - i28;
                            int i30 = 8;
                            if (i13 > i28) {
                                Object[] objArr3 = aaVar.charlie;
                                long[] jArr = aaVar.alpha;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j6 = jArr[i31];
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j6 & 255) < 128) {
                                                    i16 = i30;
                                                    ai aiVar3 = (ai) objArr3[(i31 << 3) + i33];
                                                    i15 = i29;
                                                    int i34 = aiVar3.alpha;
                                                    if (i34 == i13) {
                                                        aiVar3.alpha = i28;
                                                    } else if (i28 <= i34 && i34 < i13) {
                                                        aiVar3.alpha = i34 + 1;
                                                    }
                                                } else {
                                                    i15 = i29;
                                                    i16 = i30;
                                                }
                                                j6 >>= i16;
                                                i33++;
                                                i29 = i15;
                                                i30 = i16;
                                            }
                                            i14 = i29;
                                            if (i32 != i30) {
                                                break;
                                            }
                                        } else {
                                            i14 = i29;
                                        }
                                        if (i31 == length) {
                                            break;
                                        }
                                        i31++;
                                        i29 = i14;
                                        i30 = 8;
                                    }
                                } else {
                                    i14 = i29;
                                }
                            } else {
                                i14 = i29;
                                if (i28 > i13) {
                                    Object[] objArr4 = aaVar.charlie;
                                    long[] jArr2 = aaVar.alpha;
                                    int length2 = jArr2.length - 2;
                                    if (length2 >= 0) {
                                        int i35 = 0;
                                        while (true) {
                                            long j7 = jArr2[i35];
                                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                                int i37 = 0;
                                                while (i37 < i36) {
                                                    if ((j7 & 255) < 128) {
                                                        ai aiVar4 = (ai) objArr4[(i35 << 3) + i37];
                                                        int i38 = aiVar4.alpha;
                                                        if (i38 == i13) {
                                                            aiVar4.alpha = i28;
                                                        } else {
                                                            objArr2 = objArr4;
                                                            if (i13 + 1 <= i38 && i38 < i28) {
                                                                aiVar4.alpha = i38 - 1;
                                                            }
                                                            j7 >>= 8;
                                                            i37++;
                                                            objArr4 = objArr2;
                                                        }
                                                    }
                                                    objArr2 = objArr4;
                                                    j7 >>= 8;
                                                    i37++;
                                                    objArr4 = objArr2;
                                                }
                                                objArr = objArr4;
                                                if (i36 != 8) {
                                                    break;
                                                }
                                            } else {
                                                objArr = objArr4;
                                            }
                                            if (i35 == length2) {
                                                break;
                                            }
                                            i35++;
                                            objArr4 = objArr;
                                        }
                                    }
                                }
                            }
                            I.b bVar = this.gray;
                            int i39 = bVar.foxtrot;
                            C0585q c0585q = bVar.alpha;
                            bVar.foxtrot = (i27 - c0585q.coral.golf) + i39;
                            this.coral.romeo(i27);
                            if (i14 > 0) {
                                bVar.echo(false);
                                C0573f0 c0573f03 = c0585q.coral;
                                if (c0573f03.charlie > 0) {
                                    int i40 = c0573f03.india;
                                    al alVar2 = bVar.delta;
                                    if (alVar2.alpha(-2) != i40) {
                                        if (!bVar.charlie && bVar.echo) {
                                            bVar.echo(false);
                                            I.a aVar = bVar.bravo;
                                            aVar.getClass();
                                            aVar.alpha.foxtrot(I.q.delta);
                                            bVar.charlie = true;
                                        }
                                        if (i40 > 0) {
                                            C0562a alpha = c0573f03.alpha(i40);
                                            alVar2.charlie(i40);
                                            bVar.echo(false);
                                            I.a aVar2 = bVar.bravo;
                                            aVar2.getClass();
                                            I.p pVar = I.p.delta;
                                            I.am amVar = aVar2.alpha;
                                            amVar.foxtrot(pVar);
                                            AbstractC2777t5.bravo(amVar, 0, alpha);
                                            bVar.charlie = true;
                                        }
                                    }
                                }
                                I.a aVar3 = bVar.bravo;
                                aVar3.getClass();
                                I.u uVar = I.u.delta;
                                I.am amVar2 = aVar3.alpha;
                                amVar2.foxtrot(uVar);
                                amVar2.charlie[amVar2.delta - amVar2.alpha[amVar2.bravo - 1].bravo] = i14;
                            }
                            plum(obj2, z2);
                        } else {
                            this.coral.kilo++;
                            this.lime = true;
                            this.fuchsia = null;
                            if (this.cyan.whiskey) {
                                j0 hotel = this.crimson.hotel();
                                this.cyan = hotel;
                                hotel.gold();
                                this.emerald = false;
                                this.fuchsia = null;
                            }
                            this.cyan.delta();
                            j0 j0Var2 = this.cyan;
                            int i41 = j0Var2.tango;
                            if (z2) {
                                j0Var2.ivory(i4, asVar, asVar, true);
                            } else if (obj2 != null) {
                                if (obj5 == null) {
                                    obj5 = asVar;
                                }
                                j0Var2.ivory(i4, obj5, obj2, false);
                            } else {
                                if (obj5 == null) {
                                    obj5 = asVar;
                                }
                                j0Var2.ivory(i4, obj5, asVar, false);
                            }
                            this.green = this.cyan.bravo(i41);
                            int i42 = (-2) - i41;
                            int i43 = i10;
                            ap apVar3 = new ap(Integer.valueOf(i10), i4, i42, i43);
                            aaVar.hotel(i42, new ai(i43, this.kilo - i26, 0));
                            arrayList2.add(apVar3);
                            ArrayList arrayList3 = new ArrayList();
                            if (z2) {
                                i11 = 0;
                            } else {
                                i11 = this.kilo;
                            }
                            h10 = new H(i11, arrayList3);
                            xray(z2, h10);
                            return;
                        }
                    }
                    h10 = null;
                    xray(z2, h10);
                    return;
                }
                i10 = -1;
                h4 = this.juliet;
                if (h4 != null) {
                }
                h10 = null;
                xray(z2, h10);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.magenta, 3) ^ i4, 3);
            j5 = i18;
        } else {
            if (obj5 instanceof Enum) {
                hashCode = ((Enum) obj5).ordinal();
            } else {
                hashCode = obj5.hashCode();
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.magenta, 3) ^ hashCode, 3);
            j5 = 0;
        }
        this.magenta = rotateLeft ^ j5;
        if (obj5 == null) {
        }
        if (i5 == 0) {
        }
        if (!this.lime) {
        }
    }

    public final void orange() {
        olive(-127, 0, null, null);
    }

    public final void oscar(bv.al alVar, Xd.l lVar) {
        ArrayList arrayList = this.sierra;
        if (this.bronze) {
            r.charlie("Reentrant composition is not supported");
        }
        this.golf.alpha();
        Trace.beginSection("Compose:recompose");
        try {
            long golf = S.n.kilo().golf();
            this.azure = (int) (golf ^ (golf >>> 32));
            this.victor = null;
            b(alVar);
            this.kilo = 0;
            this.bronze = true;
            try {
                yellow();
                Object cyan = cyan();
                if (cyan != lVar && lVar != null) {
                    Xd.l lVar2 = lVar;
                    g(lVar);
                }
                S.v vVar = this.black;
                J.e oscar = C0564b.oscar();
                try {
                    oscar.bravo(vVar);
                    az azVar = r.alpha;
                    if (lVar != null) {
                        peach(200, azVar);
                        P.e.delta(this, lVar);
                        quebec(false);
                    } else if (this.whiskey && cyan != null && !Intrinsics.areEqual(cyan, C0580l.alpha)) {
                        peach(200, azVar);
                        kotlin.jvm.internal.x.echo(2, cyan);
                        P.e.delta(this, (Xd.l) cyan);
                        quebec(false);
                    } else {
                        maroon();
                    }
                    oscar.mike(oscar.red - 1);
                    whiskey();
                    this.bronze = false;
                    arrayList.clear();
                    if (!this.cyan.whiskey) {
                        r.charlie("Check failed");
                    }
                    yankee();
                } catch (Throwable th) {
                    oscar.mike(oscar.red - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void papa(int i4, int i5) {
        if (i4 > 0 && i4 != i5) {
            papa(this.coral.quebec(i4), i5);
            if (this.coral.lima(i4)) {
                Object november = this.coral.november(i4);
                I.b bVar = this.gray;
                bVar.delta();
                bVar.hotel.add(november);
            }
        }
    }

    public final void peach(int i4, az azVar) {
        olive(i4, 0, azVar, null);
    }

    public final void pink(int i4, Object obj) {
        olive(i4, 0, obj, null);
    }

    public final void plum(Object obj, boolean z2) {
        if (z2) {
            C0573f0 c0573f0 = this.coral;
            if (c0573f0.kilo <= 0) {
                if ((c0573f0.bravo[(c0573f0.golf * 5) + 1] & 1073741824) == 0) {
                    J.alpha("Expected a node group");
                }
                c0573f0.uniform();
                return;
            }
            return;
        }
        if (obj != null && this.coral.foxtrot() != obj) {
            I.b bVar = this.gray;
            bVar.getClass();
            bVar.echo(false);
            I.a aVar = bVar.bravo;
            aVar.getClass();
            I.af afVar = I.af.delta;
            I.am amVar = aVar.alpha;
            amVar.foxtrot(afVar);
            AbstractC2777t5.bravo(amVar, 0, obj);
        }
        this.coral.uniform();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if ((r0.bravo[(r4 * 5) + 1] & 536870912) != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void purple(int i4) {
        int i5;
        if (this.juliet != null) {
            olive(i4, 0, null, null);
            return;
        }
        if (this.romeo) {
            r.charlie("A call to createNode(), emitNode() or useNode() expected");
        }
        this.magenta = Long.rotateLeft(Long.rotateLeft(this.magenta, 3) ^ i4, 3) ^ this.mike;
        this.mike++;
        C0573f0 c0573f0 = this.coral;
        boolean z2 = this.lime;
        as asVar = C0580l.alpha;
        if (z2) {
            c0573f0.kilo++;
            this.cyan.ivory(i4, asVar, asVar, false);
            xray(false, null);
            return;
        }
        if (c0573f0.golf() == i4) {
            int i10 = c0573f0.golf;
            if (i10 < c0573f0.hotel) {
            }
            c0573f0.uniform();
            xray(false, null);
            return;
        }
        if (c0573f0.kilo <= 0 && (i5 = c0573f0.golf) != c0573f0.hotel) {
            int i11 = this.kilo;
            green();
            this.gray.foxtrot(i11, c0573f0.sierra());
            r.alpha(this.sierra, i5, c0573f0.golf);
        }
        c0573f0.kilo++;
        this.lime = true;
        this.fuchsia = null;
        if (this.cyan.whiskey) {
            j0 hotel = this.crimson.hotel();
            this.cyan = hotel;
            hotel.gold();
            this.emerald = false;
            this.fuchsia = null;
        }
        j0 j0Var = this.cyan;
        j0Var.delta();
        int i12 = j0Var.tango;
        j0Var.ivory(i4, asVar, asVar, false);
        this.green = j0Var.bravo(i12);
        xray(false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05bf  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void quebec(boolean z2) {
        int hashCode;
        long rotateRight;
        al alVar;
        ArrayList arrayList;
        int i4;
        boolean z10;
        int i5;
        C0573f0 c0573f0;
        H h4;
        ?? r62;
        int i10;
        H h10;
        ArrayList arrayList2;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        LinkedHashSet linkedHashSet;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        long[] jArr;
        int i17;
        Object[] objArr2;
        long[] jArr2;
        int i18;
        Object[] objArr3;
        long[] jArr3;
        int i19;
        Object[] objArr4;
        long[] jArr4;
        int i20;
        int hashCode2;
        long rotateRight2;
        al alVar2 = this.november;
        int i21 = alVar2.alpha[alVar2.bravo - 2] - 1;
        boolean z11 = this.lime;
        as asVar = C0580l.alpha;
        if (z11) {
            j0 j0Var = this.cyan;
            int i22 = j0Var.victor;
            int i23 = j0Var.bravo[j0Var.romeo(i22) * 5];
            Object sierra = this.cyan.sierra(i22);
            Object quebec = this.cyan.quebec(i22);
            if (sierra == null) {
                if (quebec != null && i23 == 207 && !Intrinsics.areEqual(quebec, asVar)) {
                    this.magenta = Long.rotateRight(quebec.hashCode() ^ Long.rotateRight(this.magenta ^ i21, 3), 3);
                } else {
                    rotateRight2 = i23 ^ Long.rotateRight(this.magenta ^ i21, 3);
                }
            } else {
                if (sierra instanceof Enum) {
                    hashCode2 = ((Enum) sierra).ordinal();
                } else {
                    hashCode2 = sierra.hashCode();
                }
                rotateRight2 = Long.rotateRight(this.magenta ^ 0, 3) ^ hashCode2;
            }
            this.magenta = Long.rotateRight(rotateRight2, 3);
        } else {
            C0573f0 c0573f02 = this.coral;
            int i24 = c0573f02.india;
            int india = c0573f02.india(i24);
            C0573f0 c0573f03 = this.coral;
            Object papa = c0573f03.papa(i24, c0573f03.bravo);
            C0573f0 c0573f04 = this.coral;
            Object bravo = c0573f04.bravo(i24, c0573f04.bravo);
            if (papa == null) {
                if (bravo != null && india == 207 && !Intrinsics.areEqual(bravo, asVar)) {
                    this.magenta = Long.rotateRight(bravo.hashCode() ^ Long.rotateRight(this.magenta ^ i21, 3), 3);
                } else {
                    rotateRight = india ^ Long.rotateRight(this.magenta ^ i21, 3);
                }
            } else {
                if (papa instanceof Enum) {
                    hashCode = ((Enum) papa).ordinal();
                } else {
                    hashCode = papa.hashCode();
                }
                rotateRight = Long.rotateRight(this.magenta ^ 0, 3) ^ hashCode;
            }
            this.magenta = Long.rotateRight(rotateRight, 3);
        }
        int i25 = this.lima;
        H h11 = this.juliet;
        ArrayList arrayList5 = this.sierra;
        I.b bVar = this.gray;
        if (h11 != null) {
            ArrayList arrayList6 = h11.alpha;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = h11.delta;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i26 = 0; i26 < size; i26++) {
                    hashSet2.add(arrayList7.get(i26));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                i4 = -1;
                while (i28 < size3) {
                    ap apVar = (ap) arrayList6.get(i28);
                    boolean contains = hashSet2.contains(apVar);
                    al alVar3 = alVar2;
                    bv.aa aaVar = h11.echo;
                    int i30 = i28;
                    int i31 = h11.bravo;
                    if (!contains) {
                        ai aiVar = (ai) aaVar.bravo(apVar.charlie);
                        if (aiVar != null) {
                            i20 = aiVar.bravo;
                        } else {
                            i20 = -1;
                        }
                        bVar.foxtrot(i20 + i31, apVar.delta);
                        int i32 = apVar.charlie;
                        h11.alpha(i32, 0);
                        bVar.foxtrot = (i32 - bVar.alpha.coral.golf) + bVar.foxtrot;
                        this.coral.romeo(i32);
                        green();
                        this.coral.sierra();
                        r.alpha(arrayList5, i32, this.coral.bravo[(i32 * 5) + 3] + i32);
                    } else if (!linkedHashSet2.contains(apVar)) {
                        if (i29 < size2) {
                            ap apVar2 = (ap) arrayList7.get(i29);
                            if (apVar2 != apVar) {
                                ai aiVar2 = (ai) aaVar.bravo(apVar2.charlie);
                                if (aiVar2 != null) {
                                    i15 = aiVar2.bravo;
                                } else {
                                    i15 = -1;
                                }
                                linkedHashSet2.add(apVar2);
                                h10 = h11;
                                if (i15 != i27) {
                                    ai aiVar3 = (ai) aaVar.bravo(apVar2.charlie);
                                    if (aiVar3 != null) {
                                        i16 = aiVar3.charlie;
                                    } else {
                                        i16 = apVar2.delta;
                                    }
                                    i11 = i29;
                                    int i33 = i15 + i31;
                                    arrayList3 = arrayList6;
                                    int i34 = i27 + i31;
                                    if (i16 > 0) {
                                        arrayList4 = arrayList7;
                                        int i35 = bVar.lima;
                                        if (i35 > 0) {
                                            hashSet = hashSet2;
                                            if (bVar.juliet == i33 - i35 && bVar.kilo == i34 - i35) {
                                                bVar.lima = i35 + i16;
                                            }
                                        } else {
                                            hashSet = hashSet2;
                                        }
                                        bVar.delta();
                                        bVar.juliet = i33;
                                        bVar.kilo = i34;
                                        bVar.lima = i16;
                                    } else {
                                        arrayList4 = arrayList7;
                                        hashSet = hashSet2;
                                        bVar.getClass();
                                    }
                                    if (i15 > i27) {
                                        Object[] objArr5 = aaVar.charlie;
                                        long[] jArr5 = aaVar.alpha;
                                        int length = jArr5.length - 2;
                                        if (length >= 0) {
                                            linkedHashSet = linkedHashSet2;
                                            i12 = size2;
                                            int i36 = 0;
                                            while (true) {
                                                long j5 = jArr5[i36];
                                                int i37 = i16;
                                                arrayList2 = arrayList5;
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i38 = 8 - ((~(i36 - length)) >>> 31);
                                                    int i39 = 0;
                                                    while (i39 < i38) {
                                                        if ((j5 & 255) < 128) {
                                                            i19 = i39;
                                                            ai aiVar4 = (ai) objArr5[(i36 << 3) + i39];
                                                            objArr4 = objArr5;
                                                            int i40 = aiVar4.bravo;
                                                            jArr4 = jArr5;
                                                            if (i15 <= i40 && i40 < i15 + i37) {
                                                                aiVar4.bravo = (i40 - i15) + i27;
                                                            } else if (i27 <= i40 && i40 < i15) {
                                                                aiVar4.bravo = i40 + i37;
                                                            }
                                                        } else {
                                                            i19 = i39;
                                                            objArr4 = objArr5;
                                                            jArr4 = jArr5;
                                                        }
                                                        j5 >>= 8;
                                                        i39 = i19 + 1;
                                                        objArr5 = objArr4;
                                                        jArr5 = jArr4;
                                                    }
                                                    objArr3 = objArr5;
                                                    jArr3 = jArr5;
                                                    if (i38 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr3 = objArr5;
                                                    jArr3 = jArr5;
                                                }
                                                if (i36 == length) {
                                                    break;
                                                }
                                                i36++;
                                                arrayList5 = arrayList2;
                                                i16 = i37;
                                                objArr5 = objArr3;
                                                jArr5 = jArr3;
                                            }
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                    } else {
                                        int i41 = i16;
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i12 = size2;
                                        if (i27 > i15) {
                                            Object[] objArr6 = aaVar.charlie;
                                            long[] jArr6 = aaVar.alpha;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                int i42 = 0;
                                                while (true) {
                                                    long j6 = jArr6[i42];
                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i43 = 8 - ((~(i42 - length2)) >>> 31);
                                                        int i44 = 0;
                                                        while (i44 < i43) {
                                                            if ((j6 & 255) < 128) {
                                                                objArr2 = objArr6;
                                                                ai aiVar5 = (ai) objArr6[(i42 << 3) + i44];
                                                                jArr2 = jArr6;
                                                                int i45 = aiVar5.bravo;
                                                                i18 = i15;
                                                                if (i15 <= i45 && i45 < i18 + i41) {
                                                                    aiVar5.bravo = (i45 - i18) + i27;
                                                                } else if (i18 + 1 <= i45 && i45 < i27) {
                                                                    aiVar5.bravo = i45 - i41;
                                                                }
                                                            } else {
                                                                objArr2 = objArr6;
                                                                jArr2 = jArr6;
                                                                i18 = i15;
                                                            }
                                                            j6 >>= 8;
                                                            i44++;
                                                            jArr6 = jArr2;
                                                            objArr6 = objArr2;
                                                            i15 = i18;
                                                        }
                                                        objArr = objArr6;
                                                        jArr = jArr6;
                                                        i17 = i15;
                                                        if (i43 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr = objArr6;
                                                        jArr = jArr6;
                                                        i17 = i15;
                                                    }
                                                    if (i42 == length2) {
                                                        break;
                                                    }
                                                    i42++;
                                                    jArr6 = jArr;
                                                    objArr6 = objArr;
                                                    i15 = i17;
                                                }
                                            }
                                        }
                                    }
                                    i13 = i30;
                                } else {
                                    arrayList2 = arrayList5;
                                    i11 = i29;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                }
                                linkedHashSet = linkedHashSet2;
                                i12 = size2;
                                i13 = i30;
                            } else {
                                h10 = h11;
                                arrayList2 = arrayList5;
                                i11 = i29;
                                arrayList3 = arrayList6;
                                arrayList4 = arrayList7;
                                hashSet = hashSet2;
                                linkedHashSet = linkedHashSet2;
                                i12 = size2;
                                i13 = i30 + 1;
                            }
                            i29 = i11 + 1;
                            ai aiVar6 = (ai) aaVar.bravo(apVar2.charlie);
                            if (aiVar6 != null) {
                                i14 = aiVar6.charlie;
                            } else {
                                i14 = apVar2.delta;
                            }
                            i27 += i14;
                            i28 = i13;
                            arrayList7 = arrayList4;
                            alVar2 = alVar3;
                            h11 = h10;
                            arrayList6 = arrayList3;
                            hashSet2 = hashSet;
                            linkedHashSet2 = linkedHashSet;
                            size2 = i12;
                            arrayList5 = arrayList2;
                        } else {
                            alVar2 = alVar3;
                            i28 = i30;
                        }
                    }
                    i28 = i30 + 1;
                    alVar2 = alVar3;
                }
                alVar = alVar2;
                arrayList = arrayList5;
                bVar.delta();
                if (arrayList6.size() > 0) {
                    C0573f0 c0573f05 = this.coral;
                    bVar.foxtrot = (c0573f05.hotel - bVar.alpha.coral.golf) + bVar.foxtrot;
                    c0573f05.tango();
                }
                z10 = this.lime;
                if (!z10) {
                    C0573f0 c0573f06 = this.coral;
                    int i46 = c0573f06.mike - c0573f06.lima;
                    if (i46 > 0) {
                        if (i46 > 0) {
                            bVar.echo(false);
                            C0573f0 c0573f07 = bVar.alpha.coral;
                            if (c0573f07.charlie > 0) {
                                int i47 = c0573f07.india;
                                al alVar4 = bVar.delta;
                                if (alVar4.alpha(-2) != i47) {
                                    if (!bVar.charlie && bVar.echo) {
                                        bVar.echo(false);
                                        I.a aVar = bVar.bravo;
                                        aVar.getClass();
                                        aVar.alpha.foxtrot(I.q.delta);
                                        bVar.charlie = true;
                                    }
                                    if (i47 > 0) {
                                        C0562a alpha = c0573f07.alpha(i47);
                                        alVar4.charlie(i47);
                                        bVar.echo(false);
                                        I.a aVar2 = bVar.bravo;
                                        aVar2.getClass();
                                        I.p pVar = I.p.delta;
                                        I.am amVar = aVar2.alpha;
                                        amVar.foxtrot(pVar);
                                        AbstractC2777t5.bravo(amVar, 0, alpha);
                                        bVar.charlie = true;
                                    }
                                }
                            }
                            I.a aVar3 = bVar.bravo;
                            aVar3.getClass();
                            I.ae aeVar = I.ae.delta;
                            I.am amVar2 = aVar3.alpha;
                            amVar2.foxtrot(aeVar);
                            amVar2.charlie[amVar2.delta - amVar2.alpha[amVar2.bravo - 1].bravo] = i46;
                        } else {
                            bVar.getClass();
                        }
                    }
                }
                i5 = this.kilo;
                while (true) {
                    c0573f0 = this.coral;
                    if (c0573f0.kilo > 0 && (i10 = c0573f0.golf) != c0573f0.hotel) {
                        green();
                        bVar.foxtrot(i5, this.coral.sierra());
                        ArrayList arrayList8 = arrayList;
                        r.alpha(arrayList8, i10, this.coral.golf);
                        i4 = i4;
                        arrayList = arrayList8;
                    }
                }
                if (!z10) {
                    if (z2) {
                        I.c cVar = this.indigo;
                        I.am amVar3 = cVar.bravo;
                        if (!amVar3.echo()) {
                            r.charlie("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        I.aj[] ajVarArr = amVar3.alpha;
                        int i48 = amVar3.bravo - 1;
                        amVar3.bravo = i48;
                        I.aj ajVar = ajVarArr[i48];
                        ajVarArr[i48] = null;
                        I.am amVar4 = cVar.alpha;
                        amVar4.foxtrot(ajVar);
                        Object[] objArr7 = amVar3.echo;
                        Object[] objArr8 = amVar4.echo;
                        int i49 = amVar4.foxtrot;
                        int i50 = ajVar.charlie;
                        int i51 = amVar3.foxtrot;
                        int i52 = i51 - i50;
                        System.arraycopy(objArr7, i52, objArr8, i49 - i50, i51 - i52);
                        Object[] objArr9 = amVar3.echo;
                        int i53 = amVar3.foxtrot;
                        Arrays.fill(objArr9, i53 - i50, i53, (Object) null);
                        int[] iArr = amVar3.charlie;
                        int[] iArr2 = amVar4.charlie;
                        int i54 = amVar4.delta;
                        int i55 = ajVar.bravo;
                        int i56 = amVar3.delta;
                        ArraysKt.zulu(i54 - i55, i56 - i55, iArr, iArr2, i56);
                        amVar3.foxtrot -= i50;
                        amVar3.delta -= i55;
                        i25 = 1;
                    }
                    if (this.coral.kilo <= 0) {
                        J.alpha("Unbalanced begin/end empty");
                    }
                    r4.kilo--;
                    j0 j0Var2 = this.cyan;
                    int i57 = j0Var2.victor;
                    j0Var2.juliet();
                    if (this.coral.kilo <= 0) {
                        int i58 = (-2) - i57;
                        this.cyan.kilo();
                        this.cyan.echo(true);
                        C0562a c0562a = this.green;
                        if (this.indigo.alpha.delta()) {
                            C0575g0 c0575g0 = this.crimson;
                            bVar.charlie();
                            bVar.echo(false);
                            C0573f0 c0573f08 = bVar.alpha.coral;
                            if (c0573f08.charlie > 0) {
                                int i59 = c0573f08.india;
                                al alVar5 = bVar.delta;
                                if (alVar5.alpha(-2) != i59) {
                                    if (!bVar.charlie && bVar.echo) {
                                        bVar.echo(false);
                                        I.a aVar4 = bVar.bravo;
                                        aVar4.getClass();
                                        aVar4.alpha.foxtrot(I.q.delta);
                                        bVar.charlie = true;
                                    }
                                    if (i59 > 0) {
                                        C0562a alpha2 = c0573f08.alpha(i59);
                                        alVar5.charlie(i59);
                                        bVar.echo(false);
                                        I.a aVar5 = bVar.bravo;
                                        aVar5.getClass();
                                        I.p pVar2 = I.p.delta;
                                        I.am amVar5 = aVar5.alpha;
                                        amVar5.foxtrot(pVar2);
                                        AbstractC2777t5.bravo(amVar5, 0, alpha2);
                                        bVar.charlie = true;
                                    }
                                }
                            }
                            bVar.delta();
                            I.a aVar6 = bVar.bravo;
                            aVar6.getClass();
                            I.s sVar = I.s.delta;
                            I.am amVar6 = aVar6.alpha;
                            amVar6.foxtrot(sVar);
                            AbstractC2777t5.charlie(amVar6, 0, c0562a, 1, c0575g0);
                            r62 = 0;
                        } else {
                            C0575g0 c0575g02 = this.crimson;
                            I.c cVar2 = this.indigo;
                            bVar.charlie();
                            bVar.echo(false);
                            C0573f0 c0573f09 = bVar.alpha.coral;
                            if (c0573f09.charlie > 0) {
                                int i60 = c0573f09.india;
                                al alVar6 = bVar.delta;
                                if (alVar6.alpha(-2) != i60) {
                                    if (!bVar.charlie && bVar.echo) {
                                        bVar.echo(false);
                                        I.a aVar7 = bVar.bravo;
                                        aVar7.getClass();
                                        aVar7.alpha.foxtrot(I.q.delta);
                                        bVar.charlie = true;
                                    }
                                    if (i60 > 0) {
                                        C0562a alpha3 = c0573f09.alpha(i60);
                                        alVar6.charlie(i60);
                                        bVar.echo(false);
                                        I.a aVar8 = bVar.bravo;
                                        aVar8.getClass();
                                        I.p pVar3 = I.p.delta;
                                        I.am amVar7 = aVar8.alpha;
                                        amVar7.foxtrot(pVar3);
                                        AbstractC2777t5.bravo(amVar7, 0, alpha3);
                                        bVar.charlie = true;
                                    }
                                }
                            }
                            bVar.delta();
                            I.a aVar9 = bVar.bravo;
                            aVar9.getClass();
                            I.t tVar = I.t.delta;
                            I.am amVar8 = aVar9.alpha;
                            amVar8.foxtrot(tVar);
                            int i61 = amVar8.foxtrot - amVar8.alpha[amVar8.bravo - 1].charlie;
                            Object[] objArr10 = amVar8.echo;
                            objArr10[i61] = c0562a;
                            objArr10[i61 + 1] = c0575g02;
                            objArr10[i61 + 2] = cVar2;
                            this.indigo = new I.c();
                            r62 = 0;
                        }
                        this.lime = r62;
                        if (this.charlie.purple != 0) {
                            c(i58, r62);
                            d(i58, i25);
                        }
                    }
                } else {
                    if (z2) {
                        bVar.bravo();
                    }
                    int i62 = bVar.alpha.coral.india;
                    al alVar7 = bVar.delta;
                    int i63 = i4;
                    if (alVar7.alpha(i63) > i62) {
                        r.charlie("Missed recording an endGroup");
                    }
                    if (alVar7.alpha(i63) == i62) {
                        bVar.echo(false);
                        alVar7.bravo();
                        I.a aVar10 = bVar.bravo;
                        aVar10.getClass();
                        aVar10.alpha.foxtrot(I.m.delta);
                    }
                    int i64 = this.coral.india;
                    if (i25 != h(i64)) {
                        d(i64, i25);
                    }
                    if (z2) {
                        i25 = 1;
                    }
                    this.coral.echo();
                    bVar.delta();
                }
                h4 = (H) this.india.remove(r3.size() - 1);
                if (h4 != null && !z10) {
                    h4.charlie++;
                }
                this.juliet = h4;
                this.kilo = alVar.bravo() + i25;
                this.mike = alVar.bravo();
                this.lima = alVar.bravo() + i25;
            }
        }
        alVar = alVar2;
        arrayList = arrayList5;
        i4 = -1;
        z10 = this.lime;
        if (!z10) {
        }
        i5 = this.kilo;
        while (true) {
            c0573f0 = this.coral;
            if (c0573f0.kilo > 0) {
                break;
            }
            green();
            bVar.foxtrot(i5, this.coral.sierra());
            ArrayList arrayList82 = arrayList;
            r.alpha(arrayList82, i10, this.coral.golf);
            i4 = i4;
            arrayList = arrayList82;
        }
        if (!z10) {
        }
        h4 = (H) this.india.remove(r3.size() - 1);
        if (h4 != null) {
            h4.charlie++;
        }
        this.juliet = h4;
        this.kilo = alVar.bravo() + i25;
        this.mike = alVar.bravo();
        this.lima = alVar.bravo() + i25;
    }

    public final void red(int i4) {
        olive(i4, 0, null, null);
    }

    public final void romeo() {
        quebec(false);
        Q azure = azure();
        if (azure != null) {
            int i4 = azure.bravo;
            if ((i4 & 1) != 0) {
                azure.bravo = i4 | 2;
            }
        }
    }

    public final void sierra() {
        quebec(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0585q silver(int i4) {
        am amVar;
        Q q4;
        boolean z2;
        int i5;
        int i10;
        boolean z10;
        purple(i4);
        boolean z11 = this.lime;
        O7.j jVar = this.golf;
        ArrayList arrayList = this.blue;
        C0590w c0590w = this.hotel;
        if (z11) {
            Intrinsics.charlie(c0590w, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            Q q5 = new Q(c0590w);
            arrayList.add(q5);
            g(q5);
            q5.echo = this.azure;
            q5.bravo &= -17;
            jVar.alpha();
            return this;
        }
        ArrayList arrayList2 = this.sierra;
        int echo = r.echo(this.coral.india, arrayList2);
        if (echo >= 0) {
            amVar = (am) arrayList2.remove(echo);
        } else {
            amVar = null;
        }
        Object mike = this.coral.mike();
        if (Intrinsics.areEqual(mike, C0580l.alpha)) {
            Intrinsics.charlie(c0590w, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            q4 = new Q(c0590w);
            g(q4);
        } else {
            Intrinsics.charlie(mike, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            q4 = (Q) mike;
        }
        if (amVar == null) {
            int i11 = q4.bravo;
            if ((i11 & 64) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                q4.bravo = i11 & (-65);
            }
            if (!z10) {
                z2 = false;
                int i12 = q4.bravo;
                if (!z2) {
                    i5 = i12 | 8;
                } else {
                    i5 = i12 & (-9);
                }
                q4.bravo = i5;
                arrayList.add(q4);
                q4.echo = this.azure;
                q4.bravo &= -17;
                jVar.alpha();
                i10 = q4.bravo;
                if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                    q4.bravo = (i10 & (-257)) | 512;
                    I.a aVar = this.gray.bravo;
                    aVar.getClass();
                    I.ad adVar = I.ad.delta;
                    I.am amVar2 = aVar.alpha;
                    amVar2.foxtrot(adVar);
                    AbstractC2777t5.bravo(amVar2, 0, q4);
                    if (!this.yankee) {
                        int i13 = q4.bravo;
                        if ((i13 & 128) != 0) {
                            this.yankee = true;
                            q4.bravo = i13 | Barcode.FORMAT_UPC_E;
                        }
                    }
                }
                return this;
            }
        }
        z2 = true;
        int i122 = q4.bravo;
        if (!z2) {
        }
        q4.bravo = i5;
        arrayList.add(q4);
        q4.echo = this.azure;
        q4.bravo &= -17;
        jVar.alpha();
        i10 = q4.bravo;
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
        }
        return this;
    }

    public final void tango() {
        quebec(false);
    }

    public final void teal(Object obj) {
        if (!this.lime && this.coral.golf() == 207 && !Intrinsics.areEqual(this.coral.foxtrot(), obj) && this.zulu < 0) {
            this.zulu = this.coral.golf;
            this.yankee = true;
        }
        olive(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 0, null, obj);
    }

    public final Q uniform() {
        Q q4;
        Q q5;
        C0562a alpha;
        P p4;
        ArrayList arrayList = this.blue;
        if (!arrayList.isEmpty()) {
            q4 = (Q) arrayList.remove(arrayList.size() - 1);
        } else {
            q4 = null;
        }
        if (q4 != null) {
            q4.bravo &= -9;
            this.golf.alpha();
            int i4 = this.azure;
            bv.ag agVar = q4.foxtrot;
            if (agVar != null && (q4.bravo & 16) == 0) {
                Object[] objArr = agVar.bravo;
                int[] iArr = agVar.charlie;
                long[] jArr = agVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j5 = jArr[i5];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j5 & 255) < 128) {
                                    int i12 = (i5 << 3) + i11;
                                    Object obj = objArr[i12];
                                    if (iArr[i12] != i4) {
                                        p4 = new P(i4, 0, q4, agVar);
                                        break loop0;
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
                        }
                        i5++;
                    }
                }
            }
            p4 = null;
            I.b bVar = this.gray;
            if (p4 != null) {
                I.a aVar = bVar.bravo;
                aVar.getClass();
                I.l lVar = I.l.delta;
                I.am amVar = aVar.alpha;
                amVar.foxtrot(lVar);
                AbstractC2777t5.charlie(amVar, 0, p4, 1, this.hotel);
            }
            int i13 = q4.bravo;
            if ((i13 & 512) != 0) {
                q4.bravo = i13 & (-513);
                I.a aVar2 = bVar.bravo;
                aVar2.getClass();
                I.o oVar = I.o.delta;
                I.am amVar2 = aVar2.alpha;
                amVar2.foxtrot(oVar);
                AbstractC2777t5.bravo(amVar2, 0, q4);
                int i14 = q4.bravo;
                q4.bravo = i14 & (-129);
                if ((i14 & Barcode.FORMAT_UPC_E) != 0) {
                    q4.bravo = i14 & (-1153);
                    this.yankee = false;
                }
            }
        }
        if (q4 != null) {
            int i15 = q4.bravo;
            if ((i15 & 16) == 0 && ((i15 & 1) != 0 || this.quebec)) {
                if (q4.charlie == null) {
                    if (this.lime) {
                        j0 j0Var = this.cyan;
                        alpha = j0Var.bravo(j0Var.victor);
                    } else {
                        C0573f0 c0573f0 = this.coral;
                        alpha = c0573f0.alpha(c0573f0.india);
                    }
                    q4.charlie = alpha;
                }
                q4.bravo &= -5;
                q5 = q4;
                quebec(false);
                return q5;
            }
        }
        q5 = null;
        quebec(false);
        return q5;
    }

    public final void victor() {
        if (this.bronze || this.zulu != 100) {
            J.alpha("Cannot disable reuse from root if it was caused by other groups");
        }
        this.zulu = -1;
        this.yankee = false;
    }

    public final void whiskey() {
        boolean z2 = false;
        quebec(false);
        this.bravo.charlie();
        quebec(false);
        I.b bVar = this.gray;
        if (bVar.charlie) {
            bVar.echo(false);
            bVar.echo(false);
            I.a aVar = bVar.bravo;
            aVar.getClass();
            aVar.alpha.foxtrot(I.m.delta);
            bVar.charlie = false;
        }
        bVar.charlie();
        if (bVar.delta.bravo != 0) {
            r.charlie("Missed recording an endGroup()");
        }
        if (!this.india.isEmpty()) {
            r.charlie("Start/end imbalance");
        }
        juliet();
        this.coral.charlie();
        if (this.xray.bravo() != 0) {
            z2 = true;
        }
        this.whiskey = z2;
    }

    public final void white() {
        olive(125, 2, null, null);
        this.romeo = true;
    }

    public final void xray(boolean z2, H h4) {
        this.india.add(this.juliet);
        this.juliet = h4;
        int i4 = this.lima;
        al alVar = this.november;
        alVar.charlie(i4);
        alVar.charlie(this.mike);
        alVar.charlie(this.kilo);
        if (z2) {
            this.kilo = 0;
        }
        this.lima = 0;
        this.mike = 0;
    }

    public final void yankee() {
        C0575g0 c0575g0 = new C0575g0();
        if (this.beige) {
            c0575g0.bravo();
        }
        if (this.bravo.delta()) {
            c0575g0.f3006d = new bv.aa();
        }
        this.crimson = c0575g0;
        j0 hotel = c0575g0.hotel();
        hotel.echo(true);
        this.cyan = hotel;
    }

    public final void yellow() {
        this.mike = 0;
        this.coral = this.charlie.delta();
        olive(100, 0, null, null);
        AbstractC0587t abstractC0587t = this.bravo;
        abstractC0587t.romeo();
        I india = abstractC0587t.india();
        this.xray.charlie(this.whiskey ? 1 : 0);
        this.whiskey = golf(india);
        this.fuchsia = null;
        if (!this.quebec) {
            this.quebec = abstractC0587t.echo();
        }
        if (!this.beige) {
            this.beige = abstractC0587t.foxtrot();
        }
        if (this.beige) {
            E0 e02 = androidx.compose.runtime.tooling.d.alpha;
            Intrinsics.charlie(e02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            india = ((P.i) india).charlie(e02, new F0(black()));
        }
        this.uniform = india;
        Set set = (Set) C0564b.azure(india, androidx.compose.runtime.tooling.e.alpha);
        if (set != null) {
            C0589v c0589v = this.maroon;
            if (c0589v == null) {
                c0589v = new C0589v(this.hotel);
                this.maroon = c0589v;
            }
            set.add(c0589v);
            abstractC0587t.november(set);
        }
        long golf = abstractC0587t.golf();
        olive((int) (golf ^ (golf >>> 32)), 0, null, null);
    }

    public final InterfaceC0566c zulu() {
        return this.alpha;
    }
}
