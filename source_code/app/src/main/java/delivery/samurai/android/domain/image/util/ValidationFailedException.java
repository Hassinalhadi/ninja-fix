package delivery.samurai.android.domain.image.util;

import H9.j;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ldelivery/samurai/android/domain/image/util/ValidationFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "LH9/j;", RedirectCustomTabEventLogger.RESULT_ERROR, "<init>", "(Ljava/lang/String;LH9/j;)V", "LH9/j;", "getError", "()LH9/j;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ValidationFailedException extends Exception {
    public static final int $stable = 8;

    @NotNull
    private final j error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationFailedException(@NotNull String message, @NotNull j error) {
        super(message);
        Intrinsics.echo(message, "message");
        Intrinsics.echo(error, "error");
        this.error = error;
    }

    @NotNull
    public final j getError() {
        return this.error;
    }
}
