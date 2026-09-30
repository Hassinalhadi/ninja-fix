package okhttp3;

import ao.ad;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import ge.InterfaceC1772d;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlin.text.r;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3062u;
import zendesk.support.GuideConstants;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001;B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0013J\u001e\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0017\u0010\u001aJ\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u0017\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010*\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010 R\u0017\u0010\u000b\u001a\u00020\n8G¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b\u000b\u0010\"R\u0017\u0010\t\u001a\u00020\b8G¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b\t\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8G¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\r\u0010&R\u0019\u00100\u001a\u0004\u0018\u00010\u00068G¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010 R*\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0011\u00109\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010*\u001a\u00020'8G¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006<"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/Request$Builder;", "builder", "<init>", "(Lokhttp3/Request$Builder;)V", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "Lokhttp3/Headers;", "headers", "", "method", "Lokhttp3/RequestBody;", "body", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", "T", "reifiedTag", "()Ljava/lang/Object;", "tag", "Lge/d;", Constants.KEY_TYPE, "(Lge/d;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "cacheUrlOverride", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "lazyCacheControl", "Lokhttp3/CacheControl;", "", "isHttps", "()Z", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Request {

    @Nullable
    private final RequestBody body;

    @Nullable
    private final HttpUrl cacheUrlOverride;

    @NotNull
    private final Headers headers;

    @Nullable
    private CacheControl lazyCacheControl;

    @NotNull
    private final String method;

    @NotNull
    private final Map<InterfaceC1772d, Object> tags;

    @NotNull
    private final HttpUrl url;

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J!\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010%J&\u0010'\u001a\u00020\u0000\"\n\b\u0000\u0010&\u0018\u0001*\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b(\u0010)J/\u0010'\u001a\u00020\u0000\"\b\b\u0000\u0010&*\u00020\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\b\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b'\u0010,J\u0019\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b'\u0010)J/\u0010'\u001a\u00020\u0000\"\u0004\b\u0000\u0010&2\u000e\u0010+\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000-2\b\u0010'\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b'\u0010.J\u0017\u0010/\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b/\u0010\tJ\r\u00100\u001a\u00020\u0000¢\u0006\u0004\b0\u0010\u001bJ\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u00104R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010$\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0015\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010/\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00105\u001a\u0004\bJ\u00107\"\u0004\bK\u00109R2\u0010M\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030*\u0012\u0004\u0012\u00020\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "Lokhttp3/HttpUrl;", Constants.KEY_URL, "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", "body", "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "delete", "put", "patch", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "tag", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lge/d;", Constants.KEY_TYPE, "(Lge/d;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "cacheUrlOverride", "gzip", "build", "()Lokhttp3/Request;", "canonicalUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "", "tags", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class Builder {

        @Nullable
        private RequestBody body;

        @Nullable
        private HttpUrl cacheUrlOverride;

        @NotNull
        private Headers.Builder headers;

        @NotNull
        private String method;

        @NotNull
        private Map<InterfaceC1772d, ? extends Object> tags;

        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = t.alpha;
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        private final String canonicalUrl(String url) {
            if (r.quebec(url, "ws:", true)) {
                String substring = url.substring(3);
                Intrinsics.delta(substring, "substring(...)");
                return "http:".concat(substring);
            }
            if (r.quebec(url, "wss:", true)) {
                String substring2 = url.substring(4);
                Intrinsics.delta(substring2, "substring(...)");
                return "https:".concat(substring2);
            }
            return url;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    requestBody = RequestBody.EMPTY;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            return new Request(this);
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            Intrinsics.echo(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                return removeHeader(GuideConstants.STANDARD_CACHING_HEADER);
            }
            return header(GuideConstants.STANDARD_CACHING_HEADER, cacheControl2);
        }

        @NotNull
        public final Builder cacheUrlOverride(@Nullable HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        /* renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @Nullable
        /* renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        @NotNull
        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        @NotNull
        /* renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        public final Map<InterfaceC1772d, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        /* renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        @NotNull
        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody != null) {
                String str = this.headers.get("Content-Encoding");
                if (str == null) {
                    this.headers.add("Content-Encoding", "gzip");
                    this.body = new GzipRequestBody(requestBody);
                    return this;
                }
                throw new IllegalStateException(q.echo("Content-Encoding already set: ", str).toString());
            }
            throw new IllegalStateException("cannot gzip a request that has no body");
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
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

        @NotNull
        public Builder method(@NotNull String method, @Nullable RequestBody body) {
            Intrinsics.echo(method, "method");
            if (method.length() > 0) {
                if (body == null) {
                    if (HttpMethod.requiresRequestBody(method)) {
                        throw new IllegalArgumentException(ad.gray("method ", method, " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(method)) {
                    throw new IllegalArgumentException(ad.gray("method ", method, " must not have a request body.").toString());
                }
                this.method = method;
                this.body = body;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true");
        }

        @NotNull
        public Builder patch(@NotNull RequestBody body) {
            Intrinsics.echo(body, "body");
            return method("PATCH", body);
        }

        @NotNull
        public Builder post(@NotNull RequestBody body) {
            Intrinsics.echo(body, "body");
            return method("POST", body);
        }

        @NotNull
        public Builder put(@NotNull RequestBody body) {
            Intrinsics.echo(body, "body");
            return method("PUT", body);
        }

        public final <T> Builder reifiedTag(T tag) {
            Intrinsics.juliet();
            throw null;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.echo(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(@Nullable HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.echo(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            Intrinsics.echo(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<InterfaceC1772d, ? extends Object> map) {
            Intrinsics.echo(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public Builder tag(@Nullable Object tag) {
            return tag(u.alpha.bravo(Object.class), (InterfaceC1772d) tag);
        }

        @NotNull
        public Builder url(@NotNull HttpUrl url) {
            Intrinsics.echo(url, "url");
            this.url = url;
            return this;
        }

        @NotNull
        public Builder delete(@Nullable RequestBody body) {
            return method("DELETE", body);
        }

        @NotNull
        public Builder url(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        @NotNull
        public final <T> Builder tag(@NotNull InterfaceC1772d type, @Nullable T tag) {
            Map charlie;
            Intrinsics.echo(type, "type");
            if (tag == null) {
                if (!this.tags.isEmpty()) {
                    Map<InterfaceC1772d, ? extends Object> map = this.tags;
                    Intrinsics.charlie(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                    x.charlie(map).remove(type);
                }
                return this;
            }
            if (this.tags.isEmpty()) {
                charlie = new LinkedHashMap();
                this.tags = charlie;
            } else {
                Map<InterfaceC1772d, ? extends Object> map2 = this.tags;
                Intrinsics.charlie(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                charlie = x.charlie(map2);
            }
            if (type.november(tag)) {
                charlie.put(type, tag);
                return this;
            }
            throw new ClassCastException("Value cannot be cast to " + type.juliet());
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            Intrinsics.echo(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String url2 = url.toString();
            Intrinsics.delta(url2, "toString(...)");
            return url(companion.get(url2));
        }

        public Builder(@NotNull Request request) {
            Intrinsics.echo(request, "request");
            Map<InterfaceC1772d, ? extends Object> map = t.alpha;
            this.tags = map;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp().isEmpty() ? map : y.amber(request.getTags$okhttp());
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T tag) {
            Intrinsics.echo(type, "type");
            return tag(AbstractC3062u.echo(type), (InterfaceC1772d) tag);
        }
    }

    public Request(@NotNull Builder builder) {
        Intrinsics.echo(builder, "builder");
        HttpUrl url = builder.getUrl();
        if (url != null) {
            this.url = url;
            this.method = builder.getMethod();
            this.headers = builder.getHeaders().build();
            this.body = builder.getBody();
            this.cacheUrlOverride = builder.getCacheUrlOverride();
            this.tags = y.zulu(builder.getTags$okhttp());
            return;
        }
        throw new IllegalStateException("url == null");
    }

    @c
    @Nullable
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m333deprecated_cacheControl() {
        return cacheControl();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @Nullable
    public final RequestBody body() {
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
    /* renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    @NotNull
    public final Map<InterfaceC1772d, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return this.headers.get(name);
    }

    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final <T> T reifiedTag() {
        Intrinsics.juliet();
        throw null;
    }

    @Nullable
    public final Object tag() {
        return tag(u.alpha.bravo(Object.class));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i4 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.first;
                String str2 = (String) pair2.second;
                if (i4 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i4 = i5;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    @NotNull
    public final List<String> headers(@NotNull String name) {
        Intrinsics.echo(name, "name");
        return this.headers.values(name);
    }

    @Nullable
    public final <T> T tag(@NotNull InterfaceC1772d type) {
        Intrinsics.echo(type, "type");
        return (T) AbstractC3062u.bravo(type).cast(this.tags.get(type));
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> type) {
        Intrinsics.echo(type, "type");
        return (T) tag(AbstractC3062u.echo(type));
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i4 & 2) != 0 ? Headers.INSTANCE.of(new String[0]) : headers, (i4 & 4) != 0 ? Json.UNSET_NAME : str, (i4 & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(@NotNull HttpUrl url, @NotNull Headers headers, @NotNull String method, @Nullable RequestBody requestBody) {
        this(r2.method(method, requestBody));
        Intrinsics.echo(url, "url");
        Intrinsics.echo(headers, "headers");
        Intrinsics.echo(method, "method");
        Builder headers2 = new Builder().url(url).headers(headers);
        if (Intrinsics.areEqual(method, Json.UNSET_NAME)) {
            if (requestBody != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
    }
}
