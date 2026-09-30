package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableImpl$snapTo$2 extends i implements Function1<c<? super Unit>, Object> {
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(LottieAnimatableImpl lottieAnimatableImpl, LottieComposition lottieComposition, float f5, int i4, boolean z2, c<? super LottieAnimatableImpl$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = lottieAnimatableImpl;
        this.$composition = lottieComposition;
        this.$progress = f5;
        this.$iteration = i4;
        this.$resetLastFrameNanos = z2;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@NotNull c<?> cVar) {
        return new LottieAnimatableImpl$snapTo$2(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable c<? super Unit> cVar) {
        return ((LottieAnimatableImpl$snapTo$2) create(cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            this.this$0.setComposition(this.$composition);
            this.this$0.updateProgress(this.$progress);
            this.this$0.setIteration(this.$iteration);
            this.this$0.setPlaying(false);
            if (this.$resetLastFrameNanos) {
                this.this$0.setLastFrameNanos(Long.MIN_VALUE);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
