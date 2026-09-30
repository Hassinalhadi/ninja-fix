package Y3;

import com.bumptech.glide.load.resource.bitmap.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class e extends InputStream implements AutoCloseable {
    public static final ArrayDeque red;
    public w alpha;
    public IOException purple;

    static {
        char[] cArr = l.alpha;
        red = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.alpha.available();
    }

    public final void charlie() {
        this.purple = null;
        this.alpha = null;
        ArrayDeque arrayDeque = red;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        this.alpha.mark(i4);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.alpha.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.alpha.read();
        } catch (IOException e) {
            this.purple = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.alpha.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j5) {
        try {
            return this.alpha.skip(j5);
        } catch (IOException e) {
            this.purple = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.alpha.read(bArr);
        } catch (IOException e) {
            this.purple = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        try {
            return this.alpha.read(bArr, i4, i5);
        } catch (IOException e) {
            this.purple = e;
            throw e;
        }
    }
}
