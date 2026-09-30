package s0;

import B9.C0058p;
import a0.InterfaceC0364r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0591x;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0578j;
import androidx.compose.runtime.InterfaceC0592y;
import androidx.compose.runtime.t0;
import bx.C0769g;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import d0.C1564b;
import g.C1718a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;
import qe.C2474j;
import t0.C0;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class al implements InterfaceC0578j, X, A0.m, InterfaceC2552l, V {

    /* renamed from: J, reason: collision with root package name */
    public static final af f13273J = new ah("Undefined intrinsics block and it is required");

    /* renamed from: K, reason: collision with root package name */
    public static final C2550j f13274K = C2550j.red;

    /* renamed from: L, reason: collision with root package name */
    public static final ae f13275L = new Object();

    /* renamed from: M, reason: collision with root package name */
    public static final E0.k f13276M = new E0.k(11);
    public L A;
    public boolean B;
    public T.s C;

    /* renamed from: D, reason: collision with root package name */
    public T.s f13277D;

    /* renamed from: E, reason: collision with root package name */
    public T0.c f13278E;

    /* renamed from: F, reason: collision with root package name */
    public T0.d f13279F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13280G;

    /* renamed from: H, reason: collision with root package name */
    public int f13281H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f13282I;

    /* renamed from: a, reason: collision with root package name */
    public int f13283a;
    public final boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.internal.ab f13284b;

    /* renamed from: c, reason: collision with root package name */
    public J.e f13285c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13286d;
    public al e;

    /* renamed from: f, reason: collision with root package name */
    public C2946x f13287f;

    /* renamed from: g, reason: collision with root package name */
    public T0.t f13288g;

    /* renamed from: h, reason: collision with root package name */
    public int f13289h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13290i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13291j;

    /* renamed from: k, reason: collision with root package name */
    public A0.k f13292k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13293l;

    /* renamed from: m, reason: collision with root package name */
    public final J.e f13294m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13295n;

    /* renamed from: o, reason: collision with root package name */
    public q0.ap f13296o;

    /* renamed from: p, reason: collision with root package name */
    public gd.a f13297p;
    public int purple;

    /* renamed from: q, reason: collision with root package name */
    public Q0.d f13298q;

    /* renamed from: r, reason: collision with root package name */
    public Q0.n f13299r;
    public long red;

    /* renamed from: s, reason: collision with root package name */
    public C0 f13300s;
    public long silver;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0592y f13301t;
    public long teal;

    /* renamed from: u, reason: collision with root package name */
    public ai f13302u;

    /* renamed from: v, reason: collision with root package name */
    public ai f13303v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13304w;
    public boolean white;

    /* renamed from: x, reason: collision with root package name */
    public final C0058p f13305x;

    /* renamed from: y, reason: collision with root package name */
    public final ap f13306y;
    public al yellow;

    /* renamed from: z, reason: collision with root package name */
    public q0.al f13307z;

    public al(int i4) {
        this(A0.o.alpha.addAndGet(1), (i4 & 1) == 0);
    }

    public static boolean jade(al alVar) {
        Q0.a aVar;
        C c3 = alVar.f13306y.papa;
        if (c3.f13218c) {
            aVar = new Q0.a(c3.silver);
        } else {
            aVar = null;
        }
        return alVar.ivory(aVar);
    }

    private final String juliet(al alVar) {
        String str;
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(alVar);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(golf(0));
        sb2.append(" Other tree: ");
        al alVar2 = alVar.e;
        if (alVar2 != null) {
            str = alVar2.golf(0);
        } else {
            str = null;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static void navy(al alVar, boolean z2, int i4) {
        boolean z10;
        al victor;
        boolean z11 = false;
        if ((i4 & 1) != 0) {
            z2 = false;
        }
        if ((i4 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i4 & 4) != 0) {
            z11 = true;
        }
        if (alVar.yellow == null) {
            AbstractC2264a.bravo("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        alVar.white = true;
        C2946x c2946x = alVar.f13287f;
        if (c2946x != null && !alVar.f13290i && !alVar.alpha) {
            c2946x.whiskey(alVar, true, z2, z10);
            if (z11) {
                ay ayVar = alVar.f13306y.quebec;
                Intrinsics.checkNotNull(ayVar);
                ap apVar = ayVar.white;
                al victor2 = apVar.alpha.victor();
                ai aiVar = apVar.alpha.f13302u;
                if (victor2 != null && aiVar != ai.red) {
                    while (victor2.f13302u == aiVar && (victor = victor2.victor()) != null) {
                        victor2 = victor;
                    }
                    int ordinal = aiVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (victor2.yellow != null) {
                                victor2.maroon(z2);
                                return;
                            } else {
                                victor2.ochre(z2);
                                return;
                            }
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                    if (victor2.yellow != null) {
                        navy(victor2, z2, 6);
                    } else {
                        olive(victor2, z2, 6);
                    }
                }
            }
        }
    }

    public static void olive(al alVar, boolean z2, int i4) {
        boolean z10;
        boolean z11;
        C2946x c2946x;
        al victor;
        if ((i4 & 1) != 0) {
            z2 = false;
        }
        if ((i4 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i4 & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        alVar.white = true;
        if (!alVar.f13290i && !alVar.alpha && (c2946x = alVar.f13287f) != null) {
            c2946x.whiskey(alVar, false, z2, z10);
            if (z11) {
                ap apVar = alVar.f13306y.papa.white;
                al victor2 = apVar.alpha.victor();
                ai aiVar = apVar.alpha.f13302u;
                if (victor2 != null && aiVar != ai.red) {
                    while (victor2.f13302u == aiVar && (victor = victor2.victor()) != null) {
                        victor2 = victor;
                    }
                    int ordinal = aiVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            victor2.ochre(z2);
                            return;
                        }
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    }
                    olive(victor2, z2, 6);
                }
            }
        }
    }

    public static void orange(al alVar) {
        int i4 = aj.$EnumSwitchMapping$0[alVar.f13306y.delta.ordinal()];
        ap apVar = alVar.f13306y;
        if (i4 == 1) {
            if (apVar.echo) {
                navy(alVar, true, 6);
                return;
            }
            if (apVar.foxtrot) {
                alVar.maroon(true);
            }
            if (alVar.romeo()) {
                olive(alVar, true, 6);
                return;
            } else {
                if (alVar.quebec()) {
                    alVar.ochre(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + apVar.delta);
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void alpha() {
        T0.t tVar = this.f13288g;
        if (tVar != null) {
            tVar.alpha();
        }
        q0.al alVar = this.f13307z;
        if (alVar != null) {
            alVar.alpha();
        }
        C0058p c0058p = this.f13305x;
        L l10 = ((C2563x) c0058p.echo).f13252j;
        for (L l11 = (L) c0058p.foxtrot; !Intrinsics.areEqual(l11, l10) && l11 != null; l11 = l11.f13252j) {
            l11.f13254l = true;
            l11.A.invoke();
            l11.R();
        }
    }

    public final void amber(long j5, C2561v c2561v, int i4, boolean z2) {
        C0058p c0058p = this.f13305x;
        L l10 = (L) c0058p.foxtrot;
        C2546f c2546f = L.f13244D;
        ((L) c0058p.foxtrot).F(L.f13249I, l10.x(j5), c2561v, i4, z2);
    }

    public final void azure(int i4, al alVar) {
        if (alVar.e != null && alVar.f13287f != null) {
            AbstractC2264a.bravo(juliet(alVar));
        }
        alVar.e = this;
        com.google.android.material.internal.ab abVar = this.f13284b;
        ((J.e) abVar.purple).alpha(i4, alVar);
        ((C2474j) abVar.red).invoke();
        indigo();
        if (alVar.alpha) {
            this.f13283a++;
        }
        crimson();
        C2946x c2946x = this.f13287f;
        if (c2946x != null) {
            alVar.delta(c2946x);
        }
        if (alVar.f13306y.lima > 0) {
            ap apVar = this.f13306y;
            apVar.delta(apVar.lima + 1);
        }
        if (alVar.f13281H > 0) {
            purple(this.f13281H + 1);
        }
    }

    public final void beige() {
        U u4;
        if (this.B) {
            C0058p c0058p = this.f13305x;
            L l10 = (C2563x) c0058p.echo;
            L l11 = ((L) c0058p.foxtrot).f13253k;
            this.A = null;
            while (true) {
                if (Intrinsics.areEqual(l10, l11)) {
                    break;
                }
                if (l10 != null) {
                    u4 = l10.C;
                } else {
                    u4 = null;
                }
                if (u4 != null) {
                    this.A = l10;
                    break;
                } else if (l10 != null) {
                    l10 = l10.f13253k;
                } else {
                    l10 = null;
                }
            }
        }
        L l12 = this.A;
        if (l12 != null && l12.C == null) {
            throw Q0.c.xray("layer was not set");
        }
        if (l12 != null) {
            l12.H();
            return;
        }
        al victor = victor();
        if (victor != null) {
            victor.beige();
        }
    }

    public final void black() {
        C0058p c0058p = this.f13305x;
        L l10 = (L) c0058p.foxtrot;
        C2563x c2563x = (C2563x) c0058p.echo;
        while (l10 != c2563x) {
            Intrinsics.charlie(l10, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            ad adVar = (ad) l10;
            U u4 = adVar.C;
            if (u4 != null) {
                u4.invalidate();
            }
            l10 = adVar.f13252j;
        }
        U u10 = ((C2563x) c0058p.echo).C;
        if (u10 != null) {
            u10.invalidate();
        }
    }

    public final void blue() {
        if (this.alpha) {
            al victor = victor();
            if (victor != null) {
                victor.blue();
                return;
            }
            return;
        }
        if (this.yellow != null) {
            navy(this, false, 7);
        } else {
            olive(this, false, 7);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void bravo() {
        U.c cVar;
        T0.t tVar = this.f13288g;
        if (tVar != null) {
            tVar.bravo();
        }
        q0.al alVar = this.f13307z;
        if (alVar != null) {
            alVar.foxtrot(true);
        }
        this.f13282I = true;
        C0058p c0058p = this.f13305x;
        for (T.r rVar = (g0) c0058p.golf; rVar != null; rVar = rVar.getParent$ui_release()) {
            if (rVar.isAttached()) {
                rVar.reset$ui_release();
            }
        }
        T.r rVar2 = (g0) c0058p.golf;
        for (T.r rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.getParent$ui_release()) {
            if (rVar3.isAttached()) {
                rVar3.runDetachLifecycle$ui_release();
            }
        }
        while (rVar2 != null) {
            if (rVar2.isAttached()) {
                rVar2.markAsDetached$ui_release();
            }
            rVar2 = rVar2.getParent$ui_release();
        }
        if (cyan()) {
            this.f13292k = null;
            this.f13291j = false;
        }
        C2946x c2946x = this.f13287f;
        if (c2946x != null) {
            c2946x.getRectManager().india(this);
            if (C2946x.echo() && (cVar = c2946x.f13921y) != null) {
                if (cVar.hotel.echo(this.purple)) {
                    cVar.alpha.hotel(cVar.charlie, this.purple, false);
                }
            }
        }
    }

    public final void bronze() {
        if (!Q0.k.alpha(this.red, 9223372034707292159L)) {
            this.red = 9223372034707292159L;
            J.e zulu = zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                ((al) objArr[i5]).bronze();
            }
        }
    }

    public final void charlie(T.s sVar) {
        int i4;
        boolean z2;
        C0058p c0058p;
        J.e eVar;
        H h4;
        C2563x c2563x;
        boolean z10;
        boolean z11;
        C0058p c0058p2 = this.f13305x;
        boolean foxtrot = c0058p2.foxtrot(16);
        boolean foxtrot2 = c0058p2.foxtrot(Barcode.FORMAT_UPC_E);
        this.C = sVar;
        T.r rVar = (T.r) c0058p2.delta;
        H h10 = (H) c0058p2.charlie;
        if (rVar == h10) {
            AbstractC2264a.bravo("padChain called on already padded chain");
        }
        T.r rVar2 = (T.r) c0058p2.delta;
        rVar2.setParent$ui_release(h10);
        h10.setChild$ui_release(rVar2);
        J.e eVar2 = (J.e) c0058p2.hotel;
        if (eVar2 != null) {
            i4 = eVar2.red;
        } else {
            i4 = 0;
        }
        J.e eVar3 = (J.e) c0058p2.india;
        if (eVar3 == null) {
            eVar3 = new J.e(new T.q[16]);
        }
        J.e eVar4 = (J.e) c0058p2.juliet;
        eVar4.bravo(sVar);
        C0769g c0769g = null;
        while (true) {
            int i5 = eVar4.red;
            if (i5 == 0) {
                break;
            }
            T.s sVar2 = (T.s) eVar4.mike(i5 - 1);
            if (sVar2 instanceof T.m) {
                T.m mVar = (T.m) sVar2;
                eVar4.bravo(mVar.purple);
                eVar4.bravo(mVar.alpha);
            } else if (sVar2 instanceof T.q) {
                eVar3.bravo(sVar2);
            } else {
                if (c0769g == null) {
                    c0769g = new C0769g(16, eVar3);
                }
                sVar2.all(c0769g);
                c0769g = c0769g;
            }
        }
        int i10 = eVar3.red;
        boolean z12 = true;
        g0 g0Var = (g0) c0058p2.golf;
        al alVar = (al) c0058p2.bravo;
        if (i10 == i4) {
            T.r child$ui_release = h10.getChild$ui_release();
            int i11 = 0;
            while (child$ui_release != null && i11 < i4) {
                if (eVar2 != null) {
                    T.q qVar = (T.q) eVar2.alpha[i11];
                    T.q qVar2 = (T.q) eVar3.alpha[i11];
                    if (Intrinsics.areEqual(qVar, qVar2)) {
                        z11 = 2;
                    } else if (qVar.getClass() == qVar2.getClass()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (z11) {
                            C0058p.juliet(qVar, qVar2, child$ui_release);
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                        i11++;
                    } else {
                        child$ui_release = child$ui_release.getParent$ui_release();
                        break;
                    }
                } else {
                    throw Q0.c.xray("expected prior modifier list to be non-empty");
                }
            }
            if (i11 < i4) {
                if (eVar2 != null) {
                    if (child$ui_release != null) {
                        if (alVar.f13277D != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z13 = !z10;
                        eVar = eVar3;
                        T.r rVar3 = child$ui_release;
                        c0058p = c0058p2;
                        c0058p.hotel(i11, eVar2, eVar, rVar3, z13);
                        h4 = h10;
                    } else {
                        throw Q0.c.xray("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw Q0.c.xray("expected prior modifier list to be non-empty");
                }
            } else {
                c0058p2 = c0058p2;
                c0058p = c0058p2;
                eVar = eVar3;
                h4 = h10;
                z12 = false;
            }
        } else {
            T.s sVar3 = alVar.f13277D;
            if (sVar3 != null && i4 == 0) {
                T.r rVar4 = h10;
                for (int i12 = 0; i12 < eVar3.red; i12++) {
                    rVar4 = C0058p.delta((T.q) eVar3.alpha[i12], rVar4);
                }
                int i13 = 0;
                for (T.r parent$ui_release = g0Var.getParent$ui_release(); parent$ui_release != null && parent$ui_release != h10; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    i13 |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setAggregateChildKindSet$ui_release(i13);
                }
                c0058p = c0058p2;
                eVar = eVar3;
                h4 = h10;
            } else if (i10 == 0) {
                if (eVar2 != null) {
                    T.r child$ui_release2 = h10.getChild$ui_release();
                    for (int i14 = 0; child$ui_release2 != null && i14 < eVar2.red; i14++) {
                        child$ui_release2 = C0058p.echo(child$ui_release2).getChild$ui_release();
                    }
                    al victor = alVar.victor();
                    if (victor != null) {
                        c2563x = (C2563x) victor.f13305x.echo;
                    } else {
                        c2563x = null;
                    }
                    C2563x c2563x2 = (C2563x) c0058p2.echo;
                    c2563x2.f13253k = c2563x;
                    c0058p2.foxtrot = c2563x2;
                    c0058p = c0058p2;
                    eVar = eVar3;
                    h4 = h10;
                    z12 = false;
                } else {
                    throw Q0.c.xray("expected prior modifier list to be non-empty");
                }
            } else {
                if (eVar2 == null) {
                    eVar2 = new J.e(new T.q[16]);
                }
                if (sVar3 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z14 = !z2;
                c0058p = c0058p2;
                eVar = eVar3;
                h4 = h10;
                c0058p.hotel(0, eVar2, eVar, h4, z14);
            }
        }
        c0058p.hotel = eVar;
        if (eVar2 != null) {
            eVar2.india();
        } else {
            eVar2 = null;
        }
        c0058p.india = eVar2;
        T.r child$ui_release3 = h4.getChild$ui_release();
        if (child$ui_release3 == null) {
            child$ui_release3 = g0Var;
        }
        child$ui_release3.setParent$ui_release(null);
        h4.setChild$ui_release(null);
        h4.setAggregateChildKindSet$ui_release(-1);
        h4.updateCoordinator$ui_release(null);
        if (child$ui_release3 == h4) {
            AbstractC2264a.bravo("trimChain did not update the head");
        }
        c0058p.delta = child$ui_release3;
        if (z12) {
            c0058p.india();
        }
        boolean foxtrot3 = c0058p.foxtrot(16);
        boolean foxtrot4 = c0058p.foxtrot(Barcode.FORMAT_UPC_E);
        this.f13306y.juliet();
        if (this.yellow == null && c0058p.foxtrot(512)) {
            red(this);
        }
        if (foxtrot != foxtrot3 || foxtrot2 != foxtrot4) {
            B0.b rectManager = ((C2946x) ao.alpha(this)).getRectManager();
            rectManager.getClass();
            if (cyan()) {
                int i15 = this.purple & 67108863;
                B0.a aVar = rectManager.alpha;
                long[] jArr = (long[]) aVar.charlie;
                int i16 = aVar.bravo;
                for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
                    int i18 = i17 + 2;
                    long j5 = jArr[i18];
                    if ((((int) j5) & 67108863) == i15) {
                        jArr[i18] = ((foxtrot3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j5) | ((foxtrot4 ? 1L : 0L) * 4611686018427387904L);
                        return;
                    }
                }
            }
        }
    }

    public final void coral() {
        if (this.f13293l) {
            return;
        }
        if (((H) this.f13305x.charlie).getChild$ui_release() != null || this.f13277D != null) {
            this.f13291j = true;
            return;
        }
        A0.k kVar = this.f13292k;
        this.f13293l = true;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = new A0.k();
        Y snapshotObserver = ((C2946x) ao.alpha(this)).getSnapshotObserver();
        snapshotObserver.alpha(this, snapshotObserver.delta, new ak(this, objectRef));
        this.f13293l = false;
        this.f13292k = (A0.k) objectRef.alpha;
        this.f13291j = false;
        C2946x c2946x = (C2946x) ao.alpha(this);
        c2946x.getSemanticsOwner().bravo(this, kVar);
        c2946x.yankee();
    }

    public final void crimson() {
        al alVar;
        if (this.f13283a > 0) {
            this.f13286d = true;
        }
        if (this.alpha && (alVar = this.e) != null) {
            alVar.crimson();
        }
    }

    public final boolean cyan() {
        if (this.f13287f != null) {
            return true;
        }
        return false;
    }

    public final void delta(C2946x c2946x) {
        boolean z2;
        C2563x c2563x;
        int i4;
        al alVar;
        U.c cVar;
        A0.k xray;
        C2946x c2946x2;
        String str;
        if (this.f13287f == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC2264a.bravo("Cannot attach " + this + " as it already is attached.  Tree: " + golf(0));
        }
        al alVar2 = this.e;
        if (alVar2 != null && !Intrinsics.areEqual(alVar2.f13287f, c2946x)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(c2946x);
            sb2.append(") than the parent's owner(");
            al victor = victor();
            if (victor != null) {
                c2946x2 = victor.f13287f;
            } else {
                c2946x2 = null;
            }
            sb2.append(c2946x2);
            sb2.append("). This tree: ");
            sb2.append(golf(0));
            sb2.append(" Parent tree: ");
            al alVar3 = this.e;
            if (alVar3 != null) {
                str = alVar3.golf(0);
            } else {
                str = null;
            }
            sb2.append(str);
            AbstractC2264a.bravo(sb2.toString());
        }
        al victor2 = victor();
        ap apVar = this.f13306y;
        if (victor2 == null) {
            apVar.papa.f13226l = true;
            ay ayVar = apVar.quebec;
            if (ayVar != null) {
                ayVar.f13329j = av.alpha;
            }
        }
        C0058p c0058p = this.f13305x;
        L l10 = (L) c0058p.foxtrot;
        if (victor2 != null) {
            c2563x = (C2563x) victor2.f13305x.echo;
        } else {
            c2563x = null;
        }
        l10.f13253k = c2563x;
        this.f13287f = c2946x;
        if (victor2 != null) {
            i4 = victor2.f13289h;
        } else {
            i4 = -1;
        }
        this.f13289h = i4 + 1;
        T.s sVar = this.f13277D;
        if (sVar != null) {
            charlie(sVar);
        }
        this.f13277D = null;
        c2946x.m368getLayoutNodes().hotel(this.purple, this);
        al alVar4 = this.e;
        if (alVar4 == null || (alVar = alVar4.yellow) == null) {
            alVar = this.yellow;
        }
        red(alVar);
        if (this.yellow == null && c0058p.foxtrot(512)) {
            red(this);
        }
        if (!this.f13282I) {
            for (T.r rVar = (T.r) c0058p.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                rVar.markAsAttached$ui_release();
            }
        }
        J.e eVar = (J.e) this.f13284b.purple;
        Object[] objArr = eVar.alpha;
        int i5 = eVar.red;
        for (int i10 = 0; i10 < i5; i10++) {
            ((al) objArr[i10]).delta(c2946x);
        }
        if (!this.f13282I) {
            c0058p.golf();
        }
        blue();
        if (victor2 != null) {
            victor2.blue();
        }
        T0.c cVar2 = this.f13278E;
        if (cVar2 != null) {
            cVar2.invoke(c2946x);
        }
        apVar.juliet();
        if (!this.f13282I && c0058p.foxtrot(8)) {
            coral();
        }
        c2946x.getClass();
        if (C2946x.echo() && (cVar = c2946x.f13921y) != null && (xray = xray()) != null) {
            if (xray.alpha.bravo(A0.x.quebec)) {
                cVar.hotel.alpha(this.purple);
                cVar.alpha.hotel(cVar.charlie, this.purple, true);
            }
        }
    }

    public final void echo() {
        this.f13303v = this.f13302u;
        this.f13302u = ai.red;
        J.e zulu = zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar = (al) objArr[i5];
            if (alVar.f13302u != ai.red) {
                alVar.echo();
            }
        }
    }

    public final boolean emerald() {
        return this.f13306y.papa.f13226l;
    }

    public final void foxtrot() {
        this.f13303v = this.f13302u;
        this.f13302u = ai.red;
        J.e zulu = zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar = (al) objArr[i5];
            if (alVar.f13302u == ai.purple) {
                alVar.foxtrot();
            }
        }
    }

    public final Boolean fuchsia() {
        ay ayVar = this.f13306y.quebec;
        if (ayVar != null) {
            return Boolean.valueOf(ayVar.coral());
        }
        return null;
    }

    public final void gold() {
        al victor;
        if (this.f13302u == ai.red) {
            foxtrot();
        }
        ay ayVar = this.f13306y.quebec;
        Intrinsics.checkNotNull(ayVar);
        ayVar.getClass();
        try {
            ayVar.yellow = true;
            if (!ayVar.e) {
                AbstractC2264a.bravo("replace() called on item that was not placed");
            }
            ayVar.f13336q = false;
            boolean coral = ayVar.coral();
            ayVar.g(ayVar.f13327h, ayVar.f13328i);
            if (coral && !ayVar.f13336q && (victor = ayVar.white.alpha.victor()) != null) {
                victor.maroon(false);
            }
            ayVar.yellow = false;
        } catch (Throwable th) {
            ayVar.yellow = false;
            throw th;
        }
    }

    public final String golf(int i4) {
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        J.e zulu = zulu();
        Object[] objArr = zulu.alpha;
        int i10 = zulu.red;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(((al) objArr[i11]).golf(i4 + 1));
        }
        String sb3 = sb2.toString();
        if (i4 == 0) {
            String substring = sb3.substring(0, sb3.length() - 1);
            Intrinsics.delta(substring, "substring(...)");
            return substring;
        }
        return sb3;
    }

    public final void gray(int i4, int i5, int i10) {
        int i11;
        if (i4 == i5) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            if (i4 > i5) {
                i11 = i4 + i12;
            } else {
                i11 = i4;
            }
            int i13 = i4 > i5 ? i5 + i12 : (i5 + i10) - 2;
            com.google.android.material.internal.ab abVar = this.f13284b;
            Object mike = ((J.e) abVar.purple).mike(i11);
            C2474j c2474j = (C2474j) abVar.red;
            c2474j.invoke();
            ((J.e) abVar.purple).alpha(i13, (al) mike);
            c2474j.invoke();
        }
        indigo();
        crimson();
        blue();
    }

    public final void green(al alVar) {
        if (alVar.f13306y.lima > 0) {
            this.f13306y.delta(r0.lima - 1);
        }
        if (this.f13287f != null) {
            alVar.hotel();
        }
        alVar.e = null;
        if (alVar.f13281H > 0) {
            purple(this.f13281H - 1);
        }
        ((L) alVar.f13305x.foxtrot).f13253k = null;
        if (alVar.alpha) {
            this.f13283a--;
            J.e eVar = (J.e) alVar.f13284b.purple;
            Object[] objArr = eVar.alpha;
            int i4 = eVar.red;
            for (int i5 = 0; i5 < i4; i5++) {
                ((L) ((al) objArr[i5]).f13305x.foxtrot).f13253k = null;
            }
        }
        crimson();
        indigo();
    }

    public final void hotel() {
        U.c cVar;
        am amVar;
        C2946x c2946x = this.f13287f;
        String str = null;
        if (c2946x == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            al victor = victor();
            if (victor != null) {
                str = victor.golf(0);
            }
            sb2.append(str);
            AbstractC2264a.charlie(sb2.toString());
            throw new KotlinNothingValueException();
        }
        al victor2 = victor();
        ap apVar = this.f13306y;
        if (victor2 != null) {
            victor2.beige();
            victor2.blue();
            C c3 = apVar.papa;
            ai aiVar = ai.red;
            c3.e = aiVar;
            ay ayVar = apVar.quebec;
            if (ayVar != null) {
                ayVar.f13323c = aiVar;
            }
        }
        am amVar2 = apVar.papa.f13231q;
        amVar2.bravo = true;
        amVar2.charlie = false;
        amVar2.echo = false;
        amVar2.delta = false;
        amVar2.foxtrot = false;
        amVar2.golf = false;
        amVar2.hotel = null;
        ay ayVar2 = apVar.quebec;
        if (ayVar2 != null && (amVar = ayVar2.f13330k) != null) {
            amVar.bravo = true;
            amVar.charlie = false;
            amVar.echo = false;
            amVar.delta = false;
            amVar.foxtrot = false;
            amVar.golf = false;
            amVar.hotel = null;
        }
        C0058p c0058p = this.f13305x;
        L l10 = ((C2563x) c0058p.echo).f13252j;
        for (L l11 = (L) c0058p.foxtrot; !Intrinsics.areEqual(l11, l10) && l11 != null; l11 = l11.f13252j) {
            l11.R();
        }
        T0.d dVar = this.f13279F;
        if (dVar != null) {
            dVar.invoke(c2946x);
        }
        T.r rVar = (g0) c0058p.golf;
        for (T.r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.getParent$ui_release()) {
            if (rVar2.isAttached()) {
                rVar2.runDetachLifecycle$ui_release();
            }
        }
        this.f13290i = true;
        J.e eVar = (J.e) this.f13284b.purple;
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ((al) objArr[i5]).hotel();
        }
        this.f13290i = false;
        while (rVar != null) {
            if (rVar.isAttached()) {
                rVar.markAsDetached$ui_release();
            }
            rVar = rVar.getParent$ui_release();
        }
        c2946x.m368getLayoutNodes().golf(this.purple);
        C2540A c2540a = c2946x.f13860H;
        com.bumptech.glide.load.engine.h hVar = c2540a.bravo;
        ((C1718a) hVar.purple).crimson(this);
        ((C1718a) hVar.red).crimson(this);
        ((C1718a) hVar.silver).crimson(this);
        ((J.e) c2540a.echo.purple).lima(this);
        c2946x.f13923z = true;
        c2946x.getRectManager().india(this);
        if (C2946x.echo() && (cVar = c2946x.f13921y) != null) {
            if (cVar.hotel.echo(this.purple)) {
                cVar.alpha.hotel(cVar.charlie, this.purple, false);
            }
        }
        this.f13287f = null;
        this.red = 9223372034707292159L;
        red(null);
        this.f13289h = 0;
        C c4 = apVar.papa;
        c4.f13217b = LottieConstants.IterateForever;
        c4.f13216a = LottieConstants.IterateForever;
        c4.f13226l = false;
        ay ayVar3 = apVar.quebec;
        if (ayVar3 != null) {
            ayVar3.f13322b = LottieConstants.IterateForever;
            ayVar3.f13321a = LottieConstants.IterateForever;
            ayVar3.f13329j = av.red;
        }
        if (c0058p.foxtrot(8)) {
            A0.k kVar = this.f13292k;
            this.f13292k = null;
            this.f13291j = false;
            c2946x.getSemanticsOwner().bravo(this, kVar);
            c2946x.yankee();
        }
    }

    public final void india(InterfaceC0364r interfaceC0364r, C1564b c1564b) {
        try {
            ((L) this.f13305x.foxtrot).t(interfaceC0364r, c1564b);
        } catch (Throwable th) {
            pink(th);
            throw null;
        }
    }

    public final void indigo() {
        if (this.alpha) {
            al victor = victor();
            if (victor != null) {
                victor.indigo();
                return;
            }
            return;
        }
        this.f13295n = true;
    }

    public final boolean ivory(Q0.a aVar) {
        if (aVar != null) {
            if (this.f13302u == ai.red) {
                echo();
            }
            return this.f13306y.papa.j(aVar.alpha);
        }
        return false;
    }

    public final void kilo() {
        Q0.a aVar;
        if (this.yellow != null) {
            navy(this, false, 5);
        } else {
            olive(this, false, 5);
        }
        C c3 = this.f13306y.papa;
        if (c3.f13218c) {
            aVar = new Q0.a(c3.silver);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            C2946x c2946x = this.f13287f;
            if (c2946x != null) {
                c2946x.sierra(this, aVar.alpha);
                return;
            }
            return;
        }
        C2946x c2946x2 = this.f13287f;
        if (c2946x2 != null) {
            c2946x2.romeo(true);
        }
    }

    public final void lavender() {
        com.google.android.material.internal.ab abVar = this.f13284b;
        int i4 = ((J.e) abVar.purple).red;
        while (true) {
            i4--;
            J.e eVar = (J.e) abVar.purple;
            if (-1 < i4) {
                green((al) eVar.alpha[i4]);
            } else {
                eVar.india();
                ((C2474j) abVar.red).invoke();
                return;
            }
        }
    }

    public final List lima() {
        ay ayVar = this.f13306y.quebec;
        Intrinsics.checkNotNull(ayVar);
        ap apVar = ayVar.white;
        apVar.alpha.oscar();
        boolean z2 = ayVar.f13332m;
        J.e eVar = ayVar.f13331l;
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
                ay ayVar2 = alVar2.f13306y.quebec;
                Intrinsics.checkNotNull(ayVar2);
                eVar.bravo(ayVar2);
            } else {
                ay ayVar3 = alVar2.f13306y.quebec;
                Intrinsics.checkNotNull(ayVar3);
                Object[] objArr2 = eVar.alpha;
                Object obj = objArr2[i5];
                objArr2[i5] = ayVar3;
            }
        }
        eVar.november(((J.e) ((J.b) alVar.oscar()).purple).red, eVar.red);
        ayVar.f13332m = false;
        return eVar.hotel();
    }

    public final void lime(int i4, int i5) {
        if (i5 < 0) {
            AbstractC2264a.alpha("count (" + i5 + ") must be greater than 0");
        }
        int i10 = (i5 + i4) - 1;
        if (i4 > i10) {
            return;
        }
        while (true) {
            com.google.android.material.internal.ab abVar = this.f13284b;
            green((al) ((J.e) abVar.purple).alpha[i10]);
            Object mike = ((J.e) abVar.purple).mike(i10);
            ((C2474j) abVar.red).invoke();
            if (i10 != i4) {
                i10--;
            } else {
                return;
            }
        }
    }

    public final void magenta() {
        al victor;
        if (this.f13302u == ai.red) {
            foxtrot();
        }
        C c3 = this.f13306y.papa;
        ap apVar = c3.white;
        try {
            c3.yellow = true;
            if (!c3.f13219d) {
                AbstractC2264a.bravo("replace called on unplaced item");
            }
            boolean z2 = c3.f13226l;
            c3.i(c3.f13221g, c3.f13223i, c3.f13222h);
            if (z2 && !c3.f13239y && (victor = apVar.alpha.victor()) != null) {
                victor.ochre(false);
            }
        } finally {
        }
    }

    public final void maroon(boolean z2) {
        C2946x c2946x;
        this.white = true;
        if (!this.alpha && (c2946x = this.f13287f) != null) {
            c2946x.xray(this, true, z2);
        }
    }

    public final List mike() {
        return this.f13306y.papa.b();
    }

    @Override // s0.X
    public final boolean november() {
        return cyan();
    }

    public final void ochre(boolean z2) {
        C2946x c2946x;
        this.white = true;
        if (!this.alpha && (c2946x = this.f13287f) != null) {
            c2946x.xray(this, false, z2);
        }
    }

    public final List oscar() {
        return zulu().hotel();
    }

    public final List papa() {
        return ((J.e) this.f13284b.purple).hotel();
    }

    public final void peach() {
        J.e zulu = zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar = (al) objArr[i5];
            ai aiVar = alVar.f13303v;
            alVar.f13302u = aiVar;
            if (aiVar != ai.red) {
                alVar.peach();
            }
        }
    }

    public final void pink(Throwable th) {
        InterfaceC0592y interfaceC0592y = this.f13301t;
        E0 e02 = androidx.compose.runtime.tooling.d.alpha;
        P.i iVar = (P.i) interfaceC0592y;
        iVar.getClass();
        androidx.compose.runtime.tooling.c cVar = (androidx.compose.runtime.tooling.c) C0564b.azure(iVar, e02);
        if (cVar != null) {
            androidx.compose.runtime.tooling.b.alpha(th, new Yb.F(7, cVar, this));
            throw th;
        }
        throw th;
    }

    public final void plum(Q0.d dVar) {
        if (!Intrinsics.areEqual(this.f13298q, dVar)) {
            this.f13298q = dVar;
            blue();
            al victor = victor();
            if (victor != null) {
                victor.beige();
            }
            black();
            for (T.r rVar = (T.r) this.f13305x.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                rVar.onDensityChange();
            }
        }
    }

    public final void purple(int i4) {
        al victor;
        al victor2;
        int i5 = this.f13281H;
        if (i5 != i4) {
            if (i4 > 0 && i5 == 0 && (victor2 = victor()) != null) {
                victor2.purple(victor2.f13281H + 1);
            }
            if (i4 == 0 && this.f13281H > 0 && (victor = victor()) != null) {
                victor.purple(victor.f13281H - 1);
            }
            this.f13281H = i4;
        }
    }

    public final boolean quebec() {
        return this.f13306y.papa.f13229o;
    }

    public final void red(al alVar) {
        if (!Intrinsics.areEqual(alVar, this.yellow)) {
            this.yellow = alVar;
            ap apVar = this.f13306y;
            if (alVar != null) {
                if (apVar.quebec == null) {
                    apVar.quebec = new ay(apVar);
                }
                C0058p c0058p = this.f13305x;
                L l10 = ((C2563x) c0058p.echo).f13252j;
                for (L l11 = (L) c0058p.foxtrot; !Intrinsics.areEqual(l11, l10) && l11 != null; l11 = l11.f13252j) {
                    l11.v();
                }
            } else {
                apVar.quebec = null;
                apVar.foxtrot = false;
                apVar.echo = false;
            }
            blue();
        }
    }

    public final boolean romeo() {
        return this.f13306y.papa.f13228n;
    }

    public final ai sierra() {
        return this.f13306y.papa.e;
    }

    public final void silver(q0.ap apVar) {
        if (!Intrinsics.areEqual(this.f13296o, apVar)) {
            this.f13296o = apVar;
            gd.a aVar = this.f13297p;
            if (aVar != null) {
                ((t0) ((androidx.compose.runtime.ax) aVar.red)).setValue(apVar);
            }
            blue();
        }
    }

    public final ai tango() {
        ai aiVar;
        ay ayVar = this.f13306y.quebec;
        if (ayVar != null && (aiVar = ayVar.f13323c) != null) {
            return aiVar;
        }
        return ai.red;
    }

    public final void teal(T.s sVar) {
        if (this.alpha && this.C != T.p.alpha) {
            AbstractC2264a.alpha("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f13282I) {
            AbstractC2264a.alpha("modifier is updated when deactivated");
        }
        if (cyan()) {
            charlie(sVar);
            if (this.f13291j) {
                coral();
                return;
            }
            return;
        }
        this.f13277D = sVar;
    }

    public final String toString() {
        return t0.W.november(this) + " children: " + ((J.e) ((J.b) oscar()).purple).red + " measurePolicy: " + this.f13296o + " deactivated: " + this.f13282I;
    }

    public final gd.a uniform() {
        gd.a aVar = this.f13297p;
        if (aVar == null) {
            gd.a aVar2 = new gd.a(this, this.f13296o);
            this.f13297p = aVar2;
            return aVar2;
        }
        return aVar;
    }

    public final al victor() {
        al alVar = this.e;
        while (alVar != null && alVar.alpha) {
            alVar = alVar.e;
        }
        return alVar;
    }

    public final int whiskey() {
        return this.f13306y.papa.f13217b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void white(C0 c02) {
        if (!Intrinsics.areEqual(this.f13300s, c02)) {
            this.f13300s = c02;
            C0058p c0058p = this.f13305x;
            if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 16) != 0) {
                for (T.r rVar = (T.r) c0058p.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                    if ((rVar.getKindSet$ui_release() & 16) != 0) {
                        AbstractC2556p abstractC2556p = rVar;
                        ?? r32 = 0;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof b0) {
                                ((b0) abstractC2556p).silver();
                            } else if ((abstractC2556p.getKindSet$ui_release() & 16) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar2 = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r32 = r32;
                                while (rVar2 != null) {
                                    if ((rVar2.getKindSet$ui_release() & 16) != 0) {
                                        i4++;
                                        r32 = r32;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar2;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r32.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r32.bravo(rVar2);
                                        }
                                    }
                                    rVar2 = rVar2.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r32 = r32;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r32);
                        }
                    }
                    if ((rVar.getAggregateChildKindSet$ui_release() & 16) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final A0.k xray() {
        if (cyan() && !this.f13282I && this.f13305x.foxtrot(8)) {
            return this.f13292k;
        }
        return null;
    }

    public final J.e yankee() {
        boolean z2 = this.f13295n;
        J.e eVar = this.f13294m;
        if (z2) {
            eVar.india();
            eVar.charlie(eVar.red, zulu());
            ArraysKt.plum(eVar.alpha, f13276M, 0, eVar.red);
            this.f13295n = false;
        }
        return eVar;
    }

    public final void yellow() {
        if (this.f13283a > 0 && this.f13286d) {
            this.f13286d = false;
            J.e eVar = this.f13285c;
            if (eVar == null) {
                eVar = new J.e(new al[16]);
                this.f13285c = eVar;
            }
            eVar.india();
            J.e eVar2 = (J.e) this.f13284b.purple;
            Object[] objArr = eVar2.alpha;
            int i4 = eVar2.red;
            for (int i5 = 0; i5 < i4; i5++) {
                al alVar = (al) objArr[i5];
                if (alVar.alpha) {
                    eVar.charlie(eVar.red, alVar.zulu());
                } else {
                    eVar.bravo(alVar);
                }
            }
            ap apVar = this.f13306y;
            apVar.papa.f13233s = true;
            ay ayVar = apVar.quebec;
            if (ayVar != null) {
                ayVar.f13332m = true;
            }
        }
    }

    public final J.e zulu() {
        yellow();
        if (this.f13283a == 0) {
            return (J.e) this.f13284b.purple;
        }
        J.e eVar = this.f13285c;
        Intrinsics.checkNotNull(eVar);
        return eVar;
    }

    public al(int i4, boolean z2) {
        this.alpha = z2;
        this.purple = i4;
        this.red = 9223372034707292159L;
        this.silver = 0L;
        this.teal = 9223372034707292159L;
        this.white = true;
        this.f13284b = new com.google.android.material.internal.ab(9, new J.e(new al[16]), new C2474j(2, this));
        this.f13294m = new J.e(new al[16]);
        this.f13295n = true;
        this.f13296o = f13273J;
        this.f13298q = ao.alpha;
        this.f13299r = Q0.n.alpha;
        this.f13300s = f13275L;
        InterfaceC0592y.bronze.getClass();
        this.f13301t = C0591x.bravo;
        ai aiVar = ai.red;
        this.f13302u = aiVar;
        this.f13303v = aiVar;
        this.f13305x = new C0058p(this);
        this.f13306y = new ap(this);
        this.B = true;
        this.C = T.p.alpha;
    }
}
