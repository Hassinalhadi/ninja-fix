package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ ZipInputStream red;
    public final /* synthetic */ String silver;

    public /* synthetic */ g(Context context, ZipInputStream zipInputStream, String str, int i4) {
        this.alpha = i4;
        this.purple = context;
        this.red = zipInputStream;
        this.silver = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromZipStreamSync;
        LottieResult fromZipStreamSync2;
        switch (this.alpha) {
            case 0:
                fromZipStreamSync = LottieCompositionFactory.fromZipStreamSync(this.purple, this.red, this.silver);
                return fromZipStreamSync;
            default:
                fromZipStreamSync2 = LottieCompositionFactory.fromZipStreamSync(this.purple, this.red, this.silver);
                return fromZipStreamSync2;
        }
    }
}
