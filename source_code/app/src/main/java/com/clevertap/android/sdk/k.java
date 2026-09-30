package com.clevertap.android.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ CleverTapAPI silver;

    public /* synthetic */ k(Context context, String str, CleverTapAPI cleverTapAPI, int i4) {
        this.alpha = i4;
        this.purple = context;
        this.red = str;
        this.silver = cleverTapAPI;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return CleverTapAPI.lambda$deleteNotificationChannel$4(this.purple, this.red, this.silver);
            default:
                return CleverTapAPI.lambda$deleteNotificationChannelGroup$5(this.purple, this.red, this.silver);
        }
    }
}
