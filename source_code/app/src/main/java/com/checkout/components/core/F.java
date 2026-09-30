package com.checkout.components.core;

import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.network.model.response.ResultWrapper;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class F extends Pd.i implements Xd.m {

    /* renamed from: a, reason: collision with root package name */
    public int f4625a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4626b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckoutErrorCode f4628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(CheckoutErrorCode checkoutErrorCode, Nd.c cVar) {
        super(3, cVar);
        this.f4628d = checkoutErrorCode;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        F f5 = new F(this.f4628d, (Nd.c) obj3);
        f5.f4626b = (InterfaceC3440j) obj;
        f5.f4627c = (Throwable) obj2;
        return f5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.f4626b;
        Throwable th = (Throwable) this.f4627c;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4625a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.delta(stackTrace, "getStackTrace(...)");
            ResultWrapper.Error error = new ResultWrapper.Error(this.f4628d, CommonErrorMessages.ERROR_MESSAGE_PAYMENT_SESSION_REQUEST_ERROR, kotlin.jvm.internal.u.alpha.bravo(CheckoutError.Request.class), null, ArraysKt.b(stackTrace), null, 32, null);
            this.f4626b = null;
            this.f4627c = null;
            this.f4625a = 1;
            if (interfaceC3440j.emit(error, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
