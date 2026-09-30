package d;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ap extends aj {
    public aq e;

    /* renamed from: f, reason: collision with root package name */
    public K f11986f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11987g;

    /* renamed from: h, reason: collision with root package name */
    public ak f11988h;

    /* renamed from: i, reason: collision with root package name */
    public Xd.m f11989i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11990j;

    @Override // d.aj
    public final Object i(ah ahVar, ai aiVar) {
        aq aqVar = this.e;
        b.M m4 = b.M.alpha;
        Object alpha = aqVar.alpha(new am(ahVar, this, null), aiVar);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }

    @Override // d.aj
    public final void j(long j5) {
        if (isAttached() && !Intrinsics.areEqual(this.f11988h, al.alpha)) {
            vf.ad.zulu(getCoroutineScope(), null, vf.ac.silver, new an(this, j5, null), 1);
        }
    }

    @Override // d.aj
    public final void k(long j5) {
        if (isAttached() && !Intrinsics.areEqual(this.f11989i, al.bravo)) {
            vf.ad.zulu(getCoroutineScope(), null, vf.ac.silver, new ao(this, j5, null), 1);
        }
    }

    @Override // d.aj
    public final boolean l() {
        return this.f11987g;
    }
}
