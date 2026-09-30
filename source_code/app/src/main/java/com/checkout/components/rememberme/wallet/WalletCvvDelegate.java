package com.checkout.components.rememberme.wallet;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.operations.extensions.ValidationResultExtensionsKt;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.rememberme.G1;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.error.ValidationError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010!\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010$\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/checkout/components/rememberme/wallet/WalletCvvDelegate;", "", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "inputComponentViewItem", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/interfaces/ui/ResourceProvider;)V", "", "inputText", "Lkotlin/Function1;", "", "updateCvv", "onInputTextChanged", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "isFocused", "onFocusChanged$rememberme_standardRelease", "(Z)V", "onFocusChanged", "resetInputState$rememberme_standardRelease", "()V", "resetInputState", "", "cvvInput", "setMaxCvvLength$rememberme_standardRelease", "(Ljava/lang/Integer;)V", "setMaxCvvLength", "Lcom/checkout/components/ui/model/CardScheme;", "globalCardScheme", "localCardScheme", "findMaxCvvLength$rememberme_standardRelease", "(Lcom/checkout/components/ui/model/CardScheme;Lcom/checkout/components/ui/model/CardScheme;)I", "findMaxCvvLength", "validateCvv$rememberme_standardRelease", "()Z", "validateCvv", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "c", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "getCvvComponent$rememberme_standardRelease", "()Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "cvvComponent", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletCvvDelegate {
    public static final int $stable = PrimitiveStateRepository.$stable | ResourceProvider.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final ResourceProvider f6375a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f6376b;

    /* renamed from: c, reason: collision with root package name */
    private final G1 f6377c;

    public WalletCvvDelegate(@NotNull InputComponentViewItem inputComponentViewItem, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(inputComponentViewItem, "inputComponentViewItem");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f6375a = resourceProvider;
        this.f6376b = C0564b.zulu(Boolean.FALSE);
        this.f6377c = new G1(inputComponentViewItem);
    }

    private final void a(boolean z2) {
        ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().isError().setValue(Boolean.valueOf(z2));
        ((InputComponentViewItem) this.f6377c.getState()).getState().getErrorState().isVisible().setValue(Boolean.valueOf(z2));
    }

    public final int findMaxCvvLength$rememberme_standardRelease(@Nullable CardScheme globalCardScheme, @NotNull CardScheme localCardScheme) {
        Set<Integer> cvvLength;
        Intrinsics.echo(localCardScheme, "localCardScheme");
        if (globalCardScheme == null || (cvvLength = globalCardScheme.getCvvLength()) == null) {
            cvvLength = CardScheme.UNKNOWN.getCvvLength();
        }
        return Math.max(((Number) CollectionsKt.purple(cvvLength)).intValue(), ((Number) CollectionsKt.purple(localCardScheme.getCvvLength())).intValue());
    }

    @NotNull
    public final PrimitiveStateRepository<InputComponentViewItem> getCvvComponent$rememberme_standardRelease() {
        return this.f6377c;
    }

    public final void onFocusChanged$rememberme_standardRelease(boolean isFocused) {
        if (isFocused) {
            this.f6376b.setValue(Boolean.TRUE);
        }
        if (!isFocused && ((Boolean) this.f6376b.getValue()).booleanValue() && !StringsKt.gray((CharSequence) ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().getValue())) {
            ValidationResult a6 = a((String) ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().getValue());
            if (a6 instanceof ValidationResult.Success) {
                a(false);
            } else {
                if (a6 instanceof ValidationResult.Failure) {
                    ((InputComponentViewItem) this.f6377c.getState()).getState().getErrorState().getText().setValue(((ValidationResult.Failure) a6).getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
                    a(true);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onInputTextChanged(@NotNull String inputText, @NotNull Function1<? super String, Unit> updateCvv) {
        Intrinsics.echo(inputText, "inputText");
        Intrinsics.echo(updateCvv, "updateCvv");
        StringBuilder sb2 = new StringBuilder();
        int length = inputText.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = inputText.charAt(i4);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().setValue(sb3);
        a(false);
        if (ValidationResultExtensionsKt.isValid(a(sb3))) {
            ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().setValue(sb3);
            updateCvv.invoke(sb3);
        }
    }

    public final void resetInputState$rememberme_standardRelease() {
        ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().setValue("");
        ax isError = ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().isError();
        Boolean bool = Boolean.FALSE;
        isError.setValue(bool);
        ((InputComponentViewItem) this.f6377c.getState()).getState().getErrorState().isVisible().setValue(bool);
    }

    public final void setMaxCvvLength$rememberme_standardRelease(@Nullable Integer cvvInput) {
        ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getMaxLength().setValue(cvvInput);
    }

    public final boolean validateCvv$rememberme_standardRelease() {
        ValidationResult.Failure failure;
        ValidationResult a6 = a((String) ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().getValue());
        if (!ValidationResultExtensionsKt.isValid(a6)) {
            if (StringsKt.gray((CharSequence) ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getText().getValue())) {
                ((InputComponentViewItem) this.f6377c.getState()).getState().getErrorState().getText().setValue(this.f6375a.getString(R.string.cko_form_required));
                a(true);
            } else {
                if (a6 instanceof ValidationResult.Failure) {
                    failure = (ValidationResult.Failure) a6;
                } else {
                    failure = null;
                }
                if (failure != null) {
                    ((InputComponentViewItem) this.f6377c.getState()).getState().getErrorState().getText().setValue(failure.getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
                    a(true);
                }
            }
        }
        return ValidationResultExtensionsKt.isValid(a6);
    }

    private final ValidationResult a(String str) {
        Integer num = (Integer) ((InputComponentViewItem) this.f6377c.getState()).getState().getInputFieldState().getMaxLength().getValue();
        if (num != null) {
            if (Intrinsics.areEqual(num, str != null ? Integer.valueOf(str.length()) : null)) {
                for (int i4 = 0; i4 < str.length(); i4++) {
                    if (Character.isDigit(str.charAt(i4))) {
                    }
                }
                return new ValidationResult.Success(Unit.INSTANCE);
            }
        }
        return new ValidationResult.Failure(new ValidationError(ValidationError.CVV_INVALID_LENGTH, this.f6375a.getString(R.string.cko_card_security_code_invalid)));
    }
}
