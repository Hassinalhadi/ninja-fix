package com.google.android.gms.measurement.internal;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC1481z {
    public com.google.android.gms.internal.measurement.ai red;
    public boolean silver;
    public final androidx.core.widget.f teal;
    public final bz.m0 white;
    public final J2.l yellow;

    /* JADX WARN: Type inference failed for: r2v4, types: [J2.l, java.lang.Object] */
    public O0(G g2) {
        super(g2);
        this.silver = true;
        this.teal = new androidx.core.widget.f(26, this);
        this.white = new bz.m0(this);
        ?? obj = new Object();
        obj.purple = this;
        this.yellow = obj;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return false;
    }

    public final void a0() {
        W();
        if (this.red == null) {
            this.red = new com.google.android.gms.internal.measurement.ai(Looper.getMainLooper(), 0);
        }
    }
}
