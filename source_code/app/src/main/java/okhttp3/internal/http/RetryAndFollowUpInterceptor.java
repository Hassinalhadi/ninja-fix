package okhttp3.internal.http;

import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.zendesk.service.HttpConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "recover", "", "e", "Ljava/io/IOException;", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "Lokhttp3/Request;", "requestIsOneShot", "isRecoverable", "requestSendStarted", "followUpRequest", "userResponse", "exchange", "Lokhttp3/internal/connection/Exchange;", "buildRedirectRequest", "method", "", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;

    @NotNull
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        Intrinsics.echo(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        boolean z2;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(method) && code != 308 && code != 307) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (httpMethod.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z2) {
                    requestBody = userResponse.request().body();
                }
                newBuilder.method(method, requestBody);
            }
            if (!z2) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader(CtApi.HEADER_CONTENT_TYPE);
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        Route route;
        RealConnection connection$okhttp;
        if (exchange != null && (connection$okhttp = exchange.getConnection$okhttp()) != null) {
            route = connection$okhttp.route();
        } else {
            route = null;
        }
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case HttpConstants.HTTP_MOVED_TEMP /* 302 */:
                                    case HttpConstants.HTTP_SEE_OTHER /* 303 */:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = userResponse.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = userResponse.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(userResponse, 0) > 0) {
                                    return null;
                                }
                                return userResponse.request();
                            }
                        } else {
                            Intrinsics.checkNotNull(route);
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, userResponse);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = userResponse.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(userResponse, LottieConstants.IterateForever) != 0) {
                            return null;
                        }
                        return userResponse.request();
                    }
                } else {
                    RequestBody body2 = userResponse.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return userResponse.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, userResponse);
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            if (!(e instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        }
        if (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException e, RealCall call, Request userRequest) {
        boolean z2 = e instanceof ConnectionShutdownException;
        boolean z10 = !z2;
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((!z2 && requestIsOneShot(e, userRequest)) || !isRecoverable(e, z10) || !call.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody body = userRequest.body();
        if ((body != null && body.isOneShot()) || (e instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (new Regex("\\d+").echo(header$default)) {
            Integer valueOf = Integer.valueOf(header$default);
            Intrinsics.delta(valueOf, "valueOf(...)");
            return valueOf.intValue();
        }
        return LottieConstants.IterateForever;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r12.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.priorResponse(r6).build();
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r7.body());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r8 > 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r0.getIsDuplex() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        r6 = null;
     */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Request followUpRequest;
        Intrinsics.echo(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List emptyList = CollectionsKt.emptyList();
        boolean z2 = false;
        int i4 = 0;
        Response response = null;
        while (true) {
            boolean z10 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z10, realInterceptorChain);
                try {
                    if (!call.getCanceled()) {
                        try {
                            break;
                        } catch (IOException e) {
                            boolean recover = recover(e, call, request);
                            call.getEventListener().retryDecision(call, e, recover);
                            if (recover) {
                                emptyList = CollectionsKt.plus(emptyList, e);
                                call.exitNetworkInterceptorExchange$okhttp(true);
                                z10 = false;
                            } else {
                                throw _UtilCommonKt.withSuppressed(e, emptyList);
                            }
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                }
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = followUpRequest;
        }
    }
}
