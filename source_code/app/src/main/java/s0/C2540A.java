package s0;

import B9.C0058p;
import g.C1718a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.AbstractC2366B;
import t0.C2940t;
import t0.C2946x;

/* renamed from: s0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2540A {
    public final al alpha;
    public boolean charlie;
    public boolean delta;
    public Q0.a india;
    public final com.bumptech.glide.load.engine.h bravo = new com.bumptech.glide.load.engine.h(9);
    public final com.google.android.play.core.integrity.c echo = new com.google.android.play.core.integrity.c();
    public final J.e foxtrot = new J.e(new V[16]);
    public final long golf = 1;
    public final J.e hotel = new J.e(new az[16]);

    public C2540A(al alVar) {
        this.alpha = alVar;
    }

    public static boolean bravo(al alVar, Q0.a aVar) {
        Q0.a aVar2;
        boolean h4;
        al alVar2 = alVar.yellow;
        if (alVar2 == null) {
            return false;
        }
        ap apVar = alVar.f13306y;
        if (aVar != null) {
            if (alVar2 != null) {
                ay ayVar = apVar.quebec;
                Intrinsics.checkNotNull(ayVar);
                h4 = ayVar.h(aVar.alpha);
            }
            h4 = false;
        } else {
            ay ayVar2 = apVar.quebec;
            if (ayVar2 != null) {
                aVar2 = ayVar2.f13326g;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && alVar2 != null) {
                Intrinsics.checkNotNull(ayVar2);
                h4 = ayVar2.h(aVar2.alpha);
            }
            h4 = false;
        }
        al victor = alVar.victor();
        if (h4 && victor != null) {
            if (victor.yellow == null) {
                al.olive(victor, false, 3);
                return h4;
            }
            if (alVar.tango() == ai.alpha) {
                al.navy(victor, false, 3);
                return h4;
            }
            if (alVar.tango() == ai.purple) {
                victor.maroon(false);
            }
        }
        return h4;
    }

    public static boolean charlie(al alVar, Q0.a aVar) {
        boolean jade;
        if (aVar != null) {
            jade = alVar.ivory(aVar);
        } else {
            jade = al.jade(alVar);
        }
        al victor = alVar.victor();
        if (jade && victor != null) {
            if (alVar.sierra() == ai.alpha) {
                al.olive(victor, false, 3);
                return jade;
            }
            if (alVar.sierra() == ai.purple) {
                victor.ochre(false);
            }
        }
        return jade;
    }

    public static boolean hotel(al alVar) {
        ay ayVar;
        am amVar;
        if (alVar.f13306y.echo) {
            if (alVar.tango() != ai.red || ((ayVar = alVar.f13306y.quebec) != null && (amVar = ayVar.f13330k) != null && amVar.echo())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean india(al alVar) {
        ag agVar;
        if (!alVar.romeo()) {
            return false;
        }
        do {
            if (alVar.sierra() == ai.red && !alVar.f13306y.papa.f13231q.echo()) {
                al victor = alVar.victor();
                if (victor != null) {
                    agVar = victor.f13306y.delta;
                } else {
                    agVar = null;
                }
                if (agVar != ag.alpha) {
                    return false;
                }
            }
            alVar = alVar.victor();
            if (alVar == null) {
                return false;
            }
        } while (!alVar.emerald());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r4 < r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(boolean z2) {
        Object[] objArr;
        com.google.android.play.core.integrity.c cVar = this.echo;
        if (z2) {
            cVar.getClass();
            al alVar = this.alpha;
            if (alVar.f13281H > 0) {
                J.e eVar = (J.e) cVar.purple;
                eVar.india();
                eVar.bravo(alVar);
                alVar.f13280G = true;
            }
        }
        J.e eVar2 = (J.e) cVar.purple;
        int i4 = eVar2.red;
        if (i4 != 0) {
            ArraysKt.plum(eVar2.alpha, S.purple, 0, i4);
            int i5 = eVar2.red;
            al[] alVarArr = (al[]) cVar.red;
            if (alVarArr != null) {
                int length = alVarArr.length;
                objArr = alVarArr;
            }
            objArr = new al[Math.max(16, i5)];
            cVar.red = null;
            for (int i10 = 0; i10 < i5; i10++) {
                objArr[i10] = eVar2.alpha[i10];
            }
            eVar2.india();
            for (int i11 = i5 - 1; -1 < i11; i11--) {
                al alVar2 = objArr[i11];
                Intrinsics.checkNotNull(alVar2);
                if (alVar2.f13280G) {
                    com.google.android.play.core.integrity.c.charlie(alVar2);
                }
                objArr[i11] = 0;
            }
            cVar.red = objArr;
        }
    }

    public final void delta() {
        J.e eVar = this.hotel;
        int i4 = eVar.red;
        if (i4 != 0) {
            Object[] objArr = eVar.alpha;
            for (int i5 = 0; i5 < i4; i5++) {
                az azVar = (az) objArr[i5];
                if (azVar.alpha.cyan()) {
                    boolean z2 = azVar.bravo;
                    boolean z10 = azVar.charlie;
                    al alVar = azVar.alpha;
                    if (!z2) {
                        al.olive(alVar, z10, 2);
                    } else {
                        al.navy(alVar, z10, 2);
                    }
                }
            }
            eVar.india();
        }
    }

    public final void echo(al alVar) {
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (Intrinsics.areEqual(alVar2.fuchsia(), Boolean.TRUE) && !alVar2.f13282I) {
                if (this.bravo.foxtrot(alVar2)) {
                    alVar2.gold();
                }
                echo(alVar2);
            }
        }
    }

    public final void foxtrot(al alVar, boolean z2) {
        boolean romeo;
        if (!this.charlie) {
            AbstractC2264a.bravo("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z2) {
            romeo = alVar.f13306y.echo;
        } else {
            romeo = alVar.romeo();
        }
        if (romeo) {
            AbstractC2264a.alpha("node not yet measured");
        }
        golf(alVar, z2);
    }

    public final void golf(al alVar, boolean z2) {
        boolean romeo;
        ay ayVar;
        am amVar;
        boolean romeo2;
        boolean romeo3;
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if ((!z2 && (alVar2.sierra() == ai.alpha || alVar2.f13306y.papa.f13231q.echo())) || (z2 && (alVar2.tango() == ai.alpha || ((ayVar = alVar2.f13306y.quebec) != null && (amVar = ayVar.f13330k) != null && amVar.echo())))) {
                boolean mike = AbstractC2557q.mike(alVar2);
                ap apVar = alVar2.f13306y;
                if (mike && !z2) {
                    if (apVar.echo && this.bravo.foxtrot(alVar2)) {
                        mike(alVar2, true, false);
                    } else {
                        foxtrot(alVar2, true);
                    }
                }
                if (z2) {
                    romeo2 = apVar.echo;
                } else {
                    romeo2 = alVar2.romeo();
                }
                if (romeo2) {
                    mike(alVar2, z2, false);
                }
                if (z2) {
                    romeo3 = apVar.echo;
                } else {
                    romeo3 = alVar2.romeo();
                }
                if (!romeo3) {
                    golf(alVar2, z2);
                }
            }
        }
        if (z2) {
            romeo = alVar.f13306y.echo;
        } else {
            romeo = alVar.romeo();
        }
        if (romeo) {
            mike(alVar, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [T.r] */
    public final boolean juliet(C2940t c2940t) {
        boolean z2;
        T.r parent$ui_release;
        T.r rVar;
        boolean z10;
        al alVar;
        boolean z11;
        com.bumptech.glide.load.engine.h hVar = this.bravo;
        al alVar2 = this.alpha;
        if (!alVar2.cyan()) {
            AbstractC2264a.alpha("performMeasureAndLayout called with unattached root");
        }
        if (!alVar2.emerald()) {
            AbstractC2264a.alpha("performMeasureAndLayout called with unplaced root");
        }
        if (this.charlie) {
            AbstractC2264a.alpha("performMeasureAndLayout called during measure layout");
        }
        int i4 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (this.india != null) {
            this.charlie = true;
            this.delta = true;
            try {
                boolean kilo = hVar.kilo();
                C1718a c1718a = (C1718a) hVar.purple;
                if (kilo) {
                    z2 = false;
                    while (true) {
                        C1718a c1718a2 = (C1718a) hVar.silver;
                        C1718a c1718a3 = (C1718a) hVar.red;
                        if (!((f0) c1718a.purple).isEmpty()) {
                            alVar = (al) ((f0) c1718a.purple).first();
                            c1718a.crimson(alVar);
                            if (alVar.yellow != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z10 = false;
                        } else if (!((f0) c1718a3.purple).isEmpty()) {
                            alVar = (al) ((f0) c1718a3.purple).first();
                            c1718a3.crimson(alVar);
                            if (alVar.yellow != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z10 = true;
                        } else {
                            if (((f0) c1718a2.purple).isEmpty()) {
                                break;
                            }
                            al alVar3 = (al) ((f0) c1718a2.purple).first();
                            c1718a2.crimson(alVar3);
                            z10 = true;
                            alVar = alVar3;
                            z11 = false;
                        }
                        boolean mike = mike(alVar, z11, z10);
                        if (!z10) {
                            if (alVar.f13306y.foxtrot) {
                                hVar.delta(alVar, EnumC2564y.purple);
                            }
                            if (alVar.quebec()) {
                                hVar.delta(alVar, EnumC2564y.silver);
                            }
                        }
                        if (alVar == alVar2 && mike) {
                            z2 = true;
                        }
                    }
                    if (c2940t != null) {
                        c2940t.invoke();
                    }
                } else {
                    z2 = false;
                }
            } finally {
            }
        } else {
            z2 = false;
        }
        J.e eVar = this.foxtrot;
        Object[] objArr = eVar.alpha;
        int i5 = eVar.red;
        int i10 = 0;
        while (i10 < i5) {
            C0058p c0058p = ((al) ((V) objArr[i10])).f13305x;
            C2563x c2563x = (C2563x) c0058p.echo;
            boolean hotel = M.hotel(128);
            if (hotel) {
                parent$ui_release = c2563x.f13351K;
            } else {
                parent$ui_release = c2563x.f13351K.getParent$ui_release();
                if (parent$ui_release == null) {
                    i10++;
                    i4 = 0;
                }
            }
            C2546f c2546f = L.f13244D;
            T.r C = c2563x.C(hotel);
            while (C != null && (C.getAggregateChildKindSet$ui_release() & 128) != 0) {
                if ((C.getKindSet$ui_release() & 128) != 0) {
                    AbstractC2556p abstractC2556p = C;
                    J.e eVar2 = null;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof aa) {
                            ((aa) abstractC2556p).foxtrot((C2563x) c0058p.echo);
                        } else if ((abstractC2556p.getKindSet$ui_release() & 128) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar2 = abstractC2556p.purple;
                            rVar = abstractC2556p;
                            eVar2 = eVar2;
                            while (rVar2 != null) {
                                if ((rVar2.getKindSet$ui_release() & 128) != 0) {
                                    i4++;
                                    eVar2 = eVar2;
                                    if (i4 == 1) {
                                        rVar = rVar2;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new J.e(new T.r[16]);
                                        }
                                        if (rVar != null) {
                                            eVar2.bravo(rVar);
                                            rVar = null;
                                        }
                                        eVar2.bravo(rVar2);
                                    }
                                }
                                rVar2 = rVar2.getChild$ui_release();
                                rVar = rVar;
                                eVar2 = eVar2;
                            }
                            if (i4 == 1) {
                                i4 = 0;
                                abstractC2556p = rVar;
                                eVar2 = eVar2;
                            }
                        }
                        rVar = AbstractC2555o.bravo(eVar2);
                        i4 = 0;
                        abstractC2556p = rVar;
                        eVar2 = eVar2;
                    }
                }
                if (C != parent$ui_release) {
                    C = C.getChild$ui_release();
                    i4 = 0;
                }
            }
            i10++;
            i4 = 0;
        }
        eVar.india();
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [T.r] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final void kilo(al alVar, long j5) {
        T.r parent$ui_release;
        T.r rVar;
        if (alVar.f13282I) {
            return;
        }
        al alVar2 = this.alpha;
        if (Intrinsics.areEqual(alVar, alVar2)) {
            AbstractC2264a.alpha("measureAndLayout called on root");
        }
        if (!alVar2.cyan()) {
            AbstractC2264a.alpha("performMeasureAndLayout called with unattached root");
        }
        if (!alVar2.emerald()) {
            AbstractC2264a.alpha("performMeasureAndLayout called with unplaced root");
        }
        if (this.charlie) {
            AbstractC2264a.alpha("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.india != null) {
            this.charlie = true;
            this.delta = false;
            try {
                com.bumptech.glide.load.engine.h hVar = this.bravo;
                ((C1718a) hVar.purple).crimson(alVar);
                ((C1718a) hVar.red).crimson(alVar);
                ((C1718a) hVar.silver).crimson(alVar);
                if ((bravo(alVar, new Q0.a(j5)) || alVar.f13306y.foxtrot) && Intrinsics.areEqual(alVar.fuchsia(), Boolean.TRUE)) {
                    alVar.gold();
                }
                echo(alVar);
                charlie(alVar, new Q0.a(j5));
                if (alVar.quebec() && alVar.emerald()) {
                    alVar.magenta();
                    com.google.android.play.core.integrity.c cVar = this.echo;
                    cVar.getClass();
                    if (alVar.f13281H > 0) {
                        ((J.e) cVar.purple).bravo(alVar);
                        alVar.f13280G = true;
                    }
                }
                delta();
            } finally {
            }
        }
        J.e eVar = this.foxtrot;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        int i5 = 0;
        while (i5 < i4) {
            C0058p c0058p = ((al) ((V) objArr[i5])).f13305x;
            C2563x c2563x = (C2563x) c0058p.echo;
            boolean hotel = M.hotel(128);
            if (hotel) {
                parent$ui_release = c2563x.f13351K;
            } else {
                parent$ui_release = c2563x.f13351K.getParent$ui_release();
                if (parent$ui_release == null) {
                    i5++;
                    z2 = false;
                }
            }
            C2546f c2546f = L.f13244D;
            T.r C = c2563x.C(hotel);
            while (C != null && (C.getAggregateChildKindSet$ui_release() & 128) != 0) {
                if ((C.getKindSet$ui_release() & 128) != 0) {
                    AbstractC2556p abstractC2556p = C;
                    J.e eVar2 = null;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof aa) {
                            ((aa) abstractC2556p).foxtrot((C2563x) c0058p.echo);
                        } else if ((abstractC2556p.getKindSet$ui_release() & 128) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar2 = abstractC2556p.purple;
                            ?? r15 = z2;
                            rVar = abstractC2556p;
                            eVar2 = eVar2;
                            while (rVar2 != null) {
                                if ((rVar2.getKindSet$ui_release() & 128) != 0) {
                                    r15++;
                                    eVar2 = eVar2;
                                    if (r15 == 1) {
                                        rVar = rVar2;
                                    } else {
                                        if (eVar2 == null) {
                                            eVar2 = new J.e(new T.r[16]);
                                        }
                                        if (rVar != null) {
                                            eVar2.bravo(rVar);
                                            rVar = null;
                                        }
                                        eVar2.bravo(rVar2);
                                    }
                                }
                                rVar2 = rVar2.getChild$ui_release();
                                rVar = rVar;
                                eVar2 = eVar2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z2 = false;
                                abstractC2556p = rVar;
                                eVar2 = eVar2;
                            }
                        }
                        rVar = AbstractC2555o.bravo(eVar2);
                        z2 = false;
                        abstractC2556p = rVar;
                        eVar2 = eVar2;
                    }
                }
                if (C != parent$ui_release) {
                    C = C.getChild$ui_release();
                    z2 = false;
                }
            }
            i5++;
            z2 = false;
        }
        eVar.india();
    }

    public final void lima() {
        com.bumptech.glide.load.engine.h hVar = this.bravo;
        if (hVar.kilo()) {
            al alVar = this.alpha;
            if (!alVar.cyan()) {
                AbstractC2264a.alpha("performMeasureAndLayout called with unattached root");
            }
            if (!alVar.emerald()) {
                AbstractC2264a.alpha("performMeasureAndLayout called with unplaced root");
            }
            if (this.charlie) {
                AbstractC2264a.alpha("performMeasureAndLayout called during measure layout");
            }
            if (this.india != null) {
                this.charlie = true;
                this.delta = false;
                try {
                    if (!((f0) ((C1718a) hVar.silver).purple).isEmpty() && !((f0) ((C1718a) hVar.purple).purple).isEmpty()) {
                        if (alVar.yellow != null) {
                            oscar(alVar, true);
                        } else {
                            november(alVar);
                        }
                    }
                    oscar(alVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.charlie = false;
                        this.delta = false;
                    }
                }
            }
        }
    }

    public final boolean mike(al alVar, boolean z2, boolean z10) {
        Q0.a aVar;
        boolean z11;
        AbstractC2366B placementScope;
        C2563x c2563x;
        al victor;
        ay ayVar;
        am amVar;
        boolean z12 = false;
        if (!alVar.f13282I) {
            boolean emerald = alVar.emerald();
            ap apVar = alVar.f13306y;
            if (emerald || apVar.papa.f13227m || india(alVar) || Intrinsics.areEqual(alVar.fuchsia(), Boolean.TRUE) || hotel(alVar) || apVar.papa.f13231q.echo() || ((ayVar = apVar.quebec) != null && (amVar = ayVar.f13330k) != null && amVar.echo())) {
                al alVar2 = this.alpha;
                if (alVar == alVar2) {
                    aVar = this.india;
                    Intrinsics.checkNotNull(aVar);
                } else {
                    aVar = null;
                }
                if (z2) {
                    if (apVar.echo) {
                        z12 = bravo(alVar, aVar);
                    }
                    if (z10 && ((z12 || apVar.foxtrot) && Intrinsics.areEqual(alVar.fuchsia(), Boolean.TRUE))) {
                        alVar.gold();
                    }
                } else {
                    if (alVar.romeo()) {
                        z11 = charlie(alVar, aVar);
                    } else {
                        z11 = false;
                    }
                    if (z10 && alVar.quebec() && (alVar == alVar2 || ((victor = alVar.victor()) != null && victor.emerald() && apVar.papa.f13227m))) {
                        if (alVar == alVar2) {
                            if (alVar.f13302u == ai.red) {
                                alVar.foxtrot();
                            }
                            al victor2 = alVar.victor();
                            if (victor2 == null || (c2563x = (C2563x) victor2.f13305x.echo) == null || (placementScope = c2563x.e) == null) {
                                placementScope = ((C2946x) ao.alpha(alVar)).getPlacementScope();
                            }
                            AbstractC2366B.juliet(placementScope, apVar.papa, 0, 0);
                        } else {
                            alVar.magenta();
                        }
                        com.google.android.play.core.integrity.c cVar = this.echo;
                        cVar.getClass();
                        if (alVar.f13281H > 0) {
                            ((J.e) cVar.purple).bravo(alVar);
                            alVar.f13280G = true;
                        }
                        ((C2946x) ao.alpha(alVar)).getRectManager().delta(alVar);
                    }
                    z12 = z11;
                }
                delta();
                return z12;
            }
        }
        return false;
    }

    public final void november(al alVar) {
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (alVar2.sierra() == ai.alpha || alVar2.f13306y.papa.f13231q.echo()) {
                if (AbstractC2557q.mike(alVar2)) {
                    oscar(alVar2, true);
                } else {
                    november(alVar2);
                }
            }
        }
    }

    public final void oscar(al alVar, boolean z2) {
        Q0.a aVar;
        if (alVar.f13282I) {
            return;
        }
        if (alVar == this.alpha) {
            aVar = this.india;
            Intrinsics.checkNotNull(aVar);
        } else {
            aVar = null;
        }
        if (z2) {
            bravo(alVar, aVar);
        } else {
            charlie(alVar, aVar);
        }
    }

    public final boolean papa(al alVar, boolean z2) {
        int ordinal = alVar.f13306y.delta.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!alVar.romeo() || z2) {
                        alVar.f13306y.papa.f13228n = true;
                        if (!alVar.f13282I && (alVar.emerald() || india(alVar))) {
                            al victor = alVar.victor();
                            if (victor == null || !victor.romeo()) {
                                this.bravo.delta(alVar, EnumC2564y.red);
                            }
                            if (!this.delta) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.hotel.bravo(new az(alVar, false, z2));
            }
        }
        return false;
    }

    public final void quebec(long j5) {
        boolean bravo;
        EnumC2564y enumC2564y;
        Q0.a aVar = this.india;
        if (aVar == null) {
            bravo = false;
        } else {
            bravo = Q0.a.bravo(aVar.alpha, j5);
        }
        if (!bravo) {
            if (this.charlie) {
                AbstractC2264a.alpha("updateRootConstraints called while measuring");
            }
            this.india = new Q0.a(j5);
            al alVar = this.alpha;
            al alVar2 = alVar.yellow;
            ap apVar = alVar.f13306y;
            if (alVar2 != null) {
                apVar.echo = true;
            }
            apVar.papa.f13228n = true;
            if (alVar2 != null) {
                enumC2564y = EnumC2564y.alpha;
            } else {
                enumC2564y = EnumC2564y.red;
            }
            this.bravo.delta(alVar, enumC2564y);
        }
    }
}
