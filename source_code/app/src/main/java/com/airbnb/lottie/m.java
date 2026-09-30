package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements LottieDrawable.LazyCompositionTask {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LottieDrawable bravo;
    public final /* synthetic */ int charlie;

    public /* synthetic */ m(LottieDrawable lottieDrawable, int i4, int i5) {
        this.alpha = i5;
        this.bravo = lottieDrawable;
        this.charlie = i4;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$setFrame$15(this.charlie, lottieComposition);
                return;
            case 1:
                this.bravo.lambda$setMaxFrame$7(this.charlie, lottieComposition);
                return;
            default:
                this.bravo.lambda$setMinFrame$5(this.charlie, lottieComposition);
                return;
        }
    }
}
