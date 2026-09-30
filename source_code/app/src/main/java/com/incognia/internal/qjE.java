package com.incognia.internal;

import com.incognia.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class qjE extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Callback f11165W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11166b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ String f11167f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjE(int i4, Callback callback, String str) {
        super(0);
        this.f11166b = i4;
        this.f11165W = callback;
        this.f11167f9 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pl2 pl2Var = mXi.f10907b;
        mXi.f9(this.f11166b);
        this.f11165W.onCompleted(this.f11167f9);
        return Unit.INSTANCE;
    }
}
