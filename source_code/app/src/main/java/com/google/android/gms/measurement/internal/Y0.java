package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class Y0 {
    public final Z0 alpha;
    public int bravo = 1;
    public long charlie = alpha();

    public Y0(Z0 z02) {
        this.alpha = z02;
    }

    public final long alpha() {
        Z0 z02 = this.alpha;
        V5.x.hotel(z02);
        long longValue = ((Long) ac.victor.alpha(null)).longValue();
        long longValue2 = ((Long) ac.whiskey.alpha(null)).longValue();
        for (int i4 = 1; i4 < this.bravo; i4++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        z02.pink().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
