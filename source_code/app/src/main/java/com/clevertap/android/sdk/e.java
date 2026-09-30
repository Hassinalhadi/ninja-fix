package com.clevertap.android.sdk;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AnalyticsManager purple;
    public final /* synthetic */ ArrayList red;
    public final /* synthetic */ String silver;

    public /* synthetic */ e(AnalyticsManager analyticsManager, ArrayList arrayList, String str, int i4) {
        this.alpha = i4;
        this.purple = analyticsManager;
        this.red = arrayList;
        this.silver = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$removeMultiValuesForKey$4;
        Void lambda$setMultiValuesForKey$6;
        Void lambda$addMultiValuesForKey$0;
        switch (this.alpha) {
            case 0:
                lambda$removeMultiValuesForKey$4 = this.purple.lambda$removeMultiValuesForKey$4(this.red, this.silver);
                return lambda$removeMultiValuesForKey$4;
            case 1:
                lambda$setMultiValuesForKey$6 = this.purple.lambda$setMultiValuesForKey$6(this.red, this.silver);
                return lambda$setMultiValuesForKey$6;
            default:
                lambda$addMultiValuesForKey$0 = this.purple.lambda$addMultiValuesForKey$0(this.red, this.silver);
                return lambda$addMultiValuesForKey$0;
        }
    }
}
