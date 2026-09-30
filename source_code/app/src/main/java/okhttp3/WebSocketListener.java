package okhttp3;

import Tf.n;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0011J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J)\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/WebSocketListener;", "", "<init>", "()V", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "", Constants.KEY_TEXT, "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "LTf/n;", "bytes", "(Lokhttp3/WebSocket;LTf/n;)V", "", "code", "reason", "onClosing", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosed", "", "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(reason, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(reason, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t5, @Nullable Response response) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(t5, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull n bytes) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(bytes, "bytes");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(response, "response");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        Intrinsics.echo(webSocket, "webSocket");
        Intrinsics.echo(text, "text");
    }
}
