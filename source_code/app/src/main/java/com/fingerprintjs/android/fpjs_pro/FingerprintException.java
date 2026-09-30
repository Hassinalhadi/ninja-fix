package com.fingerprintjs.android.fpjs_pro;

import androidx.appcompat.widget.P0;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\b\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0003H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/FingerprintException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/fingerprintjs/android/fpjs_pro/Error;", RedirectCustomTabEventLogger.RESULT_ERROR, "<init>", "(Lcom/fingerprintjs/android/fpjs_pro/Error;)V", "T", "", "isErrorType", "()Z", "", "toString", "()Ljava/lang/String;", "Lcom/fingerprintjs/android/fpjs_pro/Error;", "getError", "()Lcom/fingerprintjs/android/fpjs_pro/Error;", "getRequestId", "requestId"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintException extends Exception {

    @NotNull
    private final Error error;

    public FingerprintException(@NotNull Error error) {
        super(error.bravo);
        this.error = error;
    }

    @NotNull
    public final Error getError() {
        return this.error;
    }

    @NotNull
    public final String getRequestId() {
        return this.error.alpha;
    }

    public final /* synthetic */ <T extends Error> boolean isErrorType() {
        getError();
        Intrinsics.juliet();
        throw null;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        String kilo = kotlin.jvm.internal.u.alpha.bravo(this.error.getClass()).kilo();
        String requestId = getRequestId();
        return P0.gold(av.q.india("FingerprintException(type=", kilo, ", requestId=", requestId, ", description="), this.error.bravo, ")");
    }
}
