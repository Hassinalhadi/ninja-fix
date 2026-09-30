package com.checkout.components.card.ui.component.cvv;

import androidx.lifecycle.T;
import com.checkout.components.card.C0892h;
import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.model.OperationsError;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.operations.extensions.ValidationResultExtensionsKt;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ad;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010$\u001a\u00020\u001fH\u0010¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/checkout/components/card/ui/component/cvv/CVVViewModel;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "styleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "stateMapper", "Lcom/checkout/components/card/operations/api/CardValidator;", "cardValidator", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "style", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lkotlin/Function0;", "", "onChangeInvocation", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/operations/api/CardValidator;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lkotlin/jvm/functions/Function0;)V", "", "char", "", "inputTextChangeFilter$card_standardRelease", "(C)Z", "inputTextChangeFilter", "Lcom/checkout/components/interfaces/error/model/OperationsError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onInvalidInputTextChanged$card_standardRelease", "(Lcom/checkout/components/interfaces/error/model/OperationsError;)V", "onInvalidInputTextChanged", "", "validInputText", "onValidInputTextChanged$card_standardRelease", "(Ljava/lang/String;)V", "onValidInputTextChanged", "inputText", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate$card_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CVVViewModel extends InputComponentViewModel {
    public static final int $stable = 8;

    /* renamed from: g, reason: collision with root package name */
    private final CardValidator f4485g;

    /* renamed from: h, reason: collision with root package name */
    private final PaymentStateManager f4486h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CVVViewModel(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull CardValidator cardValidator, @NotNull PaymentStateManager paymentStateManager, @CVVStyle @NotNull InputComponentStyle style, @NotNull ResourceProvider resourceProvider, @NotNull Function0<Unit> onChangeInvocation) {
        super(styleMapper, stateMapper, style, paymentStateManager, resourceProvider, onChangeInvocation);
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(cardValidator, "cardValidator");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(onChangeInvocation, "onChangeInvocation");
        this.f4485g = cardValidator;
        this.f4486h = paymentStateManager;
        getShouldUpdateTextOnInputTextChanged().setValue(Boolean.TRUE);
        ad.zulu(T.hotel(this), null, null, new C0892h(this, null), 3);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final boolean inputTextChangeFilter$card_standardRelease(char r12) {
        return Character.isDigit(r12);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final void onInvalidInputTextChanged$card_standardRelease(@NotNull OperationsError error) {
        Intrinsics.echo(error, "error");
        hideError$card_standardRelease();
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final void onValidInputTextChanged$card_standardRelease(@NotNull String validInputText) {
        N n5;
        Object value;
        Intrinsics.echo(validInputText, "validInputText");
        getState$card_standardRelease().getInputFieldState().getText().setValue(validInputText);
        at atVar = this.f4486h.getCom.checkout.components.rememberme.utils.Constants.CVV_TYPE java.lang.String();
        do {
            n5 = (N) atVar;
            value = n5.getValue();
        } while (!n5.hotel(value, validInputText));
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    @NotNull
    public final ValidationResult<Unit> validate$card_standardRelease(@NotNull String inputText) {
        N n5;
        Object value;
        Intrinsics.echo(inputText, "inputText");
        ValidationResult<Unit> validateCvv = this.f4485g.validateCvv((String) getState$card_standardRelease().getInputFieldState().getText().getValue(), (CardScheme) ((N) this.f4486h.getCardScheme()).getValue());
        at isCvvValid = this.f4486h.getIsCvvValid();
        do {
            n5 = (N) isCvvValid;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.valueOf(ValidationResultExtensionsKt.isValid(validateCvv))));
        return validateCvv;
    }
}
