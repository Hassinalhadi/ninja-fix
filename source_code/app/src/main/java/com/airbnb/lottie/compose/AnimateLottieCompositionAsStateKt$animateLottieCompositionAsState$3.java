package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import androidx.compose.runtime.ax;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends i implements l {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ LottieAnimatable $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ ax $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z2, boolean z10, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i4, boolean z11, float f5, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z12, ax axVar, c<? super AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3> cVar) {
        super(2, cVar);
        this.$isPlaying = z2;
        this.$restartOnPlay = z10;
        this.$animatable = lottieAnimatable;
        this.$composition = lottieComposition;
        this.$iterations = i4;
        this.$reverseOnRepeat = z11;
        this.$actualSpeed = f5;
        this.$clipSpec = lottieClipSpec;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z12;
        this.$wasPlaying$delegate = axVar;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, 514, null) == r15) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatableKt.resetToBeginning(r0, r16) == r15) goto L25;
     */
    @Override // Pd.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean animateLottieCompositionAsState$lambda$3;
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            if (this.$isPlaying) {
                animateLottieCompositionAsState$lambda$3 = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$3(this.$wasPlaying$delegate);
                if (!animateLottieCompositionAsState$lambda$3 && this.$restartOnPlay) {
                    LottieAnimatable lottieAnimatable = this.$animatable;
                    this.label = 1;
                }
            }
        }
        AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$4(this.$wasPlaying$delegate, this.$isPlaying);
        if (!this.$isPlaying) {
            return Unit.INSTANCE;
        }
        LottieAnimatable lottieAnimatable2 = this.$animatable;
        LottieComposition lottieComposition = this.$composition;
        int i5 = this.$iterations;
        boolean z2 = this.$reverseOnRepeat;
        float f5 = this.$actualSpeed;
        LottieClipSpec lottieClipSpec = this.$clipSpec;
        float progress = lottieAnimatable2.getProgress();
        LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
        boolean z10 = this.$useCompositionFrameRate;
        this.label = 2;
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
