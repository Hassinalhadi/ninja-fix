package okhttp3;

import A0.z;
import Tf.ag;
import Tf.ap;
import Tf.ar;
import Tf.as;
import Tf.k;
import Tf.m;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import g8.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http1.HeadersReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "LTf/m;", "source", "", "boundary", "<init>", "(LTf/m;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "", "maxByteCount", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", Constants.KEY_HIDE_CLOSE, "()V", "LTf/m;", "Ljava/lang/String;", "()Ljava/lang/String;", "LTf/n;", "dashDashBoundary", "LTf/n;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable, AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ag afterBoundaryOptions;

    @NotNull
    private final String boundary;
    private boolean closed;

    @NotNull
    private final n crlfDashDashBoundary;

    @Nullable
    private PartSource currentPart;

    @NotNull
    private final n dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;

    @NotNull
    private final m source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "<init>", "()V", "LTf/ag;", "afterBoundaryOptions", "LTf/ag;", "getAfterBoundaryOptions", "()LTf/ag;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ag getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "LTf/m;", "body", "<init>", "(Lokhttp3/Headers;LTf/m;)V", "", Constants.KEY_HIDE_CLOSE, "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "LTf/m;", "()LTf/m;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Part implements Closeable, AutoCloseable {

        @NotNull
        private final m body;

        @NotNull
        private final Headers headers;

        public Part(@NotNull Headers headers, @NotNull m body) {
            Intrinsics.echo(headers, "headers");
            Intrinsics.echo(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @NotNull
        /* renamed from: body, reason: from getter */
        public final m getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        @NotNull
        /* renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "LTf/ap;", "<init>", "(Lokhttp3/MultipartReader;)V", "", Constants.KEY_HIDE_CLOSE, "()V", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "LTf/as;", "timeout", "()LTf/as;", "LTf/as;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class PartSource implements ap, AutoCloseable {

        @NotNull
        private final as timeout = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [Tf.as, java.lang.Object] */
        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // Tf.ap
        public long read(@NotNull k sink, long byteCount) {
            long read;
            long j5;
            long read2;
            Intrinsics.echo(sink, "sink");
            if (byteCount >= 0) {
                if (Intrinsics.areEqual(MultipartReader.this.currentPart, this)) {
                    as timeout = MultipartReader.this.source.getTimeout();
                    as asVar = this.timeout;
                    MultipartReader multipartReader = MultipartReader.this;
                    long timeoutNanos = timeout.timeoutNanos();
                    ar arVar = as.Companion;
                    long timeoutNanos2 = asVar.timeoutNanos();
                    long timeoutNanos3 = timeout.timeoutNanos();
                    arVar.getClass();
                    if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
                        timeoutNanos2 = timeoutNanos3;
                    }
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(timeoutNanos2, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (asVar.hasDeadline()) {
                            j5 = deadlineNanoTime;
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), asVar.deadlineNanoTime()));
                        } else {
                            j5 = deadlineNanoTime;
                        }
                        try {
                            long currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                            if (currentPartBytesRemaining == 0) {
                                read2 = -1;
                            } else {
                                read2 = multipartReader.source.read(sink, currentPartBytesRemaining);
                            }
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (asVar.hasDeadline()) {
                                timeout.deadlineNanoTime(j5);
                            }
                            return read2;
                        } catch (Throwable th) {
                            long j6 = j5;
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (asVar.hasDeadline()) {
                                timeout.deadlineNanoTime(j6);
                            }
                            throw th;
                        }
                    }
                    if (asVar.hasDeadline()) {
                        timeout.deadlineNanoTime(asVar.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                        if (currentPartBytesRemaining2 == 0) {
                            read = -1;
                        } else {
                            read = multipartReader.source.read(sink, currentPartBytesRemaining2);
                        }
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (asVar.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read;
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (asVar.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(z.india(byteCount, "byteCount < 0: ").toString());
        }

        @Override // Tf.ap
        @NotNull
        /* renamed from: timeout, reason: from getter */
        public as getTimeout() {
            return this.timeout;
        }
    }

    static {
        n nVar = n.silver;
        afterBoundaryOptions = Tf.b.foxtrot(d.oscar("\r\n"), d.oscar("--"), d.oscar(" "), d.oscar("\t"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Tf.k, java.lang.Object] */
    public MultipartReader(@NotNull m source, @NotNull String boundary) throws IOException {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        ?? obj = new Object();
        obj.n("--");
        obj.n(boundary);
        this.dashDashBoundary = obj.november(obj.purple);
        ?? obj2 = new Object();
        obj2.n("\r\n--");
        obj2.n(boundary);
        this.crlfDashDashBoundary = obj2.november(obj2.purple);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxByteCount) {
        long min = Math.min(this.source.delta().purple, maxByteCount) + 1;
        long v4 = this.source.v(min, this.crlfDashDashBoundary);
        if (v4 != -1) {
            return v4;
        }
        if (this.source.delta().purple >= min) {
            return Math.min(min, maxByteCount);
        }
        throw new EOFException();
    }

    @NotNull
    /* renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @Nullable
    public final Part nextPart() throws IOException {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.whiskey(0L, this.dashDashBoundary)) {
                this.source.india(this.dashDashBoundary.delta());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192L);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.india(currentPartBytesRemaining);
                }
                this.source.india(this.crlfDashDashBoundary.delta());
            }
            boolean z2 = false;
            while (true) {
                int c3 = this.source.c(afterBoundaryOptions);
                if (c3 != -1) {
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 == 2 || c3 == 3) {
                                z2 = true;
                            }
                        } else {
                            if (!z2) {
                                if (this.partCount != 0) {
                                    this.noMoreParts = true;
                                    return null;
                                }
                                throw new ProtocolException("expected at least 1 part");
                            }
                            throw new ProtocolException("unexpected characters after boundary");
                        }
                    } else {
                        this.partCount++;
                        Headers readHeaders = new HeadersReader(this.source).readHeaders();
                        PartSource partSource = new PartSource();
                        this.currentPart = partSource;
                        return new Part(readHeaders, Tf.b.charlie(partSource));
                    }
                } else {
                    throw new ProtocolException("unexpected characters after boundary");
                }
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipartReader(@NotNull ResponseBody response) throws IOException {
        this(r0, r3);
        String parameter;
        Intrinsics.echo(response, "response");
        m source = response.getSource();
        MediaType mediaType = response.getMediaType();
        if (mediaType != null && (parameter = mediaType.parameter("boundary")) != null) {
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
