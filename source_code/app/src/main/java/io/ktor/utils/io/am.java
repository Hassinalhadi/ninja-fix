package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import vf.InterfaceC3217v;

/* loaded from: classes2.dex */
public final class am {
    public final Throwable alpha;

    public am(Throwable th) {
        this.alpha = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable alpha(Function1 function1) {
        Throwable th = this.alpha;
        if (th == 0) {
            return null;
        }
        if (th instanceof InterfaceC3217v) {
            return ((InterfaceC3217v) th).createCopy();
        }
        if (th instanceof CancellationException) {
            return vf.ad.alpha(((CancellationException) th).getMessage(), th);
        }
        return (Throwable) function1.invoke(th);
    }
}
