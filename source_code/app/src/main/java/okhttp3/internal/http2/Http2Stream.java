package okhttp3.internal.http2;

import A0.z;
import Tf.ao;
import Tf.ap;
import Tf.as;
import Tf.g;
import Tf.k;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0004vwuxB3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b3\u0010+J\u000f\u00105\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u0010(J\u0015\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020\u0017H\u0000¢\u0006\u0004\b:\u0010(J\u000f\u0010=\u001a\u00020\u0017H\u0000¢\u0006\u0004\b<\u0010(J!\u0010>\u001a\u00020\u00072\u0006\u0010)\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR*\u0010N\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u00109R*\u0010S\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010O\u001a\u0004\bT\u0010Q\"\u0004\bU\u00109R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010-\u001a\u00060[R\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\\\u001a\u0004\b]\u0010^R\u001e\u0010`\u001a\u00060_R\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001e\u0010\u001e\u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010gR\u001e\u0010 \u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bh\u0010gR$\u0010)\u001a\u0004\u0018\u00010!8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010+R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0011\u0010r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010AR\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bs\u0010AR\u0011\u0010t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010A¨\u0006y"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/concurrent/Lockable;", "", "", Constants.KEY_ID, "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "callerIsIdle", "takeHeaders", "(Z)Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "flushHeaders", "", "writeHeaders", "(Ljava/util/List;ZZ)V", "trailers", "enqueueTrailers", "(Lokhttp3/Headers;)V", "LTf/as;", "readTimeout", "()LTf/as;", "writeTimeout", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", Constants.KEY_HIDE_CLOSE, "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "cancel", "()V", "errorCode", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "LTf/m;", "source", "length", "receiveData", "(LTf/m;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "doReadTimeout", "()Z", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "value", "writeBytesTotal", "J", "getWriteBytesTotal", "()J", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "isLocallyInitiated", "isSourceComplete", "Companion", "FramingSource", "FramingSink", "StreamTimeout", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Http2Stream implements Lockable {
    public static final long EMIT_BUFFER_SIZE = 16384;

    @NotNull
    private final Http2Connection connection;

    @Nullable
    private ErrorCode errorCode;

    @Nullable
    private IOException errorException;
    private boolean hasResponseHeaders;

    @NotNull
    private final ArrayDeque<Headers> headersQueue;
    private final int id;

    @NotNull
    private final WindowCounter readBytes;

    @NotNull
    private final StreamTimeout readTimeout;

    @NotNull
    private final FramingSink sink;

    @NotNull
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @NotNull
    private final StreamTimeout writeTimeout;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "LTf/ap;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "read", "", "updateConnectionFlowControl", "(J)V", "LTf/k;", "sink", "byteCount", "(LTf/k;J)J", "LTf/m;", "source", "receive$okhttp", "(LTf/m;J)V", "receive", "LTf/as;", "timeout", "()LTf/as;", Constants.KEY_HIDE_CLOSE, "()V", "J", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "LTf/k;", "getReceiveBuffer", "()LTf/k;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class FramingSource implements ap, AutoCloseable {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @Nullable
        private Headers trailers;

        @NotNull
        private final k receiveBuffer = new Object();

        @NotNull
        private final k readBuffer = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [Tf.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [Tf.k, java.lang.Object] */
        public FramingSource(long j5, boolean z2) {
            this.maxByteCount = j5;
            this.finished = z2;
        }

        private final void updateConnectionFlowControl(long read) {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j5;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                k kVar = this.readBuffer;
                j5 = kVar.purple;
                kVar.charlie();
                Intrinsics.charlie(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
            }
            if (j5 > 0) {
                updateConnectionFlowControl(j5);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @NotNull
        public final k getReadBuffer() {
            return this.readBuffer;
        }

        @NotNull
        public final k getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        @Override // Tf.ap
        public long read(@NotNull k sink, long byteCount) throws IOException {
            IOException iOException;
            boolean z2;
            long j5;
            Intrinsics.echo(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(z.india(byteCount, "byteCount < 0: ").toString());
            }
            do {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    boolean doReadTimeout = http2Stream.doReadTimeout();
                    if (doReadTimeout) {
                        http2Stream.getReadTimeout().enter();
                    }
                    try {
                        if (http2Stream.getErrorCode$okhttp() != null && !this.finished) {
                            iOException = http2Stream.getErrorException();
                            if (iOException == null) {
                                ErrorCode errorCode$okhttp = http2Stream.getErrorCode$okhttp();
                                Intrinsics.checkNotNull(errorCode$okhttp);
                                iOException = new StreamResetException(errorCode$okhttp);
                            }
                        } else {
                            iOException = null;
                        }
                        if (!this.closed) {
                            k kVar = this.readBuffer;
                            long j6 = kVar.purple;
                            z2 = false;
                            if (j6 > 0) {
                                j5 = kVar.read(sink, Math.min(byteCount, j6));
                                WindowCounter.update$default(http2Stream.getReadBytes(), j5, 0L, 2, null);
                                long unacknowledged = http2Stream.getReadBytes().getUnacknowledged();
                                if (iOException == null && unacknowledged >= http2Stream.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                    http2Stream.getConnection().writeWindowUpdateLater$okhttp(http2Stream.getId(), unacknowledged);
                                    WindowCounter.update$default(http2Stream.getReadBytes(), 0L, unacknowledged, 1, null);
                                }
                            } else {
                                if (!this.finished && iOException == null) {
                                    http2Stream.waitForIo$okhttp();
                                    z2 = true;
                                }
                                j5 = -1;
                            }
                            if (doReadTimeout) {
                                http2Stream.getReadTimeout().exitAndThrowIfTimedOut();
                            }
                        } else {
                            throw new IOException("stream closed");
                        }
                    } finally {
                    }
                }
                Http2Stream.this.getConnection().getFlowControlListener().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.purple);
            } while (z2);
            if (j5 != -1) {
                return j5;
            }
            if (iOException == null) {
                return -1L;
            }
            throw iOException;
        }

        public final void receive$okhttp(@NotNull m source, long byteCount) throws IOException {
            boolean z2;
            boolean z10;
            boolean z11;
            Intrinsics.echo(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j5 = byteCount;
            while (j5 > 0) {
                synchronized (Http2Stream.this) {
                    z2 = this.finished;
                    z10 = false;
                    if (this.readBuffer.purple + j5 > this.maxByteCount) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    source.india(j5);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z2) {
                    source.india(j5);
                    return;
                }
                long read = source.read(this.receiveBuffer, j5);
                if (read != -1) {
                    j5 -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (this.closed) {
                                this.receiveBuffer.charlie();
                            } else {
                                k kVar = this.readBuffer;
                                if (kVar.purple == 0) {
                                    z10 = true;
                                }
                                kVar.f(this.receiveBuffer);
                                if (z10) {
                                    Intrinsics.charlie(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                    http2Stream2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
            updateConnectionFlowControl(byteCount);
            Http2Stream.this.getConnection().getFlowControlListener().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.purple);
        }

        public final void setClosed$okhttp(boolean z2) {
            this.closed = z2;
        }

        public final void setFinished$okhttp(boolean z2) {
            this.finished = z2;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // Tf.ap
        @NotNull
        /* renamed from: timeout */
        public as getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "LTf/g;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "", "timedOut", "()V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "exitAndThrowIfTimedOut", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class StreamTimeout extends g {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // Tf.g
        @NotNull
        public IOException newTimeoutException(@Nullable IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // Tf.g
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i4, @NotNull Http2Connection connection, boolean z2, boolean z10, @Nullable Headers headers) {
        Intrinsics.echo(connection, "connection");
        this.id = i4;
        this.connection = connection;
        this.readBytes = new WindowCounter(i4);
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z10);
        this.sink = new FramingSink(z2);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            if (getSource().getFinished()) {
                if (getSink().getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doReadTimeout() {
        if (this.connection.getClient() && !getSink().getClosed() && !getSink().getFinished()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Headers takeHeaders$default(Http2Stream http2Stream, boolean z2, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            z2 = false;
        }
        return http2Stream.takeHeaders(z2);
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    public void cancel() {
        closeLater(ErrorCode.CANCEL);
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z2;
        boolean isOpen;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (getSource().getFinished() || !getSource().getClosed() || (!getSink().getFinished() && !getSink().getClosed())) {
                    z2 = false;
                    isOpen = isOpen();
                }
                z2 = true;
                isOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!getSink().getClosed()) {
            if (!getSink().getFinished()) {
                if (getErrorCode$okhttp() != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                        Intrinsics.checkNotNull(errorCode$okhttp);
                        throw new StreamResetException(errorCode$okhttp);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(@NotNull ErrorCode rstStatusCode, @Nullable IOException errorException) throws IOException {
        Intrinsics.echo(rstStatusCode, "rstStatusCode");
        if (!closeInternal(rstStatusCode, errorException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        Intrinsics.echo(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(@NotNull Headers trailers) {
        Intrinsics.echo(trailers, "trailers");
        synchronized (this) {
            if (!getSink().getFinished()) {
                if (trailers.size() != 0) {
                    getSink().setTrailers(trailers);
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    @Nullable
    /* renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    @NotNull
    /* renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    /* renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z2;
        if ((this.id & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.connection.getClient() == z2) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        synchronized (this) {
            try {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (!getSource().getFinished()) {
                    if (getSource().getClosed()) {
                    }
                    return true;
                }
                if (getSink().getFinished() || getSink().getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isSourceComplete() {
        boolean z2;
        synchronized (this) {
            if (getSource().getFinished()) {
                if (getSource().getReadBuffer().hotel()) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        return z2;
    }

    @Nullable
    public final Headers peekTrailers() throws IOException {
        synchronized (this) {
            if (getSource().getFinished() && getSource().getReceiveBuffer().hotel() && getSource().getReadBuffer().hotel()) {
                Headers trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = Headers.EMPTY;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                    Intrinsics.checkNotNull(errorCode$okhttp);
                    throw new StreamResetException(errorCode$okhttp);
                }
                throw iOException;
            }
            return null;
        }
    }

    @NotNull
    public final as readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@NotNull m source, int length) throws IOException {
        Intrinsics.echo(source, "source");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        getSource().receive$okhttp(source, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:10:0x0035, B:12:0x003a, B:14:0x0042, B:17:0x004b, B:19:0x005e, B:20:0x0065, B:27:0x0055), top: B:9:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void receiveHeaders(@NotNull Headers headers, boolean inFinished) {
        boolean isOpen;
        Intrinsics.echo(headers, "headers");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.hasResponseHeaders && headers.get(Header.RESPONSE_STATUS_UTF8) == null && headers.get(Header.TARGET_METHOD_UTF8) == null) {
                    getSource().setTrailers(headers);
                    if (inFinished) {
                        getSource().setFinished$okhttp(true);
                    }
                    isOpen = isOpen();
                    notifyAll();
                }
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
                if (inFinished) {
                }
                isOpen = isOpen();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void receiveRstStream(@NotNull ErrorCode errorCode) {
        Intrinsics.echo(errorCode, "errorCode");
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.errorCode = errorCode;
                notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final void setWriteBytesMaximum$okhttp(long j5) {
        this.writeBytesMaximum = j5;
    }

    public final void setWriteBytesTotal$okhttp(long j5) {
        this.writeBytesTotal = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0011, B:13:0x001f, B:18:0x0029, B:25:0x0032, B:26:0x0037, B:30:0x0038, B:32:0x0040, B:35:0x004f, B:40:0x0060, B:39:0x0054, B:15:0x0024), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0001 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Headers takeHeaders(boolean callerIsIdle) throws IOException {
        Headers headers;
        boolean z2;
        synchronized (this) {
            while (this.headersQueue.isEmpty() && getErrorCode$okhttp() == null) {
                try {
                    try {
                        if (!callerIsIdle && !doReadTimeout()) {
                            z2 = false;
                            if (z2) {
                                this.readTimeout.enter();
                            }
                            waitForIo$okhttp();
                            if (!z2) {
                                this.readTimeout.exitAndThrowIfTimedOut();
                            }
                        }
                        waitForIo$okhttp();
                        if (!z2) {
                        }
                    } catch (Throwable th) {
                        if (z2) {
                            this.readTimeout.exitAndThrowIfTimedOut();
                        }
                        throw th;
                    }
                    z2 = true;
                    if (z2) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!this.headersQueue.isEmpty()) {
                Headers removeFirst = this.headersQueue.removeFirst();
                Intrinsics.delta(removeFirst, "removeFirst(...)");
                headers = removeFirst;
            } else {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                    Intrinsics.checkNotNull(errorCode$okhttp);
                    throw new StreamResetException(errorCode$okhttp);
                }
                throw iOException;
            }
        }
        return headers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) throws IOException {
        Intrinsics.echo(responseHeaders, "responseHeaders");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (outFinished) {
                getSink().setFinished(true);
                notifyAll();
            }
        }
        if (!flushHeaders) {
            synchronized (this) {
                if (this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum()) {
                    flushHeaders = true;
                } else {
                    flushHeaders = false;
                }
            }
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    @NotNull
    public final as writeTimeout() {
        return this.writeTimeout;
    }

    @NotNull
    public FramingSink getSink() {
        return this.sink;
    }

    @NotNull
    public FramingSource getSource() {
        return this.source;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\t¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "LTf/ao;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "outFinishedOnLastFrame", "", "emitFrame", "(Z)V", "LTf/k;", "source", "", "byteCount", "write", "(LTf/k;J)V", "flush", "()V", "LTf/as;", "timeout", "()LTf/as;", Constants.KEY_HIDE_CLOSE, "Z", "getFinished", "()Z", "setFinished", "sendBuffer", "LTf/k;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class FramingSink implements ao, AutoCloseable {
        private boolean closed;
        private boolean finished;

        @NotNull
        private final k sendBuffer;

        @Nullable
        private Headers trailers;

        /* JADX WARN: Type inference failed for: r1v1, types: [Tf.k, java.lang.Object] */
        public FramingSink(boolean z2) {
            this.finished = z2;
            this.sendBuffer = new Object();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean outFinishedOnLastFrame) throws IOException {
            long min;
            boolean z2;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.purple);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (outFinishedOnLastFrame && min == this.sendBuffer.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z10 = z2;
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z10, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z2;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!Http2Stream.this.getSink().finished) {
                    if (this.sendBuffer.purple > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.trailers != null) {
                        while (this.sendBuffer.purple > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        Intrinsics.checkNotNull(headers);
                        connection.writeHeaders$okhttp(id2, z2, _UtilJvmKt.toHeaderList(headers));
                    } else if (z10) {
                        while (this.sendBuffer.purple > 0) {
                            emitFrame(true);
                        }
                    } else if (z2) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    Intrinsics.charlie(http2Stream3, "null cannot be cast to non-null type java.lang.Object");
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // Tf.ao, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.purple > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z2) {
            this.closed = z2;
        }

        public final void setFinished(boolean z2) {
            this.finished = z2;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // Tf.ao
        @NotNull
        public as timeout() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // Tf.ao
        public void write(@NotNull k source, long byteCount) throws IOException {
            Intrinsics.echo(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(source, byteCount);
            while (this.sendBuffer.purple >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2);
        }
    }
}
