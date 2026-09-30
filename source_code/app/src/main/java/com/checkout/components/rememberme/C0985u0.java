package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.PaymentMethod;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.rememberme.RememberMeNavHostViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2689j6;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.rememberme.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0985u0 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RememberMeNavHostViewModel f6319a;

    public C0985u0(RememberMeNavHostViewModel rememberMeNavHostViewModel) {
        this.f6319a = rememberMeNavHostViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        if (r1.emit(r6, r2) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0107, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r6.emit(r9, r2) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r1.emit(r7, r2) == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C0982t0 c0982t0;
        int i4;
        Object obj2;
        PrimitiveSharedFlowRepository primitiveSharedFlowRepository;
        PrimitiveStateFlowRepository primitiveStateFlowRepository;
        PrimitiveSharedFlowRepository primitiveSharedFlowRepository2;
        Throwable m207exceptionOrNullimpl;
        LogDetails logDetails;
        Function1 function1;
        Logger logger;
        PrimitiveSharedFlowRepository primitiveSharedFlowRepository3;
        if (cVar instanceof C0982t0) {
            c0982t0 = (C0982t0) cVar;
            int i5 = c0982t0.f6300h;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0982t0.f6300h = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj3 = c0982t0.f6298f;
                Od.a aVar = Od.a.alpha;
                i4 = c0982t0.f6300h;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ResultKt.alpha(obj3);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    obj2 = c0982t0.f6295b;
                    ResultKt.alpha(obj3);
                } else {
                    ResultKt.alpha(obj3);
                    obj2 = ((Result) obj).alpha;
                    RememberMeNavHostViewModel rememberMeNavHostViewModel = this.f6319a;
                    if (!(obj2 instanceof kotlin.k)) {
                        GetWalletResponse getWalletResponse = (GetWalletResponse) obj2;
                        List<PaymentMethod> paymentMethods = getWalletResponse.getPaymentMethods();
                        if (paymentMethods.isEmpty()) {
                            paymentMethods = null;
                        }
                        if (paymentMethods != null) {
                            primitiveStateFlowRepository = rememberMeNavHostViewModel.f6207a;
                            primitiveStateFlowRepository.update((PrimitiveStateFlowRepository) getWalletResponse);
                            primitiveSharedFlowRepository2 = rememberMeNavHostViewModel.f6209c;
                            RememberMeScreen.Wallet wallet = RememberMeScreen.Wallet.INSTANCE;
                            c0982t0.f6294a = null;
                            c0982t0.f6295b = obj2;
                            c0982t0.f6296c = rememberMeNavHostViewModel;
                            c0982t0.f6297d = null;
                            c0982t0.e = null;
                            c0982t0.f6300h = 1;
                        } else {
                            primitiveSharedFlowRepository = rememberMeNavHostViewModel.f6209c;
                            RememberMeScreen.Alternative alternative = RememberMeScreen.Alternative.INSTANCE;
                            c0982t0.f6294a = null;
                            c0982t0.f6295b = obj2;
                            c0982t0.f6296c = null;
                            c0982t0.f6297d = null;
                            c0982t0.e = null;
                            c0982t0.f6300h = 2;
                        }
                        return Unit.INSTANCE;
                    }
                }
                RememberMeNavHostViewModel rememberMeNavHostViewModel2 = this.f6319a;
                m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj2);
                if (m207exceptionOrNullimpl != null) {
                    String echo = av.q.echo("Could not fetch user's wallet. ", m207exceptionOrNullimpl.getMessage());
                    CheckoutErrorCode checkoutErrorCode = CheckoutErrorCode.SERVER_COMMUNICATION_ERROR;
                    logDetails = rememberMeNavHostViewModel2.e;
                    CheckoutError.Request request = new CheckoutError.Request(echo, checkoutErrorCode, ErrorExtensionsKt.toRequestErrorDetails$default(logDetails, null, null, null, null, 15, null));
                    function1 = rememberMeNavHostViewModel2.f6210d;
                    if (function1 != null) {
                        function1.invoke(request);
                    }
                    logger = rememberMeNavHostViewModel2.f6211f;
                    N4.a.alpha(logger, request, AbstractC2689j6.echo(m207exceptionOrNullimpl), false, 4, null);
                    primitiveSharedFlowRepository3 = rememberMeNavHostViewModel2.f6209c;
                    RememberMeScreen.Alternative alternative2 = RememberMeScreen.Alternative.INSTANCE;
                    c0982t0.f6294a = null;
                    c0982t0.f6295b = obj2;
                    c0982t0.f6296c = null;
                    c0982t0.f6297d = null;
                    c0982t0.e = null;
                    c0982t0.f6300h = 3;
                }
                return Unit.INSTANCE;
            }
        }
        c0982t0 = new C0982t0(this, cVar);
        Object obj32 = c0982t0.f6298f;
        Od.a aVar2 = Od.a.alpha;
        i4 = c0982t0.f6300h;
        if (i4 == 0) {
        }
        RememberMeNavHostViewModel rememberMeNavHostViewModel22 = this.f6319a;
        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj2);
        if (m207exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
