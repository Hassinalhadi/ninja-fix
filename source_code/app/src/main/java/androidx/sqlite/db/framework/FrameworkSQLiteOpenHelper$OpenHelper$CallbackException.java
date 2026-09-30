package androidx.sqlite.db.framework;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/e;", "callbackName", "", "cause", "<init>", "(Landroidx/sqlite/db/framework/e;Ljava/lang/Throwable;)V", "Landroidx/sqlite/db/framework/e;", "getCallbackName", "()Landroidx/sqlite/db/framework/e;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {

    @NotNull
    private final e callbackName;

    @NotNull
    private final Throwable cause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(@NotNull e callbackName, @NotNull Throwable cause) {
        super(cause);
        Intrinsics.echo(callbackName, "callbackName");
        Intrinsics.echo(cause, "cause");
        this.callbackName = callbackName;
        this.cause = cause;
    }

    @NotNull
    public final e getCallbackName() {
        return this.callbackName;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }
}
