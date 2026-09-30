package s0;

import B9.C0058p;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.C2396o;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class C extends AbstractC2367C implements q0.ao, InterfaceC2542b, G {
    public float B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13215D;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13219d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13220f;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f13222h;

    /* renamed from: i, reason: collision with root package name */
    public float f13223i;

    /* renamed from: k, reason: collision with root package name */
    public Object f13225k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13226l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13227m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13229o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13230p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13234t;
    public final ap white;

    /* renamed from: x, reason: collision with root package name */
    public float f13238x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13239y;
    public boolean yellow;

    /* renamed from: z, reason: collision with root package name */
    public Function1 f13240z;

    /* renamed from: a, reason: collision with root package name */
    public int f13216a = LottieConstants.IterateForever;

    /* renamed from: b, reason: collision with root package name */
    public int f13217b = LottieConstants.IterateForever;
    public ai e = ai.red;

    /* renamed from: g, reason: collision with root package name */
    public long f13221g = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13224j = true;

    /* renamed from: q, reason: collision with root package name */
    public final am f13231q = new am(this, 0);

    /* renamed from: r, reason: collision with root package name */
    public final J.e f13232r = new J.e(new C[16]);

    /* renamed from: s, reason: collision with root package name */
    public boolean f13233s = true;

    /* renamed from: u, reason: collision with root package name */
    public long f13235u = Q0.b.bravo(0, 0, 15);

    /* renamed from: v, reason: collision with root package name */
    public final B f13236v = new B(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final B f13237w = new B(this, 0);
    public long A = 0;
    public final B C = new B(this, 2);

    public C(ap apVar) {
        this.white = apVar;
    }

    public final List b() {
        ap apVar = this.white;
        apVar.alpha.yellow();
        boolean z2 = this.f13233s;
        J.e eVar = this.f13232r;
        if (!z2) {
            return eVar.hotel();
        }
        al alVar = apVar.alpha;
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (eVar.red <= i5) {
                eVar.bravo(alVar2.f13306y.papa);
            } else {
                C c3 = alVar2.f13306y.papa;
                Object[] objArr2 = eVar.alpha;
                Object obj = objArr2[i5];
                objArr2[i5] = c3;
            }
        }
        eVar.november(((J.e) ((J.b) alVar.oscar()).purple).red, eVar.red);
        this.f13233s = false;
        return eVar.hotel();
    }

    @Override // s0.G
    public final void black(boolean z2) {
        ap apVar = this.white;
        if (z2 != apVar.alpha().f13310b) {
            apVar.alpha().f13310b = z2;
            this.f13215D = true;
        }
    }

    @Override // s0.InterfaceC2542b
    public final void bronze() {
        this.f13234t = true;
        am amVar = this.f13231q;
        amVar.hotel();
        boolean z2 = this.f13229o;
        ap apVar = this.white;
        if (z2) {
            J.e zulu = apVar.alpha.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                al alVar = (al) objArr[i5];
                if (alVar.romeo() && alVar.sierra() == ai.alpha && al.jade(alVar)) {
                    al.olive(apVar.alpha, false, 7);
                }
            }
        }
        if (this.f13230p || (!this.f13220f && !golf().f13312d && this.f13229o)) {
            this.f13229o = false;
            ag agVar = apVar.delta;
            apVar.delta = ag.red;
            apVar.golf(false);
            al alVar2 = apVar.alpha;
            Y snapshotObserver = ((C2946x) ao.alpha(alVar2)).getSnapshotObserver();
            snapshotObserver.alpha(alVar2, snapshotObserver.echo, this.f13237w);
            apVar.delta = agVar;
            if (golf().f13312d && apVar.juliet) {
                requestLayout();
            }
            this.f13230p = false;
        }
        if (amVar.delta) {
            amVar.echo = true;
        }
        if (amVar.bravo && amVar.echo()) {
            amVar.golf();
        }
        this.f13234t = false;
    }

    public final void c() {
        boolean z2 = this.f13226l;
        this.f13226l = true;
        al alVar = this.white.alpha;
        if (!z2) {
            ((C2563x) alVar.f13305x.echo).M();
            if (alVar.romeo()) {
                al.olive(alVar, true, 6);
            } else if (alVar.f13306y.echo) {
                al.navy(alVar, true, 6);
            }
        }
        C0058p c0058p = alVar.f13305x;
        L l10 = ((C2563x) c0058p.echo).f13252j;
        for (L l11 = (L) c0058p.foxtrot; !Intrinsics.areEqual(l11, l10) && l11 != null; l11 = l11.f13252j) {
            if (l11.B) {
                l11.H();
            }
        }
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (alVar2.whiskey() != Integer.MAX_VALUE) {
                alVar2.f13306y.papa.c();
                al.orange(alVar2);
            }
        }
    }

    @Override // s0.InterfaceC2542b
    public final am charlie() {
        return this.f13231q;
    }

    @Override // s0.InterfaceC2542b
    public final boolean coral() {
        return this.f13226l;
    }

    public final void d() {
        if (this.f13226l) {
            this.f13226l = false;
            ap apVar = this.white;
            C0058p c0058p = apVar.alpha.f13305x;
            L l10 = ((C2563x) c0058p.echo).f13252j;
            for (L l11 = (L) c0058p.foxtrot; !Intrinsics.areEqual(l11, l10) && l11 != null; l11 = l11.f13252j) {
                T.r C = l11.C(M.hotel(1048576));
                if (C != null && (C.getNode().getAggregateChildKindSet$ui_release() & 1048576) != 0) {
                    boolean hotel = M.hotel(1048576);
                    T.r A = l11.A();
                    if (hotel || (A = A.getParent$ui_release()) != null) {
                        for (T.r C10 = l11.C(hotel); C10 != null && (C10.getAggregateChildKindSet$ui_release() & 1048576) != 0; C10 = C10.getChild$ui_release()) {
                            if ((C10.getKindSet$ui_release() & 1048576) != 0) {
                                T.r rVar = C10;
                                J.e eVar = null;
                                while (rVar != null) {
                                    if ((rVar.getKindSet$ui_release() & 1048576) != 0 && (rVar instanceof AbstractC2556p)) {
                                        int i4 = 0;
                                        for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                            if ((rVar2.getKindSet$ui_release() & 1048576) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    rVar = rVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new J.e(new T.r[16]);
                                                    }
                                                    if (rVar != null) {
                                                        eVar.bravo(rVar);
                                                        rVar = null;
                                                    }
                                                    eVar.bravo(rVar2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    rVar = AbstractC2555o.bravo(eVar);
                                }
                            }
                            if (C10 != A) {
                            }
                        }
                    }
                }
                l11.R();
            }
            J.e zulu = apVar.alpha.zulu();
            Object[] objArr = zulu.alpha;
            int i5 = zulu.red;
            for (int i10 = 0; i10 < i5; i10++) {
                ((al) objArr[i10]).f13306y.papa.d();
            }
        }
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        ap apVar = this.white;
        if (AbstractC2557q.mike(apVar.alpha)) {
            ay ayVar = apVar.quebec;
            Intrinsics.checkNotNull(ayVar);
            return ayVar.delta(i4);
        }
        f();
        return apVar.alpha().delta(i4);
    }

    public final void e() {
        ap apVar = this.white;
        if (apVar.lima > 0) {
            J.e zulu = apVar.alpha.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                al alVar = (al) objArr[i5];
                ap apVar2 = alVar.f13306y;
                boolean z2 = apVar2.juliet;
                C c3 = apVar2.papa;
                if ((z2 || apVar2.kilo) && !c3.f13229o) {
                    alVar.ochre(false);
                }
                c3.e();
            }
        }
    }

    public final void f() {
        ai aiVar;
        ap apVar = this.white;
        al.olive(apVar.alpha, false, 7);
        al alVar = apVar.alpha;
        al victor = alVar.victor();
        if (victor != null && alVar.f13302u == ai.red) {
            int ordinal = victor.f13306y.delta.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    aiVar = victor.f13302u;
                } else {
                    aiVar = ai.purple;
                }
            } else {
                aiVar = ai.alpha;
            }
            alVar.f13302u = aiVar;
        }
    }

    @Override // s0.InterfaceC2542b
    public final void fuchsia(Function1 function1) {
        J.e zulu = this.white.alpha.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            function1.invoke(((al) objArr[i5]).f13306y.papa);
        }
    }

    public final void g() {
        this.f13239y = true;
        ap apVar = this.white;
        al victor = apVar.alpha.victor();
        float f5 = golf().f13263u;
        al alVar = apVar.alpha;
        C0058p c0058p = alVar.f13305x;
        L l10 = (L) c0058p.foxtrot;
        while (l10 != ((C2563x) c0058p.echo)) {
            Intrinsics.charlie(l10, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            ad adVar = (ad) l10;
            f5 += adVar.f13263u;
            l10 = adVar.f13252j;
        }
        if (f5 != this.f13238x) {
            this.f13238x = f5;
            if (victor != null) {
                victor.indigo();
            }
            if (victor != null) {
                victor.beige();
            }
        }
        if (!this.f13226l) {
            if (victor != null) {
                victor.beige();
            }
            c();
            if (this.yellow && victor != null) {
                victor.ochre(false);
            }
        } else {
            ((C2563x) alVar.f13305x.echo).M();
        }
        if (victor != null) {
            if (!this.yellow) {
                ap apVar2 = victor.f13306y;
                if (apVar2.delta == ag.red) {
                    if (this.f13217b != Integer.MAX_VALUE) {
                        AbstractC2264a.bravo("Place was called on a node which was placed already");
                    }
                    int i4 = apVar2.india;
                    this.f13217b = i4;
                    apVar2.india = i4 + 1;
                }
            }
        } else {
            this.f13217b = 0;
        }
        bronze();
    }

    @Override // s0.InterfaceC2542b
    public final C2563x golf() {
        return (C2563x) this.white.alpha.f13305x.echo;
    }

    @Override // s0.InterfaceC2542b
    public final void green() {
        al.olive(this.white.alpha, false, 7);
    }

    public final void h(long j5) {
        ap apVar = this.white;
        ag agVar = apVar.delta;
        ag agVar2 = ag.teal;
        if (agVar != agVar2) {
            AbstractC2264a.bravo("layout state is not idle before measure starts");
        }
        this.f13235u = j5;
        ag agVar3 = ag.alpha;
        apVar.delta = agVar3;
        this.f13228n = false;
        al alVar = apVar.alpha;
        Y snapshotObserver = ((C2946x) ao.alpha(alVar)).getSnapshotObserver();
        snapshotObserver.alpha(alVar, snapshotObserver.charlie, this.f13236v);
        if (apVar.delta == agVar3) {
            this.f13229o = true;
            this.f13230p = true;
            apVar.delta = agVar2;
        }
    }

    @Override // s0.InterfaceC2542b
    public final InterfaceC2542b hotel() {
        ap apVar;
        al victor = this.white.alpha.victor();
        if (victor != null && (apVar = victor.f13306y) != null) {
            return apVar.papa;
        }
        return null;
    }

    public final void i(long j5, float f5, Function1 function1) {
        ap apVar = this.white;
        if (apVar.alpha.f13282I) {
            AbstractC2264a.alpha("place is called on a deactivated node");
        }
        apVar.delta = ag.red;
        this.f13221g = j5;
        this.f13223i = f5;
        this.f13222h = function1;
        this.f13239y = false;
        al alVar = apVar.alpha;
        W alpha = ao.alpha(alVar);
        if (!this.f13229o && this.f13226l) {
            L alpha2 = apVar.alpha();
            alpha2.P(Q0.k.charlie(j5, alpha2.teal), f5, function1);
            g();
        } else {
            this.f13231q.golf = false;
            apVar.foxtrot(false);
            this.f13240z = function1;
            this.A = j5;
            this.B = f5;
            Y snapshotObserver = ((C2946x) alpha).getSnapshotObserver();
            snapshotObserver.alpha(alVar, snapshotObserver.foxtrot, this.C);
        }
        apVar.delta = ag.teal;
        this.f13219d = true;
    }

    public final boolean j(long j5) {
        boolean z2;
        long j6;
        ap apVar = this.white;
        al alVar = apVar.alpha;
        al alVar2 = apVar.alpha;
        try {
            if (alVar.f13282I) {
                AbstractC2264a.alpha("measure is called on a deactivated node");
            }
            W alpha = ao.alpha(alVar2);
            al victor = alVar2.victor();
            boolean z10 = true;
            if (!alVar2.f13304w && (victor == null || !victor.f13304w)) {
                z2 = false;
                alVar2.f13304w = z2;
                if (!alVar2.romeo() && Q0.a.bravo(this.silver, j5)) {
                    ((C2946x) alpha).india(alVar2, false);
                    alVar2.peach();
                    return false;
                }
                this.f13231q.foxtrot = false;
                fuchsia(C2546f.e);
                this.f13218c = true;
                j6 = apVar.alpha().red;
                a(j5);
                h(j5);
                if (Q0.m.alpha(apVar.alpha().red, j6) && apVar.alpha().alpha == this.alpha && apVar.alpha().purple == this.purple) {
                    z10 = false;
                }
                yellow((apVar.alpha().purple & 4294967295L) | (apVar.alpha().alpha << 32));
                return z10;
            }
            z2 = true;
            alVar2.f13304w = z2;
            if (!alVar2.romeo()) {
                ((C2946x) alpha).india(alVar2, false);
                alVar2.peach();
                return false;
            }
            this.f13231q.foxtrot = false;
            fuchsia(C2546f.e);
            this.f13218c = true;
            j6 = apVar.alpha().red;
            a(j5);
            h(j5);
            if (Q0.m.alpha(apVar.alpha().red, j6)) {
                z10 = false;
            }
            yellow((apVar.alpha().purple & 4294967295L) | (apVar.alpha().alpha << 32));
            return z10;
        } catch (Throwable th) {
            alVar.pink(th);
            throw null;
        }
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        ap apVar = this.white;
        if (AbstractC2557q.mike(apVar.alpha)) {
            ay ayVar = apVar.quebec;
            Intrinsics.checkNotNull(ayVar);
            return ayVar.jade(i4);
        }
        f();
        return apVar.alpha().jade(i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        ap apVar = this.white;
        if (AbstractC2557q.mike(apVar.alpha)) {
            ay ayVar = apVar.quebec;
            Intrinsics.checkNotNull(ayVar);
            return ayVar.lima(i4);
        }
        f();
        return apVar.alpha().lima(i4);
    }

    @Override // q0.AbstractC2367C
    public final int magenta(C2396o c2396o) {
        ag agVar;
        ap apVar = this.white;
        al victor = apVar.alpha.victor();
        ag agVar2 = null;
        if (victor != null) {
            agVar = victor.f13306y.delta;
        } else {
            agVar = null;
        }
        ag agVar3 = ag.alpha;
        am amVar = this.f13231q;
        if (agVar == agVar3) {
            amVar.charlie = true;
        } else {
            al victor2 = apVar.alpha.victor();
            if (victor2 != null) {
                agVar2 = victor2.f13306y.delta;
            }
            if (agVar2 == ag.red) {
                amVar.delta = true;
            }
        }
        this.f13220f = true;
        int magenta = apVar.alpha().magenta(c2396o);
        this.f13220f = false;
        return magenta;
    }

    @Override // q0.AbstractC2367C
    public final int maroon() {
        return this.white.alpha().maroon();
    }

    @Override // q0.AbstractC2367C
    public final int navy() {
        return this.white.alpha().navy();
    }

    @Override // s0.InterfaceC2542b
    public final void requestLayout() {
        al alVar = this.white.alpha;
        af afVar = al.f13273J;
        alVar.ochre(false);
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        ap apVar = this.white;
        if (AbstractC2557q.mike(apVar.alpha)) {
            ay ayVar = apVar.quebec;
            Intrinsics.checkNotNull(ayVar);
            return ayVar.romeo(i4);
        }
        f();
        return apVar.alpha().romeo(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x004b, B:17:0x0055, B:19:0x0063, B:21:0x006e, B:22:0x0072, B:23:0x0059, B:24:0x003b, B:26:0x0041, B:28:0x0045, B:29:0x0047, B:30:0x0086, B:32:0x008a, B:36:0x0092, B:37:0x0097, B:42:0x0018, B:44:0x001c, B:46:0x0020, B:48:0x0028, B:49:0x0024), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:5:0x0010, B:8:0x002b, B:10:0x002f, B:14:0x004b, B:17:0x0055, B:19:0x0063, B:21:0x006e, B:22:0x0072, B:23:0x0059, B:24:0x003b, B:26:0x0041, B:28:0x0045, B:29:0x0047, B:30:0x0086, B:32:0x008a, B:36:0x0092, B:37:0x0097, B:42:0x0018, B:44:0x001c, B:46:0x0020, B:48:0x0028, B:49:0x0024), top: B:2:0x0005 }] */
    @Override // q0.AbstractC2367C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void silver(long j5, float f5, Function1 function1) {
        ay ayVar;
        ay ayVar2;
        boolean z2;
        AbstractC2366B placementScope;
        ap apVar = this.white;
        al alVar = apVar.alpha;
        boolean z10 = true;
        try {
            this.f13227m = true;
            if (Q0.k.alpha(j5, this.f13221g)) {
                if (this.f13215D) {
                }
                ayVar = apVar.quebec;
                if (ayVar != null) {
                    ap apVar2 = ayVar.white;
                    if (AbstractC2557q.mike(apVar2.alpha)) {
                        z2 = true;
                    } else {
                        if (ayVar.f13329j == av.red && !apVar2.bravo) {
                            apVar2.charlie = true;
                        }
                        z2 = apVar2.charlie;
                    }
                    if (z2) {
                        L l10 = apVar.alpha().f13253k;
                        al alVar2 = apVar.alpha;
                        if (l10 == null || (placementScope = l10.e) == null) {
                            placementScope = ((C2946x) ao.alpha(alVar2)).getPlacementScope();
                        }
                        ay ayVar3 = apVar.quebec;
                        Intrinsics.checkNotNull(ayVar3);
                        al victor = alVar2.victor();
                        if (victor != null) {
                            victor.f13306y.hotel = 0;
                        }
                        ayVar3.f13322b = LottieConstants.IterateForever;
                        AbstractC2366B.hotel(placementScope, ayVar3, (int) (j5 >> 32), (int) (4294967295L & j5));
                    }
                }
                ayVar2 = apVar.quebec;
                if (ayVar2 != null || ayVar2.e) {
                    z10 = false;
                }
                if (z10) {
                    AbstractC2264a.bravo("Error: Placement happened before lookahead.");
                }
                i(j5, f5, function1);
            }
            if (apVar.kilo || apVar.juliet || this.f13215D) {
                this.f13229o = true;
                this.f13215D = false;
            }
            e();
            ayVar = apVar.quebec;
            if (ayVar != null) {
            }
            ayVar2 = apVar.quebec;
            if (ayVar2 != null) {
            }
            z10 = false;
            if (z10) {
            }
            i(j5, f5, function1);
        } catch (Throwable th) {
            alVar.pink(th);
            throw null;
        }
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        ai aiVar;
        ap apVar = this.white;
        al alVar = apVar.alpha;
        ai aiVar2 = alVar.f13302u;
        ai aiVar3 = ai.red;
        if (aiVar2 == aiVar3) {
            alVar.echo();
        }
        if (AbstractC2557q.mike(apVar.alpha)) {
            ay ayVar = apVar.quebec;
            Intrinsics.checkNotNull(ayVar);
            ayVar.f13323c = aiVar3;
            ayVar.victor(j5);
        }
        al alVar2 = apVar.alpha;
        al victor = alVar2.victor();
        if (victor != null) {
            if (this.e != aiVar3 && !alVar2.f13304w) {
                AbstractC2264a.bravo("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            ap apVar2 = victor.f13306y;
            int ordinal = apVar2.delta.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    aiVar = ai.purple;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + apVar2.delta);
                }
            } else {
                aiVar = ai.alpha;
            }
            this.e = aiVar;
        } else {
            this.e = aiVar3;
        }
        j(j5);
        return this;
    }

    @Override // q0.AbstractC2367C, q0.InterfaceC2401t
    public final Object yankee() {
        return this.f13225k;
    }
}
