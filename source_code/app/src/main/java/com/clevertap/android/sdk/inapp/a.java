package com.clevertap.android.sdk.inapp;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InAppController purple;
    public final /* synthetic */ CTInAppNotification red;

    public /* synthetic */ a(InAppController inAppController, CTInAppNotification cTInAppNotification, int i4) {
        this.alpha = i4;
        this.purple = inAppController;
        this.red = cTInAppNotification;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return InAppController.golf(this.purple, this.red);
            case 1:
                return InAppController.india(this.purple, this.red);
            default:
                return InAppController.juliet(this.purple, this.red);
        }
    }
}
