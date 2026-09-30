package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1488f extends C1489g {
    public final int teal;
    public final int white;

    public C1488f(byte[] bArr, int i4, int i5) {
        super(bArr);
        AbstractC1490h.bravo(i4, i4 + i5, bArr.length);
        this.teal = i4;
        this.white = i5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1489g, com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public final byte alpha(int i4) {
        int i5 = this.white;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(ao.ad.zulu(i4, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.z.juliet("Index > length: ", i4, i5, ", "));
        }
        return this.silver[this.teal + i4];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1489g, com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public final void hotel(int i4, byte[] bArr) {
        System.arraycopy(this.silver, this.teal, bArr, 0, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1489g, com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public final byte india(int i4) {
        return this.silver[this.teal + i4];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1489g
    public final int lima() {
        return this.teal;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1489g, com.google.crypto.tink.shaded.protobuf.AbstractC1490h
    public final int size() {
        return this.white;
    }
}
