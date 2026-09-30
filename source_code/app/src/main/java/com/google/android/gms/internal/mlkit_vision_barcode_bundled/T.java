package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes2.dex */
public final class T extends V {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final double alpha(long j5, Object obj) {
        return Double.longBitsToDouble(this.alpha.getLong(obj, j5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final float bravo(long j5, Object obj) {
        return Float.intBitsToFloat(this.alpha.getInt(obj, j5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final void charlie(Object obj, long j5, boolean z2) {
        if (W.golf) {
            W.bravo(obj, j5, z2 ? (byte) 1 : (byte) 0);
        } else {
            W.charlie(obj, j5, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final void delta(Object obj, long j5, byte b2) {
        if (W.golf) {
            W.bravo(obj, j5, b2);
        } else {
            W.charlie(obj, j5, b2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final void echo(Object obj, long j5, double d4) {
        this.alpha.putLong(obj, j5, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final void foxtrot(Object obj, long j5, float f5) {
        this.alpha.putInt(obj, j5, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.V
    public final boolean golf(long j5, Object obj) {
        if (W.golf) {
            return W.lima(j5, obj);
        }
        return W.mike(j5, obj);
    }
}
