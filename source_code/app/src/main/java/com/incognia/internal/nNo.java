package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.Incognia;
import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class nNo extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f10949W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10950b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Callback f10951f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nNo(int i4, int i5, Callback callback) {
        super(1);
        this.f10950b = i4;
        this.f10949W = i5;
        this.f10951f9 = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) obj;
        pl2 pl2Var = mXi.f10907b;
        mXi.f9(this.f10950b);
        if (requestTokenWithStatus.getStatus() == RequestTokenStatus.SUCCESS) {
            str = requestTokenWithStatus.getToken();
        } else {
            str = null;
        }
        Incognia.INSTANCE.runOnMainThread(new qjE(this.f10949W, this.f10951f9, str));
        return Unit.INSTANCE;
    }
}
