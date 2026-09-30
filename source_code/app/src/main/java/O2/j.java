package O2;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class j extends InputStream implements AutoCloseable {
    public final InputStream alpha;
    public int purple = 1073741824;

    public j(InputStream inputStream) {
        this.alpha = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.purple;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.alpha.read();
        if (read == -1) {
            this.purple = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        return this.alpha.skip(j5);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.alpha.read(bArr);
        if (read == -1) {
            this.purple = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.alpha.read(bArr, i4, i5);
        if (read == -1) {
            this.purple = 0;
        }
        return read;
    }
}
