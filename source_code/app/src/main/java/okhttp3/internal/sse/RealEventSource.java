package okhttp3.internal.sse;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.ServerSentEventReader;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ$\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\f\u0010 \u001a\u00020!*\u00020\"H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lokhttp3/internal/sse/RealEventSource;", "Lokhttp3/sse/EventSource;", "Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "Lokhttp3/Callback;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/sse/EventSourceListener;", "(Lokhttp3/Request;Lokhttp3/sse/EventSourceListener;)V", "call", "Lokhttp3/internal/connection/RealCall;", "cancel", "", "connect", "client", "Lokhttp3/OkHttpClient;", "onEvent", Constants.KEY_ID, "", Constants.KEY_TYPE, Column.DATA, "onFailure", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "onRetryChange", "timeMs", "", "processResponse", "isEventStream", "", "Lokhttp3/ResponseBody;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    private RealCall call;

    @NotNull
    private final EventSourceListener listener;

    @NotNull
    private final Request request;

    public RealEventSource(@NotNull Request request, @NotNull EventSourceListener listener) {
        Intrinsics.echo(request, "request");
        Intrinsics.echo(listener, "listener");
        this.request = request;
        this.listener = listener;
    }

    private final boolean isEventStream(ResponseBody responseBody) {
        MediaType mediaType = responseBody.getMediaType();
        if (mediaType == null || !Intrinsics.areEqual(mediaType.type(), Constants.KEY_TEXT) || !Intrinsics.areEqual(mediaType.subtype(), "event-stream")) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.sse.EventSource
    public void cancel() {
        RealCall realCall = this.call;
        if (realCall != null) {
            realCall.cancel();
        } else {
            Intrinsics.lima("call");
            throw null;
        }
    }

    public final void connect(@NotNull OkHttpClient client) {
        Intrinsics.echo(client, "client");
        Call newCall = client.newBuilder().eventListener(EventListener.NONE).build().newCall(this.request);
        Intrinsics.charlie(newCall, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        RealCall realCall = (RealCall) newCall;
        this.call = realCall;
        realCall.enqueue(this);
    }

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onEvent(@Nullable String id2, @Nullable String type, @NotNull String data) {
        Intrinsics.echo(data, "data");
        this.listener.onEvent(this, id2, type, data);
    }

    @Override // okhttp3.Callback
    public void onFailure(@NotNull Call call, @NotNull IOException e) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(e, "e");
        this.listener.onFailure(this, e, null);
    }

    @Override // okhttp3.Callback
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(response, "response");
        processResponse(response);
    }

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onRetryChange(long timeMs) {
    }

    public final void processResponse(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        try {
            if (!response.getIsSuccessful()) {
                this.listener.onFailure(this, null, response);
                response.close();
                return;
            }
            ResponseBody body = response.body();
            Intrinsics.checkNotNull(body);
            if (!isEventStream(body)) {
                this.listener.onFailure(this, new IllegalStateException("Invalid content-type: " + body.getMediaType()), response);
                response.close();
                return;
            }
            RealCall realCall = this.call;
            if (realCall != null) {
                realCall.timeoutEarlyExit();
                Response build = response.newBuilder().body(Util.EMPTY_RESPONSE).build();
                ServerSentEventReader serverSentEventReader = new ServerSentEventReader(body.getBodySource(), this);
                try {
                    this.listener.onOpen(this, build);
                    do {
                    } while (serverSentEventReader.processNextEvent());
                    this.listener.onClosed(this);
                    response.close();
                    return;
                } catch (Exception e) {
                    this.listener.onFailure(this, e, build);
                    response.close();
                    return;
                }
            }
            Intrinsics.lima("call");
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(response, th);
                throw th2;
            }
        }
    }

    @Override // okhttp3.sse.EventSource
    @NotNull
    /* renamed from: request, reason: from getter */
    public Request getRequest() {
        return this.request;
    }
}
