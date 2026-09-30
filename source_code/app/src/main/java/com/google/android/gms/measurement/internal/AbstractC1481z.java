package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1481z extends AbstractC1479y {
    public boolean purple;

    public AbstractC1481z(G g2) {
        super(g2);
        ((G) this.alpha).f7527w++;
    }

    public final void X() {
        if (this.purple) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void Y() {
        if (!this.purple) {
            if (!Z()) {
                ((G) this.alpha).f7529y.incrementAndGet();
                this.purple = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean Z();
}
