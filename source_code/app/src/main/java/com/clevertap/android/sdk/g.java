package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ Context purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ CleverTapAPI silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ g(Context context, String str, CharSequence charSequence, CleverTapAPI cleverTapAPI) {
        this.purple = context;
        this.red = str;
        this.teal = charSequence;
        this.silver = cleverTapAPI;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$createNotificationChannelGroup$3;
        Void lambda$renderPushNotification$17;
        switch (this.alpha) {
            case 0:
                return CTXtensions.bravo(this.silver, this.purple, (String) this.red, (String) this.teal);
            case 1:
                lambda$createNotificationChannelGroup$3 = CleverTapAPI.lambda$createNotificationChannelGroup$3(this.purple, (String) this.red, (CharSequence) this.teal, this.silver);
                return lambda$createNotificationChannelGroup$3;
            default:
                lambda$renderPushNotification$17 = this.silver.lambda$renderPushNotification$17((INotificationRenderer) this.red, (Bundle) this.teal, this.purple);
                return lambda$renderPushNotification$17;
        }
    }

    public /* synthetic */ g(CleverTapAPI cleverTapAPI, Context context, String str, String str2) {
        this.silver = cleverTapAPI;
        this.purple = context;
        this.red = str;
        this.teal = str2;
    }

    public /* synthetic */ g(CleverTapAPI cleverTapAPI, INotificationRenderer iNotificationRenderer, Bundle bundle, Context context) {
        this.silver = cleverTapAPI;
        this.red = iNotificationRenderer;
        this.teal = bundle;
        this.purple = context;
    }
}
