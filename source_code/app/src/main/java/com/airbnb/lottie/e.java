package com.airbnb.lottie;

import Tf.ap;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ e(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Utils.closeQuietly((JsonReader) this.purple);
                return;
            case 1:
                Utils.closeQuietly((ap) this.purple);
                return;
            case 2:
                Utils.closeQuietly((InputStream) this.purple);
                return;
            default:
                ((LottieTask) this.purple).notifyListenersInternal();
                return;
        }
    }
}
