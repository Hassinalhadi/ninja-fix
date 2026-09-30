package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import bz.AbstractC0779d;
import bz.C0778c;
import bz.InterfaceC0787l;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class J extends androidx.compose.foundation.layout.C {
    public InterfaceC0787l purple;
    public long red;
    public long silver;
    public boolean teal;
    public final androidx.compose.runtime.ax white;

    public J(InterfaceC0787l interfaceC0787l) {
        super(1);
        this.purple = interfaceC0787l;
        this.red = androidx.compose.animation.c.alpha;
        this.silver = Q0.b.bravo(0, 0, 15);
        this.white = C0564b.zulu(null);
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        long j6;
        AbstractC2367C victor;
        long j7;
        char c3;
        long j10;
        G g2;
        long delta;
        G g5;
        boolean z2 = true;
        if (arVar.ivory()) {
            this.silver = j5;
            this.teal = true;
            victor = aoVar.victor(j5);
        } else {
            if (this.teal) {
                j6 = this.silver;
            } else {
                j6 = j5;
            }
            victor = aoVar.victor(j6);
        }
        AbstractC2367C abstractC2367C = victor;
        long j11 = (abstractC2367C.purple & 4294967295L) | (abstractC2367C.alpha << 32);
        if (arVar.ivory()) {
            this.red = j11;
            c3 = ' ';
            delta = j11;
            j10 = delta;
        } else {
            if (!Q0.m.alpha(this.red, androidx.compose.animation.c.alpha)) {
                j7 = this.red;
            } else {
                j7 = j11;
            }
            androidx.compose.runtime.ax axVar = this.white;
            G g10 = (G) ((t0) axVar).getValue();
            if (g10 != null) {
                C0778c c0778c = g10.alpha;
                c3 = ' ';
                j10 = j11;
                if (Q0.m.alpha(j7, ((Q0.m) c0778c.delta()).alpha) || c0778c.echo()) {
                    z2 = false;
                }
                if (Q0.m.alpha(j7, ((Q0.m) ((t0) c0778c.echo).getValue()).alpha) && !z2) {
                    g5 = g10;
                } else {
                    g10.bravo = ((Q0.m) c0778c.delta()).alpha;
                    g5 = g10;
                    vf.ad.zulu(getCoroutineScope(), null, null, new H(g5, j7, this, null), 3);
                }
                g2 = g5;
            } else {
                c3 = ' ';
                j10 = j11;
                long j12 = 1;
                g2 = new G(new C0778c(new Q0.m(j7), AbstractC0779d.quebec, new Q0.m((j12 << 32) | (j12 & 4294967295L)), 8), j7);
            }
            ((t0) axVar).setValue(g2);
            delta = Q0.b.delta(j5, ((Q0.m) g2.alpha.delta()).alpha);
        }
        int i4 = (int) (delta >> c3);
        int i5 = (int) (delta & 4294967295L);
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new I(this, j10, i4, i5, arVar, abstractC2367C));
    }

    @Override // T.r
    public final void onAttach() {
        super.onAttach();
        this.red = androidx.compose.animation.c.alpha;
        this.teal = false;
    }

    @Override // T.r
    public final void onReset() {
        super.onReset();
        ((t0) this.white).setValue(null);
    }
}
