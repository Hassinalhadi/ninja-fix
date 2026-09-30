package okhttp3;

import Tf.n;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lokhttp3/WebSocket;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "", "queueSize", "()J", "", Constants.KEY_TEXT, "", "send", "(Ljava/lang/String;)Z", "LTf/n;", "bytes", "(LTf/n;)Z", "", "code", "reason", Constants.KEY_HIDE_CLOSE, "(ILjava/lang/String;)Z", "", "cancel", "()V", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WebSocket {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "newWebSocket", "Lokhttp3/WebSocket;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Factory {
        @NotNull
        WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener listener);
    }

    void cancel();

    boolean close(int code, @Nullable String reason);

    long queueSize();

    @NotNull
    Request request();

    boolean send(@NotNull n bytes);

    boolean send(@NotNull String text);
}
