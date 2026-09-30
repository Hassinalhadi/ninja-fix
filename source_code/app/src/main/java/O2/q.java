package O2;

import Tf.ak;
import Tf.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.F6;

/* loaded from: classes3.dex */
public final class q extends o {
    public final F6 alpha;
    public boolean purple;
    public Tf.m red;
    public final Function0 silver;

    public q(Tf.m mVar, Function0 function0, F6 f62) {
        this.alpha = f62;
        this.red = mVar;
        this.silver = function0;
    }

    @Override // O2.o
    public final F6 charlie() {
        return this.alpha;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.purple = true;
        Tf.m mVar = this.red;
        if (mVar != null) {
            a3.h.alpha(mVar);
        }
    }

    @Override // O2.o
    public final synchronized Tf.m echo() {
        if (!this.purple) {
            Tf.m mVar = this.red;
            if (mVar != null) {
                return mVar;
            }
            u uVar = u.SYSTEM;
            Intrinsics.checkNotNull(null);
            ak charlie = Tf.b.charlie(uVar.source(null));
            this.red = charlie;
            return charlie;
        }
        throw new IllegalStateException("closed");
    }
}
