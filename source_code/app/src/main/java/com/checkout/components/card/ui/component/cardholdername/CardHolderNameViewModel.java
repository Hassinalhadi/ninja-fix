package com.checkout.components.card.ui.component.cardholdername;

import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.model.OperationsError;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.error.ValidationError;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0010¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/checkout/components/card/ui/component/cardholdername/CardHolderNameViewModel;", "Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "styleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "stateMapper", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "inputStyle", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lkotlin/Function0;", "", "onChangeInvocation", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lkotlin/jvm/functions/Function0;)V", "Lcom/checkout/components/interfaces/error/model/OperationsError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onInvalidInputTextChanged$card_standardRelease", "(Lcom/checkout/components/interfaces/error/model/OperationsError;)V", "onInvalidInputTextChanged", "", "inputText", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate$card_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "validInputText", "onValidInputTextChanged$card_standardRelease", "(Ljava/lang/String;)V", "onValidInputTextChanged", "", "char", "", "inputTextChangeFilter$card_standardRelease", "(C)Z", "inputTextChangeFilter", "input", "sanitizeInput$card_standardRelease", "(Ljava/lang/String;)Ljava/lang/String;", "sanitizeInput", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardHolderNameViewModel extends InputComponentViewModel {
    public static final int $stable = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final Regex f4433i = new Regex("[\r\n]+");

    /* renamed from: g, reason: collision with root package name */
    private final PaymentStateManager f4434g;

    /* renamed from: h, reason: collision with root package name */
    private final ResourceProvider f4435h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardHolderNameViewModel(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull PaymentStateManager paymentStateManager, @CardHolderNameStyle @NotNull InputComponentStyle inputStyle, @NotNull ResourceProvider resourceProvider, @NotNull Function0<Unit> onChangeInvocation) {
        super(styleMapper, stateMapper, inputStyle, paymentStateManager, resourceProvider, onChangeInvocation);
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(inputStyle, "inputStyle");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(onChangeInvocation, "onChangeInvocation");
        this.f4434g = paymentStateManager;
        this.f4435h = resourceProvider;
        getShouldUpdateTextOnInputTextChanged().setValue(Boolean.TRUE);
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    public final boolean inputTextChangeFilter$card_standardRelease(char r12) {
        return !Character.isDigit(r12);
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
        at cardHolderName = this.f4434g.getCardHolderName();
        do {
            n5 = (N) cardHolderName;
            value = n5.getValue();
        } while (!n5.hotel(value, validInputText));
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    @NotNull
    public final String sanitizeInput$card_standardRelease(@NotNull String input) {
        Intrinsics.echo(input, "input");
        String foxtrot = f4433i.foxtrot(StringsKt.e(StringsKt.f(input, '\r', '\n'), '\r', '\n'), " ");
        StringBuilder sb2 = new StringBuilder();
        int length = foxtrot.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = foxtrot.charAt(i4);
            if (!Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    @Override // com.checkout.components.card.ui.component.base.InputComponentViewModel
    @NotNull
    public final ValidationResult<Unit> validate$card_standardRelease(@NotNull String inputText) {
        N n5;
        Object value;
        N n10;
        Object value2;
        Intrinsics.echo(inputText, "inputText");
        if (!StringsKt.gray(inputText)) {
            at isCardHolderNameValid = this.f4434g.getIsCardHolderNameValid();
            do {
                n10 = (N) isCardHolderNameValid;
                value2 = n10.getValue();
                ((Boolean) value2).getClass();
            } while (!n10.hotel(value2, Boolean.TRUE));
            return new ValidationResult.Success(Unit.INSTANCE);
        }
        at isCardHolderNameValid2 = this.f4434g.getIsCardHolderNameValid();
        do {
            n5 = (N) isCardHolderNameValid2;
            value = n5.getValue();
            ((Boolean) value).getClass();
        } while (!n5.hotel(value, Boolean.FALSE));
        return new ValidationResult.Failure(new ValidationError(ValidationError.BLANK_CARDHOLDER_NAME, this.f4435h.getString(R.string.cko_form_required)));
    }
}
