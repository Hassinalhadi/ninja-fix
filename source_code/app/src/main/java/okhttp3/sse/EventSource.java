package okhttp3.sse;

import kotlin.Metadata;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/sse/EventSource;", "", "cancel", "", "request", "Lokhttp3/Request;", "Factory", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EventSource {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lokhttp3/sse/EventSource$Factory;", "", "newEventSource", "Lokhttp3/sse/EventSource;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/sse/EventSourceListener;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Factory {
        @NotNull
        EventSource newEventSource(@NotNull Request request, @NotNull EventSourceListener listener);
    }

    void cancel();

    @NotNull
    Request request();
}
