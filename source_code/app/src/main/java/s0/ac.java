package s0;

import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.C2396o;

/* loaded from: classes3.dex */
public final class ac extends au {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ad f13269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar) {
        super(adVar);
        this.f13269o = adVar;
    }

    @Override // s0.at
    public final int c(C2396o c2396o) {
        int bravo = AbstractC2557q.bravo(this, c2396o);
        this.f13320n.hotel(bravo, c2396o);
        return bravo;
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        ad adVar = this.f13269o;
        ab abVar = adVar.f13271K;
        L l10 = adVar.f13252j;
        Intrinsics.checkNotNull(l10);
        au y10 = l10.y();
        Intrinsics.checkNotNull(y10);
        return abVar.maxIntrinsicHeight(this, y10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        ad adVar = this.f13269o;
        ab abVar = adVar.f13271K;
        L l10 = adVar.f13252j;
        Intrinsics.checkNotNull(l10);
        au y10 = l10.y();
        Intrinsics.checkNotNull(y10);
        return abVar.minIntrinsicHeight(this, y10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        ad adVar = this.f13269o;
        ab abVar = adVar.f13271K;
        L l10 = adVar.f13252j;
        Intrinsics.checkNotNull(l10);
        au y10 = l10.y();
        Intrinsics.checkNotNull(y10);
        return abVar.minIntrinsicWidth(this, y10, i4);
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        ad adVar = this.f13269o;
        ab abVar = adVar.f13271K;
        L l10 = adVar.f13252j;
        Intrinsics.checkNotNull(l10);
        au y10 = l10.y();
        Intrinsics.checkNotNull(y10);
        return abVar.maxIntrinsicWidth(this, y10, i4);
    }

    @Override // q0.ao
    public final AbstractC2367C victor(long j5) {
        a(j5);
        new Q0.a(j5);
        ad adVar = this.f13269o;
        adVar.getClass();
        ab abVar = adVar.f13271K;
        L l10 = adVar.f13252j;
        Intrinsics.checkNotNull(l10);
        au y10 = l10.y();
        Intrinsics.checkNotNull(y10);
        au.p(this, abVar.mo0measure3p2s80s(this, y10, j5));
        return this;
    }
}
