package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "", "onError", "", "component", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/components/interfaces/error/CheckoutError;", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ApmErrorHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5261a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/component/ApmErrorHandler$Companion;", "", "Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "b", "Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "getNoOp", "()Lcom/checkout/components/interfaces/component/ApmErrorHandler;", "NoOp", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f5261a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final ApmErrorHandler NoOp = new S7.a(25);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(PaymentMethodComponent paymentMethodComponent, CheckoutError checkoutError) {
            Intrinsics.echo(paymentMethodComponent, "<unused var>");
            Intrinsics.echo(checkoutError, "<unused var>");
        }

        @NotNull
        public final ApmErrorHandler getNoOp() {
            return NoOp;
        }
    }

    void onError(@NotNull PaymentMethodComponent component, @NotNull CheckoutError error);
}
