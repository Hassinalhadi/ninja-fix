package com.airbnb.lottie;

import Tf.ap;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ b(int i4, Object obj, String str) {
        this.alpha = i4;
        this.red = obj;
        this.purple = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromJsonSourceSync;
        LottieResult fromJsonStringSync;
        LottieResult fromJsonReaderSync;
        LottieResult fromJsonInputStreamSync;
        LottieResult fromJsonSync;
        switch (this.alpha) {
            case 0:
                return LottieAnimationView.charlie((LottieAnimationView) this.red, this.purple);
            case 1:
                fromJsonSourceSync = LottieCompositionFactory.fromJsonSourceSync((ap) this.red, this.purple);
                return fromJsonSourceSync;
            case 2:
                fromJsonStringSync = LottieCompositionFactory.fromJsonStringSync(this.purple, (String) this.red);
                return fromJsonStringSync;
            case 3:
                fromJsonReaderSync = LottieCompositionFactory.fromJsonReaderSync((JsonReader) this.red, this.purple);
                return fromJsonReaderSync;
            case 4:
                fromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync((InputStream) this.red, this.purple);
                return fromJsonInputStreamSync;
            default:
                fromJsonSync = LottieCompositionFactory.fromJsonSync((JSONObject) this.red, this.purple);
                return fromJsonSync;
        }
    }

    public /* synthetic */ b(String str, String str2) {
        this.alpha = 2;
        this.purple = str;
        this.red = str2;
    }
}
