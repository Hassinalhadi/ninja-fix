package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$1 extends i implements m {
    int label;

    public RememberLottieCompositionKt$rememberLottieComposition$1(c<? super RememberLottieCompositionKt$rememberLottieComposition$1> cVar) {
        super(3, cVar);
    }

    @Nullable
    public final Object invoke(int i4, @NotNull Throwable th, @Nullable c<? super Boolean> cVar) {
        return new RememberLottieCompositionKt$rememberLottieComposition$1(cVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            return Boolean.FALSE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // Xd.m
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (Throwable) obj2, (c<? super Boolean>) obj3);
    }
}
