package Y3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class a extends InputStream {
    public final ByteBuffer alpha;
    public int purple = -1;

    public a(ByteBuffer byteBuffer) {
        this.alpha = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.alpha.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i4) {
        this.purple = this.alpha.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.alpha;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i4 = this.purple;
        if (i4 != -1) {
            this.alpha.position(i4);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        ByteBuffer byteBuffer = this.alpha;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j5, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        ByteBuffer byteBuffer = this.alpha;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i5, byteBuffer.remaining());
        byteBuffer.get(bArr, i4, min);
        return min;
    }
}
