package okhttp3.internal.cache;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.zendesk.service.HttpConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.DateFormattingKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u001d\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getNetworkRequest", "()Lokhttp3/Request;", "getCacheResponse", "()Lokhttp3/Response;", "Factory", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Response cacheResponse;

    @Nullable
    private final Request networkRequest;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isCacheable(@NotNull Response response, @NotNull Request request) {
            Intrinsics.echo(response, "response");
            Intrinsics.echo(request, "request");
            int code = response.code();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case HttpConstants.HTTP_MOVED_TEMP /* 302 */:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
                    return false;
                }
            }
            if (response.cacheControl().noStore() || request.cacheControl().noStore()) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "getRequest$okhttp", "()Lokhttp3/Request;", "servedDate", "Ljava/util/Date;", "servedDateString", "", "lastModified", "lastModifiedString", Column.EXPIRES, "sentRequestMillis", "receivedResponseMillis", "etag", "ageSeconds", "", "isFreshnessLifetimeHeuristic", "", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "cacheResponseAge", "hasConditions", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Factory {
        private int ageSeconds;

        @Nullable
        private final Response cacheResponse;

        @Nullable
        private String etag;

        @Nullable
        private Date expires;

        @Nullable
        private Date lastModified;

        @Nullable
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;

        @NotNull
        private final Request request;
        private long sentRequestMillis;

        @Nullable
        private Date servedDate;

        @Nullable
        private String servedDateString;

        public Factory(long j5, @NotNull Request request, @Nullable Response response) {
            Intrinsics.echo(request, "request");
            this.nowMillis = j5;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String name = headers.name(i4);
                    String value = headers.value(i4);
                    if (r.hotel(name, "Date", true)) {
                        this.servedDate = DateFormattingKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    } else if (r.hotel(name, "Expires", true)) {
                        this.expires = DateFormattingKt.toHttpDateOrNull(value);
                    } else if (r.hotel(name, "Last-Modified", true)) {
                        this.lastModified = DateFormattingKt.toHttpDateOrNull(value);
                        this.lastModifiedString = value;
                    } else if (r.hotel(name, "ETag", true)) {
                        this.etag = value;
                    } else if (r.hotel(name, "Age", true)) {
                        this.ageSeconds = _UtilCommonKt.toNonNegativeInt(value, -1);
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            long j5;
            Date date = this.servedDate;
            if (date != null) {
                j5 = Math.max(0L, this.receivedResponseMillis - date.getTime());
            } else {
                j5 = 0;
            }
            int i4 = this.ageSeconds;
            if (i4 != -1) {
                j5 = Math.max(j5, TimeUnit.SECONDS.toMillis(i4));
            }
            return j5 + Math.max(0L, this.receivedResponseMillis - this.sentRequestMillis) + Math.max(0L, this.nowMillis - this.receivedResponseMillis);
        }

        private final CacheStrategy computeCandidate() {
            long j5;
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.INSTANCE.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (!cacheControl.noCache() && !hasConditions(this.request)) {
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long cacheResponseAge = cacheResponseAge();
                long computeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long j6 = 0;
                if (cacheControl.minFreshSeconds() != -1) {
                    j5 = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                } else {
                    j5 = 0;
                }
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    j6 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j7 = j5 + cacheResponseAge;
                    if (j7 < j6 + computeFreshnessLifetime) {
                        Response.Builder newBuilder = this.cacheResponse.newBuilder();
                        if (j7 >= computeFreshnessLifetime) {
                            newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (cacheResponseAge > Constants.ONE_DAY_IN_MILLIS && isFreshnessLifetimeHeuristic()) {
                            newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, newBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else if (this.servedDate != null) {
                        str2 = this.servedDateString;
                    } else {
                        return new CacheStrategy(this.request, null);
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder newBuilder2 = this.request.headers().newBuilder();
                Intrinsics.checkNotNull(str2);
                newBuilder2.addLenient$okhttp(str, str2);
                return new CacheStrategy(this.request.newBuilder().headers(newBuilder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            long j5;
            long j6;
            Response response = this.cacheResponse;
            Intrinsics.checkNotNull(response);
            if (response.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                if (date2 != null) {
                    j6 = date2.getTime();
                } else {
                    j6 = this.receivedResponseMillis;
                }
                long time = date.getTime() - j6;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            }
            if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                Date date3 = this.servedDate;
                if (date3 != null) {
                    j5 = date3.getTime();
                } else {
                    j5 = this.sentRequestMillis;
                }
                Date date4 = this.lastModified;
                Intrinsics.checkNotNull(date4);
                long time2 = j5 - date4.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private final boolean hasConditions(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            Intrinsics.checkNotNull(response);
            if (response.cacheControl().maxAgeSeconds() == -1 && this.expires == null) {
                return true;
            }
            return false;
        }

        @NotNull
        public final CacheStrategy compute() {
            CacheStrategy computeCandidate = computeCandidate();
            if (computeCandidate.getNetworkRequest() != null && this.request.cacheControl().onlyIfCached()) {
                return new CacheStrategy(null, null);
            }
            return computeCandidate;
        }

        @NotNull
        /* renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }
    }

    public CacheStrategy(@Nullable Request request, @Nullable Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    @Nullable
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
