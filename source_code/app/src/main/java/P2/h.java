package P2;

import java.io.Closeable;

/* loaded from: classes3.dex */
public final class h implements AutoCloseable, Closeable {
    public final c alpha;

    public h(c cVar) {
        this.alpha = cVar;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.alpha.close();
    }
}
