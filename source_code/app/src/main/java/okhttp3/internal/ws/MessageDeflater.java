package okhttp3.internal.ws;

import Tf.b;
import Tf.i;
import Tf.k;
import Tf.n;
import Tf.o;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "LTf/k;", "LTf/n;", "suffix", "endsWith", "(LTf/k;LTf/n;)Z", "buffer", "", "deflate", "(LTf/k;)V", Constants.KEY_HIDE_CLOSE, "()V", "Z", "deflatedBytes", "LTf/k;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "LTf/o;", "deflaterSink", "LTf/o;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable, AutoCloseable {

    @NotNull
    private final k deflatedBytes;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final o deflaterSink;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r4v1, types: [Tf.ao, Tf.k, java.lang.Object] */
    public MessageDeflater(boolean z2) {
        this.noContextTakeover = z2;
        ?? obj = new Object();
        this.deflatedBytes = obj;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new o(b.bravo(obj), deflater);
    }

    private final boolean endsWith(k kVar, n nVar) {
        return kVar.whiskey(kVar.purple - nVar.delta(), nVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }

    public final void deflate(@NotNull k buffer) throws IOException {
        n nVar;
        Intrinsics.echo(buffer, "buffer");
        if (this.deflatedBytes.purple == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.purple);
            this.deflaterSink.flush();
            k kVar = this.deflatedBytes;
            nVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(kVar, nVar)) {
                k kVar2 = this.deflatedBytes;
                long j5 = kVar2.purple - 4;
                i beige = kVar2.beige(b.alpha);
                try {
                    beige.charlie(j5);
                    beige.close();
                } finally {
                }
            } else {
                this.deflatedBytes.pink(0);
            }
            k kVar3 = this.deflatedBytes;
            buffer.write(kVar3, kVar3.purple);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
