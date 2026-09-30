package b;

import Yb.C0312j0;
import d.C1530f0;
import d.C1543m;
import d.InterfaceC1532g0;
import f.C1674k;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s0.InterfaceC2554n;

/* loaded from: classes3.dex */
public final class h0 extends AbstractC2556p implements InterfaceC2553m, s0.P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3300a;

    /* renamed from: b, reason: collision with root package name */
    public C0704t f3301b;

    /* renamed from: c, reason: collision with root package name */
    public C1530f0 f3302c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC2556p f3303d;
    public C0705u e;

    /* renamed from: f, reason: collision with root package name */
    public C0704t f3304f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3305g;
    public InterfaceC1532g0 red;
    public d.K silver;
    public boolean teal;
    public C1543m white;
    public C1674k yellow;

    public final void e() {
        C0704t c0704t;
        InterfaceC2554n interfaceC2554n = this.f3303d;
        if (interfaceC2554n == null) {
            if (this.f3300a) {
                AbstractC2557q.november(this, new C0312j0(10, this));
            }
            if (this.f3300a) {
                c0704t = this.f3304f;
            } else {
                c0704t = this.f3301b;
            }
            if (c0704t != null) {
                AbstractC2556p abstractC2556p = c0704t.india;
                if (!abstractC2556p.getNode().isAttached()) {
                    b(abstractC2556p);
                    this.f3303d = abstractC2556p;
                    return;
                }
                return;
            }
            return;
        }
        if (!interfaceC2554n.getNode().isAttached()) {
            b(interfaceC2554n);
        }
    }

    public final boolean f() {
        Q0.n nVar = Q0.n.alpha;
        if (isAttached()) {
            nVar = AbstractC2555o.golf(this).f13299r;
        }
        d.K k6 = this.silver;
        if (nVar == Q0.n.purple && k6 != d.K.alpha) {
            return false;
        }
        return true;
    }

    public final void g(C0704t c0704t, C1543m c1543m, d.K k6, InterfaceC1532g0 interfaceC1532g0, C1674k c1674k, boolean z2, boolean z10) {
        boolean z11;
        C0704t c0704t2;
        this.red = interfaceC1532g0;
        this.silver = k6;
        boolean z12 = true;
        if (this.f3300a != z2) {
            this.f3300a = z2;
            z11 = true;
        } else {
            z11 = false;
        }
        if (!Intrinsics.areEqual(this.f3301b, c0704t)) {
            this.f3301b = c0704t;
        } else {
            z12 = false;
        }
        if (z11 || (z12 && !z2)) {
            AbstractC2556p abstractC2556p = this.f3303d;
            if (abstractC2556p != null) {
                c(abstractC2556p);
            }
            this.f3303d = null;
            e();
        }
        this.teal = z10;
        this.white = c1543m;
        this.yellow = c1674k;
        boolean f5 = f();
        this.f3305g = f5;
        C1530f0 c1530f0 = this.f3302c;
        if (c1530f0 != null) {
            if (this.f3300a) {
                c0704t2 = this.f3304f;
            } else {
                c0704t2 = this.f3301b;
            }
            c1530f0.n(c0704t2, c1543m, k6, interfaceC1532g0, c1674k, z10, f5);
        }
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.P
    public final void magenta() {
        C0704t c0704t;
        C0705u c0705u = (C0705u) AbstractC2557q.echo(this, V.alpha);
        if (!Intrinsics.areEqual(c0705u, this.e)) {
            this.e = c0705u;
            this.f3304f = null;
            AbstractC2556p abstractC2556p = this.f3303d;
            if (abstractC2556p != null) {
                c(abstractC2556p);
            }
            this.f3303d = null;
            e();
            C1530f0 c1530f0 = this.f3302c;
            if (c1530f0 != null) {
                InterfaceC1532g0 interfaceC1532g0 = this.red;
                d.K k6 = this.silver;
                if (this.f3300a) {
                    c0704t = this.f3304f;
                } else {
                    c0704t = this.f3301b;
                }
                C0704t c0704t2 = c0704t;
                c1530f0.n(c0704t2, this.white, k6, interfaceC1532g0, this.yellow, this.teal, this.f3305g);
            }
        }
    }

    @Override // T.r
    public final void onAttach() {
        C0704t c0704t;
        this.f3305g = f();
        e();
        if (this.f3302c == null) {
            InterfaceC1532g0 interfaceC1532g0 = this.red;
            if (this.f3300a) {
                c0704t = this.f3304f;
            } else {
                c0704t = this.f3301b;
            }
            C0704t c0704t2 = c0704t;
            C1530f0 c1530f0 = new C1530f0(c0704t2, this.white, this.silver, interfaceC1532g0, this.yellow, this.teal, this.f3305g);
            b(c1530f0);
            this.f3302c = c1530f0;
        }
    }

    @Override // T.r
    public final void onDetach() {
        AbstractC2556p abstractC2556p = this.f3303d;
        if (abstractC2556p != null) {
            c(abstractC2556p);
        }
    }

    @Override // T.r
    public final void onLayoutDirectionChange() {
        C0704t c0704t;
        boolean f5 = f();
        if (this.f3305g != f5) {
            this.f3305g = f5;
            InterfaceC1532g0 interfaceC1532g0 = this.red;
            d.K k6 = this.silver;
            boolean z2 = this.f3300a;
            if (z2) {
                c0704t = this.f3304f;
            } else {
                c0704t = this.f3301b;
            }
            C0704t c0704t2 = c0704t;
            g(c0704t2, this.white, k6, interfaceC1532g0, this.yellow, z2, this.teal);
        }
    }
}
