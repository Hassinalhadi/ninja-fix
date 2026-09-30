package okhttp3.internal.ws;

import Tf.i;
import Tf.k;
import Tf.l;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "LTf/l;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLTf/l;Ljava/util/Random;ZZJ)V", "", "opcode", "LTf/n;", "payload", "", "writeControlFrame", "(ILTf/n;)V", "writePing", "(LTf/n;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", Column.DATA, "writeMessageFrame", Constants.KEY_HIDE_CLOSE, "()V", "Z", "LTf/l;", "getSink", "()LTf/l;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "J", "LTf/k;", "messageBuffer", "LTf/k;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "LTf/i;", "maskCursor", "LTf/i;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable, AutoCloseable {
    private final boolean isClient;

    @Nullable
    private final i maskCursor;

    @Nullable
    private final byte[] maskKey;

    @NotNull
    private final k messageBuffer;

    @Nullable
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @NotNull
    private final Random random;

    @NotNull
    private final l sink;

    @NotNull
    private final k sinkBuffer;
    private boolean writerClosed;

    /* JADX WARN: Type inference failed for: r4v1, types: [Tf.k, java.lang.Object] */
    public WebSocketWriter(boolean z2, @NotNull l sink, @NotNull Random random, boolean z10, boolean z11, long j5) {
        byte[] bArr;
        Intrinsics.echo(sink, "sink");
        Intrinsics.echo(random, "random");
        this.isClient = z2;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z10;
        this.noContextTakeover = z11;
        this.minimumDeflateSize = j5;
        this.messageBuffer = new Object();
        this.sinkBuffer = sink.delta();
        if (z2) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z2 ? new i() : null;
    }

    private final void writeControlFrame(int opcode, n payload) throws IOException {
        if (!this.writerClosed) {
            int delta = payload.delta();
            if (delta <= 125) {
                this.sinkBuffer.pink(opcode | 128);
                if (this.isClient) {
                    this.sinkBuffer.pink(delta | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.olive(this.maskKey);
                    if (delta > 0) {
                        k kVar = this.sinkBuffer;
                        long j5 = kVar.purple;
                        kVar.navy(payload);
                        k kVar2 = this.sinkBuffer;
                        i iVar = this.maskCursor;
                        Intrinsics.checkNotNull(iVar);
                        kVar2.beige(iVar);
                        this.maskCursor.echo(j5);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.pink(delta);
                    this.sinkBuffer.navy(payload);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final l getSink() {
        return this.sink;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Tf.k, java.lang.Object] */
    public final void writeClose(int code, @Nullable n reason) throws IOException {
        n nVar = n.silver;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            ?? obj = new Object();
            obj.d(code);
            if (reason != null) {
                obj.navy(reason);
            }
            nVar = obj.november(obj.purple);
        }
        try {
            writeControlFrame(8, nVar);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, @NotNull n data) throws IOException {
        int i4;
        Intrinsics.echo(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.navy(data);
            int i5 = formatOpcode | 128;
            if (this.perMessageDeflate && data.delta() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i5 = formatOpcode | 192;
            }
            long j5 = this.messageBuffer.purple;
            this.sinkBuffer.pink(i5);
            if (this.isClient) {
                i4 = 128;
            } else {
                i4 = 0;
            }
            if (j5 <= 125) {
                this.sinkBuffer.pink(i4 | ((int) j5));
            } else if (j5 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.pink(i4 | 126);
                this.sinkBuffer.d((int) j5);
            } else {
                this.sinkBuffer.pink(i4 | 127);
                this.sinkBuffer.yellow(j5);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.olive(this.maskKey);
                if (j5 > 0) {
                    k kVar = this.messageBuffer;
                    i iVar = this.maskCursor;
                    Intrinsics.checkNotNull(iVar);
                    kVar.beige(iVar);
                    this.maskCursor.echo(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, j5);
            this.sink.romeo();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(@NotNull n payload) throws IOException {
        Intrinsics.echo(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(@NotNull n payload) throws IOException {
        Intrinsics.echo(payload, "payload");
        writeControlFrame(10, payload);
    }
}
