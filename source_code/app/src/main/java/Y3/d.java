package Y3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class d extends FilterInputStream {
    public final long alpha;
    public int purple;

    public d(InputStream inputStream, long j5) {
        super(inputStream);
        this.alpha = j5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.alpha - this.purple, ((FilterInputStream) this).in.available());
    }

    public final void charlie(int i4) {
        if (i4 >= 0) {
            this.purple += i4;
            return;
        }
        long j5 = this.purple;
        long j6 = this.alpha;
        if (j6 - j5 <= 0) {
            return;
        }
        StringBuilder uniform = Q0.c.uniform("Failed to read all expected data, expected: ", j6, ", but read: ");
        uniform.append(this.purple);
        throw new IOException(uniform.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        charlie(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i4, int i5) {
        int read;
        read = super.read(bArr, i4, i5);
        charlie(read);
        return read;
    }
}
