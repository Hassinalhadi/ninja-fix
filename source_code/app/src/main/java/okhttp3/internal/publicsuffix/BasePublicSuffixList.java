package okhttp3.internal.publicsuffix;

import Tf.ak;
import Tf.ap;
import Tf.b;
import Tf.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "", "readTheList", "readTheListUninterruptibly", "LTf/ap;", "listSource", "()LTf/ap;", "ensureLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "LTf/n;", "bytes", "LTf/n;", "getBytes", "()LTf/n;", "setBytes", "(LTf/n;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "", "getPath", "()Ljava/lang/Object;", "path", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public n bytes;
    public n exceptionBytes;

    @NotNull
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    @NotNull
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private final void readTheList() throws IOException {
        try {
            ak charlie = b.charlie(listSource());
            try {
                n november = charlie.november(charlie.readInt());
                n november2 = charlie.november(charlie.readInt());
                charlie.close();
                synchronized (this) {
                    Intrinsics.checkNotNull(november);
                    setBytes(november);
                    Intrinsics.checkNotNull(november2);
                    setExceptionBytes(november2);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z2 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e);
                    if (!z2) {
                        return;
                    }
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.bytes != null) {
            return;
        }
        throw new IllegalStateException(("Unable to load " + getPath() + " resource.").toString());
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @NotNull
    public n getBytes() {
        n nVar = this.bytes;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.lima("bytes");
        throw null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @NotNull
    public n getExceptionBytes() {
        n nVar = this.exceptionBytes;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.lima("exceptionBytes");
        throw null;
    }

    @NotNull
    public abstract Object getPath();

    @NotNull
    public abstract ap listSource();

    public void setBytes(@NotNull n nVar) {
        Intrinsics.echo(nVar, "<set-?>");
        this.bytes = nVar;
    }

    public void setExceptionBytes(@NotNull n nVar) {
        Intrinsics.echo(nVar, "<set-?>");
        this.exceptionBytes = nVar;
    }
}
