package com.airbnb.lottie;

/* renamed from: com.airbnb.lottie.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0859r implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LottieDrawable purple;

    public /* synthetic */ RunnableC0859r(LottieDrawable lottieDrawable, int i4) {
        this.alpha = i4;
        this.purple = lottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                LottieDrawable.papa(this.purple);
                return;
            default:
                LottieDrawable.lima(this.purple);
                return;
        }
    }
}
