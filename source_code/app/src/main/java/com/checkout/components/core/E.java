package com.checkout.components.core;

import com.checkout.components.core.common.Constants;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.network.model.response.ResultWrapper;
import com.checkout.components.core.usecase.PaymentSessionUseCase;
import com.checkout.components.core.utils.constants.CoreConstants;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import vg.aq;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class E extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public Object f4618a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4619b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4620c;

    /* renamed from: d, reason: collision with root package name */
    public int f4621d;
    public /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f4622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PaymentSessionUseCase f4623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ CheckoutErrorCode f4624h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Function1 function1, PaymentSessionUseCase paymentSessionUseCase, CheckoutErrorCode checkoutErrorCode, Nd.c cVar) {
        super(2, cVar);
        this.f4622f = function1;
        this.f4623g = paymentSessionUseCase;
        this.f4624h = checkoutErrorCode;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        E e = new E(this.f4622f, this.f4623g, this.f4624h, cVar);
        e.e = obj;
        return e;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC3440j) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (r1.emit(r15, r24) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0198, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (r1.emit(r5, r24) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
    
        if (r1.emit(r14, r24) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0196, code lost:
    
        if (r1.emit(r14, r24) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0047, code lost:
    
        if (r3 == r2) goto L42;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        InterfaceC3440j interfaceC3440j = (InterfaceC3440j) this.e;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4621d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3 && i4 != 4) {
                    if (i4 == 5) {
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            ResultKt.alpha(obj);
            invoke = obj;
        } else {
            ResultKt.alpha(obj);
            Function1 function1 = this.f4622f;
            this.e = interfaceC3440j;
            this.f4621d = 1;
            invoke = function1.invoke(this);
        }
        aq aqVar = (aq) invoke;
        boolean isSuccessful = aqVar.alpha.getIsSuccessful();
        Response response = aqVar.alpha;
        String str = com.google.maps.android.BuildConfig.TRAVIS;
        if (isSuccessful) {
            if (!Intrinsics.areEqual(response.headers().get(Constants.CKO_VERSION_HEADER), Constants.CKO_SCHEMA_VERSION)) {
                CommonErrorMessages commonErrorMessages = CommonErrorMessages.INSTANCE;
                String str2 = response.headers().get(Constants.CKO_VERSION_HEADER);
                if (str2 != null) {
                    str = str2;
                }
                ResultWrapper.Error error = new ResultWrapper.Error(this.f4624h, commonErrorMessages.buildUnmatchedSchemaVersionErrorMessage(Constants.CKO_SCHEMA_VERSION, str), kotlin.jvm.internal.u.alpha.bravo(CheckoutError.Internal.class), new Integer(response.code()), PaymentSessionUseCase.access$buildStackTrace(this.f4623g, CoreConstants.SCHEMA_VERSION_MISMATCH, "httpStatus=" + response.code() + " expected=0.0.0 actual=" + response.headers().get(Constants.CKO_VERSION_HEADER)), null, 32, null);
                this.e = null;
                this.f4618a = null;
                this.f4621d = 2;
            } else {
                Object obj2 = aqVar.bravo;
                if (obj2 != null) {
                    ResultWrapper.Success success = new ResultWrapper.Success(obj2);
                    this.e = interfaceC3440j;
                    this.f4618a = aqVar;
                    this.f4619b = null;
                    this.f4621d = 3;
                } else {
                    ResultWrapper.Error error2 = new ResultWrapper.Error(this.f4624h, CommonErrorMessages.ERROR_MESSAGE_NULL_RESPONSE, kotlin.jvm.internal.u.alpha.bravo(CheckoutError.Request.class), new Integer(response.code()), PaymentSessionUseCase.access$buildStackTrace(this.f4623g, CoreConstants.NULL_RESPONSE_BODY, "httpStatus=" + response.code() + " reason=Response body is null"), null, 32, null);
                    this.e = null;
                    this.f4618a = null;
                    this.f4619b = null;
                    this.f4621d = 4;
                }
            }
        } else {
            String access$readErrorBodySafely = PaymentSessionUseCase.access$readErrorBodySafely(this.f4623g, aqVar);
            ErrorResponse access$parseErrorBodySafely = PaymentSessionUseCase.access$parseErrorBodySafely(this.f4623g, access$readErrorBodySafely);
            int code = response.code();
            PaymentSessionUseCase paymentSessionUseCase = this.f4623g;
            int code2 = response.code();
            String message = response.message();
            if (access$readErrorBodySafely != null) {
                str = access$readErrorBodySafely;
            }
            StringBuilder lima = A0.z.lima("httpStatus=", " message=", message, " errorBody=", code2);
            lima.append(str);
            ResultWrapper.Error error3 = new ResultWrapper.Error(this.f4624h, CommonErrorMessages.ERROR_MESSAGE_NETWORK_REQUEST_UNSUCCESSFUL, kotlin.jvm.internal.u.alpha.bravo(CheckoutError.Request.class), new Integer(code), PaymentSessionUseCase.access$buildStackTrace(paymentSessionUseCase, CoreConstants.SERVER_ERROR, lima.toString()), access$parseErrorBodySafely);
            this.e = null;
            this.f4618a = null;
            this.f4619b = null;
            this.f4620c = null;
            this.f4621d = 5;
        }
    }
}
