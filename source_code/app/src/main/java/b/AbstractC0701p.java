package b;

import Yb.C0331t0;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.C1670g;
import f.C1671h;
import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.InterfaceC1673j;
import k0.AbstractC1996c;
import k0.InterfaceC1997d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s0.InterfaceC2554n;
import s0.j0;

/* renamed from: b.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0701p extends AbstractC2556p implements s0.b0, InterfaceC1997d, s0.e0, j0, InterfaceC2553m, s0.P {

    /* renamed from: o, reason: collision with root package name */
    public static final S f3306o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3307a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f3308b;

    /* renamed from: c, reason: collision with root package name */
    public final ar f3309c;

    /* renamed from: d, reason: collision with root package name */
    public H f3310d;
    public m0.ah e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2554n f3311f;

    /* renamed from: g, reason: collision with root package name */
    public C1676m f3312g;

    /* renamed from: h, reason: collision with root package name */
    public C1670g f3313h;

    /* renamed from: i, reason: collision with root package name */
    public final bv.ad f3314i;

    /* renamed from: j, reason: collision with root package name */
    public long f3315j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1673j f3316k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3317l;

    /* renamed from: m, reason: collision with root package name */
    public vf.Y f3318m;

    /* renamed from: n, reason: collision with root package name */
    public final S f3319n;
    public InterfaceC1673j red;
    public H silver;
    public boolean teal;
    public String white;
    public A0.h yellow;

    public AbstractC0701p(InterfaceC1673j interfaceC1673j, H h4, boolean z2, boolean z10, String str, A0.h hVar, Function0 function0) {
        this.red = interfaceC1673j;
        this.silver = h4;
        this.teal = z2;
        this.white = str;
        this.yellow = hVar;
        this.f3307a = z10;
        this.f3308b = function0;
        this.f3309c = new ar(interfaceC1673j, 0, new C0331t0(1, this, AbstractC0701p.class, "onFocusChange", "onFocusChange(Z)V", 0, 6));
        int i4 = bv.s.alpha;
        this.f3314i = new bv.ad(6);
        this.f3315j = 0L;
        InterfaceC1673j interfaceC1673j2 = this.red;
        this.f3316k = interfaceC1673j2;
        this.f3317l = interfaceC1673j2 == null;
        this.f3319n = f3306o;
    }

    @Override // s0.b0
    public final /* synthetic */ void bronze() {
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // k0.InterfaceC1997d
    public final boolean delta(KeyEvent keyEvent) {
        return false;
    }

    public void e(A0.ad adVar) {
    }

    public abstract m0.ah f();

    public void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        m0.ah f5;
        long j6 = ((j5 >> 33) << 32) | (((j5 << 32) >> 33) & 4294967295L);
        this.f3315j = (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32);
        j();
        if (this.f3307a && lVar == m0.l.purple) {
            int i4 = kVar.echo;
            if (i4 == 4) {
                vf.ad.zulu(getCoroutineScope(), null, null, new C0699n(this, null), 3);
            } else if (i4 == 5) {
                vf.ad.zulu(getCoroutineScope(), null, null, new C0700o(this, null), 3);
            }
        }
        if (this.e == null && (f5 = f()) != null) {
            b(f5);
            this.e = f5;
        }
        m0.ah ahVar = this.e;
        if (ahVar != null) {
            ahVar.fuchsia(kVar, lVar, j5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.q, java.lang.Object] */
    public final boolean g() {
        ?? obj = new Object();
        AbstractC2557q.papa(this, d.P.purple, new Ya.c(15, obj));
        if (!obj.alpha) {
            int i4 = ad.bravo;
            ViewParent parent = AbstractC2557q.oscar(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.j0
    public final Object golf() {
        return this.f3319n;
    }

    public final void h() {
        InterfaceC1673j interfaceC1673j = this.red;
        bv.ad adVar = this.f3314i;
        if (interfaceC1673j != null) {
            C1676m c1676m = this.f3312g;
            if (c1676m != null) {
                ((C1674k) interfaceC1673j).bravo(new C1675l(c1676m));
            }
            C1670g c1670g = this.f3313h;
            if (c1670g != null) {
                ((C1674k) interfaceC1673j).bravo(new C1671h(c1670g));
            }
            Object[] objArr = adVar.charlie;
            long[] jArr = adVar.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j5 = jArr[i4];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i10 = 0; i10 < i5; i10++) {
                            if ((255 & j5) < 128) {
                                ((C1674k) interfaceC1673j).bravo(new C1675l((C1676m) objArr[(i4 << 3) + i10]));
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
        }
        this.f3312g = null;
        this.f3313h = null;
        adVar.alpha();
    }

    public final void i() {
        InterfaceC1673j interfaceC1673j = this.red;
        if (interfaceC1673j != null) {
            vf.Y y10 = this.f3318m;
            if (y10 != null && y10.echo()) {
                vf.Y y11 = this.f3318m;
                if (y11 != null) {
                    y11.foxtrot(null);
                }
            } else {
                C1676m c1676m = this.f3312g;
                if (c1676m != null) {
                    vf.ad.zulu(getCoroutineScope(), null, null, new C0691f(null, interfaceC1673j, c1676m), 3);
                }
            }
            this.f3312g = null;
        }
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        A0.h hVar = this.yellow;
        if (hVar != null) {
            Intrinsics.checkNotNull(hVar);
            A0.aa.echo(adVar, hVar.alpha);
        }
        String str = this.white;
        C0686a c0686a = new C0686a(this, 1);
        ge.v[] vVarArr = A0.aa.alpha;
        A0.ac acVar = A0.j.bravo;
        A0.a aVar = new A0.a(str, c0686a);
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(acVar, aVar);
        if (this.f3307a) {
            this.f3309c.india(adVar);
        } else {
            kVar.hotel(A0.x.india, Unit.INSTANCE);
        }
        e(adVar);
    }

    public final void j() {
        H h4;
        if (this.f3311f == null) {
            if (this.teal) {
                h4 = this.f3310d;
            } else {
                h4 = this.silver;
            }
            if (h4 != null) {
                if (this.red == null) {
                    this.red = new C1674k();
                }
                this.f3309c.g(this.red);
                InterfaceC1673j interfaceC1673j = this.red;
                Intrinsics.checkNotNull(interfaceC1673j);
                InterfaceC2554n alpha = h4.alpha(interfaceC1673j);
                b(alpha);
                this.f3311f = alpha;
            }
        }
    }

    @Override // s0.b0
    public final long juliet() {
        return s0.h0.alpha;
    }

    public void k() {
    }

    public abstract boolean l(KeyEvent keyEvent);

    public abstract void m(KeyEvent keyEvent);

    @Override // s0.P
    public final void magenta() {
        if (this.teal) {
            AbstractC2557q.november(this, new C0686a(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r3.f3311f == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(InterfaceC1673j interfaceC1673j, H h4, boolean z2, boolean z10, String str, A0.h hVar, Function0 function0) {
        boolean z11;
        boolean z12;
        InterfaceC2554n interfaceC2554n;
        boolean z13 = false;
        boolean z14 = true;
        if (!Intrinsics.areEqual(this.f3316k, interfaceC1673j)) {
            h();
            this.f3316k = interfaceC1673j;
            this.red = interfaceC1673j;
            z11 = true;
        } else {
            z11 = false;
        }
        if (!Intrinsics.areEqual(this.silver, h4)) {
            this.silver = h4;
            z11 = true;
        }
        if (this.teal != z2) {
            this.teal = z2;
            if (z2) {
                magenta();
            }
            z11 = true;
        }
        boolean z15 = this.f3307a;
        ar arVar = this.f3309c;
        if (z15 != z10) {
            if (z10) {
                b(arVar);
            } else {
                c(arVar);
                h();
            }
            AbstractC2555o.golf(this).coral();
            this.f3307a = z10;
        }
        if (!Intrinsics.areEqual(this.white, str)) {
            this.white = str;
            AbstractC2555o.golf(this).coral();
        }
        if (!Intrinsics.areEqual(this.yellow, hVar)) {
            this.yellow = hVar;
            AbstractC2555o.golf(this).coral();
        }
        this.f3308b = function0;
        boolean z16 = this.f3317l;
        InterfaceC1673j interfaceC1673j2 = this.f3316k;
        if (interfaceC1673j2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z16 != z12) {
            if (interfaceC1673j2 == null) {
                z13 = true;
            }
            this.f3317l = z13;
            if (!z13) {
            }
        }
        z14 = z11;
        if (z14 && ((interfaceC2554n = this.f3311f) != null || !this.f3317l)) {
            if (interfaceC2554n != null) {
                c(interfaceC2554n);
            }
            this.f3311f = null;
            j();
        }
        arVar.g(this.red);
    }

    @Override // T.r
    public final void onAttach() {
        magenta();
        if (!this.f3317l) {
            j();
        }
        if (this.f3307a) {
            b(this.f3309c);
        }
    }

    @Override // T.r
    public final void onDensityChange() {
        xray();
    }

    @Override // T.r
    public final void onDetach() {
        h();
        if (this.f3316k == null) {
            this.red = null;
        }
        InterfaceC2554n interfaceC2554n = this.f3311f;
        if (interfaceC2554n != null) {
            c(interfaceC2554n);
        }
        this.f3311f = null;
    }

    @Override // s0.b0
    public final /* synthetic */ boolean peach() {
        return false;
    }

    @Override // s0.b0
    public final void silver() {
        xray();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // k0.InterfaceC1997d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean victor(KeyEvent keyEvent) {
        boolean z2;
        j();
        long delta = AbstractC1996c.delta(keyEvent);
        boolean z10 = this.f3307a;
        bv.ad adVar = this.f3314i;
        if (z10 && AbstractC1996c.foxtrot(keyEvent) == 2 && androidx.compose.foundation.a.india(keyEvent)) {
            if (!adVar.bravo(delta)) {
                C1676m c1676m = new C1676m(this.f3315j);
                adVar.golf(delta, c1676m);
                if (this.red != null) {
                    vf.ad.zulu(getCoroutineScope(), null, null, new C0697l(this, c1676m, null), 3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (!l(keyEvent) && !z2) {
                return false;
            }
        } else {
            if (this.f3307a && AbstractC1996c.foxtrot(keyEvent) == 1 && androidx.compose.foundation.a.india(keyEvent)) {
                C1676m c1676m2 = (C1676m) adVar.foxtrot(delta);
                if (c1676m2 != null) {
                    if (this.red != null) {
                        vf.ad.zulu(getCoroutineScope(), null, null, new C0698m(this, c1676m2, null), 3);
                    }
                    m(keyEvent);
                }
                if (c1676m2 != null) {
                    return true;
                }
            }
            return false;
        }
    }

    public void xray() {
        C1670g c1670g;
        InterfaceC1673j interfaceC1673j = this.red;
        if (interfaceC1673j != null && (c1670g = this.f3313h) != null) {
            ((C1674k) interfaceC1673j).bravo(new C1671h(c1670g));
        }
        this.f3313h = null;
        m0.ah ahVar = this.e;
        if (ahVar != null) {
            ahVar.xray();
        }
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final boolean yellow() {
        return true;
    }
}
