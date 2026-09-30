package com.clevertap.android.sdk;

import android.view.View;
import com.clevertap.android.sdk.task.OnSuccessListener;
import s1.InterfaceC2587u;
import s1.a0;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC2587u, OnSuccessListener {
    public final /* synthetic */ Object alpha;

    public /* synthetic */ h(Object obj) {
        this.alpha = obj;
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        a0 applyInsetsWithMarginAdjustment$lambda$6;
        applyInsetsWithMarginAdjustment$lambda$6 = CTXtensions.applyInsetsWithMarginAdjustment$lambda$6((Xd.l) this.alpha, view, a0Var);
        return applyInsetsWithMarginAdjustment$lambda$6;
    }

    @Override // com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        DeviceInfo.alpha((DeviceInfo) this.alpha, (String) obj);
    }
}
