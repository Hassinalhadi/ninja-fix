package e8;

import java.io.OutputStream;

/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1634b extends OutputStream {
    public final /* synthetic */ int alpha;
    public long purple;

    @Override // java.io.OutputStream
    public final void write(int i4) {
        switch (this.alpha) {
            case 0:
                this.purple++;
                return;
            case 1:
                this.purple++;
                return;
            default:
                this.purple++;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.alpha) {
            case 0:
                this.purple += bArr.length;
                return;
            case 1:
                this.purple += bArr.length;
                return;
            default:
                this.purple += bArr.length;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i4, int i5) {
        int i10;
        int length;
        int i11;
        int length2;
        int i12;
        switch (this.alpha) {
            case 0:
                if (i4 >= 0 && i4 <= bArr.length && i5 >= 0 && (i10 = i4 + i5) <= bArr.length && i10 >= 0) {
                    this.purple += i5;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i4 >= 0 && i4 <= (length = bArr.length) && i5 >= 0 && (i11 = i4 + i5) <= length && i11 >= 0) {
                    this.purple += i5;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i4 >= 0 && i4 <= (length2 = bArr.length) && i5 >= 0 && (i12 = i4 + i5) <= length2 && i12 >= 0) {
                    this.purple += i5;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
