package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.RequestTokenWithStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class sL extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Callback f11290W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11291b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ RequestTokenWithStatus f11292f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sL(int i4, Callback callback, RequestTokenWithStatus requestTokenWithStatus) {
        super(0);
        this.f11291b = i4;
        this.f11290W = callback;
        this.f11292f9 = requestTokenWithStatus;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pl2 pl2Var = mXi.f10907b;
        mXi.f9(this.f11291b);
        this.f11290W.onCompleted(this.f11292f9);
        return Unit.INSTANCE;
    }
}
