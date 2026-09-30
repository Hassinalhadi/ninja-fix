package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0598e extends C0599f {
    public final int teal;
    public final int white;

    public C0598e(byte[] bArr, int i4, int i5) {
        super(bArr);
        C0599f.bravo(i4, i4 + i5, bArr.length);
        this.teal = i4;
        this.white = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0599f
    public final byte alpha(int i4) {
        int i5 = this.white;
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(ao.ad.zulu(i4, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.z.juliet("Index > length: ", i4, i5, ", "));
        }
        return this.purple[this.teal + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0599f
    public final void hotel(int i4, byte[] bArr) {
        System.arraycopy(this.purple, this.teal, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.C0599f
    public final int india() {
        return this.teal;
    }

    @Override // androidx.datastore.preferences.protobuf.C0599f
    public final byte kilo(int i4) {
        return this.purple[this.teal + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0599f
    public final int size() {
        return this.white;
    }
}
