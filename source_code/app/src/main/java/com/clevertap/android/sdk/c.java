package com.clevertap.android.sdk;

import android.content.Context;
import b3.AbstractC0715a;
import com.clevertap.android.sdk.ActivityLifeCycleManager;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.interfaces.OnInitCleverTapIDListener;
import com.clevertap.android.sdk.network.NetworkManager;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b3.e lambda$onInstallReferrerSetupFinished$1;
        Void lambda$removeValueForKey$5;
        Void lambda$pushProfile$3;
        Void lambda$syncRegisteredInAppTemplates$6;
        Void lambda$getCleverTapID$16;
        Unit coreState$lambda$0;
        Void lambda$new$0;
        switch (this.alpha) {
            case 0:
                lambda$onInstallReferrerSetupFinished$1 = ((ActivityLifeCycleManager.AnonymousClass3) this.purple).lambda$onInstallReferrerSetupFinished$1((AbstractC0715a) this.red);
                return lambda$onInstallReferrerSetupFinished$1;
            case 1:
                lambda$removeValueForKey$5 = ((AnalyticsManager) this.purple).lambda$removeValueForKey$5((String) this.red);
                return lambda$removeValueForKey$5;
            case 2:
                lambda$pushProfile$3 = ((AnalyticsManager) this.purple).lambda$pushProfile$3((Map) this.red);
                return lambda$pushProfile$3;
            case 3:
                lambda$syncRegisteredInAppTemplates$6 = CleverTapAPI.lambda$syncRegisteredInAppTemplates$6((NetworkManager) this.purple, (TemplatesManager) this.red);
                return lambda$syncRegisteredInAppTemplates$6;
            case 4:
                lambda$getCleverTapID$16 = ((CleverTapAPI) this.purple).lambda$getCleverTapID$16((OnInitCleverTapIDListener) this.red);
                return lambda$getCleverTapID$16;
            case 5:
                coreState$lambda$0 = CleverTapFactory.getCoreState$lambda$0((Context) this.purple, (CleverTapInstanceConfig) this.red);
                return coreState$lambda$0;
            default:
                lambda$new$0 = ((InAppFCManager) this.purple).lambda$new$0((String) this.red);
                return lambda$new$0;
        }
    }
}
