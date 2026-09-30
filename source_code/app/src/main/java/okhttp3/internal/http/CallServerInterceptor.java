package okhttp3.internal.http;

import Tf.aj;
import Tf.b;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TrailersSource;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "<init>", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z2) {
        this.forWebSocket = z2;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code, Exchange exchange) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:62:0x00a9, B:64:0x00b2, B:23:0x00ba, B:24:0x00de, B:26:0x00e4, B:28:0x00ed, B:30:0x00f0, B:33:0x0115, B:37:0x0120, B:38:0x013e, B:40:0x014c, B:48:0x0162, B:50:0x0171, B:51:0x0197, B:59:0x0157, B:60:0x0125), top: B:61:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response.Builder builder;
        Response build;
        int code;
        Response build2;
        boolean z2;
        Intrinsics.echo(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = true;
        try {
            exchange.writeRequestHeaders(request);
            if (HttpMethod.permitsRequestBody(request.method()) && body != null) {
                if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                    exchange.flushRequest();
                    builder = exchange.readResponseHeaders(true);
                    try {
                        exchange.responseHeadersStart();
                        z2 = false;
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof ConnectionShutdownException) {
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            if (builder == null) {
                            }
                            build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            code = build.code();
                            while (shouldIgnoreAndWaitForRealResponse(code, exchange)) {
                            }
                            exchange.responseHeadersEnd(build);
                            if (!this.forWebSocket) {
                            }
                            final ResponseBody openResponseBody = exchange.openResponseBody(build);
                            build2 = build.newBuilder().body(openResponseBody).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                                @Override // okhttp3.TrailersSource
                                public Headers get() {
                                    m source = openResponseBody.getSource();
                                    if (source.isOpen()) {
                                        _UtilJvmKt.skipAll(source);
                                    }
                                    Headers peek = peek();
                                    if (peek != null) {
                                        return peek;
                                    }
                                    throw new IllegalStateException("null trailers after exhausting response body?!");
                                }

                                @Override // okhttp3.TrailersSource
                                public Headers peek() {
                                    return Exchange.this.peekTrailers();
                                }
                            }).build();
                            if (!Constants.KEY_HIDE_CLOSE.equalsIgnoreCase(build2.request().header("Connection"))) {
                            }
                            exchange.noNewExchangesOnConnection();
                            if (code == 204) {
                            }
                            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
                        }
                        throw e;
                    }
                } else {
                    z2 = true;
                    builder = null;
                }
                try {
                    if (builder == null) {
                        if (body.isDuplex()) {
                            exchange.flushRequest();
                            body.writeTo(b.bravo(exchange.createRequestBody(request, true)));
                        } else {
                            aj bravo = b.bravo(exchange.createRequestBody(request, false));
                            body.writeTo(bravo);
                            bravo.close();
                        }
                    } else {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                        }
                    }
                    z10 = z2;
                } catch (IOException e4) {
                    e = e4;
                    z10 = z2;
                    if (e instanceof ConnectionShutdownException) {
                    }
                }
            } else {
                exchange.noRequestBody();
                builder = null;
            }
            if (body == null || !body.isDuplex()) {
                exchange.finishRequest();
            }
            e = null;
        } catch (IOException e5) {
            e = e5;
            builder = null;
        }
        if (builder == null) {
            try {
                builder = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder);
                if (z10) {
                    exchange.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e10) {
                if (e != null) {
                    AbstractC2689j6.charlie(e, e10);
                    throw e;
                }
                throw e10;
            }
        }
        build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        while (shouldIgnoreAndWaitForRealResponse(code, exchange)) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders);
            if (z10) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        if (!this.forWebSocket && code == 101) {
            build2 = UnreadableResponseBodyKt.stripBody(build);
        } else {
            final ResponseBody openResponseBody2 = exchange.openResponseBody(build);
            build2 = build.newBuilder().body(openResponseBody2).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                @Override // okhttp3.TrailersSource
                public Headers get() {
                    m source = openResponseBody2.getSource();
                    if (source.isOpen()) {
                        _UtilJvmKt.skipAll(source);
                    }
                    Headers peek = peek();
                    if (peek != null) {
                        return peek;
                    }
                    throw new IllegalStateException("null trailers after exhausting response body?!");
                }

                @Override // okhttp3.TrailersSource
                public Headers peek() {
                    return Exchange.this.peekTrailers();
                }
            }).build();
        }
        if (!Constants.KEY_HIDE_CLOSE.equalsIgnoreCase(build2.request().header("Connection")) || Constants.KEY_HIDE_CLOSE.equalsIgnoreCase(Response.header$default(build2, "Connection", null, 2, null))) {
            exchange.noNewExchangesOnConnection();
        }
        if ((code == 204 && code != 205) || build2.body().getContentLength() <= 0) {
            return build2;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
    }
}
