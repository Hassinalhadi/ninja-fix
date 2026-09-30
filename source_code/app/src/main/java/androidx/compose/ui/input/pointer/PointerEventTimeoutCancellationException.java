package androidx.compose.ui.input.pointer;

import com.google.android.material.datepicker.j;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import m0.q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "time", "", "<init>", "(J)V", "fillInStackTrace", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 8;

    public PointerEventTimeoutCancellationException(long j5) {
        super(j.kilo("Timed out waiting for ", j5, " ms"));
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(q.delta);
        return this;
    }
}
