package i9;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class e implements Closeable, AutoCloseable {
    public final InputStream[] alpha;
    public final long[] purple;

    public e(InputStream[] inputStreamArr, long[] jArr) {
        this.alpha = inputStreamArr;
        this.purple = jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.alpha) {
            Charset charset = g.alpha;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }
}
