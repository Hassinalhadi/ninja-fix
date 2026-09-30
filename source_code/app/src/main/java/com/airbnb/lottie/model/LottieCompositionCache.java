package com.airbnb.lottie.model;

import bv.w;
import bw.a;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final w cache = new w(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.india(-1);
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.cache.charlie(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.delta(str, lottieComposition);
    }

    public void resize(int i4) {
        w wVar = this.cache;
        wVar.getClass();
        if (i4 > 0) {
            synchronized (wVar.charlie) {
                wVar.alpha = i4;
            }
            wVar.india(i4);
            return;
        }
        a.charlie("maxSize <= 0");
        throw null;
    }
}
