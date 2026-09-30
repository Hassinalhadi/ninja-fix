package io.getunleash.android;

import Nd.h;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import vf.C3221z;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"io/getunleash/android/DefaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1", "LNd/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "LNd/h;", "context", "", "exception", "", "handleException", "(LNd/h;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1 extends Nd.a implements CoroutineExceptionHandler {
    public DefaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1(C3221z c3221z) {
        super(c3221z);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull h context, @NotNull Throwable exception) {
        UnleashLogger.INSTANCE.e("UnleashHandler", "Caught unhandled exception: " + exception.getMessage(), exception);
    }
}
