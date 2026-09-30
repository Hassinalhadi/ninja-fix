package okhttp3.internal.ws;

import Tf.i;
import Tf.k;
import Tf.m;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "LTf/m;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLTf/m;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "", "readHeader", "()V", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", Constants.KEY_HIDE_CLOSE, "Z", "LTf/m;", "getSource", "()LTf/m;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "closed", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "LTf/k;", "controlFrameBuffer", "LTf/k;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "LTf/i;", "maskCursor", "LTf/i;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable, AutoCloseable {
    private boolean closed;

    @NotNull
    private final k controlFrameBuffer;

    @NotNull
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;

    @Nullable
    private final i maskCursor;

    @Nullable
    private final byte[] maskKey;

    @NotNull
    private final k messageFrameBuffer;

    @Nullable
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;

    @NotNull
    private final m source;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", Constants.KEY_TEXT, "", "onReadMessage", "(Ljava/lang/String;)V", "LTf/n;", "bytes", "(LTf/n;)V", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void onReadClose(int code, @NotNull String reason);

        void onReadMessage(@NotNull n bytes) throws IOException;

        void onReadMessage(@NotNull String text) throws IOException;

        void onReadPing(@NotNull n payload);

        void onReadPong(@NotNull n payload);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Tf.k, java.lang.Object] */
    public WebSocketReader(boolean z2, @NotNull m source, @NotNull FrameCallback frameCallback, boolean z10, boolean z11) {
        byte[] bArr;
        Intrinsics.echo(source, "source");
        Intrinsics.echo(frameCallback, "frameCallback");
        this.isClient = z2;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z10;
        this.noContextTakeover = z11;
        this.controlFrameBuffer = new Object();
        this.messageFrameBuffer = new Object();
        if (z2) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = z2 ? null : new i();
    }

    private final void readControlFrame() throws IOException {
        short s3;
        String str;
        long j5 = this.frameLength;
        if (j5 > 0) {
            this.source.a(this.controlFrameBuffer, j5);
            if (!this.isClient) {
                k kVar = this.controlFrameBuffer;
                i iVar = this.maskCursor;
                Intrinsics.checkNotNull(iVar);
                kVar.beige(iVar);
                this.maskCursor.echo(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                i iVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.toggleMask(iVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                k kVar2 = this.controlFrameBuffer;
                long j6 = kVar2.purple;
                if (j6 != 1) {
                    if (j6 != 0) {
                        s3 = kVar2.readShort();
                        str = this.controlFrameBuffer.green();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s3);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        s3 = 1005;
                        str = "";
                    }
                    this.frameCallback.onReadClose(s3, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                FrameCallback frameCallback = this.frameCallback;
                k kVar3 = this.controlFrameBuffer;
                frameCallback.onReadPing(kVar3.november(kVar3.purple));
                return;
            case 10:
                FrameCallback frameCallback2 = this.frameCallback;
                k kVar4 = this.controlFrameBuffer;
                frameCallback2.onReadPong(kVar4.november(kVar4.purple));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + _UtilJvmKt.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = _UtilCommonKt.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i4 = and & 15;
                this.opcode = i4;
                boolean z13 = false;
                if ((and & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isFinalFrame = z2;
                if ((and & 8) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.isControlFrame = z10;
                if (z10 && !z2) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((and & 64) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i4 != 1 && i4 != 2) {
                    if (z11) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z11) {
                        if (this.perMessageDeflate) {
                            z12 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z12 = false;
                    }
                    this.readingCompressedMessage = z12;
                }
                if ((and & 32) == 0) {
                    if ((and & 16) == 0) {
                        int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
                        if ((and2 & 128) != 0) {
                            z13 = true;
                        }
                        if (z13 == this.isClient) {
                            if (this.isClient) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j5 = and2 & 127;
                        this.frameLength = j5;
                        if (j5 == 126) {
                            this.frameLength = _UtilCommonKt.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        } else if (j5 == 127) {
                            long readLong = this.source.readLong();
                            this.frameLength = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + _UtilJvmKt.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.isControlFrame && this.frameLength > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z13) {
                            m mVar = this.source;
                            byte[] bArr = this.maskKey;
                            Intrinsics.checkNotNull(bArr);
                            mVar.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j5 = this.frameLength;
            if (j5 > 0) {
                this.source.a(this.messageFrameBuffer, j5);
                if (!this.isClient) {
                    k kVar = this.messageFrameBuffer;
                    i iVar = this.maskCursor;
                    Intrinsics.checkNotNull(iVar);
                    kVar.beige(iVar);
                    this.maskCursor.echo(this.messageFrameBuffer.purple - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    i iVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.toggleMask(iVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + _UtilJvmKt.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i4 = this.opcode;
        if (i4 != 1 && i4 != 2) {
            throw new ProtocolException("Unknown opcode: " + _UtilJvmKt.toHexString(i4));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i4 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.green());
            return;
        }
        FrameCallback frameCallback = this.frameCallback;
        k kVar = this.messageFrameBuffer;
        frameCallback.onReadMessage(kVar.november(kVar.purple));
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    @NotNull
    public final m getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
