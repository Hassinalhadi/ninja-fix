package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.Incognia;
import com.incognia.RequestTokenWithStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class AeE extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f8371W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8372b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Callback f8373f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AeE(int i4, int i5, Callback callback) {
        super(1);
        this.f8372b = i4;
        this.f8371W = i5;
        this.f8373f9 = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pl2 pl2Var = mXi.f10907b;
        mXi.f9(this.f8372b);
        Incognia.INSTANCE.runOnMainThread(new sL(this.f8371W, this.f8373f9, (RequestTokenWithStatus) obj));
        return Unit.INSTANCE;
    }
}
