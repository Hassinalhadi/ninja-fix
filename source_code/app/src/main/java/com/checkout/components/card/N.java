package com.checkout.components.card;

import com.checkout.components.card.ui.component.base.InputComponentViewModel;
import com.checkout.components.interfaces.operations.ValidationResult;
import com.checkout.components.interfaces.operations.extensions.ValidationResultExtensionsKt;
import com.checkout.components.interfaces.ui.ResourceProvider;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class N implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputComponentViewModel f3954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResourceProvider f3955b;

    public N(InputComponentViewModel inputComponentViewModel, ResourceProvider resourceProvider) {
        this.f3954a = inputComponentViewModel;
        this.f3955b = resourceProvider;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        if (((Boolean) obj).booleanValue()) {
            String str = (String) this.f3954a.getState$card_standardRelease().getInputFieldState().getText().getValue();
            ValidationResult<Unit> validate$card_standardRelease = this.f3954a.validate$card_standardRelease(str);
            if (!ValidationResultExtensionsKt.isValid(validate$card_standardRelease)) {
                if (StringsKt.gray(str)) {
                    this.f3954a.showError$card_standardRelease(this.f3955b.getString(com.checkout.components.ui.R.string.cko_form_required));
                } else {
                    InputComponentViewModel inputComponentViewModel = this.f3954a;
                    Intrinsics.charlie(validate$card_standardRelease, "null cannot be cast to non-null type com.checkout.components.interfaces.operations.ValidationResult.Failure");
                    inputComponentViewModel.showError$card_standardRelease(((ValidationResult.Failure) validate$card_standardRelease).getCom.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger.RESULT_ERROR java.lang.String().getCom.clevertap.android.sdk.Constants.KEY_MESSAGE java.lang.String());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
