package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;

    public /* synthetic */ f(Context context, String str, String str2, int i4) {
        this.alpha = i4;
        this.purple = context;
        this.red = str;
        this.silver = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromAssetSync;
        LottieResult lambda$fromUrl$0;
        switch (this.alpha) {
            case 0:
                fromAssetSync = LottieCompositionFactory.fromAssetSync(this.purple, this.red, this.silver);
                return fromAssetSync;
            default:
                lambda$fromUrl$0 = LottieCompositionFactory.lambda$fromUrl$0(this.purple, this.red, this.silver);
                return lambda$fromUrl$0;
        }
    }
}
