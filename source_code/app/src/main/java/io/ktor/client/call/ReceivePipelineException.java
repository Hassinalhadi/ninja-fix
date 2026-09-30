package io.ktor.client.call;

import Ed.a;
import com.clevertap.android.sdk.leanplum.Constants;
import dd.C1614e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/call/ReceivePipelineException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Ldd/e;", "request", "LEd/a;", Constants.INFO_PARAM, "", "cause", "<init>", "(Ldd/e;LEd/a;Ljava/lang/Throwable;)V", "Ldd/e;", "getRequest", "()Ldd/e;", "LEd/a;", "getInfo", "()LEd/a;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReceivePipelineException extends IllegalStateException {

    @NotNull
    private final Throwable cause;

    @NotNull
    private final a info;

    @NotNull
    private final C1614e request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(@NotNull C1614e request, @NotNull a info, @NotNull Throwable cause) {
        super("Fail to run receive pipeline: " + cause);
        Intrinsics.echo(request, "request");
        Intrinsics.echo(info, "info");
        Intrinsics.echo(cause, "cause");
        this.request = request;
        this.info = info;
        this.cause = cause;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final a getInfo() {
        return this.info;
    }

    @NotNull
    public final C1614e getRequest() {
        return this.request;
    }
}
