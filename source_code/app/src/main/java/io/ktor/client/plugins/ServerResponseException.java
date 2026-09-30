package io.ktor.client.plugins;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.AbstractC2304b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ServerResponseException;", "Lio/ktor/client/plugins/ResponseException;", "Lpd/b;", "response", "", "cachedResponseText", "<init>", "(Lpd/b;Ljava/lang/String;)V", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ServerResponseException extends ResponseException {

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(@NotNull AbstractC2304b response, @NotNull String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.echo(response, "response");
        Intrinsics.echo(cachedResponseText, "cachedResponseText");
        this.message = "Server error(" + response.bravo().delta().uniform().alpha + ' ' + response.bravo().delta().getUrl() + ": " + response.golf() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
