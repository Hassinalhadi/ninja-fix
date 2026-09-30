package okhttp3;

import A0.z;
import Tf.m;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "LTf/m;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()LTf/m;", "", "bytes", "()[B", "LTf/n;", "byteString", "()LTf/n;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", CTVariableUtils.STRING, "()Ljava/lang/String;", "", Constants.KEY_HIDE_CLOSE, "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable, AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final ResponseBody EMPTY;

    @Nullable
    private Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "LTf/m;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(LTf/m;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", Constants.KEY_HIDE_CLOSE, "()V", "LTf/m;", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class BomAwareReader extends Reader implements AutoCloseable {

        @NotNull
        private final Charset charset;
        private boolean closed;

        @Nullable
        private Reader delegate;

        @NotNull
        private final m source;

        public BomAwareReader(@NotNull m source, @NotNull Charset charset) {
            Intrinsics.echo(source, "source");
            Intrinsics.echo(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.echo(cbuf, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.C(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, off, len);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "LTf/n;", "(LTf/n;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "LTf/m;", "", "contentLength", "(LTf/m;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", Constants.KEY_CONTENT, "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;LTf/n;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLTf/m;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [Tf.m, Tf.k, java.lang.Object] */
        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.echo(str, "<this>");
            Pair<Charset, MediaType> chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.first;
            MediaType mediaType2 = (MediaType) chooseCharset.second;
            ?? obj = new Object();
            Intrinsics.echo(charset, "charset");
            obj.j(str, 0, str.length(), charset);
            return create((m) obj, mediaType2, obj.purple);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, n nVar, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, m mVar, MediaType mediaType, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            if ((i4 & 2) != 0) {
                j5 = -1;
            }
            return companion.create(mVar, mediaType, j5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [Tf.m, Tf.k, java.lang.Object] */
        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.echo(bArr, "<this>");
            ?? obj = new Object();
            obj.olive(bArr);
            return create((m) obj, mediaType, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [Tf.m, Tf.k, java.lang.Object] */
        @NotNull
        public final ResponseBody create(@NotNull n nVar, @Nullable MediaType mediaType) {
            Intrinsics.echo(nVar, "<this>");
            ?? obj = new Object();
            obj.navy(nVar);
            return create((m) obj, mediaType, nVar.delta());
        }

        @NotNull
        public final ResponseBody create(@NotNull final m mVar, @Nullable final MediaType mediaType, final long j5) {
            Intrinsics.echo(mVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j5;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: source, reason: from getter */
                public m get$this_asResponseBody() {
                    return mVar;
                }
            };
        }

        @c
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.echo(content, "content");
            return create(content, contentType);
        }

        @c
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull byte[] content) {
            Intrinsics.echo(content, "content");
            return create(content, contentType);
        }

        @c
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull n content) {
            Intrinsics.echo(content, "content");
            return create(content, contentType);
        }

        @c
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, long contentLength, @NotNull m content) {
            Intrinsics.echo(content, "content");
            return create(content, contentType, contentLength);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, n.silver, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super m, ? extends T> function1, Function1<? super T, Integer> function12) {
        long j5 = responseBody.get$contentLength();
        if (j5 <= 2147483647L) {
            m mVar = responseBody.get$this_asResponseBody();
            ?? r22 = (Object) null;
            try {
                T invoke = function1.invoke(mVar);
                Throwable th = r22;
                if (mVar != null) {
                    try {
                        mVar.close();
                        th = r22;
                    } catch (Throwable 
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:367)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:330)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        */
                    /*
                        this = this;
                        long r0 = r6.get$contentLength()
                        r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
                        int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                        if (r2 > 0) goto L65
                        Tf.m r6 = r6.get$this_asResponseBody()
                        r2 = 0
                        java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L1f
                        if (r6 == 0) goto L1b
                        r6.close()     // Catch: java.lang.Throwable -> L1a
                        goto L1b
                    L1a:
                        r2 = move-exception
                    L1b:
                        r4 = r2
                        r2 = r7
                        r7 = r4
                        goto L2a
                    L1f:
                        r7 = move-exception
                        if (r6 == 0) goto L2a
                        r6.close()     // Catch: java.lang.Throwable -> L26
                        goto L2a
                    L26:
                        r6 = move-exception
                        s6.AbstractC2689j6.charlie(r7, r6)
                    L2a:
                        if (r7 != 0) goto L64
                        java.lang.Object r6 = r8.invoke(r2)
                        java.lang.Number r6 = (java.lang.Number) r6
                        int r6 = r6.intValue()
                        r7 = -1
                        int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                        if (r7 == 0) goto L63
                        long r7 = (long) r6
                        int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                        if (r7 != 0) goto L42
                        goto L63
                    L42:
                        java.io.IOException r7 = new java.io.IOException
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r2 = "Content-Length ("
                        r8.<init>(r2)
                        r8.append(r0)
                        java.lang.String r0 = ") and stream length ("
                        r8.append(r0)
                        r8.append(r6)
                        java.lang.String r6 = ") disagree"
                        r8.append(r6)
                        java.lang.String r6 = r8.toString()
                        r7.<init>(r6)
                        throw r7
                    L63:
                        return r2
                    L64:
                        throw r7
                    L65:
                        java.io.IOException r6 = new java.io.IOException
                        java.lang.String r7 = "Cannot buffer entire body for content length: "
                        java.lang.String r7 = A0.z.india(r0, r7)
                        r6.<init>(r7)
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(okhttp3.ResponseBody, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.Object");
                }

                @NotNull
                public static final ResponseBody create(@NotNull m mVar, @Nullable MediaType mediaType, long j5) {
                    return INSTANCE.create(mVar, mediaType, j5);
                }

                @NotNull
                public final InputStream byteStream() {
                    return get$this_asResponseBody().C();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v8 */
                @NotNull
                public final n byteString() throws IOException {
                    long j5 = get$contentLength();
                    if (j5 <= 2147483647L) {
                        m mVar = get$this_asResponseBody();
                        n th = null;
                        try {
                            n plum = mVar.plum();
                            try {
                                mVar.close();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            th = th;
                            th = plum;
                        } catch (Throwable th3) {
                            th = th3;
                            if (mVar != null) {
                                try {
                                    mVar.close();
                                } catch (Throwable th4) {
                                    AbstractC2689j6.charlie(th, th4);
                                }
                            }
                        }
                        if (th == 0) {
                            int delta = th.delta();
                            if (j5 != -1 && j5 != delta) {
                                throw new IOException("Content-Length (" + j5 + ") and stream length (" + delta + ") disagree");
                            }
                            return th;
                        }
                        throw th;
                    }
                    throw new IOException(z.india(j5, "Cannot buffer entire body for content length: "));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v8 */
                @NotNull
                public final byte[] bytes() throws IOException {
                    long j5 = get$contentLength();
                    if (j5 <= 2147483647L) {
                        m mVar = get$this_asResponseBody();
                        byte[] th = null;
                        try {
                            byte[] amber = mVar.amber();
                            try {
                                mVar.close();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            th = th;
                            th = amber;
                        } catch (Throwable th3) {
                            th = th3;
                            if (mVar != null) {
                                try {
                                    mVar.close();
                                } catch (Throwable th4) {
                                    AbstractC2689j6.charlie(th, th4);
                                }
                            }
                        }
                        if (th == 0) {
                            int length = th.length;
                            if (j5 != -1 && j5 != length) {
                                throw new IOException("Content-Length (" + j5 + ") and stream length (" + length + ") disagree");
                            }
                            return th;
                        }
                        throw th;
                    }
                    throw new IOException(z.india(j5, "Cannot buffer entire body for content length: "));
                }

                @NotNull
                public final Reader charStream() {
                    Reader reader = this.reader;
                    if (reader == null) {
                        BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
                        this.reader = bomAwareReader;
                        return bomAwareReader;
                    }
                    return reader;
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    _UtilCommonKt.closeQuietly(get$this_asResponseBody());
                }

                /* renamed from: contentLength */
                public abstract long get$contentLength();

                @Nullable
                /* renamed from: contentType */
                public abstract MediaType get$contentType();

                @NotNull
                /* renamed from: source */
                public abstract m get$this_asResponseBody();

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r2v5 */
                @NotNull
                public final String string() throws IOException {
                    m mVar = get$this_asResponseBody();
                    String th = null;
                    try {
                        String maroon = mVar.maroon(_UtilJvmKt.readBomAsCharset(mVar, charset()));
                        try {
                            mVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        th = th;
                        th = maroon;
                    } catch (Throwable th3) {
                        th = th3;
                        if (mVar != null) {
                            try {
                                mVar.close();
                            } catch (Throwable th4) {
                                AbstractC2689j6.charlie(th, th4);
                            }
                        }
                    }
                    if (th == 0) {
                        return th;
                    }
                    throw th;
                }

                @NotNull
                public static final ResponseBody create(@NotNull n nVar, @Nullable MediaType mediaType) {
                    return INSTANCE.create(nVar, mediaType);
                }

                @NotNull
                public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
                    return INSTANCE.create(str, mediaType);
                }

                @c
                @NotNull
                public static final ResponseBody create(@Nullable MediaType mediaType, long j5, @NotNull m mVar) {
                    return INSTANCE.create(mediaType, j5, mVar);
                }

                @c
                @NotNull
                public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull n nVar) {
                    return INSTANCE.create(mediaType, nVar);
                }

                @c
                @NotNull
                public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
                    return INSTANCE.create(mediaType, str);
                }

                @c
                @NotNull
                public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
                    return INSTANCE.create(mediaType, bArr);
                }

                @NotNull
                public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
                    return INSTANCE.create(bArr, mediaType);
                }
            }
