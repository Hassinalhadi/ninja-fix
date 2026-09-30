package com.google.protobuf;

/* renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1501d extends C1502e {
    public final int silver;
    public final int teal;

    public C1501d(byte[] bArr, int i4, int i5) {
        super(bArr);
        C1502e.bravo(i4, i4 + i5, bArr.length);
        this.silver = i4;
        this.teal = i5;
    }

    @Override // com.google.protobuf.C1502e
    public final byte alpha(int i4) {
        int i5 = this.teal;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(ao.ad.zulu(i4, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.z.juliet("Index > length: ", i4, i5, ", "));
        }
        return this.purple[this.silver + i4];
    }

    @Override // com.google.protobuf.C1502e
    public final int delta() {
        return this.silver;
    }

    @Override // com.google.protobuf.C1502e
    public final byte hotel(int i4) {
        return this.purple[this.silver + i4];
    }

    @Override // com.google.protobuf.C1502e
    public final int size() {
        return this.teal;
    }
}
