package io.ktor.client.call;

import com.clevertap.android.sdk.Constants;
import dd.C1614e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/call/DoubleReceiveException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Ldd/e;", "call", "<init>", "(Ldd/e;)V", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleReceiveException extends IllegalStateException {

    @NotNull
    private final String message;

    public DoubleReceiveException(@NotNull C1614e call) {
        Intrinsics.echo(call, "call");
        this.message = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
