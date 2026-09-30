package kotlinx.coroutines;

import Nd.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC3220y;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", "Lvf/y;", "dispatcher", "LNd/h;", "context", "<init>", "(Ljava/lang/Throwable;Lvf/y;LNd/h;)V", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DispatchException extends Exception {

    @NotNull
    private final Throwable cause;

    public DispatchException(@NotNull Throwable th, @NotNull AbstractC3220y abstractC3220y, @NotNull h hVar) {
        super("Coroutine dispatcher " + abstractC3220y + " threw an exception, context = " + hVar, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }
}
