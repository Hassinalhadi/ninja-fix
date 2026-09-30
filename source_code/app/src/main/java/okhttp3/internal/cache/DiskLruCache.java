package okhttp3.internal.cache;

import Tf.ah;
import Tf.aj;
import Tf.ak;
import Tf.ao;
import Tf.ap;
import Tf.b;
import Tf.l;
import Tf.u;
import Tf.v;
import Tf.x;
import androidx.appcompat.widget.P0;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k4.C2007a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import n.Y;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;
import s6.AbstractC2689j6;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001l\u0018\u0000 o2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004pqroB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\b\u0018\u00010\u001cR\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J#\u0010&\u001a\u00020\u00112\n\u0010!\u001a\u00060\u001cR\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\"2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010\u0013J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010\u0013J\r\u00103\u001a\u00020\u0011¢\u0006\u0004\b3\u0010\u0013J\r\u00104\u001a\u00020\u0011¢\u0006\u0004\b4\u0010\u0013J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000005¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010\u0013J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010\u0013J\u000f\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\b@\u00100J\u000f\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bA\u0010\u0013J\u000f\u0010B\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u00100J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bC\u0010>R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010LR*\u0010\f\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010N\u001a\u0004\bO\u0010 \"\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010DR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010DR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010DR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u0018\u0010U\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR>\u0010Y\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u00000Wj\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u00060)R\u00020\u0000`X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010GR\u0016\u0010^\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010_R\"\u0010b\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010_\u001a\u0004\bc\u00100\"\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R\u0016\u0010g\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010_R\u0016\u0010h\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010NR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006s"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/concurrent/Lockable;", "LTf/u;", "fileSystem", "LTf/ah;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(LTf/u;LTf/ah;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "initialize", "()V", "rebuildJournal$okhttp", "rebuildJournal", "", Constants.KEY_KEY, "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "size", "()J", "editor", "", RedirectionConstants.REDIRECT_SUCCESS_VALUE, "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "()Z", Constants.KEY_HIDE_CLOSE, "trimToSize", "delete", "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "readJournal", "LTf/l;", "newJournalWriter", "()LTf/l;", "line", "readJournalLine", "(Ljava/lang/String;)V", "processJournal", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", "validateKey", "LTf/ah;", "getDirectory", "()LTf/ah;", "I", "getValueCount$okhttp", "()I", "LTf/u;", "getFileSystem$okhttp", "()LTf/u;", "value", "J", "getMaxSize", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "LTf/l;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Companion", "Snapshot", "Editor", "Entry", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable, AutoCloseable {
    private final int appVersion;
    private boolean civilizedFileSystem;

    @NotNull
    private final TaskQueue cleanupQueue;

    @NotNull
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;

    @NotNull
    private final ah directory;

    @NotNull
    private final u fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;

    @NotNull
    private final ah journalFile;

    @NotNull
    private final ah journalFileBackup;

    @NotNull
    private final ah journalFileTmp;

    @Nullable
    private l journalWriter;

    @NotNull
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    @NotNull
    public static final String JOURNAL_FILE = "journal";

    @NotNull
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";

    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";

    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";

    @NotNull
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;

    @NotNull
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");

    @NotNull
    public static final String CLEAN = "CLEAN";

    @NotNull
    public static final String DIRTY = "DIRTY";

    @NotNull
    public static final String REMOVE = "REMOVE";

    @NotNull
    public static final String READ = "READ";

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "", "detach$okhttp", "()V", "detach", "", "index", "LTf/ap;", "newSource", "(I)LTf/ap;", "LTf/ao;", "newSink", "(I)LTf/ao;", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Editor {
        private boolean done;

        @NotNull
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;

        @Nullable
        private final boolean[] written;

        public Editor(@NotNull DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            Intrinsics.echo(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount()];
            }
            this.written = zArr;
        }

        public static final Unit newSink$lambda$3$lambda$2(DiskLruCache diskLruCache, Editor editor, IOException it) {
            Intrinsics.echo(it, "it");
            synchronized (diskLruCache) {
                editor.detach$okhttp();
            }
            return Unit.INSTANCE;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                            diskLruCache.completeEdit$okhttp(this, true);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        @NotNull
        /* renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        @Nullable
        /* renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [Tf.ao, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v7, types: [Tf.ao, java.lang.Object] */
        @NotNull
        public final ao newSink(int index) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (!Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                            return new Object();
                        }
                        if (!this.entry.getReadable()) {
                            boolean[] zArr = this.written;
                            Intrinsics.checkNotNull(zArr);
                            zArr[index] = true;
                        }
                        try {
                            return new FaultHidingSink(diskLruCache.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new C2007a(6, diskLruCache, this));
                        } catch (FileNotFoundException unused) {
                            return new Object();
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Nullable
        public final ap newSource(int index) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    ap apVar = null;
                    if (!this.entry.getReadable() || !Intrinsics.areEqual(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                        return null;
                    }
                    try {
                        apVar = diskLruCache.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                    } catch (FileNotFoundException unused) {
                    }
                    return apVar;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001d\u001a\b\u0018\u00010\u0019R\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R(\u00109\u001a\b\u0018\u000108R\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", Constants.KEY_KEY, "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "strings", "", "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "LTf/ap;", "newSource", "(I)LTf/ap;", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "LTf/l;", "writer", "writeLengths$okhttp", "(LTf/l;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "LTf/ah;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Entry {

        @NotNull
        private final List<ah> cleanFiles;

        @Nullable
        private Editor currentEditor;

        @NotNull
        private final List<ah> dirtyFiles;

        @NotNull
        private final String key;

        @NotNull
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@NotNull DiskLruCache diskLruCache, String key) {
            Intrinsics.echo(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i4 = 0; i4 < valueCount; i4++) {
                sb2.append(i4);
                List<ah> list = this.cleanFiles;
                ah directory = this.this$0.getDirectory();
                String sb3 = sb2.toString();
                Intrinsics.delta(sb3, "toString(...)");
                list.add(directory.foxtrot(sb3));
                sb2.append(".tmp");
                List<ah> list2 = this.dirtyFiles;
                ah directory2 = this.this$0.getDirectory();
                String sb4 = sb2.toString();
                Intrinsics.delta(sb4, "toString(...)");
                list2.add(directory2.foxtrot(sb4));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> strings) throws IOException {
            throw new IOException("unexpected journal line: " + strings);
        }

        private final ap newSource(int index) {
            ap source = this.this$0.getFileSystem().source(this.cleanFiles.get(index));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new x(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // Tf.x, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = diskLruCache;
                        DiskLruCache.Entry entry = this;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                            if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                        }
                    }
                }
            };
        }

        @NotNull
        public final List<ah> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @Nullable
        /* renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final List<ah> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @NotNull
        /* renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@NotNull List<String> strings) throws IOException {
            Intrinsics.echo(strings, "strings");
            if (strings.size() == this.this$0.getValueCount()) {
                try {
                    int size = strings.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        this.lengths[i4] = Long.parseLong(strings.get(i4));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(strings);
                    throw new KotlinNothingValueException();
                }
            }
            invalidLengths(strings);
            throw new KotlinNothingValueException();
        }

        public final void setLockingSourceCount$okhttp(int i4) {
            this.lockingSourceCount = i4;
        }

        public final void setReadable$okhttp(boolean z2) {
            this.readable = z2;
        }

        public final void setSequenceNumber$okhttp(long j5) {
            this.sequenceNumber = j5;
        }

        public final void setZombie$okhttp(boolean z2) {
            this.zombie = z2;
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.this$0.getValueCount();
                for (int i4 = 0; i4 < valueCount; i4++) {
                    arrayList.add(newSource(i4));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    _UtilCommonKt.closeQuietly((ap) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@NotNull l writer) throws IOException {
            Intrinsics.echo(writer, "writer");
            for (long j5 : this.lengths) {
                writer.black(32).y(j5);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\rJ\u0013\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", Constants.KEY_KEY, "", "sequenceNumber", "", "LTf/ap;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "index", "getSource", "(I)LTf/ap;", "getLength", "(I)J", "", Constants.KEY_HIDE_CLOSE, "()V", "Ljava/lang/String;", "J", "Ljava/util/List;", "[J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public final class Snapshot implements Closeable, AutoCloseable {

        @NotNull
        private final String key;

        @NotNull
        private final long[] lengths;
        private final long sequenceNumber;

        @NotNull
        private final List<ap> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@NotNull DiskLruCache diskLruCache, String key, @NotNull long j5, @NotNull List<? extends ap> sources, long[] lengths) {
            Intrinsics.echo(key, "key");
            Intrinsics.echo(sources, "sources");
            Intrinsics.echo(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j5;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<ap> it = this.sources.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly(it.next());
            }
        }

        @Nullable
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int index) {
            return this.lengths[index];
        }

        @NotNull
        public final ap getSource(int index) {
            return this.sources.get(index);
        }

        @NotNull
        /* renamed from: key, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@NotNull u fileSystem, @NotNull ah directory, int i4, int i5, long j5, @NotNull TaskRunner taskRunner) {
        Intrinsics.echo(fileSystem, "fileSystem");
        Intrinsics.echo(directory, "directory");
        Intrinsics.echo(taskRunner, "taskRunner");
        this.directory = directory;
        this.appVersion = i4;
        this.valueCount = i5;
        this.fileSystem = new v(fileSystem) { // from class: okhttp3.internal.cache.DiskLruCache$fileSystem$1
            @Override // Tf.v, Tf.u
            public ao sink(ah file, boolean mustCreate) {
                Intrinsics.echo(file, "file");
                ah charlie = file.charlie();
                if (charlie != null) {
                    createDirectories(charlie);
                }
                return super.sink(file, mustCreate);
            }
        };
        this.maxSize = j5;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new Task(P0.gold(new StringBuilder(), _UtilJvmKt.okHttpName, " Cache")) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            /* JADX WARN: Type inference failed for: r1v5, types: [Tf.ao, java.lang.Object] */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z2;
                l lVar;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z2 = diskLruCache.initialized;
                    if (!z2 || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        lVar = diskLruCache.journalWriter;
                        if (lVar != null) {
                            _UtilCommonKt.closeQuietly(lVar);
                        }
                        diskLruCache.journalWriter = b.bravo(new Object());
                    }
                    return -1L;
                }
            }
        };
        if (j5 > 0) {
            if (i5 > 0) {
                this.journalFile = directory.foxtrot(JOURNAL_FILE);
                this.journalFileTmp = directory.foxtrot(JOURNAL_FILE_TEMP);
                this.journalFileBackup = directory.foxtrot(JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static /* synthetic */ Unit charlie(DiskLruCache diskLruCache, IOException iOException) {
        return newJournalWriter$lambda$3(diskLruCache, iOException);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j5, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j5 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j5);
    }

    public final boolean journalRebuildRequired() {
        int i4 = this.redundantOpCount;
        if (i4 >= 2000 && i4 >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final l newJournalWriter() throws FileNotFoundException {
        return b.bravo(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new Y(4, this)));
    }

    public static final Unit newJournalWriter$lambda$3(DiskLruCache diskLruCache, IOException it) {
        Intrinsics.echo(it, "it");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
        }
        diskLruCache.hasJournalErrors = true;
        return Unit.INSTANCE;
    }

    private final void processJournal() throws IOException {
        _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.delta(next, "next(...)");
            Entry entry = next;
            int i4 = 0;
            if (entry.getCurrentEditor() == null) {
                int i5 = this.valueCount;
                while (i4 < i5) {
                    this.size += entry.getLengths()[i4];
                    i4++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i10 = this.valueCount;
                while (i4 < i10) {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i4));
                    _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getDirtyFiles$okhttp().get(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void readJournal() throws IOException {
        ak charlie = b.charlie(this.fileSystem.source(this.journalFile));
        try {
            String fuchsia = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia2 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia3 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia4 = charlie.fuchsia(Long.MAX_VALUE);
            String fuchsia5 = charlie.fuchsia(Long.MAX_VALUE);
            if (Intrinsics.areEqual(MAGIC, fuchsia) && Intrinsics.areEqual(VERSION_1, fuchsia2) && Intrinsics.areEqual(String.valueOf(this.appVersion), fuchsia3) && Intrinsics.areEqual(String.valueOf(this.valueCount), fuchsia4) && fuchsia5.length() <= 0) {
                int i4 = 0;
                while (true) {
                    try {
                        readJournalLine(charlie.fuchsia(Long.MAX_VALUE));
                        i4++;
                    } catch (EOFException unused) {
                        this.redundantOpCount = i4 - this.lruEntries.size();
                        if (!charlie.hotel()) {
                            rebuildJournal$okhttp();
                        } else {
                            l lVar = this.journalWriter;
                            if (lVar != null) {
                                _UtilCommonKt.closeQuietly(lVar);
                            }
                            this.journalWriter = newJournalWriter();
                        }
                        try {
                            charlie.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th != null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + fuchsia + ", " + fuchsia2 + ", " + fuchsia4 + ", " + fuchsia5 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                charlie.close();
            } catch (Throwable th3) {
                AbstractC2689j6.charlie(th, th3);
            }
            if (th != null) {
            }
        }
    }

    private final void readJournalLine(String line) throws IOException {
        String substring;
        int emerald = StringsKt.emerald(line, ' ', 0, 6);
        if (emerald != -1) {
            int i4 = emerald + 1;
            int emerald2 = StringsKt.emerald(line, ' ', i4, 4);
            if (emerald2 == -1) {
                substring = line.substring(i4);
                Intrinsics.delta(substring, "substring(...)");
                String str = REMOVE;
                if (emerald == str.length() && r.quebec(line, str, false)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = line.substring(i4, emerald2);
                Intrinsics.delta(substring, "substring(...)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (emerald2 != -1) {
                String str2 = CLEAN;
                if (emerald == str2.length() && r.quebec(line, str2, false)) {
                    String substring2 = line.substring(emerald2 + 1);
                    Intrinsics.delta(substring2, "substring(...)");
                    List<String> navy = StringsKt.navy(substring2, new char[]{' '});
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(navy);
                    return;
                }
            }
            if (emerald2 == -1) {
                String str3 = DIRTY;
                if (emerald == str3.length() && r.quebec(line, str3, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (emerald2 == -1) {
                String str4 = READ;
                if (emerald == str4.length() && r.quebec(line, str4, false)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(line));
        }
        throw new IOException("unexpected journal line: ".concat(line));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            Intrinsics.delta(entry, "next(...)");
            Entry entry2 = entry;
            if (!entry2.getZombie()) {
                removeEntry$okhttp(entry2);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String r32) {
        if (LEGAL_KEY_PATTERN.echo(r32)) {
        } else {
            throw new IllegalArgumentException(AbstractC2327c.victor('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", r32).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                Intrinsics.delta(values, "<get-values>(...)");
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    Intrinsics.checkNotNull(entry);
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                l lVar = this.journalWriter;
                if (lVar != null) {
                    _UtilCommonKt.closeQuietly(lVar);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(@NotNull Editor editor, boolean r10) throws IOException {
        long j5;
        Intrinsics.echo(editor, "editor");
        Entry entry = editor.getEntry();
        if (Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            if (r10 && !entry.getReadable()) {
                int i4 = this.valueCount;
                for (int i5 = 0; i5 < i4; i5++) {
                    boolean[] written = editor.getWritten();
                    Intrinsics.checkNotNull(written);
                    if (written[i5]) {
                        if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i5))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                    }
                }
            }
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                ah ahVar = entry.getDirtyFiles$okhttp().get(i11);
                if (r10 && !entry.getZombie()) {
                    if (this.fileSystem.exists(ahVar)) {
                        ah ahVar2 = entry.getCleanFiles$okhttp().get(i11);
                        this.fileSystem.atomicMove(ahVar, ahVar2);
                        long j6 = entry.getLengths()[i11];
                        Long l10 = this.fileSystem.metadata(ahVar2).delta;
                        if (l10 != null) {
                            j5 = l10.longValue();
                        } else {
                            j5 = 0;
                        }
                        entry.getLengths()[i11] = j5;
                        this.size = (this.size - j6) + j5;
                    }
                } else {
                    _UtilCommonKt.deleteIfExists(this.fileSystem, ahVar);
                }
            }
            entry.setCurrentEditor$okhttp(null);
            if (entry.getZombie()) {
                removeEntry$okhttp(entry);
                return;
            }
            this.redundantOpCount++;
            l lVar = this.journalWriter;
            Intrinsics.checkNotNull(lVar);
            if (!entry.getReadable() && !r10) {
                this.lruEntries.remove(entry.getKey());
                lVar.lavender(REMOVE).black(32);
                lVar.lavender(entry.getKey());
                lVar.black(10);
                lVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry.setReadable$okhttp(true);
            lVar.lavender(CLEAN).black(32);
            lVar.lavender(entry.getKey());
            entry.writeLengths$okhttp(lVar);
            lVar.black(10);
            if (r10) {
                long j7 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j7;
                entry.setSequenceNumber$okhttp(j7);
            }
            lVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void delete() throws IOException {
        close();
        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
    }

    @Nullable
    public final Editor edit(@NotNull String key) throws IOException {
        Intrinsics.echo(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            Intrinsics.delta(values, "<get-values>(...)");
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                Intrinsics.checkNotNull(entry);
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        l lVar = this.journalWriter;
        Intrinsics.checkNotNull(lVar);
        lVar.flush();
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String r82) throws IOException {
        Intrinsics.echo(r82, "key");
        initialize();
        checkNotClosed();
        validateKey(r82);
        Entry entry = this.lruEntries.get(r82);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        l lVar = this.journalWriter;
        Intrinsics.checkNotNull(lVar);
        lVar.lavender(READ).black(32).lavender(r82).black(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    /* renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @NotNull
    public final ah getDirectory() {
        return this.directory;
    }

    @NotNull
    /* renamed from: getFileSystem$okhttp, reason: from getter */
    public final u getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        try {
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = _UtilCommonKt.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        Throwable th;
        try {
            l lVar = this.journalWriter;
            if (lVar != null) {
                lVar.close();
            }
            aj bravo = b.bravo(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                bravo.lavender(MAGIC);
                bravo.black(10);
                bravo.lavender(VERSION_1);
                bravo.black(10);
                bravo.y(this.appVersion);
                bravo.black(10);
                bravo.y(this.valueCount);
                bravo.black(10);
                bravo.black(10);
                for (Entry entry : this.lruEntries.values()) {
                    Intrinsics.delta(entry, "next(...)");
                    Entry entry2 = entry;
                    if (entry2.getCurrentEditor() != null) {
                        bravo.lavender(DIRTY);
                        bravo.black(32);
                        bravo.lavender(entry2.getKey());
                        bravo.black(10);
                    } else {
                        bravo.lavender(CLEAN);
                        bravo.black(32);
                        bravo.lavender(entry2.getKey());
                        entry2.writeLengths$okhttp(bravo);
                        bravo.black(10);
                    }
                }
                try {
                    bravo.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    bravo.close();
                } catch (Throwable th4) {
                    AbstractC2689j6.charlie(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.atomicMove(this.journalFile, this.journalFileBackup);
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                    _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
                } else {
                    this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                }
                l lVar2 = this.journalWriter;
                if (lVar2 != null) {
                    _UtilCommonKt.closeQuietly(lVar2);
                }
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } else {
                throw th;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized boolean remove(@NotNull String r62) throws IOException {
        Intrinsics.echo(r62, "key");
        initialize();
        checkNotClosed();
        validateKey(r62);
        Entry entry = this.lruEntries.get(r62);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(@NotNull Entry entry) throws IOException {
        l lVar;
        Intrinsics.echo(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (lVar = this.journalWriter) != null) {
                lVar.lavender(DIRTY);
                lVar.black(32);
                lVar.lavender(entry.getKey());
                lVar.black(10);
                lVar.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        int i4 = this.valueCount;
        for (int i5 = 0; i5 < i4; i5++) {
            _UtilCommonKt.deleteIfExists(this.fileSystem, entry.getCleanFiles$okhttp().get(i5));
            this.size -= entry.getLengths()[i5];
            entry.getLengths()[i5] = 0;
        }
        this.redundantOpCount++;
        l lVar2 = this.journalWriter;
        if (lVar2 != null) {
            lVar2.lavender(REMOVE);
            lVar2.black(32);
            lVar2.lavender(entry.getKey());
            lVar2.black(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z2) {
        this.closed = z2;
    }

    public final synchronized void setMaxSize(long j5) {
        this.maxSize = j5;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    @NotNull
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    @Nullable
    public final synchronized Editor edit(@NotNull String r10, long expectedSequenceNumber) throws IOException {
        Intrinsics.echo(r10, "key");
        initialize();
        checkNotClosed();
        validateKey(r10);
        Entry entry = this.lruEntries.get(r10);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            l lVar = this.journalWriter;
            Intrinsics.checkNotNull(lVar);
            lVar.lavender(DIRTY).black(32).lavender(r10).black(10);
            lVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, r10);
                this.lruEntries.put(r10, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
