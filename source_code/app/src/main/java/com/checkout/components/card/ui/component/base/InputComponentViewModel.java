package com.checkout.components.card.ui.component.base;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import com.checkout.components.card.O;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.error.model.BaseOperationsError;
import com.checkout.components.interfaces.error.model.OperationsError;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import vf.ad;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\b!\u0018\u00002\u00020\u0001BU\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0013\u001a\u00020\u0012H ¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0012H\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0010¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b+\u0010$J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0004H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001aH\u0000¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u0012H\u0000¢\u0006\u0004\b6\u0010$J\u000f\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u0014\u0010-\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "styleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "stateMapper", "inputStyle", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lkotlin/Function0;", "", "onChangeInvoke", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/model/style/base/InputComponentStyle;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lkotlin/jvm/functions/Function0;)V", "", "inputText", "Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate$card_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/operations/ValidationResult;", "validate", "", "char", "", "inputTextChangeFilter$card_standardRelease", "(C)Z", "inputTextChangeFilter", "input", "sanitizeInput$card_standardRelease", "(Ljava/lang/String;)Ljava/lang/String;", "sanitizeInput", "validInputText", "onValidInputTextChanged$card_standardRelease", "(Ljava/lang/String;)V", "onValidInputTextChanged", "Lcom/checkout/components/interfaces/error/model/OperationsError;", RedirectCustomTabEventLogger.RESULT_ERROR, "onInvalidInputTextChanged$card_standardRelease", "(Lcom/checkout/components/interfaces/error/model/OperationsError;)V", "onInvalidInputTextChanged", "onInputTextChanged$card_standardRelease", "onInputTextChanged", "style", "updateStyle$card_standardRelease", "(Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;)V", "updateStyle", "isFocused", "onFocusChanged$card_standardRelease", "(Z)V", "onFocusChanged", "errorMessage", "showError$card_standardRelease", "showError", "hideError$card_standardRelease", "()V", "hideError", "a", "Lkotlin/jvm/functions/Function0;", "getOnChangeInvoke", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/ax;", "c", "Landroidx/compose/runtime/ax;", "isOnFocusChangedInvoked$card_standardRelease", "()Landroidx/compose/runtime/ax;", "isOnFocusChangedInvoked", Constants.INAPP_DATA_TAG, "getShouldUpdateTextOnInputTextChanged$card_standardRelease", "shouldUpdateTextOnInputTextChanged", "getStyle$card_standardRelease", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "getState$card_standardRelease", "()Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InputComponentViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0 onChangeInvoke;

    /* renamed from: b, reason: collision with root package name */
    private final ax f4424b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ax isOnFocusChangedInvoked;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ax shouldUpdateTextOnInputTextChanged;
    private final ax e;

    /* renamed from: f, reason: collision with root package name */
    private final ax f4427f;

    public InputComponentViewModel(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull InputComponentStyle inputStyle, @NotNull PaymentStateManager paymentStateManager, @NotNull ResourceProvider resourceProvider, @NotNull Function0<Unit> onChangeInvoke) {
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(inputStyle, "inputStyle");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(onChangeInvoke, "onChangeInvoke");
        this.onChangeInvoke = onChangeInvoke;
        Boolean bool = Boolean.FALSE;
        this.f4424b = C0564b.zulu(bool);
        this.isOnFocusChangedInvoked = C0564b.zulu(bool);
        this.shouldUpdateTextOnInputTextChanged = C0564b.zulu(Boolean.TRUE);
        this.e = C0564b.zulu(styleMapper.map(inputStyle));
        this.f4427f = C0564b.zulu(stateMapper.map(inputStyle));
        ad.zulu(T.hotel(this), null, null, new O(paymentStateManager, this, resourceProvider, null), 3);
    }

    private final void a(boolean z2) {
        ((InputComponentState) this.f4427f.getValue()).getInputFieldState().isError().setValue(Boolean.valueOf(z2));
        ((InputComponentState) this.f4427f.getValue()).getErrorState().isVisible().setValue(Boolean.valueOf(z2));
    }

    @NotNull
    public final Function0<Unit> getOnChangeInvoke() {
        return this.onChangeInvoke;
    }

    @NotNull
    /* renamed from: getShouldUpdateTextOnInputTextChanged$card_standardRelease, reason: from getter */
    public final ax getShouldUpdateTextOnInputTextChanged() {
        return this.shouldUpdateTextOnInputTextChanged;
    }

    @NotNull
    public final InputComponentState getState$card_standardRelease() {
        return (InputComponentState) this.f4427f.getValue();
    }

    @NotNull
    public final InputComponentViewStyle getStyle$card_standardRelease() {
        return (InputComponentViewStyle) this.e.getValue();
    }

    public final void hideError$card_standardRelease() {
        a(false);
    }

    public abstract boolean inputTextChangeFilter$card_standardRelease(char r12);

    @NotNull
    /* renamed from: isOnFocusChangedInvoked$card_standardRelease, reason: from getter */
    public final ax getIsOnFocusChangedInvoked() {
        return this.isOnFocusChangedInvoked;
    }

    public final void onFocusChanged$card_standardRelease(boolean isFocused) {
        if (isFocused) {
            this.f4424b.setValue(Boolean.TRUE);
        }
        if (!isFocused && ((Boolean) this.f4424b.getValue()).booleanValue()) {
            this.isOnFocusChangedInvoked.setValue(Boolean.TRUE);
            if (!StringsKt.gray((CharSequence) ((InputComponentState) this.f4427f.getValue()).getInputFieldState().getText().getValue())) {
                ValidationResult<Unit> validate$card_standardRelease = validate$card_standardRelease((String) ((InputComponentState) this.f4427f.getValue()).getInputFieldState().getText().getValue());
                if (validate$card_standardRelease instanceof ValidationResult.Success) {
                    a(false);
                    return;
                } else {
                    if (validate$card_standardRelease instanceof ValidationResult.Failure) {
                        showError$card_standardRelease(((ValidationResult.Failure) validate$card_standardRelease).getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return;
        }
        this.isOnFocusChangedInvoked.setValue(Boolean.FALSE);
    }

    public final void onInputTextChanged$card_standardRelease(@NotNull String inputText) {
        OperationsError operationsError;
        Intrinsics.echo(inputText, "inputText");
        String sanitizeInput$card_standardRelease = sanitizeInput$card_standardRelease(inputText);
        if (((Boolean) this.shouldUpdateTextOnInputTextChanged.getValue()).booleanValue()) {
            ((InputComponentState) this.f4427f.getValue()).getInputFieldState().getText().setValue(sanitizeInput$card_standardRelease);
        }
        ValidationResult<Unit> validate$card_standardRelease = validate$card_standardRelease((String) ((InputComponentState) this.f4427f.getValue()).getInputFieldState().getText().getValue());
        if (validate$card_standardRelease instanceof ValidationResult.Success) {
            a(false);
            onValidInputTextChanged$card_standardRelease(sanitizeInput$card_standardRelease);
        } else if (validate$card_standardRelease instanceof ValidationResult.Failure) {
            ValidationResult.Failure failure = (ValidationResult.Failure) validate$card_standardRelease;
            showError$card_standardRelease(failure.getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
            BaseOperationsError baseOperationsError = failure.getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String();
            if (baseOperationsError instanceof OperationsError) {
                operationsError = (OperationsError) baseOperationsError;
            } else {
                operationsError = null;
            }
            if (operationsError != null) {
                onInvalidInputTextChanged$card_standardRelease(operationsError);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.onChangeInvoke.invoke();
    }

    public void onInvalidInputTextChanged$card_standardRelease(@NotNull OperationsError error) {
        Intrinsics.echo(error, "error");
    }

    public void onValidInputTextChanged$card_standardRelease(@NotNull String validInputText) {
        Intrinsics.echo(validInputText, "validInputText");
    }

    @NotNull
    public String sanitizeInput$card_standardRelease(@NotNull String input) {
        Intrinsics.echo(input, "input");
        StringBuilder sb2 = new StringBuilder();
        int length = input.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = input.charAt(i4);
            if (inputTextChangeFilter$card_standardRelease(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    public final void showError$card_standardRelease(@NotNull String errorMessage) {
        Intrinsics.echo(errorMessage, "errorMessage");
        ((InputComponentState) this.f4427f.getValue()).getErrorState().getText().setValue(errorMessage);
        a(true);
    }

    public final void updateStyle$card_standardRelease(@NotNull InputComponentViewStyle style) {
        Intrinsics.echo(style, "style");
        this.e.setValue(style);
    }

    @NotNull
    public abstract ValidationResult<Unit> validate$card_standardRelease(@NotNull String inputText);
}
