package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class K extends L {
    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final boolean charlie(long j5, Object obj) {
        return this.alpha.getBoolean(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final byte delta(long j5, Object obj) {
        return this.alpha.getByte(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final double echo(long j5, Object obj) {
        return this.alpha.getDouble(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final float foxtrot(long j5, Object obj) {
        return this.alpha.getFloat(obj, j5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void kilo(Object obj, long j5, boolean z2) {
        this.alpha.putBoolean(obj, j5, z2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void lima(Object obj, long j5, byte b2) {
        this.alpha.putByte(obj, j5, b2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void mike(Object obj, long j5, double d4) {
        this.alpha.putDouble(obj, j5, d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.L
    public final void november(Object obj, long j5, float f5) {
        this.alpha.putFloat(obj, j5, f5);
    }
}
