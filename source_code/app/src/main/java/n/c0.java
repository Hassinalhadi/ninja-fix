package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.p0;
import g4.C1752a;
import s6.J4;

/* loaded from: classes3.dex */
public final class c0 {
    public static final J2.l golf = R.l.bravo(new C1752a(20), new kd.l(21));
    public final androidx.compose.runtime.aw alpha;
    public final androidx.compose.runtime.aw bravo = C0564b.victor(0.0f);
    public final p0 charlie = C0564b.whiskey(0);
    public Z.c delta = Z.c.echo;
    public long echo = D0.am.bravo;
    public final androidx.compose.runtime.ax foxtrot;

    public c0(d.K k6, float f5) {
        this.alpha = C0564b.victor(f5);
        this.foxtrot = C0564b.yankee(k6, androidx.compose.runtime.as.white);
    }

    public final float alpha() {
        return ((n0) this.alpha).juliet();
    }

    public final void bravo(d.K k6, Z.c cVar, int i4, int i5) {
        boolean z2;
        float f5;
        float f10;
        float f11 = i5 - i4;
        ((n0) this.bravo).kilo(f11);
        Z.c cVar2 = this.delta;
        float f12 = cVar2.alpha;
        float f13 = cVar.alpha;
        androidx.compose.runtime.aw awVar = this.alpha;
        float f14 = cVar.bravo;
        if (f13 != f12 || f14 != cVar2.bravo) {
            if (k6 == d.K.alpha) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f13 = f14;
            }
            if (z2) {
                f5 = cVar.delta;
            } else {
                f5 = cVar.charlie;
            }
            float alpha = alpha();
            float f15 = i4;
            float f16 = alpha + f15;
            if (f5 > f16 || (f13 < alpha && f5 - f13 > f15)) {
                f10 = f5 - f16;
            } else if (f13 < alpha && f5 - f13 <= f15) {
                f10 = f13 - alpha;
            } else {
                f10 = 0.0f;
            }
            ((n0) awVar).kilo(alpha() + f10);
            this.delta = cVar;
        }
        ((n0) awVar).kilo(J4.charlie(alpha(), 0.0f, f11));
        this.charlie.kilo(i4);
    }
}
