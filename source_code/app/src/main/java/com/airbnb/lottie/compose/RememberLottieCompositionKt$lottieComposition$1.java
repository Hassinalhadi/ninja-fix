package com.airbnb.lottie.compose;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {128, 129, 130}, m = "lottieComposition")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$lottieComposition$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public RememberLottieCompositionKt$lottieComposition$1(Nd.c<? super RememberLottieCompositionKt$lottieComposition$1> cVar) {
        super(cVar);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object lottieComposition;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        lottieComposition = RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
        return lottieComposition;
    }
}
