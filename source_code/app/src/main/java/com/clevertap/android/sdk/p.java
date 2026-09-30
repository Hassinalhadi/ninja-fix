package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.inapp.ImpressionManager;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.task.CTExecutors;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6613a;
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ StoreRegistry purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ p(CleverTapAPI cleverTapAPI, StoreRegistry storeRegistry, StoreProvider storeProvider, CryptHandler cryptHandler, String str, String str2, EvaluationManager evaluationManager) {
        this.red = cleverTapAPI;
        this.purple = storeRegistry;
        this.silver = storeProvider;
        this.teal = cryptHandler;
        this.white = str;
        this.yellow = str2;
        this.f6613a = evaluationManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$deviceIDCreated$14;
        Unit coreState$lambda$3;
        switch (this.alpha) {
            case 0:
                lambda$deviceIDCreated$14 = ((CleverTapAPI) this.red).lambda$deviceIDCreated$14(this.purple, (StoreProvider) this.silver, (CryptHandler) this.teal, (String) this.white, (String) this.yellow, (EvaluationManager) this.f6613a);
                return lambda$deviceIDCreated$14;
            default:
                coreState$lambda$3 = CleverTapFactory.getCoreState$lambda$3((DeviceInfo) this.red, (ControllerManager) this.silver, (CleverTapInstanceConfig) this.teal, (Context) this.white, this.purple, (ImpressionManager) this.yellow, (CTExecutors) this.f6613a);
                return coreState$lambda$3;
        }
    }

    public /* synthetic */ p(DeviceInfo deviceInfo, ControllerManager controllerManager, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, StoreRegistry storeRegistry, ImpressionManager impressionManager, CTExecutors cTExecutors) {
        this.red = deviceInfo;
        this.silver = controllerManager;
        this.teal = cleverTapInstanceConfig;
        this.white = context;
        this.purple = storeRegistry;
        this.yellow = impressionManager;
        this.f6613a = cTExecutors;
    }
}
