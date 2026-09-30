package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1353n1 extends C1361p1 {
    public final int silver;

    public C1353n1(int i4, byte[] bArr) {
        super(bArr);
        C1361p1.hotel(0, i4, bArr.length);
        this.silver = i4;
    }

    @Override // com.google.android.gms.internal.measurement.C1361p1
    public final byte alpha(int i4) {
        int i5 = this.silver;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(ao.ad.zulu(i4, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.z.juliet("Index > length: ", i4, i5, ", "));
        }
        return this.purple[i4];
    }

    @Override // com.google.android.gms.internal.measurement.C1361p1
    public final byte bravo(int i4) {
        return this.purple[i4];
    }

    @Override // com.google.android.gms.internal.measurement.C1361p1
    public final int delta() {
        return this.silver;
    }
}
