package okhttp3.internal.cache2;

import Tf.k;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", Constants.INAPP_POSITION, "LTf/k;", "source", "byteCount", "", "write", "(JLTf/k;J)V", "sink", "read", "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileOperator {

    @NotNull
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        Intrinsics.echo(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, @NotNull k sink, long byteCount) {
        Intrinsics.echo(sink, "sink");
        if (byteCount >= 0) {
            long j5 = pos;
            long j6 = byteCount;
            while (j6 > 0) {
                long transferTo = this.fileChannel.transferTo(j5, j6, sink);
                j5 += transferTo;
                j6 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long pos, @NotNull k source, long byteCount) throws IOException {
        Intrinsics.echo(source, "source");
        if (byteCount >= 0 && byteCount <= source.purple) {
            long j5 = pos;
            long j6 = byteCount;
            while (j6 > 0) {
                long transferFrom = this.fileChannel.transferFrom(source, j5, j6);
                j5 += transferFrom;
                j6 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
