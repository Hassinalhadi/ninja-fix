package okhttp3.sse;

import B2.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lokhttp3/sse/EventSources;", "", "()V", "createFactory", "Lokhttp3/sse/EventSource$Factory;", "client", "Lokhttp3/OkHttpClient;", "processResponse", "", "response", "Lokhttp3/Response;", "listener", "Lokhttp3/sse/EventSourceListener;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventSources {

    @NotNull
    public static final EventSources INSTANCE = new EventSources();

    private EventSources() {
    }

    public static /* synthetic */ EventSource alpha(OkHttpClient okHttpClient, Request request, EventSourceListener eventSourceListener) {
        return createFactory$lambda$1(okHttpClient, request, eventSourceListener);
    }

    @NotNull
    public static final EventSource.Factory createFactory(@NotNull OkHttpClient client) {
        Intrinsics.echo(client, "client");
        return new s(27, client);
    }

    public static final EventSource createFactory$lambda$1(OkHttpClient client, Request request, EventSourceListener listener) {
        Intrinsics.echo(client, "$client");
        Intrinsics.echo(request, "request");
        Intrinsics.echo(listener, "listener");
        if (request.header("Accept") == null) {
            request = request.newBuilder().addHeader("Accept", "text/event-stream").build();
        }
        RealEventSource realEventSource = new RealEventSource(request, listener);
        realEventSource.connect(client);
        return realEventSource;
    }

    public static final void processResponse(@NotNull Response response, @NotNull EventSourceListener listener) {
        Intrinsics.echo(response, "response");
        Intrinsics.echo(listener, "listener");
        new RealEventSource(response.request(), listener).processResponse(response);
    }
}
