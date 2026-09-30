package okhttp3;

import Tf.ah;
import Tf.aj;
import Tf.ak;
import Tf.ao;
import Tf.ap;
import Tf.l;
import Tf.m;
import Tf.n;
import Tf.w;
import Tf.x;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import g8.d;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0004UVWTB)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001b¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u001b¢\u0006\u0004\b'\u0010%J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020,¢\u0006\u0004\b/\u0010.J\r\u00100\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u00101J\u000f\u00102\u001a\u00020\u001bH\u0016¢\u0006\u0004\b2\u0010%J\u000f\u00103\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u0010%J\u000f\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b4\u00105J\u0017\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010<\u001a\u00020\u001bH\u0000¢\u0006\u0004\b;\u0010%J\r\u0010=\u001a\u00020,¢\u0006\u0004\b=\u0010.J\r\u0010>\u001a\u00020,¢\u0006\u0004\b>\u0010.J\r\u0010?\u001a\u00020,¢\u0006\u0004\b?\u0010.J\u001d\u0010C\u001a\u00020\u001b2\f\u0010B\u001a\b\u0018\u00010@R\u00020AH\u0002¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\"\u0010/\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010I\u001a\u0004\bJ\u0010.\"\u0004\bK\u0010LR\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010I\u001a\u0004\bM\u0010.\"\u0004\bN\u0010LR\u0016\u0010=\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010IR\u0016\u0010>\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010IR\u0016\u0010?\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010IR\u0011\u0010P\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010\u0004\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0004\u00105R\u0011\u0010R\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006X"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "LTf/ah;", "directory", "", "maxSize", "LTf/u;", "fileSystem", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(LTf/ah;JLTf/u;Lokhttp3/internal/concurrent/TaskRunner;)V", "(LTf/u;LTf/ah;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "()V", "delete", "evictAll", "", "", "urls", "()Ljava/util/Iterator;", "", "writeAbortCount", "()I", "writeSuccessCount", "size", "()J", "flush", Constants.KEY_HIDE_CLOSE, "-deprecated_directory", "()Ljava/io/File;", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "abortQuietly", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "I", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "directoryPath", "()LTf/ah;", "Companion", "RealCacheRequest", "Entry", "CacheResponseBody", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable, AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;

    @NotNull
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "()Lokhttp3/MediaType;", "", "()J", "LTf/m;", "source", "()LTf/m;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/lang/String;", "bodySource", "LTf/m;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CacheResponseBody extends ResponseBody {

        @NotNull
        private final m bodySource;

        @Nullable
        private final String contentLength;

        @Nullable
        private final String contentType;

        @NotNull
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@NotNull DiskLruCache.Snapshot snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.echo(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = Tf.b.charlie(new x(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // Tf.x, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return _UtilCommonKt.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* renamed from: contentType */
        public MediaType get$contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        @NotNull
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* renamed from: source, reason: from getter */
        public m getSource() {
            return this.bodySource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u001c*\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\u0017¢\u0006\u0004\b\u000b\u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "", "", "varyFields", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "varyHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, Constants.KEY_KEY, "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "LTf/m;", "source", "", "readInt$okhttp", "(LTf/m;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "(Lokhttp3/Response;)Lokhttp3/Headers;", "VERSION", "I", "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i4 = 0; i4 < size; i4++) {
                if ("Vary".equalsIgnoreCase(headers.name(i4))) {
                    String value = headers.value(i4);
                    if (treeSet == null) {
                        r.india();
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = StringsKt.navy(value, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.b((String) it.next()).toString());
                    }
                }
            }
            if (treeSet == null) {
                return u.alpha;
            }
            return treeSet;
        }

        public final boolean hasVaryAll(@NotNull Response response) {
            Intrinsics.echo(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        @NotNull
        public final String key(@NotNull HttpUrl url) {
            Intrinsics.echo(url, "url");
            n nVar = n.silver;
            return d.oscar(url.getUrl()).charlie("MD5").echo();
        }

        public final int readInt$okhttp(@NotNull m source) throws IOException {
            Intrinsics.echo(source, "source");
            try {
                long emerald = source.emerald();
                String e = source.e();
                if (emerald >= 0 && emerald <= 2147483647L && e.length() <= 0) {
                    return (int) emerald;
                }
                throw new IOException("expected an int but was \"" + emerald + e + '\"');
            } catch (NumberFormatException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        @NotNull
        public final Headers varyHeaders(@NotNull Response response) {
            Intrinsics.echo(response, "<this>");
            Response networkResponse = response.networkResponse();
            Intrinsics.checkNotNull(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@NotNull Response cachedResponse, @NotNull Headers cachedRequest, @NotNull Request newRequest) {
            Intrinsics.echo(cachedResponse, "cachedResponse");
            Intrinsics.echo(cachedRequest, "cachedRequest");
            Intrinsics.echo(newRequest, "newRequest");
            Set<String> varyFields = varyFields(cachedResponse.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }

        private final Headers varyHeaders(Headers requestHeaders, Headers responseHeaders) {
            Set<String> varyFields = varyFields(responseHeaders);
            if (varyFields.isEmpty()) {
                return Headers.EMPTY;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = requestHeaders.size();
            for (int i4 = 0; i4 < size; i4++) {
                String name = requestHeaders.name(i4);
                if (varyFields.contains(name)) {
                    builder.add(name, requestHeaders.value(i4));
                }
            }
            return builder.build();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "abort", "()V", "LTf/ao;", "body", "()LTf/ao;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "cacheOut", "LTf/ao;", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class RealCacheRequest implements CacheRequest {

        @NotNull
        private final ao body;

        @NotNull
        private final ao cacheOut;
        private boolean done;

        @NotNull
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(@NotNull final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.echo(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            ao newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new w(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // Tf.w, Tf.ao, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                _UtilCommonKt.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        @NotNull
        /* renamed from: body, reason: from getter */
        public ao getBody() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z2) {
            this.done = z2;
        }
    }

    public Cache(@NotNull ah directory, long j5, @NotNull Tf.u fileSystem, @NotNull TaskRunner taskRunner) {
        Intrinsics.echo(directory, "directory");
        Intrinsics.echo(fileSystem, "fileSystem");
        Intrinsics.echo(taskRunner, "taskRunner");
        this.cache = new DiskLruCache(fileSystem, directory, VERSION, 2, j5, taskRunner);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public static final String key(@NotNull HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    @c
    @NotNull
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m222deprecated_directory() {
        return this.cache.getDirectory().golf();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @NotNull
    public final File directory() {
        return this.cache.getDirectory().golf();
    }

    @NotNull
    public final ah directoryPath() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @Nullable
    public final Response get$okhttp(@NotNull Request request) {
        Intrinsics.echo(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    _UtilCommonKt.closeQuietly(response.body());
                    return null;
                }
                return response;
            } catch (IOException unused) {
                _UtilCommonKt.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @NotNull
    /* renamed from: getCache$okhttp, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @Nullable
    public final CacheRequest put$okhttp(@NotNull Response response) {
        DiskLruCache.Editor editor;
        Intrinsics.echo(response, "response");
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(@NotNull Request request) throws IOException {
        Intrinsics.echo(request, "request");
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i4) {
        this.writeAbortCount = i4;
    }

    public final void setWriteSuccessCount$okhttp(int i4) {
        this.writeSuccessCount = i4;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy) {
        try {
            Intrinsics.echo(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void update$okhttp(@NotNull Response cached, @NotNull Response network) {
        DiskLruCache.Editor editor;
        Intrinsics.echo(cached, "cached");
        Intrinsics.echo(network, "network");
        Entry entry = new Entry(network);
        ResponseBody body = cached.body();
        Intrinsics.charlie(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    @NotNull
    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull Tf.u fileSystem, @NotNull ah directory, long j5) {
        this(directory, j5, fileSystem, TaskRunner.INSTANCE);
        Intrinsics.echo(fileSystem, "fileSystem");
        Intrinsics.echo(directory, "directory");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Cache(@NotNull File directory, long j5) {
        this(r0, r6.u.charlie(directory), j5);
        Intrinsics.echo(directory, "directory");
        Tf.u uVar = Tf.u.SYSTEM;
        String str = ah.purple;
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b\u0007\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010'R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108¨\u0006;"}, d2 = {"Lokhttp3/Cache$Entry;", "", "LTf/ap;", "rawSource", "<init>", "(LTf/ap;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "LTf/m;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "(LTf/m;)Ljava/util/List;", "LTf/l;", "sink", "certificates", "", "writeCertList", "(LTf/l;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "Lokhttp3/Request;", "request", "", "matches", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "", "requestMethod", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "code", "I", Constants.KEY_MESSAGE, "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Entry {

        @NotNull
        private static final String RECEIVED_MILLIS;

        @NotNull
        private static final String SENT_MILLIS;
        private final int code;

        @Nullable
        private final Handshake handshake;

        @NotNull
        private final String message;

        @NotNull
        private final Protocol protocol;
        private final long receivedResponseMillis;

        @NotNull
        private final String requestMethod;

        @NotNull
        private final Headers responseHeaders;
        private final long sentRequestMillis;

        @NotNull
        private final HttpUrl url;

        @NotNull
        private final Headers varyHeaders;

        static {
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb2.append(companion.get().getPrefix());
            sb2.append("-Sent-Millis");
            SENT_MILLIS = sb2.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(@NotNull ap rawSource) throws IOException {
            TlsVersion tlsVersion;
            Intrinsics.echo(rawSource, "rawSource");
            try {
                ak charlie = Tf.b.charlie(rawSource);
                String fuchsia = charlie.fuchsia(Long.MAX_VALUE);
                HttpUrl parse = HttpUrl.INSTANCE.parse(fuchsia);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = charlie.fuchsia(Long.MAX_VALUE);
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.INSTANCE.readInt$okhttp(charlie);
                    for (int i4 = 0; i4 < readInt$okhttp; i4++) {
                        builder.addLenient$okhttp(charlie.fuchsia(Long.MAX_VALUE));
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.INSTANCE.parse(charlie.fuchsia(Long.MAX_VALUE));
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.INSTANCE.readInt$okhttp(charlie);
                    for (int i5 = 0; i5 < readInt$okhttp2; i5++) {
                        builder2.addLenient$okhttp(charlie.fuchsia(Long.MAX_VALUE));
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (this.url.isHttps()) {
                        String fuchsia2 = charlie.fuchsia(Long.MAX_VALUE);
                        if (fuchsia2.length() <= 0) {
                            CipherSuite forJavaName = CipherSuite.INSTANCE.forJavaName(charlie.fuchsia(Long.MAX_VALUE));
                            List<Certificate> readCertificateList = readCertificateList(charlie);
                            List<Certificate> readCertificateList2 = readCertificateList(charlie);
                            if (!charlie.hotel()) {
                                tlsVersion = TlsVersion.INSTANCE.forJavaName(charlie.fuchsia(Long.MAX_VALUE));
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.INSTANCE.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + fuchsia2 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    rawSource.close();
                    return;
                }
                IOException iOException = new IOException("Cache corruption for ".concat(fuchsia));
                Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(rawSource, th);
                    throw th2;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [Tf.k, java.lang.Object] */
        private final List<Certificate> readCertificateList(m source) throws IOException {
            int i4 = 1;
            int readInt$okhttp = Cache.INSTANCE.readInt$okhttp(source);
            if (readInt$okhttp == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i5 = 0; i5 < readInt$okhttp; i5++) {
                    String e = source.e();
                    ?? obj = new Object();
                    n nVar = n.silver;
                    n lima = d.lima(e);
                    if (lima != null) {
                        obj.navy(lima);
                        arrayList.add(certificateFactory.generateCertificate(new Hd.b(i4, obj)));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        private final void writeCertList(l sink, List<? extends Certificate> certificates) throws IOException {
            try {
                sink.y(certificates.size()).black(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    n nVar = n.silver;
                    Intrinsics.checkNotNull(encoded);
                    sink.lavender(d.quebec(-1234567890, encoded).alpha()).black(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(@NotNull Request request, @NotNull Response response) {
            Intrinsics.echo(request, "request");
            Intrinsics.echo(response, "response");
            if (Intrinsics.areEqual(this.url, request.url()) && Intrinsics.areEqual(this.requestMethod, request.method()) && Cache.INSTANCE.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Response response(@NotNull DiskLruCache.Snapshot snapshot) {
            Intrinsics.echo(snapshot, "snapshot");
            String str = this.responseHeaders.get(CtApi.HEADER_CONTENT_TYPE);
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request(this.url, this.varyHeaders, this.requestMethod, null, 8, null)).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(@NotNull DiskLruCache.Editor editor) throws IOException {
            Intrinsics.echo(editor, "editor");
            aj bravo = Tf.b.bravo(editor.newSink(0));
            try {
                bravo.lavender(this.url.getUrl());
                bravo.black(10);
                bravo.lavender(this.requestMethod);
                bravo.black(10);
                bravo.y(this.varyHeaders.size());
                bravo.black(10);
                int size = this.varyHeaders.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bravo.lavender(this.varyHeaders.name(i4));
                    bravo.lavender(": ");
                    bravo.lavender(this.varyHeaders.value(i4));
                    bravo.black(10);
                }
                bravo.lavender(new StatusLine(this.protocol, this.code, this.message).toString());
                bravo.black(10);
                bravo.y(this.responseHeaders.size() + 2);
                bravo.black(10);
                int size2 = this.responseHeaders.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    bravo.lavender(this.responseHeaders.name(i5));
                    bravo.lavender(": ");
                    bravo.lavender(this.responseHeaders.value(i5));
                    bravo.black(10);
                }
                bravo.lavender(SENT_MILLIS);
                bravo.lavender(": ");
                bravo.y(this.sentRequestMillis);
                bravo.black(10);
                bravo.lavender(RECEIVED_MILLIS);
                bravo.lavender(": ");
                bravo.y(this.receivedResponseMillis);
                bravo.black(10);
                if (this.url.isHttps()) {
                    bravo.black(10);
                    Handshake handshake = this.handshake;
                    Intrinsics.checkNotNull(handshake);
                    bravo.lavender(handshake.cipherSuite().javaName());
                    bravo.black(10);
                    writeCertList(bravo, this.handshake.peerCertificates());
                    writeCertList(bravo, this.handshake.localCertificates());
                    bravo.lavender(this.handshake.tlsVersion().javaName());
                    bravo.black(10);
                }
                bravo.close();
            } finally {
            }
        }

        public Entry(@NotNull Response response) {
            Intrinsics.echo(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.INSTANCE.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
