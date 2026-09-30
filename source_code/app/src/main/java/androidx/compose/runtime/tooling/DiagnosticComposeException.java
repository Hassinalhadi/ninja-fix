package androidx.compose.runtime.tooling;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.aa;
import kotlin.collections.ab;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Landroidx/compose/runtime/tooling/a;", "trace", "<init>", "(Ljava/util/List;)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "Ljava/util/List;", "", "getMessage", "()Ljava/lang/String;", Constants.KEY_MESSAGE, "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public static final int $stable = 8;

    @NotNull
    private final List<a> trace;

    public DiagnosticComposeException(@NotNull List<a> list) {
        this.trace = list;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        List<a> list = this.trace;
        Ld.c hotel = ab.hotel();
        aa victor = q.victor(list);
        if (victor.alpha() <= 0) {
            aa victor2 = q.victor(ab.alpha(hotel));
            int alpha = victor2.alpha();
            for (int i4 = 0; i4 < alpha; i4++) {
                sb2.append("\tat " + ((String) victor2.get(i4)));
                sb2.append('\n');
            }
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            return sb3;
        }
        ((a) victor.get(0)).getClass();
        throw null;
    }
}
