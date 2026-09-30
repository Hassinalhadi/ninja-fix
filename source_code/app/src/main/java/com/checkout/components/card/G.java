package com.checkout.components.card;

import androidx.compose.runtime.ax;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.model.RememberMeScreen;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class G implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ErrorLabelViewModel f3945a;

    public G(ErrorLabelViewModel errorLabelViewModel) {
        this.f3945a = errorLabelViewModel;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        CheckoutRememberMe checkoutRememberMe;
        boolean z2;
        RememberMeScreen currentScreen;
        String str = (String) obj;
        checkoutRememberMe = this.f3945a.f4495b;
        if (checkoutRememberMe != null && (currentScreen = checkoutRememberMe.currentScreen()) != null && (Intrinsics.areEqual(currentScreen, RememberMeScreen.Wallet.INSTANCE) || Intrinsics.areEqual(currentScreen, RememberMeScreen.Authentication.INSTANCE))) {
            z2 = true;
        } else {
            z2 = false;
        }
        ax text = this.f3945a.getLabelState().getText();
        if (z2) {
            str = "";
        }
        text.setValue(str);
        return Unit.INSTANCE;
    }
}
