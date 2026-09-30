package vf;

import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class d0 extends Af.q implements Runnable {
    public final long teal;

    public d0(long j5, Pd.c cVar) {
        super(cVar, cVar.getContext());
        this.teal = j5;
    }

    @Override // vf.P
    public final String navy() {
        return super.navy() + "(timeMillis=" + this.teal + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad.quebec(this.red);
        victor(new TimeoutCancellationException("Timed out waiting for " + this.teal + " ms", this));
    }
}
