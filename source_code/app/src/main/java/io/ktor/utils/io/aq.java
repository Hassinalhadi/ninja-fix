package io.ktor.utils.io;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class aq implements t {
    public final Gf.a bravo;

    @Nullable
    private volatile am closed;

    public aq(Gf.a aVar) {
        this.bravo = aVar;
    }

    @Override // io.ktor.utils.io.t
    public final void delta(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new am(new IOException(message, th));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable echo() {
        am amVar = this.closed;
        if (amVar != null) {
            return amVar.alpha(al.alpha);
        }
        return null;
    }

    @Override // io.ktor.utils.io.t
    public final Object foxtrot(int i4, Pd.c cVar) {
        Throwable echo = echo();
        if (echo == null) {
            return Boolean.valueOf(this.bravo.request(i4));
        }
        throw echo;
    }

    @Override // io.ktor.utils.io.t
    public final Gf.a golf() {
        Throwable echo = echo();
        if (echo == null) {
            return this.bravo;
        }
        throw echo;
    }

    @Override // io.ktor.utils.io.t
    public final boolean hotel() {
        return this.bravo.hotel();
    }
}
