package bx;

import bz.T;
import bz.U;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class r extends androidx.compose.foundation.layout.C {
    public U purple;
    public androidx.compose.runtime.ax red;
    public s silver;
    public long teal;

    @Override // androidx.compose.foundation.layout.C, s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        long j6;
        AbstractC2367C victor = aoVar.victor(j5);
        if (arVar.ivory()) {
            j6 = (victor.alpha << 32) | (victor.purple & 4294967295L);
        } else {
            U u4 = this.purple;
            if (u4 == null) {
                j6 = (victor.alpha << 32) | (victor.purple & 4294967295L);
                this.teal = j6;
            } else {
                long j7 = (victor.purple & 4294967295L) | (victor.alpha << 32);
                Intrinsics.checkNotNull(u4);
                T alpha = u4.alpha(new q(this, j7, 0), new q(this, j7, 1));
                this.silver.getClass();
                j6 = ((Q0.m) alpha.getValue()).alpha;
                this.teal = ((Q0.m) alpha.getValue()).alpha;
            }
        }
        return arVar.papa((int) (j6 >> 32), (int) (4294967295L & j6), kotlin.collections.t.alpha, new p(this, victor, j6));
    }

    @Override // T.r
    public final void onReset() {
        super.onReset();
        this.teal = androidx.compose.animation.a.alpha;
    }
}
