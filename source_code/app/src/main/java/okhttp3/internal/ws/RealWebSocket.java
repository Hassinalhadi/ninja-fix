package okhttp3.internal.ws;

import L0.e;
import Tf.l;
import Tf.m;
import Tf.n;
import androidx.appcompat.widget.P0;
import com.checkout.components.redirecthandler.RedirectEventValues;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import fe.C1713e;
import g8.d;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\n\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u0086\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010*\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001aJ\r\u00102\u001a\u00020\u0018¢\u0006\u0004\b2\u0010\u001aJ\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u000203¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u000203¢\u0006\u0004\b7\u00105J\u0017\u00109\u001a\u00020\u00182\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u00020\u00182\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b9\u0010=J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010>\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010=J\u0017\u0010@\u001a\u00020\u00182\u0006\u0010>\u001a\u00020;H\u0016¢\u0006\u0004\b@\u0010=J\u001f\u0010C\u001a\u00020\u00182\u0006\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020&H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020.2\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010E\u001a\u00020.2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\bE\u0010GJ\u0015\u0010H\u001a\u00020.2\u0006\u0010>\u001a\u00020;¢\u0006\u0004\bH\u0010GJ!\u0010I\u001a\u00020.2\u0006\u0010A\u001a\u0002032\b\u0010B\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bI\u0010JJ'\u0010I\u001a\u00020.2\u0006\u0010A\u001a\u0002032\b\u0010B\u001a\u0004\u0018\u00010&2\u0006\u0010K\u001a\u00020\f¢\u0006\u0004\bI\u0010LJ\u000f\u0010N\u001a\u00020.H\u0000¢\u0006\u0004\bM\u00100J\u000f\u0010P\u001a\u00020\u0018H\u0000¢\u0006\u0004\bO\u0010\u001aJ/\u0010U\u001a\u00020\u00182\n\u0010S\u001a\u00060Qj\u0002`R2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010T\u001a\u00020.¢\u0006\u0004\bU\u0010VJ\u0013\u0010W\u001a\u00020.*\u00020\u000eH\u0002¢\u0006\u0004\bW\u0010XJ\u001f\u0010E\u001a\u00020.2\u0006\u0010Y\u001a\u00020;2\u0006\u0010Z\u001a\u000203H\u0002¢\u0006\u0004\bE\u0010[J\u000f\u0010\\\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\\\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010]R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010cR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010bR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010bR\u0014\u0010d\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR$\u0010g\u001a\u0004\u0018\u00010f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010eR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010yR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020;0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020}0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010bR\u0017\u0010\u007f\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010eR\u0019\u0010\u0084\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0080\u0001R\u0017\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010\u0082\u0001R\u0017\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0082\u0001R\u0017\u00107\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0082\u0001R\u0019\u0010\u0085\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0080\u0001¨\u0006\u008b\u0001"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "", "cancel", "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "(Lokhttp3/Response;)V", "", "processNextFrame", "()Z", "finishReader", "tearDown", "", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", Constants.KEY_TEXT, "onReadMessage", "(Ljava/lang/String;)V", "LTf/n;", "bytes", "(LTf/n;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(LTf/n;)Z", "pong", Constants.KEY_HIDE_CLOSE, "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", Column.DATA, "formatOpcode", "(LTf/n;I)Z", "runWriter", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "J", "Lokhttp3/internal/ws/WebSocketExtensions;", Constants.KEY_KEY, "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", RedirectEventValues.RESULT_FAILED, "awaitingPong", "Companion", "Message", "Close", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;

    @Nullable
    private Call call;
    private boolean enqueuedClose;

    @Nullable
    private WebSocketExtensions extensions;
    private boolean failed;

    @NotNull
    private final String key;

    @NotNull
    private final WebSocketListener listener;

    @NotNull
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;

    @Nullable
    private String name;

    @NotNull
    private final Request originalRequest;
    private final long pingIntervalMillis;

    @NotNull
    private final ArrayDeque<n> pongQueue;
    private long queueSize;

    @NotNull
    private final Random random;

    @Nullable
    private WebSocketReader reader;
    private int receivedCloseCode;

    @Nullable
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;

    @Nullable
    private Streams streams;

    @NotNull
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;

    @Nullable
    private WebSocketWriter writer;

    @Nullable
    private Task writerTask;

    @NotNull
    private static final List<Protocol> ONLY_HTTP1 = ab.juliet(Protocol.HTTP_1_1);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "LTf/n;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILTf/n;J)V", "I", "getCode", "()I", "LTf/n;", "getReason", "()LTf/n;", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;

        @Nullable
        private final n reason;

        public Close(int i4, @Nullable n nVar, long j5) {
            this.code = i4;
            this.reason = nVar;
            this.cancelAfterCloseMillis = j5;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final n getReason() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "LTf/n;", Column.DATA, "<init>", "(ILTf/n;)V", "I", "getFormatOpcode", "()I", "LTf/n;", "getData", "()LTf/n;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Message {

        @NotNull
        private final n data;
        private final int formatOpcode;

        public Message(int i4, @NotNull n data) {
            Intrinsics.echo(data, "data");
            this.formatOpcode = i4;
            this.data = data;
        }

        @NotNull
        public final n getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "LTf/m;", "source", "LTf/l;", "sink", "<init>", "(ZLTf/m;LTf/l;)V", "", "cancel", "()V", "Z", "getClient", "()Z", "LTf/m;", "getSource", "()LTf/m;", "LTf/l;", "getSink", "()LTf/l;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;

        @NotNull
        private final l sink;

        @NotNull
        private final m source;

        public Streams(boolean z2, @NotNull m source, @NotNull l sink) {
            Intrinsics.echo(source, "source");
            Intrinsics.echo(sink, "sink");
            this.client = z2;
            this.source = source;
            this.sink = sink;
        }

        public abstract void cancel();

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final l getSink() {
            return this.sink;
        }

        @NotNull
        public final m getSource() {
            return this.source;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request originalRequest, @NotNull WebSocketListener listener, @NotNull Random random, long j5, @Nullable WebSocketExtensions webSocketExtensions, long j6, long j7) {
        Intrinsics.echo(taskRunner, "taskRunner");
        Intrinsics.echo(originalRequest, "originalRequest");
        Intrinsics.echo(listener, "listener");
        Intrinsics.echo(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j5;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j6;
        this.webSocketCloseTimeout = j7;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (Intrinsics.areEqual("GET", originalRequest.method())) {
            n nVar = n.silver;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = d.quebec(-1234567890, bArr).alpha();
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
    }

    public static /* synthetic */ Unit delta(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        return failWebSocket$lambda$14$lambda$13(objectRef, objectRef2);
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            response = null;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        realWebSocket.failWebSocket(exc, response, z2);
    }

    public static final Unit failWebSocket$lambda$14$lambda$13(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        _UtilCommonKt.closeQuietly((Closeable) objectRef.alpha);
        Streams streams = (Streams) objectRef2.alpha;
        if (streams != null) {
            _UtilCommonKt.closeQuietly(streams);
        }
        return Unit.INSTANCE;
    }

    public static final Unit finishReader$lambda$5$lambda$4(WebSocketWriter webSocketWriter) {
        _UtilCommonKt.closeQuietly(webSocketWriter);
        return Unit.INSTANCE;
    }

    public static final long initReaderAndWriter$lambda$3$lambda$2(RealWebSocket realWebSocket, long j5) {
        realWebSocket.writePingFrame$okhttp();
        return j5;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fe.g, fe.e] */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        if (webSocketExtensions.serverMaxWindowBits != null && !new C1713e(8, 15, 1).alpha(webSocketExtensions.serverMaxWindowBits.intValue())) {
            return false;
        }
        return true;
    }

    private final void runWriter() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    public static final Unit writeOneFrame$lambda$10$lambda$9(RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return Unit.INSTANCE;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) throws IOException {
        Intrinsics.echo(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", null, 2, null);
            if ("Upgrade".equalsIgnoreCase(header$default)) {
                String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
                if ("websocket".equalsIgnoreCase(header$default2)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
                    n nVar = n.silver;
                    String alpha = d.oscar(this.key + WebSocketProtocol.ACCEPT_MAGIC).charlie("SHA-1").alpha();
                    if (Intrinsics.areEqual(alpha, header$default3)) {
                        if (exchange != null) {
                            return;
                        } else {
                            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                        }
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + alpha + "' but was '" + header$default3 + '\'');
                }
                throw new ProtocolException(AbstractC2327c.victor('\'', "Expected 'Upgrade' header value 'websocket' but was '", header$default2));
            }
            throw new ProtocolException(AbstractC2327c.victor('\'', "Expected 'Connection' header value 'Upgrade' but was '", header$default));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i4, @Nullable String str) {
        return close(i4, str, this.webSocketCloseTimeout);
    }

    public final void connect(@NotNull OkHttpClient client) {
        Intrinsics.echo(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient build = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.echo(call, "call");
                Intrinsics.echo(e, "e");
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                Intrinsics.echo(call, "call");
                Intrinsics.echo(response, "response");
                Exchange exchange = response.getExchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    Intrinsics.checkNotNull(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception e, @Nullable Response response, boolean isWriter) {
        Intrinsics.echo(e, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                Streams streams = this.streams;
                WebSocketWriter webSocketWriter = this.writer;
                objectRef2.alpha = webSocketWriter;
                Streams streams2 = null;
                this.writer = null;
                if (webSocketWriter != null && this.reader == null) {
                    streams2 = streams;
                }
                objectRef.alpha = streams2;
                if (!isWriter && objectRef2.alpha != null) {
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new a(0, objectRef2, objectRef), 2, null);
                }
                this.taskQueue.shutdown();
                try {
                    this.listener.onFailure(this, e, response);
                    if (streams != null) {
                        streams.cancel();
                    }
                    if (isWriter) {
                        WebSocketWriter webSocketWriter2 = (WebSocketWriter) objectRef2.alpha;
                        if (webSocketWriter2 != null) {
                            _UtilCommonKt.closeQuietly(webSocketWriter2);
                        }
                        Streams streams3 = (Streams) objectRef.alpha;
                        if (streams3 != null) {
                            _UtilCommonKt.closeQuietly(streams3);
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finishReader() {
        boolean z2;
        int i4;
        String str;
        WebSocketReader webSocketReader;
        Streams streams;
        synchronized (this) {
            try {
                z2 = this.failed;
                i4 = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                streams = null;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new kotlin.collections.n(13, webSocketWriter), 2, null);
                    }
                    this.taskQueue.shutdown();
                }
                if (this.writer == null) {
                    streams = this.streams;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2 && streams != null && this.receivedCloseCode != -1) {
            WebSocketListener webSocketListener = this.listener;
            Intrinsics.checkNotNull(str);
            webSocketListener.onClosed(this, i4, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
        if (streams != null) {
            _UtilCommonKt.closeQuietly(streams);
        }
    }

    @Nullable
    /* renamed from: getCall$okhttp, reason: from getter */
    public final Call getCall() {
        return this.call;
    }

    @NotNull
    /* renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull String name, @NotNull Streams streams) {
        Throwable th;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.extensions;
        Intrinsics.checkNotNull(webSocketExtensions);
        synchronized (this) {
            try {
                this.name = name;
                this.streams = streams;
                this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j5 = this.pingIntervalMillis;
                if (j5 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j5);
                        this.taskQueue.schedule(name.concat(" ping"), nanos, new e(nanos, 3, this));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
                this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void loopReader(@NotNull Response response) throws IOException {
        Intrinsics.echo(response, "response");
        try {
            try {
                this.listener.onOpen(this, response);
                while (this.receivedCloseCode == -1) {
                    WebSocketReader webSocketReader = this.reader;
                    Intrinsics.checkNotNull(webSocketReader);
                    webSocketReader.processNextFrame();
                }
            } catch (Exception e) {
                failWebSocket$default(this, e, null, false, 6, null);
                finishReader();
            }
        } finally {
            finishReader();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, @NotNull String reason) {
        Intrinsics.echo(reason, "reason");
        if (code != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = code;
                    this.receivedCloseReason = reason;
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            this.listener.onClosing(this, code, reason);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String r22) throws IOException {
        Intrinsics.echo(r22, "text");
        this.listener.onMessage(this, r22);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull n payload) {
        try {
            Intrinsics.echo(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull n payload) {
        Intrinsics.echo(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull n payload) {
        try {
            Intrinsics.echo(payload, "payload");
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    @NotNull
    /* renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String r22) {
        Intrinsics.echo(r22, "text");
        n nVar = n.silver;
        return send(d.oscar(r22), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void setCall$okhttp(@Nullable Call call) {
        this.call = call;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {all -> 0x0091, blocks: (B:25:0x0088, B:32:0x0093, B:34:0x0097, B:35:0x00a7, B:38:0x00b6, B:42:0x00b9, B:43:0x00ba, B:44:0x00bb, B:46:0x00bf, B:48:0x00d1, B:49:0x00e5, B:50:0x00ea, B:37:0x00a8), top: B:23:0x0086, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:25:0x0088, B:32:0x0093, B:34:0x0097, B:35:0x00a7, B:38:0x00b6, B:42:0x00b9, B:43:0x00ba, B:44:0x00bb, B:46:0x00bf, B:48:0x00d1, B:49:0x00e5, B:50:0x00ea, B:37:0x00a8), top: B:23:0x0086, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeOneFrame$okhttp() throws IOException {
        Streams streams;
        String str;
        int i4;
        ?? r5;
        synchronized (this) {
            try {
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter = this.writer;
                n poll = this.pongQueue.poll();
                Object obj = null;
                r4 = null;
                Streams streams2 = null;
                try {
                    if (poll == null) {
                        Object poll2 = this.messageAndCloseQueue.poll();
                        if (poll2 instanceof Close) {
                            int i5 = this.receivedCloseCode;
                            str = this.receivedCloseReason;
                            if (i5 != -1) {
                                WebSocketWriter webSocketWriter2 = this.writer;
                                this.writer = null;
                                if (webSocketWriter2 != null && this.reader == null) {
                                    streams2 = this.streams;
                                }
                                this.taskQueue.shutdown();
                                i4 = i5;
                                streams = streams2;
                                obj = poll2;
                                r5 = webSocketWriter2;
                            } else {
                                long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                                TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new kotlin.collections.n(12, this), 4, null);
                                r5 = 0;
                                obj = poll2;
                                i4 = i5;
                                streams = null;
                            }
                            if (poll == null) {
                                Intrinsics.checkNotNull(webSocketWriter);
                                webSocketWriter.writePong(poll);
                            } else if (obj instanceof Message) {
                                Message message = (Message) obj;
                                Intrinsics.checkNotNull(webSocketWriter);
                                webSocketWriter.writeMessageFrame(message.getFormatOpcode(), message.getData());
                                synchronized (this) {
                                    this.queueSize -= message.getData().delta();
                                }
                            } else if (obj instanceof Close) {
                                Close close = (Close) obj;
                                Intrinsics.checkNotNull(webSocketWriter);
                                webSocketWriter.writeClose(close.getCode(), close.getReason());
                                if (streams != null) {
                                    WebSocketListener webSocketListener = this.listener;
                                    Intrinsics.checkNotNull(str);
                                    webSocketListener.onClosed(this, i4, str);
                                }
                            } else {
                                throw new AssertionError();
                            }
                            if (r5 != 0) {
                                _UtilCommonKt.closeQuietly(r5);
                            }
                            if (streams != null) {
                                _UtilCommonKt.closeQuietly(streams);
                            }
                            return true;
                        }
                        if (poll2 == null) {
                            return false;
                        }
                        streams = null;
                        str = null;
                        obj = poll2;
                    } else {
                        streams = null;
                        str = null;
                    }
                    if (poll == null) {
                    }
                    if (r5 != 0) {
                    }
                    if (streams != null) {
                    }
                    return true;
                } catch (Throwable th) {
                    if (r5 != 0) {
                        _UtilCommonKt.closeQuietly(r5);
                    }
                    if (streams != null) {
                        _UtilCommonKt.closeQuietly(streams);
                    }
                    throw th;
                }
                i4 = -1;
                r5 = str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        int i4;
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                if (this.awaitingPong) {
                    i4 = this.sentPingCount;
                } else {
                    i4 = -1;
                }
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i4 != -1) {
                    StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                    sb2.append(this.pingIntervalMillis);
                    sb2.append("ms (after ");
                    failWebSocket$default(this, new SocketTimeoutException(P0.cyan(sb2, i4 - 1, " successful ping/pongs)")), null, true, 2, null);
                    return;
                }
                try {
                    webSocketWriter.writePing(n.silver);
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean close(int i4, @Nullable String str, long j5) {
        n nVar;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(i4);
            if (str != null) {
                n nVar2 = n.silver;
                nVar = d.oscar(str);
                if (nVar.alpha.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                }
            } else {
                nVar = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i4, nVar, j5));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull n bytes) throws IOException {
        Intrinsics.echo(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull n bytes) {
        Intrinsics.echo(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(n r72, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + r72.delta() > MAX_QUEUE_SIZE) {
                close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                return false;
            }
            this.queueSize += r72.delta();
            this.messageAndCloseQueue.add(new Message(formatOpcode, r72));
            runWriter();
            return true;
        }
        return false;
    }
}
