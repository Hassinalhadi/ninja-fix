package okhttp3.internal.cache;

import Tf.ap;
import Tf.as;
import Tf.k;
import Tf.l;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "LTf/ap;", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "LTf/as;", "timeout", "()LTf/as;", "", Constants.KEY_HIDE_CLOSE, "()V", "", "cacheRequestClosed", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements ap, AutoCloseable {
    final /* synthetic */ l $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ m $source;
    private boolean cacheRequestClosed;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(m mVar, CacheRequest cacheRequest, l lVar) {
        this.$source = mVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.cacheRequestClosed && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    @Override // Tf.ap
    public long read(k sink, long byteCount) throws IOException {
        Intrinsics.echo(sink, "sink");
        try {
            long read = this.$source.read(sink, byteCount);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1L;
            }
            sink.golf(sink.purple - read, this.$cacheBody.delta(), read);
            this.$cacheBody.cyan();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
                throw e;
            }
            throw e;
        }
    }

    @Override // Tf.ap
    public as timeout() {
        return this.$source.timeout();
    }
}
