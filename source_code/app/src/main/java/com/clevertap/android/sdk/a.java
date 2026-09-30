package com.clevertap.android.sdk;

import com.clevertap.android.sdk.variables.CTVariables;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return ActivityLifeCycleManager.alpha((ActivityLifeCycleManager) this.purple);
            default:
                return CleverTapFactory.bravo((CTVariables) this.purple);
        }
    }
}
