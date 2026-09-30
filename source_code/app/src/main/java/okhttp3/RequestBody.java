package okhttp3;

import Tf.ah;
import Tf.ap;
import Tf.as;
import Tf.f;
import Tf.l;
import Tf.n;
import Tf.u;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "LTf/l;", "sink", "", "writeTo", "(LTf/l;)V", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final RequestBody EMPTY;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ3\u0010\n\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u0007*\u00020\u00142\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0015J'\u0010\u0016\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u001dJ5\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\b\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "LTf/n;", "(LTf/n;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Ljava/io/FileDescriptor;", "(Ljava/io/FileDescriptor;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "LTf/ah;", "LTf/u;", "fileSystem", "(LTf/ah;LTf/u;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", Constants.KEY_CONTENT, "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;LTf/n;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", CTVariableUtils.FILE, "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content) {
            Intrinsics.echo(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, n nVar, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i4) {
            Intrinsics.echo(content, "content");
            return create$default(this, mediaType, content, i4, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, FileDescriptor fileDescriptor, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr) {
            Intrinsics.echo(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i4, int i5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                i4 = 0;
            }
            if ((i10 & 4) != 0) {
                i5 = bArr.length;
            }
            return companion.create(bArr, mediaType, i4, i5);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.echo(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @NotNull
        public final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i4) {
            Intrinsics.echo(bArr, "<this>");
            return create$default(this, bArr, mediaType, i4, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        @NotNull
        public final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.echo(str, "<this>");
            Pair<Charset, MediaType> chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.first;
            MediaType mediaType2 = (MediaType) chooseCharset.second;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.delta(bytes, "getBytes(...)");
            return create(bytes, mediaType2, 0, bytes.length);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ah ahVar, u uVar, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                mediaType = null;
            }
            return companion.create(ahVar, uVar, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i4, int i5, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                i4 = 0;
            }
            if ((i10 & 8) != 0) {
                i5 = bArr.length;
            }
            return companion.create(mediaType, bArr, i4, i5);
        }

        @NotNull
        public final RequestBody create(@NotNull final n nVar, @Nullable final MediaType mediaType) {
            Intrinsics.echo(nVar, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return nVar.delta();
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    Intrinsics.echo(sink, "sink");
                    sink.coral(nVar);
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final FileDescriptor fileDescriptor, @Nullable final MediaType mediaType) {
            Intrinsics.echo(fileDescriptor, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    Intrinsics.echo(sink, "sink");
                    FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                    try {
                        sink.delta().f(Tf.b.juliet(fileInputStream));
                        fileInputStream.close();
                    } finally {
                    }
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final byte[] bArr, @Nullable final MediaType mediaType, final int i4, final int i5) {
            Intrinsics.echo(bArr, "<this>");
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i4, i5);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i5;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    Intrinsics.echo(sink, "sink");
                    sink.ochre(bArr, i4, i5);
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final File file, @Nullable final MediaType mediaType) {
            Intrinsics.echo(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    Intrinsics.echo(sink, "sink");
                    File file2 = file;
                    Intrinsics.echo(file2, "<this>");
                    f fVar = new f(new FileInputStream(file2), as.NONE);
                    try {
                        sink.f(fVar);
                        fVar.close();
                    } finally {
                    }
                }
            };
        }

        @NotNull
        public final RequestBody create(@NotNull final ah ahVar, @NotNull final u fileSystem, @Nullable final MediaType mediaType) {
            Intrinsics.echo(ahVar, "<this>");
            Intrinsics.echo(fileSystem, "fileSystem");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    Long l10 = fileSystem.metadata(ahVar).delta;
                    if (l10 != null) {
                        return l10.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(l sink) {
                    Intrinsics.echo(sink, "sink");
                    ap source = fileSystem.source(ahVar);
                    try {
                        sink.f(source);
                        source.close();
                    } finally {
                    }
                }
            };
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull String r32) {
            Intrinsics.echo(r32, "content");
            return create(r32, contentType);
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull n r32) {
            Intrinsics.echo(r32, "content");
            return create(r32, contentType);
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull byte[] r32, int offset, int byteCount) {
            Intrinsics.echo(r32, "content");
            return create(r32, contentType, offset, byteCount);
        }

        @c
        @NotNull
        public final RequestBody create(@Nullable MediaType contentType, @NotNull File r32) {
            Intrinsics.echo(r32, "file");
            return create(r32, contentType);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, n.silver, (MediaType) null, 1, (Object) null);
    }

    @NotNull
    public static final RequestBody create(@NotNull n nVar, @Nullable MediaType mediaType) {
        return INSTANCE.create(nVar, mediaType);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull l sink) throws IOException;

    @NotNull
    public static final RequestBody create(@NotNull ah ahVar, @NotNull u uVar, @Nullable MediaType mediaType) {
        return INSTANCE.create(ahVar, uVar, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull FileDescriptor fileDescriptor, @Nullable MediaType mediaType) {
        return INSTANCE.create(fileDescriptor, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull n nVar) {
        return INSTANCE.create(mediaType, nVar);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        return INSTANCE.create(mediaType, file);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i4) {
        return INSTANCE.create(mediaType, bArr, i4);
    }

    @c
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i4, int i5) {
        return INSTANCE.create(mediaType, bArr, i4, i5);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i4) {
        return INSTANCE.create(bArr, mediaType, i4);
    }

    @NotNull
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i4, int i5) {
        return INSTANCE.create(bArr, mediaType, i4, i5);
    }
}
