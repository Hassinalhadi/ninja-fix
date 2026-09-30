package okhttp3;

import Tf.ak;
import Tf.m;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.zendesk.service.HttpConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001MB\u0083\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b,J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b-J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b.J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b2J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b3J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u0007042\u0006\u00105\u001a\u00020\u0007J\u001e\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u00105\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007H\u0007J\r\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\b8J\u0006\u00109\u001a\u00020\rJ\b\u0010:\u001a\u0004\u0018\u00010\rJ\u000e\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u0014J\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b=J\u0006\u0010>\u001a\u00020?J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\bAJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\bBJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0002\bCJ\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E04J\r\u0010F\u001a\u00020'H\u0007¢\u0006\u0002\bGJ\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\bHJ\r\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\bIJ\b\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020\u0007H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0013\u0010\u0004\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0013\u0010\f\u001a\u00020\r8G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00008G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010#R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00008G¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010#R\u0013\u0010\u0013\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010$R\u0013\u0010\u0015\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010%R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0011\u0010@\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010F\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\bF\u0010)¨\u0006N"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "request", "Lokhttp3/Request;", "protocol", "Lokhttp3/Protocol;", Constants.KEY_MESSAGE, "", "code", "", "handshake", "Lokhttp3/Handshake;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/ResponseBody;", "networkResponse", "cacheResponse", "priorResponse", "sentRequestAtMillis", "", "receivedResponseAtMillis", "exchange", "Lokhttp3/internal/connection/Exchange;", "trailersSource", "Lokhttp3/TrailersSource;", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;Lokhttp3/TrailersSource;)V", "()Lokhttp3/Request;", "()Lokhttp3/Protocol;", "()Ljava/lang/String;", "()I", "()Lokhttp3/Handshake;", "()Lokhttp3/Headers;", "()Lokhttp3/ResponseBody;", "()Lokhttp3/Response;", "()J", "()Lokhttp3/internal/connection/Exchange;", "lazyCacheControl", "Lokhttp3/CacheControl;", "getLazyCacheControl$okhttp", "()Lokhttp3/CacheControl;", "setLazyCacheControl$okhttp", "(Lokhttp3/CacheControl;)V", "-deprecated_request", "-deprecated_protocol", "-deprecated_code", "isSuccessful", "", "()Z", "-deprecated_message", "-deprecated_handshake", "", "name", "header", "defaultValue", "-deprecated_headers", "trailers", "peekTrailers", "peekBody", "byteCount", "-deprecated_body", "newBuilder", "Lokhttp3/Response$Builder;", "isRedirect", "-deprecated_networkResponse", "-deprecated_cacheResponse", "-deprecated_priorResponse", "challenges", "Lokhttp3/Challenge;", "cacheControl", "-deprecated_cacheControl", "-deprecated_sentRequestAtMillis", "-deprecated_receivedResponseAtMillis", Constants.KEY_HIDE_CLOSE, "", "toString", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Response implements Closeable, AutoCloseable {

    @NotNull
    private final ResponseBody body;

    @Nullable
    private final Response cacheResponse;
    private final int code;

    @Nullable
    private final Exchange exchange;

    @Nullable
    private final Handshake handshake;

    @NotNull
    private final Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;

    @Nullable
    private CacheControl lazyCacheControl;

    @NotNull
    private final String message;

    @Nullable
    private final Response networkResponse;

    @Nullable
    private final Response priorResponse;

    @NotNull
    private final Protocol protocol;
    private final long receivedResponseAtMillis;

    @NotNull
    private final Request request;
    private final long sentRequestAtMillis;

    @NotNull
    private TrailersSource trailersSource;

    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String message, int i4, @Nullable Handshake handshake, @NotNull Headers headers, @NotNull ResponseBody body, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j5, long j6, @Nullable Exchange exchange, @NotNull TrailersSource trailersSource) {
        boolean z2;
        Intrinsics.echo(request, "request");
        Intrinsics.echo(protocol, "protocol");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(headers, "headers");
        Intrinsics.echo(body, "body");
        Intrinsics.echo(trailersSource, "trailersSource");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i4;
        this.handshake = handshake;
        this.headers = headers;
        this.body = body;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j5;
        this.receivedResponseAtMillis = j6;
        this.exchange = exchange;
        this.trailersSource = trailersSource;
        boolean z10 = true;
        if (200 <= i4 && i4 < 300) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isSuccessful = z2;
        if (i4 != 307 && i4 != 308) {
            switch (i4) {
                case 300:
                case 301:
                case HttpConstants.HTTP_MOVED_TEMP /* 302 */:
                case HttpConstants.HTTP_SEE_OTHER /* 303 */:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.isRedirect = z10;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @c
    @NotNull
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m338deprecated_cacheControl() {
        return cacheControl();
    }

    @c
    @Nullable
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @c
    /* renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    @c
    @Nullable
    /* renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    @c
    @Nullable
    /* renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    @c
    @Nullable
    /* renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @c
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    @c
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @NotNull
    public final ResponseBody body() {
        return this.body;
    }

    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.INSTANCE.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @Nullable
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i4 = this.code;
        if (i4 != 401) {
            if (i4 != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    public final int code() {
        return this.code;
    }

    @Nullable
    /* renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    @Nullable
    /* renamed from: getLazyCacheControl$okhttp, reason: from getter */
    public final CacheControl getLazyCacheControl() {
        return this.lazyCacheControl;
    }

    @Nullable
    public final Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    public final String header(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return header$default(this, name, null, 2, null);
    }

    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    /* renamed from: isRedirect, reason: from getter */
    public final boolean getIsRedirect() {
        return this.isRedirect;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @NotNull
    public final String message() {
        return this.message;
    }

    @Nullable
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Tf.m, Tf.k, java.lang.Object] */
    @NotNull
    public final ResponseBody peekBody(long byteCount) throws IOException {
        ak peek = this.body.source().peek();
        ?? obj = new Object();
        peek.request(byteCount);
        long min = Math.min(byteCount, peek.purple.purple);
        while (min > 0) {
            long read = peek.read(obj, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.INSTANCE.create((m) obj, this.body.contentType(), obj.purple);
    }

    @Nullable
    public final Headers peekTrailers() throws IOException {
        return this.trailersSource.peek();
    }

    @Nullable
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final void setLazyCacheControl$okhttp(@Nullable CacheControl cacheControl) {
        this.lazyCacheControl = cacheControl;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @NotNull
    public final Headers trailers() throws IOException {
        return this.trailersSource.get();
    }

    @Nullable
    public final String header(@NotNull String name, @Nullable String defaultValue) {
        Intrinsics.echo(name, "name");
        String str = this.headers.get(name);
        return str == null ? defaultValue : str;
    }

    @NotNull
    public final List<String> headers(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return this.headers.values(name);
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u001aH\u0016J\u0018\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u001aH\u0016J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020UH\u0016J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u00105\u001a\u00020\u00002\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010V\u001a\u00020W2\u0006\u0010Q\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u00108\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010A\u001a\u00020<H\u0016J\u0015\u0010Y\u001a\u00020W2\u0006\u0010D\u001a\u00020EH\u0000¢\u0006\u0002\bZJ\b\u0010[\u001a\u00020\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0006R\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00103\"\u0004\b:\u0010\u0006R\u001a\u0010;\u001a\u00020<X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020<X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006\\"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "request", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "protocol", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "code", "", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", Constants.KEY_MESSAGE, "", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "handshake", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "headers", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "body", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "networkResponse", "getNetworkResponse$okhttp", "()Lokhttp3/Response;", "setNetworkResponse$okhttp", "cacheResponse", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "priorResponse", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "sentRequestAtMillis", "", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "receivedResponseAtMillis", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "exchange", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "trailersSource", "Lokhttp3/TrailersSource;", "getTrailersSource$okhttp", "()Lokhttp3/TrailersSource;", "setTrailersSource$okhttp", "(Lokhttp3/TrailersSource;)V", "header", "name", "value", "addHeader", "removeHeader", "Lokhttp3/Headers;", "checkSupportResponse", "", "trailers", "initExchange", "initExchange$okhttp", "build", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class Builder {

        @NotNull
        private ResponseBody body;

        @Nullable
        private Response cacheResponse;
        private int code;

        @Nullable
        private Exchange exchange;

        @Nullable
        private Handshake handshake;

        @NotNull
        private Headers.Builder headers;

        @Nullable
        private String message;

        @Nullable
        private Response networkResponse;

        @Nullable
        private Response priorResponse;

        @Nullable
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @Nullable
        private Request request;
        private long sentRequestAtMillis;

        @NotNull
        private TrailersSource trailersSource;

        public Builder() {
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.headers = new Headers.Builder();
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (response.networkResponse() == null) {
                    if (response.cacheResponse() == null) {
                        if (response.priorResponse() == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException(P0.crimson(name, ".priorResponse != null").toString());
                        }
                    }
                    throw new IllegalArgumentException(P0.crimson(name, ".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(P0.crimson(name, ".networkResponse != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Builder body(@NotNull ResponseBody body) {
            Intrinsics.echo(body, "body");
            this.body = body;
            return this;
        }

        @NotNull
        public Response build() {
            int i4 = this.code;
            if (i4 >= 0) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i4, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(("code < 0: " + this.code).toString());
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        @NotNull
        public Builder code(int code) {
            this.code = code;
            return this;
        }

        @NotNull
        /* renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        @Nullable
        /* renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        /* renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        @Nullable
        /* renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        @NotNull
        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        @Nullable
        /* renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        @Nullable
        /* renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        @Nullable
        /* renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        /* renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        /* renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        /* renamed from: getTrailersSource$okhttp, reason: from getter */
        public final TrailersSource getTrailersSource() {
            return this.trailersSource;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            Intrinsics.echo(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange exchange) {
            Intrinsics.echo(exchange, "exchange");
            this.exchange = exchange;
        }

        @NotNull
        public Builder message(@NotNull String message) {
            Intrinsics.echo(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response priorResponse) {
            this.priorResponse = priorResponse;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol) {
            Intrinsics.echo(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.echo(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request) {
            Intrinsics.echo(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void setBody$okhttp(@NotNull ResponseBody responseBody) {
            Intrinsics.echo(responseBody, "<set-?>");
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i4) {
            this.code = i4;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.echo(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j5) {
            this.receivedResponseAtMillis = j5;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j5) {
            this.sentRequestAtMillis = j5;
        }

        public final void setTrailersSource$okhttp(@NotNull TrailersSource trailersSource) {
            Intrinsics.echo(trailersSource, "<set-?>");
            this.trailersSource = trailersSource;
        }

        @NotNull
        public Builder trailers(@NotNull TrailersSource trailersSource) {
            Intrinsics.echo(trailersSource, "trailersSource");
            this.trailersSource = trailersSource;
            return this;
        }

        public Builder(@NotNull Response response) {
            Intrinsics.echo(response, "response");
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
            this.trailersSource = response.trailersSource;
        }
    }
}
