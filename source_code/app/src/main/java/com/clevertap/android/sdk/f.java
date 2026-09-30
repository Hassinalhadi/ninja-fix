package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.CTPreferenceCache;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;

    public /* synthetic */ f(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return CTPreferenceCache.alpha(this.purple);
            default:
                return CTPreferenceCache.Companion.alpha(this.purple);
        }
    }
}
