package com.clevertap.android.sdk.inapp.fragment;

import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CloseImageView purple;
    public final /* synthetic */ RelativeLayout red;

    public /* synthetic */ c(CloseImageView closeImageView, RelativeLayout relativeLayout, int i4) {
        this.alpha = i4;
        this.purple = closeImageView;
        this.red = relativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                CTInAppNativeHalfInterstitialFragment$onCreateView$2.charlie(this.purple, this.red);
                return;
            case 1:
                CTInAppNativeHalfInterstitialFragment$onCreateView$2.alpha(this.purple, this.red);
                return;
            case 2:
                CTInAppNativeHalfInterstitialFragment$onCreateView$2.bravo(this.purple, this.red);
                return;
            case 3:
                CTInAppNativeHalfInterstitialImageFragment$onCreateView$2.bravo(this.purple, this.red);
                return;
            case 4:
                CTInAppNativeHalfInterstitialImageFragment$onCreateView$2.charlie(this.purple, this.red);
                return;
            default:
                CTInAppNativeHalfInterstitialImageFragment$onCreateView$2.alpha(this.purple, this.red);
                return;
        }
    }
}
