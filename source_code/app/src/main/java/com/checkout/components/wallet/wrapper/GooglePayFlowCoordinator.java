package com.checkout.components.wallet.wrapper;

import T1.a;
import T1.c;
import V1.b;
import Xd.l;
import ah.i;
import android.content.Context;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.a0;
import androidx.lifecycle.al;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import com.checkout.components.interfaces.component.FlowCoordinator;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.CheckoutErrorDetails;
import com.checkout.components.wallet.ErrorMessages;
import com.checkout.components.wallet.googlepay.GooglePayLifecycleObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "Lcom/checkout/components/interfaces/component/FlowCoordinator;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "", "", "handleActivityResult", "<init>", "(Landroid/content/Context;LXd/l;)V", "Lah/b;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "getPaymentDataLauncher$wallet_standardRelease", "()Lah/b;", "getPaymentDataLauncher", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "a", "Lkotlin/jvm/functions/Function1;", "getErrorCallback$wallet_standardRelease", "()Lkotlin/jvm/functions/Function1;", "setErrorCallback$wallet_standardRelease", "(Lkotlin/jvm/functions/Function1;)V", "errorCallback", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayFlowCoordinator implements FlowCoordinator {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Function1 errorCallback;

    /* renamed from: b, reason: collision with root package name */
    private final GooglePayLifecycleObserver f6543b;

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePayFlowCoordinator(Context context, l handleActivityResult) {
        a0 a0Var;
        c cVar;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(handleActivityResult, "handleActivityResult");
        Function1 function1 = this.errorCallback;
        try {
            if ((context instanceof d0) && (context instanceof i) && (context instanceof al)) {
                d0 d0Var = (d0) context;
                c0 viewModelStore = d0Var.getViewModelStore();
                if (d0Var instanceof InterfaceC0651v) {
                    a0Var = ((InterfaceC0651v) d0Var).getDefaultViewModelProviderFactory();
                } else {
                    a0Var = b.alpha;
                }
                if (d0Var instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) d0Var).getDefaultViewModelCreationExtras();
                } else {
                    cVar = a.bravo;
                }
                GooglePayLifecycleObserver googlePayLifecycleObserver = new GooglePayLifecycleObserver(new b0(viewModelStore, a0Var, cVar), ((i) context).getActivityResultRegistry(), handleActivityResult);
                this.f6543b = googlePayLifecycleObserver;
                ((al) context).getLifecycle().alpha(googlePayLifecycleObserver);
                return;
            }
            throw new CheckoutError.Integration(ErrorMessages.INVALID_CONTEXT_PROVIDED, CheckoutErrorCode.CONFIGURATION_INVALID, new CheckoutErrorDetails.Integration("", "", null));
        } catch (CheckoutError e) {
            if (function1 != null) {
                function1.invoke(e);
            }
            throw e;
        }
    }

    public final Function1<CheckoutError, Unit> getErrorCallback$wallet_standardRelease() {
        return this.errorCallback;
    }

    public final ah.b getPaymentDataLauncher$wallet_standardRelease() {
        return this.f6543b.getPaymentDataLauncher$wallet_standardRelease();
    }

    public final void setErrorCallback$wallet_standardRelease(Function1<? super CheckoutError, Unit> function1) {
        this.errorCallback = function1;
    }
}
