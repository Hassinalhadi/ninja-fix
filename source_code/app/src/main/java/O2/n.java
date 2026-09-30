package O2;

import Tf.ah;
import Tf.ak;
import Tf.u;
import s6.F6;

/* loaded from: classes3.dex */
public final class n extends o {
    public final ah alpha;
    public final u purple;
    public final String red;
    public final P2.h silver;
    public boolean teal;
    public ak white;

    public n(ah ahVar, u uVar, String str, P2.h hVar) {
        this.alpha = ahVar;
        this.purple = uVar;
        this.red = str;
        this.silver = hVar;
    }

    @Override // O2.o
    public final F6 charlie() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.teal = true;
            ak akVar = this.white;
            if (akVar != null) {
                a3.h.alpha(akVar);
            }
            P2.h hVar = this.silver;
            if (hVar != null) {
                a3.h.alpha(hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O2.o
    public final synchronized Tf.m echo() {
        if (!this.teal) {
            ak akVar = this.white;
            if (akVar != null) {
                return akVar;
            }
            ak charlie = Tf.b.charlie(this.purple.source(this.alpha));
            this.white = charlie;
            return charlie;
        }
        throw new IllegalStateException("closed");
    }
}
