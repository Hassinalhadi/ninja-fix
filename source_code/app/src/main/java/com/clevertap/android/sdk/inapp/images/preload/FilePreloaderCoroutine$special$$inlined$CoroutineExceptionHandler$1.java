package com.clevertap.android.sdk.inapp.images.preload;

import Nd.h;
import com.clevertap.android.sdk.ILogger;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import vf.C3221z;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine$special$$inlined$CoroutineExceptionHandler$1", "LNd/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "LNd/h;", "context", "", "exception", "", "handleException", "(LNd/h;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilePreloaderCoroutine$special$$inlined$CoroutineExceptionHandler$1 extends Nd.a implements CoroutineExceptionHandler {
    final /* synthetic */ FilePreloaderCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine$special$$inlined$CoroutineExceptionHandler$1(C3221z c3221z, FilePreloaderCoroutine filePreloaderCoroutine) {
        super(c3221z);
        this.this$0 = filePreloaderCoroutine;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull h context, @NotNull Throwable exception) {
        ILogger logger = this.this$0.getLogger();
        if (logger != null) {
            logger.verbose("Cancelled image pre fetch \n " + exception.getStackTrace());
        }
    }
}
