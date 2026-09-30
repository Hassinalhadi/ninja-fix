package com.checkout.components.card;

import androidx.compose.runtime.ax;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import yf.InterfaceC3440j;
import yf.at;

/* loaded from: classes3.dex */
public final class S implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayButtonViewModel f3963a;

    public S(PayButtonViewModel payButtonViewModel) {
        this.f3963a = payButtonViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        PaymentStateManager paymentStateManager;
        yf.N n5;
        Object value;
        ResourceProvider resourceProvider;
        ax axVar;
        ResourceProvider resourceProvider2;
        PaymentStateManager paymentStateManager2;
        yf.N n10;
        Object value2;
        ax axVar2;
        ResourceProvider resourceProvider3;
        ax axVar3;
        ResourceProvider resourceProvider4;
        ax axVar4;
        PaymentState paymentState = (PaymentState) obj;
        paymentStateManager = this.f3963a.f4519a;
        at uiPaymentErrorMessage = paymentStateManager.getUiPaymentErrorMessage();
        do {
            n5 = (yf.N) uiPaymentErrorMessage;
            value = n5.getValue();
        } while (!n5.hotel(value, ""));
        if (paymentState instanceof PaymentState.Default) {
            ax text = this.f3963a.getButtonState().getTextState().getText();
            resourceProvider4 = this.f3963a.f4521c;
            text.setValue(resourceProvider4.getString(com.checkout.components.ui.R.string.cko_pay_button));
            axVar4 = this.f3963a.f4528k;
            axVar4.setValue(Boolean.TRUE);
        } else if (paymentState instanceof PaymentState.InProgress) {
            ax text2 = this.f3963a.getButtonState().getTextState().getText();
            resourceProvider3 = this.f3963a.f4521c;
            text2.setValue(resourceProvider3.getString(com.checkout.components.ui.R.string.cko_pay_button_payment_processing));
            axVar3 = this.f3963a.f4528k;
            axVar3.setValue(Boolean.FALSE);
        } else if (paymentState instanceof PaymentState.Declined) {
            ax text3 = this.f3963a.getButtonState().getTextState().getText();
            resourceProvider2 = this.f3963a.f4521c;
            text3.setValue(resourceProvider2.getString(com.checkout.components.ui.R.string.cko_pay_button));
            paymentStateManager2 = this.f3963a.f4519a;
            at uiPaymentErrorMessage2 = paymentStateManager2.getUiPaymentErrorMessage();
            do {
                n10 = (yf.N) uiPaymentErrorMessage2;
                value2 = n10.getValue();
            } while (!n10.hotel(value2, ((PaymentState.Declined) paymentState).getReason()));
            axVar2 = this.f3963a.f4528k;
            axVar2.setValue(Boolean.TRUE);
        } else if (paymentState instanceof PaymentState.Completed) {
            ax text4 = this.f3963a.getButtonState().getTextState().getText();
            resourceProvider = this.f3963a.f4521c;
            text4.setValue(resourceProvider.getString(com.checkout.components.ui.R.string.cko_pay_button_payment_complete));
            axVar = this.f3963a.f4528k;
            axVar.setValue(Boolean.FALSE);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
