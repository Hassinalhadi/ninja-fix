package okhttp3.logging;

import Qd.a;
import Tf.aa;
import Tf.k;
import Tf.m;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.internal.IsProbablyUtf8Kt;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0003)*+B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u001f\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0014\"\u00020\b¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\r\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\f\u0010\u000f¨\u0006,"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "queryParamsNameToRedact", "value", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "redactHeader", "", "name", "redactQueryParams", "", "([Ljava/lang/String;)V", "setLevel", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "redactUrl", Constants.KEY_URL, "Lokhttp3/HttpUrl;", "redactUrl$logging_interceptor", "logHeader", "headers", "Lokhttp3/Headers;", "i", "", "bodyHasUnknownEncoding", "", "bodyIsStreaming", "response", "Level", "Logger", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    @NotNull
    private volatile Set<String> headersToRedact;

    @NotNull
    private volatile Level level;

    @NotNull
    private final Logger logger;

    @NotNull
    private volatile Set<String> queryParamsNameToRedact;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Level {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new Level("NONE", 0);
        public static final Level BASIC = new Level("BASIC", 1);
        public static final Level HEADERS = new Level("HEADERS", 2);
        public static final Level BODY = new Level("BODY", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC2708l7.bravo($values);
        }

        private Level(String str, int i4) {
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", Constants.KEY_MESSAGE, "", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Logger {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "log", "", Constants.KEY_MESSAGE, "", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@NotNull String message) {
                    Intrinsics.echo(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(@NotNull String message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) {
            return false;
        }
        return true;
    }

    private final boolean bodyIsStreaming(Response response) {
        MediaType mediaType = response.body().getMediaType();
        if (mediaType != null && Intrinsics.areEqual(mediaType.type(), Constants.KEY_TEXT) && Intrinsics.areEqual(mediaType.subtype(), "event-stream")) {
            return true;
        }
        return false;
    }

    private final void logHeader(Headers headers, int i4) {
        String value;
        if (this.headersToRedact.contains(headers.name(i4))) {
            value = "██";
        } else {
            value = headers.value(i4);
        }
        this.logger.log(headers.name(i4) + ": " + value);
    }

    @c
    @NotNull
    /* renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [Tf.m, Tf.l, Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [Tf.k, java.lang.Object] */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z2;
        String str;
        boolean z10;
        boolean z11;
        long j5;
        String str2;
        Long l10;
        k kVar;
        Long l11;
        k kVar2;
        Intrinsics.echo(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z12 = true;
        if (level == Level.BODY) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && level != Level.HEADERS) {
            z12 = false;
        }
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(redactUrl$logging_interceptor(request.url()));
        if (connection == null) {
            str = "";
        } else {
            str = " " + connection.getProtocol();
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (!z12 && body != 0) {
            StringBuilder beige = ad.beige(sb3, " (");
            beige.append(body.contentLength());
            beige.append("-byte body)");
            sb3 = beige.toString();
        }
        this.logger.log(sb3);
        if (z12) {
            Headers headers = request.headers();
            if (body != 0) {
                MediaType contentType = body.getContentType();
                if (contentType != null) {
                    j5 = -1;
                    if (headers.get(CtApi.HEADER_CONTENT_TYPE) == null) {
                        z10 = z2;
                        z11 = z12;
                        this.logger.log("Content-Type: " + contentType);
                    } else {
                        z10 = z2;
                        z11 = z12;
                    }
                } else {
                    z10 = z2;
                    z11 = z12;
                    j5 = -1;
                }
                if (body.contentLength() != j5 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            } else {
                z10 = z2;
                z11 = z12;
                j5 = -1;
            }
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                logHeader(headers, i4);
            }
            if (z10 && body != 0) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else if (body.isDuplex()) {
                    this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                } else if (body.isOneShot()) {
                    this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                } else {
                    ?? obj = new Object();
                    body.writeTo(obj);
                    if ("gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
                        l11 = Long.valueOf(obj.purple);
                        aa aaVar = new aa(obj);
                        try {
                            ?? obj2 = new Object();
                            obj2.f(aaVar);
                            aaVar.close();
                            kVar2 = obj2;
                        } finally {
                        }
                    } else {
                        l11 = null;
                        kVar2 = obj;
                    }
                    Charset charsetOrUtf8 = Internal.charsetOrUtf8(body.getContentType());
                    this.logger.log("");
                    if (!IsProbablyUtf8Kt.isProbablyUtf8(kVar2)) {
                        this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                    } else if (l11 != null) {
                        this.logger.log("--> END " + request.method() + " (" + kVar2.purple + "-byte, " + l11 + "-gzipped-byte body)");
                    } else {
                        this.logger.log(kVar2.maroon(charsetOrUtf8));
                        this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                    }
                }
            } else {
                this.logger.log("--> END " + request.method());
            }
        } else {
            z10 = z2;
            z11 = z12;
            j5 = -1;
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            Intrinsics.checkNotNull(body2);
            long contentLength = body2.getContentLength();
            if (contentLength != j5) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- " + proceed.code());
            if (proceed.message().length() > 0) {
                sb4.append(" " + proceed.message());
            }
            sb4.append(" " + redactUrl$logging_interceptor(proceed.request().url()) + " (" + millis + "ms");
            if (!z11) {
                sb4.append(", " + str2 + " body");
            }
            sb4.append(")");
            logger.log(sb4.toString());
            if (z11) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    logHeader(headers2, i5);
                }
                if (z10 && HttpHeaders.promisesBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                        return proceed;
                    }
                    if (bodyIsStreaming(proceed)) {
                        this.logger.log("<-- END HTTP (streaming)");
                        return proceed;
                    }
                    m bodySource = body2.getBodySource();
                    bodySource.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                    k delta = bodySource.delta();
                    if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                        l10 = Long.valueOf(delta.purple);
                        aa aaVar2 = new aa(delta.clone());
                        try {
                            ?? obj3 = new Object();
                            obj3.f(aaVar2);
                            aaVar2.close();
                            kVar = obj3;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        l10 = null;
                        kVar = delta;
                    }
                    Charset charsetOrUtf82 = Internal.charsetOrUtf8(body2.getMediaType());
                    if (!IsProbablyUtf8Kt.isProbablyUtf8(kVar)) {
                        this.logger.log("");
                        Logger logger2 = this.logger;
                        StringBuilder uniform = Q0.c.uniform("<-- END HTTP (", millis2, "ms, binary ");
                        uniform.append(kVar.purple);
                        uniform.append("-byte body omitted)");
                        logger2.log(uniform.toString());
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(kVar.clone().maroon(charsetOrUtf82));
                    }
                    Logger logger3 = this.logger;
                    StringBuilder sb5 = new StringBuilder();
                    StringBuilder uniform2 = Q0.c.uniform("<-- END HTTP (", millis2, "ms, ");
                    uniform2.append(kVar.purple);
                    uniform2.append("-byte");
                    sb5.append(uniform2.toString());
                    if (l10 != null) {
                        sb5.append(", " + l10 + "-gzipped-byte");
                    }
                    sb5.append(" body)");
                    logger3.log(sb5.toString());
                    return proceed;
                }
                this.logger.log("<-- END HTTP");
            }
            return proceed;
        } catch (Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    public final void level(@NotNull Level level) {
        Intrinsics.echo(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        Intrinsics.echo(name, "name");
        r.india();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        CollectionsKt__MutableCollectionsKt.addAll(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final void redactQueryParams(@NotNull String... name) {
        Intrinsics.echo(name, "name");
        r.india();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        CollectionsKt__MutableCollectionsKt.addAll(treeSet, this.queryParamsNameToRedact);
        CollectionsKt.amber(treeSet, name);
        this.queryParamsNameToRedact = treeSet;
    }

    @NotNull
    public final String redactUrl$logging_interceptor(@NotNull HttpUrl url) {
        String queryParameterValue;
        Intrinsics.echo(url, "url");
        if (!this.queryParamsNameToRedact.isEmpty() && url.querySize() != 0) {
            HttpUrl.Builder query = url.newBuilder().query(null);
            int querySize = url.querySize();
            for (int i4 = 0; i4 < querySize; i4++) {
                String queryParameterName = url.queryParameterName(i4);
                if (this.queryParamsNameToRedact.contains(queryParameterName)) {
                    queryParameterValue = "██";
                } else {
                    queryParameterValue = url.queryParameterValue(i4);
                }
                query.addEncodedQueryParameter(queryParameterName, queryParameterValue);
            }
            return query.toString();
        }
        return url.getUrl();
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        Intrinsics.echo(level, "level");
        this.level = level;
        return this;
    }

    public HttpLoggingInterceptor(@NotNull Logger logger) {
        Intrinsics.echo(logger, "logger");
        this.logger = logger;
        u uVar = u.alpha;
        this.headersToRedact = uVar;
        this.queryParamsNameToRedact = uVar;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
