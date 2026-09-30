package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class U0 extends T0 {
    public boolean red;

    public U0(Z0 z02) {
        super(z02);
        this.purple.f7547k++;
    }

    public final void X() {
        if (this.red) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void Y() {
        if (!this.red) {
            Z();
            this.purple.f7548l++;
            this.red = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void Z();
}
