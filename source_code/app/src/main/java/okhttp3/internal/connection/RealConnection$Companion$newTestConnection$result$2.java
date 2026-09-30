package okhttp3.internal.connection;

import Tf.ao;
import Tf.as;
import Tf.k;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"okhttp3/internal/connection/RealConnection$Companion$newTestConnection$result$2", "LTf/ao;", "", Constants.KEY_HIDE_CLOSE, "()V", "flush", "LTf/as;", "timeout", "()LTf/as;", "LTf/k;", "source", "", "byteCount", "write", "(LTf/k;J)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealConnection$Companion$newTestConnection$result$2 implements ao, AutoCloseable {
    @Override // Tf.ao, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Tf.ao, java.io.Flushable
    public void flush() {
    }

    @Override // Tf.ao
    public as timeout() {
        return as.NONE;
    }

    @Override // Tf.ao
    public void write(k source, long byteCount) {
        Intrinsics.echo(source, "source");
        throw new UnsupportedOperationException();
    }
}
