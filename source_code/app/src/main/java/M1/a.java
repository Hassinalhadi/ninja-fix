package M1;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class a extends MediaDataSource implements AutoCloseable {
    public long alpha;
    public final /* synthetic */ f purple;

    public a(f fVar) {
        this.purple = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j5 < 0) {
            return -1;
        }
        try {
            long j6 = this.alpha;
            f fVar = this.purple;
            if (j6 != j5) {
                if (j6 >= 0 && j5 >= j6 + fVar.alpha.available()) {
                    return -1;
                }
                fVar.echo(j5);
                this.alpha = j5;
            }
            if (i5 > fVar.alpha.available()) {
                i5 = fVar.alpha.available();
            }
            int read = fVar.read(bArr, i4, i5);
            if (read >= 0) {
                this.alpha += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.alpha = -1L;
        return -1;
    }
}
