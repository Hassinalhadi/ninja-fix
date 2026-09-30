package Q7;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class j extends InputStream {
    public int alpha;
    public int purple;
    public final /* synthetic */ l red;

    public j(l lVar, i iVar) {
        this.red = lVar;
        this.alpha = lVar.crimson(iVar.alpha + 4);
        this.purple = iVar.bravo;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        if (bArr != null) {
            if ((i4 | i5) >= 0 && i5 <= bArr.length - i4) {
                int i10 = this.purple;
                if (i10 <= 0) {
                    return -1;
                }
                if (i5 > i10) {
                    i5 = i10;
                }
                int i11 = this.alpha;
                l lVar = this.red;
                lVar.azure(i11, i4, i5, bArr);
                this.alpha = lVar.crimson(this.alpha + i5);
                this.purple -= i5;
                return i5;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.purple == 0) {
            return -1;
        }
        l lVar = this.red;
        lVar.alpha.seek(this.alpha);
        int read = lVar.alpha.read();
        this.alpha = lVar.crimson(this.alpha + 1);
        this.purple--;
        return read;
    }
}
