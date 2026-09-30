package d;

import Yb.C0312j0;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import b.C0704t;
import bz.C0797w;
import f.InterfaceC1673j;
import java.util.List;
import k0.AbstractC1994a;
import k0.AbstractC1996c;
import k0.InterfaceC1997d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l0.C2047d;
import l0.C2050g;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s6.P5;

/* renamed from: d.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1530f0 extends aj implements InterfaceC1997d, s0.e0, InterfaceC2553m {
    public C0704t e;

    /* renamed from: f, reason: collision with root package name */
    public C1543m f11991f;

    /* renamed from: g, reason: collision with root package name */
    public final C2047d f11992g;

    /* renamed from: h, reason: collision with root package name */
    public final P f11993h;

    /* renamed from: i, reason: collision with root package name */
    public final C1543m f11994i;

    /* renamed from: j, reason: collision with root package name */
    public final C1548o0 f11995j;

    /* renamed from: k, reason: collision with root package name */
    public final X f11996k;

    /* renamed from: l, reason: collision with root package name */
    public final C1535i f11997l;

    /* renamed from: m, reason: collision with root package name */
    public bz.af f11998m;

    /* renamed from: n, reason: collision with root package name */
    public C1528e0 f11999n;

    /* renamed from: o, reason: collision with root package name */
    public J f12000o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d.P, s0.n, T.r] */
    /* JADX WARN: Type inference failed for: r0v6, types: [k.h, s0.n, T.r] */
    /* JADX WARN: Type inference failed for: r0v7, types: [b.as, s0.n, T.r] */
    public C1530f0(C0704t c0704t, C1543m c1543m, K k6, InterfaceC1532g0 interfaceC1532g0, InterfaceC1673j interfaceC1673j, boolean z2, boolean z10) {
        super(androidx.compose.foundation.gestures.a.alpha, z2, interfaceC1673j, k6);
        C1543m c1543m2;
        this.e = c0704t;
        this.f11991f = c1543m;
        C2047d c2047d = new C2047d();
        this.f11992g = c2047d;
        ?? rVar = new T.r();
        rVar.alpha = z2;
        b(rVar);
        this.f11993h = rVar;
        C1543m c1543m3 = new C1543m(new C0797w(new androidx.core.widget.f(androidx.compose.foundation.gestures.a.delta)));
        this.f11994i = c1543m3;
        C0704t c0704t2 = this.e;
        C1543m c1543m4 = this.f11991f;
        if (c1543m4 == null) {
            c1543m2 = c1543m3;
        } else {
            c1543m2 = c1543m4;
        }
        C1548o0 c1548o0 = new C1548o0(interfaceC1532g0, c0704t2, c1543m2, k6, z10, c2047d, this, new C0312j0(22, this));
        this.f11995j = c1548o0;
        X x4 = new X(c1548o0, z2);
        this.f11996k = x4;
        C1535i c1535i = new C1535i(k6, c1548o0, z10);
        b(c1535i);
        this.f11997l = c1535i;
        b(new C2050g(x4, c2047d));
        b(new Y.aa(2, null, 4));
        ?? rVar2 = new T.r();
        rVar2.alpha = c1535i;
        b(rVar2);
        Ya.c cVar = new Ya.c(29, this);
        ?? rVar3 = new T.r();
        rVar3.alpha = cVar;
        b(rVar3);
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // k0.InterfaceC1997d
    public final boolean delta(KeyEvent keyEvent) {
        return false;
    }

    @Override // d.aj, s0.b0
    public final void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        float lavender;
        float lavender2;
        long j6;
        boolean charlie;
        List list = kVar.alpha;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            if (((Boolean) this.silver.invoke((m0.r) list.get(i4))).booleanValue()) {
                super.fuchsia(kVar, lVar, j5);
                break;
            }
            i4++;
        }
        if (this.teal) {
            if (lVar == m0.l.alpha && kVar.echo == 6) {
                if (this.f12000o == null) {
                    this.f12000o = new J(this.f11995j, new com.google.android.material.internal.s(4, ViewConfiguration.get(AbstractC2557q.oscar(this).getContext())), new P.c(2, this, C1530f0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC2555o.golf(this).f13298q);
                }
                J j7 = this.f12000o;
                if (j7 != null) {
                    vf.ab coroutineScope = getCoroutineScope();
                    if (j7.golf == null) {
                        j7.golf = vf.ad.zulu(coroutineScope, null, null, new F(j7, null), 3);
                    }
                }
            }
            J j10 = this.f12000o;
            if (j10 != null && lVar == m0.l.purple && kVar.echo == 6) {
                List list2 = kVar.alpha;
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (((m0.r) list2.get(i5)).bravo()) {
                        return;
                    }
                }
                Q0.d dVar = j10.delta;
                com.google.android.material.internal.s sVar = j10.bravo;
                int i10 = Build.VERSION.SDK_INT;
                ViewConfiguration viewConfiguration = (ViewConfiguration) sVar.purple;
                if (i10 > 26) {
                    lavender = S0.india(viewConfiguration);
                } else {
                    lavender = dVar.lavender(64);
                }
                float f5 = -lavender;
                if (i10 > 26) {
                    lavender2 = S0.delta(viewConfiguration);
                } else {
                    lavender2 = dVar.lavender(64);
                }
                float f10 = -lavender2;
                Z.b bVar = new Z.b(0L);
                int size3 = list2.size();
                int i11 = 0;
                while (true) {
                    j6 = bVar.alpha;
                    if (i11 >= size3) {
                        break;
                    }
                    bVar = new Z.b(Z.b.golf(j6, ((m0.r) list2.get(i11)).juliet));
                    i11++;
                }
                float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * f10;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f5;
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
                C1548o0 c1548o0 = j10.alpha;
                float golf = c1548o0.golf(c1548o0.echo(floatToRawIntBits));
                if (golf == 0.0f) {
                    charlie = false;
                } else if (golf > 0.0f) {
                    charlie = c1548o0.alpha.delta();
                } else {
                    charlie = c1548o0.alpha.charlie();
                }
                if (charlie ? !(j10.echo.mike(new ay(floatToRawIntBits, ((m0.r) CollectionsKt.gold(list2)).bravo, false)) instanceof xf.k) : j10.foxtrot) {
                    int size4 = list2.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        ((m0.r) list2.get(i12)).alpha();
                    }
                }
            }
        }
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // d.aj
    public final Object i(ah ahVar, ai aiVar) {
        b.M m4 = b.M.purple;
        C1548o0 c1548o0 = this.f11995j;
        Object foxtrot = c1548o0.foxtrot(m4, new Y(ahVar, c1548o0, null), aiVar);
        if (foxtrot == Od.a.alpha) {
            return foxtrot;
        }
        return Unit.INSTANCE;
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        if (this.teal && (this.f11998m == null || this.f11999n == null)) {
            this.f11998m = new bz.af(6, this);
            this.f11999n = new C1528e0(this, null);
        }
        bz.af afVar = this.f11998m;
        if (afVar != null) {
            ge.v[] vVarArr = A0.aa.alpha;
            ((A0.k) adVar).hotel(A0.j.delta, new A0.a(null, afVar));
        }
        C1528e0 c1528e0 = this.f11999n;
        if (c1528e0 != null) {
            ge.v[] vVarArr2 = A0.aa.alpha;
            ((A0.k) adVar).hotel(A0.j.echo, c1528e0);
        }
    }

    @Override // d.aj
    public final void j(long j5) {
    }

    @Override // d.aj
    public final void k(long j5) {
        vf.ad.zulu(this.f11992g.charlie(), null, null, new Z(this, j5, null), 3);
    }

    @Override // d.aj
    public final boolean l() {
        float f5;
        float f10;
        float f11;
        float f12;
        C1548o0 c1548o0 = this.f11995j;
        if (!c1548o0.alpha.alpha()) {
            C0704t c0704t = c1548o0.bravo;
            if (c0704t != null) {
                b.ao aoVar = c0704t.charlie;
                EdgeEffect edgeEffect = aoVar.delta;
                if (edgeEffect != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f12 = E2.f.bravo(edgeEffect);
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect2 = aoVar.echo;
                if (edgeEffect2 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f11 = E2.f.bravo(edgeEffect2);
                    } else {
                        f11 = 0.0f;
                    }
                    if (f11 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect3 = aoVar.foxtrot;
                if (edgeEffect3 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f10 = E2.f.bravo(edgeEffect3);
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect4 = aoVar.golf;
                if (edgeEffect4 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f5 = E2.f.bravo(edgeEffect4);
                    } else {
                        f5 = 0.0f;
                    }
                    if (f5 == 0.0f) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void n(C0704t c0704t, C1543m c1543m, K k6, InterfaceC1532g0 interfaceC1532g0, InterfaceC1673j interfaceC1673j, boolean z2, boolean z10) {
        boolean z11;
        C1543m c1543m2;
        boolean z12 = true;
        boolean z13 = false;
        if (this.teal != z2) {
            this.f11996k.purple = z2;
            this.f11993h.alpha = z2;
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1543m == null) {
            c1543m2 = this.f11994i;
        } else {
            c1543m2 = c1543m;
        }
        C1548o0 c1548o0 = this.f11995j;
        if (!Intrinsics.areEqual(c1548o0.alpha, interfaceC1532g0)) {
            c1548o0.alpha = interfaceC1532g0;
            z13 = true;
        }
        c1548o0.bravo = c0704t;
        if (c1548o0.delta != k6) {
            c1548o0.delta = k6;
            z13 = true;
        }
        if (c1548o0.echo != z10) {
            c1548o0.echo = z10;
        } else {
            z12 = z13;
        }
        c1548o0.charlie = c1543m2;
        c1548o0.foxtrot = this.f11992g;
        C1535i c1535i = this.f11997l;
        c1535i.alpha = k6;
        c1535i.red = z10;
        this.e = c0704t;
        this.f11991f = c1543m;
        com.clevertap.android.sdk.inapp.images.preload.a aVar = androidx.compose.foundation.gestures.a.alpha;
        K k10 = c1548o0.delta;
        K k11 = K.alpha;
        if (k10 != k11) {
            k11 = K.purple;
        }
        m(aVar, z2, interfaceC1673j, k11, z12);
        if (z11) {
            this.f11998m = null;
            this.f11999n = null;
            AbstractC2555o.golf(this).coral();
        }
    }

    @Override // T.r
    public final void onAttach() {
        if (isAttached()) {
            Q0.d dVar = AbstractC2555o.golf(this).f13298q;
            C1543m c1543m = this.f11994i;
            c1543m.getClass();
            c1543m.alpha = new C0797w(new androidx.core.widget.f(dVar));
        }
        J j5 = this.f12000o;
        if (j5 != null) {
            j5.delta = AbstractC2555o.golf(this).f13298q;
        }
    }

    @Override // d.aj, T.r
    public final void onDensityChange() {
        xray();
        if (isAttached()) {
            Q0.d dVar = AbstractC2555o.golf(this).f13298q;
            C1543m c1543m = this.f11994i;
            c1543m.getClass();
            c1543m.alpha = new C0797w(new androidx.core.widget.f(dVar));
        }
        J j5 = this.f12000o;
        if (j5 != null) {
            j5.delta = AbstractC2555o.golf(this).f13298q;
        }
    }

    @Override // k0.InterfaceC1997d
    public final boolean victor(KeyEvent keyEvent) {
        float f5;
        long floatToRawIntBits;
        long j5;
        float f10;
        boolean z2 = false;
        if (!this.teal || ((!AbstractC1994a.alpha(AbstractC1996c.delta(keyEvent), AbstractC1994a.november) && !AbstractC1994a.alpha(P5.alpha(keyEvent.getKeyCode()), AbstractC1994a.mike)) || AbstractC1996c.foxtrot(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.f11995j.delta == K.alpha) {
            z2 = true;
        }
        C1535i c1535i = this.f11997l;
        if (z2) {
            int i4 = (int) (c1535i.f12001a & 4294967295L);
            if (AbstractC1994a.alpha(P5.alpha(keyEvent.getKeyCode()), AbstractC1994a.mike)) {
                f10 = i4;
            } else {
                f10 = -i4;
            }
            long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f10);
            j5 = floatToRawIntBits2 << 32;
        } else {
            int i5 = (int) (c1535i.f12001a >> 32);
            if (AbstractC1994a.alpha(P5.alpha(keyEvent.getKeyCode()), AbstractC1994a.mike)) {
                f5 = i5;
            } else {
                f5 = -i5;
            }
            long floatToRawIntBits3 = Float.floatToRawIntBits(f5);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j5 = floatToRawIntBits3 << 32;
        }
        vf.ad.zulu(getCoroutineScope(), null, null, new C1522b0(this, j5 | (4294967295L & floatToRawIntBits), null), 3);
        return true;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
