package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1301c2 extends AbstractC1306d2 {
    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final double alpha(long j5, Object obj) {
        return Double.longBitsToDouble(this.alpha.getLong(obj, j5));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final float bravo(long j5, Object obj) {
        return Float.intBitsToFloat(this.alpha.getInt(obj, j5));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final void charlie(Object obj, long j5, boolean z2) {
        if (AbstractC1311e2.golf) {
            AbstractC1311e2.bravo(obj, j5, z2 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1311e2.charlie(obj, j5, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final void delta(Object obj, long j5, byte b2) {
        if (AbstractC1311e2.golf) {
            AbstractC1311e2.bravo(obj, j5, b2);
        } else {
            AbstractC1311e2.charlie(obj, j5, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final void echo(Object obj, long j5, double d4) {
        this.alpha.putLong(obj, j5, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final void foxtrot(Object obj, long j5, float f5) {
        this.alpha.putInt(obj, j5, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1306d2
    public final boolean golf(long j5, Object obj) {
        if (AbstractC1311e2.golf) {
            return AbstractC1311e2.lima(j5, obj);
        }
        return AbstractC1311e2.mike(j5, obj);
    }
}
