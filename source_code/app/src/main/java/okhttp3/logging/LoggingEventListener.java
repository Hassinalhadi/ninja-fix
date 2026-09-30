package okhttp3.logging;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 E2\u00020\u0001:\u0002DEB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0016J \u0010\u0019\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J*\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J2\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010,\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u00100\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0007H\u0016J\u0018\u00102\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u00103\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u00104\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u00108\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0007H\u0016J\u0018\u00109\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010:\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010;\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010<\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010=\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\u0018\u0010>\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\u0010\u0010?\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010@\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010A\u001a\u000206H\u0016J\u0010\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lokhttp3/logging/LoggingEventListener;", "Lokhttp3/EventListener;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "startNs", "", "callStart", "", "call", "Lokhttp3/Call;", "proxySelectStart", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "proxySelectEnd", "proxies", "", "Ljava/net/Proxy;", "dnsStart", "domainName", "", "dnsEnd", "inetAddressList", "Ljava/net/InetAddress;", "connectStart", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "secureConnectStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "connectEnd", "protocol", "Lokhttp3/Protocol;", "connectFailed", "ioe", "Ljava/io/IOException;", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "requestHeadersStart", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestBodyStart", "requestBodyEnd", "byteCount", "requestFailed", "responseHeadersStart", "responseHeadersEnd", "response", "Lokhttp3/Response;", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cacheConditionalHit", "cachedResponse", "logWithTime", Constants.KEY_MESSAGE, "Factory", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingEventListener extends EventListener {

    @NotNull
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/logging/LoggingEventListener$Factory;", "Lokhttp3/EventListener$Factory;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class Factory implements EventListener.Factory {

        @NotNull
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // okhttp3.EventListener.Factory
        @NotNull
        public EventListener create(@NotNull Call call) {
            Intrinsics.echo(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public Factory(@NotNull HttpLoggingInterceptor.Logger logger) {
            Intrinsics.echo(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger);
    }

    private final void logWithTime(String message) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log(Constants.AES_PREFIX + millis + " ms] " + message);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(@NotNull Call call, @NotNull Response cachedResponse) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(cachedResponse, "cachedResponse");
        logWithTime("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public void cacheHit(@NotNull Call call, @NotNull Response response) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(response, "response");
        logWithTime("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(ioe, "ioe");
        logWithTime("callFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void callStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    @Override // okhttp3.EventListener
    public void canceled(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(inetSocketAddress, "inetSocketAddress");
        Intrinsics.echo(proxy, "proxy");
        logWithTime("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public void connectFailed(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(inetSocketAddress, "inetSocketAddress");
        Intrinsics.echo(proxy, "proxy");
        Intrinsics.echo(ioe, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + ioe);
    }

    @Override // okhttp3.EventListener
    public void connectStart(@NotNull Call call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(inetSocketAddress, "inetSocketAddress");
        Intrinsics.echo(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(connection, "connection");
        logWithTime("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(@NotNull Call call, @NotNull Connection connection) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(@NotNull Call call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(domainName, "domainName");
        Intrinsics.echo(inetAddressList, "inetAddressList");
        logWithTime("dnsEnd: " + inetAddressList);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(@NotNull Call call, @NotNull String domainName) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(domainName, "domainName");
        logWithTime("dnsStart: ".concat(domainName));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(@NotNull Call call, @NotNull HttpUrl url, @NotNull List<? extends Proxy> proxies) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(url, "url");
        Intrinsics.echo(proxies, "proxies");
        logWithTime("proxySelectEnd: " + proxies);
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(@NotNull Call call, @NotNull HttpUrl url) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(url, "url");
        logWithTime("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.echo(call, "call");
        logWithTime("requestBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(ioe, "ioe");
        logWithTime("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(@NotNull Call call, @NotNull Request request) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(@NotNull Call call, long byteCount) {
        Intrinsics.echo(call, "call");
        logWithTime("responseBodyEnd: byteCount=" + byteCount);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(@NotNull Call call, @NotNull IOException ioe) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(ioe, "ioe");
        logWithTime("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(@NotNull Call call, @NotNull Response response) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(response, "response");
        logWithTime("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(@NotNull Call call, @NotNull Response response) {
        Intrinsics.echo(call, "call");
        Intrinsics.echo(response, "response");
        logWithTime("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        Intrinsics.echo(call, "call");
        logWithTime("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(@NotNull Call call) {
        Intrinsics.echo(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
