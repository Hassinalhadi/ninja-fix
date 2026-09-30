package okhttp3.internal.ws;

import Tf.ab;
import Tf.b;
import Tf.k;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "LTf/k;", "buffer", "", "inflate", "(LTf/k;)V", Constants.KEY_HIDE_CLOSE, "()V", "Z", "deflatedBytes", "LTf/k;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "LTf/ab;", "inflaterSource", "LTf/ab;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageInflater implements Closeable, AutoCloseable {

    @NotNull
    private final k deflatedBytes;

    @NotNull
    private final Inflater inflater;

    @NotNull
    private final ab inflaterSource;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r3v1, types: [Tf.ap, Tf.k, java.lang.Object] */
    public MessageInflater(boolean z2) {
        this.noContextTakeover = z2;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new ab(b.charlie(obj), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(@NotNull k buffer) throws IOException {
        Intrinsics.echo(buffer, "buffer");
        if (this.deflatedBytes.purple == 0) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.f(buffer);
            this.deflatedBytes.white(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.purple;
            do {
                this.inflaterSource.charlie(buffer, Long.MAX_VALUE);
                if (this.inflater.getBytesRead() >= bytesRead) {
                    return;
                }
            } while (!this.inflater.finished());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
