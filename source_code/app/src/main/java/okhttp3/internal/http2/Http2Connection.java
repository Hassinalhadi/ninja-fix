package okhttp3.internal.http2;

import Jb.av;
import Tf.k;
import Tf.l;
import Tf.m;
import Tf.n;
import Yb.F;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import db.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\bÂ\u0001Ã\u0001Ä\u0001Á\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00100\u001a\u00020+H\u0000¢\u0006\u0004\b1\u0010.J\u001f\u00106\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00105J%\u0010:\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=J\r\u0010:\u001a\u00020\u0013¢\u0006\u0004\b:\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0013¢\u0006\u0004\b?\u0010=J\u0015\u0010@\u001a\u00020\u00132\u0006\u00100\u001a\u00020+¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bB\u0010=J)\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\u00132\b\b\u0002\u0010I\u001a\u00020\u001bH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0013H\u0000¢\u0006\u0004\bS\u0010=J\u0017\u0010W\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010VJ%\u0010Z\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\bX\u0010YJ-\u0010^\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\\\u0010]J/\u0010c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\ba\u0010bJ\u001f\u0010e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\bd\u0010.J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010g\u001a\u00020\u00132\b\u0010f\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR&\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R#\u0010|\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\t\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0081\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010}\u001a\u0005\b\u0082\u0001\u0010\t\"\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010jR\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0091\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0091\u0001R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009d\u0001\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R(\u0010¡\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010\u009e\u0001\u001a\u0006\b¢\u0001\u0010 \u0001\"\u0005\b£\u0001\u0010OR\u001d\u0010¥\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R*\u0010ª\u0001\u001a\u00020\u00112\u0007\u0010©\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0091\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R*\u0010\u00ad\u0001\u001a\u00020\u00112\u0007\u0010©\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0091\u0001\u001a\u0006\b®\u0001\u0010¬\u0001R \u0010°\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001d\u0010µ\u0001\u001a\u00030´\u00018\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R!\u0010º\u0001\u001a\u00070¹\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001¨\u0006Å\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "openStreamCount", "()I", Constants.KEY_ID, "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "removeStream", "", "read", "", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "newStream", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "LTf/k;", "buffer", "byteCount", "writeData", "(IZLTf/k;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", Constants.KEY_HIDE_CLOSE, "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "start", "(Z)V", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "LTf/m;", "source", "pushDataLater$okhttp", "(ILTf/m;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "e", "failConnection", "(Ljava/io/IOException;)V", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "value", "writeBytesTotal", "getWriteBytesTotal", "()J", "writeBytesMaximum", "getWriteBytesMaximum", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Companion", "Builder", "ReaderRunnable", "Listener", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Http2Connection implements Closeable, Lockable, AutoCloseable {
    public static final int AWAIT_PING = 3;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;

    @NotNull
    private final String connectionName;

    @NotNull
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;

    @NotNull
    private final FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;

    @NotNull
    private final Listener listener;
    private int nextStreamId;

    @NotNull
    private final Settings okHttpSettings;

    @NotNull
    private Settings peerSettings;

    @NotNull
    private final PushObserver pushObserver;

    @NotNull
    private final TaskQueue pushQueue;

    @NotNull
    private final WindowCounter readBytes;

    @NotNull
    private final ReaderRunnable readerRunnable;

    @NotNull
    private final TaskQueue settingsListenerQueue;

    @NotNull
    private final Socket socket;

    @NotNull
    private final Map<Integer, Http2Stream> streams;

    @NotNull
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @NotNull
    private final Http2Writer writer;

    @NotNull
    private final TaskQueue writerQueue;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\t\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Ljava/net/Socket;", "socket", "", "peerName", "LTf/m;", "source", "LTf/l;", "sink", "(Ljava/net/Socket;Ljava/lang/String;LTf/m;LTf/l;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "(Lokhttp3/internal/http2/FlowControlListener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "LTf/m;", "getSource$okhttp", "()LTf/m;", "setSource$okhttp", "(LTf/m;)V", "LTf/l;", "getSink$okhttp", "()LTf/l;", "setSink$okhttp", "(LTf/l;)V", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "setFlowControlListener$okhttp", "(Lokhttp3/internal/http2/FlowControlListener;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;

        @NotNull
        private FlowControlListener flowControlListener;

        @NotNull
        private Listener listener;
        private int pingIntervalMillis;

        @NotNull
        private PushObserver pushObserver;
        public l sink;
        public Socket socket;
        public m source;

        @NotNull
        private final TaskRunner taskRunner;

        public Builder(boolean z2, @NotNull TaskRunner taskRunner) {
            Intrinsics.echo(taskRunner, "taskRunner");
            this.client = z2;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.flowControlListener = FlowControlListener.None.INSTANCE;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, m mVar, l lVar, int i4, Object obj) throws IOException {
            if ((i4 & 2) != 0) {
                str = _UtilJvmKt.peerName(socket);
            }
            if ((i4 & 4) != 0) {
                mVar = Tf.b.charlie(Tf.b.kilo(socket));
            }
            if ((i4 & 8) != 0) {
                lVar = Tf.b.bravo(Tf.b.india(socket));
            }
            return builder.socket(socket, str, mVar, lVar);
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        @NotNull
        public final Builder flowControlListener(@NotNull FlowControlListener flowControlListener) {
            Intrinsics.echo(flowControlListener, "flowControlListener");
            this.flowControlListener = flowControlListener;
            return this;
        }

        /* renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            Intrinsics.lima("connectionName");
            throw null;
        }

        @NotNull
        /* renamed from: getFlowControlListener$okhttp, reason: from getter */
        public final FlowControlListener getFlowControlListener() {
            return this.flowControlListener;
        }

        @NotNull
        /* renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        @NotNull
        /* renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        @NotNull
        public final l getSink$okhttp() {
            l lVar = this.sink;
            if (lVar != null) {
                return lVar;
            }
            Intrinsics.lima("sink");
            throw null;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            Intrinsics.lima("socket");
            throw null;
        }

        @NotNull
        public final m getSource$okhttp() {
            m mVar = this.source;
            if (mVar != null) {
                return mVar;
            }
            Intrinsics.lima("source");
            throw null;
        }

        @NotNull
        /* renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        @NotNull
        public final Builder listener(@NotNull Listener listener) {
            Intrinsics.echo(listener, "listener");
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver) {
            Intrinsics.echo(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z2) {
            this.client = z2;
        }

        public final void setConnectionName$okhttp(@NotNull String str) {
            Intrinsics.echo(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setFlowControlListener$okhttp(@NotNull FlowControlListener flowControlListener) {
            Intrinsics.echo(flowControlListener, "<set-?>");
            this.flowControlListener = flowControlListener;
        }

        public final void setListener$okhttp(@NotNull Listener listener) {
            Intrinsics.echo(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i4) {
            this.pingIntervalMillis = i4;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver) {
            Intrinsics.echo(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(@NotNull l lVar) {
            Intrinsics.echo(lVar, "<set-?>");
            this.sink = lVar;
        }

        public final void setSocket$okhttp(@NotNull Socket socket) {
            Intrinsics.echo(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(@NotNull m mVar) {
            Intrinsics.echo(mVar, "<set-?>");
            this.source = mVar;
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket) throws IOException {
            Intrinsics.echo(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName) throws IOException {
            Intrinsics.echo(socket, "socket");
            Intrinsics.echo(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull m source) throws IOException {
            Intrinsics.echo(socket, "socket");
            Intrinsics.echo(peerName, "peerName");
            Intrinsics.echo(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        @NotNull
        public final Builder socket(@NotNull Socket socket, @NotNull String peerName, @NotNull m source, @NotNull l sink) throws IOException {
            String concat;
            Intrinsics.echo(socket, "socket");
            Intrinsics.echo(peerName, "peerName");
            Intrinsics.echo(source, "source");
            Intrinsics.echo(sink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                concat = _UtilJvmKt.okHttpName + ' ' + peerName;
            } else {
                concat = "MockWebServer ".concat(peerName);
            }
            setConnectionName$okhttp(concat);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "OKHTTP_CLIENT_WINDOW_SIZE", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "onStream", "", "stream", "Lokhttp3/internal/http2/Http2Stream;", "onSettings", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Listener {

        @NotNull
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) throws IOException {
                Intrinsics.echo(stream, "stream");
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(@NotNull Http2Connection connection, @NotNull Settings settings) {
            Intrinsics.echo(connection, "connection");
            Intrinsics.echo(settings, "settings");
        }

        public abstract void onStream(@NotNull Http2Stream stream) throws IOException;
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\tJ'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b8\u00109J?\u0010@\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "invoke", "()V", "", "inFinished", "", "streamId", "LTf/m;", "source", "length", Column.DATA, "(ZILTf/m;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "LTf/n;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;LTf/n;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", Constants.INAPP_PRIORITY, "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;LTf/n;Ljava/lang/String;IJ)V", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        @NotNull
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(@NotNull Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.echo(reader, "reader");
            this.this$0 = http2Connection;
            this.reader = reader;
        }

        public static final Unit applyAndAckSettings$lambda$7$lambda$6$lambda$5(Http2Connection http2Connection, Ref.ObjectRef objectRef) {
            http2Connection.getListener().onSettings(http2Connection, (Settings) objectRef.alpha);
            return Unit.INSTANCE;
        }

        public static final Unit headers$lambda$2$lambda$1(Http2Connection http2Connection, Http2Stream http2Stream) {
            try {
                http2Connection.getListener().onStream(http2Stream);
            } catch (IOException e) {
                Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName(), 4, e);
                try {
                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                } catch (IOException unused) {
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit ping$lambda$10(Http2Connection http2Connection, int i4, int i5) {
            http2Connection.writePing(true, i4, i5);
            return Unit.INSTANCE;
        }

        public static final Unit settings$lambda$3(ReaderRunnable readerRunnable, boolean z2, Settings settings) {
            readerRunnable.applyAndAckSettings(z2, settings);
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, @NotNull String origin, @NotNull n protocol, @NotNull String host, int port, long maxAge) {
            Intrinsics.echo(origin, "origin");
            Intrinsics.echo(protocol, "protocol");
            Intrinsics.echo(host, "host");
        }

        public final void applyAndAckSettings(boolean clearPrevious, @NotNull Settings settings) {
            long initialWindowSize;
            int i4;
            Http2Stream[] http2StreamArr;
            Http2Stream[] http2StreamArr2;
            Settings settings2 = settings;
            Intrinsics.echo(settings2, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Http2Writer writer = this.this$0.getWriter();
            Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!clearPrevious) {
                            Settings settings3 = new Settings();
                            settings3.merge(peerSettings);
                            settings3.merge(settings2);
                            settings2 = settings3;
                        }
                        objectRef.alpha = settings2;
                        initialWindowSize = settings2.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            http2StreamArr2 = http2StreamArr;
                            http2Connection.setPeerSettings((Settings) objectRef.alpha);
                            TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName() + " onSettings", 0L, false, new F(29, http2Connection, objectRef), 6, null);
                        }
                        http2StreamArr = null;
                        http2StreamArr2 = http2StreamArr;
                        http2Connection.setPeerSettings((Settings) objectRef.alpha);
                        TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName() + " onSettings", 0L, false, new F(29, http2Connection, objectRef), 6, null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) objectRef.alpha);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
            }
            if (http2StreamArr2 != null) {
                for (Http2Stream http2Stream : http2StreamArr2) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z2, int i4, @NotNull m source, int i5) throws IOException {
            Intrinsics.echo(source, "source");
            if (this.this$0.pushedStream$okhttp(i4)) {
                this.this$0.pushDataLater$okhttp(i4, source, i5, z2);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i4);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i4, ErrorCode.PROTOCOL_ERROR);
                long j5 = i5;
                this.this$0.updateConnectionFlowControl$okhttp(j5);
                source.india(j5);
                return;
            }
            stream.receiveData(source, i5);
            if (z2) {
                stream.receiveHeaders(Headers.EMPTY, true);
            }
        }

        @NotNull
        /* renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, @NotNull ErrorCode errorCode, @NotNull n debugData) {
            int i4;
            Object[] array;
            Intrinsics.echo(errorCode, "errorCode");
            Intrinsics.echo(debugData, "debugData");
            debugData.delta();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, @NotNull List<Header> headerBlock) {
            Intrinsics.echo(headerBlock, "headerBlock");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (streamId <= http2Connection.getLastGoodStreamId()) {
                        return;
                    }
                    if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                        return;
                    }
                    Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, _UtilJvmKt.toHeaders(headerBlock));
                    http2Connection.setLastGoodStreamId$okhttp(streamId);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
                    TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.getConnectionName() + '[' + streamId + "] onStream", 0L, false, new F(28, http2Connection, http2Stream), 6, null);
                    return;
                }
                stream.receiveHeaders(_UtilJvmKt.toHeaders(headerBlock), inFinished);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            if (!ack) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                String str = this.this$0.getConnectionName() + " ping";
                final Http2Connection http2Connection = this.this$0;
                TaskQueue.execute$default(taskQueue, str, 0L, false, new Function0() { // from class: okhttp3.internal.http2.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ping$lambda$10;
                        ping$lambda$10 = Http2Connection.ReaderRunnable.ping$lambda$10(Http2Connection.this, payload1, payload2);
                        return ping$lambda$10;
                    }
                }, 6, null);
                return;
            }
            Http2Connection http2Connection2 = this.this$0;
            synchronized (http2Connection2) {
                try {
                    if (payload1 == 1) {
                        http2Connection2.intervalPongsReceived++;
                    } else if (payload1 == 2) {
                        http2Connection2.degradedPongsReceived++;
                    } else if (payload1 == 3) {
                        http2Connection2.awaitPongsReceived++;
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i4, int i5, int i10, boolean z2) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, @NotNull List<Header> requestHeaders) {
            Intrinsics.echo(requestHeaders, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, @NotNull ErrorCode errorCode) {
            Intrinsics.echo(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(streamId)) {
                this.this$0.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(streamId);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean clearPrevious, @NotNull Settings settings) {
            Intrinsics.echo(settings, "settings");
            TaskQueue.execute$default(this.this$0.writerQueue, this.this$0.getConnectionName() + " applyAndAckSettings", 0L, false, new p(this, clearPrevious, settings), 6, null);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    http2Connection.notifyAll();
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(windowSizeIncrement);
                }
            }
        }

        /* renamed from: invoke */
        public void invoke2() {
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    try {
                        this.this$0.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                        _UtilCommonKt.closeQuietly(this.reader);
                    } catch (IOException e) {
                        e = e;
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        this.this$0.close$okhttp(errorCode2, errorCode2, e);
                        _UtilCommonKt.closeQuietly(this.reader);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode, null);
                    _UtilCommonKt.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode, null);
                _UtilCommonKt.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(@NotNull Builder builder) {
        int i4;
        Intrinsics.echo(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient()) {
            i4 = 3;
        } else {
            i4 = 2;
        }
        this.nextStreamId = i4;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        TaskQueue newQueue = taskRunner.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(4, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            newQueue.schedule(P0.crimson(connectionName$okhttp, " ping"), nanos, new L0.e(nanos, 2, this));
        }
    }

    public static final long _init_$lambda$2(Http2Connection http2Connection, long j5) {
        boolean z2;
        synchronized (http2Connection) {
            long j6 = http2Connection.intervalPongsReceived;
            long j7 = http2Connection.intervalPingsSent;
            if (j6 < j7) {
                z2 = true;
            } else {
                http2Connection.intervalPingsSent = j7 + 1;
                z2 = false;
            }
        }
        if (z2) {
            http2Connection.failConnection(null);
            return -1L;
        }
        http2Connection.writePing(false, 1, 0);
        return j5;
    }

    public final void failConnection(IOException e) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, e);
    }

    public static final Unit pushDataLater$lambda$38(Http2Connection http2Connection, int i4, k kVar, int i5, boolean z2) {
        try {
            boolean onData = http2Connection.pushObserver.onData(i4, kVar, i5, z2);
            if (onData) {
                http2Connection.writer.rstStream(i4, ErrorCode.CANCEL);
            }
            if (onData || z2) {
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i4));
                }
            }
        } catch (IOException unused) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit pushHeadersLater$lambda$35(Http2Connection http2Connection, int i4, List list, boolean z2) {
        boolean onHeaders = http2Connection.pushObserver.onHeaders(i4, list, z2);
        if (onHeaders) {
            try {
                http2Connection.writer.rstStream(i4, ErrorCode.CANCEL);
            } catch (IOException unused) {
            }
        }
        if (onHeaders || z2) {
            synchronized (http2Connection) {
                http2Connection.currentPushRequests.remove(Integer.valueOf(i4));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit pushRequestLater$lambda$32(Http2Connection http2Connection, int i4, List list) {
        if (http2Connection.pushObserver.onRequest(i4, list)) {
            try {
                http2Connection.writer.rstStream(i4, ErrorCode.CANCEL);
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i4));
                }
            } catch (IOException unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit pushResetLater$lambda$40(Http2Connection http2Connection, int i4, ErrorCode errorCode) {
        http2Connection.pushObserver.onReset(i4, errorCode);
        synchronized (http2Connection) {
            http2Connection.currentPushRequests.remove(Integer.valueOf(i4));
        }
        return Unit.INSTANCE;
    }

    public static final Unit sendDegradedPingLater$lambda$28(Http2Connection http2Connection) {
        http2Connection.writePing(false, 2, 0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z2, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        http2Connection.start(z2);
    }

    public static final Unit writeSynResetLater$lambda$12(Http2Connection http2Connection, int i4, ErrorCode errorCode) {
        try {
            http2Connection.writeSynReset$okhttp(i4, errorCode);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return Unit.INSTANCE;
    }

    public static final Unit writeWindowUpdateLater$lambda$13(Http2Connection http2Connection, int i4, long j5) {
        try {
            http2Connection.writer.windowUpdate(i4, j5);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return Unit.INSTANCE;
    }

    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                wait();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@NotNull ErrorCode connectionCode, @NotNull ErrorCode streamCode, @Nullable IOException cause) {
        int i4;
        Object[] objArr;
        Intrinsics.echo(connectionCode, "connectionCode");
        Intrinsics.echo(streamCode, "streamCode");
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            } else {
                objArr = null;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    /* renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    @NotNull
    /* renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    @NotNull
    /* renamed from: getFlowControlListener$okhttp, reason: from getter */
    public final FlowControlListener getFlowControlListener() {
        return this.flowControlListener;
    }

    /* renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    @NotNull
    /* renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    @NotNull
    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    @NotNull
    /* renamed from: getSocket$okhttp, reason: from getter */
    public final Socket getSocket() {
        return this.socket;
    }

    @Nullable
    public final Http2Stream getStream(int r22) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(r22));
        }
        return http2Stream;
    }

    @NotNull
    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final boolean isHealthy(long nowNs) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (nowNs >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.echo(requestHeaders, "requestHeaders");
        return newStream(0, requestHeaders, out);
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Tf.k, java.lang.Object] */
    public final void pushDataLater$okhttp(final int streamId, @NotNull m source, final int byteCount, final boolean inFinished) throws IOException {
        Intrinsics.echo(source, "source");
        final ?? obj = new Object();
        long j5 = byteCount;
        source.kilo(j5);
        source.read(obj, j5);
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + streamId + "] onData", 0L, false, new Function0() { // from class: okhttp3.internal.http2.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit pushDataLater$lambda$38;
                pushDataLater$lambda$38 = Http2Connection.pushDataLater$lambda$38(Http2Connection.this, streamId, obj, byteCount, inFinished);
                return pushDataLater$lambda$38;
            }
        }, 6, null);
    }

    public final void pushHeadersLater$okhttp(final int streamId, @NotNull final List<Header> requestHeaders, final boolean inFinished) {
        Intrinsics.echo(requestHeaders, "requestHeaders");
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + streamId + "] onHeaders", 0L, false, new Function0() { // from class: okhttp3.internal.http2.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit pushHeadersLater$lambda$35;
                pushHeadersLater$lambda$35 = Http2Connection.pushHeadersLater$lambda$35(Http2Connection.this, streamId, requestHeaders, inFinished);
                return pushHeadersLater$lambda$35;
            }
        }, 6, null);
    }

    public final void pushRequestLater$okhttp(int streamId, @NotNull List<Header> requestHeaders) {
        Intrinsics.echo(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + streamId + "] onRequest", 0L, false, new av(streamId, 2, this, requestHeaders), 6, null);
        }
    }

    public final void pushResetLater$okhttp(int streamId, @NotNull ErrorCode errorCode) {
        Intrinsics.echo(errorCode, "errorCode");
        TaskQueue.execute$default(this.pushQueue, this.connectionName + '[' + streamId + "] onReset", 0L, false, new c(this, streamId, errorCode, 1), 6, null);
    }

    @NotNull
    public final Http2Stream pushStream(int associatedStreamId, @NotNull List<Header> requestHeaders, boolean out) throws IOException {
        Intrinsics.echo(requestHeaders, "requestHeaders");
        if (!this.client) {
            return newStream(associatedStreamId, requestHeaders, out);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final boolean pushedStream$okhttp(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    @Nullable
    public final Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(streamId));
            notifyAll();
        }
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j5 = this.degradedPongsReceived;
            long j6 = this.degradedPingsSent;
            if (j5 < j6) {
                return;
            }
            this.degradedPingsSent = j6 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            TaskQueue.execute$default(this.writerQueue, P0.gold(new StringBuilder(), this.connectionName, " ping"), 0L, false, new kotlin.collections.n(11, this), 6, null);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i4) {
        this.lastGoodStreamId = i4;
    }

    public final void setNextStreamId$okhttp(int i4) {
        this.nextStreamId = i4;
    }

    public final void setPeerSettings(@NotNull Settings settings) {
        Intrinsics.echo(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(@NotNull Settings settings) throws IOException {
        Intrinsics.echo(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(@NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.echo(statusCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, statusCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, 1, null);
    }

    public final void updateConnectionFlowControl$okhttp(long read) {
        synchronized (this) {
            try {
                WindowCounter.update$default(this.readBytes, read, 0L, 2, null);
                long unacknowledged = this.readBytes.getUnacknowledged();
                if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
                }
                this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.getMaxFrameSize());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeData(int streamId, boolean outFinished, @Nullable k buffer, long byteCount) throws IOException {
        int min;
        long j5;
        boolean z2;
        if (byteCount == 0) {
            this.writer.data(outFinished, streamId, buffer, 0);
            return;
        }
        loop0: while (byteCount > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.writeBytesTotal;
                            long j7 = this.writeBytesMaximum;
                            if (j6 < j7) {
                                break;
                            } else if (!this.streams.containsKey(Integer.valueOf(streamId))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            byteCount -= j5;
            Http2Writer http2Writer = this.writer;
            if (outFinished && byteCount == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            http2Writer.data(z2, streamId, buffer, min);
        }
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, @NotNull List<Header> alternating) throws IOException {
        Intrinsics.echo(alternating, "alternating");
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, @NotNull ErrorCode statusCode) throws IOException {
        Intrinsics.echo(statusCode, "statusCode");
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(int streamId, @NotNull ErrorCode errorCode) {
        Intrinsics.echo(errorCode, "errorCode");
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + streamId + "] writeSynReset", 0L, false, new c(this, streamId, errorCode, 0), 6, null);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + '[' + streamId + "] windowUpdate", 0L, false, new Function0() { // from class: okhttp3.internal.http2.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit writeWindowUpdateLater$lambda$13;
                writeWindowUpdateLater$lambda$13 = Http2Connection.writeWindowUpdateLater$lambda$13(Http2Connection.this, streamId, unacknowledgedBytesRead);
                return writeWindowUpdateLater$lambda$13;
            }
        }, 6, null);
    }

    private final Http2Stream newStream(int associatedStreamId, List<Header> requestHeaders, boolean out) throws IOException {
        Throwable th;
        boolean z2 = true;
        boolean z10 = !out;
        synchronized (this.writer) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.nextStreamId > 1073741823) {
                                try {
                                    shutdown(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (!this.isShutdown) {
                                    int i4 = this.nextStreamId;
                                    this.nextStreamId = i4 + 2;
                                    Http2Stream http2Stream = new Http2Stream(i4, this, z10, false, null);
                                    if (out && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                                        z2 = false;
                                    }
                                    if (http2Stream.isOpen()) {
                                        this.streams.put(Integer.valueOf(i4), http2Stream);
                                    }
                                    if (associatedStreamId == 0) {
                                        this.writer.headers(z10, i4, requestHeaders);
                                    } else if (!this.client) {
                                        this.writer.pushPromise(associatedStreamId, i4, requestHeaders);
                                    } else {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    if (z2) {
                                        this.writer.flush();
                                    }
                                    return http2Stream;
                                }
                                throw new ConnectionShutdownException();
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final void start(boolean sendConnectionPreface) throws IOException {
        if (sendConnectionPreface) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
