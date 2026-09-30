package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.AbstractC2304b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lpd/b;", "response", "", "cachedResponseText", "<init>", "(Lpd/b;Ljava/lang/String;)V", "Lpd/b;", "getResponse", "()Lpd/b;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ResponseException extends IllegalStateException {

    @NotNull
    private final transient AbstractC2304b response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(@NotNull AbstractC2304b response, @NotNull String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        Intrinsics.echo(response, "response");
        Intrinsics.echo(cachedResponseText, "cachedResponseText");
        this.response = response;
    }

    @NotNull
    public final AbstractC2304b getResponse() {
        return this.response;
    }
}
