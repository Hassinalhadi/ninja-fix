package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements LottieDrawable.LazyCompositionTask {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LottieDrawable bravo;

    public /* synthetic */ s(LottieDrawable lottieDrawable, int i4) {
        this.alpha = i4;
        this.bravo = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$resumeAnimation$4(lottieComposition);
                return;
            default:
                this.bravo.lambda$playAnimation$3(lottieComposition);
                return;
        }
    }
}
