package okhttp3.internal.cache2;

import Tf.ap;
import Tf.as;
import Tf.k;
import Tf.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import g8.d;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0002FEB5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b'\u0010$R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0017\u0010;\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010D\u001a\u0002048F¢\u0006\u0006\u001a\u0004\bD\u00108¨\u0006G"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "Lokhttp3/internal/concurrent/Lockable;", "Ljava/io/RandomAccessFile;", CTVariableUtils.FILE, "LTf/ap;", "upstream", "", "upstreamPos", "LTf/n;", "metadata", "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;LTf/ap;JLTf/n;J)V", "prefix", "upstreamSize", "metadataSize", "", "writeHeader", "(LTf/n;JJ)V", "writeMetadata", "(J)V", "commit", "()LTf/n;", "newSource", "()LTf/ap;", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "LTf/ap;", "getUpstream", "setUpstream", "(LTf/ap;)V", "J", "getUpstreamPos", "()J", "setUpstreamPos", "LTf/n;", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "LTf/k;", "upstreamBuffer", "LTf/k;", "getUpstreamBuffer", "()LTf/k;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Relay implements Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;

    @NotNull
    public static final n PREFIX_CLEAN;

    @NotNull
    public static final n PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;

    @NotNull
    private final k buffer;
    private final long bufferMaxSize;
    private boolean complete;

    @Nullable
    private RandomAccessFile file;

    @NotNull
    private final n metadata;
    private int sourceCount;

    @Nullable
    private ap upstream;

    @NotNull
    private final k upstreamBuffer;
    private long upstreamPos;

    @Nullable
    private Thread upstreamReader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "<init>", "()V", "Ljava/io/File;", CTVariableUtils.FILE, "LTf/ap;", "upstream", "LTf/n;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "(Ljava/io/File;LTf/ap;LTf/n;J)Lokhttp3/internal/cache2/Relay;", "read", "(Ljava/io/File;)Lokhttp3/internal/cache2/Relay;", "", "SOURCE_UPSTREAM", "I", "SOURCE_FILE", "PREFIX_CLEAN", "LTf/n;", "PREFIX_DIRTY", "FILE_HEADER_SIZE", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Relay edit(@NotNull File file, @NotNull ap upstream, @NotNull n metadata, long bufferMaxSize) throws IOException {
            Intrinsics.echo(file, "file");
            Intrinsics.echo(upstream, "upstream");
            Intrinsics.echo(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [Tf.k, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1, types: [Tf.k, java.lang.Object] */
        @NotNull
        public final Relay read(@NotNull File file) throws IOException {
            Intrinsics.echo(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.delta(channel, "getChannel(...)");
            FileOperator fileOperator = new FileOperator(channel);
            ?? obj = new Object();
            fileOperator.read(0L, obj, Relay.FILE_HEADER_SIZE);
            if (Intrinsics.areEqual(obj.november(r11.delta()), Relay.PREFIX_CLEAN)) {
                long readLong = obj.readLong();
                long readLong2 = obj.readLong();
                ?? obj2 = new Object();
                fileOperator.read(Relay.FILE_HEADER_SIZE + readLong, obj2, readLong2);
                return new Relay(randomAccessFile, null, readLong, obj2.november(obj2.purple), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "LTf/ap;", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "LTf/as;", "timeout", "()LTf/as;", "", Constants.KEY_HIDE_CLOSE, "()V", "LTf/as;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class RelaySource implements ap, AutoCloseable {

        @Nullable
        private FileOperator fileOperator;
        private long sourcePos;

        @NotNull
        private final as timeout = new Object();

        /* JADX WARN: Type inference failed for: r0v0, types: [Tf.as, java.lang.Object] */
        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.delta(channel, "getChannel(...)");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                }
                if (randomAccessFile != null) {
                    _UtilCommonKt.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r6 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
            r2.read(r19.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r6);
            r19.sourcePos += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        
            r0 = r19.this$0.getUpstream();
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
            r11 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        
            r6 = java.lang.Math.min(r11, r21);
            r19.this$0.getUpstreamBuffer().golf(0, r20, r6);
            r19.sourcePos += r6;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
            r13.write(r19.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r19.this$0.getUpstreamBuffer().clone(), r11);
            r4 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
        
            r4.getBuffer().write(r4.getUpstreamBuffer(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
        
            if (r4.getBuffer().purple <= r4.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
        
            r4.getBuffer().india(r4.getBuffer().purple - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
        
            r4.setUpstreamPos(r4.getUpstreamPos() + r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
        
            throw r0;
         */
        @Override // Tf.ap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long read(@NotNull k sink, long byteCount) throws IOException {
            char c3;
            Intrinsics.echo(sink, "sink");
            if (this.fileOperator != null) {
                Relay relay = Relay.this;
                synchronized (relay) {
                    while (true) {
                        try {
                            if (this.sourcePos == relay.getUpstreamPos()) {
                                if (relay.getComplete()) {
                                    return -1L;
                                }
                                if (relay.getUpstreamReader() != null) {
                                    this.timeout.waitUntilNotified(relay);
                                } else {
                                    relay.setUpstreamReader(Thread.currentThread());
                                    c3 = 1;
                                    break;
                                }
                            } else {
                                long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().purple;
                                if (this.sourcePos < upstreamPos) {
                                    c3 = 2;
                                } else {
                                    long min = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                                    relay.getBuffer().golf(this.sourcePos - upstreamPos, sink, min);
                                    this.sourcePos += min;
                                    return min;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
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
        PREFIX_CLEAN = d.oscar("OkHttp cache v1\n");
        PREFIX_DIRTY = d.oscar("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, ap apVar, long j5, n nVar, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, apVar, j5, nVar, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Tf.k, java.lang.Object] */
    public final void writeHeader(n prefix, long upstreamSize, long metadataSize) throws IOException {
        ?? obj = new Object();
        obj.navy(prefix);
        obj.yellow(upstreamSize);
        obj.yellow(metadataSize);
        if (obj.purple == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            Intrinsics.checkNotNull(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.delta(channel, "getChannel(...)");
            new FileOperator(channel).write(0L, obj, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Tf.k, java.lang.Object] */
    private final void writeMetadata(long upstreamSize) throws IOException {
        ?? obj = new Object();
        obj.navy(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.delta(channel, "getChannel(...)");
        new FileOperator(channel).write(FILE_HEADER_SIZE + upstreamSize, obj, this.metadata.delta());
    }

    public final void commit(long upstreamSize) throws IOException {
        writeMetadata(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, upstreamSize, this.metadata.delta());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        ap apVar = this.upstream;
        if (apVar != null) {
            _UtilCommonKt.closeQuietly(apVar);
        }
        this.upstream = null;
    }

    @NotNull
    public final k getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @Nullable
    public final ap getUpstream() {
        return this.upstream;
    }

    @NotNull
    public final k getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: metadata, reason: from getter */
    public final n getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final ap newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z2) {
        this.complete = z2;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i4) {
        this.sourceCount = i4;
    }

    public final void setUpstream(@Nullable ap apVar) {
        this.upstream = apVar;
    }

    public final void setUpstreamPos(long j5) {
        this.upstreamPos = j5;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Tf.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Tf.k, java.lang.Object] */
    private Relay(RandomAccessFile randomAccessFile, ap apVar, long j5, n nVar, long j6) {
        this.file = randomAccessFile;
        this.upstream = apVar;
        this.upstreamPos = j5;
        this.metadata = nVar;
        this.bufferMaxSize = j6;
        this.upstreamBuffer = new Object();
        this.complete = apVar == null;
        this.buffer = new Object();
    }
}
