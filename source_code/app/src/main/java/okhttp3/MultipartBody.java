package okhttp3;

import Tf.k;
import Tf.l;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import g8.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0003./-B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010!\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\u0005\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010#R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010!\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b!\u0010 ¨\u00060"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "LTf/n;", "boundaryByteString", "Lokhttp3/MediaType;", Constants.KEY_TYPE, "", "Lokhttp3/MultipartBody$Part;", "parts", "<init>", "(LTf/n;Lokhttp3/MediaType;Ljava/util/List;)V", "LTf/l;", "sink", "", "countBytes", "", "writeOrCountBytes", "(LTf/l;Z)J", "", "index", "part", "(I)Lokhttp3/MultipartBody$Part;", "isOneShot", "()Z", "contentType", "()Lokhttp3/MediaType;", "-deprecated_type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "-deprecated_parts", "()Ljava/util/List;", "contentLength", "()J", "", "writeTo", "(LTf/l;)V", "LTf/n;", "Lokhttp3/MediaType;", "Ljava/util/List;", "J", "Companion", "Part", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {

    @NotNull
    public static final MediaType ALTERNATIVE;

    @NotNull
    private static final byte[] COLONSPACE;

    @NotNull
    private static final byte[] CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] DASHDASH;

    @NotNull
    public static final MediaType DIGEST;

    @NotNull
    public static final MediaType FORM;

    @NotNull
    public static final MediaType MIXED;

    @NotNull
    public static final MediaType PARALLEL;

    @NotNull
    private final n boundaryByteString;
    private long contentLength;

    @NotNull
    private final MediaType contentType;

    @NotNull
    private final List<Part> parts;

    @NotNull
    private final MediaType type;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0016J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/MediaType;", Constants.KEY_TYPE, "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", "body", "addPart", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "name", "value", "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "LTf/n;", "LTf/n;", "Lokhttp3/MediaType;", "", "parts", "Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @NotNull
        private final n boundary;

        @NotNull
        private final List<Part> parts;

        @NotNull
        private MediaType type;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @NotNull String value) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(value, "value");
            addPart(Part.INSTANCE.createFormData(name, value));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull RequestBody body) {
            Intrinsics.echo(body, "body");
            addPart(Part.INSTANCE.create(body));
            return this;
        }

        @NotNull
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, _UtilJvmKt.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        @NotNull
        public final Builder setType(@NotNull MediaType type) {
            Intrinsics.echo(type, "type");
            if (Intrinsics.areEqual(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public Builder(@NotNull String boundary) {
            Intrinsics.echo(boundary, "boundary");
            n nVar = n.silver;
            this.boundary = d.oscar(boundary);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @Nullable String filename, @NotNull RequestBody body) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(body, "body");
            addPart(Part.INSTANCE.createFormData(name, filename, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@Nullable Headers headers, @NotNull RequestBody body) {
            Intrinsics.echo(body, "body");
            addPart(Part.INSTANCE.create(headers, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull Part part) {
            Intrinsics.echo(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Builder(String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
            if ((i4 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.delta(str, "toString(...)");
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u000f*\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "<init>", "()V", "MIXED", "Lokhttp3/MediaType;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "COLONSPACE", "", "CRLF", "DASHDASH", "appendQuotedString", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", Constants.KEY_KEY, "", "appendQuotedString$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder sb2, @NotNull String key) {
            Intrinsics.echo(sb2, "<this>");
            Intrinsics.echo(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = key.charAt(i4);
                if (charAt != '\n') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            sb2.append(charAt);
                        } else {
                            sb2.append("%22");
                        }
                    } else {
                        sb2.append("%0D");
                    }
                } else {
                    sb2.append("%0A");
                }
            }
            sb2.append('\"');
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00058G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/Headers;", "()Lokhttp3/RequestBody;", "-deprecated_headers", "-deprecated_body", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Part {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final RequestBody body;

        @Nullable
        private final Headers headers;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "create", "Lokhttp3/MultipartBody$Part;", "body", "Lokhttp3/RequestBody;", "headers", "Lokhttp3/Headers;", "createFormData", "name", "", "value", "filename", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Part create(@NotNull RequestBody body) {
                Intrinsics.echo(body, "body");
                return create(null, body);
            }

            @NotNull
            public final Part createFormData(@NotNull String name, @NotNull String value) {
                Intrinsics.echo(name, "name");
                Intrinsics.echo(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, value, (MediaType) null, 1, (Object) null));
            }

            private Companion() {
            }

            @NotNull
            public final Part create(@Nullable Headers headers, @NotNull RequestBody body) {
                Intrinsics.echo(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.get(CtApi.HEADER_CONTENT_TYPE) : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) == null) {
                        return new Part(headers, body, defaultConstructorMarker);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            @NotNull
            public final Part createFormData(@NotNull String name, @Nullable String filename, @NotNull RequestBody body) {
                Intrinsics.echo(name, "name");
                Intrinsics.echo(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = MultipartBody.INSTANCE;
                companion.appendQuotedString$okhttp(sb2, name);
                if (filename != null) {
                    sb2.append("; filename=");
                    companion.appendQuotedString$okhttp(sb2, filename);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2.toString()).build(), body);
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        @NotNull
        public static final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        @NotNull
        public static final Part createFormData(@NotNull String str, @NotNull String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        @c
        @NotNull
        /* renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @c
        @Nullable
        /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        @NotNull
        public final RequestBody body() {
            return this.body;
        }

        @Nullable
        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        @NotNull
        public static final Part create(@NotNull RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        @NotNull
        public static final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(@NotNull n boundaryByteString, @NotNull MediaType type, @NotNull List<Part> parts) {
        Intrinsics.echo(boundaryByteString, "boundaryByteString");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = MediaType.INSTANCE.get(type + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(l sink, boolean countBytes) throws IOException {
        k kVar;
        l lVar;
        if (countBytes) {
            Object obj = new Object();
            kVar = obj;
            lVar = obj;
        } else {
            kVar = null;
            lVar = sink;
        }
        int size = this.parts.size();
        long j5 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Part part = this.parts.get(i4);
            Headers headers = part.headers();
            RequestBody body = part.body();
            Intrinsics.checkNotNull(lVar);
            lVar.m(DASHDASH);
            lVar.coral(this.boundaryByteString);
            lVar.m(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    lVar.lavender(headers.name(i5)).m(COLONSPACE).lavender(headers.value(i5)).m(CRLF);
                }
            }
            MediaType mediaType = body.get$contentType();
            if (mediaType != null) {
                lVar.lavender("Content-Type: ").lavender(mediaType.toString()).m(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength == -1 && countBytes) {
                Intrinsics.checkNotNull(kVar);
                kVar.charlie();
                return -1L;
            }
            byte[] bArr = CRLF;
            lVar.m(bArr);
            if (countBytes) {
                j5 += contentLength;
            } else {
                body.writeTo(lVar);
            }
            lVar.m(bArr);
        }
        Intrinsics.checkNotNull(lVar);
        byte[] bArr2 = DASHDASH;
        lVar.m(bArr2);
        lVar.coral(this.boundaryByteString);
        lVar.m(bArr2);
        lVar.m(CRLF);
        if (countBytes) {
            Intrinsics.checkNotNull(kVar);
            long j6 = j5 + kVar.purple;
            kVar.charlie();
            return j6;
        }
        return j5;
    }

    @c
    @NotNull
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m292deprecated_boundary() {
        return boundary();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m293deprecated_parts() {
        return this.parts;
    }

    @c
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m294deprecated_size() {
        return size();
    }

    @c
    @NotNull
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final MediaType getType() {
        return this.type;
    }

    @NotNull
    public final String boundary() {
        return this.boundaryByteString.romeo();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j5 = this.contentLength;
        if (j5 == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j5;
    }

    @Override // okhttp3.RequestBody
    @NotNull
    /* renamed from: contentType, reason: from getter */
    public MediaType get$contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        boolean z2;
        List<Part> list = this.parts;
        if (list != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Part) it.next()).body().isOneShot()) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final Part part(int index) {
        return this.parts.get(index);
    }

    @NotNull
    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    @NotNull
    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull l sink) throws IOException {
        Intrinsics.echo(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
