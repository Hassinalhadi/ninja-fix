package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements LottieDrawable.LazyCompositionTask {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LottieDrawable bravo;
    public final /* synthetic */ float charlie;

    public /* synthetic */ q(LottieDrawable lottieDrawable, float f5, int i4) {
        this.alpha = i4;
        this.bravo = lottieDrawable;
        this.charlie = f5;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$setMaxProgress$8(this.charlie, lottieComposition);
                return;
            case 1:
                this.bravo.lambda$setMinProgress$6(this.charlie, lottieComposition);
                return;
            default:
                this.bravo.lambda$setProgress$16(this.charlie, lottieComposition);
                return;
        }
    }
}
