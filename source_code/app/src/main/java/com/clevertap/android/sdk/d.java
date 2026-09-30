package com.clevertap.android.sdk;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AnalyticsManager purple;
    public final /* synthetic */ Bundle red;

    public /* synthetic */ d(AnalyticsManager analyticsManager, Bundle bundle, int i4) {
        this.alpha = i4;
        this.purple = analyticsManager;
        this.red = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return AnalyticsManager.golf(this.purple, this.red);
            default:
                return AnalyticsManager.echo(this.purple, this.red);
        }
    }
}
