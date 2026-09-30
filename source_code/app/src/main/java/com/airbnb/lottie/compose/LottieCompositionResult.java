package com.airbnb.lottie.compose;

import Nd.c;
import androidx.compose.runtime.D0;
import com.airbnb.lottie.LottieComposition;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroidx/compose/runtime/D0;", "Lcom/airbnb/lottie/LottieComposition;", "await", "(LNd/c;)Ljava/lang/Object;", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "value", "", "getError", "()Ljava/lang/Throwable;", RedirectCustomTabEventLogger.RESULT_ERROR, "", "isLoading", "()Z", "isComplete", "isFailure", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LottieCompositionResult extends D0 {
    @Nullable
    Object await(@NotNull c<? super LottieComposition> cVar);

    @Nullable
    Throwable getError();

    @Override // androidx.compose.runtime.D0
    @Nullable
    LottieComposition getValue();

    @Override // androidx.compose.runtime.D0
    /* synthetic */ Object getValue();

    boolean isComplete();

    boolean isFailure();

    boolean isLoading();

    boolean isSuccess();
}
