package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class P extends G3.a {
    public boolean purple;

    public P(G g2) {
        super(g2);
        ((G) this.alpha).f7527w++;
    }

    public abstract boolean X();

    public final void Y() {
        if (this.purple) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void Z() {
        if (!this.purple) {
            if (!X()) {
                ((G) this.alpha).f7529y.incrementAndGet();
                this.purple = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
