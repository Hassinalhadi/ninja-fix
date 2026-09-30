package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.t0;

/* renamed from: bz.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0788m implements D0 {
    public final g0 alpha;
    public final androidx.compose.runtime.ax purple;
    public r red;
    public long silver;
    public long teal;
    public boolean white;

    public /* synthetic */ C0788m(g0 g0Var, Object obj, r rVar, int i4) {
        this(g0Var, obj, (i4 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return ((t0) this.purple).getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + ((t0) this.purple).getValue() + ", velocity=" + this.alpha.bravo.invoke(this.red) + ", isRunning=" + this.white + ", lastFrameTimeNanos=" + this.silver + ", finishedTimeNanos=" + this.teal + ')';
    }

    public C0788m(g0 g0Var, Object obj, r rVar, long j5, long j6, boolean z2) {
        r rVar2;
        this.alpha = g0Var;
        this.purple = C0564b.zulu(obj);
        if (rVar != null) {
            rVar2 = AbstractC0779d.echo(rVar);
        } else {
            rVar2 = (r) g0Var.alpha.invoke(obj);
            rVar2.delta();
        }
        this.red = rVar2;
        this.silver = j5;
        this.teal = j6;
        this.white = z2;
    }
}
