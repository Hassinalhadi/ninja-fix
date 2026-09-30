package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1429x extends C1430y {
    public final int silver;
    public final int teal;

    public C1429x(byte[] bArr, int i4, int i5) {
        super(bArr);
        AbstractC1431z.tango(i4, i4 + i5, bArr.length);
        this.silver = i4;
        this.teal = i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final byte alpha(int i4) {
        AbstractC1431z.xray(i4, this.teal);
        return this.red[this.silver + i4];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final byte bravo(int i4) {
        return this.red[this.silver + i4];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final int hotel() {
        return this.teal;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z
    public final void india(int i4, int i5, int i10, byte[] bArr) {
        System.arraycopy(this.red, this.silver + i4, bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y
    public final int yankee() {
        return this.silver;
    }
}
