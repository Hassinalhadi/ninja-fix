package okhttp3.internal.connection;

import Tf.ap;
import Tf.as;
import Tf.k;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"okhttp3/internal/connection/RealConnection$Companion$newTestConnection$result$1", "LTf/ap;", "", Constants.KEY_HIDE_CLOSE, "()V", "LTf/k;", "sink", "", "byteCount", "read", "(LTf/k;J)J", "LTf/as;", "timeout", "()LTf/as;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealConnection$Companion$newTestConnection$result$1 implements ap, AutoCloseable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Tf.ap
    public long read(k sink, long byteCount) {
        Intrinsics.echo(sink, "sink");
        throw new UnsupportedOperationException();
    }

    @Override // Tf.ap
    public as timeout() {
        return as.NONE;
    }
}
