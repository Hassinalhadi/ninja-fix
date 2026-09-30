package com.checkout.components.card.ui.component.expirydate;

import androidx.lifecycle.T;
import com.checkout.components.card.J;
import com.checkout.components.card.R;
import com.checkout.components.card.di.ExpiryDateStyle;
import com.checkout.components.card.operations.api.CardValidator;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.card.utils.extensions.StringExtensionsKt;
import com.checkout.components.interfaces.error.model.OperationsError;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.operations.extensions.ValidationResultExtensionsKt;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.model.error.ValidationError;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ad;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0010¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/checkout/components/card/ui/component/expirydate/ExpiryDateViewModel;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "styleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "stateMapper", "Lcom/checkout/components/card/operations/api/CardValidator;", "cardValidator", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "inputStyle", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lkotlin/Function0;", "", "onChangeInvocation", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/operations/api/CardValidator;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lkotlin/jvm/functions/Function0;)V", "", "validInputText", "onValidInputTextChanged$card_standardRelease", "(Ljava/lang/String;)V", "onValidInputTextChanged", "Lcom/checkout/components/interfaces/error/model/OperationsError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onInvalidInputTextChanged$card_standardRelease", "(Lcom/checkout/components/interfaces/error/model/OperationsError;)V", "onInvalidInputTextChanged", "inputText", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate$card_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "", "char", "", "inputTextChangeFilter$card_standardRelease", "(C)Z", "inputTextChangeFilter", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpiryDateViewModel extends InputComponentViewModel {
    public static final int $stable = 8;

    /* renamed from: g, reason: collision with root package name */
    private final CardValidator f4506g;

    /* renamed from: h, reason: collision with root package name */
    private final PaymentStateManager f4507h;

    /* renamed from: i, reason: collision with root package name */
    private final ResourceProvider f4508i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateViewModel(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull CardValidator cardValidator, @NotNull PaymentStateManager paymentStateManager, @ExpiryDateStyle @NotNull InputComponentStyle inputStyle, @NotNull ResourceProvider resourceProvider, @NotNull Function0<Unit> onChangeInvocation) {
        super(styleMapper, stateMapper, inputStyle, paymentStateManager, resourceProvider, onChangeInvocation);
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(cardValidator, "cardValidator");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(inputStyle, "inputStyle");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(onChangeInvocation, "onChangeInvocation");
        this.f4506g = cardValidator;
        this.f4507h = paymentStateManager;
        this.f4508i = resourceProvider;
        ad.zulu(T.hotel(this), null, null, new J(this, null), 3);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final boolean inputTextChangeFilter$card_standardRelease(char r12) {
        return Character.isDigit(r12);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final void onInvalidInputTextChanged$card_standardRelease(@NotNull OperationsError error) {
        N n5;
        Object value;
        int i4;
        Intrinsics.echo(error, "error");
        at isExpiryDateValid = this.f4507h.getIsExpiryDateValid();
        do {
            n5 = (N) isExpiryDateValid;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        if (Intrinsics.areEqual(error.getErrorCode(), ValidationError.EXPIRY_DATE_IN_PAST)) {
            showError$card_standardRelease(this.f4508i.getString(R.string.cko_card_expiry_date_invalid));
            return;
        }
        String str = (String) getState$card_standardRelease().getInputFieldState().getText().getValue();
        if (!StringExtensionsKt.isSingleDigitMonthPrefix(str) && !StringExtensionsKt.isInvalidTeenMonthPrefix(str)) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        getState$card_standardRelease().getInputFieldState().getMaxLength().setValue(Integer.valueOf(i4));
        hideError$card_standardRelease();
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final void onValidInputTextChanged$card_standardRelease(@NotNull String validInputText) {
        int i4;
        Intrinsics.echo(validInputText, "validInputText");
        if (!StringExtensionsKt.isSingleDigitMonthPrefix(validInputText) && !StringExtensionsKt.isInvalidTeenMonthPrefix(validInputText)) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        getState$card_standardRelease().getInputFieldState().getMaxLength().setValue(Integer.valueOf(i4));
        getState$card_standardRelease().getInputFieldState().getText().setValue(validInputText);
        ((N) this.f4507h.getExpiryDate()).india(getState$card_standardRelease().getInputFieldState().getText().getValue());
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    @NotNull
    public final ValidationResult<Unit> validate$card_standardRelease(@NotNull String inputText) {
        N n5;
        Object value;
        boolean z2;
        Intrinsics.echo(inputText, "inputText");
        Pair<String, String> extractDateToMonthAndYear = this.f4506g.extractDateToMonthAndYear(inputText);
        ValidationResult<Unit> validateExpiryDate = this.f4506g.validateExpiryDate((String) extractDateToMonthAndYear.first, (String) extractDateToMonthAndYear.second);
        at isExpiryDateValid = this.f4507h.getIsExpiryDateValid();
        do {
            n5 = (N) isExpiryDateValid;
            value = n5.getValue();
            ((Boolean) value).getClass();
            if (ValidationResultExtensionsKt.isValid(validateExpiryDate)) {
                int length = ((String) getState$card_standardRelease().getInputFieldState().getText().getValue()).length();
                Integer num = (Integer) getState$card_standardRelease().getInputFieldState().getMaxLength().getValue();
                if (num != null && length == num.intValue()) {
                    z2 = true;
                }
            }
            z2 = false;
        } while (!n5.hotel(value, Boolean.valueOf(z2)));
        return validateExpiryDate;
    }
}
