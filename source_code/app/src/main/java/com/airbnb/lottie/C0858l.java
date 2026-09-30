package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: com.airbnb.lottie.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0858l implements LottieDrawable.LazyCompositionTask {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LottieDrawable bravo;
    public final /* synthetic */ String charlie;

    public /* synthetic */ C0858l(LottieDrawable lottieDrawable, String str, int i4) {
        this.alpha = i4;
        this.bravo = lottieDrawable;
        this.charlie = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$setMinAndMaxFrame$11(this.charlie, lottieComposition);
                return;
            case 1:
                this.bravo.lambda$setMaxFrame$10(this.charlie, lottieComposition);
                return;
            default:
                this.bravo.lambda$setMinFrame$9(this.charlie, lottieComposition);
                return;
        }
    }
}
