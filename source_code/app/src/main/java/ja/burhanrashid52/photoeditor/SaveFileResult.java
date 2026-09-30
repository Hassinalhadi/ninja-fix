package ja.burhanrashid52.photoeditor;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lja/burhanrashid52/photoeditor/SaveFileResult;", "", "Failure", "Success", "Lja/burhanrashid52/photoeditor/SaveFileResult$Failure;", "Lja/burhanrashid52/photoeditor/SaveFileResult$Success;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SaveFileResult {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lja/burhanrashid52/photoeditor/SaveFileResult$Failure;", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "exception", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getException", "()Ljava/io/IOException;", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Failure implements SaveFileResult {

        @NotNull
        private final IOException exception;

        public Failure(@NotNull IOException exception) {
            Intrinsics.echo(exception, "exception");
            this.exception = exception;
        }

        @NotNull
        public final IOException getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lja/burhanrashid52/photoeditor/SaveFileResult$Success;", "Lja/burhanrashid52/photoeditor/SaveFileResult;", "()V", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Success implements SaveFileResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }
}
