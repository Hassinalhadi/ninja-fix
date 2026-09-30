package okhttp3.internal.http1;

import A0.z;
import Tf.ao;
import Tf.ap;
import Tf.as;
import Tf.k;
import Tf.l;
import Tf.m;
import Tf.y;
import av.q;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 R2\u00020\u0001:\u0007STUVWXRB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010\u0015J\u001d\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u00101J\u001f\u00106\u001a\u00020\u001c2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001c2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001c2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020)*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010O\u001a\u00020)*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010Q¨\u0006Y"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "LTf/m;", "source", "LTf/l;", "sink", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;LTf/m;LTf/l;)V", "Lokhttp3/Request;", "request", "", "contentLength", "LTf/ao;", "createRequestBody", "(Lokhttp3/Request;J)LTf/ao;", "", "cancel", "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "LTf/ap;", "openResponseBodySource", "(Lokhttp3/Response;)LTf/ap;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "skipConnectBody", "(Lokhttp3/Response;)V", "newChunkedSink", "()LTf/ao;", "newKnownLengthSink", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "length", "newFixedLengthSource", "(Lokhttp3/HttpUrl;J)LTf/ap;", "newChunkedSource", "(Lokhttp3/HttpUrl;)LTf/ap;", "newUnknownLengthSource", "LTf/y;", "timeout", "detachTimeout", "(LTf/y;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "LTf/m;", "LTf/l;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "trailers", "Lokhttp3/Headers;", "isResponseComplete", "()Z", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "Companion", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;

    @NotNull
    private final ExchangeCodec.Carrier carrier;

    @Nullable
    private final OkHttpClient client;

    @NotNull
    private final HeadersReader headersReader;

    @NotNull
    private final l sink;

    @NotNull
    private final m source;
    private int state;

    @Nullable
    private Headers trailers;

    @NotNull
    private static final Headers TRAILERS_RESPONSE_BODY_TRUNCATED = Headers.INSTANCE.of("OkHttp-Response-Body", "Truncated");

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "LTf/ap;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "LTf/as;", "timeout", "()LTf/as;", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "Lokhttp3/Headers;", "trailers", "", "responseBodyComplete", "(Lokhttp3/Headers;)V", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "LTf/y;", "LTf/y;", "getTimeout", "()LTf/y;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public abstract class AbstractSource implements ap, AutoCloseable {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;

        @NotNull
        private final y timeout;

        @NotNull
        private final HttpUrl url;

        public AbstractSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            Intrinsics.echo(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = url;
            this.timeout = new y(http1ExchangeCodec.source.getTimeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public final boolean getClosed() {
            return this.closed;
        }

        @NotNull
        public final y getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final HttpUrl getUrl() {
            return this.url;
        }

        @Override // Tf.ap
        public long read(@NotNull k sink, long byteCount) {
            Intrinsics.echo(sink, "sink");
            try {
                return this.this$0.source.read(sink, byteCount);
            } catch (IOException e) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw e;
            }
        }

        public final void responseBodyComplete(@NotNull Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            Intrinsics.echo(trailers, "trailers");
            if (this.this$0.state != 6) {
                if (this.this$0.state == 5) {
                    this.this$0.detachTimeout(this.timeout);
                    this.this$0.trailers = trailers;
                    this.this$0.state = 6;
                    if (trailers.size() > 0 && (okHttpClient = this.this$0.client) != null && (cookieJar = okHttpClient.cookieJar()) != null) {
                        HttpHeaders.receiveHeaders(cookieJar, this.url, trailers);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + this.this$0.state);
            }
        }

        public final void setClosed(boolean z2) {
            this.closed = z2;
        }

        @Override // Tf.ap
        @NotNull
        /* renamed from: timeout */
        public as getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "LTf/ao;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "LTf/as;", "timeout", "()LTf/as;", "LTf/k;", "source", "", "byteCount", "", "write", "(LTf/k;J)V", "flush", "()V", Constants.KEY_HIDE_CLOSE, "LTf/y;", "LTf/y;", "", "closed", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ChunkedSink implements ao, AutoCloseable {
        private boolean closed;

        @NotNull
        private final y timeout;

        public ChunkedSink() {
            this.timeout = new y(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.lavender("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // Tf.ao, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // Tf.ao
        @NotNull
        public as timeout() {
            return this.timeout;
        }

        @Override // Tf.ao
        public void write(@NotNull k source, long byteCount) {
            Intrinsics.echo(source, "source");
            if (!this.closed) {
                if (byteCount == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.orange(byteCount);
                Http1ExchangeCodec.this.sink.lavender("\r\n");
                Http1ExchangeCodec.this.sink.write(source, byteCount);
                Http1ExchangeCodec.this.sink.lavender("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "", "readChunkSize", "()V", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", Constants.KEY_HIDE_CLOSE, "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            Intrinsics.echo(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.e();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.A();
                String obj = StringsKt.b(this.this$0.source.e()).toString();
                if (this.bytesRemainingInChunk >= 0 && (obj.length() <= 0 || r.quebec(obj, ";", false))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        responseBodyComplete(this.this$0.headersReader.readHeaders());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, Tf.ap
        public long read(@NotNull k sink, long byteCount) {
            Intrinsics.echo(sink, "sink");
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j5 = this.bytesRemainingInChunk;
                    if (j5 == 0 || j5 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getCarrier().noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(z.india(byteCount, "byteCount < 0: ").toString());
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;J)V", "LTf/k;", "sink", "byteCount", "read", "(LTf/k;J)J", "", Constants.KEY_HIDE_CLOSE, "()V", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl url, long j5) {
            super(http1ExchangeCodec, url);
            Intrinsics.echo(url, "url");
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j5;
            if (j5 == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, Tf.ap
        public long read(@NotNull k sink, long byteCount) {
            Intrinsics.echo(sink, "sink");
            if (byteCount >= 0) {
                if (!getClosed()) {
                    long j5 = this.bytesRemaining;
                    if (j5 == 0) {
                        return -1L;
                    }
                    long read = super.read(sink, Math.min(j5, byteCount));
                    if (read != -1) {
                        long j6 = this.bytesRemaining - read;
                        this.bytesRemaining = j6;
                        if (j6 == 0) {
                            responseBodyComplete(Headers.EMPTY);
                        }
                        return read;
                    }
                    this.this$0.getCarrier().noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(z.india(byteCount, "byteCount < 0: ").toString());
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "LTf/ao;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "LTf/as;", "timeout", "()LTf/as;", "LTf/k;", "source", "", "byteCount", "", "write", "(LTf/k;J)V", "flush", "()V", Constants.KEY_HIDE_CLOSE, "LTf/y;", "LTf/y;", "", "closed", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class KnownLengthSink implements ao, AutoCloseable {
        private boolean closed;

        @NotNull
        private final y timeout;

        public KnownLengthSink() {
            this.timeout = new y(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // Tf.ao, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // Tf.ao
        @NotNull
        public as timeout() {
            return this.timeout;
        }

        @Override // Tf.ao
        public void write(@NotNull k source, long byteCount) {
            Intrinsics.echo(source, "source");
            if (!this.closed) {
                _UtilCommonKt.checkOffsetAndCount(source.purple, 0L, byteCount);
                Http1ExchangeCodec.this.sink.write(source, byteCount);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "", Constants.KEY_HIDE_CLOSE, "()V", "", "inputExhausted", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(@NotNull Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super(http1ExchangeCodec, url);
            Intrinsics.echo(url, "url");
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, Tf.ap
        public long read(@NotNull k sink, long byteCount) {
            Intrinsics.echo(sink, "sink");
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(sink, byteCount);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete(Headers.EMPTY);
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(z.india(byteCount, "byteCount < 0: ").toString());
        }
    }

    public Http1ExchangeCodec(@Nullable OkHttpClient okHttpClient, @NotNull ExchangeCodec.Carrier carrier, @NotNull m source, @NotNull l sink) {
        Intrinsics.echo(carrier, "carrier");
        Intrinsics.echo(source, "source");
        Intrinsics.echo(sink, "sink");
        this.client = okHttpClient;
        this.carrier = carrier;
        this.source = source;
        this.sink = sink;
        this.headersReader = new HeadersReader(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(y timeout) {
        as asVar = timeout.alpha;
        as delegate = as.NONE;
        Intrinsics.echo(delegate, "delegate");
        timeout.alpha = delegate;
        asVar.clearDeadline();
        asVar.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final ao newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final ap newChunkedSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final ap newFixedLengthSource(HttpUrl url, long length) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(this, url, length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final ao newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final ap newUnknownLengthSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            getCarrier().noNewExchanges();
            return new UnknownLengthSource(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getCarrier().mo355cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public ao createRequestBody(@NotNull Request request, long contentLength) {
        Intrinsics.echo(request, "request");
        RequestBody body = request.body();
        if (body != null && body.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @NotNull
    public ap openResponseBodySource(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(response.request().url(), 0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(response.request().url(), headersContentLength);
        }
        return newUnknownLengthSource(response.request().url());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Headers peekTrailers() {
        Headers headers = this.trailers;
        if (headers != TRAILERS_RESPONSE_BODY_TRUNCATED) {
            int i4 = this.state;
            if (i4 != 5 && i4 != 6) {
                throw new IllegalStateException(("Trailers cannot be read because the state is " + this.state).toString());
            }
            return headers;
        }
        throw new IOException("Trailers cannot be read because the response body was truncated");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @Nullable
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        int i4 = this.state;
        if (i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            StatusLine parse = StatusLine.INSTANCE.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (expectContinue && parse.code == 100) {
                return null;
            }
            int i5 = parse.code;
            if (i5 == 100) {
                this.state = 3;
                return headers;
            }
            if (102 <= i5 && i5 < 200) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            throw new IOException(q.echo("unexpected end of stream on ", getCarrier().getRoute().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return -1L;
        }
        return _UtilJvmKt.headersContentLength(response);
    }

    public final void skipConnectBody(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength == -1) {
            return;
        }
        ap newFixedLengthSource = newFixedLengthSource(response.request().url(), headersContentLength);
        _UtilJvmKt.skipAll(newFixedLengthSource, LottieConstants.IterateForever, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    public final void writeRequest(@NotNull Headers headers, @NotNull String requestLine) {
        Intrinsics.echo(headers, "headers");
        Intrinsics.echo(requestLine, "requestLine");
        if (this.state == 0) {
            this.sink.lavender(requestLine).lavender("\r\n");
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.sink.lavender(headers.name(i4)).lavender(": ").lavender(headers.value(i4)).lavender("\r\n");
            }
            this.sink.lavender("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@NotNull Request request) {
        Intrinsics.echo(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        Intrinsics.delta(type, "type(...)");
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
