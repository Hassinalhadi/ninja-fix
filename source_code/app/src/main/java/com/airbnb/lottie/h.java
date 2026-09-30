package com.airbnb.lottie;

import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ZipInputStream purple;

    public /* synthetic */ h(ZipInputStream zipInputStream, int i4) {
        this.alpha = i4;
        this.purple = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                LottieCompositionFactory.bravo(this.purple);
                return;
            default:
                LottieCompositionFactory.golf(this.purple);
                return;
        }
    }
}
