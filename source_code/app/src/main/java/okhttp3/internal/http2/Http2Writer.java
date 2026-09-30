package okhttp3.internal.http2;

import Tf.k;
import Tf.l;
import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0015J%\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\r2\u0006\u00102\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b8\u0010\u000fJ-\u0010;\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0011J+\u0010?\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010C\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "LTf/l;", "sink", "", "client", "<init>", "(LTf/l;Z)V", "", "streamId", "", "byteCount", "", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "LTf/k;", "source", Column.DATA, "(ZILTf/k;I)V", "flags", "buffer", "dataFrame", "(IILTf/k;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", Constants.KEY_TYPE, "frameHeader", "(IIII)V", Constants.KEY_HIDE_CLOSE, "headerBlock", "headers", "(ZILjava/util/List;)V", "LTf/l;", "Z", "hpackBuffer", "LTf/k;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Http2Writer implements Closeable, Lockable, AutoCloseable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;

    @NotNull
    private final k hpackBuffer;

    @NotNull
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;

    @NotNull
    private final l sink;

    /* JADX WARN: Type inference failed for: r4v0, types: [Tf.k, java.lang.Object] */
    public Http2Writer(@NotNull l sink, boolean z2) {
        Intrinsics.echo(sink, "sink");
        this.sink = sink;
        this.client = z2;
        ?? obj = new Object();
        this.hpackBuffer = obj;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, obj, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) throws IOException {
        int i4;
        while (byteCount > 0) {
            long min = Math.min(this.maxFrameSize, byteCount);
            byteCount -= min;
            int i5 = (int) min;
            if (byteCount == 0) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            frameHeader(streamId, i5, 9, i4);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final void applyAndAckSettings(@NotNull Settings peerSettings) throws IOException {
        Intrinsics.echo(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (!this.closed) {
                    this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
                    if (peerSettings.getHeaderTableSize() != -1) {
                        this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                    }
                    frameHeader(0, 0, 4, 1);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized (this) {
            try {
                if (!this.closed) {
                    if (!this.client) {
                        return;
                    }
                    Logger logger2 = logger;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.echo(), new Object[0]));
                    }
                    this.sink.coral(Http2.CONNECTION_PREFACE);
                    this.sink.flush();
                    return;
                }
                throw new IOException("closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void data(boolean outFinished, int streamId, @Nullable k source, int byteCount) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void dataFrame(int streamId, int flags, @Nullable k buffer, int byteCount) throws IOException {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            l lVar = this.sink;
            Intrinsics.checkNotNull(buffer);
            lVar.write(buffer, byteCount);
        }
    }

    public final void flush() throws IOException {
        synchronized (this) {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void frameHeader(int streamId, int length, int type, int flags) throws IOException {
        int i4;
        int i5;
        int i10;
        int i11;
        if (type != 8) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                i4 = streamId;
                i5 = length;
                i10 = type;
                i11 = flags;
                logger2.fine(Http2.INSTANCE.frameLog(false, i4, i5, i10, i11));
                if (i5 > this.maxFrameSize) {
                    if ((Integer.MIN_VALUE & i4) == 0) {
                        _UtilCommonKt.writeMedium(this.sink, i5);
                        this.sink.black(i10 & 255);
                        this.sink.black(i11 & 255);
                        this.sink.xray(Integer.MAX_VALUE & i4);
                        return;
                    }
                    throw new IllegalArgumentException(ad.zulu(i4, "reserved bit set: ").toString());
                }
                throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i5).toString());
            }
        }
        i4 = streamId;
        i5 = length;
        i10 = type;
        i11 = flags;
        if (i5 > this.maxFrameSize) {
        }
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        Intrinsics.echo(errorCode, "errorCode");
        Intrinsics.echo(debugData, "debugData");
        synchronized (this) {
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(0, debugData.length + 8, 7, 0);
                    this.sink.xray(lastGoodStreamId);
                    this.sink.xray(errorCode.getHttpCode());
                    if (debugData.length != 0) {
                        this.sink.m(debugData);
                    }
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void headers(boolean outFinished, int streamId, @NotNull List<Header> headerBlock) throws IOException {
        int i4;
        Intrinsics.echo(headerBlock, "headerBlock");
        synchronized (this) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(headerBlock);
                long j5 = this.hpackBuffer.purple;
                long min = Math.min(this.maxFrameSize, j5);
                if (j5 == min) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                if (outFinished) {
                    i4 |= 1;
                }
                frameHeader(streamId, (int) min, 1, i4);
                this.sink.write(this.hpackBuffer, min);
                if (j5 > min) {
                    writeContinuationFrames(streamId, j5 - min);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void ping(boolean ack, int payload1, int payload2) throws IOException {
        synchronized (this) {
            if (!this.closed) {
                frameHeader(0, 8, 6, ack ? 1 : 0);
                this.sink.xray(payload1);
                this.sink.xray(payload2);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) throws IOException {
        int i4;
        Intrinsics.echo(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(requestHeaders);
                long j5 = this.hpackBuffer.purple;
                int min = (int) Math.min(this.maxFrameSize - 4, j5);
                int i5 = min + 4;
                long j6 = min;
                if (j5 == j6) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                frameHeader(streamId, i5, 5, i4);
                this.sink.xray(promisedStreamId & LottieConstants.IterateForever);
                this.sink.write(this.hpackBuffer, j6);
                if (j5 > j6) {
                    writeContinuationFrames(streamId, j5 - j6);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void rstStream(int streamId, @NotNull ErrorCode errorCode) throws IOException {
        Intrinsics.echo(errorCode, "errorCode");
        synchronized (this) {
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(streamId, 4, 3, 0);
                    this.sink.xray(errorCode.getHttpCode());
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void settings(@NotNull Settings settings) throws IOException {
        Intrinsics.echo(settings, "settings");
        synchronized (this) {
            try {
                if (!this.closed) {
                    frameHeader(0, settings.size() * 6, 4, 0);
                    for (int i4 = 0; i4 < 10; i4++) {
                        if (settings.isSet(i4)) {
                            this.sink.sierra(i4);
                            this.sink.xray(settings.get(i4));
                        }
                    }
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void windowUpdate(int streamId, long windowSizeIncrement) throws IOException {
        int i4;
        long j5;
        synchronized (this) {
            try {
                if (!this.closed) {
                    if (windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L) {
                        Logger logger2 = logger;
                        if (logger2.isLoggable(Level.FINE)) {
                            i4 = streamId;
                            j5 = windowSizeIncrement;
                            logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i4, 4, j5));
                        } else {
                            i4 = streamId;
                            j5 = windowSizeIncrement;
                        }
                        frameHeader(i4, 4, 8, 0);
                        this.sink.xray((int) j5);
                        this.sink.flush();
                    } else {
                        throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
