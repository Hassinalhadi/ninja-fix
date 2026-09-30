package com.airbnb.lottie.compose;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", l = {45}, m = "awaitRetry")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieRetrySignal$awaitRetry$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LottieRetrySignal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieRetrySignal$awaitRetry$1(LottieRetrySignal lottieRetrySignal, Nd.c<? super LottieRetrySignal$awaitRetry$1> cVar) {
        super(cVar);
        this.this$0 = lottieRetrySignal;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.awaitRetry(this);
    }
}
