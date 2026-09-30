package N2;

import a0.AbstractC0367u;
import android.os.SystemClock;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.t0;
import av.ah;
import f0.AbstractC1680b;
import q0.AbstractC2375K;
import q0.InterfaceC2392k;
import s6.J4;
import t6.M2;

/* loaded from: classes3.dex */
public final class x extends AbstractC1680b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1868b;
    public AbstractC1680b purple;
    public final AbstractC1680b red;
    public final InterfaceC2392k silver;
    public final int teal;
    public final boolean white;
    public final p0 yellow = C0564b.whiskey(0);

    /* renamed from: a, reason: collision with root package name */
    public long f1867a = -1;

    /* renamed from: c, reason: collision with root package name */
    public final aw f1869c = C0564b.victor(1.0f);

    /* renamed from: d, reason: collision with root package name */
    public final ax f1870d = C0564b.zulu(null);

    public x(AbstractC1680b abstractC1680b, AbstractC1680b abstractC1680b2, InterfaceC2392k interfaceC2392k, int i4, boolean z2) {
        this.purple = abstractC1680b;
        this.red = abstractC1680b2;
        this.silver = interfaceC2392k;
        this.teal = i4;
        this.white = z2;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyAlpha(float f5) {
        ((n0) this.f1869c).kilo(f5);
        return true;
    }

    @Override // f0.AbstractC1680b
    public final boolean applyColorFilter(AbstractC0367u abstractC0367u) {
        ((t0) this.f1870d).setValue(abstractC0367u);
        return true;
    }

    public final void charlie(c0.d dVar, AbstractC1680b abstractC1680b, float f5) {
        long juliet;
        if (abstractC1680b != null && f5 > 0.0f) {
            long bravo = dVar.bravo();
            long mo1getIntrinsicSizeNHjbRc = abstractC1680b.mo1getIntrinsicSizeNHjbRc();
            if (mo1getIntrinsicSizeNHjbRc == 9205357640488583168L || Z.e.echo(mo1getIntrinsicSizeNHjbRc) || bravo == 9205357640488583168L || Z.e.echo(bravo)) {
                juliet = bravo;
            } else {
                juliet = AbstractC2375K.juliet(mo1getIntrinsicSizeNHjbRc, this.silver.alpha(mo1getIntrinsicSizeNHjbRc, bravo));
            }
            ax axVar = this.f1870d;
            if (bravo == 9205357640488583168L || Z.e.echo(bravo)) {
                abstractC1680b.m205drawx_KDEd0(dVar, juliet, f5, (AbstractC0367u) ((t0) axVar).getValue());
                return;
            }
            float f10 = 2;
            float delta = (Z.e.delta(bravo) - Z.e.delta(juliet)) / f10;
            float bravo2 = (Z.e.bravo(bravo) - Z.e.bravo(juliet)) / f10;
            ((ah) dVar.lime().alpha).navy(delta, bravo2, delta, bravo2);
            abstractC1680b.m205drawx_KDEd0(dVar, juliet, f5, (AbstractC0367u) ((t0) axVar).getValue());
            ah ahVar = (ah) dVar.lime().alpha;
            float f11 = -delta;
            float f12 = -bravo2;
            ahVar.navy(f11, f12, f11, f12);
        }
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1getIntrinsicSizeNHjbRc() {
        long j5;
        boolean z2;
        AbstractC1680b abstractC1680b = this.purple;
        long j6 = 0;
        if (abstractC1680b != null) {
            j5 = abstractC1680b.mo1getIntrinsicSizeNHjbRc();
        } else {
            j5 = 0;
        }
        AbstractC1680b abstractC1680b2 = this.red;
        if (abstractC1680b2 != null) {
            j6 = abstractC1680b2.mo1getIntrinsicSizeNHjbRc();
        }
        boolean z10 = false;
        if (j5 != 9205357640488583168L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j6 != 9205357640488583168L) {
            z10 = true;
        }
        if (!z2 || !z10) {
            return 9205357640488583168L;
        }
        return M2.alpha(Math.max(Z.e.delta(j5), Z.e.delta(j6)), Math.max(Z.e.bravo(j5), Z.e.bravo(j6)));
    }

    @Override // f0.AbstractC1680b
    public final void onDraw(c0.d dVar) {
        float juliet;
        boolean z2;
        boolean z10 = this.f1868b;
        aw awVar = this.f1869c;
        AbstractC1680b abstractC1680b = this.red;
        if (z10) {
            charlie(dVar, abstractC1680b, ((n0) awVar).juliet());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1867a == -1) {
            this.f1867a = uptimeMillis;
        }
        float f5 = ((float) (uptimeMillis - this.f1867a)) / this.teal;
        float juliet2 = ((n0) awVar).juliet() * J4.charlie(f5, 0.0f, 1.0f);
        if (this.white) {
            juliet = ((n0) awVar).juliet() - juliet2;
        } else {
            juliet = ((n0) awVar).juliet();
        }
        if (f5 >= 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1868b = z2;
        charlie(dVar, this.purple, juliet);
        charlie(dVar, abstractC1680b, juliet2);
        if (this.f1868b) {
            this.purple = null;
        } else {
            p0 p0Var = this.yellow;
            p0Var.kilo(p0Var.juliet() + 1);
        }
    }
}
