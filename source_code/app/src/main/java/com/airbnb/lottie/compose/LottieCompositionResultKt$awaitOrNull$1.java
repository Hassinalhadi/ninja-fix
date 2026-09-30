package com.airbnb.lottie.compose;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", l = {85}, m = "awaitOrNull")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt$awaitOrNull$1 extends c {
    int label;
    /* synthetic */ Object result;

    public LottieCompositionResultKt$awaitOrNull$1(Nd.c<? super LottieCompositionResultKt$awaitOrNull$1> cVar) {
        super(cVar);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return LottieCompositionResultKt.awaitOrNull(null, this);
    }
}
