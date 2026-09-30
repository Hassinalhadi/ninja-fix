package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.I;
import vf.InterfaceC3217v;
import vf.U;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lvf/v;", "", Constants.KEY_MESSAGE, "", "cause", "Lvf/I;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lvf/I;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "createCopy", "()Lkotlinx/coroutines/JobCancellationException;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "_job", "Lvf/I;", "getJob$kotlinx_coroutines_core", "()Lvf/I;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException implements InterfaceC3217v {

    @Nullable
    private final transient I _job;

    public JobCancellationException(@NotNull String str, @Nullable Throwable th, @NotNull I i4) {
        super(str);
        this._job = i4;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // vf.InterfaceC3217v
    @Nullable
    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (other != this) {
            if (other instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) other;
                if (!Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) || !Intrinsics.areEqual(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) || !Intrinsics.areEqual(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @NotNull
    public final I getJob$kotlinx_coroutines_core() {
        I i4 = this._job;
        if (i4 == null) {
            return U.alpha;
        }
        return i4;
    }

    public int hashCode() {
        int i4;
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode() * 31;
        I job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int i5 = 0;
        if (job$kotlinx_coroutines_core != null) {
            i4 = job$kotlinx_coroutines_core.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (hashCode + i4) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i5 = cause.hashCode();
        }
        return i10 + i5;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }
}
