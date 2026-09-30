package P2;

import Aa.l;
import Tf.ao;
import Tf.k;
import Tf.w;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class g extends w {
    public final l alpha;
    public boolean purple;

    public g(ao aoVar, l lVar) {
        super(aoVar);
        this.alpha = lVar;
    }

    @Override // Tf.w, Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.purple = true;
            this.alpha.invoke(e);
        }
    }

    @Override // Tf.w, Tf.ao, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.purple = true;
            this.alpha.invoke(e);
        }
    }

    @Override // Tf.w, Tf.ao
    public final void write(k kVar, long j5) {
        if (this.purple) {
            kVar.india(j5);
            return;
        }
        try {
            super.write(kVar, j5);
        } catch (IOException e) {
            this.purple = true;
            this.alpha.invoke(e);
        }
    }
}
