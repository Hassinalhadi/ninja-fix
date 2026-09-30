package com.clevertap.android.sdk.inapp.fragment;

import android.view.View;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CTInAppNativeInterstitialFragment purple;

    public /* synthetic */ d(CTInAppNativeInterstitialFragment cTInAppNativeInterstitialFragment, int i4) {
        this.alpha = i4;
        this.purple = cTInAppNativeInterstitialFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                CTInAppNativeInterstitialFragment.kilo(this.purple, view);
                return;
            default:
                CTInAppNativeInterstitialFragment.juliet(this.purple, view);
                return;
        }
    }
}
