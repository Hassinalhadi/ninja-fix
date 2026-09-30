package s0;

import a0.C0366t;
import a0.InterfaceC0364r;
import androidx.recyclerview.widget.RecyclerView;
import d0.C1564b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.C2396o;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ad extends L {

    /* renamed from: M, reason: collision with root package name */
    public static final Be.e f13270M;

    /* renamed from: K, reason: collision with root package name */
    public ab f13271K;

    /* renamed from: L, reason: collision with root package name */
    public ac f13272L;

    static {
        Be.e golf = a0.ao.golf();
        golf.oscar(C0366t.hotel);
        golf.xray(1.0f);
        golf.yankee(1);
        f13270M = golf;
    }

    public ad(al alVar, ab abVar) {
        super(alVar);
        this.f13271K = abVar;
        this.f13272L = alVar.yellow != null ? new ac(this) : null;
        if ((abVar.getNode().getKindSet$ui_release() & 512) == 0) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // s0.L
    public final T.r A() {
        return this.f13271K.getNode();
    }

    @Override // s0.L
    public final void O(InterfaceC0364r interfaceC0364r, C1564b c1564b) {
        L l10;
        L l11 = this.f13252j;
        Intrinsics.checkNotNull(l11);
        l11.t(interfaceC0364r, c1564b);
        if (((C2946x) ao.alpha(this.f13251i)).getShowLayoutBounds() && (l10 = this.f13252j) != null) {
            if (!Q0.m.alpha(this.red, l10.red) || !Q0.k.alpha(l10.f13262t, 0L)) {
                long j5 = this.red;
                interfaceC0364r.sierra(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, f13270M);
            }
        }
    }

    public final void a0(ab abVar) {
        if (!Intrinsics.areEqual(abVar, this.f13271K) && (abVar.getNode().getKindSet$ui_release() & 512) != 0) {
            throw new ClassCastException();
        }
        this.f13271K = abVar;
    }

    @Override // s0.at
    public final int c(C2396o c2396o) {
        ac acVar = this.f13272L;
        if (acVar != null) {
            bv.ag agVar = acVar.f13320n;
            int delta = agVar.delta(c2396o);
            if (delta >= 0) {
                return agVar.charlie[delta];
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        return AbstractC2557q.bravo(this, c2396o);
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        ab abVar = this.f13271K;
        L l10 = this.f13252j;
        Intrinsics.checkNotNull(l10);
        return abVar.maxIntrinsicHeight(this, l10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        ab abVar = this.f13271K;
        L l10 = this.f13252j;
        Intrinsics.checkNotNull(l10);
        return abVar.minIntrinsicHeight(this, l10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        ab abVar = this.f13271K;
        L l10 = this.f13252j;
        Intrinsics.checkNotNull(l10);
        return abVar.minIntrinsicWidth(this, l10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        ab abVar = this.f13271K;
        L l10 = this.f13252j;
        Intrinsics.checkNotNull(l10);
        return abVar.maxIntrinsicWidth(this, l10, i4);
    }

    @Override // q0.AbstractC2367C
    public final void silver(long j5, float f5, Function1 function1) {
        P(j5, f5, function1);
        if (!this.f13311c) {
            M();
            i().delta();
            L l10 = this.f13252j;
            Intrinsics.checkNotNull(l10);
            l10.getClass();
        }
    }

    @Override // s0.L
    public final void v() {
        if (this.f13272L == null) {
            this.f13272L = new ac(this);
        }
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        a(j5);
        ab abVar = this.f13271K;
        L l10 = this.f13252j;
        Intrinsics.checkNotNull(l10);
        S(abVar.mo0measure3p2s80s(this, l10, j5));
        L();
        return this;
    }

    @Override // s0.L
    public final au y() {
        return this.f13272L;
    }
}
