package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderExecutors;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
        this.yellow = obj6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Unit coreState$lambda$6;
        Unit preloadAssets$lambda$6;
        switch (this.alpha) {
            case 0:
                coreState$lambda$6 = CleverTapFactory.getCoreState$lambda$6((Context) this.purple, (ControllerManager) this.red, (CleverTapInstanceConfig) this.silver, (DeviceInfo) this.teal, (CallbackManager) this.white, (AnalyticsManager) this.yellow);
                return coreState$lambda$6;
            default:
                preloadAssets$lambda$6 = FilePreloaderExecutors.preloadAssets$lambda$6((Function1) this.purple, (Pair) this.red, (Function1) this.silver, (LinkedHashMap) this.teal, (Function1) this.white, (Function1) this.yellow);
                return preloadAssets$lambda$6;
        }
    }
}
